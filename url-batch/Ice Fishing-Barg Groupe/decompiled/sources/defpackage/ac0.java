package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ac0 {
    public static final b41 PxuCJdSBwIXG = new b41(2);
    public static final k5 lS5Rgt96tfkO = new k5(1);

    public static um PxuCJdSBwIXG(Context context, List list) {
        String str;
        Typeface TSizfFm2Yiuu;
        sj0.wdg6QnbFHrFF("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                bc0 bc0Var = (bc0) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (TSizfFm2Yiuu = pm2.TSizfFm2Yiuu((str = bc0Var.e9gEMXR7LXtO))) == null || pm2.Y1f8riQaR6yg(TSizfFm2Yiuu) == null) {
                    ProviderInfo lS5Rgt96tfkO2 = lS5Rgt96tfkO(context.getPackageManager(), bc0Var, context.getResources());
                    if (lS5Rgt96tfkO2 == null) {
                        return new um();
                    }
                    arrayList.add(TSizfFm2Yiuu(context, bc0Var, lS5Rgt96tfkO2.authority));
                } else {
                    arrayList.add(new zc0[]{new zc0(str, bc0Var.a92UlCVFR9N8)});
                }
            }
            return new um(1, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static zc0[] TSizfFm2Yiuu(Context context, bc0 bc0Var, String str) {
        String[] strArr;
        sj0.wdg6QnbFHrFF("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                sj0.wdg6QnbFHrFF("ContentQueryWrapper.query");
                try {
                    String str2 = bc0Var.a92UlCVFR9N8;
                    String str3 = bc0Var.TSizfFm2Yiuu;
                    if (str2 != null) {
                        int length = str2.length();
                        int i = 0;
                        while (i < length) {
                            int codePointAt = str2.codePointAt(i);
                            if (!Character.isWhitespace(codePointAt)) {
                                strArr = new String[]{str3, "VF"};
                                break;
                            }
                            i += Character.charCount(codePointAt);
                        }
                    }
                    strArr = new String[]{str3};
                    String[] strArr3 = strArr;
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList.add(new zc0(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, bc0Var.a92UlCVFR9N8, i2));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (zc0[]) arrayList.toArray(new zc0[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }

    public static ProviderInfo lS5Rgt96tfkO(PackageManager packageManager, bc0 bc0Var, Resources resources) {
        k5 k5Var = lS5Rgt96tfkO;
        b41 b41Var = PxuCJdSBwIXG;
        sj0.wdg6QnbFHrFF("FontProvider.getProvider");
        try {
            List list = bc0Var.Y1f8riQaR6yg;
            String str = bc0Var.PxuCJdSBwIXG;
            String str2 = bc0Var.lS5Rgt96tfkO;
            if (list == null) {
                list = bs0.aF05bpZJlKEP(resources, 0);
            }
            zb0 zb0Var = new zb0();
            zb0Var.PxuCJdSBwIXG = str;
            zb0Var.lS5Rgt96tfkO = str2;
            zb0Var.TSizfFm2Yiuu = list;
            ProviderInfo providerInfo = (ProviderInfo) b41Var.TSizfFm2Yiuu(zb0Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, k5Var);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, k5Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    b41Var.Y1f8riQaR6yg(zb0Var, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }
}
