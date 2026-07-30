package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f5912a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5913b;

    public m(View view, int i2) {
        this.f5912a = view;
        this.f5913b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5913b == mVar.f5913b && this.f5912a.equals(mVar.f5912a);
    }

    public final int hashCode() {
        return ((this.f5912a.hashCode() + 31) * 31) + this.f5913b;
    }
}
