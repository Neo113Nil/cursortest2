package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f2819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2820b;

    public m(View view, int i2) {
        this.f2819a = view;
        this.f2820b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2820b == mVar.f2820b && this.f2819a.equals(mVar.f2819a);
    }

    public final int hashCode() {
        return ((this.f2819a.hashCode() + 31) * 31) + this.f2820b;
    }
}
