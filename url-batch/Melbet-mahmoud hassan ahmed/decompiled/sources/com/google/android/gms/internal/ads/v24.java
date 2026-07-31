package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class v24 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13098a;

    /* renamed from: b, reason: collision with root package name */
    public final s54 f13099b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<u24> f13100c;

    public v24() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private v24(CopyOnWriteArrayList<u24> copyOnWriteArrayList, int i7, s54 s54Var) {
        this.f13100c = copyOnWriteArrayList;
        this.f13098a = i7;
        this.f13099b = s54Var;
    }

    public final v24 a(int i7, s54 s54Var) {
        return new v24(this.f13100c, i7, s54Var);
    }

    public final void b(Handler handler, w24 w24Var) {
        this.f13100c.add(new u24(handler, w24Var));
    }

    public final void c(w24 w24Var) {
        Iterator<u24> it = this.f13100c.iterator();
        while (it.hasNext()) {
            u24 next = it.next();
            if (next.f12609b == w24Var) {
                this.f13100c.remove(next);
            }
        }
    }
}
