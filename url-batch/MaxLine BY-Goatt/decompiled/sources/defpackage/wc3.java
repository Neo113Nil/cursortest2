package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wc3 implements Comparator {
    public final /* synthetic */ zb3 a;
    public final /* synthetic */ js0 b;

    public wc3(zb3 zb3Var, js0 js0Var) {
        this.a = zb3Var;
        this.b = js0Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        kc3 kc3Var = (kc3) obj;
        kc3 kc3Var2 = (kc3) obj2;
        if (kc3Var instanceof qc3) {
            return !(kc3Var2 instanceof qc3) ? 1 : 0;
        }
        if (kc3Var2 instanceof qc3) {
            return -1;
        }
        zb3 zb3Var = this.a;
        return zb3Var == null ? kc3Var.zzc().compareTo(kc3Var2.zzc()) : (int) ak2.t(zb3Var.h(this.b, Arrays.asList(kc3Var, kc3Var2)).f().doubleValue());
    }
}
