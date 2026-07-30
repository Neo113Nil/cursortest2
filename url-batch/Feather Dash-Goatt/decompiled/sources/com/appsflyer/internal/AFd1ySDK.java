package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK;
import defpackage.ai;
import defpackage.ei;
import defpackage.nv;
import defpackage.p91;
import defpackage.ry;
import defpackage.ty;
import defpackage.y9;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1ySDK implements AFc1aSDK {
    private final AFc1fSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1fSDK aFc1fSDK) {
        aFc1fSDK.getClass();
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
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0065, B:25:0x006b, B:30:0x0043, B:32:0x006e, B:34:0x0079, B:37:0x0087, B:11:0x001a, B:13:0x0020, B:15:0x0029, B:17:0x003a), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.appsflyer.internal.AFc1bSDK>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [nv] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // com.appsflyer.internal.AFc1aSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFc1bSDK> AFAdRevenueData() {
        ?? r1;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                r1 = 0;
                r1 = 0;
                if (monetizationNetwork != null && (listFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFc1bSDK.Companion companion = AFc1bSDK.INSTANCE;
                                file2.getClass();
                                AFc1bSDK AFAdRevenueData = AFc1bSDK.Companion.AFAdRevenueData(ry.a(file2));
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
                    r1 = new ArrayList();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ei.j(r1, (Iterable) obj);
                    }
                }
                if (r1 == 0) {
                    r1 = nv.d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r1;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final String getCurrencyIso4217Code(Throwable th, String str) {
        String str2;
        File file;
        th.getClass();
        str.getClass();
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
                    String str3 = AFAdRevenueData.getMonetizationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1bSDK.Companion companion = AFc1bSDK.INSTANCE;
                        AFc1bSDK AFAdRevenueData2 = AFc1bSDK.Companion.AFAdRevenueData(ry.a(file2));
                        if (AFAdRevenueData2 != null) {
                            AFAdRevenueData2.getRevenue++;
                            AFAdRevenueData = AFAdRevenueData2;
                        }
                    }
                    ry.b(file2, AFAdRevenueData.getRevenue());
                    str2 = str3;
                } catch (Exception e) {
                    AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
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
    public final boolean getRevenue(String... strArr) {
        boolean z;
        strArr.getClass();
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                z = true;
                if (monetizationNetwork != null) {
                    if (strArr.length == 0) {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z = ty.d(monetizationNetwork);
                    } else {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(y9.l(62, strArr)), false, 4, null);
                        File[] listFiles = monetizationNetwork.listFiles();
                        if (listFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!y9.i(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(ai.h(arrayList));
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                File file2 = (File) obj;
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(ty.d(file2)));
                            }
                            Set A = CollectionsKt.A(arrayList2);
                            if (A.isEmpty()) {
                                A = p91.a(Boolean.TRUE);
                            }
                            Set set = A;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.o(set)).booleanValue()) {
                                z = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFAdRevenueData(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            try {
                File monetizationNetwork = getMonetizationNetwork();
                if (monetizationNetwork != null && (listFiles = monetizationNetwork.listFiles()) != null) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (File file : listFiles) {
                        String name = file.getName();
                        name.getClass();
                        int AFAdRevenueData = AFj1aSDK.AFAdRevenueData(name);
                        if (i > AFAdRevenueData || AFAdRevenueData > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(ai.h(arrayList));
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        File file2 = (File) obj;
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(ty.d(file2)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getRevenue() {
        Iterator<T> it = AFAdRevenueData().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1bSDK) it.next()).getRevenue;
        }
        return i;
    }
}
