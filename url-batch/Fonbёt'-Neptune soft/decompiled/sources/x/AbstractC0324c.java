package x;

import D0.O;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m0.D;
import s.AbstractC0291b;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0324c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0322a f3569a = new C0322a();

    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static D a(Context context, O o2) {
        Cursor cursor;
        Cursor cursor2;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) o2.f260b;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
        }
        String str2 = resolveContentProvider.packageName;
        String str3 = (String) o2.f261c;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0322a c0322a = f3569a;
        Collections.sort(arrayList, c0322a);
        List list = (List) o2.f263e;
        if (list == null) {
            list = AbstractC0291b.j(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursor = null;
            if (i2 >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) list.get(i2));
            Collections.sort(arrayList2, c0322a);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        if (resolveContentProvider == null) {
            return new D(1, null);
        }
        String str4 = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str4).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        C0323b c0323b = Build.VERSION.SDK_INT < 24 ? new C0323b(context, build, 0) : new C0323b(context, build, 1);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) o2.f262d};
            switch (c0323b.f3567a) {
                case 0:
                    cursor2 = null;
                    ContentProviderClient contentProviderClient = c0323b.f3568b;
                    if (contentProviderClient != null) {
                        try {
                            cursor2 = contentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e2) {
                            Log.w("FontsProvider", "Unable to query the content provider", e2);
                        }
                    }
                    cursor = cursor2;
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            arrayList3.add(new C0329h(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    c0323b.a();
                    return new D(0, (C0329h[]) arrayList3.toArray(new C0329h[0]));
                default:
                    cursor2 = null;
                    ContentProviderClient contentProviderClient2 = c0323b.f3568b;
                    if (contentProviderClient2 != null) {
                        try {
                            cursor2 = contentProviderClient2.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                    }
                    cursor = cursor2;
                    if (cursor != null) {
                        int columnIndex7 = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex22 = cursor.getColumnIndex("_id");
                        int columnIndex32 = cursor.getColumnIndex("file_id");
                        int columnIndex42 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex52 = cursor.getColumnIndex("font_weight");
                        int columnIndex62 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                        }
                        break;
                    }
                    if (cursor != null) {
                    }
                    c0323b.a();
                    return new D(0, (C0329h[]) arrayList3.toArray(new C0329h[0]));
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            c0323b.a();
            throw th;
        }
    }
}
