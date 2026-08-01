package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0080m;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1420b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1419a = i;
        this.f1420b = obj;
    }

    @Override // g0.c
    public final Bundle a() {
        switch (this.f1419a) {
            case 0:
                AbstractActivityC0159k abstractActivityC0159k = (AbstractActivityC0159k) this.f1420b;
                abstractActivityC0159k.markFragmentsCreated();
                abstractActivityC0159k.mFragmentLifecycleRegistry.e(EnumC0080m.ON_STOP);
                return new Bundle();
            default:
                return ((L) this.f1420b).R();
        }
    }
}
