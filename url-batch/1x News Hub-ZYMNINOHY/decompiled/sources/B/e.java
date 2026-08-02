package B;

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
import n0.C1125E;
import p.C1173i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1173i f82a = new C1173i(2);

    /* renamed from: b, reason: collision with root package name */
    public static final c f83b = new c();

    public static C1125E a(Context context, List list) {
        String str;
        Typeface c3;
        Trace.beginSection(S0.a.N("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                f fVar = (f) list.get(i3);
                if (Build.VERSION.SDK_INT < 31 || (c3 = x.c.c((str = fVar.f88e))) == null || x.c.d(c3) == null) {
                    ProviderInfo b3 = b(context.getPackageManager(), fVar, context.getResources());
                    if (b3 == null) {
                        return new C1125E();
                    }
                    arrayList.add(c(context, fVar, b3.authority));
                } else {
                    arrayList.add(new k[]{new k(str, fVar.f)});
                }
            }
            return new C1125E(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, f fVar, Resources resources) {
        Trace.beginSection(S0.a.N("FontProvider.getProvider"));
        try {
            List list = fVar.f87d;
            String str = fVar.f84a;
            String str2 = fVar.f85b;
            if (list == null) {
                list = S0.a.z(resources, 0);
            }
            d dVar = new d();
            dVar.f79a = str;
            dVar.f80b = str2;
            dVar.f81c = list;
            C1173i c1173i = f82a;
            ProviderInfo providerInfo = (ProviderInfo) c1173i.a(dVar);
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
            c cVar = f83b;
            Collections.sort(arrayList, cVar);
            for (int i3 = 0; i3 < list.size(); i3++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
                Collections.sort(arrayList2, cVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                            break;
                        }
                    }
                    c1173i.b(dVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static k[] c(Context context, f fVar, String str) {
        Trace.beginSection(S0.a.N("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(S0.a.N("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {fVar.f86c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new k(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i3));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (k[]) arrayList.toArray(new k[0]);
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
}
