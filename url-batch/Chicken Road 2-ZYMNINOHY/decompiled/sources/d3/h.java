package d3;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements v3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8330a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8331b;

    public /* synthetic */ h(int i4, Object obj) {
        this.f8330a = i4;
        this.f8331b = obj;
    }

    @Override // v3.j
    public final Iterator iterator() {
        switch (this.f8330a) {
            case 0:
                return new a((Object[]) this.f8331b);
            case 1:
                return ((List) this.f8331b).iterator();
            case 2:
                return new v3.i(this);
            default:
                return (Iterator) this.f8331b;
        }
    }
}
