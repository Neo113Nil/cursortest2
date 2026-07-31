package M1;

import g2.C0409e;
import g2.InterfaceC0410f;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s implements InterfaceC0410f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2800a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2801b;

    public /* synthetic */ s(int i3, Object obj) {
        this.f2800a = i3;
        this.f2801b = obj;
    }

    @Override // g2.InterfaceC0410f
    public final Iterator iterator() {
        switch (this.f2800a) {
            case 0:
                return ((Iterable) this.f2801b).iterator();
            case 1:
                return new C0409e(this);
            default:
                return (Iterator) this.f2801b;
        }
    }
}
