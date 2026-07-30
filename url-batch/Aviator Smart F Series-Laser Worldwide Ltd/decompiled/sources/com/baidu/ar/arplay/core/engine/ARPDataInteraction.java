package com.baidu.ar.arplay.core.engine;

import android.content.SharedPreferences;
import android.util.Log;
import com.baidu.ar.arplay.core.engine.ARPContent;
import com.baidu.ar.w2;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ARPDataInteraction implements ARPContent.b {
    private w2 mDataStore;
    private a mHtmlCallback;
    private b mInteraction = null;
    public boolean mIsCaseCreated = false;
    public ByteBuffer mMaskBuffer;
    private c mVideoCallback;

    public interface a {
        boolean a(int i8, int i9);
    }

    public interface b {
        void a(float f8, float f9, float f10);
    }

    public interface c {
        void a(String str, int i8, String str2, String str3);
    }

    private static void updateVideoFrame(Object obj, String str, int i8, String str2, String str3) {
        ARPDataInteraction aRPDataInteraction = (ARPDataInteraction) ((WeakReference) obj).get();
        if (aRPDataInteraction == null) {
            return;
        }
        aRPDataInteraction.updateVideoFrame(str, i8, str2, str3);
    }

    public void addAlgoType(int[] iArr, int i8) {
        nativeAddAlgoType(iArr, i8);
    }

    public void clearARMemory() {
        w2 w2Var = this.mDataStore;
        if (w2Var != null) {
            w2Var.a();
        }
    }

    public void clearAlgoCache() {
        nativeClearAlgoCache();
    }

    public void destroy() {
        nativeRelease();
    }

    public void destroyMockAlgoHandle(long j8) {
        nativeDestoryMockFaceAlgoHandle(j8);
    }

    public String getValue(int i8, String str) {
        w2 w2Var = this.mDataStore;
        if (w2Var != null) {
            return w2Var.a(i8, str);
        }
        Log.e("ARPDataInteraction", "get value error!");
        return "";
    }

    public void initDataStore(SharedPreferences sharedPreferences) {
        if (this.mDataStore == null) {
            w2 w2Var = new w2();
            this.mDataStore = w2Var;
            w2Var.a(sharedPreferences);
        }
    }

    public long mockFaceAlgoHandle(long j8, float[] fArr) {
        return nativeMockFaceAlgoHandle(j8, fArr);
    }

    public native void nativeAddAlgoType(int[] iArr, int i8);

    public native void nativeClearAlgoCache();

    public native void nativeDestoryMockFaceAlgoHandle(long j8);

    public native long nativeMockFaceAlgoHandle(long j8, float[] fArr);

    public native void nativeRelease();

    public native void nativeRemoveAlgoType(int[] iArr);

    public native void nativeSetAlgoDataHandle(long j8);

    public native void nativeSetAlgoHandle(long j8);

    public native void nativeSetFaceLandMark(long j8, int i8);

    public native void nativeSetFaceLandMarkFrameAcheMode(int i8);

    public native void nativeSetup(Object obj);

    public native void nativeUpdateAlgoDataToNode(int i8, int i9, ByteBuffer byteBuffer);

    @Override // com.baidu.ar.arplay.core.engine.ARPContent.b
    public void onCaseLoaded(boolean z7) {
        this.mIsCaseCreated = z7;
    }

    public void onGestureUpdate(int i8, long j8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, int i11, float f16) {
        onGestureUpdateNative(i8, j8, i9, f8, f9, f10, f11, i10, f12, f13, f14, f15, i11, f16, false);
    }

    public native void onGestureUpdateNative(int i8, long j8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, int i11, float f16, boolean z7);

    public void onGestureUpdateWithScaleFinish(int i8, long j8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, int i11, float f16, boolean z7) {
        onGestureUpdateNative(i8, j8, i9, f8, f9, f10, f11, i10, f12, f13, f14, f15, i11, f16, z7);
    }

    public void onInteractionFinish(float f8, float f9, float f10) {
        b bVar = this.mInteraction;
        if (bVar != null) {
            bVar.a(f8, f9, f10);
        }
    }

    public void onTouchUpdate(int i8, float f8, float f9, float f10, float f11, long j8, int i9, float f12) {
        onTouchUpdateNative(i8, f8, f9, f10, f11, j8, i9, f12);
    }

    public native void onTouchUpdateNative(int i8, float f8, float f9, float f10, float f11, long j8, int i9, float f12);

    public void removeAlgoType(int[] iArr) {
        nativeRemoveAlgoType(iArr);
    }

    public synchronized void setAlgoDataHandle(long j8) {
        nativeSetAlgoHandle(j8);
    }

    public void setFaceLandMarkFrameAcheMode(int i8) {
        nativeSetFaceLandMarkFrameAcheMode(i8);
    }

    public synchronized void setHtmlUpdateCallback(a aVar) {
        this.mHtmlCallback = aVar;
    }

    public void setInteraction(b bVar) {
        this.mInteraction = bVar;
    }

    public void setValue(int i8, String str, String str2) {
        w2 w2Var = this.mDataStore;
        if (w2Var != null) {
            w2Var.a(i8, str, str2);
        } else {
            Log.e("ARPDataInteraction", "set value error!");
        }
    }

    public synchronized void setVideoUpdateCallback(c cVar) {
        this.mVideoCallback = cVar;
    }

    public void setup() {
        nativeSetup(new WeakReference(this));
    }

    public void updateAlgoDataToNode(int i8, int i9, byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        this.mMaskBuffer = allocateDirect;
        allocateDirect.put(bArr);
        nativeUpdateAlgoDataToNode(i8, i9, this.mMaskBuffer);
    }

    public boolean updateWebViewFrame(int i8, int i9) {
        a aVar = this.mHtmlCallback;
        if (aVar == null || !this.mIsCaseCreated) {
            return false;
        }
        return aVar.a(i8, i9);
    }

    private static String getValue(Object obj, int i8, String str) {
        ARPDataInteraction aRPDataInteraction = (ARPDataInteraction) ((WeakReference) obj).get();
        return aRPDataInteraction == null ? "" : aRPDataInteraction.getValue(i8, str);
    }

    public static void onInteractionFinish(Object obj, float f8, float f9, float f10) {
        ARPDataInteraction aRPDataInteraction = (ARPDataInteraction) ((WeakReference) obj).get();
        if (aRPDataInteraction == null) {
            return;
        }
        aRPDataInteraction.onInteractionFinish(f8, f9, f10);
    }

    private static void setValue(Object obj, int i8, String str, String str2) {
        ARPDataInteraction aRPDataInteraction = (ARPDataInteraction) ((WeakReference) obj).get();
        if (aRPDataInteraction == null) {
            return;
        }
        aRPDataInteraction.setValue(i8, str, str2);
    }

    public static boolean updateWebViewFrame(Object obj, int i8, int i9) {
        ARPDataInteraction aRPDataInteraction = (ARPDataInteraction) ((WeakReference) obj).get();
        if (aRPDataInteraction == null) {
            return false;
        }
        return aRPDataInteraction.updateWebViewFrame(i8, i9);
    }

    public void updateVideoFrame(String str, int i8, String str2, String str3) {
        c cVar = this.mVideoCallback;
        if (cVar == null || !this.mIsCaseCreated) {
            return;
        }
        cVar.a(str, i8, str2, str3);
    }
}
