package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.kh;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AppSessionConfig implements Serializable {
    private static final long serialVersionUID = 2463582211707601660L;

    @TypeInfo(name = "backgroundTimeout", parser = kh.class)
    private long timeoutMillis = 600000;

    public final long a() {
        return this.timeoutMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.timeoutMillis == ((AppSessionConfig) obj).timeoutMillis;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.timeoutMillis)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
