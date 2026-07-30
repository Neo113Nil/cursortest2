package io.flutter.view;

import android.view.View;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f632b;

    public n(View view, int i2) {
        this.f631a = view;
        this.f632b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f632b == nVar.f632b && this.f631a.equals(nVar.f631a);
    }

    public final int hashCode() {
        return ((this.f631a.hashCode() + 31) * 31) + this.f632b;
    }
}
