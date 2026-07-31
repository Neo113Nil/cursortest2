package h2;

import a2.InterfaceC0184a;
import e2.AbstractC0381e;
import e2.C0380d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440b implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public int f5059d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f5060e;

    /* renamed from: f, reason: collision with root package name */
    public int f5061f;

    /* renamed from: g, reason: collision with root package name */
    public C0380d f5062g;

    /* renamed from: h, reason: collision with root package name */
    public int f5063h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0441c f5064i;

    public C0440b(C0441c c0441c) {
        this.f5064i = c0441c;
        int r3 = AbstractC0381e.r(c0441c.f5066b, 0, c0441c.f5065a.length());
        this.f5060e = r3;
        this.f5061f = r3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.e, Z1.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i3 = this.f5061f;
        if (i3 < 0) {
            this.f5059d = 0;
            this.f5062g = null;
            return;
        }
        C0441c c0441c = this.f5064i;
        int i4 = c0441c.f5067c;
        String str = c0441c.f5065a;
        if (i4 > 0) {
            int i5 = this.f5063h + 1;
            this.f5063h = i5;
        }
        if (i3 <= str.length()) {
            L1.j jVar = (L1.j) c0441c.f5068d.g(str, Integer.valueOf(this.f5061f));
            if (jVar == null) {
                this.f5062g = new C0380d(this.f5060e, AbstractC0447i.o0(str), 1);
                this.f5061f = -1;
            } else {
                int intValue = ((Number) jVar.f2708d).intValue();
                int intValue2 = ((Number) jVar.f2709e).intValue();
                this.f5062g = AbstractC0381e.Q(this.f5060e, intValue);
                int i6 = intValue + intValue2;
                this.f5060e = i6;
                this.f5061f = i6 + (intValue2 == 0 ? 1 : 0);
            }
            this.f5059d = 1;
        }
        this.f5062g = new C0380d(this.f5060e, AbstractC0447i.o0(str), 1);
        this.f5061f = -1;
        this.f5059d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5059d == -1) {
            a();
        }
        return this.f5059d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5059d == -1) {
            a();
        }
        if (this.f5059d == 0) {
            throw new NoSuchElementException();
        }
        C0380d c0380d = this.f5062g;
        Z1.i.d(c0380d, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f5062g = null;
        this.f5059d = -1;
        return c0380d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
