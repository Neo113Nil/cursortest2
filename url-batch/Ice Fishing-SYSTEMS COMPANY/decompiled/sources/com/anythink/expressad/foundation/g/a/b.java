package com.anythink.expressad.foundation.g.a;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b<K, V> extends a<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f19266b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f19267c = 16777216;

    /* renamed from: d, reason: collision with root package name */
    private final int f19268d;

    /* renamed from: f, reason: collision with root package name */
    private final List<V> f19270f = Collections.synchronizedList(new LinkedList());

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f19269e = new AtomicInteger();

    private b(int i) {
        this.f19268d = i;
        if (i > 16777216) {
            Log.w(com.anythink.expressad.foundation.g.g.a.b.f19579O, String.format("You set too large memory cache size (more than %1$d Mb)", 16));
        }
    }

    private int e() {
        return this.f19268d;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final boolean a(K k6, V v6) {
        boolean z8;
        int c4 = c();
        int i = this.f19268d;
        int i4 = this.f19269e.get();
        if (c4 < i) {
            while (i4 + c4 > i) {
                if (this.f19270f.remove(d())) {
                    i4 = this.f19269e.addAndGet(-c());
                }
            }
            this.f19270f.add(v6);
            this.f19269e.addAndGet(c4);
            z8 = true;
        } else {
            z8 = false;
        }
        super.a(k6, v6);
        return z8;
    }

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void b() {
        this.f19270f.clear();
        this.f19269e.set(0);
        super.b();
    }

    public abstract int c();

    public abstract V d();

    @Override // com.anythink.expressad.foundation.g.a.a, com.anythink.expressad.foundation.g.a.e
    public final void a(K k6) {
        V b9 = b(k6);
        if (b9 != null && this.f19270f.remove(b9)) {
            this.f19269e.addAndGet(-c());
        }
        super.a(k6);
    }
}
