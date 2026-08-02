package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ei {

    /* renamed from: a, reason: collision with root package name */
    public final String f6876a;

    public ei(String code) {
        kotlin.jvm.internal.i.e(code, "code");
        this.f6876a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ei.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type com.startapp.sdk.eventtracer.Traceable");
        return kotlin.jvm.internal.i.a(this.f6876a, ((ei) obj).f6876a);
    }

    public final int hashCode() {
        return this.f6876a.hashCode();
    }
}
