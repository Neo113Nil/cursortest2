package androidx.fragment.app;

import defpackage.hk;
import defpackage.j8;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h extends hk {
    public final /* synthetic */ Fragment a;

    public h(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.hk
    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a();
        j8.l(fragment);
    }
}
