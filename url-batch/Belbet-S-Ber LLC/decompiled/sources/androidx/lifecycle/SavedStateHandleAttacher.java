package androidx.lifecycle;

import android.os.Bundle;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f691a;

    public SavedStateHandleAttacher(i0 i0Var) {
        this.f691a = i0Var;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
        }
        rVar.f().f(this);
        i0 i0Var = this.f691a;
        if (i0Var.f716b) {
            return;
        }
        Bundle c5 = i0Var.f715a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = i0Var.f717c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c5 != null) {
            bundle.putAll(c5);
        }
        i0Var.f717c = bundle;
        i0Var.f716b = true;
    }
}
