package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rr {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f31333a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f31334b = new ArrayList();

    public static void a(rr rrVar, long j4) {
        rrVar.f31333a.put("exo_len", Long.valueOf(j4));
        rrVar.f31334b.remove("exo_len");
    }

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f31334b));
    }

    public static void a(rr rrVar, Uri uri) {
        if (uri == null) {
            rrVar.f31334b.add("exo_redir");
            rrVar.f31333a.remove("exo_redir");
            return;
        }
        String uri2 = uri.toString();
        HashMap hashMap = rrVar.f31333a;
        uri2.getClass();
        hashMap.put("exo_redir", uri2);
        rrVar.f31334b.remove("exo_redir");
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap(this.f31333a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
