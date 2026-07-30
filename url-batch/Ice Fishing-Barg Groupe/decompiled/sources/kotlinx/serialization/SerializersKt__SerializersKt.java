package kotlinx.serialization;

import defpackage.al;
import defpackage.cs0;
import defpackage.eu0;
import defpackage.fx1;
import defpackage.g42;
import defpackage.i42;
import defpackage.j21;
import defpackage.j42;
import defpackage.ju0;
import defpackage.k42;
import defpackage.kj0;
import defpackage.ko1;
import defpackage.lu0;
import defpackage.mu0;
import defpackage.op0;
import defpackage.u9;
import defpackage.uv1;
import defpackage.uy1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final /* synthetic */ class SerializersKt__SerializersKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer PxuCJdSBwIXG(k42 k42Var, ju0 ju0Var, boolean z) {
        KSerializer kSerializer;
        KSerializer PxuCJdSBwIXG;
        ko1 ko1Var;
        eu0 ngxnMNrpiKat = fx1.ngxnMNrpiKat(ju0Var);
        mu0 mu0Var = (mu0) ju0Var;
        boolean TSizfFm2Yiuu = mu0Var.TSizfFm2Yiuu();
        List PxuCJdSBwIXG2 = mu0Var.PxuCJdSBwIXG();
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(PxuCJdSBwIXG2, 10));
        Iterator it = PxuCJdSBwIXG2.iterator();
        if (it.hasNext()) {
            ((lu0) it.next()).getClass();
            u9.XL4ISE6Oc65B("Star projections in type arguments are not allowed, but had null");
            return null;
        }
        if (arrayList.isEmpty()) {
            if (kj0.e6tOsSdd2EFb(ngxnMNrpiKat).isInterface()) {
                k42.lS5Rgt96tfkO(k42Var, ngxnMNrpiKat);
            }
            op0 op0Var = j42.PxuCJdSBwIXG;
            if (TSizfFm2Yiuu) {
                kSerializer = j42.lS5Rgt96tfkO.r3s1LDPKFs1S(ngxnMNrpiKat);
            } else {
                kSerializer = j42.PxuCJdSBwIXG.r3s1LDPKFs1S(ngxnMNrpiKat);
                if (kSerializer == null) {
                    kSerializer = null;
                }
            }
        } else {
            ((g42) k42Var).getClass();
            op0 op0Var2 = j42.PxuCJdSBwIXG;
            Object QrzZRwfaDlRX = !TSizfFm2Yiuu ? j42.TSizfFm2Yiuu.QrzZRwfaDlRX(ngxnMNrpiKat, arrayList) : j42.Y1f8riQaR6yg.QrzZRwfaDlRX(ngxnMNrpiKat, arrayList);
            if (QrzZRwfaDlRX instanceof uv1) {
                QrzZRwfaDlRX = null;
            }
            kSerializer = (KSerializer) QrzZRwfaDlRX;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            PxuCJdSBwIXG = SerializersKt.lS5Rgt96tfkO(ngxnMNrpiKat);
            if (PxuCJdSBwIXG == null) {
                k42.lS5Rgt96tfkO(k42Var, ngxnMNrpiKat);
                if (kj0.e6tOsSdd2EFb(ngxnMNrpiKat).isInterface()) {
                    ko1Var = new ko1(ngxnMNrpiKat);
                    PxuCJdSBwIXG = ko1Var;
                }
                PxuCJdSBwIXG = null;
            }
            if (PxuCJdSBwIXG != null) {
                return TSizfFm2Yiuu ? BuiltinSerializersKt.PxuCJdSBwIXG(PxuCJdSBwIXG) : PxuCJdSBwIXG;
            }
        } else {
            ArrayList Y1f8riQaR6yg = SerializersKt.Y1f8riQaR6yg(k42Var, arrayList, z);
            if (Y1f8riQaR6yg != null) {
                PxuCJdSBwIXG = SerializersKt.PxuCJdSBwIXG(ngxnMNrpiKat, Y1f8riQaR6yg, new uy1(8, arrayList));
                if (PxuCJdSBwIXG == null) {
                    if (kj0.e6tOsSdd2EFb(ngxnMNrpiKat).isInterface()) {
                        ko1Var = new ko1(ngxnMNrpiKat);
                        PxuCJdSBwIXG = ko1Var;
                    }
                    PxuCJdSBwIXG = null;
                }
                if (PxuCJdSBwIXG != null) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer serializer(k42 k42Var, eu0 eu0Var, List<? extends KSerializer> list, boolean z) {
        KSerializer kSerializer;
        KSerializer PxuCJdSBwIXG;
        k42Var.getClass();
        eu0Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            kSerializer = SerializersKt.lS5Rgt96tfkO(eu0Var);
            if (kSerializer == null) {
                k42.lS5Rgt96tfkO(k42Var, eu0Var);
                kSerializer = null;
            }
            PxuCJdSBwIXG = kSerializer != null ? z ? BuiltinSerializersKt.PxuCJdSBwIXG(kSerializer) : kSerializer : null;
            if (PxuCJdSBwIXG != null) {
                return PxuCJdSBwIXG;
            }
            throw new i42(fx1.JTxCbbCwomzt(eu0Var));
        }
        try {
            KSerializer PxuCJdSBwIXG2 = SerializersKt.PxuCJdSBwIXG(eu0Var, list, new j21(14));
            if (PxuCJdSBwIXG2 != null) {
                kSerializer = PxuCJdSBwIXG2;
                if (kSerializer != null) {
                }
                if (PxuCJdSBwIXG != null) {
                }
            }
            kSerializer = null;
            if (kSerializer != null) {
            }
            if (PxuCJdSBwIXG != null) {
            }
        } catch (IndexOutOfBoundsException e) {
            throw new i42("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
        }
    }

    public static final KSerializer serializer(ju0 ju0Var) {
        ju0Var.getClass();
        return SerializersKt.serializer(cs0.jJwa0q7P5wHq, ju0Var);
    }

    public static final KSerializer serializer(k42 k42Var, ju0 ju0Var) {
        k42Var.getClass();
        ju0Var.getClass();
        KSerializer PxuCJdSBwIXG = PxuCJdSBwIXG(k42Var, ju0Var, true);
        if (PxuCJdSBwIXG != null) {
            return PxuCJdSBwIXG;
        }
        throw new i42(fx1.JTxCbbCwomzt(fx1.ngxnMNrpiKat(ju0Var)));
    }

    public static final <T> KSerializer serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T> KSerializer serializer(k42 k42Var) {
        k42Var.getClass();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final KSerializer serializer(eu0 eu0Var, List<? extends KSerializer> list, boolean z) {
        eu0Var.getClass();
        list.getClass();
        return SerializersKt.serializer(cs0.jJwa0q7P5wHq, eu0Var, list, z);
    }

    public static final <T> KSerializer serializer(eu0 eu0Var) {
        eu0Var.getClass();
        KSerializer lS5Rgt96tfkO = SerializersKt.lS5Rgt96tfkO(eu0Var);
        if (lS5Rgt96tfkO != null) {
            return lS5Rgt96tfkO;
        }
        throw new i42(fx1.JTxCbbCwomzt(eu0Var));
    }
}
