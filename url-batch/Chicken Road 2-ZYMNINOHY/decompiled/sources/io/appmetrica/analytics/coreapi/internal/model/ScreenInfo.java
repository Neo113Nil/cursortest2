package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f9665a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9666b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9667c;

    /* renamed from: d, reason: collision with root package name */
    private final float f9668d;

    public ScreenInfo(int i4, int i5, int i6, float f4) {
        this.f9665a = i4;
        this.f9666b = i5;
        this.f9667c = i6;
        this.f9668d = f4;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i4, int i5, int i6, float f4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = screenInfo.f9665a;
        }
        if ((i7 & 2) != 0) {
            i5 = screenInfo.f9666b;
        }
        if ((i7 & 4) != 0) {
            i6 = screenInfo.f9667c;
        }
        if ((i7 & 8) != 0) {
            f4 = screenInfo.f9668d;
        }
        return screenInfo.copy(i4, i5, i6, f4);
    }

    public final int component1() {
        return this.f9665a;
    }

    public final int component2() {
        return this.f9666b;
    }

    public final int component3() {
        return this.f9667c;
    }

    public final float component4() {
        return this.f9668d;
    }

    public final ScreenInfo copy(int i4, int i5, int i6, float f4) {
        return new ScreenInfo(i4, i5, i6, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f9665a == screenInfo.f9665a && this.f9666b == screenInfo.f9666b && this.f9667c == screenInfo.f9667c && Float.valueOf(this.f9668d).equals(Float.valueOf(screenInfo.f9668d));
    }

    public final int getDpi() {
        return this.f9667c;
    }

    public final int getHeight() {
        return this.f9666b;
    }

    public final float getScaleFactor() {
        return this.f9668d;
    }

    public final int getWidth() {
        return this.f9665a;
    }

    public int hashCode() {
        return Float.hashCode(this.f9668d) + ((Integer.hashCode(this.f9667c) + ((Integer.hashCode(this.f9666b) + (Integer.hashCode(this.f9665a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f9665a + ", height=" + this.f9666b + ", dpi=" + this.f9667c + ", scaleFactor=" + this.f9668d + ')';
    }
}
