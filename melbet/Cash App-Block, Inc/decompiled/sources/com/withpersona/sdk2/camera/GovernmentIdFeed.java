package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.instantapps.InstantApps;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import com.withpersona.sdk2.camera.analyzers.AnalysisData;
import com.withpersona.sdk2.camera.analyzers.AnalysisError;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer;
import com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer;
import com.withpersona.sdk2.camera.feed.CameraFeed;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class GovernmentIdFeed implements CameraFeed, ImageAnalysis.Analyzer, SharedFlow, Camera2ImageAnalyzer {
    public List analyzers;
    public List passiveAnalyzers;
    public final MutableSharedFlow resultFlow;
    public ParsedIdSideOrNone.Side side;
    public ViewfinderInfo viewfinderInfo;

    public GovernmentIdFeed(MutableSharedFlow mutableSharedFlow) {
        mutableSharedFlow.getClass();
        this.resultFlow = mutableSharedFlow;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.analyzers = emptyList;
        this.passiveAnalyzers = emptyList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00fe -> B:11:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00ba -> B:62:0x00bf). Please report as a decompilation issue!!! */
    /* renamed from: access$analyze-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4088access$analyzegIAlus(GovernmentIdFeed governmentIdFeed, ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1, ContinuationImpl continuationImpl) {
        GovernmentIdFeed$analyze$1 governmentIdFeed$analyze$1;
        int i;
        Rect rect;
        Iterator it;
        List<AnalyzerResult> list;
        ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$12;
        Iterator it2;
        Ref$ObjectRef ref$ObjectRef;
        ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$13 = imageToAnalyzeKt$toImageToAnalyze$1;
        if (continuationImpl instanceof GovernmentIdFeed$analyze$1) {
            governmentIdFeed$analyze$1 = (GovernmentIdFeed$analyze$1) continuationImpl;
            int i2 = governmentIdFeed$analyze$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                governmentIdFeed$analyze$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = governmentIdFeed$analyze$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = governmentIdFeed$analyze$1.label;
                Throwable th = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    ViewfinderInfo viewfinderInfo = governmentIdFeed.viewfinderInfo;
                    Rect calculateViewfinderRect = viewfinderInfo != null ? InstantApps.calculateViewfinderRect(viewfinderInfo, imageToAnalyzeKt$toImageToAnalyze$13) : null;
                    Rect rect2 = new Rect(0, 0, imageToAnalyzeKt$toImageToAnalyze$13.width, imageToAnalyzeKt$toImageToAnalyze$13.height);
                    if (calculateViewfinderRect == null || !rect2.contains(calculateViewfinderRect)) {
                        calculateViewfinderRect = null;
                    }
                    rect = calculateViewfinderRect;
                    it = governmentIdFeed.analyzers.iterator();
                    list = arrayList;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    Collection collection = governmentIdFeed$analyze$1.L$4;
                    it = governmentIdFeed$analyze$1.L$3;
                    rect = governmentIdFeed$analyze$1.L$2;
                    list = governmentIdFeed$analyze$1.L$1;
                    ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$14 = governmentIdFeed$analyze$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Object mo4089analyze0E7RQCE = ((Result) obj).value;
                    collection.add(new AnalyzerResult(mo4089analyze0E7RQCE, true));
                    imageToAnalyzeKt$toImageToAnalyze$13 = imageToAnalyzeKt$toImageToAnalyze$14;
                    if (it.hasNext()) {
                        List list2 = list;
                        ComposableImageAnalyzer composableImageAnalyzer = (ComposableImageAnalyzer) it.next();
                        governmentIdFeed$analyze$1.L$0 = imageToAnalyzeKt$toImageToAnalyze$13;
                        governmentIdFeed$analyze$1.L$1 = list;
                        governmentIdFeed$analyze$1.L$2 = rect;
                        governmentIdFeed$analyze$1.L$3 = it;
                        governmentIdFeed$analyze$1.L$4 = list2;
                        governmentIdFeed$analyze$1.label = 1;
                        mo4089analyze0E7RQCE = composableImageAnalyzer.mo4089analyze0E7RQCE(imageToAnalyzeKt$toImageToAnalyze$13, rect, governmentIdFeed$analyze$1);
                        if (mo4089analyze0E7RQCE != coroutineSingletons) {
                            imageToAnalyzeKt$toImageToAnalyze$14 = imageToAnalyzeKt$toImageToAnalyze$13;
                            collection = list2;
                            collection.add(new AnalyzerResult(mo4089analyze0E7RQCE, true));
                            imageToAnalyzeKt$toImageToAnalyze$13 = imageToAnalyzeKt$toImageToAnalyze$14;
                            if (it.hasNext()) {
                                imageToAnalyzeKt$toImageToAnalyze$12 = imageToAnalyzeKt$toImageToAnalyze$13;
                                it2 = governmentIdFeed.passiveAnalyzers.iterator();
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection2 = governmentIdFeed$analyze$1.L$4;
                    it2 = governmentIdFeed$analyze$1.L$3;
                    rect = governmentIdFeed$analyze$1.L$2;
                    list = governmentIdFeed$analyze$1.L$1;
                    imageToAnalyzeKt$toImageToAnalyze$12 = governmentIdFeed$analyze$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Object obj2 = ((Result) obj).value;
                    collection2.add(new AnalyzerResult(obj2, false));
                    if (it2.hasNext()) {
                        List list3 = list;
                        ComposableImageAnalyzer composableImageAnalyzer2 = (ComposableImageAnalyzer) it2.next();
                        governmentIdFeed$analyze$1.L$0 = imageToAnalyzeKt$toImageToAnalyze$12;
                        governmentIdFeed$analyze$1.L$1 = list;
                        governmentIdFeed$analyze$1.L$2 = rect;
                        governmentIdFeed$analyze$1.L$3 = it2;
                        governmentIdFeed$analyze$1.L$4 = list3;
                        governmentIdFeed$analyze$1.label = 2;
                        Object mo4089analyze0E7RQCE2 = composableImageAnalyzer2.mo4089analyze0E7RQCE(imageToAnalyzeKt$toImageToAnalyze$12, rect, governmentIdFeed$analyze$1);
                        if (mo4089analyze0E7RQCE2 != coroutineSingletons) {
                            obj2 = mo4089analyze0E7RQCE2;
                            collection2 = list3;
                            collection2.add(new AnalyzerResult(obj2, false));
                            if (it2.hasNext()) {
                                imageToAnalyzeKt$toImageToAnalyze$12.getClass();
                                list.getClass();
                                if (list.isEmpty()) {
                                    Result.Companion companion = Result.Companion;
                                    return new Result.Failure(new AnalysisError.NoAnalyzerError());
                                }
                                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                                ref$ObjectRef2.element = governmentIdFeed.side;
                                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                                for (AnalyzerResult analyzerResult : list) {
                                    Object obj3 = analyzerResult.result;
                                    Result.Companion companion2 = Result.Companion;
                                    if (obj3 instanceof Result.Failure) {
                                        ref$ObjectRef = ref$ObjectRef2;
                                    } else {
                                        Ref$ObjectRef ref$ObjectRef7 = ref$ObjectRef2;
                                        combineResults_gIAlu_s$processAnalysisData(ref$BooleanRef, ref$ObjectRef4, ref$ObjectRef3, ref$ObjectRef7, ref$ObjectRef5, ref$BooleanRef2, ref$ObjectRef6, (AnalysisData) obj3, analyzerResult.isActiveAnalyzer);
                                        ref$ObjectRef = ref$ObjectRef7;
                                    }
                                    Ref$ObjectRef ref$ObjectRef8 = ref$ObjectRef5;
                                    Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef2;
                                    Ref$ObjectRef ref$ObjectRef9 = ref$ObjectRef6;
                                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj3);
                                    if (m4120exceptionOrNullimpl != null && th == null && analyzerResult.isActiveAnalyzer) {
                                        ref$BooleanRef3.element = true;
                                        th = m4120exceptionOrNullimpl;
                                    }
                                    ref$BooleanRef2 = ref$BooleanRef3;
                                    ref$ObjectRef2 = ref$ObjectRef;
                                    ref$ObjectRef5 = ref$ObjectRef8;
                                    ref$ObjectRef6 = ref$ObjectRef9;
                                }
                                Ref$ObjectRef ref$ObjectRef10 = ref$ObjectRef2;
                                Ref$ObjectRef ref$ObjectRef11 = ref$ObjectRef5;
                                Ref$ObjectRef ref$ObjectRef12 = ref$ObjectRef6;
                                if (ref$BooleanRef2.element) {
                                    if (th != null) {
                                        Result.Companion companion3 = Result.Companion;
                                        return new Result.Failure(th);
                                    }
                                    Result.Companion companion4 = Result.Companion;
                                    return new ParsedIdSideOrNone.None((ImageLightCondition) ref$ObjectRef12.element);
                                }
                                if (!ref$BooleanRef.element) {
                                    Result.Companion companion5 = Result.Companion;
                                    return new ParsedIdSideOrNone.None((ImageLightCondition) ref$ObjectRef12.element);
                                }
                                ParsedIdSideOrNone.Side side = (ParsedIdSideOrNone.Side) ref$ObjectRef10.element;
                                if (side == null) {
                                    Result.Companion companion6 = Result.Companion;
                                    return new ParsedIdSideOrNone.None((ImageLightCondition) ref$ObjectRef12.element);
                                }
                                Bitmap bitmap = (Bitmap) imageToAnalyzeKt$toImageToAnalyze$12.bitmap$delegate.getValue();
                                if (bitmap == null) {
                                    Result.Companion companion7 = Result.Companion;
                                    return new ParsedIdSideOrNone.None((ImageLightCondition) ref$ObjectRef12.element);
                                }
                                Result.Companion companion8 = Result.Companion;
                                return new ParsedIdSideOrNone.ParsedIdSide(side, bitmap, (ImageIdMetadata) ref$ObjectRef3.element, (BarcodeInfo) ref$ObjectRef4.element, (ExtractedTexts) ref$ObjectRef11.element, (ImageLightCondition) ref$ObjectRef12.element);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        governmentIdFeed$analyze$1 = new GovernmentIdFeed$analyze$1(governmentIdFeed, continuationImpl);
        Object obj4 = governmentIdFeed$analyze$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = governmentIdFeed$analyze$1.label;
        Throwable th2 = null;
        if (i != 0) {
        }
    }

    public static final void combineResults_gIAlu_s$processAnalysisData(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$BooleanRef ref$BooleanRef2, Ref$ObjectRef ref$ObjectRef5, AnalysisData analysisData, boolean z) {
        AnalysisData.Empty empty = AnalysisData.Empty.INSTANCE;
        if (!Intrinsics.areEqual(analysisData, empty) && z) {
            ref$BooleanRef.element = true;
        }
        if (analysisData instanceof AnalysisData.BarcodeAnalysisData) {
            if (ref$ObjectRef.element == null) {
                ref$ObjectRef.element = ((AnalysisData.BarcodeAnalysisData) analysisData).extractedBarcode;
                return;
            }
            return;
        }
        if (analysisData instanceof AnalysisData.IdFrontAnalysisData) {
            ref$ObjectRef2.element = ((AnalysisData.IdFrontAnalysisData) analysisData).metadata;
            return;
        }
        if (analysisData instanceof AnalysisData.FrontOrBackData) {
            AnalysisData.FrontOrBackData frontOrBackData = (AnalysisData.FrontOrBackData) analysisData;
            combineResults_gIAlu_s$processAnalysisData(ref$BooleanRef, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef4, ref$BooleanRef2, ref$ObjectRef5, frontOrBackData.frontOrBackData, z);
            ref$ObjectRef3.element = frontOrBackData.side;
        } else {
            if (analysisData instanceof AnalysisData.TextExtractionData) {
                ref$ObjectRef4.element = ((AnalysisData.TextExtractionData) analysisData).extractedTexts;
                return;
            }
            if (Intrinsics.areEqual(analysisData, empty)) {
                ref$BooleanRef2.element = true;
            } else if (analysisData instanceof AnalysisData.LightConditionData) {
                ref$ObjectRef5.element = ((AnalysisData.LightConditionData) analysisData).imageLightCondition;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }
    }

    @Override // com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer
    public final void analyze(Image image, int i) {
        image.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new GovernmentIdFeed$analyze$5(image, this, i, (Continuation) null, 0));
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.resultFlow.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.resultFlow.getReplayCache();
    }

    @Override // com.withpersona.sdk2.camera.feed.CameraFeed
    public final void setViewfinderRect(Rect rect, Rect rect2) {
        this.viewfinderInfo = new ViewfinderInfo(rect, rect2);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(SettableImageProxy settableImageProxy) {
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new Logger$log$1(settableImageProxy, this, (Continuation) null, 13));
    }
}
