package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k43 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7382a;

    /* renamed from: b, reason: collision with root package name */
    private final h43 f7383b;

    /* renamed from: c, reason: collision with root package name */
    private h43 f7384c;

    /* synthetic */ k43(String str, i43 i43Var) {
        h43 h43Var = new h43(null);
        this.f7383b = h43Var;
        this.f7384c = h43Var;
        Objects.requireNonNull(str);
        this.f7382a = str;
    }

    public final k43 a(Object obj) {
        h43 h43Var = new h43(null);
        this.f7384c.f6072b = h43Var;
        this.f7384c = h43Var;
        h43Var.f6071a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f7382a);
        sb.append('{');
        h43 h43Var = this.f7383b.f6072b;
        String str = "";
        while (h43Var != null) {
            Object obj = h43Var.f6071a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            h43Var = h43Var.f6072b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
