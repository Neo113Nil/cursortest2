package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uo3 {
    public static final uo3 c = new uo3();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ar0 a = new ar0(3);

    public final yo3 a(Class cls) {
        yo3 po3Var;
        Charset charset = sn3.a;
        if (cls == null) {
            ch2.l("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        yo3 yo3Var = (yo3) concurrentHashMap.get(cls);
        if (yo3Var != null) {
            return yo3Var;
        }
        ar0 ar0Var = this.a;
        ar0Var.getClass();
        gg3 gg3Var = ap3.a;
        in3.class.isAssignableFrom(cls);
        wo3 p = ((ot2) ar0Var.n).p(cls);
        if ((p.d & 2) == 2) {
            gg3 gg3Var2 = ap3.a;
            gg3 gg3Var3 = um3.a;
            po3Var = new po3(gg3Var2, p.a);
        } else {
            int i = ro3.a;
            int i2 = yn3.a;
            gg3 gg3Var4 = ap3.a;
            gg3 gg3Var5 = p.a() + (-1) != 1 ? um3.a : null;
            int i3 = ho3.a;
            po3Var = oo3.t(p, gg3Var4, gg3Var5);
        }
        yo3 yo3Var2 = (yo3) concurrentHashMap.putIfAbsent(cls, po3Var);
        return yo3Var2 != null ? yo3Var2 : po3Var;
    }
}
