package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0248n;
import i.AbstractActivityC0525l;
import k0.InterfaceC0592c;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0229u implements InterfaceC0592c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3818b;

    public /* synthetic */ C0229u(int i2, Object obj) {
        this.f3817a = i2;
        this.f3818b = obj;
    }

    @Override // k0.InterfaceC0592c
    public final Bundle a() {
        switch (this.f3817a) {
            case 0:
                AbstractActivityC0525l abstractActivityC0525l = (AbstractActivityC0525l) this.f3818b;
                abstractActivityC0525l.markFragmentsCreated();
                abstractActivityC0525l.mFragmentLifecycleRegistry.e(EnumC0248n.ON_STOP);
                return new Bundle();
            default:
                return ((Q) this.f3818b).V();
        }
    }
}
