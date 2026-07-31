package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44631a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44632b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f44633c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f44634d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final u3 f44635e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44636f;

    public m4(String id, String nominal, String description, String timeInterval, u3 segment, boolean z4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nominal, "nominal");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timeInterval, "timeInterval");
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.f44631a = id;
        this.f44632b = nominal;
        this.f44633c = description;
        this.f44634d = timeInterval;
        this.f44635e = segment;
        this.f44636f = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return Intrinsics.areEqual(this.f44631a, m4Var.f44631a) && Intrinsics.areEqual(this.f44632b, m4Var.f44632b) && Intrinsics.areEqual(this.f44633c, m4Var.f44633c) && Intrinsics.areEqual(this.f44634d, m4Var.f44634d) && this.f44635e == m4Var.f44635e && this.f44636f == m4Var.f44636f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44636f) + ((this.f44635e.hashCode() + j1.a(this.f44634d, j1.a(this.f44633c, j1.a(this.f44632b, this.f44631a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponUiModel(id=");
        sb.append((Object) ("CouponId(value=" + this.f44631a + ')'));
        sb.append(", nominal=");
        sb.append(this.f44632b);
        sb.append(", description=");
        sb.append(this.f44633c);
        sb.append(", timeInterval=");
        sb.append(this.f44634d);
        sb.append(", segment=");
        sb.append(this.f44635e);
        sb.append(", selected=");
        sb.append(this.f44636f);
        sb.append(')');
        return sb.toString();
    }
}
