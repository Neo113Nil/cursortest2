package androidx.lifecycle;

import android.os.Bundle;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f564a;

    public SavedStateHandleAttacher(i0 i0Var) {
        this.f564a = i0Var;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
        }
        rVar.f().f(this);
        i0 i0Var = this.f564a;
        if (i0Var.f585b) {
            return;
        }
        Bundle c = i0Var.f584a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = i0Var.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c != null) {
            bundle.putAll(c);
        }
        i0Var.c = bundle;
        i0Var.f585b = true;
    }
}
