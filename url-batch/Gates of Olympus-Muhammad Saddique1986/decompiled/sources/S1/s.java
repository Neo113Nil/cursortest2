package S1;

import java.util.Iterator;
import m2.C0655e;
import m2.InterfaceC0656f;

/* loaded from: classes.dex */
public final class s implements InterfaceC0656f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4317a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4318b;

    public /* synthetic */ s(int i3, Object obj) {
        this.f4317a = i3;
        this.f4318b = obj;
    }

    @Override // m2.InterfaceC0656f
    public final Iterator iterator() {
        switch (this.f4317a) {
            case 0:
                return ((Iterable) this.f4318b).iterator();
            case 1:
                return new C0655e(this);
            default:
                return (Iterator) this.f4318b;
        }
    }
}
