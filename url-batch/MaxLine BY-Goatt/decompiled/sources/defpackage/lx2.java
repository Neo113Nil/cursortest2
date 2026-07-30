package defpackage;

import androidx.compose.material3.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lx2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ Object o;
    public /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx2(mx2 mx2Var, float f, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = mx2Var;
        this.p = f;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new lx2((mx2) obj2, this.p, o30Var, 0);
            case 1:
                return new lx2((mx2) obj2, this.p, o30Var, 1);
            default:
                lx2 lx2Var = new lx2((lz) obj2, o30Var);
                lx2Var.p = ((Number) obj).floatValue();
                return lx2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((lx2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((lx2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((lx2) create(Float.valueOf(((Number) obj).floatValue()), (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                mx2 mx2Var = (mx2) obj2;
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    jc jcVar = mx2Var.E;
                    if (jcVar != null) {
                        Float f = new Float(this.p);
                        md mdVar = mx2Var.C ? a.b : a.c;
                        this.n = 1;
                        obj = jc.c(jcVar, f, mdVar, null, this, 12);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                return Unit.a;
            case 1:
                mx2 mx2Var2 = (mx2) obj2;
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    jc jcVar2 = mx2Var2.D;
                    if (jcVar2 != null) {
                        Float f2 = new Float(this.p);
                        md mdVar2 = mx2Var2.C ? a.b : a.c;
                        this.n = 1;
                        obj = jc.c(jcVar2, f2, mdVar2, null, this, 12);
                        if (obj == b50Var2) {
                            return b50Var2;
                        }
                    }
                    return Unit.a;
                }
                if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                return Unit.a;
            default:
                lz lzVar = (lz) obj2;
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    float f3 = this.p;
                    Object g = lzVar.a.d.m.g(rh2.e);
                    Function2 function2 = (Function2) (g != null ? g : null);
                    if (function2 == null) {
                        throw q40.f("Required value was null.");
                    }
                    au1 au1Var = new au1((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    this.n = 1;
                    obj = function2.invoke(au1Var, this);
                    if (obj == b50Var3) {
                        return b50Var3;
                    }
                } else {
                    if (i4 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((au1) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx2(lz lzVar, o30 o30Var) {
        super(2, o30Var);
        this.m = 2;
        this.o = lzVar;
    }
}
