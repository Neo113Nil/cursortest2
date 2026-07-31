package u1;

import I.InterfaceC0142c0;
import e2.InterfaceC0424c;
import java.util.Iterator;
import l.C0586l;
import l.G;
import l.H;
import n.z0;
import t1.C1028h;

/* renamed from: u1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140B extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f9576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9577g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9578h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9579i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1140B(i iVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0142c0 interfaceC0142c0, int i3) {
        super(1);
        this.f9575e = i3;
        this.f9576f = iVar;
        this.f9577g = interfaceC0424c;
        this.f9578h = interfaceC0424c2;
        this.f9579i = interfaceC0142c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:8:0x003e->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[LOOP:1: B:32:0x007e->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[LOOP:2: B:59:0x00e2->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[LOOP:3: B:82:0x0122->B:97:?, LOOP_END, SYNTHETIC] */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        G g3;
        G g4;
        H h3;
        H h4;
        InterfaceC0424c interfaceC0424c = this.f9577g;
        InterfaceC0424c interfaceC0424c2 = this.f9578h;
        InterfaceC0142c0 interfaceC0142c0 = this.f9579i;
        Object obj2 = null;
        i iVar = this.f9576f;
        switch (this.f9575e) {
            case 0:
                C0586l c0586l = (C0586l) obj;
                t1.u uVar = ((C1028h) c0586l.c()).f8874e;
                f2.j.d(uVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                h hVar = (h) uVar;
                if (((Boolean) iVar.f9593c.getValue()).booleanValue() || z0.e(interfaceC0142c0)) {
                    int i3 = t1.u.f8930l;
                    Iterator it = n.r.m(hVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            t1.u uVar2 = (t1.u) it.next();
                            if (uVar2 instanceof h) {
                                InterfaceC0424c interfaceC0424c3 = ((h) uVar2).f9590p;
                                if (interfaceC0424c3 != null) {
                                    g3 = (G) interfaceC0424c3.n(c0586l);
                                    if (g3 == null) {
                                        obj2 = g3;
                                    }
                                }
                            } else if (uVar2 instanceof f) {
                                ((f) uVar2).getClass();
                            }
                            g3 = null;
                            if (g3 == null) {
                            }
                        }
                    }
                    return obj2 == null ? (G) interfaceC0424c.n(c0586l) : obj2;
                }
                int i4 = t1.u.f8930l;
                Iterator it2 = n.r.m(hVar).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        t1.u uVar3 = (t1.u) it2.next();
                        if (uVar3 instanceof h) {
                            InterfaceC0424c interfaceC0424c4 = ((h) uVar3).f9588n;
                            if (interfaceC0424c4 != null) {
                                g4 = (G) interfaceC0424c4.n(c0586l);
                                if (g4 == null) {
                                    obj2 = g4;
                                }
                            }
                        } else if (uVar3 instanceof f) {
                            ((f) uVar3).getClass();
                        }
                        g4 = null;
                        if (g4 == null) {
                        }
                    }
                }
                return obj2 == null ? (G) interfaceC0424c2.n(c0586l) : obj2;
            default:
                C0586l c0586l2 = (C0586l) obj;
                t1.u uVar4 = ((C1028h) c0586l2.b()).f8874e;
                f2.j.d(uVar4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                h hVar2 = (h) uVar4;
                if (((Boolean) iVar.f9593c.getValue()).booleanValue() || z0.e(interfaceC0142c0)) {
                    int i5 = t1.u.f8930l;
                    Iterator it3 = n.r.m(hVar2).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            t1.u uVar5 = (t1.u) it3.next();
                            if (uVar5 instanceof h) {
                                InterfaceC0424c interfaceC0424c5 = ((h) uVar5).f9591q;
                                if (interfaceC0424c5 != null) {
                                    h3 = (H) interfaceC0424c5.n(c0586l2);
                                    if (h3 == null) {
                                        obj2 = h3;
                                    }
                                }
                            } else if (uVar5 instanceof f) {
                                ((f) uVar5).getClass();
                            }
                            h3 = null;
                            if (h3 == null) {
                            }
                        }
                    }
                    return obj2 == null ? (H) interfaceC0424c.n(c0586l2) : obj2;
                }
                int i6 = t1.u.f8930l;
                Iterator it4 = n.r.m(hVar2).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        t1.u uVar6 = (t1.u) it4.next();
                        if (uVar6 instanceof h) {
                            InterfaceC0424c interfaceC0424c6 = ((h) uVar6).f9589o;
                            if (interfaceC0424c6 != null) {
                                h4 = (H) interfaceC0424c6.n(c0586l2);
                                if (h4 == null) {
                                    obj2 = h4;
                                }
                            }
                        } else if (uVar6 instanceof f) {
                            ((f) uVar6).getClass();
                        }
                        h4 = null;
                        if (h4 == null) {
                        }
                    }
                }
                return obj2 == null ? (H) interfaceC0424c2.n(c0586l2) : obj2;
        }
    }
}
