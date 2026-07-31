package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1515b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s.d f17292a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17293b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17294c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17295d;

    public C1515b(@NotNull s.d sdkState, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.f17292a = sdkState;
        this.f17293b = z4;
        this.f17294c = z5;
        this.f17295d = z6;
    }

    public static /* synthetic */ C1515b a(C1515b c1515b, s.d dVar, boolean z4, boolean z5, boolean z6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dVar = c1515b.f17292a;
        }
        if ((i4 & 2) != 0) {
            z4 = c1515b.f17293b;
        }
        if ((i4 & 4) != 0) {
            z5 = c1515b.f17294c;
        }
        if ((i4 & 8) != 0) {
            z6 = c1515b.f17295d;
        }
        return c1515b.a(dVar, z4, z5, z6);
    }

    public final boolean b() {
        return this.f17293b;
    }

    public final boolean c() {
        return this.f17294c;
    }

    public final boolean d() {
        return this.f17295d;
    }

    @NotNull
    public final s.d e() {
        return this.f17292a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1515b)) {
            return false;
        }
        C1515b c1515b = (C1515b) obj;
        return this.f17292a == c1515b.f17292a && this.f17293b == c1515b.f17293b && this.f17294c == c1515b.f17294c && this.f17295d == c1515b.f17295d;
    }

    public final boolean f() {
        return this.f17295d;
    }

    public final boolean g() {
        return this.f17294c;
    }

    public final boolean h() {
        return this.f17293b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f17292a.hashCode() * 31;
        boolean z4 = this.f17293b;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        boolean z5 = this.f17294c;
        int i6 = z5;
        if (z5 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z6 = this.f17295d;
        return i7 + (z6 ? 1 : z6 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f17292a + ", isRetryForMoreThan15Secs=" + this.f17293b + ", isDemandOnlyInitRequested=" + this.f17294c + ", isAdUnitInitRequested=" + this.f17295d + ')';
    }

    @NotNull
    public final C1515b a(@NotNull s.d sdkState, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new C1515b(sdkState, z4, z5, z6);
    }

    @NotNull
    public final s.d a() {
        return this.f17292a;
    }
}
