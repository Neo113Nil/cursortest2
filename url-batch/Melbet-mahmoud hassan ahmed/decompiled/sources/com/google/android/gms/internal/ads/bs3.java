package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class bs3 implements Iterator<po3> {

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<ds3> f3516f;

    /* renamed from: g, reason: collision with root package name */
    private po3 f3517g;

    /* synthetic */ bs3(uo3 uo3Var, as3 as3Var) {
        po3 po3Var;
        if (uo3Var instanceof ds3) {
            ds3 ds3Var = (ds3) uo3Var;
            ArrayDeque<ds3> arrayDeque = new ArrayDeque<>(ds3Var.s());
            this.f3516f = arrayDeque;
            arrayDeque.push(ds3Var);
            po3Var = b(ds3Var.f4316k);
        } else {
            this.f3516f = null;
            po3Var = (po3) uo3Var;
        }
        this.f3517g = po3Var;
    }

    private final po3 b(uo3 uo3Var) {
        while (uo3Var instanceof ds3) {
            ds3 ds3Var = (ds3) uo3Var;
            this.f3516f.push(ds3Var);
            uo3Var = ds3Var.f4316k;
        }
        return (po3) uo3Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final po3 next() {
        po3 po3Var;
        po3 po3Var2 = this.f3517g;
        if (po3Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<ds3> arrayDeque = this.f3516f;
            po3Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            po3Var = b(this.f3516f.pop().f4317l);
        } while (po3Var.l());
        this.f3517g = po3Var;
        return po3Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3517g != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
