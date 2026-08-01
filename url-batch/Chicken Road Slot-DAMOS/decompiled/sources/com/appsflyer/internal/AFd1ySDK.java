package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1aSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.j0;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.collections.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        aFc1hSDK.getClass();
        this.getMonetizationNetwork = aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        th.getClass();
        str.getClass();
        synchronized (this) {
            File AFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (AFAdRevenueData != null) {
                file = new File(AFAdRevenueData, "6.17.5");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1aSDK revenue = AFd1sSDK.getRevenue(th, str);
                    String str3 = revenue.getCurrencyIso4217Code;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1aSDK.Companion companion = AFc1aSDK.INSTANCE;
                        AFc1aSDK mediationNetwork = AFc1aSDK.Companion.getMediationNetwork(sd.j.a(file2));
                        if (mediationNetwork != null) {
                            mediationNetwork.AFAdRevenueData++;
                            revenue = mediationNetwork;
                        }
                    }
                    sd.j.b(file2, revenue.getMonetizationNetwork());
                    str2 = str3;
                } catch (Exception e2) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e2.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i3, int i10) {
        File[] listFiles;
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                if (AFAdRevenueData != null && (listFiles = AFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    for (File file : listFiles) {
                        String name = file.getName();
                        name.getClass();
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i3 > mediationNetwork || mediationNetwork > i10) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(z.j(arrayList, 10));
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        File file2 = (File) obj;
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(sd.l.d(file2)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((AFc1aSDK) it.next()).AFAdRevenueData;
        }
        return i3;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean z10;
        strArr.getClass();
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                z10 = true;
                if (AFAdRevenueData != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z10 = sd.l.d(AFAdRevenueData);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(w.q(62, strArr)), false, 4, null);
                        File[] listFiles = AFAdRevenueData.listFiles();
                        if (listFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!w.l(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(z.j(arrayList, 10));
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                File file2 = (File) obj;
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(sd.l.d(file2)));
                            }
                            Set T = CollectionsKt.T(arrayList2);
                            if (T.isEmpty()) {
                                T = u0.b(Boolean.TRUE);
                            }
                            Set set = T;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.w(set)).booleanValue()) {
                                z10 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0065, B:25:0x006b, B:30:0x0043, B:32:0x006e, B:34:0x0079, B:37:0x0087, B:11:0x001a, B:13:0x0020, B:15:0x0029, B:17:0x003a), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.appsflyer.internal.AFc1aSDK>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.j0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // com.appsflyer.internal.AFc1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFc1aSDK> getRevenue() {
        ?? r12;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                r12 = 0;
                r12 = 0;
                if (AFAdRevenueData != null && (listFiles = AFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFc1aSDK.Companion companion = AFc1aSDK.INSTANCE;
                                file2.getClass();
                                AFc1aSDK mediationNetwork = AFc1aSDK.Companion.getMediationNetwork(sd.j.a(file2));
                                if (mediationNetwork != null) {
                                    arrayList.add(mediationNetwork);
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
                    r12 = new ArrayList();
                    int size = arrayList2.size();
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        d0.l(r12, (Iterable) obj);
                    }
                }
                if (r12 == 0) {
                    r12 = j0.f5574d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r12;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
    }

    private final File AFAdRevenueData() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
