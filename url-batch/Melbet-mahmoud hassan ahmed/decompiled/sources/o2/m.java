package o2;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19747a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f19748b = {12344};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f19749c = {12445, 13120, 12344};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f19750d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f19751e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static void a() {
        int i7 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            r.c("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i7 = glGetError;
        }
        if (i7 != 0) {
            d("glError: " + GLU.gluErrorString(i7));
        }
    }

    public static boolean b(Context context) {
        String eglQueryString;
        int i7 = m0.f19752a;
        if (i7 < 24) {
            return false;
        }
        if (i7 >= 26 || !("samsung".equals(m0.f19754c) || "XT1650".equals(m0.f19755d))) {
            return (i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean c() {
        String eglQueryString;
        return m0.f19752a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    static void d(String str) {
        if (f19747a) {
            throw new a(str);
        }
        r.c("GlUtil", str);
    }
}
