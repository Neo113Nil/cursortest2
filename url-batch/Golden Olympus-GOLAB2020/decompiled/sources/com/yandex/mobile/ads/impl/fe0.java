package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class fe0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ge0 f25762a = hm1.c();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25763b = 0;

    public static void a() {
        int i4 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            ms0.b("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i4 = glGetError;
        }
        if (i4 != 0) {
            ms0.b("GlUtil", "glError: " + GLU.gluErrorString(i4));
        }
    }

    public static int b() {
        if (u82.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            ms0.b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a();
        int i4 = iArr[0];
        GLES20.glBindTexture(36197, i4);
        a();
        GLES20.glTexParameteri(36197, 10240, 9729);
        a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return i4;
    }

    public static boolean c() {
        String eglQueryString;
        return u82.f32873a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (new java.lang.String(r3, r6).equals(com.yandex.mobile.ads.impl.u82.f32876d) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        String eglQueryString;
        int i4 = u82.f32873a;
        if (i4 < 24) {
            return false;
        }
        if (i4 < 26) {
            f25762a.getClass();
            byte[] decode = Base64.decode("c2Ftc3VuZw==", 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            Charset charset = Charsets.UTF_8;
            if (!new String(decode, charset).equals(u82.f32875c)) {
                byte[] decode2 = Base64.decode("WFQxNjUw", 0);
                Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
            }
            return false;
        }
        return (i4 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
    }

    static void a(String str) {
        ms0.b("GlUtil", str);
    }
}
