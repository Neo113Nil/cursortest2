package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cd implements vc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vc0
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return (Iterator) obj;
            default:
                return new yx((String) obj);
        }
    }
}
