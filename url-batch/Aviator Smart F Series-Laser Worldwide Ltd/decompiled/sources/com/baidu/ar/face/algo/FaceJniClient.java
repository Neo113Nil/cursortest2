package com.baidu.ar.face.algo;

import android.content.res.AssetManager;

/* loaded from: classes.dex */
public class FaceJniClient {
    public static native FaceAlgoData animateFace(long j8, FaceAlgoData faceAlgoData, long j9);

    public static native long createAnimateCore(String[] strArr);

    public static native long createAnimateCoreFromAssetDir(String[] strArr);

    public static native long createDetectCore(String[] strArr);

    public static native long createDetectCoreFromAssetDir(String[] strArr);

    public static native long createFrame(FAUImage fAUImage);

    public static native long createTrackCore(String[] strArr);

    public static native long createTrackCoreFromAssetDir(String[] strArr);

    public static native boolean destoryFrame(long j8);

    public static native FaceAlgoData detectFace(long j8, FaceAlgoData faceAlgoData, long j9);

    public static native String getFaceAlgoVersion();

    public static native boolean releaseAnimateCore(long j8);

    public static native boolean releaseDetectCore(long j8);

    public static native boolean releaseTrackCore(long j8);

    public static native int setAssetManager(AssetManager assetManager);

    public static native FaceAlgoData trackFace(long j8, FaceAlgoData faceAlgoData, long j9);
}
