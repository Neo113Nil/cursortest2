package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements c {
    @Override // u.c
    public final float a(float f6, float f8, float f9) {
        float abs = Math.abs((f8 + f6) - f6);
        float f10 = (0.3f * f9) - (0.0f * abs);
        float f11 = f9 - f10;
        if ((abs <= f9) && f11 < abs) {
            f10 = f9 - abs;
        }
        return f6 - f10;
    }
}
