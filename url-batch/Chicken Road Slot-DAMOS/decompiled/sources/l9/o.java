package l9;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n0.i0;
import n4.b0;
import n4.v;
import wd.c0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f5952e;

    public /* synthetic */ o(e eVar, int i3) {
        this.f5951d = i3;
        this.f5952e = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5951d) {
            case 0:
                v vVar = (v) obj;
                vVar.getClass();
                final int i3 = 0;
                final e eVar = this.f5952e;
                x0.d dVar = new x0.d(218068104, true, new vd.o() { // from class: l9.s
                    @Override // vd.o
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i10 = i3;
                        n4.h hVar = (n4.h) obj3;
                        i0 i0Var = (i0) obj4;
                        ((Integer) obj5).getClass();
                        ((u.i) obj2).getClass();
                        hVar.getClass();
                        switch (i10) {
                            case 0:
                                final e eVar2 = eVar;
                                boolean h10 = i0Var.h(eVar2);
                                Object L = i0Var.L();
                                n0.e eVar3 = n0.k.f6729a;
                                if (h10 || L == eVar3) {
                                    final int i11 = 1;
                                    L = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L);
                                }
                                Function0 function0 = (Function0) L;
                                boolean h11 = i0Var.h(eVar2);
                                Object L2 = i0Var.L();
                                if (h11 || L2 == eVar3) {
                                    final int i12 = 2;
                                    L2 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L2);
                                }
                                t9.b.a(function0, (Function0) L2, null, i0Var, 0);
                                break;
                            case 1:
                                final e eVar4 = eVar;
                                boolean h12 = i0Var.h(eVar4);
                                Object L3 = i0Var.L();
                                n0.e eVar5 = n0.k.f6729a;
                                if (h12 || L3 == eVar5) {
                                    final int i13 = 3;
                                    L3 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L3);
                                }
                                Function0 function02 = (Function0) L3;
                                boolean h13 = i0Var.h(eVar4);
                                Object L4 = i0Var.L();
                                if (h13 || L4 == eVar5) {
                                    final int i14 = 4;
                                    L4 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L4);
                                }
                                Function0 function03 = (Function0) L4;
                                boolean h14 = i0Var.h(eVar4);
                                Object L5 = i0Var.L();
                                if (h14 || L5 == eVar5) {
                                    final int i15 = 5;
                                    L5 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L5);
                                }
                                c6.f.c(function02, function03, (Function0) L5, i0Var, 0);
                                break;
                            case 2:
                                final e eVar6 = eVar;
                                boolean h15 = i0Var.h(eVar6);
                                Object L6 = i0Var.L();
                                n0.e eVar7 = n0.k.f6729a;
                                if (h15 || L6 == eVar7) {
                                    final int i16 = 7;
                                    L6 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    eVar6.b();
                                                    break;
                                                case 1:
                                                    eVar6.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar6.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar6.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar6.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar6.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar6.b();
                                                    break;
                                                default:
                                                    eVar6.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L6);
                                }
                                Function0 function04 = (Function0) L6;
                                boolean h16 = i0Var.h(eVar6);
                                Object L7 = i0Var.L();
                                if (h16 || L7 == eVar7) {
                                    L7 = new o(eVar6, 1);
                                    i0Var.g0(L7);
                                }
                                i7.a.c(function04, (Function1) L7, null, i0Var, 0);
                                break;
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                wd.h a9 = c0.a(i.class);
                                Bundle a10 = hVar.f7069v.a();
                                if (a10 == null) {
                                    k0.f5575d.getClass();
                                    a10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                Map c10 = hVar.f7063e.c();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
                                for (Map.Entry entry : c10.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
                                }
                                final i iVar = (i) cf.c.G(a9).b(new y6.l(a10, linkedHashMap));
                                int i17 = iVar.f5945a;
                                final e eVar8 = eVar;
                                boolean h17 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L8 = i0Var.L();
                                n0.e eVar9 = n0.k.f6729a;
                                if (h17 || L8 == eVar9) {
                                    final int i18 = 0;
                                    L8 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i19 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i19) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L8);
                                }
                                Function0 function05 = (Function0) L8;
                                boolean h18 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L9 = i0Var.L();
                                if (h18 || L9 == eVar9) {
                                    final int i19 = 1;
                                    L9 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L9);
                                }
                                cf.c.c(i17, function05, (Function0) L9, i0Var, 0);
                                break;
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                final e eVar10 = eVar;
                                boolean h19 = i0Var.h(eVar10);
                                Object L10 = i0Var.L();
                                if (h19 || L10 == n0.k.f6729a) {
                                    final int i20 = 6;
                                    L10 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    eVar10.b();
                                                    break;
                                                case 1:
                                                    eVar10.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar10.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar10.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar10.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar10.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar10.b();
                                                    break;
                                                default:
                                                    eVar10.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L10);
                                }
                                g8.b.c((Function0) L10, null, i0Var, 0);
                                break;
                            default:
                                final e eVar11 = eVar;
                                boolean h20 = i0Var.h(eVar11);
                                Object L11 = i0Var.L();
                                if (h20 || L11 == n0.k.f6729a) {
                                    final int i21 = 0;
                                    L11 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i21) {
                                                case 0:
                                                    eVar11.b();
                                                    break;
                                                case 1:
                                                    eVar11.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar11.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar11.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar11.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar11.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar11.b();
                                                    break;
                                                default:
                                                    eVar11.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L11);
                                }
                                c6.f.b((Function0) L11, i0Var, 0);
                                break;
                        }
                        return Unit.f5554a;
                    }
                });
                k0 k0Var = k0.f5575d;
                k0Var.getClass();
                j0 j0Var = j0.f5574d;
                c6.f.p(vVar, c0.a(n.class), k0Var, j0Var, dVar);
                final int i10 = 1;
                c6.f.p(vVar, c0.a(j.class), k0Var, j0Var, new x0.d(-767867855, true, new vd.o() { // from class: l9.s
                    @Override // vd.o
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i102 = i10;
                        n4.h hVar = (n4.h) obj3;
                        i0 i0Var = (i0) obj4;
                        ((Integer) obj5).getClass();
                        ((u.i) obj2).getClass();
                        hVar.getClass();
                        switch (i102) {
                            case 0:
                                final e eVar2 = eVar;
                                boolean h10 = i0Var.h(eVar2);
                                Object L = i0Var.L();
                                n0.e eVar3 = n0.k.f6729a;
                                if (h10 || L == eVar3) {
                                    final int i11 = 1;
                                    L = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L);
                                }
                                Function0 function0 = (Function0) L;
                                boolean h11 = i0Var.h(eVar2);
                                Object L2 = i0Var.L();
                                if (h11 || L2 == eVar3) {
                                    final int i12 = 2;
                                    L2 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L2);
                                }
                                t9.b.a(function0, (Function0) L2, null, i0Var, 0);
                                break;
                            case 1:
                                final e eVar4 = eVar;
                                boolean h12 = i0Var.h(eVar4);
                                Object L3 = i0Var.L();
                                n0.e eVar5 = n0.k.f6729a;
                                if (h12 || L3 == eVar5) {
                                    final int i13 = 3;
                                    L3 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L3);
                                }
                                Function0 function02 = (Function0) L3;
                                boolean h13 = i0Var.h(eVar4);
                                Object L4 = i0Var.L();
                                if (h13 || L4 == eVar5) {
                                    final int i14 = 4;
                                    L4 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L4);
                                }
                                Function0 function03 = (Function0) L4;
                                boolean h14 = i0Var.h(eVar4);
                                Object L5 = i0Var.L();
                                if (h14 || L5 == eVar5) {
                                    final int i15 = 5;
                                    L5 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L5);
                                }
                                c6.f.c(function02, function03, (Function0) L5, i0Var, 0);
                                break;
                            case 2:
                                final e eVar6 = eVar;
                                boolean h15 = i0Var.h(eVar6);
                                Object L6 = i0Var.L();
                                n0.e eVar7 = n0.k.f6729a;
                                if (h15 || L6 == eVar7) {
                                    final int i16 = 7;
                                    L6 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    eVar6.b();
                                                    break;
                                                case 1:
                                                    eVar6.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar6.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar6.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar6.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar6.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar6.b();
                                                    break;
                                                default:
                                                    eVar6.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L6);
                                }
                                Function0 function04 = (Function0) L6;
                                boolean h16 = i0Var.h(eVar6);
                                Object L7 = i0Var.L();
                                if (h16 || L7 == eVar7) {
                                    L7 = new o(eVar6, 1);
                                    i0Var.g0(L7);
                                }
                                i7.a.c(function04, (Function1) L7, null, i0Var, 0);
                                break;
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                wd.h a9 = c0.a(i.class);
                                Bundle a10 = hVar.f7069v.a();
                                if (a10 == null) {
                                    k0.f5575d.getClass();
                                    a10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                Map c10 = hVar.f7063e.c();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
                                for (Map.Entry entry : c10.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
                                }
                                final i iVar = (i) cf.c.G(a9).b(new y6.l(a10, linkedHashMap));
                                int i17 = iVar.f5945a;
                                final e eVar8 = eVar;
                                boolean h17 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L8 = i0Var.L();
                                n0.e eVar9 = n0.k.f6729a;
                                if (h17 || L8 == eVar9) {
                                    final int i18 = 0;
                                    L8 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L8);
                                }
                                Function0 function05 = (Function0) L8;
                                boolean h18 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L9 = i0Var.L();
                                if (h18 || L9 == eVar9) {
                                    final int i19 = 1;
                                    L9 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L9);
                                }
                                cf.c.c(i17, function05, (Function0) L9, i0Var, 0);
                                break;
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                final e eVar10 = eVar;
                                boolean h19 = i0Var.h(eVar10);
                                Object L10 = i0Var.L();
                                if (h19 || L10 == n0.k.f6729a) {
                                    final int i20 = 6;
                                    L10 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    eVar10.b();
                                                    break;
                                                case 1:
                                                    eVar10.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar10.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar10.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar10.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar10.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar10.b();
                                                    break;
                                                default:
                                                    eVar10.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L10);
                                }
                                g8.b.c((Function0) L10, null, i0Var, 0);
                                break;
                            default:
                                final e eVar11 = eVar;
                                boolean h20 = i0Var.h(eVar11);
                                Object L11 = i0Var.L();
                                if (h20 || L11 == n0.k.f6729a) {
                                    final int i21 = 0;
                                    L11 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i21) {
                                                case 0:
                                                    eVar11.b();
                                                    break;
                                                case 1:
                                                    eVar11.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar11.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar11.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar11.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar11.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar11.b();
                                                    break;
                                                default:
                                                    eVar11.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L11);
                                }
                                c6.f.b((Function0) L11, i0Var, 0);
                                break;
                        }
                        return Unit.f5554a;
                    }
                }));
                final int i11 = 2;
                c6.f.p(vVar, c0.a(f.class), k0Var, j0Var, new x0.d(-1183194672, true, new vd.o() { // from class: l9.s
                    @Override // vd.o
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i102 = i11;
                        n4.h hVar = (n4.h) obj3;
                        i0 i0Var = (i0) obj4;
                        ((Integer) obj5).getClass();
                        ((u.i) obj2).getClass();
                        hVar.getClass();
                        switch (i102) {
                            case 0:
                                final e eVar2 = eVar;
                                boolean h10 = i0Var.h(eVar2);
                                Object L = i0Var.L();
                                n0.e eVar3 = n0.k.f6729a;
                                if (h10 || L == eVar3) {
                                    final int i112 = 1;
                                    L = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L);
                                }
                                Function0 function0 = (Function0) L;
                                boolean h11 = i0Var.h(eVar2);
                                Object L2 = i0Var.L();
                                if (h11 || L2 == eVar3) {
                                    final int i12 = 2;
                                    L2 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L2);
                                }
                                t9.b.a(function0, (Function0) L2, null, i0Var, 0);
                                break;
                            case 1:
                                final e eVar4 = eVar;
                                boolean h12 = i0Var.h(eVar4);
                                Object L3 = i0Var.L();
                                n0.e eVar5 = n0.k.f6729a;
                                if (h12 || L3 == eVar5) {
                                    final int i13 = 3;
                                    L3 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L3);
                                }
                                Function0 function02 = (Function0) L3;
                                boolean h13 = i0Var.h(eVar4);
                                Object L4 = i0Var.L();
                                if (h13 || L4 == eVar5) {
                                    final int i14 = 4;
                                    L4 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L4);
                                }
                                Function0 function03 = (Function0) L4;
                                boolean h14 = i0Var.h(eVar4);
                                Object L5 = i0Var.L();
                                if (h14 || L5 == eVar5) {
                                    final int i15 = 5;
                                    L5 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L5);
                                }
                                c6.f.c(function02, function03, (Function0) L5, i0Var, 0);
                                break;
                            case 2:
                                final e eVar6 = eVar;
                                boolean h15 = i0Var.h(eVar6);
                                Object L6 = i0Var.L();
                                n0.e eVar7 = n0.k.f6729a;
                                if (h15 || L6 == eVar7) {
                                    final int i16 = 7;
                                    L6 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    eVar6.b();
                                                    break;
                                                case 1:
                                                    eVar6.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar6.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar6.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar6.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar6.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar6.b();
                                                    break;
                                                default:
                                                    eVar6.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L6);
                                }
                                Function0 function04 = (Function0) L6;
                                boolean h16 = i0Var.h(eVar6);
                                Object L7 = i0Var.L();
                                if (h16 || L7 == eVar7) {
                                    L7 = new o(eVar6, 1);
                                    i0Var.g0(L7);
                                }
                                i7.a.c(function04, (Function1) L7, null, i0Var, 0);
                                break;
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                wd.h a9 = c0.a(i.class);
                                Bundle a10 = hVar.f7069v.a();
                                if (a10 == null) {
                                    k0.f5575d.getClass();
                                    a10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                Map c10 = hVar.f7063e.c();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
                                for (Map.Entry entry : c10.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
                                }
                                final i iVar = (i) cf.c.G(a9).b(new y6.l(a10, linkedHashMap));
                                int i17 = iVar.f5945a;
                                final e eVar8 = eVar;
                                boolean h17 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L8 = i0Var.L();
                                n0.e eVar9 = n0.k.f6729a;
                                if (h17 || L8 == eVar9) {
                                    final int i18 = 0;
                                    L8 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L8);
                                }
                                Function0 function05 = (Function0) L8;
                                boolean h18 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L9 = i0Var.L();
                                if (h18 || L9 == eVar9) {
                                    final int i19 = 1;
                                    L9 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L9);
                                }
                                cf.c.c(i17, function05, (Function0) L9, i0Var, 0);
                                break;
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                final e eVar10 = eVar;
                                boolean h19 = i0Var.h(eVar10);
                                Object L10 = i0Var.L();
                                if (h19 || L10 == n0.k.f6729a) {
                                    final int i20 = 6;
                                    L10 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    eVar10.b();
                                                    break;
                                                case 1:
                                                    eVar10.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar10.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar10.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar10.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar10.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar10.b();
                                                    break;
                                                default:
                                                    eVar10.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L10);
                                }
                                g8.b.c((Function0) L10, null, i0Var, 0);
                                break;
                            default:
                                final e eVar11 = eVar;
                                boolean h20 = i0Var.h(eVar11);
                                Object L11 = i0Var.L();
                                if (h20 || L11 == n0.k.f6729a) {
                                    final int i21 = 0;
                                    L11 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i21) {
                                                case 0:
                                                    eVar11.b();
                                                    break;
                                                case 1:
                                                    eVar11.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar11.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar11.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar11.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar11.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar11.b();
                                                    break;
                                                default:
                                                    eVar11.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L11);
                                }
                                c6.f.b((Function0) L11, i0Var, 0);
                                break;
                        }
                        return Unit.f5554a;
                    }
                }));
                final int i12 = 3;
                c6.f.p(vVar, c0.a(i.class), k0Var, j0Var, new x0.d(-1598521489, true, new vd.o() { // from class: l9.s
                    @Override // vd.o
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i102 = i12;
                        n4.h hVar = (n4.h) obj3;
                        i0 i0Var = (i0) obj4;
                        ((Integer) obj5).getClass();
                        ((u.i) obj2).getClass();
                        hVar.getClass();
                        switch (i102) {
                            case 0:
                                final e eVar2 = eVar;
                                boolean h10 = i0Var.h(eVar2);
                                Object L = i0Var.L();
                                n0.e eVar3 = n0.k.f6729a;
                                if (h10 || L == eVar3) {
                                    final int i112 = 1;
                                    L = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L);
                                }
                                Function0 function0 = (Function0) L;
                                boolean h11 = i0Var.h(eVar2);
                                Object L2 = i0Var.L();
                                if (h11 || L2 == eVar3) {
                                    final int i122 = 2;
                                    L2 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i122) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L2);
                                }
                                t9.b.a(function0, (Function0) L2, null, i0Var, 0);
                                break;
                            case 1:
                                final e eVar4 = eVar;
                                boolean h12 = i0Var.h(eVar4);
                                Object L3 = i0Var.L();
                                n0.e eVar5 = n0.k.f6729a;
                                if (h12 || L3 == eVar5) {
                                    final int i13 = 3;
                                    L3 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L3);
                                }
                                Function0 function02 = (Function0) L3;
                                boolean h13 = i0Var.h(eVar4);
                                Object L4 = i0Var.L();
                                if (h13 || L4 == eVar5) {
                                    final int i14 = 4;
                                    L4 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L4);
                                }
                                Function0 function03 = (Function0) L4;
                                boolean h14 = i0Var.h(eVar4);
                                Object L5 = i0Var.L();
                                if (h14 || L5 == eVar5) {
                                    final int i15 = 5;
                                    L5 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L5);
                                }
                                c6.f.c(function02, function03, (Function0) L5, i0Var, 0);
                                break;
                            case 2:
                                final e eVar6 = eVar;
                                boolean h15 = i0Var.h(eVar6);
                                Object L6 = i0Var.L();
                                n0.e eVar7 = n0.k.f6729a;
                                if (h15 || L6 == eVar7) {
                                    final int i16 = 7;
                                    L6 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    eVar6.b();
                                                    break;
                                                case 1:
                                                    eVar6.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar6.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar6.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar6.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar6.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar6.b();
                                                    break;
                                                default:
                                                    eVar6.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L6);
                                }
                                Function0 function04 = (Function0) L6;
                                boolean h16 = i0Var.h(eVar6);
                                Object L7 = i0Var.L();
                                if (h16 || L7 == eVar7) {
                                    L7 = new o(eVar6, 1);
                                    i0Var.g0(L7);
                                }
                                i7.a.c(function04, (Function1) L7, null, i0Var, 0);
                                break;
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                wd.h a9 = c0.a(i.class);
                                Bundle a10 = hVar.f7069v.a();
                                if (a10 == null) {
                                    k0.f5575d.getClass();
                                    a10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                Map c10 = hVar.f7063e.c();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
                                for (Map.Entry entry : c10.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
                                }
                                final i iVar = (i) cf.c.G(a9).b(new y6.l(a10, linkedHashMap));
                                int i17 = iVar.f5945a;
                                final e eVar8 = eVar;
                                boolean h17 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L8 = i0Var.L();
                                n0.e eVar9 = n0.k.f6729a;
                                if (h17 || L8 == eVar9) {
                                    final int i18 = 0;
                                    L8 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L8);
                                }
                                Function0 function05 = (Function0) L8;
                                boolean h18 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L9 = i0Var.L();
                                if (h18 || L9 == eVar9) {
                                    final int i19 = 1;
                                    L9 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L9);
                                }
                                cf.c.c(i17, function05, (Function0) L9, i0Var, 0);
                                break;
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                final e eVar10 = eVar;
                                boolean h19 = i0Var.h(eVar10);
                                Object L10 = i0Var.L();
                                if (h19 || L10 == n0.k.f6729a) {
                                    final int i20 = 6;
                                    L10 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    eVar10.b();
                                                    break;
                                                case 1:
                                                    eVar10.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar10.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar10.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar10.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar10.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar10.b();
                                                    break;
                                                default:
                                                    eVar10.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L10);
                                }
                                g8.b.c((Function0) L10, null, i0Var, 0);
                                break;
                            default:
                                final e eVar11 = eVar;
                                boolean h20 = i0Var.h(eVar11);
                                Object L11 = i0Var.L();
                                if (h20 || L11 == n0.k.f6729a) {
                                    final int i21 = 0;
                                    L11 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i21) {
                                                case 0:
                                                    eVar11.b();
                                                    break;
                                                case 1:
                                                    eVar11.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar11.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar11.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar11.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar11.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar11.b();
                                                    break;
                                                default:
                                                    eVar11.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L11);
                                }
                                c6.f.b((Function0) L11, i0Var, 0);
                                break;
                        }
                        return Unit.f5554a;
                    }
                }));
                final int i13 = 4;
                c6.f.p(vVar, c0.a(m.class), k0Var, j0Var, new x0.d(-2013848306, true, new vd.o() { // from class: l9.s
                    @Override // vd.o
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i102 = i13;
                        n4.h hVar = (n4.h) obj3;
                        i0 i0Var = (i0) obj4;
                        ((Integer) obj5).getClass();
                        ((u.i) obj2).getClass();
                        hVar.getClass();
                        switch (i102) {
                            case 0:
                                final e eVar2 = eVar;
                                boolean h10 = i0Var.h(eVar2);
                                Object L = i0Var.L();
                                n0.e eVar3 = n0.k.f6729a;
                                if (h10 || L == eVar3) {
                                    final int i112 = 1;
                                    L = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L);
                                }
                                Function0 function0 = (Function0) L;
                                boolean h11 = i0Var.h(eVar2);
                                Object L2 = i0Var.L();
                                if (h11 || L2 == eVar3) {
                                    final int i122 = 2;
                                    L2 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i122) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L2);
                                }
                                t9.b.a(function0, (Function0) L2, null, i0Var, 0);
                                break;
                            case 1:
                                final e eVar4 = eVar;
                                boolean h12 = i0Var.h(eVar4);
                                Object L3 = i0Var.L();
                                n0.e eVar5 = n0.k.f6729a;
                                if (h12 || L3 == eVar5) {
                                    final int i132 = 3;
                                    L3 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i132) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L3);
                                }
                                Function0 function02 = (Function0) L3;
                                boolean h13 = i0Var.h(eVar4);
                                Object L4 = i0Var.L();
                                if (h13 || L4 == eVar5) {
                                    final int i14 = 4;
                                    L4 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L4);
                                }
                                Function0 function03 = (Function0) L4;
                                boolean h14 = i0Var.h(eVar4);
                                Object L5 = i0Var.L();
                                if (h14 || L5 == eVar5) {
                                    final int i15 = 5;
                                    L5 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L5);
                                }
                                c6.f.c(function02, function03, (Function0) L5, i0Var, 0);
                                break;
                            case 2:
                                final e eVar6 = eVar;
                                boolean h15 = i0Var.h(eVar6);
                                Object L6 = i0Var.L();
                                n0.e eVar7 = n0.k.f6729a;
                                if (h15 || L6 == eVar7) {
                                    final int i16 = 7;
                                    L6 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    eVar6.b();
                                                    break;
                                                case 1:
                                                    eVar6.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar6.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar6.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar6.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar6.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar6.b();
                                                    break;
                                                default:
                                                    eVar6.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L6);
                                }
                                Function0 function04 = (Function0) L6;
                                boolean h16 = i0Var.h(eVar6);
                                Object L7 = i0Var.L();
                                if (h16 || L7 == eVar7) {
                                    L7 = new o(eVar6, 1);
                                    i0Var.g0(L7);
                                }
                                i7.a.c(function04, (Function1) L7, null, i0Var, 0);
                                break;
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                wd.h a9 = c0.a(i.class);
                                Bundle a10 = hVar.f7069v.a();
                                if (a10 == null) {
                                    k0.f5575d.getClass();
                                    a10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                Map c10 = hVar.f7063e.c();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
                                for (Map.Entry entry : c10.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
                                }
                                final i iVar = (i) cf.c.G(a9).b(new y6.l(a10, linkedHashMap));
                                int i17 = iVar.f5945a;
                                final e eVar8 = eVar;
                                boolean h17 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L8 = i0Var.L();
                                n0.e eVar9 = n0.k.f6729a;
                                if (h17 || L8 == eVar9) {
                                    final int i18 = 0;
                                    L8 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L8);
                                }
                                Function0 function05 = (Function0) L8;
                                boolean h18 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L9 = i0Var.L();
                                if (h18 || L9 == eVar9) {
                                    final int i19 = 1;
                                    L9 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L9);
                                }
                                cf.c.c(i17, function05, (Function0) L9, i0Var, 0);
                                break;
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                final e eVar10 = eVar;
                                boolean h19 = i0Var.h(eVar10);
                                Object L10 = i0Var.L();
                                if (h19 || L10 == n0.k.f6729a) {
                                    final int i20 = 6;
                                    L10 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    eVar10.b();
                                                    break;
                                                case 1:
                                                    eVar10.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar10.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar10.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar10.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar10.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar10.b();
                                                    break;
                                                default:
                                                    eVar10.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L10);
                                }
                                g8.b.c((Function0) L10, null, i0Var, 0);
                                break;
                            default:
                                final e eVar11 = eVar;
                                boolean h20 = i0Var.h(eVar11);
                                Object L11 = i0Var.L();
                                if (h20 || L11 == n0.k.f6729a) {
                                    final int i21 = 0;
                                    L11 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i21) {
                                                case 0:
                                                    eVar11.b();
                                                    break;
                                                case 1:
                                                    eVar11.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar11.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar11.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar11.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar11.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar11.b();
                                                    break;
                                                default:
                                                    eVar11.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L11);
                                }
                                c6.f.b((Function0) L11, i0Var, 0);
                                break;
                        }
                        return Unit.f5554a;
                    }
                }));
                final int i14 = 5;
                c6.f.p(vVar, c0.a(l.class), k0Var, j0Var, new x0.d(1865792173, true, new vd.o() { // from class: l9.s
                    @Override // vd.o
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i102 = i14;
                        n4.h hVar = (n4.h) obj3;
                        i0 i0Var = (i0) obj4;
                        ((Integer) obj5).getClass();
                        ((u.i) obj2).getClass();
                        hVar.getClass();
                        switch (i102) {
                            case 0:
                                final e eVar2 = eVar;
                                boolean h10 = i0Var.h(eVar2);
                                Object L = i0Var.L();
                                n0.e eVar3 = n0.k.f6729a;
                                if (h10 || L == eVar3) {
                                    final int i112 = 1;
                                    L = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L);
                                }
                                Function0 function0 = (Function0) L;
                                boolean h11 = i0Var.h(eVar2);
                                Object L2 = i0Var.L();
                                if (h11 || L2 == eVar3) {
                                    final int i122 = 2;
                                    L2 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i122) {
                                                case 0:
                                                    eVar2.b();
                                                    break;
                                                case 1:
                                                    eVar2.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar2.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar2.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar2.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar2.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar2.b();
                                                    break;
                                                default:
                                                    eVar2.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L2);
                                }
                                t9.b.a(function0, (Function0) L2, null, i0Var, 0);
                                break;
                            case 1:
                                final e eVar4 = eVar;
                                boolean h12 = i0Var.h(eVar4);
                                Object L3 = i0Var.L();
                                n0.e eVar5 = n0.k.f6729a;
                                if (h12 || L3 == eVar5) {
                                    final int i132 = 3;
                                    L3 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i132) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L3);
                                }
                                Function0 function02 = (Function0) L3;
                                boolean h13 = i0Var.h(eVar4);
                                Object L4 = i0Var.L();
                                if (h13 || L4 == eVar5) {
                                    final int i142 = 4;
                                    L4 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i142) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L4);
                                }
                                Function0 function03 = (Function0) L4;
                                boolean h14 = i0Var.h(eVar4);
                                Object L5 = i0Var.L();
                                if (h14 || L5 == eVar5) {
                                    final int i15 = 5;
                                    L5 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    eVar4.b();
                                                    break;
                                                case 1:
                                                    eVar4.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar4.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar4.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar4.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar4.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar4.b();
                                                    break;
                                                default:
                                                    eVar4.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L5);
                                }
                                c6.f.c(function02, function03, (Function0) L5, i0Var, 0);
                                break;
                            case 2:
                                final e eVar6 = eVar;
                                boolean h15 = i0Var.h(eVar6);
                                Object L6 = i0Var.L();
                                n0.e eVar7 = n0.k.f6729a;
                                if (h15 || L6 == eVar7) {
                                    final int i16 = 7;
                                    L6 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    eVar6.b();
                                                    break;
                                                case 1:
                                                    eVar6.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar6.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar6.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar6.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar6.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar6.b();
                                                    break;
                                                default:
                                                    eVar6.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L6);
                                }
                                Function0 function04 = (Function0) L6;
                                boolean h16 = i0Var.h(eVar6);
                                Object L7 = i0Var.L();
                                if (h16 || L7 == eVar7) {
                                    L7 = new o(eVar6, 1);
                                    i0Var.g0(L7);
                                }
                                i7.a.c(function04, (Function1) L7, null, i0Var, 0);
                                break;
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                wd.h a9 = c0.a(i.class);
                                Bundle a10 = hVar.f7069v.a();
                                if (a10 == null) {
                                    k0.f5575d.getClass();
                                    a10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                Map c10 = hVar.f7063e.c();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(c10.size()));
                                for (Map.Entry entry : c10.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((n4.g) entry.getValue()).f7058a);
                                }
                                final i iVar = (i) cf.c.G(a9).b(new y6.l(a10, linkedHashMap));
                                int i17 = iVar.f5945a;
                                final e eVar8 = eVar;
                                boolean h17 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L8 = i0Var.L();
                                n0.e eVar9 = n0.k.f6729a;
                                if (h17 || L8 == eVar9) {
                                    final int i18 = 0;
                                    L8 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i18) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L8);
                                }
                                Function0 function05 = (Function0) L8;
                                boolean h18 = i0Var.h(eVar8) | i0Var.h(iVar);
                                Object L9 = i0Var.L();
                                if (h18 || L9 == eVar9) {
                                    final int i19 = 1;
                                    L9 = new Function0() { // from class: l9.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    j jVar = j.INSTANCE;
                                                    final int i192 = 0;
                                                    final i iVar2 = iVar;
                                                    eVar8.a(jVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i192) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar2.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    f fVar = f.INSTANCE;
                                                    final int i20 = 1;
                                                    final i iVar3 = iVar;
                                                    eVar8.a(fVar, new Function1() { // from class: l9.r
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            b0 b0Var = (b0) obj6;
                                                            switch (i20) {
                                                                case 0:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                                default:
                                                                    b0Var.getClass();
                                                                    b0Var.g = new i(iVar3.f5945a);
                                                                    b0Var.f7035e = false;
                                                                    b0Var.a(-1);
                                                                    b0Var.f7035e = true;
                                                                    b0Var.f7036f = false;
                                                                    break;
                                                            }
                                                            return Unit.f5554a;
                                                        }
                                                    });
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L9);
                                }
                                cf.c.c(i17, function05, (Function0) L9, i0Var, 0);
                                break;
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                final e eVar10 = eVar;
                                boolean h19 = i0Var.h(eVar10);
                                Object L10 = i0Var.L();
                                if (h19 || L10 == n0.k.f6729a) {
                                    final int i20 = 6;
                                    L10 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    eVar10.b();
                                                    break;
                                                case 1:
                                                    eVar10.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar10.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar10.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar10.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar10.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar10.b();
                                                    break;
                                                default:
                                                    eVar10.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L10);
                                }
                                g8.b.c((Function0) L10, null, i0Var, 0);
                                break;
                            default:
                                final e eVar11 = eVar;
                                boolean h20 = i0Var.h(eVar11);
                                Object L11 = i0Var.L();
                                if (h20 || L11 == n0.k.f6729a) {
                                    final int i21 = 0;
                                    L11 = new Function0() { // from class: l9.q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i21) {
                                                case 0:
                                                    eVar11.b();
                                                    break;
                                                case 1:
                                                    eVar11.a(j.INSTANCE, new d(1));
                                                    break;
                                                case 2:
                                                    eVar11.a(k.INSTANCE, new d(3));
                                                    break;
                                                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                                    eVar11.a(f.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                                                    eVar11.a(m.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    eVar11.a(l.INSTANCE, new d(0));
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    eVar11.b();
                                                    break;
                                                default:
                                                    eVar11.a(j.INSTANCE, new d(4));
                                                    break;
                                            }
                                            return Unit.f5554a;
                                        }
                                    };
                                    i0Var.g0(L11);
                                }
                                c6.f.b((Function0) L11, i0Var, 0);
                                break;
                        }
                        return Unit.f5554a;
                    }
                }));
                c6.f.p(vVar, c0.a(k.class), k0Var, j0Var, b.f5937a);
                break;
            default:
                this.f5952e.a(new i(((Integer) obj).intValue()), new d(2));
                break;
        }
        return Unit.f5554a;
    }
}
