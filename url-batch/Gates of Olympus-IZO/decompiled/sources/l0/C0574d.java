package l0;

import U.k;
import android.view.KeyEvent;
import u0.C0992q;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574d extends k implements InterfaceC0573c {

    /* renamed from: q, reason: collision with root package name */
    public C0992q f5542q;

    @Override // l0.InterfaceC0573c
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // l0.InterfaceC0573c
    public final boolean r(KeyEvent keyEvent) {
        C0992q c0992q = this.f5542q;
        if (c0992q != null) {
            return ((Boolean) c0992q.j(new C0572b(keyEvent))).booleanValue();
        }
        return false;
    }
}
