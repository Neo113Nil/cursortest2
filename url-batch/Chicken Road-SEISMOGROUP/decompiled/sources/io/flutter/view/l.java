package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final View f863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f864b;

    public l(View view, int i2) {
        this.f863a = view;
        this.f864b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f864b == lVar.f864b && this.f863a.equals(lVar.f863a);
    }

    public final int hashCode() {
        return ((this.f863a.hashCode() + 31) * 31) + this.f864b;
    }
}
