package com.withpersona.sdk2.inquiry.selfie;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "com/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker_Factory_Impl", "selfie_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SelfieAnalyzeWorker implements Worker<Output>, WorkflowWorker {
    public final boolean captureOnPoseDetected;
    public int numRetries;
    public final Selfie.Pose pose;
    public final SdkFilesManager sdkFilesManager;
    public final Lazy selfieDirectionFeed;

    public abstract class Output {

        public final class Detected extends Output {
            public final SelfieBrightnessInfo brightnessInfo;
            public final Selfie selfie;

            public Detected(Selfie selfie, SelfieBrightnessInfo selfieBrightnessInfo) {
                this.selfie = selfie;
                this.brightnessInfo = selfieBrightnessInfo;
            }
        }

        public final class RuntimeError extends Output {
            public final Throwable error;

            public RuntimeError(Throwable th) {
                this.error = th;
            }
        }

        public final class SelfieDetectionError extends Output {
            public final SelfieBrightnessInfo brightnessInfo;
            public final SelfieError error;
            public final float poseScore;

            public SelfieDetectionError(SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo) {
                this.error = selfieError;
                this.poseScore = f;
                this.brightnessInfo = selfieBrightnessInfo;
            }
        }
    }

    public SelfieAnalyzeWorker(Lazy lazy, Selfie.Pose pose, boolean z, SdkFilesManager sdkFilesManager) {
        lazy.getClass();
        pose.getClass();
        sdkFilesManager.getClass();
        this.selfieDirectionFeed = lazy;
        this.pose = pose;
        this.captureOnPoseDetected = z;
        this.sdkFilesManager = sdkFilesManager;
    }

    public static final float access$calculatePoseScore(SelfieAnalyzeWorker selfieAnalyzeWorker, SelfieFrameInfo selfieFrameInfo, Selfie.Pose pose) {
        float min;
        int i = selfieFrameInfo.facesInFrame;
        float f = selfieFrameInfo.faceAngle;
        boolean z = selfieFrameInfo.isFaceCentered;
        boolean z2 = selfieFrameInfo.isFaceTooFar;
        boolean z3 = selfieFrameInfo.isFaceTooClose;
        if (i == 1) {
            int ordinal = pose.ordinal();
            if (ordinal == 0) {
                boolean z4 = (z3 || z2) ? false : true;
                float coerceIn = RangesKt___RangesKt.coerceIn((Math.abs(f) - 10.0f) / 90.0f, RecyclerView.DECELERATION_RATE, 1.0f);
                float f2 = z4 ? 0.33f : 0.0f;
                if (z) {
                    f2 += 0.17f;
                }
                return coerceIn > RecyclerView.DECELERATION_RATE ? (coerceIn * 0.5f) + f2 : f2;
            }
            if (ordinal != 1) {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return RecyclerView.DECELERATION_RATE;
                }
                if (!z3 && !z2 && z) {
                    min = Math.min(Math.abs(((-15.0f) - f) / (-15.0f)), 1.0f);
                    return 1.0f - min;
                }
            } else if (!z3 && !z2 && z) {
                min = Math.min(Math.abs((15.0f - f) / 15.0f), 1.0f);
                return 1.0f - min;
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (!(worker instanceof SelfieAnalyzeWorker)) {
            return false;
        }
        SelfieAnalyzeWorker selfieAnalyzeWorker = (SelfieAnalyzeWorker) worker;
        return selfieAnalyzeWorker.pose == this.pose && selfieAnalyzeWorker.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // com.squareup.workflow1.Worker
    public final Flow run() {
        Object obj = this.selfieDirectionFeed.get();
        obj.getClass();
        return FlowKt.flowOn(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(3, FlowKt.drop((Flow) obj, 1), this), Dispatchers.Default);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof SelfieAnalyzeWorker)) {
            return false;
        }
        SelfieAnalyzeWorker selfieAnalyzeWorker = (SelfieAnalyzeWorker) workflowWorker;
        return selfieAnalyzeWorker.pose == this.pose && selfieAnalyzeWorker.captureOnPoseDetected == this.captureOnPoseDetected;
    }
}
