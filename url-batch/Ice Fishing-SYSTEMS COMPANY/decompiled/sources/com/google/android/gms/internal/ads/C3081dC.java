package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3081dC extends CC {

    /* renamed from: u, reason: collision with root package name */
    public Object f29985u;

    /* renamed from: v, reason: collision with root package name */
    public int f29986v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29987w;

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f29988x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29989y;

    public C3081dC() {
        super(0);
        this.f29986v = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        PA.T(this.f29986v != 4);
        int i = this.f29986v;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            return true;
        }
        if (i4 != 2) {
            this.f29986v = 4;
            switch (this.f29987w) {
                case 0:
                    do {
                        Iterator it = this.f29988x;
                        if (!it.hasNext()) {
                            this.f29986v = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((InterfaceC2916aB) this.f29989y).b(next));
                default:
                    do {
                        Iterator it2 = this.f29988x;
                        if (!it2.hasNext()) {
                            this.f29986v = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((AbstractC2917aC) this.f29989y).contains(next));
            }
            this.f29985u = next;
            if (this.f29986v != 3) {
                this.f29986v = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.CC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f29986v = 2;
        Object obj = this.f29985u;
        this.f29985u = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3081dC(C4106wC c4106wC, AbstractC2917aC abstractC2917aC, AbstractC2917aC abstractC2917aC2) {
        this();
        this.f29987w = 1;
        this.f29989y = abstractC2917aC2;
        Objects.requireNonNull(c4106wC);
        this.f29988x = abstractC2917aC.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3081dC(Iterator it, InterfaceC2916aB interfaceC2916aB) {
        this();
        this.f29987w = 0;
        this.f29988x = it;
        this.f29989y = interfaceC2916aB;
    }
}
