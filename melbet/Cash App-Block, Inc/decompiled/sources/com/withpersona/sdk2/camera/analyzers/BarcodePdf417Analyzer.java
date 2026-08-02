package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import androidx.compose.runtime.OffsetApplier;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.common.InputImage;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.analyzers.AnalysisData;
import com.withpersona.sdk2.camera.analyzers.AnalysisError;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class BarcodePdf417Analyzer implements ComposableImageAnalyzer {
    public static final float[] CONVOLVE_MATRIX = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};
    public final boolean analyzeViewfinderRegionOnly;
    public final Lazy barcodeDetector$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(6));

    public BarcodePdf417Analyzer(boolean z) {
        this.analyzeViewfinderRegionOnly = z;
    }

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE, reason: not valid java name */
    public final Object mo4089analyze0E7RQCE(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, Rect rect, ContinuationImpl continuationImpl) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) imageToAnalyzeKt$toImageToAnalyze$1.bitmap$delegate.getValue();
        AnalysisData.Empty empty = AnalysisData.Empty.INSTANCE;
        if (bitmap2 == null) {
            Result.Companion companion = Result.Companion;
            return empty;
        }
        try {
            Toolkit toolkit = Toolkit.INSTANCE;
            bitmap = Toolkit.convolve$default(bitmap2, CONVOLVE_MATRIX);
        } catch (UnsatisfiedLinkError unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            bitmap2 = bitmap;
        }
        int i = imageToAnalyzeKt$toImageToAnalyze$1.getInputImage().zzf;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap2, i);
        InputImage.zzc(-1, 1, bitmap2.getHeight(), bitmap2.getWidth(), bitmap2.getAllocationByteCount(), i, elapsedRealtime);
        zzh zzhVar = (zzh) ((BarcodeScanner) this.barcodeDetector$delegate.getValue());
        Task onSuccessTask = zzhVar.processBase(inputImage).onSuccessTask(new OffsetApplier(zzhVar, inputImage.zzd, inputImage.zze, 7));
        try {
            Object result = onSuccessTask.getResult();
            result.getClass();
            Barcode barcode = (Barcode) CollectionsKt.getOrNull(0, (List) result);
            if (barcode == null) {
                Result.Companion companion2 = Result.Companion;
                return empty;
            }
            BarcodeSource barcodeSource = barcode.zza;
            String rawValue = barcodeSource.getRawValue();
            if (rawValue == null) {
                Result.Companion companion3 = Result.Companion;
                return empty;
            }
            int format2 = barcodeSource.getFormat();
            if (format2 > 4096 || format2 == 0) {
                format2 = -1;
            }
            if (format2 != 2048) {
                Result.Companion companion4 = Result.Companion;
                return empty;
            }
            BarcodeInfo.Pdf417BarcodeInfo pdf417BarcodeInfo = new BarcodeInfo.Pdf417BarcodeInfo(rawValue);
            Rect boundingBox = zza.getBoundingBox(imageToAnalyzeKt$toImageToAnalyze$1, rect, this.analyzeViewfinderRegionOnly);
            Rect rect2 = barcode.zzb;
            if (rect2 == null) {
                Result.Companion companion5 = Result.Companion;
                return empty;
            }
            boundingBox.inset(1, 1);
            if (boundingBox.contains(rect2)) {
                Result.Companion companion6 = Result.Companion;
                return new AnalysisData.BarcodeAnalysisData(pdf417BarcodeInfo);
            }
            Result.Companion companion7 = Result.Companion;
            return empty;
        } catch (ExecutionException unused2) {
            Result.Companion companion8 = Result.Companion;
            return new Result.Failure(new AnalysisError.GooglePlayError());
        }
    }
}
