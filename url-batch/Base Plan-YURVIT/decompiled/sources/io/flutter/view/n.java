package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f2628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2629b;

    public n(View view, int i2) {
        this.f2628a = view;
        this.f2629b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f2629b == nVar.f2629b && this.f2628a.equals(nVar.f2628a);
    }

    public final int hashCode() {
        return ((this.f2628a.hashCode() + 31) * 31) + this.f2629b;
    }
}
