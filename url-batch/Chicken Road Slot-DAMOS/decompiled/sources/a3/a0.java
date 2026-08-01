package a3;

import a2.m0;
import android.view.KeyEvent;
import android.view.MotionEvent;
import c2.b1;
import c2.g0;
import c2.i1;
import c2.x1;
import c2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f194e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f195i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 g0Var, wd.b0 b0Var) {
        super(0);
        this.f193d = 1;
        this.f195i = g0Var;
        this.f194e = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        switch (this.f193d) {
            case 0:
                ((wd.b0) this.f194e).f10141d = c2.k.h((b0) this.f195i, m0.f129a);
                break;
            case 1:
                b1 b1Var = ((g0) this.f195i).S;
                wd.b0 b0Var = (wd.b0) this.f194e;
                if ((((d1.k) b1Var.g).f3308r & 8) != 0) {
                    for (d1.k kVar = (z1) b1Var.f1495f; kVar != null; kVar = kVar.f3309s) {
                        if ((kVar.f3307i & 8) != 0) {
                            c2.j jVar = kVar;
                            ?? r42 = 0;
                            while (jVar != 0) {
                                if (jVar instanceof x1) {
                                    x1 x1Var = (x1) jVar;
                                    if (x1Var.n()) {
                                        j2.j jVar2 = new j2.j();
                                        b0Var.f10141d = jVar2;
                                        jVar2.f4978r = true;
                                    }
                                    if (x1Var.p()) {
                                        ((j2.j) b0Var.f10141d).f4977i = true;
                                    }
                                    x1Var.u((j2.u) b0Var.f10141d);
                                } else if ((jVar.f3307i & 8) != 0 && (jVar instanceof c2.j)) {
                                    d1.k kVar2 = jVar.D;
                                    int i3 = 0;
                                    jVar = jVar;
                                    r42 = r42;
                                    while (kVar2 != null) {
                                        if ((kVar2.f3307i & 8) != 0) {
                                            i3++;
                                            r42 = r42;
                                            if (i3 == 1) {
                                                jVar = kVar2;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new o0.e(new d1.k[16]);
                                                }
                                                if (jVar != 0) {
                                                    r42.b(jVar);
                                                    jVar = 0;
                                                }
                                                r42.b(kVar2);
                                            }
                                        }
                                        kVar2 = kVar2.f3310t;
                                        jVar = jVar;
                                        r42 = r42;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                jVar = c2.k.e(r42);
                            }
                        }
                    }
                }
                break;
            case 2:
                Function1 function1 = (Function1) this.f194e;
                k1.d0 d0Var = i1.Z;
                function1.invoke(d0Var);
                i1 i1Var = (i1) this.f195i;
                boolean a9 = Intrinsics.a(i1Var.Q, d0Var.f5310w);
                boolean z10 = i1Var.R;
                boolean z11 = d0Var.f5311x;
                boolean z12 = z10 != z11;
                if (!a9 || z12) {
                    i1Var.Q = d0Var.f5310w;
                    i1Var.R = z11;
                    if (i1Var.S && (z12 || (z11 && !a9))) {
                        i1Var.B.C();
                    }
                }
                i1Var.S = true;
                d0Var.C = d0Var.f5310w.a(d0Var.f5312y, d0Var.A, d0Var.f5313z);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f195i);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) this.f195i);
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                Function0 function0 = (Function0) this.f194e;
                if (function0 == null || (r0 = (j1.c) function0.invoke()) == null) {
                    i1 i1Var2 = (i1) this.f195i;
                    if (!i1Var2.D0().B) {
                        i1Var2 = null;
                    }
                    if (i1Var2 != null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((wd.b0) this.f194e).f10141d = ((i1.t) this.f195i).K();
                break;
            default:
                ((x1.b) this.f194e).d((d1.k) this.f195i);
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i3, Object obj, Object obj2) {
        super(0);
        this.f193d = i3;
        this.f194e = obj;
        this.f195i = obj2;
    }
}
