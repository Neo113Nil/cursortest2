package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ei {

    /* renamed from: a, reason: collision with root package name */
    public final String f3761a;

    public ei(String code) {
        kotlin.jvm.internal.j.e(code, "code");
        this.f3761a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ei.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type com.startapp.sdk.eventtracer.Traceable");
        return kotlin.jvm.internal.j.a(this.f3761a, ((ei) obj).f3761a);
    }

    public final int hashCode() {
        return this.f3761a.hashCode();
    }
}
