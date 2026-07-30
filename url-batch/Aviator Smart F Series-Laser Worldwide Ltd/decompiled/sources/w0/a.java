package w0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.crrepa.band.my.model.ContactInfo;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import q7.b;

/* loaded from: classes2.dex */
public class a {
    public static final String BLANK_REGEX = "\\s*";
    public static final String BRACKETS_REGEX_0 = "\\(";
    public static final String BRACKETS_REGEX_1 = "\\)";
    public static final String LINE_REGEX = "-";
    private static final String NUMBER_AND_SYMBOL_REGEX = "[^\\d+*#]";
    private static final String NUMBER_REGEX = "[^\\d+]";

    private a() {
    }

    public static ArrayList<ContactInfo> getAllContact(Context context, boolean z7) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        String str = z7 ? NUMBER_AND_SYMBOL_REGEX : NUMBER_REGEX;
        HashMap hashMap = new HashMap();
        while (true) {
            if (!query.moveToNext()) {
                break;
            }
            int columnIndex = query.getColumnIndex("contact_id");
            String string = columnIndex >= 0 ? query.getString(columnIndex) : null;
            int columnIndex2 = query.getColumnIndex("data1");
            String string2 = columnIndex2 >= 0 ? query.getString(columnIndex2) : null;
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string)) {
                String replaceAll = string2.replaceAll(BLANK_REGEX, "").replaceAll("-", "").replaceAll(BRACKETS_REGEX_0, "").replaceAll(BRACKETS_REGEX_1, "");
                if (!Pattern.compile(str).matcher(replaceAll).find()) {
                    List list = (List) hashMap.get(string);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    if (!list.contains(replaceAll)) {
                        list.add(replaceAll);
                    }
                    hashMap.put(string, list);
                }
            }
        }
        query.close();
        Cursor query2 = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        ArrayList<ContactInfo> arrayList = new ArrayList<>();
        while (query2.moveToNext()) {
            ContactInfo contactInfo = new ContactInfo();
            int columnIndex3 = query2.getColumnIndex(FileDownloadModel.ID);
            List<String> list2 = (List) hashMap.get(columnIndex3 >= 0 ? query2.getString(columnIndex3) : null);
            if (list2 != null && !list2.isEmpty()) {
                int columnIndex4 = query2.getColumnIndex("display_name");
                contactInfo.setName(columnIndex4 >= 0 ? query2.getString(columnIndex4) : null);
                contactInfo.setNumber(list2);
                arrayList.add(contactInfo);
            }
        }
        query2.close();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (r8 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Uri getContactAvatarUri(Context context, String str) {
        Cursor cursor;
        ?? r02 = 0;
        r0 = null;
        r0 = null;
        r0 = null;
        r0 = null;
        Uri uri = null;
        try {
            try {
                cursor = context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"photo_uri"}, "display_name = ?", new String[]{str}, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(0);
                            if (!TextUtils.isEmpty(string)) {
                                uri = Uri.parse(string);
                            }
                        }
                    } catch (Exception e8) {
                        e = e8;
                        e.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r02 = context;
                if (r02 != 0) {
                    r02.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r02 != 0) {
            }
            throw th;
        }
    }

    public static String getContactName(Context context, String str) {
        Cursor cursor;
        if (!b.hasSelfPermissions(context, "android.permission.READ_CONTACTS")) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {FileDownloadModel.ID, "display_name"};
        try {
            cursor = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), strArr, null, null, null);
        } catch (Exception e8) {
            e8.printStackTrace();
            try {
                cursor = contentResolver.query(Uri.withAppendedPath(Contacts.Phones.CONTENT_FILTER_URL, Uri.encode(str)), strArr, null, null, null);
            } catch (Exception e9) {
                e9.printStackTrace();
                cursor = null;
            }
        }
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = cursor.getString(1);
        cursor.close();
        return string;
    }
}
