package l3;

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
import c2.y;
import com.google.android.gms.internal.measurement.bf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import s.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5832a = new r(2);

    /* renamed from: b, reason: collision with root package name */
    public static final y f5833b = new y(1);

    public static bf a(Context context, List list) {
        String str;
        Typeface c10;
        i7.a.n("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                c cVar = (c) list.get(i3);
                if (Build.VERSION.SDK_INT < 31 || (c10 = h3.c.c((str = cVar.f5838e))) == null || h3.c.d(c10) == null) {
                    ProviderInfo b10 = b(context.getPackageManager(), cVar, context.getResources());
                    if (b10 == null) {
                        bf bfVar = new bf();
                        bfVar.f2174d = 1;
                        bfVar.f2175e = Collections.singletonList(null);
                        return bfVar;
                    }
                    arrayList.add(c(context, cVar, b10.authority));
                } else {
                    arrayList.add(new h[]{new h(str, cVar.f5839f)});
                }
            }
            bf bfVar2 = new bf();
            bfVar2.f2174d = 0;
            bfVar2.f2175e = arrayList;
            return bfVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        y yVar = f5833b;
        r rVar = f5832a;
        i7.a.n("FontProvider.getProvider");
        try {
            List list = cVar.f5837d;
            String str = cVar.f5834a;
            String str2 = cVar.f5835b;
            if (list == null) {
                list = g3.b.e(resources, 0);
            }
            a aVar = new a();
            aVar.f5829a = str;
            aVar.f5830b = str2;
            aVar.f5831c = list;
            ProviderInfo providerInfo = (ProviderInfo) rVar.c(aVar);
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
            Collections.sort(arrayList, yVar);
            for (int i3 = 0; i3 < list.size(); i3++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
                Collections.sort(arrayList2, yVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    rVar.d(aVar, resolveContentProvider);
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
        i7.a.n("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                i7.a.n("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {cVar.f5836c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e2) {
                            Log.w("FontsProvider", "Unable to query the content provider", e2);
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
                            arrayList2.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, cVar.f5839f, i3));
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
