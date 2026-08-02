package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f5412a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5413b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5414c;

    /* renamed from: d, reason: collision with root package name */
    private final float f5415d;

    public ScreenInfo(int i3, int i4, int i5, float f) {
        this.f5412a = i3;
        this.f5413b = i4;
        this.f5414c = i5;
        this.f5415d = f;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i3, int i4, int i5, float f, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i3 = screenInfo.f5412a;
        }
        if ((i6 & 2) != 0) {
            i4 = screenInfo.f5413b;
        }
        if ((i6 & 4) != 0) {
            i5 = screenInfo.f5414c;
        }
        if ((i6 & 8) != 0) {
            f = screenInfo.f5415d;
        }
        return screenInfo.copy(i3, i4, i5, f);
    }

    public final int component1() {
        return this.f5412a;
    }

    public final int component2() {
        return this.f5413b;
    }

    public final int component3() {
        return this.f5414c;
    }

    public final float component4() {
        return this.f5415d;
    }

    public final ScreenInfo copy(int i3, int i4, int i5, float f) {
        return new ScreenInfo(i3, i4, i5, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f5412a == screenInfo.f5412a && this.f5413b == screenInfo.f5413b && this.f5414c == screenInfo.f5414c && Float.valueOf(this.f5415d).equals(Float.valueOf(screenInfo.f5415d));
    }

    public final int getDpi() {
        return this.f5414c;
    }

    public final int getHeight() {
        return this.f5413b;
    }

    public final float getScaleFactor() {
        return this.f5415d;
    }

    public final int getWidth() {
        return this.f5412a;
    }

    public int hashCode() {
        return Float.hashCode(this.f5415d) + ((Integer.hashCode(this.f5414c) + ((Integer.hashCode(this.f5413b) + (Integer.hashCode(this.f5412a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f5412a + ", height=" + this.f5413b + ", dpi=" + this.f5414c + ", scaleFactor=" + this.f5415d + ')';
    }
}
