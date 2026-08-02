package com.withpersona.sdk2.inquiry.governmentid.network;

import com.squareup.moshi.JsonClass;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.governmentid.ConversionsKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import net.idrnd.misnap.iad.Payload;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Factory", "Response", "AutoClassificationResult", "SupplementaryData", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoClassifyWorker implements Worker<Response>, WorkflowWorker {
    public final long defaultManualCaptureDelayMs;
    public final boolean extractTextFromImage;
    public final String fromComponent;
    public final String fromStep;
    public final GovernmentId governmentId;
    public final Payload idFrontAnalyzer;
    public final RealImageHelper imageHelper;
    public final String inquiryId;
    public final GovernmentIdService service;
    public final String sessionToken;
    public final SupplementaryData supplementaryData;

    public interface AutoClassificationResult {

        public final class IdClassifySuccess implements AutoClassificationResult {
            public final IdConfig idConfig;

            public IdClassifySuccess(String str, IdConfig idConfig) {
                str.getClass();
                this.idConfig = idConfig;
            }
        }

        public final class IdTypeRejected implements AutoClassificationResult {
            public final ArrayList idClassesPerCountry;

            public IdTypeRejected(ArrayList arrayList) {
                this.idClassesPerCountry = arrayList;
            }
        }

        public final class UnableToClassify implements AutoClassificationResult {
            public final ArrayList idClassesPerCountry;

            public UnableToClassify(ArrayList arrayList) {
                this.idClassesPerCountry = arrayList;
            }
        }
    }

    public final class Factory {
        public final RealImageHelper imageHelper;
        public final GovernmentIdService service;

        public Factory(GovernmentIdService governmentIdService, RealImageHelper realImageHelper) {
            governmentIdService.getClass();
            realImageHelper.getClass();
            this.service = governmentIdService;
            this.imageHelper = realImageHelper;
        }
    }

    public interface Response {

        public final class Error implements Response {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo internalErrorInfo) {
                internalErrorInfo.getClass();
                this.cause = internalErrorInfo;
            }
        }

        public final class Success implements Response {
            public final AutoClassificationResult autoClassificationResult;

            public Success(AutoClassificationResult autoClassificationResult) {
                this.autoClassificationResult = autoClassificationResult;
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SupplementaryData {
    }

    public AutoClassifyWorker(String str, String str2, String str3, String str4, GovernmentIdService governmentIdService, GovernmentId governmentId, RealImageHelper realImageHelper, SupplementaryData supplementaryData, long j, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        governmentIdService.getClass();
        governmentId.getClass();
        realImageHelper.getClass();
        this.sessionToken = str;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.service = governmentIdService;
        this.governmentId = governmentId;
        this.imageHelper = realImageHelper;
        this.supplementaryData = supplementaryData;
        this.defaultManualCaptureDelayMs = j;
        this.extractTextFromImage = z;
        this.idFrontAnalyzer = new Payload(9);
    }

    public static final ArrayList access$to(AutoClassifyWorker autoClassifyWorker, List list) {
        List<AutoClassifyResponse.IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AutoClassifyResponse.IdClassesForCountry idClassesForCountry : list2) {
            String str = idClassesForCountry.countryName;
            String str2 = idClassesForCountry.countryCode;
            List list3 = idClassesForCountry.idConfigs;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                IdConfig idConfig = ConversionsKt.toIdConfig((Id) it.next(), str2, autoClassifyWorker.defaultManualCaptureDelayMs);
                if (idConfig != null) {
                    arrayList2.add(idConfig);
                }
            }
            arrayList.add(new IdConfigForCountry(str, str2, arrayList2));
        }
        return arrayList;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (worker instanceof AutoClassifyWorker) {
            return Intrinsics.areEqual(this.sessionToken, ((AutoClassifyWorker) worker).sessionToken);
        }
        return false;
    }

    @Override // com.squareup.workflow1.Worker
    public final Flow run() {
        return FlowKt.flowOn(new SafeFlow(new AutoClassifyWorker$run$1(this, null)), Dispatchers.Default);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (workflowWorker instanceof AutoClassifyWorker) {
            return Intrinsics.areEqual(this.sessionToken, ((AutoClassifyWorker) workflowWorker).sessionToken);
        }
        return false;
    }
}
