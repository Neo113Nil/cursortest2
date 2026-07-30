package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105s0 {
    public final long a;
    public final long b;
    public final Rect c;
    public Bitmap d = null;
    public boolean e = false;
    public boolean f = false;

    public C0105s0(long j, long j2, Rect rect) {
        this.a = j;
        this.b = j2;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0105s0)) {
            return false;
        }
        C0105s0 c0105s0 = (C0105s0) obj;
        return this.a == c0105s0.a && this.b == c0105s0.b && Intrinsics.areEqual(this.c, c0105s0.c) && Intrinsics.areEqual(this.d, c0105s0.d) && this.e == c0105s0.e && this.f == c0105s0.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31;
        Rect rect = this.c;
        int hashCode2 = (hashCode + (rect == null ? 0 : rect.hashCode())) * 31;
        Bitmap bitmap = this.d;
        int hashCode3 = (hashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.f;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        return "SnapshotTextureStreamState(streamId=" + this.a + ", generation=" + this.b + ", rect=" + this.c + ", bitmap=" + this.d + ", nativeStarted=" + this.e + ", captureInFlight=" + this.f + ')';
    }
}
