package n3;

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
import o.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final s f5337a = new s(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a0.a f5338b = new a0.a(4);

    public static k5.e a(Context context, List list) {
        String str;
        Typeface c8;
        a.a.e("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                c cVar = (c) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c8 = i3.g.c((str = cVar.f5343e))) == null || i3.g.d(c8) == null) {
                    ProviderInfo b8 = b(context.getPackageManager(), cVar, context.getResources());
                    if (b8 == null) {
                        k5.e eVar = new k5.e();
                        eVar.f4189d = 1;
                        eVar.f4190e = Collections.singletonList(null);
                        return eVar;
                    }
                    arrayList.add(c(context, cVar, b8.authority));
                } else {
                    arrayList.add(new h[]{new h(str, cVar.f5344f)});
                }
            }
            k5.e eVar2 = new k5.e();
            eVar2.f4189d = 0;
            eVar2.f4190e = arrayList;
            return eVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        a0.a aVar = f5338b;
        s sVar = f5337a;
        a.a.e("FontProvider.getProvider");
        try {
            List list = cVar.f5342d;
            String str = cVar.f5339a;
            String str2 = cVar.f5340b;
            if (list == null) {
                list = h3.b.g(resources, 0);
            }
            a aVar2 = new a();
            aVar2.f5334a = str;
            aVar2.f5335b = str2;
            aVar2.f5336c = list;
            ProviderInfo providerInfo = (ProviderInfo) sVar.c(aVar2);
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
            Collections.sort(arrayList, aVar);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                            break;
                        }
                    }
                    sVar.f(aVar2, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static h[] c(Context context, c cVar, String str) {
        a.a.e("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                a.a.e("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {cVar.f5341c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e8) {
                            Log.w("FontsProvider", "Unable to query the content provider", e8);
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
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (h[]) arrayList.toArray(new h[0]);
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
