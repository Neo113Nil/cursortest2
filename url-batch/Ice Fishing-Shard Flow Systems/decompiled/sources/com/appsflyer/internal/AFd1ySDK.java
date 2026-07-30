package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1ySDK implements AFc1aSDK {
    private final AFc1fSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.getMonetizationNetwork = aFc1fSDK;
    }

    private final File getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x006c, B:25:0x0072, B:30:0x004a, B:32:0x0075, B:34:0x0085, B:37:0x0093, B:11:0x001a, B:13:0x0020, B:15:0x002e, B:17:0x0041), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.appsflyer.internal.AFc1bSDK>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.A] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // com.appsflyer.internal.AFc1aSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFc1bSDK> AFAdRevenueData() {
        ?? r12;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                r12 = 0;
                r12 = 0;
                if (monetizationNetwork != null && (listFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFc1bSDK.AFa1tSDK aFa1tSDK = AFc1bSDK.AFa1tSDK;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFc1bSDK AFAdRevenueData = AFc1bSDK.AFa1tSDK.AFAdRevenueData(c6.j.a(file2));
                                if (AFAdRevenueData != null) {
                                    arrayList.add(AFAdRevenueData);
                                }
                            }
                            if (arrayList == null) {
                                arrayList2.add(arrayList);
                            }
                        }
                        arrayList = null;
                        if (arrayList == null) {
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                    r12 = new ArrayList();
                    int size = arrayList2.size();
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        w.h((Iterable) obj, r12);
                    }
                }
                if (r12 == 0) {
                    r12 = A.f6115d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r12;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final String getCurrencyIso4217Code(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File monetizationNetwork = getMonetizationNetwork();
            str2 = null;
            if (monetizationNetwork != null) {
                file = new File(monetizationNetwork, "6.18.0");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1bSDK AFAdRevenueData = AFd1tSDK.AFAdRevenueData(th, str);
                    String str3 = AFAdRevenueData.getMediationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1bSDK.AFa1tSDK aFa1tSDK = AFc1bSDK.AFa1tSDK;
                        AFc1bSDK AFAdRevenueData2 = AFc1bSDK.AFa1tSDK.AFAdRevenueData(c6.j.a(file2));
                        if (AFAdRevenueData2 != null) {
                            AFAdRevenueData2.AFAdRevenueData++;
                            AFAdRevenueData = AFAdRevenueData2;
                        }
                    }
                    c6.j.b(file2, AFAdRevenueData.getRevenue());
                    str2 = str3;
                } catch (Exception e7) {
                    AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e7.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getMediationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getRevenue() {
        Iterator<T> it = AFAdRevenueData().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((AFc1bSDK) it.next()).AFAdRevenueData;
        }
        return i2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getRevenue(String... strArr) {
        boolean z7;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                z7 = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z7 = c6.l.d(monetizationNetwork);
                    } else {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + kotlin.collections.p.o(strArr, 62), false, 4, null);
                        File[] listFiles = monetizationNetwork.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!kotlin.collections.p.k(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(s.g(arrayList, 10));
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                File file2 = (File) obj;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(c6.l.d(file2)));
                            }
                            Set C7 = CollectionsKt.C(arrayList2);
                            if (C7.isEmpty()) {
                                C7 = Collections.singleton(Boolean.TRUE);
                                Intrinsics.checkNotNullExpressionValue(C7, "singleton(...)");
                            }
                            if (C7.size() != 1 || !((Boolean) CollectionsKt.n(C7)).booleanValue()) {
                                z7 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFAdRevenueData(int i2, int i5) {
        File[] listFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (listFiles = monetizationNetwork.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList arrayList = new ArrayList();
                    int i7 = 0;
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int AFAdRevenueData = AFj1aSDK.AFAdRevenueData(name);
                        if (i2 > AFAdRevenueData || AFAdRevenueData > i5) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(s.g(arrayList, 10));
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        File file2 = (File) obj;
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(c6.l.d(file2)));
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
