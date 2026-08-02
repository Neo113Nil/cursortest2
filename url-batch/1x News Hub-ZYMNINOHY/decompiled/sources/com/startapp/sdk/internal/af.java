package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class af extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f3566a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3567b;

    public af(e9 e9Var, String str) {
        this.f3566a = e9Var;
        this.f3567b = str;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof u9) {
            e9 e9Var = this.f3566a;
            d9 d9Var = ((u9) obj).f4546n0;
            if (e9Var == d9Var.f3677a) {
                String str = this.f3567b;
                return str == null || str.equals(d9Var.f3680d);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af.class == obj.getClass()) {
            af afVar = (af) obj;
            if (si.a(this.f3566a, afVar.f3566a) && si.a((Object) this.f3567b, (Object) afVar.f3567b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f3566a, this.f3567b};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
