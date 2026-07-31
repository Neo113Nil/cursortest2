package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class dx2 {

    /* renamed from: a, reason: collision with root package name */
    private final v3.d f4373a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<String>> f4374b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f4375c = new HashMap();

    public dx2(v3.d dVar) {
        this.f4373a = dVar;
    }

    private final void d(String str, String str2) {
        if (!this.f4374b.containsKey(str)) {
            this.f4374b.put(str, new ArrayList());
        }
        this.f4374b.get(str).add(str2);
    }

    public final List<cx2> a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f4374b.entrySet()) {
            int i7 = 0;
            if (entry.getValue().size() > 1) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    i7++;
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 12);
                    sb.append(key);
                    sb.append(".");
                    sb.append(i7);
                    arrayList.add(new cx2(sb.toString(), str));
                }
            } else {
                arrayList.add(new cx2(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        if (!this.f4375c.containsKey(str)) {
            this.f4375c.put(str, Long.valueOf(this.f4373a.a()));
            return;
        }
        long a7 = this.f4373a.a();
        long longValue = this.f4375c.remove(str).longValue();
        StringBuilder sb = new StringBuilder(20);
        sb.append(a7 - longValue);
        d(str, sb.toString());
    }

    public final void c(String str, String str2) {
        if (!this.f4375c.containsKey(str)) {
            this.f4375c.put(str, Long.valueOf(this.f4373a.a()));
            return;
        }
        long a7 = this.f4373a.a();
        long longValue = this.f4375c.remove(str).longValue();
        StringBuilder sb = new StringBuilder(str2.length() + 20);
        sb.append(str2);
        sb.append(a7 - longValue);
        d(str, sb.toString());
    }
}
