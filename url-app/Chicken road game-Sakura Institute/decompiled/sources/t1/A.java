package t1;

import G.InterfaceC0191c0;
import java.util.Iterator;
import k.C0730F;
import k.C0731G;
import k.C0746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import s1.C1193i;

/* loaded from: classes.dex */
public final class A extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f10638e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f10639i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f10640j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f10641k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(i iVar, Function1 function1, Function1 function12, InterfaceC0191c0 interfaceC0191c0, int i2) {
        super(1);
        this.f10637d = i2;
        this.f10638e = iVar;
        this.f10639i = function1;
        this.f10640j = function12;
        this.f10641k = interfaceC0191c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:8:0x003e->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[LOOP:1: B:32:0x007e->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[LOOP:2: B:59:0x00e2->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[LOOP:3: B:82:0x0122->B:97:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C0730F c0730f;
        C0730F c0730f2;
        C0731G c0731g;
        C0731G c0731g2;
        Function1 function1 = this.f10639i;
        Function1 function12 = this.f10640j;
        InterfaceC0191c0 interfaceC0191c0 = this.f10641k;
        Object obj2 = null;
        i iVar = this.f10638e;
        switch (this.f10637d) {
            case 0:
                C0746l c0746l = (C0746l) obj;
                s1.v vVar = ((C1193i) c0746l.c()).f10510e;
                Intrinsics.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                h hVar = (h) vVar;
                if (((Boolean) iVar.f10655c.getValue()).booleanValue() || m3.z.c(interfaceC0191c0)) {
                    int i2 = s1.v.f10569n;
                    Iterator it = AbstractC0864b.t(hVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            s1.v vVar2 = (s1.v) it.next();
                            if (vVar2 instanceof h) {
                                Function1 function13 = ((h) vVar2).f10652r;
                                if (function13 != null) {
                                    c0730f = (C0730F) function13.invoke(c0746l);
                                    if (c0730f == null) {
                                        obj2 = c0730f;
                                    }
                                }
                            } else if (vVar2 instanceof f) {
                                ((f) vVar2).getClass();
                            }
                            c0730f = null;
                            if (c0730f == null) {
                            }
                        }
                    }
                    return obj2 == null ? (C0730F) function1.invoke(c0746l) : obj2;
                }
                int i4 = s1.v.f10569n;
                Iterator it2 = AbstractC0864b.t(hVar).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        s1.v vVar3 = (s1.v) it2.next();
                        if (vVar3 instanceof h) {
                            Function1 function14 = ((h) vVar3).f10650p;
                            if (function14 != null) {
                                c0730f2 = (C0730F) function14.invoke(c0746l);
                                if (c0730f2 == null) {
                                    obj2 = c0730f2;
                                }
                            }
                        } else if (vVar3 instanceof f) {
                            ((f) vVar3).getClass();
                        }
                        c0730f2 = null;
                        if (c0730f2 == null) {
                        }
                    }
                }
                return obj2 == null ? (C0730F) function12.invoke(c0746l) : obj2;
            default:
                C0746l c0746l2 = (C0746l) obj;
                s1.v vVar4 = ((C1193i) c0746l2.b()).f10510e;
                Intrinsics.d(vVar4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                h hVar2 = (h) vVar4;
                if (((Boolean) iVar.f10655c.getValue()).booleanValue() || m3.z.c(interfaceC0191c0)) {
                    int i5 = s1.v.f10569n;
                    Iterator it3 = AbstractC0864b.t(hVar2).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            s1.v vVar5 = (s1.v) it3.next();
                            if (vVar5 instanceof h) {
                                Function1 function15 = ((h) vVar5).f10653s;
                                if (function15 != null) {
                                    c0731g = (C0731G) function15.invoke(c0746l2);
                                    if (c0731g == null) {
                                        obj2 = c0731g;
                                    }
                                }
                            } else if (vVar5 instanceof f) {
                                ((f) vVar5).getClass();
                            }
                            c0731g = null;
                            if (c0731g == null) {
                            }
                        }
                    }
                    return obj2 == null ? (C0731G) function1.invoke(c0746l2) : obj2;
                }
                int i6 = s1.v.f10569n;
                Iterator it4 = AbstractC0864b.t(hVar2).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        s1.v vVar6 = (s1.v) it4.next();
                        if (vVar6 instanceof h) {
                            Function1 function16 = ((h) vVar6).f10651q;
                            if (function16 != null) {
                                c0731g2 = (C0731G) function16.invoke(c0746l2);
                                if (c0731g2 == null) {
                                    obj2 = c0731g2;
                                }
                            }
                        } else if (vVar6 instanceof f) {
                            ((f) vVar6).getClass();
                        }
                        c0731g2 = null;
                        if (c0731g2 == null) {
                        }
                    }
                }
                return obj2 == null ? (C0731G) function12.invoke(c0746l2) : obj2;
        }
    }
}
