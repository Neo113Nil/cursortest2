package D;

import kotlin.Unit;
import l.C0778d;
import p.C0928d;
import p.C0931g;
import p.C0937m;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* renamed from: D.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142j0 {

    /* renamed from: a, reason: collision with root package name */
    public float f1855a;

    /* renamed from: b, reason: collision with root package name */
    public float f1856b;

    /* renamed from: c, reason: collision with root package name */
    public float f1857c;

    /* renamed from: d, reason: collision with root package name */
    public float f1858d;

    /* renamed from: e, reason: collision with root package name */
    public final C0778d f1859e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0933i f1860f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0933i f1861g;

    public C0142j0(float f4, float f5, float f6, float f7) {
        this.f1855a = f4;
        this.f1856b = f5;
        this.f1857c = f6;
        this.f1858d = f7;
        this.f1859e = new C0778d(new M0.e(f4), l.w0.f7858c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC0933i interfaceC0933i, E2.c cVar) {
        C0136h0 c0136h0;
        int i2;
        C0142j0 c0142j0;
        C0778d c0778d = this.f1859e;
        if (cVar instanceof C0136h0) {
            c0136h0 = (C0136h0) cVar;
            int i4 = c0136h0.f1812n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0136h0.f1812n = i4 - Integer.MIN_VALUE;
                Object obj = c0136h0.f1810l;
                D2.a aVar = D2.a.f2163d;
                i2 = c0136h0.f1812n;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    float f4 = interfaceC0933i instanceof C0937m ? this.f1856b : interfaceC0933i instanceof C0931g ? this.f1857c : interfaceC0933i instanceof C0928d ? this.f1858d : this.f1855a;
                    this.f1861g = interfaceC0933i;
                    try {
                        if (!M0.e.a(((M0.e) c0778d.f7702e.getValue()).f3545d, f4)) {
                            InterfaceC0933i interfaceC0933i2 = this.f1860f;
                            c0136h0.f1808j = this;
                            c0136h0.f1809k = interfaceC0933i;
                            c0136h0.f1812n = 1;
                            if (E.b.a(c0778d, f4, interfaceC0933i2, interfaceC0933i, c0136h0) == aVar) {
                                return aVar;
                            }
                        }
                        c0142j0 = this;
                    } catch (Throwable th) {
                        th = th;
                        c0142j0 = this;
                        c0142j0.f1860f = interfaceC0933i;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0933i = c0136h0.f1809k;
                    c0142j0 = c0136h0.f1808j;
                    try {
                        AbstractC1343r.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        c0142j0.f1860f = interfaceC0933i;
                        throw th;
                    }
                }
                c0142j0.f1860f = interfaceC0933i;
                return Unit.f7487a;
            }
        }
        c0136h0 = new C0136h0(this, cVar);
        Object obj2 = c0136h0.f1810l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0136h0.f1812n;
        if (i2 != 0) {
        }
        c0142j0.f1860f = interfaceC0933i;
        return Unit.f7487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(E2.c cVar) {
        C0139i0 c0139i0;
        int i2;
        C0142j0 c0142j0;
        if (cVar instanceof C0139i0) {
            c0139i0 = (C0139i0) cVar;
            int i4 = c0139i0.f1833m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0139i0.f1833m = i4 - Integer.MIN_VALUE;
                Object obj = c0139i0.f1831k;
                D2.a aVar = D2.a.f2163d;
                i2 = c0139i0.f1833m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    InterfaceC0933i interfaceC0933i = this.f1861g;
                    float f4 = interfaceC0933i instanceof C0937m ? this.f1856b : interfaceC0933i instanceof C0931g ? this.f1857c : interfaceC0933i instanceof C0928d ? this.f1858d : this.f1855a;
                    C0778d c0778d = this.f1859e;
                    if (!M0.e.a(((M0.e) c0778d.f7702e.getValue()).f3545d, f4)) {
                        try {
                            M0.e eVar = new M0.e(f4);
                            c0139i0.f1830j = this;
                            c0139i0.f1833m = 1;
                            if (c0778d.e(c0139i0, eVar) == aVar) {
                                return aVar;
                            }
                            c0142j0 = this;
                        } catch (Throwable th) {
                            th = th;
                            c0142j0 = this;
                            c0142j0.f1860f = c0142j0.f1861g;
                            throw th;
                        }
                    }
                    return Unit.f7487a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0142j0 = c0139i0.f1830j;
                try {
                    AbstractC1343r.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    c0142j0.f1860f = c0142j0.f1861g;
                    throw th;
                }
                c0142j0.f1860f = c0142j0.f1861g;
                return Unit.f7487a;
            }
        }
        c0139i0 = new C0139i0(this, cVar);
        Object obj2 = c0139i0.f1831k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0139i0.f1833m;
        if (i2 != 0) {
        }
        c0142j0.f1860f = c0142j0.f1861g;
        return Unit.f7487a;
    }
}
