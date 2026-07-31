package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vd {

    /* renamed from: a, reason: collision with root package name */
    public final int f468a;
    public final int b;
    public final int c;

    public vd(int i, int i2, int i3) {
        this.f468a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return this.f468a == vdVar.f468a && this.b == vdVar.b && this.c == vdVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + (Integer.hashCode(this.f468a) * 31)) * 31);
    }

    public final String toString() {
        return "ChunkProgress(begin=" + this.f468a + ", end=" + this.b + ", saved=" + this.c + ')';
    }
}
