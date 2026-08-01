package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0080m;
import g.AbstractActivityC0158k;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1419b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1418a = i;
        this.f1419b = obj;
    }

    @Override // g0.c
    public final Bundle a() {
        switch (this.f1418a) {
            case 0:
                AbstractActivityC0158k abstractActivityC0158k = (AbstractActivityC0158k) this.f1419b;
                abstractActivityC0158k.markFragmentsCreated();
                abstractActivityC0158k.mFragmentLifecycleRegistry.e(EnumC0080m.ON_STOP);
                return new Bundle();
            default:
                return ((L) this.f1419b).R();
        }
    }
}
