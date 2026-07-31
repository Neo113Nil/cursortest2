package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class i44 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6535a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6536b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6537c;

    public i44(String str, boolean z6, boolean z7) {
        this.f6535a = str;
        this.f6536b = z6;
        this.f6537c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == i44.class) {
            i44 i44Var = (i44) obj;
            if (TextUtils.equals(this.f6535a, i44Var.f6535a) && this.f6536b == i44Var.f6536b && this.f6537c == i44Var.f6537c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6535a.hashCode() + 31) * 31) + (true != this.f6536b ? 1237 : 1231)) * 31) + (true == this.f6537c ? 1231 : 1237);
    }
}
