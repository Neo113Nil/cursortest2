package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.AamvaExtraction;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker;", "Lcom/squareup/workflow1/Worker;", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "com/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker_Factory_Impl", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GovernmentIdAnalyzeWorker implements Worker<Result>, WorkflowWorker {
    public AutocaptureState autocaptureState;
    public final Context context;
    public final GovernmentIdFeed governmentIdFeed;
    public final String idClassKey;
    public final SdkFilesManager sdkFilesManager;
    public final IdConfig.Side side;

    public GovernmentIdAnalyzeWorker(Context context, GovernmentIdFeed governmentIdFeed, SdkFilesManager sdkFilesManager, IdConfig.Side side, String str) {
        context.getClass();
        governmentIdFeed.getClass();
        sdkFilesManager.getClass();
        side.getClass();
        str.getClass();
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.sdkFilesManager = sdkFilesManager;
        this.side = side;
        this.idClassKey = str;
        this.autocaptureState = new AutocaptureState(EmptyList.INSTANCE);
    }

    /* renamed from: access$createGovernmentId-IoAF18A, reason: not valid java name */
    public static final Object m4093access$createGovernmentIdIoAF18A(GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker, ParsedIdSideOrNone.ParsedIdSide parsedIdSide) {
        GovernmentId.Side side;
        try {
            Bitmap bitmap = parsedIdSide.bitmap;
            SdkFilesManager sdkFilesManager = governmentIdAnalyzeWorker.sdkFilesManager;
            sdkFilesManager.getClass();
            File newRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(newRandomSessionFile);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                fileOutputStream.close();
                String absolutePath = newRandomSessionFile.getAbsolutePath();
                absolutePath.getClass();
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Frame(absolutePath));
                int ordinal = parsedIdSide.side.ordinal();
                if (ordinal == 0) {
                    side = GovernmentId.Side.FRONT;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    side = GovernmentId.Side.BACK;
                }
                String str = governmentIdAnalyzeWorker.idClassKey;
                GovernmentId.CaptureMethod.AUTO auto = GovernmentId.CaptureMethod.AUTO;
                BarcodeInfo barcodeInfo = parsedIdSide.extractedBarcode;
                RawExtraction rawExtraction = null;
                if (barcodeInfo != null) {
                    barcodeInfo.getClass();
                    if (barcodeInfo instanceof BarcodeInfo.MrzBarcodeInfo) {
                        rawExtraction = new RawExtraction("mrz", ((BarcodeInfo.MrzBarcodeInfo) barcodeInfo).extractionRawPayload);
                    } else if (barcodeInfo instanceof BarcodeInfo.Pdf417BarcodeInfo) {
                        rawExtraction = new RawExtraction("pdf417", ((BarcodeInfo.Pdf417BarcodeInfo) barcodeInfo).extractionRawPayload);
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
                GovernmentId.GovernmentIdImage governmentIdImage = new GovernmentId.GovernmentIdImage(listOf, side, str, auto, rawExtraction, getIdDetails(parsedIdSide));
                Result.Companion companion = Result.Companion;
                return governmentIdImage;
            } finally {
            }
        } catch (IOException e) {
            Result.Companion companion2 = Result.Companion;
            return new Result.Failure(e);
        }
    }

    public static GovernmentIdDetails getIdDetails(ParsedIdSideOrNone.ParsedIdSide parsedIdSide) {
        BarcodeInfo barcodeInfo = parsedIdSide.extractedBarcode;
        if (barcodeInfo == null) {
            ExtractedTexts extractedTexts = parsedIdSide.extractedTexts;
            if (extractedTexts != null) {
                return new GovernmentIdDetails(extractedTexts.dateOfBirth, extractedTexts.expirationDate);
            }
            return null;
        }
        if (barcodeInfo instanceof BarcodeInfo.MrzBarcodeInfo) {
            BarcodeInfo.MrzBarcodeInfo mrzBarcodeInfo = (BarcodeInfo.MrzBarcodeInfo) barcodeInfo;
            return new GovernmentIdDetails(mrzBarcodeInfo.birthdate, mrzBarcodeInfo.expirationDate);
        }
        if (!(barcodeInfo instanceof BarcodeInfo.Pdf417BarcodeInfo)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        BarcodeInfo.Pdf417BarcodeInfo pdf417BarcodeInfo = (BarcodeInfo.Pdf417BarcodeInfo) barcodeInfo;
        AamvaExtraction values = pdf417BarcodeInfo.values();
        Date date = values != null ? values.birthdate : null;
        AamvaExtraction values2 = pdf417BarcodeInfo.values();
        return new GovernmentIdDetails(date, values2 != null ? values2.expirationDate : null);
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return (worker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) worker).side == this.side;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdAnalyzeWorker)) {
            return false;
        }
        GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) obj;
        return Intrinsics.areEqual(this.context, governmentIdAnalyzeWorker.context) && Intrinsics.areEqual(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && Intrinsics.areEqual(this.sdkFilesManager, governmentIdAnalyzeWorker.sdkFilesManager) && this.side == governmentIdAnalyzeWorker.side && Intrinsics.areEqual(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    public final int hashCode() {
        return this.idClassKey.hashCode() + ((this.side.hashCode() + ((this.sdkFilesManager.hashCode() + ((this.governmentIdFeed.hashCode() + (this.context.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(2, this.governmentIdFeed, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GovernmentIdAnalyzeWorker(context=");
        sb.append(this.context);
        sb.append(", governmentIdFeed=");
        sb.append(this.governmentIdFeed);
        sb.append(", sdkFilesManager=");
        sb.append(this.sdkFilesManager);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", idClassKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.idClassKey, ")");
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return (workflowWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) workflowWorker).side == this.side;
    }
}
