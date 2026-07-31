package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16996a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final n8 f16997b;

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16998a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16998a = iArr;
        }
    }

    public l8(boolean z4, @Nullable n8 n8Var) {
        this.f16996a = z4;
        this.f16997b = n8Var;
    }

    public static /* synthetic */ l8 a(l8 l8Var, boolean z4, n8 n8Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = l8Var.f16996a;
        }
        if ((i4 & 2) != 0) {
            n8Var = l8Var.f16997b;
        }
        return l8Var.a(z4, n8Var);
    }

    @Nullable
    public final n8 b() {
        return this.f16997b;
    }

    @Nullable
    public final n8 c() {
        return this.f16997b;
    }

    public final boolean d() {
        return this.f16996a;
    }

    @Nullable
    public final String e() {
        n8 n8Var = this.f16997b;
        int i4 = n8Var == null ? -1 : a.f16998a[n8Var.ordinal()];
        if (i4 == 1) {
            return "Placement delivery is false";
        }
        if (i4 == 2) {
            return "In pacing mode";
        }
        if (i4 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return this.f16996a == l8Var.f16996a && this.f16997b == l8Var.f16997b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z4 = this.f16996a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        n8 n8Var = this.f16997b;
        return i4 + (n8Var == null ? 0 : n8Var.hashCode());
    }

    @NotNull
    public String toString() {
        return "CappingStatus(isCapped=" + this.f16996a + " reason=" + this.f16997b + ')';
    }

    public /* synthetic */ l8(boolean z4, n8 n8Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i4 & 2) != 0 ? null : n8Var);
    }

    @NotNull
    public final l8 a(boolean z4, @Nullable n8 n8Var) {
        return new l8(z4, n8Var);
    }

    public final boolean a() {
        return this.f16996a;
    }
}
