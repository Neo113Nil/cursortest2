package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.Image;
import androidx.credentials.Credential;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzw;
import com.google.android.instantapps.InstantApps;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceLandmark;
import com.google.mlkit.vision.face.internal.FaceDetectorImpl;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes5.dex */
public final class SelfieProcessor {
    public final byte[] byteArr;
    public final Lazy faceDetector$delegate;
    public double minFaceRatio;
    public TargetPose targetPose;
    public final Rect tempRect;
    public final boolean useOldFaceCenteredDetector;
    public ViewfinderInfo viewfinderInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PoseType {
        public static final /* synthetic */ PoseType[] $VALUES;
        public static final PoseType Center;
        public static final PoseType Left;
        public static final PoseType Right;

        static {
            PoseType poseType = new PoseType("Center", 0);
            Center = poseType;
            PoseType poseType2 = new PoseType("Left", 1);
            Left = poseType2;
            PoseType poseType3 = new PoseType("Right", 2);
            Right = poseType3;
            $VALUES = new PoseType[]{poseType, poseType2, poseType3};
        }

        public static PoseType valueOf(String str) {
            return (PoseType) Enum.valueOf(PoseType.class, str);
        }

        public static PoseType[] values() {
            return (PoseType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TargetPose {
        public static final /* synthetic */ TargetPose[] $VALUES;
        public static final TargetPose All;
        public static final TargetPose Center;
        public static final TargetPose Left;
        public static final TargetPose None;
        public static final TargetPose Right;

        static {
            TargetPose targetPose = new TargetPose("Center", 0);
            Center = targetPose;
            TargetPose targetPose2 = new TargetPose("Left", 1);
            Left = targetPose2;
            TargetPose targetPose3 = new TargetPose("Right", 2);
            Right = targetPose3;
            TargetPose targetPose4 = new TargetPose("All", 3);
            All = targetPose4;
            TargetPose targetPose5 = new TargetPose("None", 4);
            None = targetPose5;
            $VALUES = new TargetPose[]{targetPose, targetPose2, targetPose3, targetPose4, targetPose5};
        }

        public static TargetPose valueOf(String str) {
            return (TargetPose) Enum.valueOf(TargetPose.class, str);
        }

        public static TargetPose[] values() {
            return (TargetPose[]) $VALUES.clone();
        }
    }

    public SelfieProcessor(FeatureFlagManager featureFlagManager) {
        featureFlagManager.getClass();
        this.minFaceRatio = 0.35d;
        this.targetPose = TargetPose.All;
        this.useOldFaceCenteredDetector = featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$7);
        this.tempRect = new Rect();
        this.byteArr = new byte[32768];
        this.faceDetector$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(4));
    }

    public static Credential createSuccessResult(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, PoseType poseType, Rect rect) {
        Bitmap bitmap = rect != null ? ImageToAnalyzeKt.toBitmap(imageToAnalyzeKt$toImageToAnalyze$1.$image, imageToAnalyzeKt$toImageToAnalyze$1.$rotationDegrees, rect) : (Bitmap) imageToAnalyzeKt$toImageToAnalyze$1.bitmap$delegate.getValue();
        if (bitmap == null) {
            return null;
        }
        int ordinal = poseType.ordinal();
        if (ordinal == 0) {
            return new SelfiePhoto$Pose$Center(bitmap);
        }
        if (ordinal == 1) {
            return new SelfiePhoto$Pose$Left(bitmap);
        }
        if (ordinal == 2) {
            return new SelfiePhoto$Pose$Right(bitmap);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static int fastSin(int i) {
        int abs = Math.abs(i / 90) % 4;
        if (abs == 0) {
            return 0;
        }
        if (abs == 1) {
            return 1;
        }
        if (abs == 2) {
            return 0;
        }
        if (abs == 3) {
            return -1;
        }
        a$$ExternalSyntheticBUOutline0.m$1("unreachable");
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e5, code lost:
    
        if (r5.bottom >= (r13 + r14)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e7, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x030c, code lost:
    
        if ((java.lang.Math.abs(r6.centerX() - r5.centerX()) / r6.width()) <= 0.3d) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SelfieFrameInfo direction(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1) {
        Rect rect;
        int i;
        SelfieBrightnessInfo selfieBrightnessInfo;
        Rect rect2;
        boolean z;
        float f;
        SelfieError selfieError;
        Credential createSuccessResult;
        Credential credential;
        SelfieError selfieError2;
        boolean contains;
        SelfieError selfieError3;
        Image.Plane plane;
        Rect rect3;
        int i2;
        int i3;
        float f2;
        SelfieProcessor selfieProcessor = this;
        ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$1;
        ViewfinderInfo viewfinderInfo = selfieProcessor.viewfinderInfo;
        Rect calculateViewfinderRect = viewfinderInfo != null ? InstantApps.calculateViewfinderRect(viewfinderInfo, imageToAnalyzeKt$toImageToAnalyze$12) : null;
        InputImage inputImage = imageToAnalyzeKt$toImageToAnalyze$12.getInputImage();
        Image image = imageToAnalyzeKt$toImageToAnalyze$12.image;
        int i4 = inputImage.zzf;
        int i5 = inputImage.zze;
        int i6 = inputImage.zzd;
        Rect rect4 = (i4 == 90 || i4 == 270) ? new Rect(0, 0, i5, i6) : new Rect(0, 0, i6, i5);
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        if (width == 0 || height == 0 || planes == null || (plane = planes[0]) == null) {
            rect = rect4;
            i = 1;
            selfieBrightnessInfo = null;
        } else {
            ByteBuffer buffer = plane.getBuffer();
            Rect rect5 = calculateViewfinderRect == null ? new Rect(0, 0, width, height) : calculateViewfinderRect;
            rect5.width();
            int i7 = 3;
            int width2 = rect5.width() / 3;
            int height2 = rect5.height() / 3;
            int i8 = rect5.left;
            i = 1;
            int i9 = rect5.top;
            Rect rect6 = selfieProcessor.tempRect;
            rect6.set(i8, i9, i8 + width2, i9 + height2);
            Float[] fArr = new Float[9];
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = Float.valueOf(RecyclerView.DECELERATION_RATE);
            }
            int i11 = 0;
            while (i11 < i7) {
                int i12 = 0;
                while (i12 < i7) {
                    int i13 = imageToAnalyzeKt$toImageToAnalyze$12.rotationDegrees;
                    int i14 = i12 - 1;
                    int i15 = i11 - 1;
                    int i16 = i13 + 90;
                    int fastSin = (((fastSin(i13) * i14) + (fastSin(i16) * i15) + 1) * i7) + ((fastSin(i16) * i14) - (fastSin(i13) * i15)) + 1;
                    buffer.getClass();
                    buffer.rewind();
                    int width3 = rect6.width();
                    int height3 = rect6.height() * width3;
                    int i17 = i11;
                    if (width3 > 32768) {
                        rect3 = rect4;
                        i2 = width;
                        i3 = width2;
                        f2 = RecyclerView.DECELERATION_RATE;
                    } else {
                        rect3 = rect4;
                        IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(rect6.top, rect6.bottom));
                        int i18 = step.first;
                        i2 = width;
                        int i19 = step.last;
                        int i20 = step.step;
                        long j = 0;
                        if ((i20 > 0 && i18 <= i19) || (i20 < 0 && i19 <= i18)) {
                            while (true) {
                                int i21 = i20;
                                buffer.position((i18 * i2) + rect6.left);
                                byte[] bArr = selfieProcessor.byteArr;
                                i3 = width2;
                                buffer.get(bArr, 0, width3);
                                int i22 = 0;
                                while (i22 < width3) {
                                    j += r29[i22] & 255;
                                    i22++;
                                    bArr = bArr;
                                }
                                if (i18 == i19) {
                                    break;
                                }
                                i18 += i21;
                                selfieProcessor = this;
                                width2 = i3;
                                i20 = i21;
                            }
                        } else {
                            i3 = width2;
                        }
                        f2 = ((j / height3) / 255.0f) * 2.0f;
                    }
                    fArr[fastSin] = Float.valueOf(f2);
                    rect6.left += i3;
                    rect6.right += i3;
                    i12++;
                    selfieProcessor = this;
                    imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$1;
                    i11 = i17;
                    rect4 = rect3;
                    width = i2;
                    width2 = i3;
                    i7 = 3;
                }
                rect6.left = rect5.left;
                rect6.right = rect5.left + width2;
                rect6.top += height2;
                rect6.bottom += height2;
                i11++;
                selfieProcessor = this;
                imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$1;
                i7 = 3;
            }
            rect = rect4;
            buffer.rewind();
            selfieBrightnessInfo = new SelfieBrightnessInfo(fArr);
        }
        if (calculateViewfinderRect != null) {
            int i23 = inputImage.zzf;
            rect2 = (i23 == 90 || i23 == 270) ? new Rect(calculateViewfinderRect.top, calculateViewfinderRect.left, calculateViewfinderRect.bottom, calculateViewfinderRect.right) : calculateViewfinderRect;
        } else {
            rect2 = null;
        }
        zzw processBase = ((FaceDetectorImpl) ((FaceDetector) this.faceDetector$delegate.getValue())).processBase(inputImage);
        processBase.getClass();
        try {
            List list = (List) processBase.getResult();
            if (list.isEmpty()) {
                return new SelfieFrameInfo(null, SelfieError.FaceNotFound, list.size(), false, false, false, RecyclerView.DECELERATION_RATE, selfieBrightnessInfo);
            }
            if (list.size() > i) {
                return new SelfieFrameInfo(null, SelfieError.MultipleFaces, list.size(), false, false, false, RecyclerView.DECELERATION_RATE, selfieBrightnessInfo);
            }
            Face face = (Face) CollectionsKt.first(list);
            Rect rect7 = face.zza;
            rect7.getClass();
            Rect rect8 = rect2 == null ? rect : rect2;
            boolean z2 = ((double) Math.max(rect7.width(), rect7.height())) > ((double) Math.min(rect8.width(), rect8.height())) * 0.8d;
            rect7.getClass();
            Rect rect9 = rect2 == null ? rect : rect2;
            boolean z3 = ((double) Math.max(rect7.width(), rect7.height())) < ((double) Math.min(rect9.width(), rect9.height())) * this.minFaceRatio;
            if (this.useOldFaceCenteredDetector) {
                Rect rect10 = rect2 == null ? rect : rect2;
                int width4 = rect10.width();
                int height4 = rect10.height();
                int i24 = width4 / 2;
                int i25 = height4 / 2;
                int min = Math.min(width4, height4) / 2;
                Rect rect11 = new Rect(0, 0, width4, height4);
                rect11.inset(25, 25);
                if (rect11.contains(rect7)) {
                    int width5 = rect10.width() - rect7.right;
                    if (width5 < 1) {
                        width5 = 1;
                    }
                    int i26 = rect7.left;
                    if (i26 < 1) {
                        i26 = 1;
                    }
                    if (Math.abs(width5 - i26) / rect10.width() <= 0.3d) {
                        if (rect7.left > i24 - min) {
                            if (rect7.right < i24 + min) {
                                if (rect7.top > i25 - min) {
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
            } else {
                Rect rect12 = rect2 == null ? rect : rect2;
            }
            boolean z4 = z;
            if (rect2 == null) {
                rect2 = rect;
            }
            Rect rect13 = new Rect(rect2);
            rect13.inset(25, 25);
            boolean contains2 = rect13.contains(rect7);
            float f3 = face.zzg;
            if (z2) {
                selfieError3 = SelfieError.FaceTooClose;
            } else if (z3) {
                selfieError3 = SelfieError.FaceTooFar;
            } else if (!z4) {
                selfieError3 = SelfieError.FaceNotCentered;
            } else {
                if (contains2) {
                    if (-10.0f >= f3 || f3 >= 10.0f) {
                        f = f3;
                        if (f < -15.0f) {
                            TargetPose targetPose = this.targetPose;
                            if (targetPose == TargetPose.Right || targetPose == TargetPose.All) {
                                createSuccessResult = createSuccessResult(imageToAnalyzeKt$toImageToAnalyze$1, PoseType.Right, calculateViewfinderRect);
                                credential = createSuccessResult;
                                selfieError2 = null;
                                return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
                            }
                            selfieError = SelfieError.IncorrectPose;
                            selfieError2 = selfieError;
                            credential = null;
                            return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
                        }
                        if (15.0f < f) {
                            TargetPose targetPose2 = this.targetPose;
                            if (targetPose2 == TargetPose.Left || targetPose2 == TargetPose.All) {
                                createSuccessResult = createSuccessResult(imageToAnalyzeKt$toImageToAnalyze$1, PoseType.Left, calculateViewfinderRect);
                                credential = createSuccessResult;
                                selfieError2 = null;
                                return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
                            }
                            selfieError = SelfieError.IncorrectPose;
                        } else {
                            selfieError = SelfieError.IncorrectPose;
                        }
                        selfieError2 = selfieError;
                        credential = null;
                        return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
                    }
                    int width6 = rect.width();
                    int height5 = rect.height();
                    FaceLandmark faceLandmark = (FaceLandmark) face.zzi.get(6);
                    if (faceLandmark == null) {
                        f = f3;
                        contains = false;
                    } else {
                        double d = width6 / 2;
                        double min2 = (Math.min(width6, height5) * 0.4d) / 2.0d;
                        double d2 = height5 / 2;
                        f = f3;
                        Rect rect14 = new Rect((int) (d - min2), (int) (d2 - min2), (int) (d + min2), (int) (d2 + min2));
                        PointF pointF = faceLandmark.zzb;
                        contains = rect14.contains((int) pointF.x, (int) pointF.y);
                    }
                    if (contains) {
                        TargetPose targetPose3 = this.targetPose;
                        if (targetPose3 == TargetPose.Center || targetPose3 == TargetPose.All) {
                            createSuccessResult = createSuccessResult(imageToAnalyzeKt$toImageToAnalyze$1, PoseType.Center, calculateViewfinderRect);
                            credential = createSuccessResult;
                            selfieError2 = null;
                            return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
                        }
                        selfieError = SelfieError.IncorrectPose;
                    } else {
                        selfieError = SelfieError.FaceNotCentered;
                    }
                    selfieError2 = selfieError;
                    credential = null;
                    return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
                }
                selfieError3 = SelfieError.IncompleteFace;
            }
            selfieError2 = selfieError3;
            f = f3;
            credential = null;
            return new SelfieFrameInfo(credential, selfieError2, list.size(), z2, z3, z4, f, selfieBrightnessInfo);
        } catch (ExecutionException unused) {
            return new SelfieFrameInfo(null, SelfieError.FaceDetectionUnsupported, 0, false, false, false, RecyclerView.DECELERATION_RATE, selfieBrightnessInfo);
        }
    }
}
