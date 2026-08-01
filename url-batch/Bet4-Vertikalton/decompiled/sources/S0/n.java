package S0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements j1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f792a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f793b;

    public /* synthetic */ n(int i, Object obj) {
        this.f792a = i;
        this.f793b = obj;
    }

    @Override // j1.d
    public final Iterator iterator() {
        switch (this.f792a) {
            case 0:
                return ((List) this.f793b).iterator();
            default:
                return new j1.c(this);
        }
    }
}
