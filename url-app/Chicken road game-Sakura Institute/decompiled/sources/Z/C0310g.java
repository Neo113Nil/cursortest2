package Z;

import android.graphics.Bitmap;

/* renamed from: Z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310g {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f4523a;

    public C0310g(Bitmap bitmap) {
        this.f4523a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f4523a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            if (config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap.Config.HARDWARE) {
                return 4;
            }
        }
        return 0;
    }
}
