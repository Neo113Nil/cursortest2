package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hb1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb1 b;

    public /* synthetic */ hb1(nb1 nb1Var, int i) {
        this.a = i;
        this.b = nb1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        nb1 nb1Var = this.b;
        switch (i) {
            case 0:
                return bx.a(Integer.valueOf(nb1Var.a(((oa1) obj).b)), Integer.valueOf(nb1Var.a(((oa1) obj2).b)));
            default:
                return bx.a(Integer.valueOf(nb1Var.a(((oa1) obj2).b)), Integer.valueOf(nb1Var.a(((oa1) obj).b)));
        }
    }
}
