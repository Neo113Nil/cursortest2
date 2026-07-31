package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f4729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4730b;

    public n(View view, int i7) {
        this.f4729a = view;
        this.f4730b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f4730b == nVar.f4730b && this.f4729a.equals(nVar.f4729a);
    }

    public final int hashCode() {
        return ((this.f4729a.hashCode() + 31) * 31) + this.f4730b;
    }
}
