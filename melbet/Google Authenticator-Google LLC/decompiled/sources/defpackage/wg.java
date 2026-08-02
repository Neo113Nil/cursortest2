package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
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
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wg {
    public static final qs a = new qs(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final qy d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new dfq(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new qy(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((wc) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e1, code lost:
    
        if (r0 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e3, code lost:
    
        r7 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0304, code lost:
    
        if (r7 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0306, code lost:
    
        r1 = new defpackage.bsh(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0311, code lost:
    
        if (r6.size() <= 1) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0317, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0319, code lost:
    
        r0 = defpackage.vd.a;
        defpackage.yk.f("TypefaceCompat.createFromFontInfoWithFallback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0320, code lost:
    
        r0 = defpackage.vd.a.g(r29, r6, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0326, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0343, code lost:
    
        if (r0 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0345, code lost:
    
        defpackage.wg.a.b(r28, r0);
        r1 = new defpackage.bsh(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0352, code lost:
    
        r1 = new defpackage.bsh(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x032a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x032e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x032f, code lost:
    
        r0 = defpackage.tw.I(r6);
        r1 = defpackage.vd.a;
        defpackage.yk.f("TypefaceCompat.createFromFontInfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x033a, code lost:
    
        r0 = defpackage.vd.a.a(r29, r0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0340, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0358, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x035c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e5, code lost:
    
        r0 = defpackage.tw.I(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e9, code lost:
    
        if (r0 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02eb, code lost:
    
        r5 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ec, code lost:
    
        if (r5 != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ef, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02f0, code lost:
    
        if (r7 >= r5) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f2, code lost:
    
        r8 = r0[r7].e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f6, code lost:
    
        if (r8 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fe, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f8, code lost:
    
        if (r8 >= 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02fa, code lost:
    
        r7 = -3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02fc, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0301, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0303, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x035d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0361, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025e A[Catch: all -> 0x028f, Merged into TryCatch #8 {all -> 0x035d, all -> 0x02d6, all -> 0x028f, blocks: (B:12:0x0025, B:13:0x002c, B:15:0x0033, B:17:0x0042, B:19:0x004a, B:21:0x0050, B:24:0x0065, B:29:0x0088, B:32:0x0124, B:79:0x026d, B:113:0x0290, B:114:0x0293, B:116:0x0294, B:189:0x0117, B:191:0x011b, B:199:0x02d7, B:200:0x02da, B:26:0x0071, B:164:0x0091, B:166:0x0097, B:168:0x009f, B:170:0x00b2, B:172:0x00c2, B:173:0x00c8, B:175:0x00ce, B:179:0x010d, B:181:0x00ee, B:183:0x00f4, B:185:0x010a, B:188:0x0114, B:193:0x029e, B:194:0x02be, B:196:0x02bf, B:197:0x02d5, B:34:0x012b, B:77:0x025e, B:78:0x0261, B:86:0x0288, B:87:0x028b, B:88:0x028e), top: B:11:0x0025 }, TRY_ENTER] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bsh b(String str, Context context, List list, int i) {
        bsh bshVar;
        int i2;
        int i3;
        ArrayList arrayList;
        ProviderInfo resolveContentProvider;
        int i4;
        int i5;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        Cursor query;
        String str2;
        int i6;
        int i7;
        Uri withAppendedId;
        String str3;
        Typeface b2;
        String str4 = "content";
        yk.f("getFontSync");
        try {
            Typeface typeface = (Typeface) a.a(str);
            if (typeface != null) {
                bshVar = new bsh(typeface);
            } else {
                try {
                    qs qsVar = wb.a;
                    yk.f("FontProvider.getFontFamilyResult");
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= list.size()) {
                                i2 = i8;
                                Trace.endSection();
                                i3 = i2;
                                arrayList = arrayList2;
                                break;
                            }
                            wc wcVar = (wc) list.get(i9);
                            if (Build.VERSION.SDK_INT < 31 || (b2 = vd.b((str3 = wcVar.e))) == null || vd.c(b2) == null) {
                                PackageManager packageManager = context.getPackageManager();
                                context.getResources();
                                yk.f("FontProvider.getProvider");
                                List list2 = wcVar.d;
                                String str5 = wcVar.a;
                                String str6 = wcVar.b;
                                wa waVar = new wa(str5, str6, list2);
                                qs qsVar2 = wb.a;
                                ProviderInfo providerInfo = (ProviderInfo) qsVar2.a(waVar);
                                Cursor cursor = null;
                                if (providerInfo != null) {
                                    i4 = i9;
                                    resolveContentProvider = providerInfo;
                                } else {
                                    resolveContentProvider = packageManager.resolveContentProvider(str5, i8);
                                    if (resolveContentProvider == null) {
                                        throw new PackageManager.NameNotFoundException("No package found for authority: " + str5);
                                    }
                                    if (!resolveContentProvider.packageName.equals(str6)) {
                                        throw new PackageManager.NameNotFoundException("Found content provider " + str5 + ", but package was not " + wcVar.b);
                                    }
                                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                                    ArrayList arrayList3 = new ArrayList();
                                    int length = signatureArr.length;
                                    int i10 = 0;
                                    while (i10 < length) {
                                        arrayList3.add(signatureArr[i10].toByteArray());
                                        i10++;
                                        signatureArr = signatureArr;
                                    }
                                    Comparator comparator = wb.b;
                                    Collections.sort(arrayList3, comparator);
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= list2.size()) {
                                            i4 = i9;
                                            Trace.endSection();
                                            resolveContentProvider = null;
                                            break;
                                        }
                                        i4 = i9;
                                        ArrayList arrayList4 = new ArrayList((Collection) list2.get(i11));
                                        Collections.sort(arrayList4, comparator);
                                        Comparator comparator2 = comparator;
                                        if (arrayList3.size() == arrayList4.size()) {
                                            while (i5 < arrayList3.size()) {
                                                i5 = Arrays.equals((byte[]) arrayList3.get(i5), (byte[]) arrayList4.get(i5)) ? i5 + 1 : 0;
                                            }
                                            qsVar2.b(waVar, resolveContentProvider);
                                            Trace.endSection();
                                            break;
                                        }
                                        i11++;
                                        comparator = comparator2;
                                        i9 = i4;
                                    }
                                }
                                if (resolveContentProvider == null) {
                                    i2 = 0;
                                    ?? singletonList = Collections.singletonList(null);
                                    Trace.endSection();
                                    i3 = 1;
                                    arrayList = singletonList;
                                    break;
                                }
                                String str7 = resolveContentProvider.authority;
                                yk.f("FontProvider.query");
                                ArrayList arrayList5 = new ArrayList();
                                Uri build = new Uri.Builder().scheme(str4).authority(str7).build();
                                Uri build2 = new Uri.Builder().scheme(str4).authority(str7).appendPath("file").build();
                                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                                try {
                                    strArr = new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                                    yk.f("ContentQueryWrapper.query");
                                    try {
                                        String str8 = wcVar.f;
                                        if (str8 != null) {
                                            int length2 = str8.length();
                                            int i12 = 0;
                                            while (i12 < length2) {
                                                int codePointAt = str8.codePointAt(i12);
                                                if (!Character.isWhitespace(codePointAt)) {
                                                    strArr2 = new String[]{wcVar.c, "VF"};
                                                    break;
                                                }
                                                i12 += Character.charCount(codePointAt);
                                            }
                                        }
                                        strArr2 = new String[]{wcVar.c};
                                        strArr3 = strArr2;
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    if (acquireUnstableContentProviderClient != null) {
                                        try {
                                            query = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr3, null, null);
                                        } catch (RemoteException e) {
                                            build = build;
                                            Log.w("FontsProvider", "Unable to query the content provider", e);
                                        }
                                        if (query != null || query.getCount() <= 0) {
                                            str2 = str4;
                                        } else {
                                            int columnIndex = query.getColumnIndex("result_code");
                                            arrayList5 = new ArrayList();
                                            int columnIndex2 = query.getColumnIndex("_id");
                                            int columnIndex3 = query.getColumnIndex("file_id");
                                            int columnIndex4 = query.getColumnIndex("font_ttc_index");
                                            int columnIndex5 = query.getColumnIndex("font_weight");
                                            str2 = str4;
                                            int columnIndex6 = query.getColumnIndex("font_italic");
                                            while (query.moveToNext()) {
                                                int i13 = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                                                int i14 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                                                if (columnIndex3 == -1) {
                                                    i7 = columnIndex;
                                                    withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                                                } else {
                                                    i7 = columnIndex;
                                                    withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                                                }
                                                arrayList5.add(new wh(withAppendedId, i14, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, wcVar.f, i13));
                                                columnIndex = i7;
                                            }
                                        }
                                        if (query != null) {
                                            query.close();
                                        }
                                        pk.f(acquireUnstableContentProviderClient);
                                        i6 = 0;
                                        wh[] whVarArr = (wh[]) arrayList5.toArray(new wh[0]);
                                        Trace.endSection();
                                        arrayList2.add(whVarArr);
                                    }
                                    if (query != null) {
                                    }
                                    str2 = str4;
                                    if (query != null) {
                                    }
                                    pk.f(acquireUnstableContentProviderClient);
                                    i6 = 0;
                                    wh[] whVarArr2 = (wh[]) arrayList5.toArray(new wh[0]);
                                    Trace.endSection();
                                    arrayList2.add(whVarArr2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    pk.f(acquireUnstableContentProviderClient);
                                    throw th;
                                }
                                query = null;
                            } else {
                                wh[] whVarArr3 = new wh[1];
                                whVarArr3[i8] = new wh(str3, wcVar.f);
                                arrayList2.add(whVarArr3);
                                str2 = str4;
                                i6 = i8;
                                i4 = i9;
                            }
                            i9 = i4 + 1;
                            i8 = i6;
                            str4 = str2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    bshVar = new bsh(-1);
                }
            }
            return bshVar;
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
