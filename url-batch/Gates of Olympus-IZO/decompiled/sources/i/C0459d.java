package i;

import java.util.Iterator;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459d extends AbstractC0460e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0458c f5090d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5091e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0461f f5092f;

    public C0459d(C0461f c0461f) {
        this.f5092f = c0461f;
    }

    @Override // i.AbstractC0460e
    public final void a(C0458c c0458c) {
        C0458c c0458c2 = this.f5090d;
        if (c0458c == c0458c2) {
            C0458c c0458c3 = c0458c2.f5089g;
            this.f5090d = c0458c3;
            this.f5091e = c0458c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5091e) {
            return this.f5092f.f5093d != null;
        }
        C0458c c0458c = this.f5090d;
        return (c0458c == null || c0458c.f5088f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5091e) {
            this.f5091e = false;
            this.f5090d = this.f5092f.f5093d;
        } else {
            C0458c c0458c = this.f5090d;
            this.f5090d = c0458c != null ? c0458c.f5088f : null;
        }
        return this.f5090d;
    }
}
