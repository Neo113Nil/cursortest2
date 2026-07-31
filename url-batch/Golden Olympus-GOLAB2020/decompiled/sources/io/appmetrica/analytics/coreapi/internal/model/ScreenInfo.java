package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f36959a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36960b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36961c;

    /* renamed from: d, reason: collision with root package name */
    private final float f36962d;

    public ScreenInfo(int i4, int i5, int i6, float f4) {
        this.f36959a = i4;
        this.f36960b = i5;
        this.f36961c = i6;
        this.f36962d = f4;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i4, int i5, int i6, float f4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = screenInfo.f36959a;
        }
        if ((i7 & 2) != 0) {
            i5 = screenInfo.f36960b;
        }
        if ((i7 & 4) != 0) {
            i6 = screenInfo.f36961c;
        }
        if ((i7 & 8) != 0) {
            f4 = screenInfo.f36962d;
        }
        return screenInfo.copy(i4, i5, i6, f4);
    }

    public final int component1() {
        return this.f36959a;
    }

    public final int component2() {
        return this.f36960b;
    }

    public final int component3() {
        return this.f36961c;
    }

    public final float component4() {
        return this.f36962d;
    }

    @NotNull
    public final ScreenInfo copy(int i4, int i5, int i6, float f4) {
        return new ScreenInfo(i4, i5, i6, f4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f36959a == screenInfo.f36959a && this.f36960b == screenInfo.f36960b && this.f36961c == screenInfo.f36961c && Intrinsics.areEqual((Object) Float.valueOf(this.f36962d), (Object) Float.valueOf(screenInfo.f36962d));
    }

    public final int getDpi() {
        return this.f36961c;
    }

    public final int getHeight() {
        return this.f36960b;
    }

    public final float getScaleFactor() {
        return this.f36962d;
    }

    public final int getWidth() {
        return this.f36959a;
    }

    public int hashCode() {
        return Float.hashCode(this.f36962d) + ((Integer.hashCode(this.f36961c) + ((Integer.hashCode(this.f36960b) + (Integer.hashCode(this.f36959a) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenInfo(width=" + this.f36959a + ", height=" + this.f36960b + ", dpi=" + this.f36961c + ", scaleFactor=" + this.f36962d + ')';
    }
}
