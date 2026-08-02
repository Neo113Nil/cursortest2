package com.startapp.sdk.adsbase.consent;

import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    public final Integer a() {
        return this.falseClick;
    }

    public final Integer b() {
        return this.impression;
    }

    public final Integer c() {
        return this.trueClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConsentTypeInfoConfig.class == obj.getClass()) {
            ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
            if (si.a((Object) this.impression, (Object) consentTypeInfoConfig.impression) && si.a((Object) this.trueClick, (Object) consentTypeInfoConfig.trueClick) && si.a((Object) this.falseClick, (Object) consentTypeInfoConfig.falseClick)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
