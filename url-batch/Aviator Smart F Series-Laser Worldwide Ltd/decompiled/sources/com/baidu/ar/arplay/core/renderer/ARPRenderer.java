package com.baidu.ar.arplay.core.renderer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.EGLContext;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import com.baidu.ar.arplay.core.engine.b;
import com.baidu.ar.arplay.core.engine.rotate.OrientationManager;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arplay.core.pixel.PixelType;
import com.baidu.ar.arplay.util.LogUtil;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public class ARPRenderer implements IARPRenderer {
    private static final int MAX_FRAME_COUNT = 100;
    private static final boolean PROFILE_LOG = false;
    private static final String TAG = "ARPRenderer";
    private boolean hasSetup;
    private final Queue<Runnable> mDrawQueue;
    private boolean mFrontCamera;
    private OnNeedCacheFrameListener mIsNeedCacheFrameListener;
    private OnRenderFinishedListener mOnRenderFinishedListener;
    private OnRenderStartedListener mOnRenderStartedListener;
    private HashMap<String, List<PixelReadListener>> mPixelListenerHash;
    private ArrayMap<Long, String> mSurfaceMap;
    private float[] texMatrix;
    private boolean hasSetupPipeline = false;
    private long mLastFramePTS = -1;
    private long mTotalFrameTimeInMS = 0;
    private int mTotalFrameCount = 0;
    private int mInputTexWidth = 720;
    private int mInputTexHeight = 1280;
    private SoftReference<Context> softContext = null;
    private TakePictureCallback mTakePictureCallback = null;
    private int mRotation = 0;
    private boolean mIsCutSnapShot = false;
    private boolean mNeedSyncRender = false;
    private int mCutSnapStartX = 0;
    private int mCutSnapStartY = 0;
    private int mCutSnapWidth = 0;
    private int mCutSnapHeight = 0;
    private long mLastAlgoPTS = -1;
    private Object[] mRunnableLock = new Object[0];
    private Object[] mPipelineLock = new Object[0];

    public ARPRenderer() {
        this.hasSetup = false;
        float[] fArr = new float[16];
        this.texMatrix = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.hasSetup = false;
        this.mDrawQueue = new LinkedList();
        this.mPixelListenerHash = new HashMap<>();
        this.mSurfaceMap = new ArrayMap<>();
    }

    public static void copyNativeBytebuffer(ByteBuffer byteBuffer, byte[] bArr, int i8, int i9) {
        nativeCopyBytebuffer(byteBuffer, bArr, i8, i9);
    }

    private void destroyGLContext() {
        String str = TAG;
        Log.d(str, "calling nativeDestroyInputSource");
        nativeDestroyInputSource();
        Log.d(str, "calling nativeRemoveOutputAllTarget");
        nativeRemoveOutputAllTarget();
        if (this.hasSetupPipeline) {
            Log.d(str, "calling nativeReleasePipeline");
            nativeReleasePipeline();
        }
        Log.d(str, "calling nativeContextDestroy");
        nativeContextDestroy();
        Log.d(str, "end of destroyGLContext");
        releaseEffectFilterRegisterHelper();
    }

    private int getInputHeight(PixelReadParams pixelReadParams) {
        int i8 = this.mInputTexHeight;
        if (pixelReadParams.getPreFilterID().equals("") || pixelReadParams.getPreFilterID().equals(PixelReadParams.DEFAULT_FILTER_ID)) {
            if (!needRotate(pixelReadParams.getPixelRotate().getValue())) {
                return i8;
            }
        } else if (!needSwapResolution()) {
            return i8;
        }
        return this.mInputTexWidth;
    }

    private int getInputWidth(PixelReadParams pixelReadParams) {
        int i8 = this.mInputTexWidth;
        if (pixelReadParams.getPreFilterID().equals("") || pixelReadParams.getPreFilterID().equals(PixelReadParams.DEFAULT_FILTER_ID)) {
            if (!needRotate(pixelReadParams.getPixelRotate().getValue())) {
                return i8;
            }
        } else if (!needSwapResolution()) {
            return i8;
        }
        return this.mInputTexHeight;
    }

    private String getPixelReadParamHash(PixelReadParams pixelReadParams) {
        if (pixelReadParams == null) {
            return null;
        }
        int outputWidth = pixelReadParams.getOutputWidth();
        int outputHeight = pixelReadParams.getOutputHeight();
        PixelType pixelType = pixelReadParams.getPixelType();
        String preFilterID = pixelReadParams.getPreFilterID();
        if (preFilterID.equals("") || preFilterID.equals(PixelReadParams.DEFAULT_FILTER_ID)) {
            preFilterID = PixelReadParams.DEFAULT_FILTER_ID;
        }
        return Integer.toString(outputWidth) + Integer.toString(outputHeight) + Integer.toString(pixelType.getValue()) + preFilterID + pixelReadParams.getFrameType().getValue();
    }

    private void multiplyPointWithMatrix(PointF pointF, float[] fArr) {
        if (fArr == null || fArr.length < 6) {
            return;
        }
        float f8 = fArr[0];
        float f9 = pointF.x;
        float f10 = fArr[4];
        float f11 = pointF.y;
        pointF.set((f8 * f9) + (f10 * f11), (fArr[1] * f9) + (fArr[5] * f11));
    }

    private native String nativeAddOutputSurface(Surface surface, String str, int i8, int i9, int i10, int i11);

    private native String nativeAddOutputTexture(int i8, int i9, int i10, int i11, int i12, int i13);

    private native void nativeBindTargetSurface(Surface surface);

    private native void nativeClearCaptureData();

    private native void nativeConnectCameraWithTarget();

    private native void nativeContextDestroy();

    private native boolean nativeContextInit(long j8, String str);

    private native void nativeContextPurge();

    private static native void nativeCopyBytebuffer(ByteBuffer byteBuffer, byte[] bArr, int i8, int i9);

    private native void nativeCreateInputSource(int i8, int i9, boolean z7);

    private native void nativeCreateNoInputSource();

    private native void nativeCreatePixelReaderByPreFilterID(int i8, int i9, int i10, int i11, float f8, float f9, String str, int i12);

    private native void nativeCreateSyncInputSource(int i8, int i9);

    private native void nativeDestroyAllPixelReader();

    private native void nativeDestroyInputSource();

    private native void nativeDestroyPixelReaderByPreFilterID(int i8, int i9, int i10, int i11, float f8, float f9, String str, int i12);

    private native long nativeFetchTexture(int i8, int i9, int i10);

    private native int nativeGetTextureId(long j8);

    private native void nativePauseRender();

    private native void nativeReleaseEffectFilterRegisterHelper();

    private native void nativeReleasePipeline();

    private native void nativeRemoveOutputAllTarget();

    private native void nativeRemoveOutputTargetByAddr(String str);

    private native void nativeResumeRender();

    private native void nativeReturnTexture(long j8);

    private native void nativeRunLuaScriptStr(String str);

    private native void nativeSetAlgoPts(long j8);

    private native void nativeSetCaptureData(int i8);

    private native void nativeSetInputSourceRotation(int i8);

    private native void nativeSetInputTexture(int i8, int i9, int i10, int i11);

    private native void nativeSetIsDumpAlgoPixel(boolean z7);

    private native void nativeSetIsRender(boolean z7);

    private native void nativeSetPixelReaderRotation(int i8);

    private native void nativeSetPixelReaderRotationByPixelInfo(int i8, int i9, int i10, int i11, float f8, float f9, String str, int i12, int i13);

    private native void nativeSetSnapShotPic(Bitmap bitmap, int i8, int i9);

    private native void nativeSetSourceSyncProperty(boolean z7);

    private native void nativeSwapBuffer();

    private native void nativeUpdateInputTexture(long j8);

    private native void nativeUpdateOutputSurfaceRotation(String str, int i8);

    private native void nativeUpdateTextureMatrix(float[] fArr);

    private native void nativeUploadPixelToTextureFromPath(long j8, String str);

    public static boolean needRotate(int i8) {
        return i8 == PixelRotation.RotateLeft.getValue() || i8 == PixelRotation.RotateRight.getValue() || i8 == PixelRotation.RotateRightFlipVertical.getValue() || i8 == PixelRotation.RotateRightFlipHorizontal.getValue();
    }

    private boolean needSwapResolution() {
        PointF pointF = new PointF(1.0f, 0.0f);
        PointF pointF2 = new PointF(0.0f, 1.0f);
        multiplyPointWithMatrix(pointF, this.texMatrix);
        multiplyPointWithMatrix(pointF2, this.texMatrix);
        return ((double) Math.abs(pointF.x)) < 1.0E-6d && ((double) Math.abs(Math.abs(pointF.y) - 1.0f)) < 1.0E-6d && ((double) Math.abs(Math.abs(pointF2.x) - 1.0f)) < 1.0E-6d && ((double) Math.abs(pointF2.y)) < 1.0E-6d;
    }

    @SuppressLint({"NewApi"})
    private boolean prepareGLContext(EGLContext eGLContext) {
        String str = TAG;
        Log.d(str, "calling nativeContextInit");
        boolean nativeContextInit = nativeContextInit(eGLContext != null ? eGLContext.getNativeHandle() : 0L, "6.4.0");
        Log.d(str, "end of prepareGLContext");
        return nativeContextInit;
    }

    private void runAllDrawQueue() {
        Queue<Runnable> queue = this.mDrawQueue;
        if (queue == null) {
            return;
        }
        synchronized (queue) {
            while (!this.mDrawQueue.isEmpty()) {
                try {
                    this.mDrawQueue.poll().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void snapShot(TakePictureCallback takePictureCallback, int i8, int i9, int i10) {
        this.mTakePictureCallback = takePictureCallback;
        this.mRotation = i10;
        nativeSetSnapShotPic(SnapShot.getCacheBitmap(i8, i9), i8, i9);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public String addOutputSurface(Surface surface, int i8, int i9) {
        return !this.hasSetup ? "" : addOutputSurface(surface, i8, i9, PixelRotation.NoRotation, OutputFillMode.KeepRatioCrop);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public String addOutputTarget(int i8, int i9, int i10, int i11) {
        return addOutputTarget(i8, i9, i10, i11, PixelRotation.NoRotation);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void bindTargetSurface(Surface surface) {
        nativeBindTargetSurface(surface);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void cancelAysncRenderTask(Runnable runnable) {
        Queue<Runnable> queue = this.mDrawQueue;
        if (queue == null || runnable == null) {
            return;
        }
        synchronized (queue) {
            try {
                if (!this.mDrawQueue.isEmpty()) {
                    this.mDrawQueue.remove(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void clearAllAsyncRenderTask() {
        Queue<Runnable> queue = this.mDrawQueue;
        if (queue == null) {
            return;
        }
        synchronized (queue) {
            try {
                if (!this.mDrawQueue.isEmpty()) {
                    this.mDrawQueue.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void clearCaptureData() {
        nativeClearCaptureData();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void connectCameraWithTarget() {
        nativeConnectCameraWithTarget();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void createInputSource(PixelRotation pixelRotation, b bVar) {
        Log.d(TAG, "calling nativeCreateInputSource: " + bVar);
        nativeCreateInputSource(pixelRotation.getValue(), bVar.a(), false);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void createInputSourceNoCache(PixelRotation pixelRotation, b bVar) {
        nativeCreateInputSource(pixelRotation.getValue(), bVar.a(), true);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void createNoInputSource() {
        nativeCreateNoInputSource();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void createPixelReaderByPreFilterID(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        if (pixelReadParams == null || pixelReadListener == null) {
            return;
        }
        int outputWidth = pixelReadParams.getOutputWidth();
        int outputHeight = pixelReadParams.getOutputHeight();
        PixelRotation pixelRotate = pixelReadParams.getPixelRotate();
        PixelType pixelType = pixelReadParams.getPixelType();
        int value = pixelReadParams.getFrameType().getValue();
        float inputWidth = outputWidth / getInputWidth(pixelReadParams);
        float inputHeight = outputHeight / getInputHeight(pixelReadParams);
        String pixelReadParamHash = getPixelReadParamHash(pixelReadParams);
        synchronized (this.mPipelineLock) {
            try {
                if (this.mPixelListenerHash.containsKey(pixelReadParamHash)) {
                    this.mPixelListenerHash.get(pixelReadParamHash).add(pixelReadListener);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(pixelReadListener);
                this.mPixelListenerHash.put(pixelReadParamHash, arrayList);
                nativeCreatePixelReaderByPreFilterID(outputWidth, outputHeight, pixelRotate.getValue(), pixelType.getValue(), inputWidth, inputHeight, pixelReadParams.getPreFilterID(), value);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void createSyncInputSource(PixelRotation pixelRotation, b bVar) {
        Log.d(TAG, "calling createSyncInputSource: " + bVar);
        nativeCreateSyncInputSource(pixelRotation.getValue(), bVar.a());
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public long createTexture(int i8, int i9, int i10) {
        return nativeFetchTexture(i8, i9, i10);
    }

    public void destroy() {
        if (this.hasSetup) {
            ARPMessage.getInstance().release();
            this.mDrawQueue.clear();
            Log.d(TAG, "ARPFilter destroy: ");
            destroyGLContext();
            this.mOnRenderStartedListener = null;
            this.mOnRenderFinishedListener = null;
            this.mIsNeedCacheFrameListener = null;
            SnapShot.destroyCache();
            this.hasSetup = false;
            this.mNeedSyncRender = false;
            this.mSurfaceMap.clear();
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void destroyAllPixelReader() {
        if (this.mPixelListenerHash == null) {
            return;
        }
        synchronized (this.mPipelineLock) {
            this.mPixelListenerHash.clear();
        }
        nativeDestroyAllPixelReader();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void destroyPixelReaderByPreFilterID(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        if (pixelReadParams == null || pixelReadListener == null) {
            return;
        }
        String pixelReadParamHash = getPixelReadParamHash(pixelReadParams);
        synchronized (this.mPipelineLock) {
            try {
                if (this.mPixelListenerHash.containsKey(pixelReadParamHash)) {
                    List<PixelReadListener> list = this.mPixelListenerHash.get(pixelReadParamHash);
                    if (list.size() > 1) {
                        list.remove(pixelReadListener);
                        return;
                    }
                    this.mPixelListenerHash.remove(pixelReadParamHash);
                    int outputWidth = pixelReadParams.getOutputWidth();
                    int outputHeight = pixelReadParams.getOutputHeight();
                    nativeDestroyPixelReaderByPreFilterID(outputWidth, outputHeight, pixelReadParams.getPixelRotate().getValue(), pixelReadParams.getPixelType().getValue(), outputWidth / getInputWidth(pixelReadParams), outputHeight / getInputHeight(pixelReadParams), pixelReadParams.getPreFilterID(), pixelReadParams.getFrameType().getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void destroyTexture(long j8) {
        nativeReturnTexture(j8);
    }

    public int getCameraPreviewHeight() {
        return this.mInputTexHeight;
    }

    public int getCameraPreviewWidth() {
        return this.mInputTexWidth;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void getSnapShot(TakePictureCallback takePictureCallback, int i8, int i9, int i10) {
        this.mIsCutSnapShot = false;
        snapShot(takePictureCallback, i8, i9, i10);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public int getTextureId(long j8) {
        return nativeGetTextureId(j8);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public boolean isFrontCamera() {
        return this.mFrontCamera;
    }

    public native void nativeRunSyncOnIOContext(Runnable runnable);

    public native void nativeRunSyncOnRenderContext(Runnable runnable);

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void onFrameRenderFinished(long j8) {
        OnRenderFinishedListener onRenderFinishedListener = this.mOnRenderFinishedListener;
        if (onRenderFinishedListener != null) {
            onRenderFinishedListener.onRenderFinished(j8);
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void onFrameRenderStarted(long j8) {
        OnRenderStartedListener onRenderStartedListener = this.mOnRenderStartedListener;
        if (onRenderStartedListener != null) {
            onRenderStartedListener.onRenderStarted(j8);
        }
        runAllDrawQueue();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void onSnapShotFinished(Bitmap bitmap, long j8) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (android.graphics.Matrix) null, false);
        if (this.mIsCutSnapShot) {
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, this.mCutSnapStartX, this.mCutSnapStartY, this.mCutSnapWidth, this.mCutSnapHeight, (android.graphics.Matrix) null, false);
            if (createBitmap != null && !createBitmap.equals(createBitmap2) && !createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            createBitmap = createBitmap2;
        }
        TakePictureCallback takePictureCallback = this.mTakePictureCallback;
        if (takePictureCallback != null) {
            takePictureCallback.onPictureTake(true, createBitmap, j8);
        }
    }

    public void pause() {
        Log.d(TAG, "ARPFilter pause: ");
        nativePauseRender();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public boolean pixelReadCallback(ByteBuffer byteBuffer, long j8, int i8, int i9, int i10, int i11, int i12, String str, int i13, int i14) {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.valueOf(i11));
        pixelReadParams.setOutputWidth(i8);
        pixelReadParams.setOutputHeight(i9);
        pixelReadParams.setPreFilterID(str);
        pixelReadParams.setFrameType(PixelReadParams.FrameType.values()[i13]);
        String pixelReadParamHash = getPixelReadParamHash(pixelReadParams);
        Boolean bool = Boolean.FALSE;
        OnNeedCacheFrameListener onNeedCacheFrameListener = this.mIsNeedCacheFrameListener;
        if (onNeedCacheFrameListener != null && this.mNeedSyncRender && j8 != this.mLastAlgoPTS) {
            bool = Boolean.valueOf(onNeedCacheFrameListener.isNeedCacheFrame(j8));
        }
        this.mLastAlgoPTS = j8;
        if (this.mPixelListenerHash.containsKey(pixelReadParamHash)) {
            FramePixels framePixels = new FramePixels(PixelType.values()[i11], byteBuffer, i8, i9);
            framePixels.setCameraFrame(true);
            framePixels.setFrontCamera(this.mFrontCamera);
            framePixels.setOrientation(OrientationManager.getGlobalOrientation());
            framePixels.setTimestamp(j8);
            framePixels.setPixelLength(i12);
            framePixels.setTextureID(i14);
            framePixels.setFrameType(PixelReadParams.FrameType.values()[i13]);
            List<PixelReadListener> list = this.mPixelListenerHash.get(pixelReadParamHash);
            if (list != null) {
                for (PixelReadListener pixelReadListener : list) {
                    if (pixelReadListener != null) {
                        pixelReadListener.onPixelRead(framePixels);
                    }
                }
            }
        }
        return bool.booleanValue();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void purgeMemory() {
        nativeContextPurge();
    }

    public void releaseEffectFilterRegisterHelper() {
        nativeReleaseEffectFilterRegisterHelper();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void removeAllOutputTarget() {
        this.mSurfaceMap.clear();
        nativeRemoveOutputAllTarget();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void removeOutputTargetByAddr(String str) {
        ArrayMap<Long, String> arrayMap = this.mSurfaceMap;
        if (arrayMap != null) {
            Iterator<Map.Entry<Long, String>> it = arrayMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (TextUtils.equals(it.next().getValue(), str)) {
                    it.remove();
                    break;
                }
            }
        }
        nativeRemoveOutputTargetByAddr(str);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public synchronized void render(long j8) {
        if (this.hasSetup) {
            nativeUpdateInputTexture(j8);
        }
    }

    public void resume() {
        Log.d(TAG, "ARPFilter resume: ");
        nativeResumeRender();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void runAsyncOnRenderContext(Runnable runnable) {
        Queue<Runnable> queue = this.mDrawQueue;
        if (queue == null || runnable == null) {
            return;
        }
        synchronized (queue) {
            this.mDrawQueue.add(runnable);
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void runLuaScriptStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ARPMessage.getInstance().setUp();
        synchronized (this.mPipelineLock) {
            nativeRunLuaScriptStr(str);
            this.hasSetupPipeline = true;
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void runSyncOnIOContext(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        LogUtil.a(TAG, "runSyncOnRenderContext: " + Thread.currentThread().getId());
        synchronized (this.mRunnableLock) {
            nativeRunSyncOnIOContext(runnable);
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void runSyncOnRenderContext(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        LogUtil.a(TAG, "runSyncOnRenderContext: " + Thread.currentThread().getId());
        synchronized (this.mRunnableLock) {
            nativeRunSyncOnRenderContext(runnable);
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setAlgoPts(long j8) {
        nativeSetAlgoPts(j8);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setCameraFace(boolean z7) {
        this.mFrontCamera = z7;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setCaptureData(int i8) {
        nativeSetCaptureData(i8);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setContext(SoftReference<Context> softReference) {
        if (softReference != null) {
            this.softContext = softReference;
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setInputMatrix(float[] fArr) {
        System.arraycopy(fArr, 0, this.texMatrix, 0, 16);
        nativeUpdateTextureMatrix(this.texMatrix);
    }

    public void setInputSourceRotation(PixelRotation pixelRotation) {
        nativeSetInputSourceRotation(pixelRotation.getValue());
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setInputTexture(int i8, int i9, int i10, int i11) {
        Log.d(TAG, String.format("setInputTexture: %d %d [%dx%d]", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.mInputTexWidth = i10;
        this.mInputTexHeight = i11;
        nativeSetInputTexture(i8, i9, i10, i11);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setIsDumpAlgoPixel(boolean z7) {
        nativeSetIsDumpAlgoPixel(z7);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setIsRender(boolean z7) {
        nativeSetIsRender(z7);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setOnNeedCacheFrameListener(OnNeedCacheFrameListener onNeedCacheFrameListener) {
        this.mIsNeedCacheFrameListener = onNeedCacheFrameListener;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setOnRenderFinishedListener(OnRenderFinishedListener onRenderFinishedListener) {
        this.mOnRenderFinishedListener = onRenderFinishedListener;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setOnRenderStartedListener(OnRenderStartedListener onRenderStartedListener) {
        this.mOnRenderStartedListener = onRenderStartedListener;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setPixelReaderRotation(PixelReadParams pixelReadParams, PixelRotation pixelRotation) {
        if (pixelReadParams == null) {
            return;
        }
        String pixelReadParamHash = getPixelReadParamHash(pixelReadParams);
        synchronized (this.mPipelineLock) {
            try {
                if (this.mPixelListenerHash.containsKey(pixelReadParamHash)) {
                    int outputWidth = pixelReadParams.getOutputWidth();
                    int outputHeight = pixelReadParams.getOutputHeight();
                    nativeSetPixelReaderRotationByPixelInfo(outputWidth, outputHeight, pixelReadParams.getPixelRotate().getValue(), pixelReadParams.getPixelType().getValue(), outputWidth / getInputWidth(pixelReadParams), outputHeight / getInputHeight(pixelReadParams), pixelReadParams.getPreFilterID(), pixelRotation.getValue(), pixelReadParams.getFrameType().getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setSourceSyncProperty(boolean z7) {
        this.mNeedSyncRender = z7;
        nativeSetSourceSyncProperty(z7);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public synchronized boolean setUpEGLEnv(EGLContext eGLContext) {
        if (this.hasSetup) {
            return true;
        }
        if (!prepareGLContext(eGLContext)) {
            return false;
        }
        this.hasSetup = true;
        this.mLastFramePTS = -1L;
        this.mTotalFrameTimeInMS = 0L;
        this.mTotalFrameCount = 0;
        this.hasSetupPipeline = false;
        return true;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void swapBuffer() {
        nativeSwapBuffer();
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void updateOutputSurfaceRotation(String str, PixelRotation pixelRotation) {
        nativeUpdateOutputSurfaceRotation(str, pixelRotation.getValue());
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void uploadPixelToTextureFromPath(long j8, String str) {
        nativeUploadPixelToTextureFromPath(j8, str);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public String addOutputSurface(Surface surface, int i8, int i9, PixelRotation pixelRotation) {
        return !this.hasSetup ? "" : addOutputSurface(surface, i8, i9, pixelRotation, OutputFillMode.KeepRatioCrop);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public String addOutputTarget(int i8, int i9, int i10, int i11, PixelRotation pixelRotation) {
        return addOutputTarget(i8, i9, i10, i11, pixelRotation, OutputFillMode.KeepRatioCrop);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void getSnapShot(TakePictureCallback takePictureCallback, int i8, int i9, int i10, Rect rect) {
        this.mIsCutSnapShot = true;
        int i11 = rect.left;
        this.mCutSnapStartX = i11;
        int i12 = rect.top;
        this.mCutSnapStartY = i12;
        this.mCutSnapWidth = rect.right - i11;
        this.mCutSnapHeight = rect.bottom - i12;
        snapShot(takePictureCallback, i8, i9, i10);
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public void setPixelReaderRotation(PixelRotation pixelRotation) {
        nativeSetPixelReaderRotation(pixelRotation.getValue());
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public String addOutputSurface(Surface surface, int i8, int i9, PixelRotation pixelRotation, OutputFillMode outputFillMode) {
        if (!this.hasSetup) {
            return "";
        }
        Log.d(TAG, String.format("addOutputSurface[%s | %dx%d %s %s]", surface, Integer.valueOf(i8), Integer.valueOf(i9), pixelRotation, outputFillMode));
        long hashCode = surface.hashCode();
        String str = this.mSurfaceMap.get(Long.valueOf(hashCode));
        boolean isEmpty = TextUtils.isEmpty(str);
        int value = pixelRotation.getValue();
        int value2 = outputFillMode.getValue();
        if (!isEmpty) {
            return nativeAddOutputSurface(surface, str, i8, i9, value, value2);
        }
        String nativeAddOutputSurface = nativeAddOutputSurface(surface, null, i8, i9, value, value2);
        this.mSurfaceMap.put(Long.valueOf(hashCode), nativeAddOutputSurface);
        return nativeAddOutputSurface;
    }

    @Override // com.baidu.ar.arplay.core.renderer.IARPRenderer
    public String addOutputTarget(int i8, int i9, int i10, int i11, PixelRotation pixelRotation, OutputFillMode outputFillMode) {
        Log.d(TAG, String.format("test addOutputTarget: %d [%dx%d] %s %s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), pixelRotation, outputFillMode));
        return nativeAddOutputTexture(i8, i9, i10, i11, pixelRotation.getValue(), outputFillMode.getValue());
    }
}
