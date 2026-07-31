package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class cj {

    /* renamed from: a, reason: collision with root package name */
    public final String f3849a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3850b;

    public cj(String str, boolean z6) {
        this.f3849a = str;
        this.f3850b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == cj.class) {
            cj cjVar = (cj) obj;
            if (TextUtils.equals(this.f3849a, cjVar.f3849a) && this.f3850b == cjVar.f3850b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3849a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f3850b ? 1237 : 1231);
    }
}
