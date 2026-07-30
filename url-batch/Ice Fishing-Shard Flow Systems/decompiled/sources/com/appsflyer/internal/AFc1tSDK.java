package com.appsflyer.internal;

import a.AbstractC0169a;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1tSDK implements AFc1vSDK {
    private final AFc1fSDK AFAdRevenueData;
    private final AFc1jSDK getMediationNetwork;
    private final AFc1sSDK getMonetizationNetwork;
    private final Map<String, Integer> getRevenue;

    public AFc1tSDK(AFc1fSDK aFc1fSDK, AFc1jSDK aFc1jSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        this.AFAdRevenueData = aFc1fSDK;
        this.getMediationNetwork = aFc1jSDK;
        this.getMonetizationNetwork = new AFc1sSDK(r.d(new AFc1uSDK("ConversionsCache", q.b(AFe1lSDK.CONVERSION), 1), new AFc1uSDK("AttrCache", q.b(AFe1lSDK.ATTR), 1), new AFc1uSDK("OtherCache", r.d(AFe1lSDK.LAUNCH, AFe1lSDK.INAPP, AFe1lSDK.ADREVENUE, AFe1lSDK.ARS_VALIDATE, AFe1lSDK.PURCHASE_VALIDATE, AFe1lSDK.MANUAL_PURCHASE_VALIDATION, AFe1lSDK.SDK_SERVICES), 40)));
        this.getRevenue = I.f(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private final void getMediationNetwork() {
        for (AFc1uSDK aFc1uSDK : this.getMonetizationNetwork.getRevenue) {
            String str = aFc1uSDK.getCurrencyIso4217Code;
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1uSDK.getCurrencyIso4217Code;
                File[] listFiles = file.listFiles();
                map.put(str2, Integer.valueOf(listFiles != null ? listFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1uSDK.getCurrencyIso4217Code, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final List<AFc1rSDK> AFAdRevenueData() {
        int i2;
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.b(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.b(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                w.i(arrayList2, listFiles);
            }
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                File file2 = (File) obj;
                AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1rSDK currencyIso4217Code = getCurrencyIso4217Code(file2);
                if (currencyIso4217Code != null) {
                    arrayList.add(currencyIso4217Code);
                }
            }
        } catch (Exception e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e7, false, false, false, false, 120, null);
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, C4.p.h(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void getCurrencyIso4217Code() {
        try {
            if (this.getMediationNetwork.getCurrencyIso4217Code("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.b(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    Intrinsics.b(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.AFAdRevenueData("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.b(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    Intrinsics.b(context4);
                    c6.l.d(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    Intrinsics.b(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMediationNetwork();
        } catch (Exception e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e7, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void getMonetizationNetwork() {
        try {
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.b(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.b(context3);
                File[] listFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (listFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    for (File file : listFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context4);
            c6.l.d(new File(context4.getFilesDir(), "AFRequestCache"));
            getMediationNetwork();
        } catch (Exception e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e7, false, false, false, false, 120, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.appsflyer.internal.AFc1tSDK$1] */
    @Override // com.appsflyer.internal.AFc1vSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getRevenue(AFc1rSDK aFc1rSDK) {
        String str;
        Exception exc;
        File file;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        String valueOf;
        String str2;
        List q4;
        List<File> x7;
        Intrinsics.checkNotNullParameter(aFc1rSDK, "");
        try {
            AFe1lSDK aFe1lSDK = aFc1rSDK.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(aFe1lSDK, "");
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1lSDK));
            if (!file2.exists()) {
                try {
                    file2.mkdirs();
                } catch (Exception e7) {
                    exc = e7;
                    file = null;
                    str = null;
                    if (file != null) {
                        file.delete();
                    }
                    AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                    return str;
                }
            }
            aFLogger = AFLogger.INSTANCE;
            aFg1cSDK = AFg1cSDK.CACHE;
            AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1rSDK.getRevenue, false, 4, null);
            valueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, valueOf);
        } catch (Exception e8) {
            str = null;
            exc = e8;
            file = null;
        }
        try {
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1rSDK.getMediationNetwork);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1rSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1rSDK.getCurrencyIso4217Code(), 2));
                    outputStreamWriter.write(10);
                    AFe1lSDK aFe1lSDK2 = aFc1rSDK.getMonetizationNetwork;
                    str = null;
                    try {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFe1lSDK2.name());
                        outputStreamWriter.write(10);
                        Map<String, String> map = aFc1rSDK.getCurrencyIso4217Code;
                        if (map != null && !map.isEmpty()) {
                            outputStreamWriter.write("headers=");
                            Map<String, String> map2 = aFc1rSDK.getCurrencyIso4217Code;
                            Intrinsics.c(map2, "");
                            String jSONObject = new JSONObject(map2).toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "");
                            outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                            outputStreamWriter.write(10);
                        }
                        outputStreamWriter.flush();
                        Unit unit = Unit.f6114a;
                        outputStreamWriter.close();
                        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + valueOf, false, 4, null);
                        AFe1lSDK aFe1lSDK3 = aFc1rSDK.getMonetizationNetwork;
                        Intrinsics.checkNotNullExpressionValue(aFe1lSDK3, "");
                        AFc1uSDK AFAdRevenueData = AFAdRevenueData(aFe1lSDK3);
                        Integer valueOf2 = AFAdRevenueData != null ? Integer.valueOf(AFAdRevenueData.getMediationNetwork) : null;
                        if (valueOf2 == null) {
                            return valueOf;
                        }
                        int intValue = valueOf2.intValue();
                        Map<String, Integer> map3 = this.getRevenue;
                        AFc1uSDK AFAdRevenueData2 = AFAdRevenueData(aFe1lSDK3);
                        if (AFAdRevenueData2 == null || (str2 = AFAdRevenueData2.getCurrencyIso4217Code) == null) {
                            throw new UnsupportedOperationException("Cache do not support this type of events");
                        }
                        Integer num = map3.get(str2);
                        int intValue2 = num != null ? num.intValue() : 0;
                        if (intValue2 >= intValue) {
                            int i2 = (intValue2 + 1) - intValue;
                            AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1lSDK3 + ", removing " + i2 + " item(s)", false, 4, null);
                            Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                            Intrinsics.b(context2);
                            File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1lSDK3));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File[] listFiles = file3.listFiles();
                            if (listFiles != null && (q4 = kotlin.collections.p.q(listFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1tSDK.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t6, T t7) {
                                    String name = ((File) t6).getName();
                                    String name2 = ((File) t7).getName();
                                    if (name == name2) {
                                        return 0;
                                    }
                                    if (name == null) {
                                        return -1;
                                    }
                                    if (name2 == null) {
                                        return 1;
                                    }
                                    return name.compareTo(name2);
                                }
                            })) != null && (x7 = CollectionsKt.x(i2, q4)) != null) {
                                for (File file4 : x7) {
                                    file4.delete();
                                    AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                        getMediationNetwork();
                        return valueOf;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC0169a.d(outputStreamWriter, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = null;
                }
            } catch (Exception e9) {
                e = e9;
                str = null;
                exc = e;
                if (file != null) {
                }
                AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return str;
            }
        } catch (Exception e10) {
            e = e10;
            exc = e;
            if (file != null) {
            }
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
            return str;
        }
    }

    private final String getMediationNetwork(AFe1lSDK aFe1lSDK) {
        String str;
        AFc1uSDK AFAdRevenueData = AFAdRevenueData(aFe1lSDK);
        if (AFAdRevenueData == null || (str = AFAdRevenueData.getCurrencyIso4217Code) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private static AFc1rSDK getCurrencyIso4217Code(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(cArr);
                aFc1rSDK.AFAdRevenueData = file.getName();
                inputStreamReader.close();
                return aFc1rSDK;
            } finally {
            }
        } catch (Exception e7) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e7, false, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean getMonetizationNetwork(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
        Intrinsics.b(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, r4.f.d("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1uSDK) it.next()).getCurrencyIso4217Code;
            Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.b(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return AFAdRevenueData(file);
            }
        }
        return true;
    }

    private final boolean AFAdRevenueData(File file) {
        try {
            file.delete();
            getMediationNetwork();
            return true;
        } catch (Exception e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, r4.f.d("Could not delete ", file.getName(), " from cache"), e7, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1uSDK AFAdRevenueData(AFe1lSDK aFe1lSDK) {
        Object obj;
        Iterator<T> it = this.getMonetizationNetwork.getRevenue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AFc1uSDK) obj).getMonetizationNetwork.contains(aFe1lSDK)) {
                break;
            }
        }
        return (AFc1uSDK) obj;
    }
}
