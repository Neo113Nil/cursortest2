package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.attribution.RequestError;
import defpackage.ry0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1kSDK {
    private StringBuilder AFAdRevenueData = new StringBuilder();
    private final List<AFa1ySDK> getMonetizationNetwork = new ArrayList();
    private final String getMediationNetwork = null;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public enum AFa1ySDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private AFa1ySDK getMonetizationNetwork() {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1jSDK("Nesting problem");
        }
        return this.getMonetizationNetwork.get(r1.size() - 1);
    }

    public final AFg1kSDK AFAdRevenueData(Object obj) {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1jSDK("Nesting problem");
        }
        if (((Class) AFa1kSDK.getMediationNetwork((char) (View.resolveSize(0, 0) + 2133), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 323 - TextUtils.indexOf("", ""))).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1kSDK.i;
                Object obj2 = map.get(83448719);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2133), TextUtils.indexOf("", "") + 37, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 323)).getDeclaredMethod("getMonetizationNetwork", AFg1kSDK.class);
                    map.put(83448719, obj2);
                }
                ((Method) obj2).invoke(obj, objArr);
                return this;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof AFg1iSDK) {
            ((AFg1iSDK) obj).getMediationNetwork(this);
            return this;
        }
        AFAdRevenueData();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1iSDK.getMediationNetwork) {
            this.AFAdRevenueData.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.AFAdRevenueData.append(AFg1iSDK.getCurrencyIso4217Code((Number) obj));
            return this;
        }
        getRevenue(obj.toString());
        return this;
    }

    public final AFg1kSDK getCurrencyIso4217Code(AFa1ySDK aFa1ySDK, String str) {
        if (this.getMonetizationNetwork.isEmpty() && this.AFAdRevenueData.length() > 0) {
            throw new AFg1jSDK("Nesting problem: multiple top-level roots");
        }
        AFAdRevenueData();
        this.getMonetizationNetwork.add(aFa1ySDK);
        this.AFAdRevenueData.append(str);
        return this;
    }

    public final void getMediationNetwork() {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.NONEMPTY_OBJECT) {
            this.AFAdRevenueData.append(',');
        } else if (monetizationNetwork != AFa1ySDK.EMPTY_OBJECT) {
            throw new AFg1jSDK("Nesting problem");
        }
        AFa1ySDK aFa1ySDK = AFa1ySDK.DANGLING_KEY;
        this.getMonetizationNetwork.set(r2.size() - 1, aFa1ySDK);
    }

    public final void getRevenue(String str) {
        this.AFAdRevenueData.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.AFAdRevenueData.append("\\f");
            } else if (charAt == '\r') {
                this.AFAdRevenueData.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        this.AFAdRevenueData.append("\\b");
                        break;
                    case '\t':
                        this.AFAdRevenueData.append("\\t");
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        this.AFAdRevenueData.append("\\n");
                        break;
                    default:
                        StringBuilder sb = this.AFAdRevenueData;
                        if (charAt <= 31) {
                            sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            sb.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb2 = this.AFAdRevenueData;
                sb2.append('\\');
                sb2.append(charAt);
            }
        }
        this.AFAdRevenueData.append("\"");
    }

    public final String toString() {
        if (this.AFAdRevenueData.length() == 0) {
            return null;
        }
        return this.AFAdRevenueData.toString();
    }

    public final AFg1kSDK getCurrencyIso4217Code(AFa1ySDK aFa1ySDK, AFa1ySDK aFa1ySDK2, String str) {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork != aFa1ySDK2 && monetizationNetwork != aFa1ySDK) {
            throw new AFg1jSDK("Nesting problem");
        }
        this.getMonetizationNetwork.remove(r2.size() - 1);
        this.AFAdRevenueData.append(str);
        return this;
    }

    private void AFAdRevenueData() {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.EMPTY_ARRAY) {
            AFa1ySDK aFa1ySDK = AFa1ySDK.NONEMPTY_ARRAY;
            this.getMonetizationNetwork.set(r2.size() - 1, aFa1ySDK);
        } else {
            if (monetizationNetwork == AFa1ySDK.NONEMPTY_ARRAY) {
                this.AFAdRevenueData.append(',');
                return;
            }
            if (monetizationNetwork == AFa1ySDK.DANGLING_KEY) {
                this.AFAdRevenueData.append(":");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.NONEMPTY_OBJECT;
                this.getMonetizationNetwork.set(r2.size() - 1, aFa1ySDK2);
                return;
            }
            if (monetizationNetwork != AFa1ySDK.NULL) {
                throw new AFg1jSDK("Nesting problem");
            }
        }
    }
}
