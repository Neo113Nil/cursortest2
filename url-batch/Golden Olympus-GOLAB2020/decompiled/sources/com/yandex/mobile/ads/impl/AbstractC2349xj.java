package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.w30;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.yandex.mobile.ads.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2349xj implements dw0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<dw0.c> f34584a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<dw0.c> f34585b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final ew0.a f34586c = new ew0.a();

    /* renamed from: d, reason: collision with root package name */
    private final w30.a f34587d = new w30.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f34588e;

    /* renamed from: f, reason: collision with root package name */
    private x42 f34589f;

    /* renamed from: g, reason: collision with root package name */
    private ei1 f34590g;

    protected void a() {
    }

    protected abstract void a(s62 s62Var);

    protected void b() {
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void c(dw0.c cVar) {
        this.f34588e.getClass();
        boolean isEmpty = this.f34585b.isEmpty();
        this.f34585b.add(cVar);
        if (isEmpty) {
            b();
        }
    }

    protected final boolean d() {
        return !this.f34585b.isEmpty();
    }

    protected abstract void e();

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(Handler handler, w30 w30Var) {
        this.f34587d.a(handler, w30Var);
    }

    protected final ew0.a b(int i4, dw0.b bVar) {
        return this.f34586c.a(i4, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(Handler handler, ew0 ew0Var) {
        this.f34586c.a(handler, ew0Var);
    }

    protected final ew0.a b(dw0.b bVar) {
        return this.f34586c.a(0, bVar);
    }

    protected final w30.a a(int i4, dw0.b bVar) {
        return this.f34587d.a(i4, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void b(dw0.c cVar) {
        boolean isEmpty = this.f34585b.isEmpty();
        this.f34585b.remove(cVar);
        if (isEmpty || !this.f34585b.isEmpty()) {
            return;
        }
        a();
    }

    protected final w30.a a(dw0.b bVar) {
        return this.f34587d.a(0, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(dw0.c cVar, s62 s62Var, ei1 ei1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f34588e;
        if (looper != null && looper != myLooper) {
            throw new IllegalArgumentException();
        }
        this.f34590g = ei1Var;
        x42 x42Var = this.f34589f;
        this.f34584a.add(cVar);
        if (this.f34588e == null) {
            this.f34588e = myLooper;
            this.f34585b.add(cVar);
            a(s62Var);
        } else if (x42Var != null) {
            c(cVar);
            cVar.a(this, x42Var);
        }
    }

    protected final ei1 c() {
        ei1 ei1Var = this.f34590g;
        if (ei1Var != null) {
            return ei1Var;
        }
        throw new IllegalStateException();
    }

    protected final void a(x42 x42Var) {
        this.f34589f = x42Var;
        ArrayList<dw0.c> arrayList = this.f34584a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            dw0.c cVar = arrayList.get(i4);
            i4++;
            cVar.a(this, x42Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(dw0.c cVar) {
        this.f34584a.remove(cVar);
        if (this.f34584a.isEmpty()) {
            this.f34588e = null;
            this.f34589f = null;
            this.f34590g = null;
            this.f34585b.clear();
            e();
            return;
        }
        b(cVar);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(w30 w30Var) {
        this.f34587d.e(w30Var);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(ew0 ew0Var) {
        this.f34586c.a(ew0Var);
    }
}
