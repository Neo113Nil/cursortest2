package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class EventTracerMetadata implements Serializable {
    private static final long serialVersionUID = 4434247171351288287L;
    private String delimiters;
    private String delimitersRegex;
    private String delimitersReplacement;
    private int maxScopes;

    @TypeInfo(complex = true, parser = EnabledConfig.Parser.class)
    private EnabledConfig enabled = null;

    @TypeInfo(name = "events", type = HashSet.class)
    private Set<String> startEvents = null;

    public final String a() {
        return this.delimiters;
    }

    public final String b() {
        return this.delimitersRegex;
    }

    public final String c() {
        return this.delimitersReplacement;
    }

    public final EnabledConfig d() {
        return this.enabled;
    }

    public final int e() {
        return this.maxScopes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) obj;
            if (this.maxScopes == eventTracerMetadata.maxScopes && zh.a((Object) this.enabled, (Object) eventTracerMetadata.enabled) && zh.a(this.startEvents, eventTracerMetadata.startEvents) && zh.a((Object) this.delimiters, (Object) eventTracerMetadata.delimiters) && zh.a((Object) this.delimitersRegex, (Object) eventTracerMetadata.delimitersRegex) && zh.a((Object) this.delimitersReplacement, (Object) eventTracerMetadata.delimitersReplacement)) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.startEvents;
    }

    public final int hashCode() {
        Object[] objArr = {this.enabled, Integer.valueOf(this.maxScopes), this.startEvents, this.delimiters, this.delimitersRegex, this.delimitersReplacement};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
