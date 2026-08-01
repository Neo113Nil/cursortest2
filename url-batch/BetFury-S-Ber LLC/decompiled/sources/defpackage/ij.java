package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ij implements vc0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final ds c;

    public /* synthetic */ ij(Object obj, ds dsVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = dsVar;
    }

    @Override // defpackage.vc0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new hj(this);
            case 1:
                return new js(this);
            default:
                return new fj0(this);
        }
    }
}
