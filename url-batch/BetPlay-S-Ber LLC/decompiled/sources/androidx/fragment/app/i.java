package androidx.fragment.app;

import android.view.View;
import defpackage.mk;
import defpackage.o30;
import defpackage.o8;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class i extends mk {
    public final /* synthetic */ Fragment f;

    public i(Fragment fragment) {
        this.f = fragment;
    }

    @Override // defpackage.mk
    public final View m(int i) {
        Fragment fragment = this.f;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        o8.t(o30.f("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // defpackage.mk
    public final boolean n() {
        return this.f.mView != null;
    }
}
