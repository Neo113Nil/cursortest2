package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class vo {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20113a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20114b;

    /* JADX WARN: Multi-variable type inference failed */
    public vo() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ vo a(vo voVar, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = voVar.f20113a;
        }
        if ((i5 & 2) != 0) {
            i4 = voVar.f20114b;
        }
        return voVar.a(z4, i4);
    }

    public final int b() {
        return this.f20114b;
    }

    public final int c() {
        return this.f20114b;
    }

    public final boolean d() {
        return this.f20113a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.f20113a == voVar.f20113a && this.f20114b == voVar.f20114b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z4 = this.f20113a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        return (r02 * 31) + Integer.hashCode(this.f20114b);
    }

    @NotNull
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f20113a + ", flags=" + this.f20114b + ')';
    }

    public vo(boolean z4, int i4) {
        this.f20113a = z4;
        this.f20114b = i4;
    }

    @NotNull
    public final vo a(boolean z4, int i4) {
        return new vo(z4, i4);
    }

    public /* synthetic */ vo(boolean z4, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? 805306368 : i4);
    }

    public final boolean a() {
        return this.f20113a;
    }
}
