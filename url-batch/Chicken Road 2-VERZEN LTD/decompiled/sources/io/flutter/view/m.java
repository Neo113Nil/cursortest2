package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f810a;

    /* renamed from: b, reason: collision with root package name */
    public final int f811b;

    public m(View view, int i2) {
        this.f810a = view;
        this.f811b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f811b == mVar.f811b && this.f810a.equals(mVar.f810a);
    }

    public final int hashCode() {
        return ((this.f810a.hashCode() + 31) * 31) + this.f811b;
    }
}
