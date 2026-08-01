package V0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements m1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f914a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f915b;

    public /* synthetic */ n(int i, Object obj) {
        this.f914a = i;
        this.f915b = obj;
    }

    @Override // m1.d
    public final Iterator iterator() {
        switch (this.f914a) {
            case 0:
                return ((List) this.f915b).iterator();
            default:
                return new m1.c(this);
        }
    }
}
