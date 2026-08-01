package W0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f956a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f957b;

    public /* synthetic */ n(int i, Object obj) {
        this.f956a = i;
        this.f957b = obj;
    }

    @Override // n1.d
    public final Iterator iterator() {
        switch (this.f956a) {
            case 0:
                return ((List) this.f957b).iterator();
            default:
                return new n1.c(this);
        }
    }
}
