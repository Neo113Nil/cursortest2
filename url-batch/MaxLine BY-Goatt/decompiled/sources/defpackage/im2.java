package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class im2 implements om0 {
    public final tt1 a;
    public final q70 b;
    public final eo2 c;
    public final lf2 d = a.b;

    public im2(tt1 tt1Var, q70 q70Var, eo2 eo2Var) {
        this.a = tt1Var;
        this.b = q70Var;
        this.c = eo2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(im2 im2Var, ff2 ff2Var, float f, float f2, fm2 fm2Var, r30 r30Var) {
        hm2 hm2Var;
        int i;
        if (r30Var instanceof hm2) {
            hm2Var = (hm2) r30Var;
            int i2 = hm2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hm2Var.o = i2 - Integer.MIN_VALUE;
                hm2 hm2Var2 = hm2Var;
                Object obj = hm2Var2.m;
                b50 b50Var = b50.m;
                i = hm2Var2.o;
                if (i != 0) {
                    ca2.b(obj);
                    if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                        return tk3.i(f, f2);
                    }
                    hm2Var2.o = 1;
                    q70 q70Var = im2Var.b;
                    k03 k03Var = v33.a;
                    obj = (Math.abs(((od) new js0(q70Var.a).v(new od(0.0f), new od(f2))).a) >= Math.abs(f) ? new ar0(20, q70Var) : new at0(im2Var.c)).c(ff2Var, new Float(f), new Float(f2), fm2Var, hm2Var2);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return ((jd) obj).b;
            }
        }
        hm2Var = new hm2(im2Var, r30Var);
        hm2 hm2Var22 = hm2Var;
        Object obj2 = hm2Var22.m;
        b50 b50Var2 = b50.m;
        i = hm2Var22.o;
        if (i != 0) {
        }
        return ((jd) obj2).b;
    }

    @Override // defpackage.om0
    public Object a(yf2 yf2Var, float f, o30 o30Var) {
        return d(yf2Var, f, gs1.K, (r30) o30Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ff2 ff2Var, float f, Function1 function1, r30 r30Var) {
        em2 em2Var;
        int i;
        Function1 function12;
        if (r30Var instanceof em2) {
            em2Var = (em2) r30Var;
            int i2 = em2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = em2Var.n;
                b50 b50Var = b50.m;
                i = em2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    a80 a80Var = new a80(this, f, function1, ff2Var, null);
                    em2Var.m = function1;
                    em2Var.p = 1;
                    obj = z71.V(this.d, a80Var, em2Var);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = em2Var.m;
                    ca2.b(obj);
                }
                jd jdVar = (jd) obj;
                function12.invoke(new Float(0.0f));
                return jdVar;
            }
        }
        em2Var = new em2(this, r30Var);
        Object obj2 = em2Var.n;
        b50 b50Var2 = b50.m;
        i = em2Var.p;
        if (i != 0) {
        }
        jd jdVar2 = (jd) obj2;
        function12.invoke(new Float(0.0f));
        return jdVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ff2 ff2Var, float f, Function1 function1, r30 r30Var) {
        gm2 gm2Var;
        int i;
        if (r30Var instanceof gm2) {
            gm2Var = (gm2) r30Var;
            int i2 = gm2Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gm2Var.o = i2 - Integer.MIN_VALUE;
                Object obj = gm2Var.m;
                Object obj2 = b50.m;
                i = gm2Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    gm2Var.o = 1;
                    obj = c(ff2Var, f, function1, gm2Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                jd jdVar = (jd) obj;
                return new Float(jdVar.a.floatValue() != 0.0f ? ((Number) jdVar.b.a()).floatValue() : 0.0f);
            }
        }
        gm2Var = new gm2(this, r30Var);
        Object obj3 = gm2Var.m;
        Object obj22 = b50.m;
        i = gm2Var.o;
        if (i != 0) {
        }
        jd jdVar2 = (jd) obj3;
        return new Float(jdVar2.a.floatValue() != 0.0f ? ((Number) jdVar2.b.a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof im2) {
            im2 im2Var = (im2) obj;
            return im2Var.c.equals(this.c) && Intrinsics.b(im2Var.b, this.b) && im2Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
