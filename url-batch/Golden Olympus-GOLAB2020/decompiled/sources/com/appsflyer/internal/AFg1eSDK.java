package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFg1eSDK {
    private StringBuilder getRevenue = new StringBuilder();
    private final List<AFa1uSDK> getMonetizationNetwork = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    enum AFa1uSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private void getMediationNetwork() {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1uSDK AFAdRevenueData = AFAdRevenueData();
        if (AFAdRevenueData == AFa1uSDK.EMPTY_ARRAY) {
            AFa1uSDK aFa1uSDK = AFa1uSDK.NONEMPTY_ARRAY;
            this.getMonetizationNetwork.set(r1.size() - 1, aFa1uSDK);
        } else {
            if (AFAdRevenueData == AFa1uSDK.NONEMPTY_ARRAY) {
                this.getRevenue.append(',');
                return;
            }
            if (AFAdRevenueData != AFa1uSDK.DANGLING_KEY) {
                if (AFAdRevenueData != AFa1uSDK.NULL) {
                    throw new AFg1mSDK("Nesting problem");
                }
            } else {
                this.getRevenue.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                AFa1uSDK aFa1uSDK2 = AFa1uSDK.NONEMPTY_OBJECT;
                this.getMonetizationNetwork.set(r1.size() - 1, aFa1uSDK2);
            }
        }
    }

    public final AFg1eSDK AFAdRevenueData(AFa1uSDK aFa1uSDK, AFa1uSDK aFa1uSDK2, String str) {
        AFa1uSDK AFAdRevenueData = AFAdRevenueData();
        if (AFAdRevenueData != aFa1uSDK2 && AFAdRevenueData != aFa1uSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        this.getMonetizationNetwork.remove(r2.size() - 1);
        this.getRevenue.append(str);
        return this;
    }

    public final AFg1eSDK getCurrencyIso4217Code(AFa1uSDK aFa1uSDK, String str) {
        if (this.getMonetizationNetwork.isEmpty() && this.getRevenue.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.getMonetizationNetwork.add(aFa1uSDK);
        this.getRevenue.append(str);
        return this;
    }

    final void getMonetizationNetwork() {
        AFa1uSDK AFAdRevenueData = AFAdRevenueData();
        if (AFAdRevenueData == AFa1uSDK.NONEMPTY_OBJECT) {
            this.getRevenue.append(',');
        } else if (AFAdRevenueData != AFa1uSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1uSDK aFa1uSDK = AFa1uSDK.DANGLING_KEY;
        this.getMonetizationNetwork.set(r1.size() - 1, aFa1uSDK);
    }

    public final AFg1eSDK getRevenue(Object obj) {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        if (((Class) AFa1kSDK.getCurrencyIso4217Code(321 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (2133 - Drawable.resolveOpacity(0, 0)), 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1kSDK.f13355i;
                Object obj2 = map.get(704691833);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1kSDK.getCurrencyIso4217Code((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 320, (char) (2133 - KeyEvent.keyCodeFromString("")), TextUtils.indexOf((CharSequence) "", '0') + 37)).getDeclaredMethod("getMonetizationNetwork", AFg1eSDK.class);
                    map.put(704691833, obj2);
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
        if (obj instanceof AFg1dSDK) {
            ((AFg1dSDK) obj).AFAdRevenueData(this);
            return this;
        }
        getMediationNetwork();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1dSDK.getMonetizationNetwork) {
            this.getRevenue.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.getRevenue.append(AFg1dSDK.getMediationNetwork((Number) obj));
            return this;
        }
        getCurrencyIso4217Code(obj.toString());
        return this;
    }

    public final String toString() {
        if (this.getRevenue.length() == 0) {
            return null;
        }
        return this.getRevenue.toString();
    }

    private AFa1uSDK AFAdRevenueData() {
        if (!this.getMonetizationNetwork.isEmpty()) {
            return this.getMonetizationNetwork.get(r0.size() - 1);
        }
        throw new AFg1mSDK("Nesting problem");
    }

    final void getCurrencyIso4217Code(String str) {
        this.getRevenue.append("\"");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\f') {
                this.getRevenue.append("\\f");
            } else if (charAt == '\r') {
                this.getRevenue.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.getRevenue.append("\\b");
                        break;
                    case '\t':
                        this.getRevenue.append("\\t");
                        break;
                    case '\n':
                        this.getRevenue.append("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            this.getRevenue.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            this.getRevenue.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb = this.getRevenue;
                sb.append('\\');
                sb.append(charAt);
            }
        }
        this.getRevenue.append("\"");
    }
}
