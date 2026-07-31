package n2;

import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k2.C0572d;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722b implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public int f7350d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f7351e;

    /* renamed from: f, reason: collision with root package name */
    public int f7352f;

    /* renamed from: g, reason: collision with root package name */
    public C0572d f7353g;

    /* renamed from: h, reason: collision with root package name */
    public int f7354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0723c f7355i;

    public C0722b(C0723c c0723c) {
        this.f7355i = c0723c;
        int y3 = O2.d.y(c0723c.f7357b, 0, c0723c.f7356a.length());
        this.f7351e = y3;
        this.f7352f = y3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [e2.e, f2.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i3 = this.f7352f;
        if (i3 < 0) {
            this.f7350d = 0;
            this.f7353g = null;
            return;
        }
        C0723c c0723c = this.f7355i;
        int i4 = c0723c.f7358c;
        String str = c0723c.f7356a;
        if (i4 > 0) {
            int i5 = this.f7354h + 1;
            this.f7354h = i5;
        }
        if (i3 <= str.length()) {
            R1.i iVar = (R1.i) c0723c.f7359d.h(str, Integer.valueOf(this.f7352f));
            if (iVar == null) {
                this.f7353g = new C0572d(this.f7351e, AbstractC0730j.F(str), 1);
                this.f7352f = -1;
            } else {
                int intValue = ((Number) iVar.f4150d).intValue();
                int intValue2 = ((Number) iVar.f4151e).intValue();
                this.f7353g = O2.d.g0(this.f7351e, intValue);
                int i6 = intValue + intValue2;
                this.f7351e = i6;
                this.f7352f = i6 + (intValue2 == 0 ? 1 : 0);
            }
            this.f7350d = 1;
        }
        this.f7353g = new C0572d(this.f7351e, AbstractC0730j.F(str), 1);
        this.f7352f = -1;
        this.f7350d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7350d == -1) {
            a();
        }
        return this.f7350d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7350d == -1) {
            a();
        }
        if (this.f7350d == 0) {
            throw new NoSuchElementException();
        }
        C0572d c0572d = this.f7353g;
        f2.j.d(c0572d, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f7353g = null;
        this.f7350d = -1;
        return c0572d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
