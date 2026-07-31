package T0;

import a.AbstractC0219a;
import java.lang.ref.WeakReference;

/* renamed from: T0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184t extends AbstractC0219a {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2342e;

    public C0184t(u uVar) {
        this.f2342e = new WeakReference(uVar);
    }

    @Override // a.AbstractC0219a
    public final void N() {
        u uVar = (u) this.f2342e.get();
        if (uVar == null) {
            return;
        }
        u.e(uVar);
    }
}
