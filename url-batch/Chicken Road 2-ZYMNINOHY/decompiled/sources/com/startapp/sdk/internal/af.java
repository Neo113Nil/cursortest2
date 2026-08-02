package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class af extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f6669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6670b;

    public af(e9 e9Var, String str) {
        this.f6669a = e9Var;
        this.f6670b = str;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof u9) {
            e9 e9Var = this.f6669a;
            d9 d9Var = ((u9) obj).f7686n0;
            if (e9Var == d9Var.f6789a) {
                String str = this.f6670b;
                return str == null || str.equals(d9Var.f6792d);
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
            if (si.a(this.f6669a, afVar.f6669a) && si.a((Object) this.f6670b, (Object) afVar.f6670b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f6669a, this.f6670b};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }
}
