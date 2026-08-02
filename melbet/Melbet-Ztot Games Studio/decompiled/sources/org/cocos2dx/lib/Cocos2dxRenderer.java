package org.cocos2dx.lib;

import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public class Cocos2dxRenderer implements GLSurfaceView.Renderer {
    private static final long FIXED_FPS = 16;
    private static final long NANOSECONDSPERMICROSECOND = 1000000;
    private static final long NANOSECONDSPERSECOND = 1000000000;
    private static long sAnimationInterval = 16666666;
    private long mEndTime = 0;
    private long mLastTickInNanoSeconds;
    private int mScreenHeight;
    private int mScreenWidth;
    private long mStartTime;

    private static native void nativeDeleteBackward();

    private static native String nativeGetContentText();

    private static native void nativeInit(int i, int i2);

    private static native void nativeInsertText(String str);

    private static native boolean nativeKeyDown(int i);

    private static native boolean nativeKeyUp(int i);

    private static native void nativeOnPause();

    private static native void nativeOnResume();

    private static native void nativeOnSurfaceChanged(int i, int i2);

    private static native void nativeRender();

    private static native void nativeTouchesBegin(int i, float f, float f2);

    private static native void nativeTouchesCancel(int[] iArr, float[] fArr, float[] fArr2);

    private static native void nativeTouchesEnd(int i, float f, float f2);

    private static native void nativeTouchesMove(int[] iArr, float[] fArr, float[] fArr2);

    Cocos2dxRenderer() {
        this.mStartTime = 0L;
        this.mStartTime = SystemClock.elapsedRealtime();
    }

    public static void setAnimationInterval(double d) {
        sAnimationInterval = (long) (d * 1.0E9d);
    }

    public void setScreenWidthAndHeight(int i, int i2) {
        this.mScreenWidth = i;
        this.mScreenHeight = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeInit(this.mScreenWidth, this.mScreenHeight);
        this.mLastTickInNanoSeconds = System.nanoTime();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.d("RENDERER", "Surface changed: " + i + " " + i2);
        nativeOnSurfaceChanged(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mEndTime = elapsedRealtime;
            long j = elapsedRealtime - this.mStartTime;
            if (j < FIXED_FPS) {
                Thread.sleep(FIXED_FPS - j);
            }
            this.mStartTime = SystemClock.elapsedRealtime();
            nativeRender();
        } catch (Exception unused) {
        }
    }

    public void handleActionDown(int i, float f, float f2) {
        nativeTouchesBegin(i, f, f2);
    }

    public void handleActionUp(int i, float f, float f2) {
        nativeTouchesEnd(i, f, f2);
    }

    public void handleActionCancel(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesCancel(iArr, fArr, fArr2);
    }

    public void handleActionMove(int[] iArr, float[] fArr, float[] fArr2) {
        nativeTouchesMove(iArr, fArr, fArr2);
    }

    public void handleKeyDown(int i) {
        nativeKeyDown(i);
    }

    public void handleKeyUp(int i) {
        nativeKeyUp(i);
    }

    public void handleOnPause() {
        nativeOnPause();
    }

    public void handleOnResume() {
        nativeOnResume();
    }

    public void handleInsertText(String str) {
        nativeInsertText(str);
    }

    public void handleDeleteBackward() {
        nativeDeleteBackward();
    }

    public String getContentText() {
        return nativeGetContentText();
    }
}
