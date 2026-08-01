package com.bytedance.adsdk.pvs.icD.pvs;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: MethodResult.java */
/* loaded from: classes.dex */
public class pvs {
    private Object[] icD;
    private String pvs;

    public String pvs() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public Object[] icD() {
        return this.icD;
    }

    public void pvs(Object[] objArr) {
        this.icD = objArr;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.pvs + "', args=" + Arrays.toString(this.icD) + AbstractJsonLexerKt.END_OBJ;
    }
}
