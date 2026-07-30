package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ML implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f26329n;

    /* renamed from: u, reason: collision with root package name */
    public PK f26330u;

    public ML(SK sk) {
        if (!(sk instanceof NL)) {
            this.f26329n = null;
            this.f26330u = (PK) sk;
            return;
        }
        NL nl = (NL) sk;
        ArrayDeque arrayDeque = new ArrayDeque(nl.f26526z);
        this.f26329n = arrayDeque;
        arrayDeque.push(nl);
        SK sk2 = nl.f26523w;
        while (sk2 instanceof NL) {
            NL nl2 = (NL) sk2;
            this.f26329n.push(nl2);
            sk2 = nl2.f26523w;
        }
        this.f26330u = (PK) sk2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PK next() {
        PK pk;
        PK pk2 = this.f26330u;
        if (pk2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f26329n;
            pk = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            SK sk = ((NL) arrayDeque.pop()).f26524x;
            while (sk instanceof NL) {
                NL nl = (NL) sk;
                arrayDeque.push(nl);
                sk = nl.f26523w;
            }
            pk = (PK) sk;
        } while (pk.f() == 0);
        this.f26330u = pk;
        return pk2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26330u != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
