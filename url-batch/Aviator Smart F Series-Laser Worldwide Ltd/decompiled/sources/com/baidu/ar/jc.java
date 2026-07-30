package com.baidu.ar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class jc implements i6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2616a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, ic> f2617b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue<kc> f2618c = new LinkedBlockingQueue<>();

    @Override // com.baidu.ar.i6
    public synchronized f8 a(String str) {
        ic icVar;
        icVar = this.f2617b.get(str);
        if (icVar == null) {
            icVar = new ic(str, this.f2618c, this.f2616a);
            this.f2617b.put(str, icVar);
        }
        return icVar;
    }

    public LinkedBlockingQueue<kc> b() {
        return this.f2618c;
    }

    public List<ic> c() {
        return new ArrayList(this.f2617b.values());
    }

    public void d() {
        this.f2616a = true;
    }

    public void a() {
        this.f2617b.clear();
        this.f2618c.clear();
    }
}
