package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class je extends pe {

    /* renamed from: a, reason: collision with root package name */
    public final o8 f290a;
    public final String b;

    public je(o8 o8Var, String str) {
        this.f290a = o8Var;
        this.b = str;
    }

    @Override // com.startapp.sdk.internal.pe
    public final boolean a(Object obj) {
        if (obj instanceof e9) {
            o8 o8Var = this.f290a;
            n8 n8Var = ((e9) obj).n0;
            if (o8Var == n8Var.f348a) {
                String str = this.b;
                return str == null || str.equals(n8Var.d);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && je.class == obj.getClass()) {
            je jeVar = (je) obj;
            o8 o8Var = this.f290a;
            o8 o8Var2 = jeVar.f290a;
            WeakHashMap weakHashMap = zh.f528a;
            if (o8Var.equals(o8Var2) && zh.a((Object) this.b, (Object) jeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f290a, this.b};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
