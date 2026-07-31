package E5;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f700b;

    public /* synthetic */ h(int i7, Object obj) {
        this.f699a = i7;
        this.f700b = obj;
    }

    @Override // E5.f
    public final Iterator iterator() {
        switch (this.f699a) {
            case 0:
                return (Iterator) this.f700b;
            default:
                return ((Iterable) this.f700b).iterator();
        }
    }
}
