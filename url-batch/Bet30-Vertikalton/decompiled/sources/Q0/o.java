package Q0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f668a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f669b;

    public /* synthetic */ o(int i, Object obj) {
        this.f668a = i;
        this.f669b = obj;
    }

    @Override // d1.d
    public final Iterator iterator() {
        switch (this.f668a) {
            case 0:
                return ((List) this.f669b).iterator();
            default:
                return new d1.c(this);
        }
    }
}
