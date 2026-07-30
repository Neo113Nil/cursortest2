package B1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class C implements u1.x {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f71n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f72u;

    public /* synthetic */ C(int i, Object obj) {
        this.f71n = i;
        this.f72u = obj;
    }

    @Override // u1.x
    public final void a() {
        switch (this.f71n) {
            case 2:
                ((AnimatedImageDrawable) this.f72u).stop();
                ((AnimatedImageDrawable) this.f72u).clearAnimationCallbacks();
                break;
        }
    }

    @Override // u1.x
    public final int c() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.f71n) {
            case 0:
                return N1.p.c((Bitmap) this.f72u);
            case 1:
                return ((byte[]) this.f72u).length;
            case 2:
                intrinsicWidth = ((AnimatedImageDrawable) this.f72u).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.f72u).getIntrinsicHeight();
                return N1.p.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    @Override // u1.x
    public final Class d() {
        switch (this.f71n) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f72u).getClass();
        }
    }

    @Override // u1.x
    public final Object get() {
        switch (this.f71n) {
            case 0:
                return (Bitmap) this.f72u;
            case 1:
                return (byte[]) this.f72u;
            case 2:
                return (AnimatedImageDrawable) this.f72u;
            default:
                return (File) this.f72u;
        }
    }

    public C(byte[] bArr) {
        this.f71n = 1;
        N1.g.c(bArr, "Argument must not be null");
        this.f72u = bArr;
    }

    public C(File file) {
        this.f71n = 3;
        N1.g.c(file, "Argument must not be null");
        this.f72u = file;
    }

    private final void b() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
