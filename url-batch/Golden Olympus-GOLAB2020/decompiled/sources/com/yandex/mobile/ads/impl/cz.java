package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class cz {

    /* renamed from: c, reason: collision with root package name */
    public static final cz f24357c = new cz(Collections.EMPTY_MAP);

    /* renamed from: a, reason: collision with root package name */
    private int f24358a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f24359b;

    public cz() {
        this(Collections.EMPTY_MAP);
    }

    public final cz a(rr rrVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f24359b);
        List<String> b4 = rrVar.b();
        for (int i4 = 0; i4 < b4.size(); i4++) {
            hashMap.remove(b4.get(i4));
        }
        for (Map.Entry<String, Object> entry : rrVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(un.f33183c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value;
            }
            hashMap.put(key, bArr);
        }
        Map<String, byte[]> map = this.f24359b;
        if (map.size() == hashMap.size()) {
            for (Map.Entry<String, byte[]> entry2 : map.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) hashMap.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new cz(hashMap);
    }

    public final long b() {
        byte[] bArr = this.f24359b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final String c() {
        byte[] bArr = this.f24359b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, un.f33183c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cz.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f24359b;
        Map<String, byte[]> map2 = ((cz) obj).f24359b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f24358a == 0) {
            int i4 = 0;
            for (Map.Entry<String, byte[]> entry : this.f24359b.entrySet()) {
                i4 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f24358a = i4;
        }
        return this.f24358a;
    }

    public cz(Map<String, byte[]> map) {
        this.f24359b = Collections.unmodifiableMap(map);
    }

    public final Set<Map.Entry<String, byte[]>> a() {
        return this.f24359b.entrySet();
    }
}
