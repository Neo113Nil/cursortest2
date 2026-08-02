package com.withpersona.sdk2.camera;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer;
import com.withpersona.sdk2.camera.feed.CameraFeed;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import okhttp3.Cache;

/* loaded from: classes5.dex */
public final class SelfieDirectionFeed implements CameraFeed, ImageAnalysis.Analyzer, SharedFlow, Camera2ImageAnalyzer {
    public final MutableSharedFlow resultFlow;
    public final SelfieProcessor selfieProcessor;

    public SelfieDirectionFeed(SelfieProcessor selfieProcessor, MutableSharedFlow mutableSharedFlow) {
        selfieProcessor.getClass();
        mutableSharedFlow.getClass();
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = mutableSharedFlow;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(SettableImageProxy settableImageProxy) {
        try {
            SelfieProcessor selfieProcessor = this.selfieProcessor;
            selfieProcessor.getClass();
            ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyze = ImageToAnalyzeKt.toImageToAnalyze(settableImageProxy);
            SelfieFrameInfo selfieFrameInfo = imageToAnalyze == null ? new SelfieFrameInfo(null, SelfieError.Other, 0, false, false, false, RecyclerView.DECELERATION_RATE, null) : selfieProcessor.direction(imageToAnalyze);
            Cache.Companion.closeFinally(settableImageProxy, null);
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new SelfieDirectionFeed$analyze$1(this, selfieFrameInfo, null, 0));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Cache.Companion.closeFinally(settableImageProxy, th);
                throw th2;
            }
        }
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
        SelfieProcessor selfieProcessor = this.selfieProcessor;
        selfieProcessor.getClass();
        selfieProcessor.viewfinderInfo = new ViewfinderInfo(rect, rect2);
    }

    @Override // com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer
    public final void analyze(Image image, int i) {
        image.getClass();
        try {
            SelfieProcessor selfieProcessor = this.selfieProcessor;
            selfieProcessor.getClass();
            SelfieFrameInfo direction = selfieProcessor.direction(new ImageToAnalyzeKt$toImageToAnalyze$1(image, i));
            Cache.Companion.closeFinally(image, null);
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new SelfieDirectionFeed$analyze$1(this, direction, null, 1));
        } finally {
        }
    }
}
