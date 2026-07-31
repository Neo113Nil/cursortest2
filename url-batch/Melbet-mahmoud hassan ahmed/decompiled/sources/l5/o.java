package l5;

import java.util.HashMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final m5.a<Object> f18761a;

    public o(a5.a aVar) {
        this.f18761a = new m5.a<>(aVar, "flutter/system", m5.f.f19245a);
    }

    public void a() {
        z4.b.e("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f18761a.c(hashMap);
    }
}
