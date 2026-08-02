package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f9452a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9453b;

    public n(View view, int i3) {
        this.f9452a = view;
        this.f9453b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f9453b == nVar.f9453b && this.f9452a.equals(nVar.f9452a);
    }

    public final int hashCode() {
        return ((this.f9452a.hashCode() + 31) * 31) + this.f9453b;
    }
}
