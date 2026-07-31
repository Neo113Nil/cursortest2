package com.bytedance.adsdk.zmn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class nps implements iv {
    @Override // com.bytedance.adsdk.zmn.iv
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Number zmn(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number zmn = zmn(objArr[0]);
        int zmn2 = zmn(objArr[1], 0);
        boolean zmn3 = zmn(objArr[2], false);
        if (zmn == null) {
            return null;
        }
        return zmn(zmn, zmn2, zmn3);
    }

    public Number zmn(Number number, int i, boolean z) {
        BigDecimal scale;
        if (number == null) {
            return null;
        }
        int max = Math.max(i, 0);
        BigDecimal valueOf = BigDecimal.valueOf(number.doubleValue());
        if (z) {
            scale = valueOf.setScale(max, RoundingMode.HALF_UP);
        } else {
            scale = valueOf.setScale(max, RoundingMode.DOWN);
        }
        if (max == 0 || nps$$ExternalSyntheticBackportWithForwarding0.m(scale).scale() <= 0) {
            return Long.valueOf(scale.longValue());
        }
        return Double.valueOf(scale.doubleValue());
    }

    private Number zmn(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int zmn(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    private boolean zmn(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z;
    }
}
