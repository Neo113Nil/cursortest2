package com.baidu.platform.comapi.util;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes2.dex */
public class EglConfigUtils {
    public static boolean isSupport24DepthSize() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[100];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, 100, new int[100]);
            int[] iArr = new int[4];
            for (int i8 = 0; i8 < 100; i8++) {
                int[] iArr2 = new int[1];
                EGLConfig eGLConfig = eGLConfigArr[i8];
                if (eGLConfig == null) {
                    break;
                }
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfig, 12324, iArr2);
                iArr[0] = iArr2[0];
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i8], 12323, iArr2);
                iArr[1] = iArr2[0];
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i8], 12322, iArr2);
                iArr[2] = iArr2[0];
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i8], 12325, iArr2);
                int i9 = iArr2[0];
                iArr[3] = i9;
                int i10 = iArr[0];
                if ((i10 == 5 && iArr[1] == 6 && iArr[2] == 5 && i9 == 24) || (i10 == 8 && iArr[1] == 8 && iArr[2] == 8 && i9 == 24)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isSupportConfig(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        return egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, i8, 12323, i9, 12322, i10, 12321, i11, 12325, i12, 12326, i13, 12338, i14, 12337, i15, 12344}, new EGLConfig[100], 100, iArr) && iArr[0] > 0;
    }
}
