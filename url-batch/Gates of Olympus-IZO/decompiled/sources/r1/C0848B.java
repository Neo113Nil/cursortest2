package r1;

import I.InterfaceC0088c0;
import h.AbstractC0416e;
import java.util.Iterator;
import l.C0568m;
import l.F;
import l.G;
import q1.C0784h;

/* renamed from: r1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848B extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0857i f7207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7208g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7209h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f7210i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0848B(C0857i c0857i, Y1.c cVar, Y1.c cVar2, InterfaceC0088c0 interfaceC0088c0, int i3) {
        super(1);
        this.f7206e = i3;
        this.f7207f = c0857i;
        this.f7208g = cVar;
        this.f7209h = cVar2;
        this.f7210i = interfaceC0088c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:8:0x003e->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[LOOP:1: B:32:0x007e->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[LOOP:2: B:59:0x00e2->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[LOOP:3: B:82:0x0122->B:97:?, LOOP_END, SYNTHETIC] */
    @Override // Y1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        F f3;
        F f4;
        G g3;
        G g4;
        Y1.c cVar = this.f7208g;
        Y1.c cVar2 = this.f7209h;
        InterfaceC0088c0 interfaceC0088c0 = this.f7210i;
        Object obj2 = null;
        C0857i c0857i = this.f7207f;
        switch (this.f7206e) {
            case 0:
                C0568m c0568m = (C0568m) obj;
                q1.w wVar = ((C0784h) c0568m.c()).f6895e;
                Z1.i.d(wVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                C0856h c0856h = (C0856h) wVar;
                if (((Boolean) c0857i.f7223c.getValue()).booleanValue() || AbstractC0416e.i(interfaceC0088c0)) {
                    int i3 = q1.w.f6961l;
                    Iterator it = g2.i.Q(c0856h).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            q1.w wVar2 = (q1.w) it.next();
                            if (wVar2 instanceof C0856h) {
                                Y1.c cVar3 = ((C0856h) wVar2).p;
                                if (cVar3 != null) {
                                    f3 = (F) cVar3.j(c0568m);
                                    if (f3 == null) {
                                        obj2 = f3;
                                    }
                                }
                            } else if (wVar2 instanceof C0854f) {
                                ((C0854f) wVar2).getClass();
                            }
                            f3 = null;
                            if (f3 == null) {
                            }
                        }
                    }
                    return obj2 == null ? (F) cVar.j(c0568m) : obj2;
                }
                int i4 = q1.w.f6961l;
                Iterator it2 = g2.i.Q(c0856h).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        q1.w wVar3 = (q1.w) it2.next();
                        if (wVar3 instanceof C0856h) {
                            Y1.c cVar4 = ((C0856h) wVar3).f7219n;
                            if (cVar4 != null) {
                                f4 = (F) cVar4.j(c0568m);
                                if (f4 == null) {
                                    obj2 = f4;
                                }
                            }
                        } else if (wVar3 instanceof C0854f) {
                            ((C0854f) wVar3).getClass();
                        }
                        f4 = null;
                        if (f4 == null) {
                        }
                    }
                }
                return obj2 == null ? (F) cVar2.j(c0568m) : obj2;
            default:
                C0568m c0568m2 = (C0568m) obj;
                q1.w wVar4 = ((C0784h) c0568m2.b()).f6895e;
                Z1.i.d(wVar4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                C0856h c0856h2 = (C0856h) wVar4;
                if (((Boolean) c0857i.f7223c.getValue()).booleanValue() || AbstractC0416e.i(interfaceC0088c0)) {
                    int i5 = q1.w.f6961l;
                    Iterator it3 = g2.i.Q(c0856h2).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            q1.w wVar5 = (q1.w) it3.next();
                            if (wVar5 instanceof C0856h) {
                                Y1.c cVar5 = ((C0856h) wVar5).f7221q;
                                if (cVar5 != null) {
                                    g3 = (G) cVar5.j(c0568m2);
                                    if (g3 == null) {
                                        obj2 = g3;
                                    }
                                }
                            } else if (wVar5 instanceof C0854f) {
                                ((C0854f) wVar5).getClass();
                            }
                            g3 = null;
                            if (g3 == null) {
                            }
                        }
                    }
                    return obj2 == null ? (G) cVar.j(c0568m2) : obj2;
                }
                int i6 = q1.w.f6961l;
                Iterator it4 = g2.i.Q(c0856h2).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        q1.w wVar6 = (q1.w) it4.next();
                        if (wVar6 instanceof C0856h) {
                            Y1.c cVar6 = ((C0856h) wVar6).f7220o;
                            if (cVar6 != null) {
                                g4 = (G) cVar6.j(c0568m2);
                                if (g4 == null) {
                                    obj2 = g4;
                                }
                            }
                        } else if (wVar6 instanceof C0854f) {
                            ((C0854f) wVar6).getClass();
                        }
                        g4 = null;
                        if (g4 == null) {
                        }
                    }
                }
                return obj2 == null ? (G) cVar2.j(c0568m2) : obj2;
        }
    }
}
