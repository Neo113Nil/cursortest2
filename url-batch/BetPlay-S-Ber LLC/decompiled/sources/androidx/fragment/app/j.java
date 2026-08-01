package androidx.fragment.app;

import defpackage.i2;
import defpackage.j2;
import defpackage.rm;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j implements rm {
    public final /* synthetic */ Fragment f;

    public j(Fragment fragment) {
        this.f = fragment;
    }

    @Override // defpackage.rm
    public final i2 apply() {
        Fragment fragment = this.f;
        Object obj = fragment.mHost;
        return obj instanceof j2 ? ((j2) obj).i() : fragment.requireActivity().m;
    }
}
