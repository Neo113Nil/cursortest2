package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ow {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30212a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30213b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30214c;

    public ow(int i4, int i5, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30212a = text;
        this.f30213b = i4;
        this.f30214c = i5;
    }

    public final int a() {
        return this.f30213b;
    }

    public final int b() {
        return this.f30214c;
    }

    @NotNull
    public final String c() {
        return this.f30212a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow)) {
            return false;
        }
        ow owVar = (ow) obj;
        return Intrinsics.areEqual(this.f30212a, owVar.f30212a) && this.f30213b == owVar.f30213b && this.f30214c == owVar.f30214c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30214c) + sx1.a(this.f30213b, this.f30212a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelColoredText(text=" + this.f30212a + ", color=" + this.f30213b + ", style=" + this.f30214c + ")";
    }

    public /* synthetic */ ow(String str, int i4) {
        this(i4, R.style.DebugPanelText_Body2, str);
    }
}
