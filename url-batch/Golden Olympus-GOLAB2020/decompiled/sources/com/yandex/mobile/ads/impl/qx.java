package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qx {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30923a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30924b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f30925c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30926d;

    public qx(@NotNull String text, int i4, @Nullable Integer num, int i5) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30923a = text;
        this.f30924b = i4;
        this.f30925c = num;
        this.f30926d = i5;
    }

    public final int a() {
        return this.f30924b;
    }

    @Nullable
    public final Integer b() {
        return this.f30925c;
    }

    public final int c() {
        return this.f30926d;
    }

    @NotNull
    public final String d() {
        return this.f30923a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx)) {
            return false;
        }
        qx qxVar = (qx) obj;
        return Intrinsics.areEqual(this.f30923a, qxVar.f30923a) && this.f30924b == qxVar.f30924b && Intrinsics.areEqual(this.f30925c, qxVar.f30925c) && this.f30926d == qxVar.f30926d;
    }

    public final int hashCode() {
        int a4 = sx1.a(this.f30924b, this.f30923a.hashCode() * 31, 31);
        Integer num = this.f30925c;
        return Integer.hashCode(this.f30926d) + ((a4 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f30923a + ", color=" + this.f30924b + ", icon=" + this.f30925c + ", style=" + this.f30926d + ")";
    }

    public /* synthetic */ qx(String str, int i4, Integer num, int i5, int i6) {
        this(str, (i6 & 2) != 0 ? R.attr.debug_panel_label_primary : i4, (i6 & 4) != 0 ? null : num, (i6 & 8) != 0 ? R.style.DebugPanelText_Body1 : i5);
    }
}
