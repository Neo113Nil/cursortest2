package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class uv {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19969a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19970b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19971c;

    public uv(boolean z4, boolean z5, boolean z6) {
        this.f19969a = z4;
        this.f19970b = z5;
        this.f19971c = z6;
    }

    public static /* synthetic */ uv a(uv uvVar, boolean z4, boolean z5, boolean z6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = uvVar.f19969a;
        }
        if ((i4 & 2) != 0) {
            z5 = uvVar.f19970b;
        }
        if ((i4 & 4) != 0) {
            z6 = uvVar.f19971c;
        }
        return uvVar.a(z4, z5, z6);
    }

    public final boolean b() {
        return this.f19970b;
    }

    public final boolean c() {
        return this.f19971c;
    }

    public final boolean d() {
        return this.f19971c;
    }

    public final boolean e() {
        return this.f19969a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        return this.f19969a == uvVar.f19969a && this.f19970b == uvVar.f19970b && this.f19971c == uvVar.f19971c;
    }

    public final boolean f() {
        return this.f19970b;
    }

    @NotNull
    public final JSONObject g() {
        JSONObject put = new JSONObject().put(vg.f20043k, this.f19969a).put(vg.f20044l, this.f19970b).put(vg.f20045m, this.f19971c);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.f19969a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        ?? r22 = this.f19970b;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z5 = this.f19971c;
        return i6 + (z5 ? 1 : z5 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f19969a + ", isWindowVisible=" + this.f19970b + ", isShown=" + this.f19971c + ')';
    }

    @NotNull
    public final uv a(boolean z4, boolean z5, boolean z6) {
        return new uv(z4, z5, z6);
    }

    public final boolean a() {
        return this.f19969a;
    }
}
