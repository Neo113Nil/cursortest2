package androidx.lifecycle;

import android.os.Bundle;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* renamed from: f, reason: collision with root package name */
    public final i0 f586f;

    public SavedStateHandleAttacher(i0 i0Var) {
        this.f586f = i0Var;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
        }
        rVar.e().f(this);
        i0 i0Var = this.f586f;
        if (i0Var.f611b) {
            return;
        }
        Bundle c4 = i0Var.f610a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = i0Var.f612c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c4 != null) {
            bundle.putAll(c4);
        }
        i0Var.f612c = bundle;
        i0Var.f611b = true;
    }
}
