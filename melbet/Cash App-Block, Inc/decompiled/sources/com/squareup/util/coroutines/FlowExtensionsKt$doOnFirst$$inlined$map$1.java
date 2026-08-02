package com.squareup.util.coroutines;

import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import app.cash.local.presenters.LocalPresenterFactoryKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.work.data.api.EmployerTaxForms;
import com.squareup.cash.work.data.real.LocationSettings;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.RealGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.RealShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.work.data.real.RealShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.work.data.real.RealShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.ShiftLoaderIdentity;
import com.squareup.cash.work.data.real.ShiftSettings;
import com.squareup.cash.work.data.real.SubscriptionStatus;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.presenters.WorkHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.work.presenters.pay.PayCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1;
import com.squareup.cash.work.session.SquareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1$2$1;
import com.squareup.cash.work.tinygraph.EntityOperationType;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.MembershipProperties;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.cash.work.tinygraph.real.RealJobRepository$getById$$inlined$getEntity$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository$getById$$inlined$getEntity$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository$getMembership$$inlined$getEntity$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository$getById$$inlined$getEntity$1$2$1;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository$getById$$inlined$getEntity$1$2$1;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent$PayCellViewEvent$DetailsClicked;
import com.squareup.cash.work.wages.real.EmployerIdentity;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.workflow1.RenderingAndSnapshot;
import com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1;
import com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.stripe.android.uicore.elements.OTPElement$special$$inlined$mapNotNull$1$2$1;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.ParsedIdSideOrNone;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1$emit$1;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1$emit$1;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class FlowExtensionsKt$doOnFirst$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 $this_unsafeTransform$inlined;

    public /* synthetic */ FlowExtensionsKt$doOnFirst$$inlined$map$1(FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowKt__LimitKt$drop$$inlined$unsafeFlow$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__LimitKt$drop$$inlined$unsafeFlow$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowKt__LimitKt$drop$$inlined$unsafeFlow$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 3), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 4), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 6), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1$2, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit((Object) null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.$r8$classId = 23;
            SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 sharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 = SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1.INSTANCE;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x02be  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0351  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x0398  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x03a2  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x03e9  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x03f3  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x0444  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x048b  */
        /* JADX WARN: Removed duplicated region for block: B:328:0x0495  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x04dc  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x04e6  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x051e  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0528  */
        /* JADX WARN: Removed duplicated region for block: B:388:0x0560  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x056a  */
        /* JADX WARN: Removed duplicated region for block: B:420:0x05c2  */
        /* JADX WARN: Removed duplicated region for block: B:426:0x05cc  */
        /* JADX WARN: Removed duplicated region for block: B:443:0x0622  */
        /* JADX WARN: Removed duplicated region for block: B:449:0x062c  */
        /* JADX WARN: Removed duplicated region for block: B:463:0x065e  */
        /* JADX WARN: Removed duplicated region for block: B:469:0x0668  */
        /* JADX WARN: Removed duplicated region for block: B:483:0x069a  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x06a4  */
        /* JADX WARN: Removed duplicated region for block: B:506:0x06dd  */
        /* JADX WARN: Removed duplicated region for block: B:512:0x06e7  */
        /* JADX WARN: Removed duplicated region for block: B:526:0x071a  */
        /* JADX WARN: Removed duplicated region for block: B:532:0x0724  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x0757  */
        /* JADX WARN: Removed duplicated region for block: B:552:0x0761  */
        /* JADX WARN: Removed duplicated region for block: B:566:0x0794  */
        /* JADX WARN: Removed duplicated region for block: B:572:0x079e  */
        /* JADX WARN: Removed duplicated region for block: B:598:0x07fb  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:604:0x0805  */
        /* JADX WARN: Removed duplicated region for block: B:630:0x086e  */
        /* JADX WARN: Removed duplicated region for block: B:636:0x087a  */
        /* JADX WARN: Removed duplicated region for block: B:721:0x09c8  */
        /* JADX WARN: Removed duplicated region for block: B:727:0x09d3  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0162  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1 realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1;
            int i2;
            Object obj2;
            Setting.CategorySetting categorySetting;
            FlowCollector flowCollector;
            long j;
            Duration m3794parseDurationLV8wdWc;
            RealGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1 realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1;
            int i3;
            Map map;
            RealGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1 realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1;
            int i4;
            RealShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1 realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1;
            int i5;
            RealShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1 realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1;
            int i6;
            RealShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1 realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1;
            int i7;
            RealTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1 realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1;
            int i8;
            MembershipProperties membershipProperties;
            WorkHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1 workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i9;
            PayCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1 payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i10;
            RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1 realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1;
            int i11;
            RealAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1 realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1;
            int i12;
            SquareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1 squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1;
            int i13;
            SquareAccountStore$userFlow$$inlined$map$1$2$1 squareAccountStore$userFlow$$inlined$map$1$2$1;
            int i14;
            RealJobRepository$getById$$inlined$getEntity$1$2$1 realJobRepository$getById$$inlined$getEntity$1$2$1;
            int i15;
            RealLocationRepository$getById$$inlined$getEntity$1$2$1 realLocationRepository$getById$$inlined$getEntity$1$2$1;
            int i16;
            RealMembershipRepository$getMembership$$inlined$getEntity$1$2$1 realMembershipRepository$getMembership$$inlined$getEntity$1$2$1;
            int i17;
            RealMerchantRepository$getById$$inlined$getEntity$1$2$1 realMerchantRepository$getById$$inlined$getEntity$1$2$1;
            int i18;
            RealPersonRepository$getById$$inlined$getEntity$1$2$1 realPersonRepository$getById$$inlined$getEntity$1$2$1;
            int i19;
            RealWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1 realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1;
            int i20;
            String str;
            String name;
            RealWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1 realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1;
            int i21;
            boolean z;
            Boolean valueOf;
            AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1 androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1;
            int i22;
            NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1 networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1;
            int i23;
            ComposeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1 composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1;
            int i24;
            FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1 financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1;
            int i25;
            OTPElement$special$$inlined$mapNotNull$1$2$1 oTPElement$special$$inlined$mapNotNull$1$2$1;
            int i26;
            FormFieldEntry formFieldEntry;
            int i27 = this.$r8$classId;
            FlowCollector flowCollector2 = this.$this_unsafeFlow;
            Duration duration = null;
            r9 = null;
            r9 = null;
            GovernmentIdHintWorker.HintEvent hintEvent = null;
            r9 = null;
            r9 = null;
            String str2 = null;
            IBaseEntity iBaseEntity = null;
            IBaseEntity iBaseEntity2 = null;
            IBaseEntity iBaseEntity3 = null;
            IBaseEntity iBaseEntity4 = null;
            IBaseEntity iBaseEntity5 = null;
            r9 = null;
            String str3 = null;
            r9 = null;
            Merchant.Subscription subscription = null;
            switch (i27) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i28 = anonymousClass1.label;
                        if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i28 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Object obj4 = ((Pair) obj).second;
                                obj4.getClass();
                                anonymousClass1.label = 1;
                                if (flowCollector2.emit(obj4, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj3);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 1:
                    if (continuation instanceof RealGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1) {
                        realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1 = (RealGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1) continuation;
                        int i29 = realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.label;
                        if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                            realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.label = i29 - PKIFailureInfo.systemUnavail;
                            Object obj5 = realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                Set set = RealGetClockInControlsUseCase.END_BREAK_EARLY_PERMISSIONS;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : (List) obj) {
                                    if (((Setting) obj6).category == Setting.Category.SHIFTS) {
                                        arrayList.add(obj6);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        EntityReference entityReference = ((Setting) obj2).providerId;
                                        if ((entityReference != null ? entityReference.entityType : null) == EntityType.MERCHANT_WRAPPER) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                Setting setting = (Setting) obj2;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    EntityReference entityReference2 = ((Setting) next).providerId;
                                    if ((entityReference2 != null ? entityReference2.entityType : null) == EntityType.LOCATION) {
                                        arrayList2.add(next);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = arrayList2.iterator();
                                FlowCollector flowCollector3 = flowCollector2;
                                while (it3.hasNext()) {
                                    Setting setting2 = (Setting) it3.next();
                                    EntityReference entityReference3 = setting2.providerId;
                                    entityReference3.getClass();
                                    String str4 = entityReference3.id;
                                    Setting.CategorySetting categorySetting2 = setting2.categorySetting;
                                    boolean areEqual = Intrinsics.areEqual(categorySetting2.canDeclareCashTips, Boolean.TRUE);
                                    String str5 = categorySetting2.automaticClockoutBuffer;
                                    Duration m3794parseDurationLV8wdWc2 = str5 != null ? RealGetClockInControlsUseCase.m3794parseDurationLV8wdWc(str5) : duration;
                                    String str6 = categorySetting2.earlyClockinBuffer;
                                    Duration m3794parseDurationLV8wdWc3 = str6 != null ? RealGetClockInControlsUseCase.m3794parseDurationLV8wdWc(str6) : duration;
                                    String str7 = categorySetting2.earlyBreakCompletionBuffer;
                                    Duration m3794parseDurationLV8wdWc4 = str7 != null ? RealGetClockInControlsUseCase.m3794parseDurationLV8wdWc(str7) : duration;
                                    String str8 = categorySetting2.minScheduledShiftBuffer;
                                    if (str8 == null || (m3794parseDurationLV8wdWc = RealGetClockInControlsUseCase.m3794parseDurationLV8wdWc(str8)) == null) {
                                        flowCollector = flowCollector3;
                                        Duration.Companion.getClass();
                                        j = 0;
                                    } else {
                                        flowCollector = flowCollector3;
                                        j = m3794parseDurationLV8wdWc.rawValue;
                                    }
                                    LocationSettings locationSettings = new LocationSettings(areEqual, m3794parseDurationLV8wdWc2, m3794parseDurationLV8wdWc3, m3794parseDurationLV8wdWc4, j, categorySetting2.geofenceRadiusInMeters);
                                    Pair pair = new Pair(str4, locationSettings);
                                    int indexOf$default = StringsKt.indexOf$default((CharSequence) str4, ':', 0, false, 6);
                                    if (indexOf$default >= 0) {
                                        str4 = str4.substring(indexOf$default + 1);
                                    }
                                    CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{pair, new Pair(str4, locationSettings)}), arrayList3);
                                    flowCollector3 = flowCollector;
                                    duration = null;
                                }
                                FlowCollector flowCollector4 = flowCollector3;
                                Map map2 = MapsKt__MapsKt.toMap(arrayList3);
                                if (setting != null && (categorySetting = setting.categorySetting) != null) {
                                    r4 = Intrinsics.areEqual(categorySetting.canClockinClockoutFromEmployeeApp, Boolean.TRUE);
                                }
                                ShiftSettings shiftSettings = new ShiftSettings(map2, r4);
                                realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(shiftSettings, realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj5);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1 = new RealGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realGetClockInControlsUseCase$getShiftSettings$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (continuation instanceof RealGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1) {
                        realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1 = (RealGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1) continuation;
                        int i30 = realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.label;
                        if ((i30 & PKIFailureInfo.systemUnavail) != 0) {
                            realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.label = i30 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                Merchant merchant = (Merchant) obj;
                                Set set2 = RealGetClockInControlsUseCase.END_BREAK_EARLY_PERMISSIONS;
                                if (merchant != null && (map = merchant.subscriptions) != null) {
                                    subscription = (Merchant.Subscription) map.get(Merchant.SubscriptionProduct.SHIFTS);
                                }
                                SubscriptionStatus subscriptionStatus = new SubscriptionStatus(subscription != null ? Intrinsics.areEqual(subscription.canEnforceEarlyTimecardActions, Boolean.TRUE) : false, subscription != null ? Intrinsics.areEqual(subscription.canUseAutoClockout, Boolean.TRUE) : false, subscription != null ? Intrinsics.areEqual(subscription.canUseGeofencing, Boolean.TRUE) : false);
                                realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(subscriptionStatus, realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj7);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1 = new RealGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = realGetClockInControlsUseCase$getSubscriptionStatus$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    if (continuation instanceof RealGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1) {
                        realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1 = (RealGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1) continuation;
                        int i31 = realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.label;
                        if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                            realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.label = i31 - PKIFailureInfo.systemUnavail;
                            Object obj8 = realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                ArrayList arrayList4 = new ArrayList();
                                for (Location location : (List) obj) {
                                    com.squareup.protos.wire.roster.mds.Unit protoModel = location.getProtoModel();
                                    Pair pair2 = protoModel != null ? new Pair(protoModel, location.coordinates) : null;
                                    if (pair2 != null) {
                                        arrayList4.add(pair2);
                                    }
                                }
                                realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(arrayList4, realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1 = new RealGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = realGetClockInEssentialsUseCase$getClockedOutEssentials$getLocationsWithCoordinates$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    if (continuation instanceof RealShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1) {
                        realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1 = (RealShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1) continuation;
                        int i32 = realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                MerchantIdentifier merchantIdentifier = (MerchantIdentifier) obj;
                                if (merchantIdentifier != null) {
                                    realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector2.emit(merchantIdentifier, realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1) == coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj9);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1 = new RealShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj92 = realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realShiftDataFetcher$awaitMerchant$$inlined$mapNotNull$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    if (continuation instanceof RealShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1) {
                        realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1 = (RealShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1) continuation;
                        int i33 = realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj10 = realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                String str9 = (String) obj;
                                if (str9 != null) {
                                    realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector2.emit(str9, realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1) == coroutineSingletons7) {
                                        return coroutineSingletons7;
                                    }
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj10);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1 = new RealShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj102 = realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realShiftDataFetcher$awaitTeamMemberId$$inlined$mapNotNull$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    if (continuation instanceof RealShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1) {
                        realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1 = (RealShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1) continuation;
                        int i34 = realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj11 = realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                ShiftLoaderIdentity shiftLoaderIdentity = (ShiftLoaderIdentity) obj;
                                if (shiftLoaderIdentity != null) {
                                    realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector2.emit(shiftLoaderIdentity, realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1) == coroutineSingletons8) {
                                        return coroutineSingletons8;
                                    }
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj11);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1 = new RealShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj112 = realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realShiftDataLoader$shiftLoaderContext$$inlined$mapNotNull$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    if (continuation instanceof RealTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1) {
                        realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1 = (RealTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1) continuation;
                        int i35 = realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                Membership membership = (Membership) obj;
                                if (membership != null && (membershipProperties = membership.properties) != null) {
                                    str3 = membershipProperties.teamMemberId;
                                }
                                realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(str3, realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1) == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj12);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1 = new RealTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realTeamMemberIdProvider$getTeamMemberId$lambda$0$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof WorkHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1 = (WorkHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i36 = workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj13 = workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                if (obj instanceof WorkHomeViewEvent.TitleBarViewEvent) {
                                    workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector2.emit(obj, workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons10) {
                                        return coroutineSingletons10;
                                    }
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj13);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1 = new WorkHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj132 = workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = workHomeTitleBarPresenter$rememberTitleBarViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    if (continuation instanceof PayCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1 = (PayCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i37 = payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj14 = payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                if (obj instanceof WorkHomeViewEvent$PayCellViewEvent$DetailsClicked) {
                                    payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector2.emit(obj, payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons11) {
                                        return coroutineSingletons11;
                                    }
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj14);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1 = new PayCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj142 = payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = payCellPresenter$rememberPayViewModel$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 10:
                    if (continuation instanceof RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1) {
                        realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1 = (RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1) continuation;
                        int i38 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj15 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                List list = (List) obj;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    arrayList5.add(((Membership) it4.next()).fromReference.id);
                                }
                                realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.label = 1;
                                if (flowCollector2.emit(arrayList5, realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1) == coroutineSingletons12) {
                                    return coroutineSingletons12;
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj15);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1 = new RealAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1(this, continuation);
                    Object obj152 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realAssignedLocationProvider$getLocationIds$lambda$0$$inlined$map$2$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    if (continuation instanceof RealAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1) {
                        realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1 = (RealAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1) continuation;
                        int i39 = realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj16 = realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it5 = ((List) obj).iterator();
                                while (it5.hasNext()) {
                                    com.squareup.protos.wire.roster.mds.Unit protoModel2 = ((Location) it5.next()).getProtoModel();
                                    String str10 = protoModel2 != null ? protoModel2.nickname : null;
                                    if (str10 != null) {
                                        arrayList6.add(str10);
                                    }
                                }
                                realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(arrayList6, realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1) == coroutineSingletons13) {
                                    return coroutineSingletons13;
                                }
                            } else {
                                if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj16);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1 = new RealAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1(this, continuation);
                    Object obj162 = realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realAssignedLocationProvider$getLocationNames$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                    return Unit.INSTANCE;
                case 12:
                    if (continuation instanceof SquareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1) {
                        squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1 = (SquareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1) continuation;
                        int i40 = squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj17 = squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                String str11 = (String) obj;
                                MerchantIdentifier merchantIdentifier2 = str11 != null ? new MerchantIdentifier(str11) : null;
                                squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(merchantIdentifier2, squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1) == coroutineSingletons14) {
                                    return coroutineSingletons14;
                                }
                            } else {
                                if (i13 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj17);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1 = new SquareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj172 = squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = squareAccountStore$selectedMerchantFlow$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    if (continuation instanceof SquareAccountStore$userFlow$$inlined$map$1$2$1) {
                        squareAccountStore$userFlow$$inlined$map$1$2$1 = (SquareAccountStore$userFlow$$inlined$map$1$2$1) continuation;
                        int i41 = squareAccountStore$userFlow$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            squareAccountStore$userFlow$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj18 = squareAccountStore$userFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = squareAccountStore$userFlow$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj18);
                                String str12 = (String) obj;
                                PersonIdentifier personIdentifier = str12 != null ? new PersonIdentifier(str12) : null;
                                squareAccountStore$userFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(personIdentifier, squareAccountStore$userFlow$$inlined$map$1$2$1) == coroutineSingletons15) {
                                    return coroutineSingletons15;
                                }
                            } else {
                                if (i14 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj18);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    squareAccountStore$userFlow$$inlined$map$1$2$1 = new SquareAccountStore$userFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj182 = squareAccountStore$userFlow$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = squareAccountStore$userFlow$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                    return Unit.INSTANCE;
                case 14:
                    if (continuation instanceof RealJobRepository$getById$$inlined$getEntity$1$2$1) {
                        realJobRepository$getById$$inlined$getEntity$1$2$1 = (RealJobRepository$getById$$inlined$getEntity$1$2$1) continuation;
                        int i42 = realJobRepository$getById$$inlined$getEntity$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realJobRepository$getById$$inlined$getEntity$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj19 = realJobRepository$getById$$inlined$getEntity$1$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = realJobRepository$getById$$inlined$getEntity$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                Pair pair3 = (Pair) obj;
                                IBaseEntity iBaseEntity6 = (IBaseEntity) pair3.first;
                                int ordinal = ((EntityOperationType) pair3.second).ordinal();
                                if (ordinal == 0) {
                                    iBaseEntity5 = iBaseEntity6;
                                } else if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realJobRepository$getById$$inlined$getEntity$1$2$1.label = 1;
                                if (flowCollector2.emit(iBaseEntity5, realJobRepository$getById$$inlined$getEntity$1$2$1) == coroutineSingletons16) {
                                    return coroutineSingletons16;
                                }
                            } else {
                                if (i15 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj19);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realJobRepository$getById$$inlined$getEntity$1$2$1 = new RealJobRepository$getById$$inlined$getEntity$1$2$1(this, continuation);
                    Object obj192 = realJobRepository$getById$$inlined$getEntity$1$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = realJobRepository$getById$$inlined$getEntity$1$2$1.label;
                    if (i15 != 0) {
                    }
                    return Unit.INSTANCE;
                case 15:
                    if (continuation instanceof RealLocationRepository$getById$$inlined$getEntity$1$2$1) {
                        realLocationRepository$getById$$inlined$getEntity$1$2$1 = (RealLocationRepository$getById$$inlined$getEntity$1$2$1) continuation;
                        int i43 = realLocationRepository$getById$$inlined$getEntity$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocationRepository$getById$$inlined$getEntity$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj20 = realLocationRepository$getById$$inlined$getEntity$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = realLocationRepository$getById$$inlined$getEntity$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                Pair pair4 = (Pair) obj;
                                IBaseEntity iBaseEntity7 = (IBaseEntity) pair4.first;
                                int ordinal2 = ((EntityOperationType) pair4.second).ordinal();
                                if (ordinal2 == 0) {
                                    iBaseEntity4 = iBaseEntity7;
                                } else if (ordinal2 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realLocationRepository$getById$$inlined$getEntity$1$2$1.label = 1;
                                if (flowCollector2.emit(iBaseEntity4, realLocationRepository$getById$$inlined$getEntity$1$2$1) == coroutineSingletons17) {
                                    return coroutineSingletons17;
                                }
                            } else {
                                if (i16 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj20);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocationRepository$getById$$inlined$getEntity$1$2$1 = new RealLocationRepository$getById$$inlined$getEntity$1$2$1(this, continuation);
                    Object obj202 = realLocationRepository$getById$$inlined$getEntity$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = realLocationRepository$getById$$inlined$getEntity$1$2$1.label;
                    if (i16 != 0) {
                    }
                    return Unit.INSTANCE;
                case 16:
                    if (continuation instanceof RealMembershipRepository$getMembership$$inlined$getEntity$1$2$1) {
                        realMembershipRepository$getMembership$$inlined$getEntity$1$2$1 = (RealMembershipRepository$getMembership$$inlined$getEntity$1$2$1) continuation;
                        int i44 = realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj21 = realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.result;
                            CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                Pair pair5 = (Pair) obj;
                                IBaseEntity iBaseEntity8 = (IBaseEntity) pair5.first;
                                int ordinal3 = ((EntityOperationType) pair5.second).ordinal();
                                if (ordinal3 == 0) {
                                    iBaseEntity3 = iBaseEntity8;
                                } else if (ordinal3 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.label = 1;
                                if (flowCollector2.emit(iBaseEntity3, realMembershipRepository$getMembership$$inlined$getEntity$1$2$1) == coroutineSingletons18) {
                                    return coroutineSingletons18;
                                }
                            } else {
                                if (i17 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj21);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realMembershipRepository$getMembership$$inlined$getEntity$1$2$1 = new RealMembershipRepository$getMembership$$inlined$getEntity$1$2$1(this, continuation);
                    Object obj212 = realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.result;
                    CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = realMembershipRepository$getMembership$$inlined$getEntity$1$2$1.label;
                    if (i17 != 0) {
                    }
                    return Unit.INSTANCE;
                case 17:
                    if (continuation instanceof RealMerchantRepository$getById$$inlined$getEntity$1$2$1) {
                        realMerchantRepository$getById$$inlined$getEntity$1$2$1 = (RealMerchantRepository$getById$$inlined$getEntity$1$2$1) continuation;
                        int i45 = realMerchantRepository$getById$$inlined$getEntity$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            realMerchantRepository$getById$$inlined$getEntity$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj22 = realMerchantRepository$getById$$inlined$getEntity$1$2$1.result;
                            CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = realMerchantRepository$getById$$inlined$getEntity$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj22);
                                Pair pair6 = (Pair) obj;
                                IBaseEntity iBaseEntity9 = (IBaseEntity) pair6.first;
                                int ordinal4 = ((EntityOperationType) pair6.second).ordinal();
                                if (ordinal4 == 0) {
                                    iBaseEntity2 = iBaseEntity9;
                                } else if (ordinal4 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realMerchantRepository$getById$$inlined$getEntity$1$2$1.label = 1;
                                if (flowCollector2.emit(iBaseEntity2, realMerchantRepository$getById$$inlined$getEntity$1$2$1) == coroutineSingletons19) {
                                    return coroutineSingletons19;
                                }
                            } else {
                                if (i18 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj22);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realMerchantRepository$getById$$inlined$getEntity$1$2$1 = new RealMerchantRepository$getById$$inlined$getEntity$1$2$1(this, continuation);
                    Object obj222 = realMerchantRepository$getById$$inlined$getEntity$1$2$1.result;
                    CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = realMerchantRepository$getById$$inlined$getEntity$1$2$1.label;
                    if (i18 != 0) {
                    }
                    return Unit.INSTANCE;
                case 18:
                    if (continuation instanceof RealPersonRepository$getById$$inlined$getEntity$1$2$1) {
                        realPersonRepository$getById$$inlined$getEntity$1$2$1 = (RealPersonRepository$getById$$inlined$getEntity$1$2$1) continuation;
                        int i46 = realPersonRepository$getById$$inlined$getEntity$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            realPersonRepository$getById$$inlined$getEntity$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj23 = realPersonRepository$getById$$inlined$getEntity$1$2$1.result;
                            CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = realPersonRepository$getById$$inlined$getEntity$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                Pair pair7 = (Pair) obj;
                                IBaseEntity iBaseEntity10 = (IBaseEntity) pair7.first;
                                int ordinal5 = ((EntityOperationType) pair7.second).ordinal();
                                if (ordinal5 == 0) {
                                    iBaseEntity = iBaseEntity10;
                                } else if (ordinal5 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realPersonRepository$getById$$inlined$getEntity$1$2$1.label = 1;
                                if (flowCollector2.emit(iBaseEntity, realPersonRepository$getById$$inlined$getEntity$1$2$1) == coroutineSingletons20) {
                                    return coroutineSingletons20;
                                }
                            } else {
                                if (i19 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj23);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realPersonRepository$getById$$inlined$getEntity$1$2$1 = new RealPersonRepository$getById$$inlined$getEntity$1$2$1(this, continuation);
                    Object obj232 = realPersonRepository$getById$$inlined$getEntity$1$2$1.result;
                    CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = realPersonRepository$getById$$inlined$getEntity$1$2$1.label;
                    if (i19 != 0) {
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof RealWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1) {
                        realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1 = (RealWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1) continuation;
                        int i47 = realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj24 = realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                ArrayList arrayList7 = new ArrayList();
                                for (Merchant merchant2 : (List) obj) {
                                    MerchantIdentifier identifier = LocalPresenterFactoryKt.getIdentifier(merchant2);
                                    EmployerIdentity employerIdentity = (identifier == null || (str = identifier.token) == null || (name = MerchantKt.getName(merchant2)) == null) ? null : new EmployerIdentity(name, str);
                                    if (employerIdentity != null) {
                                        arrayList7.add(employerIdentity);
                                    }
                                }
                                StringCompanionObject.INSTANCE.getClass();
                                String.CASE_INSENSITIVE_ORDER.getClass();
                                List sortedWith = CollectionsKt.sortedWith(arrayList7, new SemanticsSortKt$special$$inlined$thenBy$1(new SemanticsSortKt$special$$inlined$thenBy$1(new LinkedHashTreeMap.AnonymousClass1(17), 18), 19));
                                realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(sortedWith, realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1) == coroutineSingletons21) {
                                    return coroutineSingletons21;
                                }
                            } else {
                                if (i20 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj24);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1 = new RealWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1(this, continuation);
                    Object obj242 = realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = realWagesTaxDocumentManager$getWagesDocumentsByEmployer$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof RealWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1) {
                        realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1 = (RealWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1) continuation;
                        int i48 = realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj25 = realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                List list2 = (List) obj;
                                List list3 = list2;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it6 = list3.iterator();
                                    while (it6.hasNext()) {
                                        if (!((EmployerTaxForms) it6.next()).forms.isEmpty()) {
                                            z = true;
                                            Timber.Forest.d("WagesTaxDocs: hasWagesDocuments emitting " + z + " (" + list2.size() + " employers)", new Object[0]);
                                            valueOf = Boolean.valueOf(z);
                                            realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector2.emit(valueOf, realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1) == coroutineSingletons22) {
                                                return coroutineSingletons22;
                                            }
                                        }
                                    }
                                }
                                z = false;
                                Timber.Forest.d("WagesTaxDocs: hasWagesDocuments emitting " + z + " (" + list2.size() + " employers)", new Object[0]);
                                valueOf = Boolean.valueOf(z);
                                realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(valueOf, realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1) == coroutineSingletons22) {
                                }
                            } else {
                                if (i21 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj25);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1 = new RealWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1(this, continuation);
                    Object obj252 = realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = realWagesTaxDocumentManager$hasWagesDocuments$$inlined$map$1$2$1.label;
                    if (i21 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    if (continuation instanceof AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1) {
                        androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1 = (AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1) continuation;
                        int i49 = androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj26 = androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                Object obj27 = ((RenderingAndSnapshot) obj).rendering;
                                androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(obj27, androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1) == coroutineSingletons23) {
                                    return coroutineSingletons23;
                                }
                            } else {
                                if (i22 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj26);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1 = new AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1(this, continuation);
                    Object obj262 = androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = androidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                    return Unit.INSTANCE;
                case 22:
                    if (continuation instanceof NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1) {
                        networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1 = (NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1) continuation;
                        int i50 = networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj28 = networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj28);
                                FormFieldEntry formFieldEntry2 = (FormFieldEntry) obj;
                                if (!formFieldEntry2.isComplete) {
                                    formFieldEntry2 = null;
                                }
                                String str13 = formFieldEntry2 != null ? formFieldEntry2.value : null;
                                networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(str13, networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1) == coroutineSingletons24) {
                                    return coroutineSingletons24;
                                }
                            } else {
                                if (i23 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj28);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1 = new NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1(this, continuation);
                    Object obj282 = networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = networkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1.label;
                    if (i23 != 0) {
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (continuation instanceof ComposeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1) {
                        composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1 = (ComposeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1) continuation;
                        int i51 = composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj29 = composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 sharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 = SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1.INSTANCE;
                                WebAuthFlowState webAuthFlowState = ((FinancialConnectionsSheetNativeState) obj).webAuthFlow;
                                composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(webAuthFlowState, composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1) == coroutineSingletons25) {
                                    return coroutineSingletons25;
                                }
                            } else {
                                if (i24 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj29);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1 = new ComposeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj292 = composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = composeExtensionsKt$collectAsState$lambda$0$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                    return Unit.INSTANCE;
                case 24:
                    if (continuation instanceof FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1 = (FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i52 = financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj30 = financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect = ((FinancialConnectionsSheetNativeState) obj).viewEffect;
                                financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector2.emit(financialConnectionsSheetNativeViewEffect, financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons26) {
                                    return coroutineSingletons26;
                                }
                            } else {
                                if (i25 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj30);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1 = new FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj302 = financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = financialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i25 != 0) {
                    }
                    return Unit.INSTANCE;
                case 25:
                    if (continuation instanceof OTPElement$special$$inlined$mapNotNull$1$2$1) {
                        oTPElement$special$$inlined$mapNotNull$1$2$1 = (OTPElement$special$$inlined$mapNotNull$1$2$1) continuation;
                        int i53 = oTPElement$special$$inlined$mapNotNull$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            oTPElement$special$$inlined$mapNotNull$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj31 = oTPElement$special$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = oTPElement$special$$inlined$mapNotNull$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                Pair pair8 = (Pair) CollectionsKt.firstOrNull((List) obj);
                                if (pair8 != null && (formFieldEntry = (FormFieldEntry) pair8.second) != null) {
                                    if (!formFieldEntry.isComplete) {
                                        formFieldEntry = null;
                                    }
                                    if (formFieldEntry != null) {
                                        str2 = formFieldEntry.value;
                                    }
                                }
                                if (str2 != null) {
                                    oTPElement$special$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector2.emit(str2, oTPElement$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons27) {
                                        return coroutineSingletons27;
                                    }
                                }
                            } else {
                                if (i26 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj31);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    oTPElement$special$$inlined$mapNotNull$1$2$1 = new OTPElement$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj312 = oTPElement$special$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = oTPElement$special$$inlined$mapNotNull$1$2$1.label;
                    if (i26 != 0) {
                    }
                    return Unit.INSTANCE;
                case 26:
                    return emit((DocumentFileUploadWorker.Response) obj, continuation);
                case 27:
                    Object emit = flowCollector2.emit(new DocumentFileUploadWorker.Response.ProgressUpdate(((Number) obj).intValue()), continuation);
                    return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
                case 28:
                    return emit((GovernmentIdHintWorker.HintEvent) obj, continuation);
                default:
                    Object obj33 = ((Result) obj).value;
                    if (Result.m4120exceptionOrNullimpl(obj33) == null) {
                        ParsedIdSideOrNone parsedIdSideOrNone = (ParsedIdSideOrNone) obj33;
                        if (parsedIdSideOrNone instanceof ParsedIdSideOrNone.ParsedIdSide) {
                            hintEvent = new GovernmentIdHintWorker.HintEvent(HoldStillHint.INSTANCE);
                        } else {
                            ImageLightCondition imageLightCondition = parsedIdSideOrNone.getImageLightCondition();
                            if (imageLightCondition != null) {
                                double d = imageLightCondition.lowHighContrast;
                                double d2 = imageLightCondition.rmsContrast;
                                boolean z2 = d2 < 0.2d || d < 0.2d;
                                if (d2 > 0.3d && d > 0.5d) {
                                    r4 = true;
                                }
                                double d3 = imageLightCondition.luminosity;
                                if ((d3 < 0.34d && !r4) || (d3 < 0.45d && z2)) {
                                    hintEvent = new GovernmentIdHintWorker.HintEvent(LowLightHint.INSTANCE);
                                }
                            }
                        }
                        Object emit2 = flowCollector2.emit(hintEvent, continuation);
                        if (emit2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return emit2;
                        }
                    } else {
                        Object emit3 = flowCollector2.emit(null, continuation);
                        if (emit3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return emit3;
                        }
                    }
                    return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(r7, r0) != r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
        
            if (r7.$this_unsafeFlow.emit(r9, r0) == r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(GovernmentIdHintWorker.HintEvent hintEvent, Continuation continuation) {
            GovernmentIdHintWorker$run$1$1$emit$1 governmentIdHintWorker$run$1$1$emit$1;
            int i;
            long j;
            if (continuation instanceof GovernmentIdHintWorker$run$1$1$emit$1) {
                governmentIdHintWorker$run$1$1$emit$1 = (GovernmentIdHintWorker$run$1$1$emit$1) continuation;
                int i2 = governmentIdHintWorker$run$1$1$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    governmentIdHintWorker$run$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = governmentIdHintWorker$run$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = governmentIdHintWorker$run$1$1$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Hint hint = hintEvent != null ? hintEvent.hint : null;
                        governmentIdHintWorker$run$1$1$emit$1.L$0 = hintEvent;
                        governmentIdHintWorker$run$1$1$emit$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hintEvent = governmentIdHintWorker$run$1$1$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    j = hintEvent == null ? 1000L : 0L;
                    if (j < 33) {
                        j = 33;
                    }
                    governmentIdHintWorker$run$1$1$emit$1.L$0 = null;
                    governmentIdHintWorker$run$1$1$emit$1.label = 2;
                }
            }
            governmentIdHintWorker$run$1$1$emit$1 = new GovernmentIdHintWorker$run$1$1$emit$1(this, continuation);
            Object obj2 = governmentIdHintWorker$run$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = governmentIdHintWorker$run$1$1$emit$1.label;
            if (i != 0) {
            }
            if (hintEvent == null) {
            }
            if (j < 33) {
            }
            governmentIdHintWorker$run$1$1$emit$1.L$0 = null;
            governmentIdHintWorker$run$1$1$emit$1.label = 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(DocumentFileUploadWorker.Response response, Continuation continuation) {
            DocumentFileUploadWorker$run$1$1$emit$1 documentFileUploadWorker$run$1$1$emit$1;
            int i;
            if (continuation instanceof DocumentFileUploadWorker$run$1$1$emit$1) {
                documentFileUploadWorker$run$1$1$emit$1 = (DocumentFileUploadWorker$run$1$1$emit$1) continuation;
                int i2 = documentFileUploadWorker$run$1$1$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    documentFileUploadWorker$run$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = documentFileUploadWorker$run$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = documentFileUploadWorker$run$1$1$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        documentFileUploadWorker$run$1$1$emit$1.L$0 = response;
                        documentFileUploadWorker$run$1$1$emit$1.label = 1;
                        if (this.$this_unsafeFlow.emit(response, documentFileUploadWorker$run$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        response = documentFileUploadWorker$run$1$1$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (!(response instanceof DocumentFileUploadWorker.Response.DocumentUploadError) || (response instanceof DocumentFileUploadWorker.Response.NetworkError)) {
                        JobKt.cancel(documentFileUploadWorker$run$1$1$emit$1.getContext(), (CancellationException) null);
                    }
                    return Unit.INSTANCE;
                }
            }
            documentFileUploadWorker$run$1$1$emit$1 = new DocumentFileUploadWorker$run$1$1$emit$1(this, continuation);
            Object obj2 = documentFileUploadWorker$run$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = documentFileUploadWorker$run$1$1$emit$1.label;
            if (i != 0) {
            }
            if (!(response instanceof DocumentFileUploadWorker.Response.DocumentUploadError)) {
            }
            JobKt.cancel(documentFileUploadWorker$run$1$1$emit$1.getContext(), (CancellationException) null);
            return Unit.INSTANCE;
        }
    }
}
