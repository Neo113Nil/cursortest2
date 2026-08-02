package com.squareup.cash.wallet.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.material3.TooltipKt$TooltipBox$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.maps.zzai;
import com.google.firebase.messaging.RemoteMessage;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewContactOptions;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewNodes;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.profile.views.KonfettiState;
import com.squareup.cash.profile.views.OpenSourceKt$OpenSource$1$1$2;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$10$1;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.ArticlesService$AllArticlesResult;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.taptopay.backend.api.EmvCardStatus;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import com.squareup.cash.taptopay.encryption.api.HieroglyphPanData;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.cash.treehouse.navigation.TreehouseRoutingParams;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.gcm.PushMessagingService;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.wallet.db.CardTabHeroState;
import com.squareup.cash.wallet.db.CardTabHeroStateQueries$select$2;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.Quadruple;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$WorkflowWorkerWithHandler;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import dev.chrisbanes.haze.Pool;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import nl.dionsegijn.konfetti.core.Particle;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartySystem;
import nl.dionsegijn.konfetti.core.PartySystem$render$2;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Rotation;
import nl.dionsegijn.konfetti.core.emitter.Confetti;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.emitter.PartyEmitter;
import nl.dionsegijn.konfetti.core.models.CoreRectImpl;
import nl.dionsegijn.konfetti.core.models.ReferenceImage;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Size;
import nl.dionsegijn.konfetti.core.models.Vector;
import nl.dionsegijn.konfetti.xml.image.DrawableImage;
import nl.dionsegijn.konfetti.xml.image.ImageStore;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.slf4j.Logger;
import papa.SafeTrace;
import timber.log.Timber;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class HeroCardViewKt$Render$1$4$1 extends SuspendLambda implements Function2 {
    public Object $cardEnabled$delegate;
    public final /* synthetic */ Object $cardLocked$delegate;
    public final /* synthetic */ Object $interactiveCardState$delegate;
    public Object $isCardPressed$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $showLoadingSpinner$delegate;
    public Object $showPrepurchaseContourText$delegate;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCardViewKt$Render$1$4$1(CardSchemeViewModel.Module.CardAnimation cardAnimation, MutableState mutableState, MutableState mutableState2, MutableSharedFlow mutableSharedFlow, MutableState mutableState3, CardWobbleState cardWobbleState, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.L$0 = cardAnimation;
        this.$cardEnabled$delegate = mutableState;
        this.$showPrepurchaseContourText$delegate = mutableState2;
        this.$isCardPressed$delegate = mutableSharedFlow;
        this.$showLoadingSpinner$delegate = mutableState3;
        this.$cardLocked$delegate = cardWobbleState;
        this.$interactiveCardState$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$showLoadingSpinner$delegate;
        Object obj3 = this.$cardLocked$delegate;
        Object obj4 = this.$interactiveCardState$delegate;
        switch (i) {
            case 0:
                HeroCardViewKt$Render$1$4$1 heroCardViewKt$Render$1$4$1 = new HeroCardViewKt$Render$1$4$1((State) this.$isCardPressed$delegate, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, (MutableState) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 0);
                heroCardViewKt$Render$1$4$1.L$0 = obj;
                return heroCardViewKt$Render$1$4$1;
            case 1:
                HeroCardViewKt$Render$1$4$1 heroCardViewKt$Render$1$4$12 = new HeroCardViewKt$Render$1$4$1((CardTabHeroState) obj2, (ProduceStateScope) obj4, (CardSchemePresenter) obj3, continuation, 1);
                heroCardViewKt$Render$1$4$12.L$0 = obj;
                return heroCardViewKt$Render$1$4$12;
            case 2:
                HeroCardViewKt$Render$1$4$1 heroCardViewKt$Render$1$4$13 = new HeroCardViewKt$Render$1$4$1((CardSchemePresenter) this.$isCardPressed$delegate, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, (MutableState) obj2, (MutableState) obj4, (ParcelableSnapshotMutableIntState) obj3, continuation, 2);
                heroCardViewKt$Render$1$4$13.L$0 = obj;
                return heroCardViewKt$Render$1$4$13;
            case 3:
                return new HeroCardViewKt$Render$1$4$1((CardSchemeViewModel.Module.CardAnimation) this.L$0, (State) this.$isCardPressed$delegate, (MutableState) this.$cardEnabled$delegate, (MutableSharedFlow) obj4, (MutableState) this.$showPrepurchaseContourText$delegate, (CardWobbleState) obj3, (MutableState) obj2, continuation);
            case 4:
                return new HeroCardViewKt$Render$1$4$1((CardSchemeViewModel.Module.CardAnimation) this.L$0, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, (MutableSharedFlow) this.$isCardPressed$delegate, (MutableState) obj2, (CardWobbleState) obj3, (MutableState) obj4, continuation);
            case 5:
                HeroCardViewKt$Render$1$4$1 heroCardViewKt$Render$1$4$14 = new HeroCardViewKt$Render$1$4$1((Flow) this.$isCardPressed$delegate, continuation, (ShareSheetPresenter) obj2, (AskedQuestion) obj4, (CoroutineScope) obj3, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate);
                heroCardViewKt$Render$1$4$14.L$0 = obj;
                return heroCardViewKt$Render$1$4$14;
            case 6:
                return new HeroCardViewKt$Render$1$4$1((SubtreeManager) obj2, (WorkflowWorker) obj4, (Function1) obj3, continuation, 6);
            default:
                return new HeroCardViewKt$Render$1$4$1((Ref$ObjectRef) this.L$0, (List) this.$isCardPressed$delegate, (ImageStore) obj4, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, (OpenSourceKt$OpenSource$1$1$2) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((HeroCardViewKt$Render$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((HeroCardViewKt$Render$1$4$1) create((Quadruple) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((HeroCardViewKt$Render$1$4$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((HeroCardViewKt$Render$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((HeroCardViewKt$Render$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((HeroCardViewKt$Render$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((HeroCardViewKt$Render$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                ((HeroCardViewKt$Render$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0397, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3 != null ? r3.card_token : null, r7.token) == false) goto L119;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProduceStateScope produceStateScope;
        Object none;
        CardTheme cardTheme;
        CardSchemeViewModel.Module.CustomizationImage customizationImage;
        Object firstOrNull;
        CardTheme cardTheme2;
        ProduceStateScope produceStateScope2;
        SubtreeManager subtreeManager;
        MutexImpl mutexImpl;
        Function1 function1;
        WorkflowWorker workflowWorker;
        Object obj2;
        Object obj3;
        Iterator it;
        Object obj4;
        Function1 function12;
        int i = this.$r8$classId;
        int i2 = 3;
        Object obj5 = this.$showLoadingSpinner$delegate;
        Object obj6 = this.$cardLocked$delegate;
        Object obj7 = this.$interactiveCardState$delegate;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new UiWorkflow$$ExternalSyntheticLambda25((State) this.$isCardPressed$delegate, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, (MutableState) obj5, 16));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((MutableState) obj7, coroutineScope, (MutableState) obj6, (Continuation) null);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, anonymousClass2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CardTabHeroState cardTabHeroState = (CardTabHeroState) obj5;
                Quadruple quadruple = (Quadruple) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) quadruple.first;
                    IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) quadruple.second;
                    boolean booleanValue = ((Boolean) quadruple.third).booleanValue();
                    int intValue = ((Number) quadruple.fourth).intValue();
                    boolean z = false;
                    boolean z2 = intValue > 0;
                    CardRenderingInfo cardRenderingInfo2 = cardTabHeroState != null ? cardTabHeroState.rendering_info : null;
                    if (Intrinsics.areEqual(cardRenderingInfo2, cardRenderingInfo)) {
                        break;
                    }
                    z = true;
                    produceStateScope = (ProduceStateScope) obj7;
                    if ((cardRenderingInfo != null ? cardRenderingInfo.expiration_state : null) == CardRenderingInfo.ExpirationState.EXPIRED) {
                        none = CardSchemeViewModel.Module.CardAnimation.Expired.INSTANCE;
                    } else if (z2) {
                        none = new CardSchemeViewModel.Module.CardAnimation.Copy(intValue);
                    } else if (booleanValue) {
                        none = CardSchemeViewModel.Module.CardAnimation.SpinToFront.INSTANCE;
                    } else if (cardTabHeroState == null) {
                        none = new CardSchemeViewModel.Module.CardAnimation.None(true, true);
                    } else {
                        if (z) {
                            if ((cardRenderingInfo2 != null ? cardRenderingInfo2.card_theme : null) != null) {
                                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) obj6;
                                cardTheme = cardRenderingInfo2.card_theme;
                                cardTheme.getClass();
                                String str = cardRenderingInfo2.customization_image_path;
                                if (str != null) {
                                    FinishSetupTileBadgeCounter customizationFor = cardSchemePresenter.cardCustomizationRepository.getCustomizationFor(str);
                                    this.L$0 = null;
                                    this.$isCardPressed$delegate = cardTabHeroState;
                                    this.$cardEnabled$delegate = cardTheme;
                                    this.$showPrepurchaseContourText$delegate = produceStateScope;
                                    this.label = 1;
                                    firstOrNull = FlowKt.firstOrNull(customizationFor, this);
                                    if (firstOrNull == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    cardTheme2 = cardTheme;
                                    produceStateScope2 = produceStateScope;
                                } else {
                                    customizationImage = null;
                                    Boolean bool = cardTabHeroState.facing_forward;
                                    bool.getClass();
                                    boolean booleanValue2 = bool.booleanValue();
                                    Boolean bool2 = cardTabHeroState.enabled;
                                    bool2.getClass();
                                    none = new CardSchemeViewModel.Module.CardAnimation.Updated(cardTheme, customizationImage, booleanValue2, bool2.booleanValue());
                                }
                            }
                        }
                        Boolean bool3 = cardTabHeroState.facing_forward;
                        bool3.getClass();
                        boolean booleanValue3 = bool3.booleanValue();
                        Boolean bool4 = cardTabHeroState.enabled;
                        bool4.getClass();
                        none = new CardSchemeViewModel.Module.CardAnimation.None(booleanValue3, bool4.booleanValue());
                    }
                    produceStateScope.setValue(none);
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                produceStateScope2 = (ProduceStateScope) this.$showPrepurchaseContourText$delegate;
                cardTheme2 = (CardTheme) this.$cardEnabled$delegate;
                cardTabHeroState = (CardTabHeroState) this.$isCardPressed$delegate;
                SafeTrace.throwOnFailure(obj);
                firstOrNull = obj;
                byte[] bArr = (byte[]) firstOrNull;
                customizationImage = bArr != null ? new CardSchemeViewModel.Module.CustomizationImage(bArr) : null;
                produceStateScope = produceStateScope2;
                cardTheme = cardTheme2;
                Boolean bool5 = cardTabHeroState.facing_forward;
                bool5.getClass();
                boolean booleanValue22 = bool5.booleanValue();
                Boolean bool22 = cardTabHeroState.enabled;
                bool22.getClass();
                none = new CardSchemeViewModel.Module.CardAnimation.Updated(cardTheme, customizationImage, booleanValue22, bool22.booleanValue());
                produceStateScope.setValue(none);
                return Unit.INSTANCE;
            case 2:
                CardSchemePresenter cardSchemePresenter2 = (CardSchemePresenter) this.$isCardPressed$delegate;
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GpsConfigQueries gpsConfigQueries = cardSchemePresenter2.heroCardStateQueries;
                    gpsConfigQueries.getClass();
                    CardTabHeroStateQueries$select$2 cardTabHeroStateQueries$select$2 = CardTabHeroStateQueries$select$2.INSTANCE;
                    SqlDriver sqlDriver = gpsConfigQueries.driver;
                    AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(gpsConfigQueries);
                    sqlDriver.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-1944971947, new String[]{"cardTabHeroState"}, sqlDriver, "CardTabHeroState.sq", "select", "SELECT cardTabHeroState._id, cardTabHeroState.card_token, cardTabHeroState.rendering_info, cardTabHeroState.facing_forward, cardTabHeroState.enabled FROM cardTabHeroState WHERE _id = 1", alertBannerKt$$ExternalSyntheticLambda3)), cardSchemePresenter2.ioDispatcher);
                    CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$1 = new CardSchemePresenter$models$3$1(cardSchemePresenter2, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, (MutableState) obj5, (MutableState) obj7, (ParcelableSnapshotMutableIntState) obj6, produceStateScope3, (Continuation) null);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(mapToOneOrNull, cardSchemePresenter$models$3$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda9(i2, (CardSchemeViewModel.Module.CardAnimation) this.L$0, (State) this.$isCardPressed$delegate, (MutableState) this.$cardEnabled$delegate));
                    Hero3DCardViewKt$InteractiveCard$12$1$4$1$2 hero3DCardViewKt$InteractiveCard$12$1$4$1$2 = new Hero3DCardViewKt$InteractiveCard$12$1$4$1$2((MutableSharedFlow) obj7, (MutableState) this.$showPrepurchaseContourText$delegate, (CardWobbleState) obj6, (MutableState) obj5, null, 1);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow2, hero3DCardViewKt$InteractiveCard$12$1$4$1$2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda9((CardSchemeViewModel.Module.CardAnimation) this.L$0, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, 5));
                    Hero3DCardViewKt$InteractiveCard$12$1$4$1$2 hero3DCardViewKt$InteractiveCard$12$1$4$1$22 = new Hero3DCardViewKt$InteractiveCard$12$1$4$1$2((MutableSharedFlow) this.$isCardPressed$delegate, (MutableState) obj5, (CardWobbleState) obj6, (MutableState) obj7, null, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, hero3DCardViewKt$InteractiveCard$12$1$4$1$22, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$isCardPressed$delegate;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope2, (ShareSheetPresenter) obj5, (AskedQuestion) obj7, (CoroutineScope) obj6, (MutableState) this.$cardEnabled$delegate, (MutableState) this.$showPrepurchaseContourText$delegate, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(cardSchemePresenter$toHeroModule$3$1$1, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    subtreeManager = (SubtreeManager) obj5;
                    mutexImpl = (MutexImpl) subtreeManager.emitActionToParent;
                    WorkflowWorker workflowWorker2 = (WorkflowWorker) obj7;
                    Function1 function13 = (Function1) obj6;
                    this.L$0 = mutexImpl;
                    this.$isCardPressed$delegate = workflowWorker2;
                    this.$cardEnabled$delegate = subtreeManager;
                    this.$showPrepurchaseContourText$delegate = function13;
                    this.label = 1;
                    if (mutexImpl.lock(this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    function1 = function13;
                    workflowWorker = workflowWorker2;
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = (Function1) this.$showPrepurchaseContourText$delegate;
                    subtreeManager = (SubtreeManager) this.$cardEnabled$delegate;
                    WorkflowWorker workflowWorker3 = (WorkflowWorker) this.$isCardPressed$delegate;
                    MutexImpl mutexImpl2 = (MutexImpl) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = mutexImpl2;
                    workflowWorker = workflowWorker3;
                }
                SubtreeManager subtreeManager2 = subtreeManager;
                try {
                    Class<?> cls = workflowWorker.getClass();
                    Object obj8 = ((LinkedHashMap) subtreeManager2.interceptor).get(cls);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                    }
                    List list = (List) obj8;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((WorkflowContextAdapter$WorkflowWorkerWithHandler) obj2).worker.doesSameWorkAs(workflowWorker)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    WorkflowContextAdapter$WorkflowWorkerWithHandler workflowContextAdapter$WorkflowWorkerWithHandler = (WorkflowContextAdapter$WorkflowWorkerWithHandler) obj2;
                    if (workflowContextAdapter$WorkflowWorkerWithHandler == null) {
                        WorkflowContextAdapter$WorkflowWorkerWithHandler workflowContextAdapter$WorkflowWorkerWithHandler2 = new WorkflowContextAdapter$WorkflowWorkerWithHandler(workflowWorker, function1);
                        ((LinkedHashMap) subtreeManager2.interceptor).put(cls, CollectionsKt.plus((Collection) list, (Object) workflowContextAdapter$WorkflowWorkerWithHandler2));
                        JobKt.launch$default((ContextScope) subtreeManager2.workflowSession, null, null, new FlowKt__LimitKt$transformWhile$1(workflowWorker, subtreeManager2, cls, workflowContextAdapter$WorkflowWorkerWithHandler2, null, 11), 3);
                        mutexImpl.unlock(null);
                        return Unit.INSTANCE;
                    }
                    function1.getClass();
                    TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
                    workflowContextAdapter$WorkflowWorkerWithHandler.handler = function1;
                    Unit unit = Unit.INSTANCE;
                    mutexImpl.unlock(null);
                    return unit;
                } catch (Throwable th) {
                    mutexImpl.unlock(null);
                    throw th;
                }
            default:
                final Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list2 = (List) this.$isCardPressed$delegate;
                    ImageStore imageStore = (ImageStore) obj7;
                    int i11 = 10;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Party party = (Party) it3.next();
                        party.getClass();
                        imageStore.getClass();
                        List<Object> list3 = party.shapes;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i11));
                        for (Object obj9 : list3) {
                            if (obj9 instanceof Shape.DrawableShape) {
                                Shape.DrawableShape drawableShape = (Shape.DrawableShape) obj9;
                                DrawableImage drawableImage = (DrawableImage) drawableShape.image;
                                Drawable drawable = drawableImage.drawable;
                                int hashCode = drawable.hashCode();
                                it = it3;
                                obj4 = obj5;
                                imageStore.images.put(Integer.valueOf(hashCode), drawable);
                                obj9 = new Shape.DrawableShape(new ReferenceImage(hashCode, drawableImage.width, drawableImage.height), drawableShape.tint, drawableShape.applyAlpha);
                            } else {
                                it = it3;
                                obj4 = obj5;
                            }
                            arrayList2.add(obj9);
                            it3 = it;
                            obj5 = obj4;
                        }
                        arrayList.add(new PartySystem(Party.copy$default(party, arrayList2, null, 16255), Resources.getSystem().getDisplayMetrics().density));
                        it3 = it3;
                        obj5 = obj5;
                        i11 = 10;
                    }
                    obj3 = obj5;
                    ref$ObjectRef.element = arrayList;
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj3 = obj5;
                }
                do {
                    final MutableState mutableState = (MutableState) this.$cardEnabled$delegate;
                    final MutableState mutableState2 = (MutableState) this.$showPrepurchaseContourText$delegate;
                    final OpenSourceKt$OpenSource$1$1$2 openSourceKt$OpenSource$1$1$2 = (OpenSourceKt$OpenSource$1$1$2) obj6;
                    final MutableState mutableState3 = (MutableState) obj3;
                    function12 = new Function1() { // from class: nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$1$invokeSuspend$$inlined$withInfiniteAnimationFrameMillis$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r11v10, types: [kotlin.collections.EmptyList] */
                        /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
                        /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            Throwable th2;
                            long j;
                            Ref$ObjectRef ref$ObjectRef2;
                            Iterator it4;
                            float f;
                            long j2;
                            String str2;
                            ?? arrayList3;
                            char c;
                            float f2;
                            String str3;
                            float f3;
                            boolean z3;
                            EmptyList emptyList;
                            Position.Absolute absolute;
                            int i12;
                            long longValue = ((Number) obj10).longValue() / 1000000;
                            MutableState mutableState4 = MutableState.this;
                            long j3 = 0;
                            long longValue2 = ((Number) mutableState4.getValue()).longValue() > 0 ? longValue - ((Number) mutableState4.getValue()).longValue() : 0L;
                            mutableState4.setValue(Long.valueOf(longValue));
                            Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                            Object obj11 = ref$ObjectRef3.element;
                            Throwable th3 = null;
                            String str4 = "partySystems";
                            if (obj11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("partySystems");
                                throw null;
                            }
                            List list4 = (List) obj11;
                            char c2 = '\n';
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                PartySystem partySystem = (PartySystem) it5.next();
                                long j4 = partySystem.createdAt;
                                Party party2 = partySystem.party;
                                long currentTimeMillis = System.currentTimeMillis() - j4;
                                party2.getClass();
                                if (currentTimeMillis < j3) {
                                    arrayList3 = EmptyList.INSTANCE;
                                    ref$ObjectRef2 = ref$ObjectRef3;
                                    it4 = it5;
                                    th2 = th3;
                                    j2 = longValue2;
                                    j = j3;
                                    str2 = str4;
                                    c = c2;
                                } else {
                                    if (partySystem.isDoneEmitting()) {
                                        Object obj12 = ref$ObjectRef3.element;
                                        if (obj12 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(str4);
                                            throw th3;
                                        }
                                        List list5 = (List) obj12;
                                        if ((list5 instanceof Collection) && list5.isEmpty()) {
                                            i12 = 0;
                                        } else {
                                            Iterator it6 = list5.iterator();
                                            i12 = 0;
                                            while (it6.hasNext()) {
                                                if (!((PartySystem) it6.next()).isDoneEmitting() && (i12 = i12 + 1) < 0) {
                                                    CollectionsKt__CollectionsKt.throwCountOverflow();
                                                    throw th3;
                                                }
                                            }
                                        }
                                        if (i12 == 0) {
                                            openSourceKt$OpenSource$1$1$2.$konfettiState$delegate.setValue(KonfettiState.Idle.INSTANCE);
                                        }
                                    }
                                    float f4 = longValue2 / 1000.0f;
                                    th2 = th3;
                                    CoreRectImpl coreRectImpl = (CoreRectImpl) mutableState3.getValue();
                                    j = j3;
                                    ArrayList arrayList5 = partySystem.activeParticles;
                                    coreRectImpl.getClass();
                                    float f5 = coreRectImpl.height;
                                    float f6 = coreRectImpl.width;
                                    boolean z4 = partySystem.enabled;
                                    float f7 = RecyclerView.DECELERATION_RATE;
                                    if (z4) {
                                        PartyEmitter partyEmitter = partySystem.emitter;
                                        partyEmitter.getClass();
                                        partyEmitter.createParticleMs += f4;
                                        EmitterConfig emitterConfig = (EmitterConfig) partyEmitter.emitterConfig;
                                        Party party3 = party2;
                                        long j5 = emitterConfig.emittingTime;
                                        float f8 = j5;
                                        ref$ObjectRef2 = ref$ObjectRef3;
                                        float f9 = f8 / 1000.0f;
                                        it4 = it5;
                                        float f10 = partyEmitter.elapsedTime;
                                        if (f10 == RecyclerView.DECELERATION_RATE && f4 > f9) {
                                            partyEmitter.createParticleMs = f9;
                                        }
                                        EmptyList emptyList2 = EmptyList.INSTANCE;
                                        float f11 = partyEmitter.createParticleMs;
                                        float f12 = emitterConfig.amountPerMs;
                                        if (f11 < f12 || (j5 != j && f10 >= f8)) {
                                            f = f6;
                                            j2 = longValue2;
                                            emptyList = emptyList2;
                                        } else {
                                            IntRange intRange = new IntRange(1, (int) (f11 / f12), 1);
                                            ?? arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                                            IntProgressionIterator it7 = intRange.iterator();
                                            while (it7.hasNext) {
                                                it7.nextInt();
                                                Party party4 = party3;
                                                List list6 = party4.size;
                                                Rotation rotation = party4.rotation;
                                                IntProgressionIterator intProgressionIterator = it7;
                                                Random random = (Random) partyEmitter.random;
                                                float f13 = f6;
                                                Size size = (Size) list6.get(random.nextInt(list6.size()));
                                                Position position = party4.position;
                                                long j6 = longValue2;
                                                if (position instanceof Position.Absolute) {
                                                    Position.Absolute absolute2 = (Position.Absolute) position;
                                                    absolute = new Position.Absolute(absolute2.x, absolute2.y);
                                                } else {
                                                    if (!(position instanceof Position.Relative)) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return th2;
                                                    }
                                                    absolute = new Position.Absolute(f13 * 0.5f, f5 * 0.5f);
                                                }
                                                Vector vector = new Vector(absolute.x, absolute.y);
                                                float f14 = size.sizeInDp * partyEmitter.pixelDensity;
                                                float f15 = size.mass;
                                                float nextFloat = (random.nextFloat() * 0.2f * f15) + f15;
                                                List list7 = party4.shapes;
                                                Shape shape = (Shape) list7.get(random.nextInt(list7.size()));
                                                List list8 = party4.colors;
                                                int intValue2 = ((Number) list8.get(random.nextInt(list8.size()))).intValue();
                                                float nextFloat2 = (random.nextFloat() * (-30.0f)) + 30.0f;
                                                double radians = Math.toRadians((random.nextDouble() * 360.0d) + 179.0d);
                                                arrayList6.add(new Confetti(vector, intValue2, f14, nextFloat, shape, new Vector(((float) Math.cos(radians)) * nextFloat2, nextFloat2 * ((float) Math.sin(radians))), partyEmitter.rotationSpeed(rotation) * 1.5f, partyEmitter.rotationSpeed(rotation) * 8.0f, partyEmitter.pixelDensity));
                                                it7 = intProgressionIterator;
                                                f6 = f13;
                                                longValue2 = j6;
                                                party3 = party4;
                                            }
                                            f = f6;
                                            j2 = longValue2;
                                            partyEmitter.createParticleMs %= emitterConfig.amountPerMs;
                                            emptyList = arrayList6;
                                        }
                                        partyEmitter.elapsedTime = (f4 * 1000.0f) + partyEmitter.elapsedTime;
                                        arrayList5.addAll(emptyList);
                                    } else {
                                        ref$ObjectRef2 = ref$ObjectRef3;
                                        it4 = it5;
                                        f = f6;
                                        j2 = longValue2;
                                    }
                                    Iterator it8 = arrayList5.iterator();
                                    while (it8.hasNext()) {
                                        Confetti confetti = (Confetti) it8.next();
                                        confetti.getClass();
                                        Vector vector2 = confetti.gravity;
                                        Vector vector3 = confetti.acceleration;
                                        float f16 = 1.0f / confetti.mass;
                                        float f17 = (vector2.x * f16) + vector3.x;
                                        vector3.x = f17;
                                        float f18 = (vector2.y * f16) + vector3.y;
                                        vector3.y = f18;
                                        float f19 = confetti.width;
                                        Vector vector4 = confetti.velocity;
                                        Vector vector5 = confetti.location;
                                        float f20 = f4 > f7 ? 1.0f / f4 : 60.0f;
                                        confetti.frameRate = f20;
                                        if (vector5.y > f5) {
                                            confetti.alpha = 0;
                                            f2 = f5;
                                            str3 = str4;
                                        } else {
                                            float f21 = vector4.x + f17;
                                            float f22 = vector4.y + f18;
                                            float f23 = f21 * 0.9f;
                                            vector4.x = f23;
                                            float f24 = f22 * 0.9f;
                                            vector4.y = f24;
                                            float f25 = f4 * f20 * confetti.pixelDensity;
                                            vector5.x = (f23 * f25) + vector5.x;
                                            vector5.y = (f24 * f25) + vector5.y;
                                            f2 = f5;
                                            str3 = str4;
                                            long j7 = confetti.lifespan - ((long) (f4 * 1000.0f));
                                            confetti.lifespan = j7;
                                            if (j7 <= j) {
                                                int i13 = confetti.alpha - ((int) ((5.0f * f4) * f20));
                                                if (i13 < 0) {
                                                    i13 = 0;
                                                }
                                                confetti.alpha = i13;
                                            }
                                            float f26 = (confetti.rotationSpeed2D * f4 * f20) + confetti.rotation;
                                            confetti.rotation = f26;
                                            if (f26 >= 360.0f) {
                                                f3 = f7;
                                                confetti.rotation = f3;
                                            } else {
                                                f3 = f7;
                                            }
                                            float abs = confetti.rotationWidth - ((Math.abs(confetti.rotationSpeed3D) * f4) * confetti.frameRate);
                                            confetti.rotationWidth = abs;
                                            if (abs < f3) {
                                                confetti.rotationWidth = f19;
                                            }
                                            confetti.scaleX = Math.abs((confetti.rotationWidth / f19) - 0.5f) * 2.0f;
                                            confetti.alphaColor = (confetti.alpha << 24) | (confetti.color & 16777215);
                                            int i14 = (int) vector5.x;
                                            int i15 = (int) vector5.y;
                                            float f27 = i14;
                                            f7 = RecyclerView.DECELERATION_RATE;
                                            if (f27 >= RecyclerView.DECELERATION_RATE && f27 <= RecyclerView.DECELERATION_RATE + f) {
                                                float f28 = i15;
                                                if (f28 >= RecyclerView.DECELERATION_RATE && f28 <= RecyclerView.DECELERATION_RATE + f2) {
                                                    z3 = true;
                                                    confetti.drawParticle = z3;
                                                }
                                            }
                                            z3 = false;
                                            confetti.drawParticle = z3;
                                        }
                                        str4 = str3;
                                        f5 = f2;
                                    }
                                    str2 = str4;
                                    CollectionsKt__MutableCollectionsKt.removeAll(arrayList5, PartySystem$render$2.INSTANCE);
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it9 = arrayList5.iterator();
                                    while (it9.hasNext()) {
                                        Object next = it9.next();
                                        if (((Confetti) next).drawParticle) {
                                            arrayList7.add(next);
                                        }
                                    }
                                    c = '\n';
                                    arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it10 = arrayList7.iterator();
                                    while (it10.hasNext()) {
                                        Confetti confetti2 = (Confetti) it10.next();
                                        confetti2.getClass();
                                        Vector vector6 = confetti2.location;
                                        float f29 = vector6.x;
                                        float f30 = vector6.y;
                                        float f31 = confetti2.width;
                                        arrayList3.add(new Particle(f29, f30, f31, f31, confetti2.alphaColor, confetti2.rotation, confetti2.scaleX, confetti2.shape, confetti2.alpha));
                                    }
                                }
                                arrayList4.add(arrayList3);
                                th3 = th2;
                                str4 = str2;
                                c2 = c;
                                j3 = j;
                                ref$ObjectRef3 = ref$ObjectRef2;
                                it5 = it4;
                                longValue2 = j2;
                            }
                            mutableState2.setValue(CollectionsKt__IterablesKt.flatten(arrayList4));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                } while (ArcSplineKt.withInfiniteAnimationFrameNanos(this, function12) != coroutineSingletons8);
                return coroutineSingletons8;
        }
    }

    /* renamed from: com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Object $$this$LaunchedEffect;
        public final /* synthetic */ Object $cardLocked$delegate;
        public final /* synthetic */ Object $interactiveCardState$delegate;
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, ShoppingWebPresenter shoppingWebPresenter, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 1;
            this.$$this$LaunchedEffect = coroutineScope;
            this.$interactiveCardState$delegate = mutableState;
            this.$cardLocked$delegate = mutableState2;
            this.L$0 = shoppingWebPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$$this$LaunchedEffect;
            Object obj3 = this.$cardLocked$delegate;
            Object obj4 = this.$interactiveCardState$delegate;
            switch (i) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((MutableState) obj4, (CoroutineScope) obj2, (MutableState) obj3, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                case 1:
                    return new AnonymousClass2((CoroutineScope) obj2, (MutableState) obj4, (MutableState) obj3, (ShoppingWebPresenter) this.L$0, continuation);
                case 2:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2((ArticlesService$AllArticlesResult) obj4, (Boolean) obj3, continuation, (SupportHomePresenter) obj2);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
                case 3:
                    return new AnonymousClass2(this.L$0, obj2, (MutableState) obj4, (MutableState) obj3, continuation, 3);
                case 4:
                    return new AnonymousClass2((UnleashContext) this.L$0, (SecretKey) obj4, (byte[]) obj3, (SecretKey) obj2, continuation, 4);
                case 5:
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2((EmvCardStatus) obj3, continuation, (CardLockPresenter) obj2, (MutableState) obj4);
                    anonymousClass23.L$0 = obj;
                    return anonymousClass23;
                case 6:
                    return new AnonymousClass2((AmountDisplayState) this.L$0, (WithdrawViewModel$AmountConfig$KeypadConfig) obj4, (KeypadAmount) obj3, (MoneyFormatter) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass2((RealRouter) this.L$0, (String) obj4, (RealTreehouseNavigatorFactory) obj3, (TreehouseRoutingParams) obj2, continuation, 7);
                case 8:
                    AnonymousClass2 anonymousClass24 = new AnonymousClass2((Context) obj4, continuation, (RemoteMessage) obj3, (PushMessagingService) obj2);
                    anonymousClass24.L$0 = obj;
                    return anonymousClass24;
                case 9:
                    return new AnonymousClass2(this.L$0, obj4, obj3, obj2, continuation, 9);
                case 10:
                    return new AnonymousClass2(this.L$0, obj3, obj2, (MutableState) obj4, continuation, 10);
                case 11:
                    AnonymousClass2 anonymousClass25 = new AnonymousClass2((InteractiveCardState) obj2, (MutableState) obj4, (MutableState) obj3, continuation);
                    anonymousClass25.L$0 = obj;
                    return anonymousClass25;
                case 12:
                    return new AnonymousClass2(this.L$0, obj2, (MutableState) obj4, (MutableState) obj3, continuation, 12);
                case 13:
                    return new AnonymousClass2((SharedPartnerAuthState.ViewEffect) this.L$0, (UriHandler) obj4, (FinancialConnectionsSheetNativeViewModel) obj3, (Function0) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass2(this.L$0, obj3, obj2, (MutableState) obj4, continuation, 14);
                case 15:
                    AnonymousClass2 anonymousClass26 = new AnonymousClass2((TextSetter) obj4, (String) obj3, (String) obj2, continuation);
                    anonymousClass26.L$0 = obj;
                    return anonymousClass26;
                case 16:
                    return new AnonymousClass2((GovernmentIdWorkflow.Input) this.L$0, (GovernmentIdState) obj4, (GovernmentIdWorkflow) obj3, (StatefulWorkflow.RenderContext) obj2, continuation, 16);
                default:
                    return new AnonymousClass2((BlurEffectKt$$ExternalSyntheticLambda1) this.L$0, (Typeface) obj4, (RealFontDownloader) obj3, (String) obj2, continuation, 17);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x01fc, code lost:
        
            if (java.lang.Float.intBitsToFloat((int) (r2 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax)) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L69;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object value;
            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
            List list;
            Object failure;
            int i = this.$r8$classId;
            int i2 = 7;
            int i3 = 0;
            String str = 0;
            str = 0;
            Object obj2 = this.$$this$LaunchedEffect;
            Object obj3 = this.$cardLocked$delegate;
            Object obj4 = this.$interactiveCardState$delegate;
            switch (i) {
                case 0:
                    Quadruple quadruple = (Quadruple) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) quadruple.first).booleanValue();
                    boolean booleanValue2 = ((Boolean) quadruple.second).booleanValue();
                    boolean booleanValue3 = ((Boolean) quadruple.third).booleanValue();
                    boolean booleanValue4 = ((Boolean) quadruple.fourth).booleanValue();
                    int i4 = HeroCardViewKt.$r8$clinit;
                    InteractiveCardState interactiveCardState = (InteractiveCardState) ((MutableState) obj4).getValue();
                    CoroutineScope coroutineScope = (CoroutineScope) obj2;
                    Continuation continuation = null;
                    JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$4$1$2$1$1(interactiveCardState, booleanValue, booleanValue2, booleanValue3, continuation, 0), 3);
                    JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$4$1$2$1$1(interactiveCardState, booleanValue, booleanValue2, booleanValue4, continuation, 1), 3);
                    if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue()) {
                        JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$4$1$2$1$3(interactiveCardState, booleanValue, str, i3), 3);
                    }
                    return Unit.INSTANCE;
                case 1:
                    MutableState mutableState = (MutableState) obj3;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) obj4;
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    if (((FillrCartInformationExtraction$FillrCartInformation) mutableState2.getValue()) != null) {
                        mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, null, null, null, null, null, null, null, new ShoppingWebPresenter.RestrictedItemState(null, null), null, false, null, null, null, null, false, null, 536854527));
                        JobKt.launch$default((CoroutineScope) obj2, null, null, new ShoppingWebPresenter$models$10$1((ShoppingWebPresenter) this.L$0, mutableState2, mutableState, null, 2), 3);
                    }
                    return Unit.INSTANCE;
                case 2:
                    SupportHomePresenter supportHomePresenter = (SupportHomePresenter) obj2;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ArticlesService$AllArticlesResult articlesService$AllArticlesResult = (ArticlesService$AllArticlesResult) obj4;
                    if (!((Boolean) obj3).booleanValue()) {
                        Analytics analytics = supportHomePresenter.analytics;
                        SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
                        List categories = SupportHomePresenter.getCategories(articlesService$AllArticlesResult);
                        List suggestedActions = SupportHomePresenter.getSuggestedActions(articlesService$AllArticlesResult);
                        String str2 = supportHomePresenter.viewToken;
                        JsonAdapter jsonAdapter = (JsonAdapter) supportHomePresenter.stringListAdapter$delegate.getValue();
                        supportHomeScreen.getClass();
                        categories.getClass();
                        suggestedActions.getClass();
                        str2.getClass();
                        jsonAdapter.getClass();
                        List list2 = suggestedActions;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SupportHomeViewModel.SuggestedAction) it.next()).link.token);
                        }
                        List<SupportHomeViewModel.Category> list3 = categories;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((SupportHomeViewModel.Category) it2.next()).token);
                        }
                        String json = jsonAdapter.toJson(CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList));
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((SupportHomeViewModel.SuggestedAction) it3.next()).link.isMlSuggestion ? "ml_suggested" : "suggested");
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (SupportHomeViewModel.Category category : list3) {
                            arrayList4.add("node_tree");
                        }
                        analytics.track(new CustomerSupportAccessViewNodes(CollectionsKt.joinToString$default(CollectionsKt.plus((Iterable) arrayList4, (Collection) arrayList3), ",", null, null, 0, null, null, 62), supportHomeScreen.data.flowToken, json, Logger.ROOT_LOGGER_NAME, null, null, Integer.valueOf(suggestedActions.size() + categories.size()), CustomerSupportAccessViewNodes.Trigger.HOME, str2, null, null, 7728), null);
                    }
                    return Unit.INSTANCE;
                case 3:
                    List list4 = (List) this.L$0;
                    SupportHomePresenter supportHomePresenter2 = (SupportHomePresenter) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) obj4).getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    if (!Intrinsics.areEqual((SupportPhoneStatus) ((MutableState) obj3).getValue(), SupportPhoneStatus.Undetermined.INSTANCE) && list4 != null) {
                        CustomerSupportAccessViewContactOptions.Option access$mapOptionStatus = SupportHomePresenter.access$mapOptionStatus(supportHomePresenter2, list4, SupportHomeViewModel.ContactOption.Type.CHAT);
                        CustomerSupportAccessViewContactOptions.Option access$mapOptionStatus2 = SupportHomePresenter.access$mapOptionStatus(supportHomePresenter2, list4, SupportHomeViewModel.ContactOption.Type.PHONE);
                        if (!((Boolean) supportHomePresenter2.showProminentContactSupportButton$delegate.getValue()).booleanValue()) {
                            LegacySubtitleUtil.logViewContactOptions(supportHomePresenter2.analytics, supportHomePresenter2.args, supportHomePresenter2.viewToken, access$mapOptionStatus, access$mapOptionStatus2);
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    UnleashContext unleashContext = (UnleashContext) this.L$0;
                    Pool pool = (Pool) unleashContext.remoteAddress;
                    JCAContext jCAContext = (JCAContext) unleashContext.userId;
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.getClass();
                    jCAContext.provider = cipher;
                    cipher.init(1, (SecretKey) obj4, (AlgorithmParameterSpec) null);
                    Cipher cipher2 = (Cipher) jCAContext.provider;
                    if (cipher2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cipher");
                        throw null;
                    }
                    byte[] iv = cipher2.getIV();
                    iv.getClass();
                    byte[] bArr = (byte[]) obj3;
                    Cipher cipher3 = (Cipher) jCAContext.provider;
                    if (cipher3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cipher");
                        throw null;
                    }
                    byte[] doFinal = cipher3.doFinal(bArr);
                    doFinal.getClass();
                    ((Mac) pool.pool).init((SecretKey) obj2);
                    byte[] doFinal2 = ((Mac) pool.pool).doFinal(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{1}, iv), doFinal));
                    doFinal2.getClass();
                    return new HieroglyphPanData(doFinal, iv, doFinal2);
                case 5:
                    zzai zzaiVar = (zzai) ((CardLockPresenter) obj2).args;
                    MutableState mutableState3 = (MutableState) obj4;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((EmvCardStatus) obj3).ordinal();
                    if (ordinal == 0) {
                        Timber.Forest forest = Timber.Forest;
                        forest.i("Detecting card", new Object[0]);
                        RealTagCommunication realTagCommunication = (RealTagCommunication) mutableState3.getValue();
                        if (realTagCommunication != null && realTagCommunication.tagTechnology.isConnected()) {
                            forest.i("Tag is already connected, sending card detected", new Object[0]);
                            zzaiVar.notifyCardDetected();
                        }
                    } else if (ordinal == 1) {
                        Timber.Forest.i("Deactivating card", new Object[0]);
                        RealTagCommunication realTagCommunication2 = (RealTagCommunication) mutableState3.getValue();
                        if (realTagCommunication2 != null) {
                            realTagCommunication2.closeInBackground();
                        }
                        SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) zzaiVar.zab, null, "notify_card_deactivated", null, null, 12);
                        try {
                            TextSetter textSetter = (TextSetter) zzaiVar.zza;
                            if (!textSetter.getEmbeddedCardReader().isReaderStopped()) {
                                textSetter.getEmbeddedCardReader().sendCardDeactivated();
                            }
                        } finally {
                            SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                        }
                    } else if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return Unit.INSTANCE;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    AmountDisplayState amountDisplayState = (AmountDisplayState) this.L$0;
                    WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig = (WithdrawViewModel$AmountConfig$KeypadConfig) obj4;
                    amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(withdrawViewModel$AmountConfig$KeypadConfig.currency, null, false, 0, 14));
                    KeypadAmount keypadAmount = (KeypadAmount) obj3;
                    if (keypadAmount != null) {
                        keypadAmount.setMaxAmount(new Double(withdrawViewModel$AmountConfig$KeypadConfig.maxAmount));
                    } else {
                        AmountDisplayState.reset$default(amountDisplayState, ((MoneyFormatter) obj2).format(withdrawViewModel$AmountConfig$KeypadConfig.currentAmount), 2);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    RealRouter realRouter = (RealRouter) this.L$0;
                    String str3 = (String) obj4;
                    RealTreehouseNavigatorFactory realTreehouseNavigatorFactory = (RealTreehouseNavigatorFactory) obj3;
                    TreehouseRoutingParams treehouseRoutingParams = (TreehouseRoutingParams) obj2;
                    ClientRouteUrl clientRouteUrl = treehouseRoutingParams.origin;
                    Screen screen = clientRouteUrl != null ? realTreehouseNavigatorFactory.toScreen(clientRouteUrl) : null;
                    ClientRouteUrl clientRouteUrl2 = treehouseRoutingParams.exitScreen;
                    Screen screen2 = clientRouteUrl2 != null ? realTreehouseNavigatorFactory.toScreen(clientRouteUrl2) : null;
                    if (clientRouteUrl != null) {
                        String str4 = clientRouteUrl.url;
                        Uri build = new Uri.Builder().path(str4).build();
                        Function1 function1 = Matcher.treehouseAppLinkClientRoute.match;
                        build.getClass();
                        ClientRoute clientRoute = (ClientRoute) function1.invoke(build);
                        if (clientRoute == null) {
                            clientRoute = realTreehouseNavigatorFactory.clientRouteParser.parse(str4);
                        }
                        if (clientRoute instanceof ClientRoute.ViewBalance) {
                            str = "HOME_TAB";
                        }
                    }
                    return Boolean.valueOf(realRouter.route(new RoutingParams(screen, str, screen2, null, null, null, 500), str3));
                case 8:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Countries.onEachSandboxComponentExt((Context) obj4, coroutineScope2, new DateInputKt$DateInputTextField$3(new TooltipKt$TooltipBox$3(i2, coroutineScope2, (RemoteMessage) obj3, (PushMessagingService) obj2), 14));
                    return Unit.INSTANCE;
                case 9:
                    CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.L$0;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardSchemePresenter.copyAnimationTrigger$delegate;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) obj4;
                    if (!((Boolean) mutableState4.getValue()).booleanValue() && cardSchemePresenter.getCopyId() != null) {
                        Boolean bool = Boolean.TRUE;
                        mutableState4.setValue(bool);
                        ((MutableState) obj3).setValue(null);
                        ((MutableState) obj2).setValue(bool);
                        parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                    }
                    return Unit.INSTANCE;
                case 10:
                    CardRegistry cardRegistry = (CardRegistry) obj3;
                    String str5 = (String) obj2;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                    Offset offset = (Offset) ((MutableState) obj4).getValue();
                    if (offset != null) {
                        long j = offset.packedValue;
                        if (Float.intBitsToFloat((int) (j >> 32)) != RecyclerView.DECELERATION_RATE) {
                            break;
                        }
                    }
                    offset = null;
                    int ordinal2 = ((CardRegistry$CardTransition$TransitionType) this.L$0).ordinal();
                    if (ordinal2 == 0) {
                        SnapshotStateMap snapshotStateMap = cardRegistry.sourceOffsets;
                        if (offset != null) {
                            snapshotStateMap.put(str5, offset);
                        } else {
                            snapshotStateMap.remove(str5);
                        }
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        SnapshotStateMap snapshotStateMap2 = cardRegistry.targetOffsets;
                        if (offset != null) {
                            snapshotStateMap2.put(str5, offset);
                        } else {
                            snapshotStateMap2.remove(str5);
                        }
                    }
                    return Unit.INSTANCE;
                case 11:
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardState interactiveCardState2 = (InteractiveCardState) obj2;
                    Continuation continuation2 = null;
                    JobKt.launch$default(coroutineScope3, null, null, new CardAppletWorker$setup$1$2$1(interactiveCardState2, (MutableState) obj4, (MutableState) obj3, null, 14), 3);
                    JobKt.launch$default(coroutineScope3, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation2, i2), 3);
                    JobKt.launch$default(coroutineScope3, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation2, 8), 3);
                    return JobKt.launch$default(coroutineScope3, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation2, 9), 3);
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Offset offset2 = (Offset) this.L$0;
                    WithdrawViewKt$WithdrawAmountView$1$1.access$invokeSuspend$handleTouch((PointerInputScope) obj2, (MutableState) obj4, (MutableState) obj3, Float.intBitsToFloat((int) (offset2.packedValue >> 32)), Float.intBitsToFloat((int) (offset2.packedValue & BodyPartID.bodyIdMax)));
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    SharedPartnerAuthState.ViewEffect viewEffect = (SharedPartnerAuthState.ViewEffect) this.L$0;
                    if (viewEffect instanceof SharedPartnerAuthState.ViewEffect.OpenUrl) {
                        ((UriHandler) obj4).openUri(((SharedPartnerAuthState.ViewEffect.OpenUrl) viewEffect).url);
                    } else {
                        if (!(viewEffect instanceof SharedPartnerAuthState.ViewEffect.OpenPartnerAuth)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) obj3;
                        String str6 = ((SharedPartnerAuthState.ViewEffect.OpenPartnerAuth) viewEffect).url;
                        financialConnectionsSheetNativeViewModel.getClass();
                        StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel._stateFlow;
                        do {
                            value = stateFlowImpl.getValue();
                            financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) value;
                            financialConnectionsSheetNativeState.getClass();
                        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, WebAuthFlowState.InProgress.INSTANCE, new FinancialConnectionsSheetNativeViewEffect.OpenUrl(str6), null, 16317)));
                    }
                    ((Function0) obj2).invoke();
                    return Unit.INSTANCE;
                case 14:
                    MutableState mutableState5 = (MutableState) obj4;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    InstitutionResponse institutionResponse = (InstitutionResponse) ((Async) this.L$0).invoke();
                    if (institutionResponse != null && (list = institutionResponse.data) != null && (!list.isEmpty()) && !((LazyListState) obj3).scrollableState.isScrollInProgress() && ((Boolean) mutableState5.getValue()).booleanValue()) {
                        ((Function0) obj2).invoke();
                        mutableState5.setValue(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    TextSetter textSetter2 = (TextSetter) obj4;
                    String str7 = (String) obj3;
                    String str8 = (String) obj2;
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = TextSetter.access$doPostRequestInternal(textSetter2, str7, str8);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                        ((DefaultErrorReporter) textSetter2.textSwitcher).reportError(m4120exceptionOrNullimpl);
                    }
                    Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl2 == null) {
                        return failure;
                    }
                    throw new SDKRuntimeException(m4120exceptionOrNullimpl2);
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) this.L$0;
                    if (input.enabledIdClasses.size() == 1) {
                        GovernmentIdWorkflowUtilsKt.moveToNextStep$default((GovernmentIdState.ShowInstructions) ((GovernmentIdState) obj4), (StatefulWorkflow.RenderContext) obj2, input, null, r5, ((GovernmentIdWorkflow) obj3).videoCaptureHelper, new CameraProperties(null, null, null, 0, 31, 0), false, ((IdConfig) CollectionsKt.first((List) input.enabledIdClasses)).parts, 0, null, 3584);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Typeface typeface = (Typeface) obj4;
                    ((BlurEffectKt$$ExternalSyntheticLambda1) this.L$0).invoke(typeface);
                    RealFontDownloader realFontDownloader = (RealFontDownloader) obj3;
                    ArrayList arrayList5 = realFontDownloader.onFontDownloadedCallbacks;
                    String str9 = (String) obj2;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        if (((RealFontDownloader.FontDownloadedCallback) next).url.equals(str9)) {
                            arrayList6.add(next);
                        }
                    }
                    CollectionsKt__MutableCollectionsKt.removeAll(realFontDownloader.onFontDownloadedCallbacks, new StateBindingsKt$$ExternalSyntheticLambda0(str9, 18));
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        ((RealFontDownloader.FontDownloadedCallback) it5.next()).onFontDownloaded.invoke(typeface);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 0;
            this.$interactiveCardState$delegate = mutableState;
            this.$$this$LaunchedEffect = coroutineScope;
            this.$cardLocked$delegate = mutableState2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArticlesService$AllArticlesResult articlesService$AllArticlesResult, Boolean bool, Continuation continuation, SupportHomePresenter supportHomePresenter) {
            super(2, continuation);
            this.$r8$classId = 2;
            this.$interactiveCardState$delegate = articlesService$AllArticlesResult;
            this.$cardLocked$delegate = bool;
            this.$$this$LaunchedEffect = supportHomePresenter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmvCardStatus emvCardStatus, Continuation continuation, CardLockPresenter cardLockPresenter, MutableState mutableState) {
            super(2, continuation);
            this.$r8$classId = 5;
            this.$cardLocked$delegate = emvCardStatus;
            this.$$this$LaunchedEffect = cardLockPresenter;
            this.$interactiveCardState$delegate = mutableState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InteractiveCardState interactiveCardState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 11;
            this.$$this$LaunchedEffect = interactiveCardState;
            this.$interactiveCardState$delegate = mutableState;
            this.$cardLocked$delegate = mutableState2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextSetter textSetter, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 15;
            this.$interactiveCardState$delegate = textSetter;
            this.$cardLocked$delegate = str;
            this.$$this$LaunchedEffect = str2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.$$this$LaunchedEffect = obj2;
            this.$interactiveCardState$delegate = mutableState;
            this.$cardLocked$delegate = mutableState2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, MutableState mutableState, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.$cardLocked$delegate = obj2;
            this.$$this$LaunchedEffect = obj3;
            this.$interactiveCardState$delegate = mutableState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.$interactiveCardState$delegate = obj2;
            this.$cardLocked$delegate = obj3;
            this.$$this$LaunchedEffect = obj4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Continuation continuation, RemoteMessage remoteMessage, PushMessagingService pushMessagingService) {
            super(2, continuation);
            this.$r8$classId = 8;
            this.$interactiveCardState$delegate = context;
            this.$cardLocked$delegate = remoteMessage;
            this.$$this$LaunchedEffect = pushMessagingService;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCardViewKt$Render$1$4$1(CardSchemeViewModel.Module.CardAnimation cardAnimation, State state, MutableState mutableState, MutableSharedFlow mutableSharedFlow, MutableState mutableState2, CardWobbleState cardWobbleState, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.L$0 = cardAnimation;
        this.$isCardPressed$delegate = state;
        this.$cardEnabled$delegate = mutableState;
        this.$interactiveCardState$delegate = mutableSharedFlow;
        this.$showPrepurchaseContourText$delegate = mutableState2;
        this.$cardLocked$delegate = cardWobbleState;
        this.$showLoadingSpinner$delegate = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCardViewKt$Render$1$4$1(Object obj, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isCardPressed$delegate = obj;
        this.$cardEnabled$delegate = mutableState;
        this.$showPrepurchaseContourText$delegate = mutableState2;
        this.$showLoadingSpinner$delegate = mutableState3;
        this.$interactiveCardState$delegate = mutableState4;
        this.$cardLocked$delegate = mutableState5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCardViewKt$Render$1$4$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$showLoadingSpinner$delegate = obj;
        this.$interactiveCardState$delegate = obj2;
        this.$cardLocked$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCardViewKt$Render$1$4$1(Ref$ObjectRef ref$ObjectRef, List list, ImageStore imageStore, MutableState mutableState, MutableState mutableState2, OpenSourceKt$OpenSource$1$1$2 openSourceKt$OpenSource$1$1$2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.L$0 = ref$ObjectRef;
        this.$isCardPressed$delegate = list;
        this.$interactiveCardState$delegate = imageStore;
        this.$cardEnabled$delegate = mutableState;
        this.$showPrepurchaseContourText$delegate = mutableState2;
        this.$cardLocked$delegate = openSourceKt$OpenSource$1$1$2;
        this.$showLoadingSpinner$delegate = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCardViewKt$Render$1$4$1(Flow flow, Continuation continuation, ShareSheetPresenter shareSheetPresenter, AskedQuestion askedQuestion, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$isCardPressed$delegate = flow;
        this.$showLoadingSpinner$delegate = shareSheetPresenter;
        this.$interactiveCardState$delegate = askedQuestion;
        this.$cardLocked$delegate = coroutineScope;
        this.$cardEnabled$delegate = mutableState;
        this.$showPrepurchaseContourText$delegate = mutableState2;
    }
}
