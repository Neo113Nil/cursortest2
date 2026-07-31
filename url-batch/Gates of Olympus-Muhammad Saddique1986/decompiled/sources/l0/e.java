package l0;

import U.p;
import android.view.KeyEvent;
import e2.InterfaceC0424c;
import f2.k;

/* loaded from: classes.dex */
public final class e extends p implements d {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0424c f6581q;

    /* renamed from: r, reason: collision with root package name */
    public k f6582r;

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.c, f2.k] */
    @Override // l0.d
    public final boolean o(KeyEvent keyEvent) {
        ?? r02 = this.f6582r;
        if (r02 != 0) {
            return ((Boolean) r02.n(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // l0.d
    public final boolean t(KeyEvent keyEvent) {
        InterfaceC0424c interfaceC0424c = this.f6581q;
        if (interfaceC0424c != null) {
            return ((Boolean) interfaceC0424c.n(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
