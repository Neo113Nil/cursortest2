package w0;

import W.AbstractC0108a;
import W.C0115h;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class m extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f15859d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f15860e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15861a;

    /* renamed from: b, reason: collision with root package name */
    public final l f15862b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15863c;

    public m(l lVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f15862b = lVar;
        this.f15861a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: h -> 0x0040, TRY_LEAVE, TryCatch #0 {h -> 0x0040, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:11:0x0034, B:19:0x001f, B:22:0x002c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context) {
        boolean l4;
        try {
            int i4 = Build.VERSION.SDK_INT;
            if ((i4 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && (i4 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                l4 = AbstractC0108a.l("EGL_EXT_protected_content");
                if (l4) {
                    return 0;
                }
                return AbstractC0108a.l("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            l4 = false;
            if (l4) {
            }
        } catch (C0115h e4) {
            AbstractC0108a.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e4.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (m.class) {
            try {
                if (!f15860e) {
                    f15859d = a(context);
                    f15860e = true;
                }
                z = f15859d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f15862b) {
            try {
                if (!this.f15863c) {
                    l lVar = this.f15862b;
                    lVar.f15855b.getClass();
                    lVar.f15855b.sendEmptyMessage(2);
                    this.f15863c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
