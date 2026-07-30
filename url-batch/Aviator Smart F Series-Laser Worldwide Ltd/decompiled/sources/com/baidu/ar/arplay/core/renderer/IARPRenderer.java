package com.baidu.ar.arplay.core.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.EGLContext;
import android.view.Surface;
import com.baidu.ar.arplay.core.engine.b;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface IARPRenderer {
    String addOutputSurface(Surface surface, int i8, int i9);

    String addOutputSurface(Surface surface, int i8, int i9, PixelRotation pixelRotation);

    String addOutputSurface(Surface surface, int i8, int i9, PixelRotation pixelRotation, OutputFillMode outputFillMode);

    String addOutputTarget(int i8, int i9, int i10, int i11);

    String addOutputTarget(int i8, int i9, int i10, int i11, PixelRotation pixelRotation);

    String addOutputTarget(int i8, int i9, int i10, int i11, PixelRotation pixelRotation, OutputFillMode outputFillMode);

    void bindTargetSurface(Surface surface);

    void cancelAysncRenderTask(Runnable runnable);

    void clearAllAsyncRenderTask();

    void clearCaptureData();

    void connectCameraWithTarget();

    void createInputSource(PixelRotation pixelRotation, b bVar);

    void createInputSourceNoCache(PixelRotation pixelRotation, b bVar);

    void createNoInputSource();

    void createPixelReaderByPreFilterID(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener);

    void createSyncInputSource(PixelRotation pixelRotation, b bVar);

    long createTexture(int i8, int i9, int i10);

    void destroyAllPixelReader();

    void destroyPixelReaderByPreFilterID(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener);

    void destroyTexture(long j8);

    void getSnapShot(TakePictureCallback takePictureCallback, int i8, int i9, int i10);

    void getSnapShot(TakePictureCallback takePictureCallback, int i8, int i9, int i10, Rect rect);

    int getTextureId(long j8);

    boolean isFrontCamera();

    void onFrameRenderFinished(long j8);

    void onFrameRenderStarted(long j8);

    void onSnapShotFinished(Bitmap bitmap, long j8);

    boolean pixelReadCallback(ByteBuffer byteBuffer, long j8, int i8, int i9, int i10, int i11, int i12, String str, int i13, int i14);

    void purgeMemory();

    void removeAllOutputTarget();

    void removeOutputTargetByAddr(String str);

    void render(long j8);

    void runAsyncOnRenderContext(Runnable runnable);

    void runLuaScriptStr(String str);

    void runSyncOnIOContext(Runnable runnable);

    void runSyncOnRenderContext(Runnable runnable);

    void setAlgoPts(long j8);

    void setCameraFace(boolean z7);

    void setCaptureData(int i8);

    void setContext(SoftReference<Context> softReference);

    void setInputMatrix(float[] fArr);

    void setInputTexture(int i8, int i9, int i10, int i11);

    void setIsDumpAlgoPixel(boolean z7);

    void setIsRender(boolean z7);

    void setOnNeedCacheFrameListener(OnNeedCacheFrameListener onNeedCacheFrameListener);

    void setOnRenderFinishedListener(OnRenderFinishedListener onRenderFinishedListener);

    void setOnRenderStartedListener(OnRenderStartedListener onRenderStartedListener);

    void setPixelReaderRotation(PixelReadParams pixelReadParams, PixelRotation pixelRotation);

    void setPixelReaderRotation(PixelRotation pixelRotation);

    void setSourceSyncProperty(boolean z7);

    boolean setUpEGLEnv(EGLContext eGLContext);

    void swapBuffer();

    void updateOutputSurfaceRotation(String str, PixelRotation pixelRotation);

    void uploadPixelToTextureFromPath(long j8, String str);
}
