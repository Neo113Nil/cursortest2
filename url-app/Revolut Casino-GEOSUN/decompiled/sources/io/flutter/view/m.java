package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2630b;

    public m(View view, int i2) {
        this.f2629a = view;
        this.f2630b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2630b == mVar.f2630b && this.f2629a.equals(mVar.f2629a);
    }

    public final int hashCode() {
        return ((this.f2629a.hashCode() + 31) * 31) + this.f2630b;
    }
}
