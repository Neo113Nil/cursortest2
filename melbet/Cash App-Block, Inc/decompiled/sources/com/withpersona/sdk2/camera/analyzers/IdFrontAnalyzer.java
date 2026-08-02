package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.internal.FaceDetectorImpl;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.internal.zzn;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1;
import com.withpersona.sdk2.camera.analyzers.AnalysisData;
import com.withpersona.sdk2.camera.analyzers.AnalysisError;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class IdFrontAnalyzer implements ComposableImageAnalyzer {
    public final boolean analyzeViewfinderRegionOnly;
    public final Lazy faceDetector$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(7));
    public final Lazy textDetector$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(8));

    public IdFrontAnalyzer(boolean z) {
        this.analyzeViewfinderRegionOnly = z;
    }

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    public final Object mo4089analyze0E7RQCE(ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, Rect rect, ContinuationImpl continuationImpl) {
        AbstractList abstractList;
        InputImage inputImage = imageToAnalyzeKt$toImageToAnalyze$1.getInputImage();
        zzw processBase = ((FaceDetectorImpl) ((FaceDetector) this.faceDetector$delegate.getValue())).processBase(inputImage);
        processBase.getClass();
        zzw processBase2 = ((zzn) ((TextRecognizer) this.textDetector$delegate.getValue())).processBase(inputImage);
        processBase2.getClass();
        try {
            Object result = processBase.getResult();
            result.getClass();
            Face face = (Face) CollectionsKt.getOrNull(0, (List) result);
            if (face == null) {
                Result.Companion companion = Result.Companion;
                return AnalysisData.Empty.INSTANCE;
            }
            List unmodifiableList = Collections.unmodifiableList(((Text) processBase2.getResult()).zza);
            unmodifiableList.getClass();
            List<Text.TextBlock> list = unmodifiableList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Text.TextBlock textBlock : list) {
                synchronized (textBlock) {
                    abstractList = textBlock.zza;
                }
                abstractList.getClass();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractList, 10));
                Iterator it = abstractList.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Text.Line) it.next()).zza;
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(str);
                }
                arrayList.add(arrayList2);
            }
            if (CollectionsKt__IterablesKt.flatten(arrayList).size() < 5) {
                Result.Companion companion2 = Result.Companion;
                return AnalysisData.Empty.INSTANCE;
            }
            Rect boundingBox = zza.getBoundingBox(imageToAnalyzeKt$toImageToAnalyze$1, rect, this.analyzeViewfinderRegionOnly);
            boundingBox.inset(1, 1);
            if (!boundingBox.contains(face.zza)) {
                Result.Companion companion3 = Result.Companion;
                return AnalysisData.Empty.INSTANCE;
            }
            Result.Companion companion4 = Result.Companion;
            String str2 = ((Text) processBase2.getResult()).zzb;
            str2.getClass();
            return new AnalysisData.IdFrontAnalysisData(new ImageIdMetadata(str2));
        } catch (ExecutionException unused) {
            Result.Companion companion5 = Result.Companion;
            return new Result.Failure(new AnalysisError.DetectorError());
        }
    }
}
