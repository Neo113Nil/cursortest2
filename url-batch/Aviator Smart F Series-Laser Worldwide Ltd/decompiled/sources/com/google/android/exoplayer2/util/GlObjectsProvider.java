package com.google.android.exoplayer2.util;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;

@Deprecated
/* loaded from: classes3.dex */
public interface GlObjectsProvider {

    @Deprecated
    public static final GlObjectsProvider DEFAULT = new GlObjectsProvider() { // from class: com.google.android.exoplayer2.util.GlObjectsProvider.1
        @Override // com.google.android.exoplayer2.util.GlObjectsProvider
        public GlTextureInfo createBuffersForTexture(int i8, int i9, int i10) {
            return new GlTextureInfo(i8, GlUtil.createFboForTexture(i8), -1, i9, i10);
        }

        @Override // com.google.android.exoplayer2.util.GlObjectsProvider
        @RequiresApi(17)
        public EGLContext createEglContext(EGLDisplay eGLDisplay, int i8, int[] iArr) {
            return GlUtil.createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, i8, iArr);
        }

        @Override // com.google.android.exoplayer2.util.GlObjectsProvider
        @RequiresApi(17)
        public EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i8, boolean z7) {
            return GlUtil.createEglSurface(eGLDisplay, obj, i8, z7);
        }

        @Override // com.google.android.exoplayer2.util.GlObjectsProvider
        @RequiresApi(17)
        public EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) {
            return GlUtil.createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, iArr);
        }
    };

    GlTextureInfo createBuffersForTexture(int i8, int i9, int i10);

    @RequiresApi(17)
    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = 2, to = 3) int i8, int[] iArr);

    @RequiresApi(17)
    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i8, boolean z7);

    @RequiresApi(17)
    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr);
}
