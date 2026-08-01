package X0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements m1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f989a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f990b;

    public /* synthetic */ q(int i, Object obj) {
        this.f989a = i;
        this.f990b = obj;
    }

    @Override // m1.d
    public final Iterator iterator() {
        switch (this.f989a) {
            case 0:
                return ((List) this.f990b).iterator();
            default:
                return new m1.c(this);
        }
    }
}
