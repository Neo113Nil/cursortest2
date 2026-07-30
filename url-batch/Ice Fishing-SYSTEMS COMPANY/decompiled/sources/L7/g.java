package L7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1806a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1807b;

    public /* synthetic */ g(int i, Object obj) {
        this.f1806a = i;
        this.f1807b = obj;
    }

    @Override // L7.h
    public final Iterator iterator() {
        switch (this.f1806a) {
            case 0:
                return new f(this);
            case 1:
                return (Iterator) this.f1807b;
            default:
                return ((Iterable) this.f1807b).iterator();
        }
    }
}
