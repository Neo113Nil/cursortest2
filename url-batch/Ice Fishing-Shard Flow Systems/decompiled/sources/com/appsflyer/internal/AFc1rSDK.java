package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import l6.C0671a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1rSDK {
    public String AFAdRevenueData;
    private byte[] component3;
    public Map<String, String> getCurrencyIso4217Code;
    String getMediationNetwork;
    public AFe1lSDK getMonetizationNetwork;
    public String getRevenue;

    public AFc1rSDK(String str, byte[] bArr, String str2, AFe1lSDK aFe1lSDK, Map<String, String> map) {
        this.getRevenue = str;
        this.component3 = bArr;
        this.getMediationNetwork = str2;
        this.getMonetizationNetwork = aFe1lSDK;
        this.getCurrencyIso4217Code = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1rSDK.class == obj.getClass()) {
            AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
            if (Objects.equals(this.getMediationNetwork, aFc1rSDK.getMediationNetwork) && Arrays.equals(this.component3, aFc1rSDK.component3) && Objects.equals(this.getRevenue, aFc1rSDK.getRevenue) && Objects.equals(this.AFAdRevenueData, aFc1rSDK.AFAdRevenueData) && Objects.equals(this.getCurrencyIso4217Code, aFc1rSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFc1rSDK.getMonetizationNetwork) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.component3;
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        int hashCode = (Arrays.hashCode(this.component3) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.getRevenue;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFAdRevenueData;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        int hashCode4 = (hashCode3 + (aFe1lSDK != null ? aFe1lSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.getCurrencyIso4217Code;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1rSDK(char[] cArr) {
        String nextLine;
        Map<String, String> map;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                nextLine = scanner.nextLine();
            } catch (Throwable th) {
                try {
                    scanner.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            if (nextLine.startsWith("url=")) {
                this.getRevenue = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.getMediationNetwork = nextLine.substring(8).trim();
            } else {
                if (nextLine.startsWith("headers=")) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(nextLine.substring(8).trim(), 2), Charset.defaultCharset()));
                        Intrinsics.checkNotNullParameter(jSONObject, "");
                        if (jSONObject.length() == 0) {
                            map = I.c();
                        } else {
                            Iterator<String> keys = jSONObject.keys();
                            Intrinsics.checkNotNullExpressionValue(keys, "");
                            C0671a a7 = l6.j.a(keys);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it = a7.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Object obj = jSONObject.get((String) next);
                                linkedHashMap.put(next, Intrinsics.a(obj, JSONObject.NULL) ? "null" : obj.toString());
                            }
                            map = linkedHashMap;
                        }
                        this.getCurrencyIso4217Code = map;
                    } catch (Exception e7) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error parsing headers", e7);
                        this.getCurrencyIso4217Code = new HashMap();
                    }
                } else if (nextLine.startsWith("data=")) {
                    this.component3 = Base64.decode(nextLine.substring(5).trim(), 2);
                } else if (nextLine.startsWith("type=")) {
                    String trim = nextLine.substring(5).trim();
                    try {
                        this.getMonetizationNetwork = AFe1lSDK.valueOf(trim);
                    } catch (Exception e8) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Unknown task type: ".concat(String.valueOf(trim)), e8);
                    }
                }
                scanner.close();
                throw th;
            }
        }
        scanner.close();
    }
}
