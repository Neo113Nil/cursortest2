package com.startapp.sdk.ads.external.config;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.c7;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class ExternalConfig implements Serializable {
    public static final c7 Companion = new c7();
    private static final long serialVersionUID = 6500875630965723998L;

    @TypeInfo(complex = true)
    private ExternalAdConfig googleads;
    private boolean loadInnerAdIfNoExternal;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q.a(ExternalConfig.class).equals(q.a(obj.getClass()))) {
            return false;
        }
        ExternalConfig externalConfig = (ExternalConfig) obj;
        return si.a((Object) this.googleads, (Object) externalConfig.googleads) && this.loadInnerAdIfNoExternal == externalConfig.loadInnerAdIfNoExternal;
    }

    public final ExternalAdConfig getGoogleads() {
        return this.googleads;
    }

    public final boolean getLoadInnerAdIfNoExternal() {
        return this.loadInnerAdIfNoExternal;
    }

    public int hashCode() {
        Object[] objArr = {this.googleads, Boolean.valueOf(this.loadInnerAdIfNoExternal)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public final void setGoogleads(ExternalAdConfig externalAdConfig) {
        this.googleads = externalAdConfig;
    }

    public final void setLoadInnerAdIfNoExternal(boolean z) {
        this.loadInnerAdIfNoExternal = z;
    }
}
