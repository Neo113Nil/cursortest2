package O0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f691a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f692b;

    public /* synthetic */ o(int i, Object obj) {
        this.f691a = i;
        this.f692b = obj;
    }

    @Override // d1.d
    public final Iterator iterator() {
        switch (this.f691a) {
            case 0:
                return ((List) this.f692b).iterator();
            default:
                return new d1.c(this);
        }
    }
}
