package i;

import android.view.Window;
import n.InterfaceC0721l0;

/* renamed from: i.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532s implements InterfaceC0721l0, m.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0500B f5482d;

    public /* synthetic */ C0532s(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B) {
        this.f5482d = layoutInflaterFactory2C0500B;
    }

    @Override // m.y
    public void a(m.m mVar, boolean z7) {
        C0499A c0499a;
        m.m k7 = mVar.k();
        int i2 = 0;
        boolean z8 = k7 != mVar;
        if (z8) {
            mVar = k7;
        }
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5482d;
        C0499A[] c0499aArr = layoutInflaterFactory2C0500B.f5323T;
        int length = c0499aArr != null ? c0499aArr.length : 0;
        while (true) {
            if (i2 < length) {
                c0499a = c0499aArr[i2];
                if (c0499a != null && c0499a.f5294h == mVar) {
                    break;
                } else {
                    i2++;
                }
            } else {
                c0499a = null;
                break;
            }
        }
        if (c0499a != null) {
            if (!z8) {
                layoutInflaterFactory2C0500B.t(c0499a, z7);
            } else {
                layoutInflaterFactory2C0500B.r(c0499a.f5287a, c0499a, k7);
                layoutInflaterFactory2C0500B.t(c0499a, true);
            }
        }
    }

    @Override // m.y
    public boolean i(m.m mVar) {
        Window.Callback callback;
        if (mVar != mVar.k()) {
            return true;
        }
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5482d;
        if (!layoutInflaterFactory2C0500B.f5318N || (callback = layoutInflaterFactory2C0500B.f5347t.getCallback()) == null || layoutInflaterFactory2C0500B.f5328Y) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }
}
