package com.anythink.core.common.n.b;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f15772a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f15773b;

    public h(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.f15772a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f15773b = Collections.unmodifiableMap(linkedHashMap);
    }

    private h a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f15773b);
        linkedHashMap.put("charset", charset.name());
        return new h(this.f15772a, linkedHashMap);
    }

    private Map<String, String> b() {
        return this.f15773b;
    }

    private String c() {
        return this.f15773b.get("realm");
    }

    private Charset d() {
        String str = this.f15773b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f15772a.equals(this.f15772a) && hVar.f15773b.equals(this.f15773b);
    }

    public final int hashCode() {
        return this.f15773b.hashCode() + AbstractC5051n.k(899, 31, this.f15772a);
    }

    public final String toString() {
        return this.f15772a + " authParams=" + this.f15773b;
    }

    private String a() {
        return this.f15772a;
    }

    private h(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 != null) {
            this.f15772a = str;
            this.f15773b = Collections.singletonMap("realm", str2);
            return;
        }
        throw new NullPointerException("realm == null");
    }
}
