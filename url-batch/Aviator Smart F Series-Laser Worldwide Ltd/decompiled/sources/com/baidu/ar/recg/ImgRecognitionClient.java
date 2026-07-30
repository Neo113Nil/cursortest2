package com.baidu.ar.recg;

import com.baidu.ar.libloader.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ImgRecognitionClient {
    private long mRecgHandler = 0;

    static {
        a.a("ImgRecognition");
    }

    private native long createImageSearcherMultiInstanceC();

    public static native CornerPoint[] extractCornerPoints(byte[] bArr, int i8, int i9);

    private native CornerPoint[] extractCornerPointsMultiInstanceC(long j8, byte[] bArr, int i8, int i9);

    public static native String getVersionImgSearch();

    private native String getVersionImgSearchMultiInstanceC();

    public static native boolean init(String[] strArr);

    private native boolean loadFeatureMultiInstanceC(long j8, String[] strArr);

    public static native RecognitionResult recogniseImage(byte[] bArr, int i8, int i9);

    public static native RecognitionResult recogniseImageByteBuffer(ByteBuffer byteBuffer, int i8, int i9);

    private native RecognitionResult recogniseImageMultiInstanceC(long j8, byte[] bArr, int i8, int i9);

    public static native boolean release();

    private native boolean releaseMultiInstanceC(long j8);

    public void createImageSearcherMultiInstance() {
        this.mRecgHandler = createImageSearcherMultiInstanceC();
    }

    public CornerPoint[] extractCornerPointsMultiInstance(byte[] bArr, int i8, int i9) {
        return extractCornerPointsMultiInstanceC(this.mRecgHandler, bArr, i8, i9);
    }

    public String getVersionImgSearchMultiInstance() {
        return getVersionImgSearchMultiInstanceC();
    }

    public boolean loadFeatureMultiInstance(String[] strArr) {
        long j8 = this.mRecgHandler;
        if (j8 == 0) {
            return false;
        }
        return loadFeatureMultiInstanceC(j8, strArr);
    }

    public RecognitionResult recogniseImageMultiInstance(byte[] bArr, int i8, int i9) {
        long j8 = this.mRecgHandler;
        return j8 == 0 ? new RecognitionResult() : recogniseImageMultiInstanceC(j8, bArr, i8, i9);
    }

    public boolean releaseMultiInstance() {
        long j8 = this.mRecgHandler;
        if (j8 == 0) {
            return false;
        }
        this.mRecgHandler = 0L;
        boolean releaseMultiInstanceC = releaseMultiInstanceC(j8);
        this.mRecgHandler = 0L;
        return releaseMultiInstanceC;
    }
}
