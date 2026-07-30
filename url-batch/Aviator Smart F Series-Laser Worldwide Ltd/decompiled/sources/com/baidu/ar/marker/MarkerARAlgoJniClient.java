package com.baidu.ar.marker;

import com.baidu.ar.algo.FrameType;
import com.baidu.ar.cd;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.marker.model.TranslationPrior;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MarkerARAlgoJniClient implements ILibLoader.c {
    private static final int ALGO_RESULT_CODE_INIT = -1;
    private static final int ALGO_RESULT_CODE_SUCCESS = 0;
    private a onAlgoSoLoadedComplteCallback;
    private long querySystemHandler = 0;
    private int isAlgoRelease = -1;

    public interface a {
        void a();

        void b();
    }

    public static String getVersion() {
        return nativeGetQueryVersion();
    }

    private native int nativeCreateQuerierSystem(long j8, int i8, int i9, float[] fArr, float[] fArr2, WorkType workType, TrackerType trackerType, String str, ReturnType returnType, int i10);

    private native int nativeGetFinalStepCount(long j8);

    private native int nativeGetLocationPoint(long j8, int[] iArr);

    private native int nativeGetPose(long j8, double[] dArr);

    private static native String nativeGetQueryVersion();

    private native float nativeGetStepLength(long j8);

    private native int nativeGetVpasSuccessCount(long j8);

    private native long nativeInitQuerySystem();

    private native int nativePauseSendingFrame(long j8);

    private native int nativeQueryFrame(long j8, byte[] bArr, double d8, float[] fArr, float[] fArr2, int i8, FrameType frameType);

    private native int nativeQueryFrameByteBuffer(long j8, ByteBuffer byteBuffer, double d8, float[] fArr, float[] fArr2, int i8, FrameType frameType);

    private native int nativeRelease(long j8);

    private native int nativeReset(long j8);

    private native int nativeResumeSendingFrame(long j8);

    private native int nativeTrackFrame(long j8, byte[] bArr, int i8, int i9, float[] fArr, float[] fArr2, double d8, float[] fArr3, float[] fArr4, TrackerStatus trackerStatus, double[] dArr, int i10, FrameType frameType);

    private native int nativeTrackFrame2(long j8, byte[] bArr, int i8, int i9, float[] fArr, float[] fArr2, double d8, float[] fArr3, float[] fArr4, TrackerStatus trackerStatus, double[] dArr, TranslationPrior translationPrior, float[] fArr5, int i10, FrameType frameType);

    private native int nativeTrackFrame3(long j8, byte[] bArr, int i8, int i9, float[] fArr, float[] fArr2, double d8, float[] fArr3, float[] fArr4, TrackerStatus trackerStatus, double[] dArr, float[] fArr5, int i10, FrameType frameType);

    private native int nativeVpsChoice(long j8, int i8);

    private native int nativeVpsServerReceiver(long j8, byte[] bArr);

    private boolean timeEffect(TranslationPrior translationPrior) {
        return Math.abs(System.currentTimeMillis() - translationPrior.getTime()) <= 5000;
    }

    public int chooseMap(int i8) {
        long j8 = this.querySystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeVpsChoice(j8, i8);
    }

    public int createQuerierSystem(int i8, int i9, float[] fArr, float[] fArr2, int i10, TrackerType trackerType, String str, int i11) {
        long nativeInitQuerySystem = nativeInitQuerySystem();
        this.querySystemHandler = nativeInitQuerySystem;
        this.isAlgoRelease = -1;
        WorkType workType = WorkType.WORK_LOCALIZATION;
        if (i10 == 3) {
            workType = WorkType.WORK_NAVIGATION;
        }
        return nativeCreateQuerierSystem(nativeInitQuerySystem, i8, i9, fArr, fArr2, workType, trackerType, str, ReturnType.RETURN_LONGTITUDE_LATITUDE_6DOF_POSE, i11);
    }

    public int getFinalStepCount() {
        long j8 = this.querySystemHandler;
        if (j8 == 0) {
            return -1;
        }
        return nativeGetFinalStepCount(j8);
    }

    public int getLocationPoint(double[] dArr) {
        long j8 = this.querySystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeGetPose(j8, dArr);
    }

    public float getStepLength() {
        long j8 = this.querySystemHandler;
        if (j8 == 0) {
            return -1.0f;
        }
        return nativeGetStepLength(j8);
    }

    public int getVpasSuccessCount() {
        long j8 = this.querySystemHandler;
        if (j8 == 0) {
            return -1;
        }
        return nativeGetVpasSuccessCount(j8);
    }

    public void loadSoLibs() {
        try {
            com.baidu.ar.libloader.a.a("dumixar");
            a aVar = this.onAlgoSoLoadedComplteCallback;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar2 = this.onAlgoSoLoadedComplteCallback;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader.c
    public void onError() {
        a aVar = this.onAlgoSoLoadedComplteCallback;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.baidu.ar.libloader.ILibLoader.c
    public void onReady() {
        a aVar = this.onAlgoSoLoadedComplteCallback;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean queryFrame(byte[] bArr, double d8, float[] fArr, float[] fArr2, int i8, FrameType frameType) {
        long j8 = this.querySystemHandler;
        return j8 != 0 && nativeQueryFrame(j8, bArr, d8, fArr, fArr2, i8, frameType) == 0;
    }

    public boolean receivProtoBuf(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        long j8 = this.querySystemHandler;
        return j8 != 0 && nativeVpsServerReceiver(j8, bArr) == 0;
    }

    public int release() {
        long j8 = this.querySystemHandler;
        if (j8 == 0) {
            return 0;
        }
        int nativeRelease = nativeRelease(j8);
        this.isAlgoRelease = nativeRelease;
        this.querySystemHandler = 0L;
        return nativeRelease;
    }

    public boolean reset() {
        long j8 = this.querySystemHandler;
        return j8 != 0 && nativeReset(j8) == 0;
    }

    public void setOnAlgoSoLoadedComplteCallback(a aVar) {
        this.onAlgoSoLoadedComplteCallback = aVar;
    }

    public boolean trackFrameBytes(byte[] bArr, cd cdVar) {
        if (this.querySystemHandler == 0 || cdVar == null || this.isAlgoRelease == 0) {
            return false;
        }
        TranslationPrior n8 = cdVar.n();
        if (n8 != null && !timeEffect(n8)) {
            n8 = null;
        }
        return nativeTrackFrame2(this.querySystemHandler, bArr, cdVar.o(), cdVar.d(), cdVar.g(), cdVar.b(), cdVar.l(), cdVar.f(), cdVar.j(), cdVar.m(), cdVar.h(), n8, cdVar.i(), cdVar.k(), cdVar.c()) == 0;
    }
}
