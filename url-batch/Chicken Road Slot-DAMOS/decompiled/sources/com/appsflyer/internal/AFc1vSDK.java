package com.appsflyer.internal;

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
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFc1vSDK implements AFc1tSDK {
    private final AFc1hSDK AFAdRevenueData;
    private final AFc1qSDK getMediationNetwork;
    private final Map<String, Integer> getMonetizationNetwork;
    private final AFc1rSDK getRevenue;

    public AFc1vSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK) {
        aFc1hSDK.getClass();
        aFc1qSDK.getClass();
        this.AFAdRevenueData = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getRevenue = new AFc1rSDK(y.f(new AFc1sSDK("ConversionsCache", x.c(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", x.c(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", y.f(AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES), 40)));
        this.getMonetizationNetwork = p0.e(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private static AFc1uSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
                aFc1uSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1uSDK;
            } finally {
            }
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e2, false, false, true, false);
            return null;
        }
    }

    private final void getMonetizationNetwork() {
        for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
            String str = aFc1sSDK.AFAdRevenueData;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            context.getClass();
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getMonetizationNetwork;
                String str2 = aFc1sSDK.AFAdRevenueData;
                File[] listFiles = file.listFiles();
                map.put(str2, Integer.valueOf(listFiles != null ? listFiles.length : 0));
            } else {
                file.mkdirs();
                this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final List<AFc1uSDK> getCurrencyIso4217Code() {
        int i3;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (true) {
                i3 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                context3.getClass();
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                List asList = Arrays.asList(listFiles);
                asList.getClass();
                arrayList2.addAll(asList);
            }
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                File file2 = (File) obj;
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1uSDK AFAdRevenueData = AFAdRevenueData(file2);
                if (AFAdRevenueData != null) {
                    arrayList.add(AFAdRevenueData);
                }
            }
        } catch (Exception e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e2, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, n0.l.f(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.appsflyer.internal.AFc1tSDK
    public final String getMediationNetwork(AFc1uSDK aFc1uSDK) {
        Exception exc;
        File file;
        String str;
        aFc1uSDK.getClass();
        try {
            AFe1pSDK aFe1pSDK = aFc1uSDK.AFAdRevenueData;
            aFe1pSDK.getClass();
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            context.getClass();
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1uSDK.getRevenue, false, 4, null);
            String valueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, valueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1uSDK.getCurrencyIso4217Code);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1uSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1uSDK.getMediationNetwork(), 2));
                    outputStreamWriter.write(10);
                    AFe1pSDK aFe1pSDK2 = aFc1uSDK.AFAdRevenueData;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1pSDK2.name());
                    outputStreamWriter.write(10);
                    Map<String, String> map = aFc1uSDK.getMonetizationNetwork;
                    if (map != null && !map.isEmpty()) {
                        outputStreamWriter.write("headers=");
                        Map<String, String> map2 = aFc1uSDK.getMonetizationNetwork;
                        map2.getClass();
                        String jSONObject = new JSONObject(map2).toString();
                        jSONObject.getClass();
                        byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + valueOf, false, 4, null);
                    AFe1pSDK aFe1pSDK3 = aFc1uSDK.AFAdRevenueData;
                    aFe1pSDK3.getClass();
                    AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK3);
                    Integer valueOf2 = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMonetizationNetwork) : null;
                    if (valueOf2 == null) {
                        return valueOf;
                    }
                    int intValue = valueOf2.intValue();
                    Map<String, Integer> map3 = this.getMonetizationNetwork;
                    AFc1sSDK mediationNetwork2 = getMediationNetwork(aFe1pSDK3);
                    if (mediationNetwork2 == null || (str = mediationNetwork2.AFAdRevenueData) == null) {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                    Integer num = map3.get(str);
                    int intValue2 = num != null ? num.intValue() : 0;
                    if (intValue2 >= intValue) {
                        int i3 = (intValue2 + 1) - intValue;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1pSDK3 + ", removing " + i3 + " item(s)", false, 4, null);
                        Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                        context2.getClass();
                        File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK3));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        Object[] listFiles = file3.listFiles();
                        if (listFiles != null) {
                            Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1vSDK.4
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t6, T t10) {
                                    return jd.a.a(((File) t6).getName(), ((File) t10).getName());
                                }
                            };
                            if (listFiles.length != 0) {
                                listFiles = Arrays.copyOf(listFiles, listFiles.length);
                                if (listFiles.length > 1) {
                                    Arrays.sort(listFiles, comparator);
                                }
                            }
                            List asList = Arrays.asList(listFiles);
                            asList.getClass();
                            List<File> M = CollectionsKt.M(asList, i3);
                            if (M != null) {
                                for (File file4 : M) {
                                    file4.delete();
                                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                    }
                    getMonetizationNetwork();
                    return valueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        i7.a.G(outputStreamWriter, th);
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                exc = e2;
                if (file != null) {
                    file.delete();
                }
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e9) {
            exc = e9;
            file = null;
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getRevenue() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                context3.getClass();
                File[] listFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            context4.getClass();
            sd.l.d(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e2, false, false, false, false, 120, null);
        }
    }

    private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
        String str;
        AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
        if (mediationNetwork != null && (str = mediationNetwork.AFAdRevenueData) != null) {
            return str;
        }
        a2.r.r("Cache do not support this type of events");
        return null;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final boolean getRevenue(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        context.getClass();
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
            context2.getClass();
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, n0.l.g("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            context3.getClass();
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMediationNetwork(file);
            }
        }
        return true;
    }

    private final boolean getMediationNetwork(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, n0.l.g("Could not delete ", file.getName(), " from cache"), e2, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
        Object obj;
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AFc1sSDK) obj).getMediationNetwork.contains(aFe1pSDK)) {
                break;
            }
        }
        return (AFc1sSDK) obj;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getMediationNetwork() {
        try {
            if (this.getMediationNetwork.getRevenue("AF_CACHE_VERSION", -1) != 2) {
                this.getMediationNetwork.getMediationNetwork("AF_CACHE_VERSION", 2);
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                context.getClass();
                if (new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    context2.getClass();
                    sd.l.d(new File(context2.getFilesDir(), "AFRequestCache"));
                    Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                    context3.getClass();
                    new File(context3.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                context4.getClass();
                if (!new File(context4.getFilesDir(), "AFRequestCache").exists()) {
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    context5.getClass();
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e2, false, false, false, false, 120, null);
        }
    }
}
