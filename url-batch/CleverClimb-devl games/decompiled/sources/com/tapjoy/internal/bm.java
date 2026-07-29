package com.tapjoy.internal;

import java.io.Writer;

/* loaded from: classes2.dex */
public final class bm implements bl {

    /* renamed from: a, reason: collision with root package name */
    public final String f7853a;

    public bm(String str) {
        this.f7853a = str;
    }

    @Override // com.tapjoy.internal.bl
    public final void a(Writer writer) {
        writer.write(this.f7853a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm) {
            return this.f7853a.equals(((bm) obj).f7853a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7853a.hashCode();
    }

    public final String toString() {
        return this.f7853a;
    }
}
