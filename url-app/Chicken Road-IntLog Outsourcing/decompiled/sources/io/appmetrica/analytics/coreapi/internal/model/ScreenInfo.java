package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f6176a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6177b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6178c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6179d;

    public ScreenInfo(int i2, int i3, int i6, float f3) {
        this.f6176a = i2;
        this.f6177b = i3;
        this.f6178c = i6;
        this.f6179d = f3;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i2, int i3, int i6, float f3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i2 = screenInfo.f6176a;
        }
        if ((i7 & 2) != 0) {
            i3 = screenInfo.f6177b;
        }
        if ((i7 & 4) != 0) {
            i6 = screenInfo.f6178c;
        }
        if ((i7 & 8) != 0) {
            f3 = screenInfo.f6179d;
        }
        return screenInfo.copy(i2, i3, i6, f3);
    }

    public final int component1() {
        return this.f6176a;
    }

    public final int component2() {
        return this.f6177b;
    }

    public final int component3() {
        return this.f6178c;
    }

    public final float component4() {
        return this.f6179d;
    }

    public final ScreenInfo copy(int i2, int i3, int i6, float f3) {
        return new ScreenInfo(i2, i3, i6, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f6176a == screenInfo.f6176a && this.f6177b == screenInfo.f6177b && this.f6178c == screenInfo.f6178c && Float.valueOf(this.f6179d).equals(Float.valueOf(screenInfo.f6179d));
    }

    public final int getDpi() {
        return this.f6178c;
    }

    public final int getHeight() {
        return this.f6177b;
    }

    public final float getScaleFactor() {
        return this.f6179d;
    }

    public final int getWidth() {
        return this.f6176a;
    }

    public int hashCode() {
        return Float.hashCode(this.f6179d) + ((Integer.hashCode(this.f6178c) + ((Integer.hashCode(this.f6177b) + (Integer.hashCode(this.f6176a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f6176a + ", height=" + this.f6177b + ", dpi=" + this.f6178c + ", scaleFactor=" + this.f6179d + ')';
    }
}
