package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AFg1dSDK {
    private StringBuilder getRevenue = new StringBuilder();
    private final List<AFa1zSDK> getCurrencyIso4217Code = new ArrayList();
    private final String getMonetizationNetwork = null;

    enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public final AFg1dSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty() && this.getRevenue.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.getCurrencyIso4217Code.add(aFa1zSDK);
        this.getRevenue.append(str);
        return this;
    }

    public final AFg1dSDK getMonetizationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) throws AFg1mSDK {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code != aFa1zSDK2 && currencyIso4217Code != aFa1zSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        this.getCurrencyIso4217Code.remove(r2.size() - 1);
        this.getRevenue.append(str);
        return this;
    }

    private AFa1zSDK getCurrencyIso4217Code() throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        return this.getCurrencyIso4217Code.get(r0.size() - 1);
    }

    public final AFg1dSDK getCurrencyIso4217Code(Object obj) throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        if (((Class) AFa1hSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + 324, (char) (Drawable.resolveOpacity(0, 0) + 31687), (ViewConfiguration.getTouchSlop() >> 8) + 36)).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Object obj2 = AFa1hSDK.d.get(-811011778);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1hSDK.getRevenue((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 322, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31686), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35)).getDeclaredMethod("getCurrencyIso4217Code", AFg1dSDK.class);
                    AFa1hSDK.d.put(-811011778, obj2);
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
        if (obj instanceof AFg1gSDK) {
            ((AFg1gSDK) obj).getCurrencyIso4217Code(this);
            return this;
        }
        getMediationNetwork();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.getRevenue) {
            this.getRevenue.append(obj);
        } else if (obj instanceof Number) {
            this.getRevenue.append(AFg1gSDK.getCurrencyIso4217Code((Number) obj));
        } else {
            AFAdRevenueData(obj.toString());
        }
        return this;
    }

    final void AFAdRevenueData(String str) {
        this.getRevenue.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                        this.getRevenue.append('\\').append(charAt);
                    } else {
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
                    }
                } else {
                    this.getRevenue.append("\\r");
                }
            } else {
                this.getRevenue.append("\\f");
            }
        }
        this.getRevenue.append("\"");
    }

    final void getMonetizationNetwork() throws AFg1mSDK {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.NONEMPTY_OBJECT) {
            this.getRevenue.append(',');
        } else if (currencyIso4217Code != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1zSDK);
    }

    private void getMediationNetwork() throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            return;
        }
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1zSDK);
        } else {
            if (currencyIso4217Code == AFa1zSDK.NONEMPTY_ARRAY) {
                this.getRevenue.append(',');
                return;
            }
            if (currencyIso4217Code == AFa1zSDK.DANGLING_KEY) {
                this.getRevenue.append(":");
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1zSDK2);
                return;
            }
            if (currencyIso4217Code != AFa1zSDK.NULL) {
                throw new AFg1mSDK("Nesting problem");
            }
        }
    }

    public final String toString() {
        if (this.getRevenue.length() == 0) {
            return null;
        }
        return this.getRevenue.toString();
    }
}
