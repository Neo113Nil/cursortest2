package T0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements h1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f841a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f842b;

    public /* synthetic */ o(int i, Object obj) {
        this.f841a = i;
        this.f842b = obj;
    }

    @Override // h1.d
    public final Iterator iterator() {
        switch (this.f841a) {
            case 0:
                return ((List) this.f842b).iterator();
            default:
                return new h1.c(this);
        }
    }
}
