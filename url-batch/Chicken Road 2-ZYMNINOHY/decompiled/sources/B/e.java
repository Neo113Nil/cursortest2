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
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import x.AbstractC1516e;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final p.i f154a = new p.i(2);

    /* renamed from: b, reason: collision with root package name */
    public static final c f155b = new c(0);

    public static k a(Context context, List list) {
        String str;
        Typeface c4;
        Trace.beginSection(AbstractC0457a.E("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                f fVar = (f) list.get(i4);
                if (Build.VERSION.SDK_INT < 31 || (c4 = AbstractC1516e.c((str = fVar.f160e))) == null || AbstractC1516e.d(c4) == null) {
                    ProviderInfo b4 = b(context.getPackageManager(), fVar, context.getResources());
                    if (b4 == null) {
                        return new k();
                    }
                    arrayList.add(c(context, fVar, b4.authority));
                } else {
                    arrayList.add(new l[]{new l(str, fVar.f161f)});
                }
            }
            return new k(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, f fVar, Resources resources) {
        c cVar = f155b;
        p.i iVar = f154a;
        Trace.beginSection(AbstractC0457a.E("FontProvider.getProvider"));
        try {
            List list = fVar.f159d;
            String str = fVar.f156a;
            String str2 = fVar.f157b;
            if (list == null) {
                list = U.i.u(resources, 0);
            }
            d dVar = new d();
            dVar.f151a = str;
            dVar.f152b = str2;
            dVar.f153c = list;
            ProviderInfo providerInfo = (ProviderInfo) iVar.a(dVar);
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
            Collections.sort(arrayList, cVar);
            for (int i4 = 0; i4 < list.size(); i4++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                Collections.sort(arrayList2, cVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                            break;
                        }
                    }
                    iVar.b(dVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static l[] c(Context context, f fVar, String str) {
        Trace.beginSection(AbstractC0457a.E("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(AbstractC0457a.E("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {fVar.f158c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e4) {
                            Log.w("FontsProvider", "Unable to query the content provider", e4);
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
                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (l[]) arrayList.toArray(new l[0]);
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
