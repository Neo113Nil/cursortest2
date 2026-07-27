package h;

import java.util.Iterator;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643d extends AbstractC0644e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0642c f6819d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6820e = true;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0645f f6821i;

    public C0643d(C0645f c0645f) {
        this.f6821i = c0645f;
    }

    @Override // h.AbstractC0644e
    public final void a(C0642c c0642c) {
        C0642c c0642c2 = this.f6819d;
        if (c0642c == c0642c2) {
            C0642c c0642c3 = c0642c2.f6818j;
            this.f6819d = c0642c3;
            this.f6820e = c0642c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6820e) {
            return this.f6821i.f6822d != null;
        }
        C0642c c0642c = this.f6819d;
        return (c0642c == null || c0642c.f6817i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6820e) {
            this.f6820e = false;
            this.f6819d = this.f6821i.f6822d;
        } else {
            C0642c c0642c = this.f6819d;
            this.f6819d = c0642c != null ? c0642c.f6817i : null;
        }
        return this.f6819d;
    }
}
