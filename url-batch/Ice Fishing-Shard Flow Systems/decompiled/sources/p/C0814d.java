package p;

import java.util.Iterator;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814d extends AbstractC0815e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0813c f7144d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7145e = true;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0816f f7146i;

    public C0814d(C0816f c0816f) {
        this.f7146i = c0816f;
    }

    @Override // p.AbstractC0815e
    public final void a(C0813c c0813c) {
        C0813c c0813c2 = this.f7144d;
        if (c0813c == c0813c2) {
            C0813c c0813c3 = c0813c2.f7143l;
            this.f7144d = c0813c3;
            this.f7145e = c0813c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7145e) {
            return this.f7146i.f7147d != null;
        }
        C0813c c0813c = this.f7144d;
        return (c0813c == null || c0813c.f7142i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7145e) {
            this.f7145e = false;
            this.f7144d = this.f7146i.f7147d;
        } else {
            C0813c c0813c = this.f7144d;
            this.f7144d = c0813c != null ? c0813c.f7142i : null;
        }
        return this.f7144d;
    }
}
