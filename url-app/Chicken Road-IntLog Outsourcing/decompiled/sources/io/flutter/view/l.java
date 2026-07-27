package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final View f10390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10391b;

    public l(View view, int i2) {
        this.f10390a = view;
        this.f10391b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f10391b == lVar.f10391b && this.f10390a.equals(lVar.f10390a);
    }

    public final int hashCode() {
        return ((this.f10390a.hashCode() + 31) * 31) + this.f10391b;
    }
}
