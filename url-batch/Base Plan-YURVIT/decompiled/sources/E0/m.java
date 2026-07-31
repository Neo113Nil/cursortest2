package E0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements U0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f217b;

    public /* synthetic */ m(int i2, Object obj) {
        this.f216a = i2;
        this.f217b = obj;
    }

    @Override // U0.d
    public final Iterator iterator() {
        switch (this.f216a) {
            case 0:
                return ((List) this.f217b).iterator();
            case 1:
                return (Iterator) this.f217b;
            default:
                return new U0.g(this);
        }
    }
}
