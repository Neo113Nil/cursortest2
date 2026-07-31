package S;

import e2.InterfaceC0424c;
import java.util.Iterator;
import l.C0586l;
import l.N;
import t1.C1028h;

/* renamed from: S.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219c extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f4199f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0219c(int i3, InterfaceC0424c interfaceC0424c) {
        super(1);
        this.f4198e = i3;
        this.f4199f = interfaceC0424c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:4:0x0027->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        int i3;
        N n3;
        switch (this.f4198e) {
            case 0:
                n nVar = (n) obj;
                synchronized (p.f4241b) {
                    i3 = p.f4243d;
                    p.f4243d = i3 + 1;
                }
                return new h(i3, nVar, this.f4199f);
            case 1:
                long j3 = ((O0.j) obj).f3740a;
                return new O0.j(O2.d.d(((Number) this.f4199f.n(Integer.valueOf((int) (j3 >> 32)))).intValue(), (int) (4294967295L & j3)));
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                long j4 = ((O0.j) obj).f3740a;
                return new O0.j(O2.d.d(((Number) this.f4199f.n(Integer.valueOf((int) (j4 >> 32)))).intValue(), (int) (4294967295L & j4)));
            default:
                C0586l c0586l = (C0586l) obj;
                t1.u uVar = ((C1028h) c0586l.c()).f8874e;
                f2.j.d(uVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i4 = t1.u.f8930l;
                Iterator it = n.r.m((u1.h) uVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        t1.u uVar2 = (t1.u) it.next();
                        if (uVar2 instanceof u1.h) {
                            InterfaceC0424c interfaceC0424c = ((u1.h) uVar2).f9592r;
                            if (interfaceC0424c != null) {
                                n3 = (N) interfaceC0424c.n(c0586l);
                                if (n3 == null) {
                                }
                            }
                        } else if (uVar2 instanceof u1.f) {
                            ((u1.f) uVar2).getClass();
                        }
                        n3 = null;
                        if (n3 == null) {
                        }
                    } else {
                        n3 = null;
                    }
                }
                if (n3 != null) {
                    return n3;
                }
                InterfaceC0424c interfaceC0424c2 = this.f4199f;
                if (interfaceC0424c2 != null) {
                    return (N) interfaceC0424c2.n(c0586l);
                }
                return null;
        }
    }
}
