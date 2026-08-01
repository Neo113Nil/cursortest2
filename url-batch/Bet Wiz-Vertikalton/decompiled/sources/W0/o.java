package W0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements k1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f893a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f894b;

    public /* synthetic */ o(int i, Object obj) {
        this.f893a = i;
        this.f894b = obj;
    }

    @Override // k1.d
    public final Iterator iterator() {
        switch (this.f893a) {
            case 0:
                return ((List) this.f894b).iterator();
            default:
                return new k1.c(this);
        }
    }
}
