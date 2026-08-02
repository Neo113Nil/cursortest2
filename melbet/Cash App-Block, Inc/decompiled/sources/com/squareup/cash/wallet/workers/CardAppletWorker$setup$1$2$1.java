package com.squareup.cash.wallet.workers;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.directory.data.Protos_interopKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$CardSceneEffect$6$1$2;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$4$1$1;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.data.api.LoaderState;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader$retryFailedLoads$timecards$1;
import com.squareup.cash.work.data.real.ShiftLoaderContext;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$DataState;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$FetchResult;
import com.squareup.cash.work.service.real.RealBrandDetailsService;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.postcard.app.RefreshCardTabSchemeRequest;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.MotionKt$produceAnimationsEnabled$1$1;
import com.squareup.util.compose.ProgressBarKt$ProgressBar$1$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.TimerWorker$run$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ComparableRange;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class CardAppletWorker$setup$1$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAppletWorker$setup$1$2$1(RealBrandDetailsDataLoader realBrandDetailsDataLoader, List list, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 24;
        this.this$0 = realBrandDetailsDataLoader;
        this.L$1 = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$1 = new CardAppletWorker$setup$1$2$1((CardAppletWorker) obj2, continuation, 0);
                cardAppletWorker$setup$1$2$1.L$0 = obj;
                return cardAppletWorker$setup$1$2$1;
            case 1:
                return new CardAppletWorker$setup$1$2$1((PagerState) this.L$1, (Function1) this.L$0, (NullStateViewModel$SwipeViewModel$Content) obj2, continuation, 1);
            case 2:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$12 = new CardAppletWorker$setup$1$2$1((Flow) this.L$1, continuation, (CardAppletTilePresenter) obj2, 2);
                cardAppletWorker$setup$1$2$12.L$0 = obj;
                return cardAppletWorker$setup$1$2$12;
            case 3:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$13 = new CardAppletWorker$setup$1$2$1((Flow) this.L$1, continuation, (ErrorPresenter) obj2, 3);
                cardAppletWorker$setup$1$2$13.L$0 = obj;
                return cardAppletWorker$setup$1$2$13;
            case 4:
                return new CardAppletWorker$setup$1$2$1((CardSchemePresenter) this.L$1, (MutableState) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 4);
            case 5:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$14 = new CardAppletWorker$setup$1$2$1((CardSchemePresenter) this.L$1, (MutableState) obj2, continuation, 5);
                cardAppletWorker$setup$1$2$14.L$0 = obj;
                return cardAppletWorker$setup$1$2$14;
            case 6:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$15 = new CardAppletWorker$setup$1$2$1((Flow) this.L$1, continuation, (TaxReturnsPresenter) obj2, 6);
                cardAppletWorker$setup$1$2$15.L$0 = obj;
                return cardAppletWorker$setup$1$2$15;
            case 7:
                return new CardAppletWorker$setup$1$2$1((WalletHomePresenter) this.L$1, (MutableState) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 7);
            case 8:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$16 = new CardAppletWorker$setup$1$2$1((FlowCollector) this.L$1, (SlerpAnimator) obj2, continuation, 8);
                cardAppletWorker$setup$1$2$16.L$0 = obj;
                return cardAppletWorker$setup$1$2$16;
            case 9:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$17 = new CardAppletWorker$setup$1$2$1((MutableState) this.L$1, (MutableState) obj2, continuation, 9);
                cardAppletWorker$setup$1$2$17.L$0 = obj;
                return cardAppletWorker$setup$1$2$17;
            case 10:
                return new CardAppletWorker$setup$1$2$1((InteractiveCardState) this.L$1, (State) this.L$0, (MutableState) obj2, continuation, 10);
            case 11:
                return new CardAppletWorker$setup$1$2$1((State) this.L$1, (Context) this.L$0, (CardScene) obj2, continuation, 11);
            case 12:
                return new CardAppletWorker$setup$1$2$1((MutableState) this.L$1, (State) this.L$0, (MutableState) obj2, continuation, 12);
            case 13:
                return new CardAppletWorker$setup$1$2$1((CardModelView) this.L$1, (MutableState) this.L$0, (MutableState) obj2, continuation, 13);
            case 14:
                return new CardAppletWorker$setup$1$2$1((InteractiveCardState) this.L$1, (MutableState) this.L$0, (MutableState) obj2, continuation, 14);
            case 15:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$18 = new CardAppletWorker$setup$1$2$1((MutableState) obj2, continuation, 15);
                cardAppletWorker$setup$1$2$18.L$0 = obj;
                return cardAppletWorker$setup$1$2$18;
            case 16:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$19 = new CardAppletWorker$setup$1$2$1((CardRegistry.SharedCardTransitionState) this.L$1, (MutableState) obj2, continuation, 16);
                cardAppletWorker$setup$1$2$19.L$0 = obj;
                return cardAppletWorker$setup$1$2$19;
            case 17:
                return new CardAppletWorker$setup$1$2$1((MutableState) this.L$1, (CardRegistry.SharedCardTransitionState) this.L$0, (MutableState) obj2, continuation, 17);
            case 18:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$110 = new CardAppletWorker$setup$1$2$1((MutableState) this.L$1, (Context) obj2, continuation, 18);
                cardAppletWorker$setup$1$2$110.L$0 = obj;
                return cardAppletWorker$setup$1$2$110;
            case 19:
                return new CardAppletWorker$setup$1$2$1((MutableState) this.L$1, (CardRegistry.SharedCardTransitionState) this.L$0, (CardNuxState) obj2, continuation, 19);
            case 20:
                return new CardAppletWorker$setup$1$2$1((MutableSharedFlow) this.L$1, (Offset) this.L$0, (PointerInputScope) obj2, continuation, 20);
            case 21:
                return new CardAppletWorker$setup$1$2$1((State) this.L$1, (State) this.L$0, (MutableFloatState) obj2, continuation, 21);
            case 22:
                return new CardAppletWorker$setup$1$2$1((MutableState) this.L$1, (DefaultPagerState) this.L$0, (Function1) obj2, continuation, 22);
            case 23:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$111 = new CardAppletWorker$setup$1$2$1((Flow) this.L$1, continuation, (TaxReturnsPresenter) obj2, 23);
                cardAppletWorker$setup$1$2$111.L$0 = obj;
                return cardAppletWorker$setup$1$2$111;
            case 24:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$112 = new CardAppletWorker$setup$1$2$1((RealBrandDetailsDataLoader) obj2, (List) this.L$1, continuation);
                cardAppletWorker$setup$1$2$112.L$0 = obj;
                return cardAppletWorker$setup$1$2$112;
            case 25:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$113 = new CardAppletWorker$setup$1$2$1((ArrayList) this.L$1, (JCAContext) obj2, continuation, 25);
                cardAppletWorker$setup$1$2$113.L$0 = obj;
                return cardAppletWorker$setup$1$2$113;
            case 26:
                return new CardAppletWorker$setup$1$2$1((RealShiftDataLoader) this.L$1, (ComparableRange) this.L$0, (ShiftLoaderContext) obj2, continuation, 26);
            case 27:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$114 = new CardAppletWorker$setup$1$2$1((Flow) this.L$1, continuation, (UnleashContext) obj2, 27);
                cardAppletWorker$setup$1$2$114.L$0 = obj;
                return cardAppletWorker$setup$1$2$114;
            case 28:
                return new CardAppletWorker$setup$1$2$1((TaxAuthorizationPresenter) this.L$1, (MutableState) this.L$0, (MutableState) obj2, continuation, 28);
            default:
                CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$115 = new CardAppletWorker$setup$1$2$1((Flow) this.L$1, continuation, (TextSetter) obj2, 29);
                cardAppletWorker$setup$1$2$115.L$0 = obj;
                return cardAppletWorker$setup$1$2$115;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 4:
                ((CardAppletWorker$setup$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((CardAppletWorker$setup$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x019d, code lost:
    
        if (r3.emit(com.squareup.cash.work.data.api.LoaderState.Loading.INSTANCE, r26) == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0216, code lost:
    
        if (r3.emit(r1, r26) != r4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0460, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r0, r26) == r3) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0453, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(new androidx.room.RoomDatabase$performClear$1((java.lang.Object) r4, (boolean) (r13 == true ? 1 : 0), r9, 20), r26) == r3) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x052d, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r3, r2, null, null, r26, 12) == r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04f0, code lost:
    
        if (r3.snapTo(r6, r26) == r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x096b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r26) == r4) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0922, code lost:
    
        if (r0.refreshCardTabScheme(r1, r26) == r4) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x08e7, code lost:
    
        if (r6.awaitInternal(r26) == r4) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x089e, code lost:
    
        if (r1 == r4) goto L429;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ce A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:92:0x017e, B:93:0x0186, B:95:0x01b4, B:97:0x01ba, B:102:0x01ce, B:104:0x01d2, B:107:0x01fa, B:108:0x01ff, B:110:0x01a1), top: B:80:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x094f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[LOOP:1: B:442:0x092d->B:464:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x094e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:92:0x017e, B:93:0x0186, B:95:0x01b4, B:97:0x01ba, B:102:0x01ce, B:104:0x01d2, B:107:0x01fa, B:108:0x01ff, B:110:0x01a1), top: B:80:0x0168 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        List list;
        Iterator it;
        CardModule.HeroIssuedCardModule heroIssuedCardModule;
        String str;
        CardRenderingInfo cardRenderingInfo;
        Object emit;
        StandaloneCoroutine launch$default;
        Object fetchBrandDetails;
        ApiResult apiResult;
        Object awaitAll;
        String str2;
        Object access$fetchStubs;
        int i = this.$r8$classId;
        int i2 = 26;
        int i3 = 27;
        int i4 = 22;
        int i5 = 15;
        int i6 = 10;
        int i7 = 6;
        int i8 = 8;
        int i9 = 4;
        final int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i11 = 2;
        int i12 = 3;
        Object obj2 = this.this$0;
        final int i13 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CardAppletWorker cardAppletWorker = (CardAppletWorker) obj2;
                SyncTopic syncTopic = cardAppletWorker.cardTopic;
                CardScheme cardScheme = (CardScheme) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (cardScheme.modules.isEmpty()) {
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(cardAppletWorker.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig), 24);
                        this.L$0 = cardScheme;
                        this.label = 1;
                        first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                        break;
                    }
                    it = cardScheme.modules.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (heroIssuedCardModule != null) {
                    }
                    if (str != null) {
                    }
                } else if (i14 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                    list = ((ClientSyncConfig) first).topic_sync_allowlist;
                    SetBuilder setBuilder = new SetBuilder();
                    setBuilder.addAll(cardAppletWorker.cashAppTagSyncTopicProvider.topicsToSync(list));
                    if (list.contains(new Integer(syncTopic.value))) {
                        setBuilder.add(syncTopic);
                    }
                    SetBuilder build = SetsKt__SetsJVMKt.build(setBuilder);
                    if (!build.backing.isEmpty()) {
                        CompletableDeferredImpl sync = cardAppletWorker.clientSyncer.sync(SyncTrigger.USER_ACTION, build);
                        this.L$0 = cardScheme;
                        this.L$1 = list;
                        this.label = 2;
                        break;
                    }
                    if (!list.contains(new Integer(syncTopic.value))) {
                    }
                    it = cardScheme.modules.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (heroIssuedCardModule != null) {
                    }
                    if (str != null) {
                    }
                } else if (i14 == 2) {
                    list = (List) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    if (!list.contains(new Integer(syncTopic.value))) {
                        PostcardClientService postcardClientService = cardAppletWorker.postcardService;
                        RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = new RefreshCardTabSchemeRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191));
                        this.L$0 = cardScheme;
                        this.L$1 = null;
                        this.label = 3;
                        break;
                    }
                    it = cardScheme.modules.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (heroIssuedCardModule != null) {
                    }
                    if (str != null) {
                    }
                } else if (i14 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    it = cardScheme.modules.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            heroIssuedCardModule = null;
                        } else {
                            CardModule.Type type2 = ((CardModule) it.next()).f1328type;
                            if (type2 != null) {
                                CardModule.Type.HeroIssuedCard heroIssuedCard = type2 instanceof CardModule.Type.HeroIssuedCard ? (CardModule.Type.HeroIssuedCard) type2 : null;
                                if (heroIssuedCard != null) {
                                    heroIssuedCardModule = heroIssuedCard.value;
                                    if (heroIssuedCardModule == null) {
                                    }
                                }
                            }
                            heroIssuedCardModule = null;
                            if (heroIssuedCardModule == null) {
                            }
                        }
                    }
                    str = (heroIssuedCardModule != null || (cardRenderingInfo = heroIssuedCardModule.card_rendering_info) == null) ? null : cardRenderingInfo.customization_image_path;
                    if (str != null) {
                        FinishSetupTileBadgeCounter customizationFor = cardAppletWorker.customizationRepository.getCustomizationFor(str);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        break;
                    }
                } else {
                    if (i14 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new PagerState$$ExternalSyntheticLambda1((PagerState) this.L$1, i6));
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1 = new TaxWebAppBridge$openTakePhoto$1$1(i2, (Function1) this.L$0, (NullStateViewModel$SwipeViewModel$Content) obj2);
                    this.label = 1;
                    if (snapshotFlow.collect(taxWebAppBridge$openTakePhoto$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$12 = new TaxWebAppBridge$openTakePhoto$1$1(i3, coroutineScope, (CardAppletTilePresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(taxWebAppBridge$openTakePhoto$1$12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope2, (ErrorPresenter) obj2, i11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlySharedFlow readonlySharedFlow = ((CardSchemePresenter) this.L$1).deviceLockAnimationBus.scrollToDeviceEvents;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$13 = new TaxWebAppBridge$openTakePhoto$1$1(28, (MutableState) this.L$0, (ParcelableSnapshotMutableIntState) obj2);
                    this.label = 1;
                    if (readonlySharedFlow.$$delegate_0.collect(taxWebAppBridge$openTakePhoto$1$13, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 5:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest customizationImage = ((CardSchemePresenter) this.L$1).cardCustomizationRepository.getCustomizationImage();
                    Logger$_log$2 logger$_log$2 = new Logger$_log$2(produceStateScope, (MutableState) obj2, continuation, i8);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(customizationImage, logger$_log$2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass12 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope3, (TaxReturnsPresenter) obj2, i12);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass12, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardSchemeViewModel.Module.HeroPaymentDevices access$heroPaymentDevices = Protos_interopKt.access$heroPaymentDevices((CardSchemeViewModel) ((MutableState) this.L$0).getValue());
                    List list2 = access$heroPaymentDevices != null ? access$heroPaymentDevices.heroTags : null;
                    if (list2 == null) {
                        list2 = EmptyList.INSTANCE;
                    }
                    WalletHomePresenter walletHomePresenter = (WalletHomePresenter) this.L$1;
                    int intValue = ((ParcelableSnapshotMutableIntState) obj2).getIntValue();
                    this.label = 1;
                    CardSchemeViewModel.Module.HeroTag heroTag = (CardSchemeViewModel.Module.HeroTag) CollectionsKt.getOrNull(intValue - 1, list2);
                    SharedFlowImpl sharedFlowImpl = walletHomePresenter.cardSchemeEvents;
                    if (heroTag != null) {
                        emit = sharedFlowImpl.emit(new PresenterEvents.ExecuteCopy(heroTag.deviceId), this);
                        if (emit != coroutineSingletons8) {
                            emit = Unit.INSTANCE;
                        }
                    } else {
                        emit = sharedFlowImpl.emit(new PresenterEvents.ExecuteCopy(null), this);
                        if (emit != coroutineSingletons8) {
                            emit = Unit.INSTANCE;
                        }
                    }
                    if (emit == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                    JobKt.launch$default(coroutineScope4, null, CoroutineStart.UNDISPATCHED, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(Animatable, continuation, i8), 1);
                    FlowCollector flowCollector = (FlowCollector) this.L$1;
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(Updater.snapshotFlow(new CardLockViewKt$$ExternalSyntheticLambda1(Animatable, 3)), new CameraHelper$unbind$2(Animatable, continuation, i9), objArr == true ? 1 : 0);
                    this.L$0 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    Object collect = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(new CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2(flowCollector, (SlerpAnimator) obj2, 1), this);
                    if (collect != coroutineSingletons9) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons9) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.L$1, (MutableState) obj2, 12)), 24));
                    MotionKt$produceAnimationsEnabled$1$1 motionKt$produceAnimationsEnabled$1$1 = new MotionKt$produceAnimationsEnabled$1$1(produceStateScope2, continuation, i11);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, motionKt$produceAnimationsEnabled$1$1, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardState interactiveCardState = (InteractiveCardState) this.L$1;
                    boolean InteractiveCardEffect$lambda$20 = CoreInteractiveCardKt.InteractiveCardEffect$lambda$20((State) this.L$0);
                    boolean booleanValue = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                    this.label = 1;
                    if (InteractiveCardState.animateCardTranslation$default(interactiveCardState, true, InteractiveCardEffect$lambda$20, booleanValue, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1((State) this.L$1, i8));
                    final Context context = (Context) this.L$0;
                    Flow flow4 = new Flow() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$invokeSuspend$$inlined$map$1

                        /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            public final /* synthetic */ Context $context$inlined;
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Context context, int i) {
                                this.$r8$classId = i;
                                this.$this_unsafeFlow = flowCollector;
                                this.$context$inlined = context;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1;
                                int i2;
                                int i3;
                                int i4 = this.$r8$classId;
                                Context context = this.$context$inlined;
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                switch (i4) {
                                    case 0:
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i5 = anonymousClass1.label;
                                            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                                Object obj2 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    SafeTrace.throwOnFailure(obj2);
                                                    Bitmap icon$default = CardsKt.getIcon$default(context, (((Boolean) obj).booleanValue() ? Icons.SensitiveVisible24 : Icons.SensitiveHidden24).drawableRes);
                                                    anonymousClass1.label = 1;
                                                    if (flowCollector.emit(icon$default, anonymousClass1) == coroutineSingletons) {
                                                        break;
                                                    }
                                                } else if (i != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    break;
                                                } else {
                                                    SafeTrace.throwOnFailure(obj2);
                                                }
                                                break;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj22 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                    default:
                                        if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1) {
                                            coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                                            int i6 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                                            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                                Object obj3 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.result;
                                                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i2 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                                                if (i2 != 0) {
                                                    SafeTrace.throwOnFailure(obj3);
                                                    if (((Boolean) obj).booleanValue()) {
                                                        zzd zzdVar = Icons.Companion;
                                                        i3 = R.drawable.icon_sensitive_visible_24;
                                                    } else {
                                                        zzd zzdVar2 = Icons.Companion;
                                                        i3 = R.drawable.icon_sensitive_hidden_24;
                                                    }
                                                    Bitmap icon$default2 = CardsKt.getIcon$default(context, i3);
                                                    coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                                    if (flowCollector.emit(icon$default2, coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
                                                        break;
                                                    }
                                                } else if (i2 != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    break;
                                                } else {
                                                    SafeTrace.throwOnFailure(obj3);
                                                }
                                                break;
                                            }
                                        }
                                        coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                                        Object obj32 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                                        if (i2 != 0) {
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector2, Continuation continuation2) {
                            int i26 = i13;
                            Context context2 = context;
                            SafeFlow safeFlow = snapshotFlow2;
                            switch (i26) {
                                case 0:
                                    Object collect2 = safeFlow.collect(new AnonymousClass2(flowCollector2, context2, 0), continuation2);
                                    if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object collect3 = safeFlow.collect(new AnonymousClass2(flowCollector2, context2, 1), continuation2);
                                    if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Flow flowOn = FlowKt.flowOn(flow4, DefaultIoScheduler.INSTANCE);
                    CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$2 = new CardSceneEffectKt$CardSceneEffect$6$1$2((CardScene) obj2, continuation, i12);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOn, cardSceneEffectKt$CardSceneEffect$6$1$2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i4, (MutableState) this.L$1)), i13);
                    HeroCardViewKt$Render$1$8$1 heroCardViewKt$Render$1$8$1 = new HeroCardViewKt$Render$1$8$1((State) this.L$0, (MutableState) obj2, continuation, i13);
                    this.label = 1;
                    if (FlowKt.collectLatest(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1, heroCardViewKt$Render$1$8$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState = (MutableState) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                    Animatable animatable = ((InteractiveCardState) mutableState.getValue()).zTranslation;
                    Float f = new Float(((CardModelView) this.L$1).cardTranslation[2]);
                    this.label = 1;
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                float f2 = ((CardSchemeViewModel.Module.HeroCardDetails) ((MutableState) obj2).getValue()).showPrepurchaseContourText ? -0.3f : RecyclerView.DECELERATION_RATE;
                Animatable animatable2 = ((InteractiveCardState) mutableState.getValue()).zTranslation;
                Float f3 = new Float(f2);
                SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, new Float(0.01f), 1);
                this.label = 2;
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardState interactiveCardState2 = (InteractiveCardState) this.L$1;
                    MutableState mutableState2 = (MutableState) this.L$0;
                    float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    boolean booleanValue3 = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                    this.label = 1;
                    if (InteractiveCardState.animateCardTranslation$default(interactiveCardState2, true, booleanValue2, booleanValue3, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                MutableState mutableState3 = (MutableState) obj2;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardState interactiveCardState3 = new InteractiveCardState();
                    launch$default = JobKt.launch$default(coroutineScope5, null, null, new TimerWorker$run$1(interactiveCardState3, mutableState3, continuation, i7), 3);
                    this.L$0 = null;
                    this.L$1 = launch$default;
                    this.label = 1;
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        float[] fArr4 = Hero3DCardViewKt.X_AXIS;
                        CardModelView cardModelView = (CardModelView) mutableState3.getValue();
                        if (cardModelView != null) {
                            cardModelView.setChildrenLocal(EmptyList.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                    launch$default = (StandaloneCoroutine) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                break;
            case 16:
                CardModelView cardModelView2 = (CardModelView) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new RevolvingInteractiveCardsKt$$ExternalSyntheticLambda2((CardRegistry.SharedCardTransitionState) this.L$1, (MutableState) obj2, i13));
                    CardModelView.AnonymousClass1 anonymousClass13 = new CardModelView.AnonymousClass1(i9, cardModelView2, continuation);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, anonymousClass13, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(9, (MutableState) this.L$1)), 24);
                    CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$1 = new CardAppletWorker$setup$1$2$1((CardRegistry.SharedCardTransitionState) this.L$0, (MutableState) obj2, continuation, 16);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, cardAppletWorker$setup$1$2$1, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final SafeFlow snapshotFlow4 = Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(i5, (MutableState) this.L$1));
                    final Context context2 = (Context) obj2;
                    Flow flow5 = new Flow() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$invokeSuspend$$inlined$map$1

                        /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            public final /* synthetic */ Context $context$inlined;
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Context context, int i) {
                                this.$r8$classId = i;
                                this.$this_unsafeFlow = flowCollector;
                                this.$context$inlined = context;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1;
                                int i2;
                                int i3;
                                int i4 = this.$r8$classId;
                                Context context = this.$context$inlined;
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                switch (i4) {
                                    case 0:
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i5 = anonymousClass1.label;
                                            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                                Object obj22 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    SafeTrace.throwOnFailure(obj22);
                                                    Bitmap icon$default = CardsKt.getIcon$default(context, (((Boolean) obj).booleanValue() ? Icons.SensitiveVisible24 : Icons.SensitiveHidden24).drawableRes);
                                                    anonymousClass1.label = 1;
                                                    if (flowCollector.emit(icon$default, anonymousClass1) == coroutineSingletons2) {
                                                        break;
                                                    }
                                                } else if (i != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    break;
                                                } else {
                                                    SafeTrace.throwOnFailure(obj22);
                                                }
                                                break;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj222 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                    default:
                                        if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1) {
                                            coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                                            int i6 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                                            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                                Object obj32 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.result;
                                                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i2 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                                                if (i2 != 0) {
                                                    SafeTrace.throwOnFailure(obj32);
                                                    if (((Boolean) obj).booleanValue()) {
                                                        zzd zzdVar = Icons.Companion;
                                                        i3 = R.drawable.icon_sensitive_visible_24;
                                                    } else {
                                                        zzd zzdVar2 = Icons.Companion;
                                                        i3 = R.drawable.icon_sensitive_hidden_24;
                                                    }
                                                    Bitmap icon$default2 = CardsKt.getIcon$default(context, i3);
                                                    coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                                    if (flowCollector.emit(icon$default2, coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons32) {
                                                        break;
                                                    }
                                                } else if (i2 != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    break;
                                                } else {
                                                    SafeTrace.throwOnFailure(obj32);
                                                }
                                                break;
                                            }
                                        }
                                        coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                                        Object obj322 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = coreInteractiveCardKt$InteractiveCardEffect$16$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                                        if (i2 != 0) {
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector2, Continuation continuation2) {
                            int i262 = i10;
                            Context context22 = context2;
                            SafeFlow safeFlow = snapshotFlow4;
                            switch (i262) {
                                case 0:
                                    Object collect2 = safeFlow.collect(new AnonymousClass2(flowCollector2, context22, 0), continuation2);
                                    if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object collect3 = safeFlow.collect(new AnonymousClass2(flowCollector2, context22, 1), continuation2);
                                    if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    Flow flowOn2 = FlowKt.flowOn(flow5, DefaultIoScheduler.INSTANCE);
                    Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 = new Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3(produceStateScope3, continuation, objArr3 == true ? 1 : 0);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOn2, hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new SessionWorkerKt$runSession$5(i11, continuation, i2), Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(i3, (MutableState) this.L$1)));
                    RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1((CardRegistry.SharedCardTransitionState) this.L$0, (CardNuxState) obj2, continuation, 21);
                    this.label = 1;
                    if (FlowKt.collectLatest(mapLatest, roomDatabase$performClear$1, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.L$1;
                    Offset offset = new Offset(Offset.m627timestuRUvjQ(Offset.m621divtuRUvjQ(((Offset) this.L$0).packedValue, ((SuspendingPointerInputModifierNodeImpl) ((PointerInputScope) obj2)).getDensity()), 0.8f));
                    this.label = 1;
                    if (mutableSharedFlow.emit(offset, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow5 = Updater.snapshotFlow(new ListsKt$$ExternalSyntheticLambda0(i7, (State) this.L$1, (State) this.L$0));
                    ProgressBarKt$ProgressBar$1$1 progressBarKt$ProgressBar$1$1 = new ProgressBarKt$ProgressBar$1$1((MutableFloatState) obj2, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow5, progressBarKt$ProgressBar$1$1, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow6 = Updater.snapshotFlow(new WalletHomeViewKt$$ExternalSyntheticLambda6(6, (MutableState) this.L$1));
                    TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass14 = new TakeUntil$collectSafely$2.AnonymousClass1(i9, (DefaultPagerState) this.L$0, (Function1) obj2);
                    this.label = 1;
                    Object collect2 = snapshotFlow6.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(anonymousClass14, i4), this);
                    if (collect2 != coroutineSingletons23) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass15 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope6, (TaxReturnsPresenter) obj2, i7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass15, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                try {
                } catch (Exception e) {
                    Timber.Forest.w("Exception fetching brand details", new Object[0], e);
                    LoaderState.Error error = new LoaderState.Error(e);
                    this.L$0 = null;
                    this.label = 5;
                    break;
                }
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    break;
                } else {
                    if (i38 != 1) {
                        if (i38 != 2) {
                            if (i38 == 3 || i38 == 4) {
                                SafeTrace.throwOnFailure(obj);
                            } else {
                                if (i38 != 5) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        fetchBrandDetails = obj;
                        apiResult = (ApiResult) fetchBrandDetails;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            LoaderState.Success success = new LoaderState.Success(((ApiResult.Success) apiResult).response);
                            this.L$0 = flowCollector2;
                            this.label = 3;
                            if (flowCollector2.emit(success, this) == coroutineSingletons25) {
                                return coroutineSingletons25;
                            }
                            return Unit.INSTANCE;
                        }
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Timber.Forest.w("Failed to fetch brand details: " + apiResult, new Object[0]);
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        LoaderState.Success success2 = new LoaderState.Success(emptyMap);
                        this.L$0 = flowCollector2;
                        this.label = 4;
                        if (flowCollector2.emit(success2, this) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                RealBrandDetailsService realBrandDetailsService = ((RealBrandDetailsDataLoader) obj2).brandDetailsService;
                List list3 = (List) this.L$1;
                this.L$0 = flowCollector2;
                this.label = 2;
                fetchBrandDetails = realBrandDetailsService.fetchBrandDetails(list3, this);
                if (fetchBrandDetails == coroutineSingletons25) {
                    return coroutineSingletons25;
                }
                apiResult = (ApiResult) fetchBrandDetails;
                if (!(apiResult instanceof ApiResult.Success)) {
                }
            case 25:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = (ArrayList) this.L$1;
                    JCAContext jCAContext = (JCAContext) obj2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(JobKt.async$default(coroutineScope7, null, null, new TimerWorker$run$1(jCAContext, (MerchantIdentifier) it2.next(), continuation, i5), 3));
                    }
                    this.L$0 = null;
                    this.label = 1;
                    awaitAll = AwaitKt.awaitAll(arrayList2, this);
                    if (awaitAll == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    awaitAll = obj;
                }
                return CollectionsKt.filterNotNull((Iterable) awaitAll);
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 != 0) {
                    if (i40 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) this.L$1;
                ComparableRange comparableRange = (ComparableRange) this.L$0;
                RealShiftDataLoader$retryFailedLoads$timecards$1 realShiftDataLoader$retryFailedLoads$timecards$1 = new RealShiftDataLoader$retryFailedLoads$timecards$1(realShiftDataLoader, (ShiftLoaderContext) obj2, continuation, i13);
                this.label = 1;
                Object access$loadInitialFeed = RealShiftDataLoader.access$loadInitialFeed(realShiftDataLoader, comparableRange, realShiftDataLoader$retryFailedLoads$timecards$1, this);
                return access$loadInitialFeed == coroutineSingletons27 ? coroutineSingletons27 : access$loadInitialFeed;
            case 27:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass16 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope8, (UnleashContext) obj2, 7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass16, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                MutableState mutableState4 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = this.label;
                if (i42 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantIdentifier merchantIdentifier = (MerchantIdentifier) ((MutableState) this.L$0).getValue();
                    if (merchantIdentifier == null || (str2 = merchantIdentifier.token) == null) {
                        return Unit.INSTANCE;
                    }
                    mutableState4.setValue(PayHistoryListPresenter$DataState.Loading.INSTANCE);
                    TaxAuthorizationPresenter taxAuthorizationPresenter = (TaxAuthorizationPresenter) this.L$1;
                    this.label = 1;
                    access$fetchStubs = TaxAuthorizationPresenter.access$fetchStubs(taxAuthorizationPresenter, str2, null, this);
                    if (access$fetchStubs == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i42 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$fetchStubs = obj;
                }
                PayHistoryListPresenter$FetchResult payHistoryListPresenter$FetchResult = (PayHistoryListPresenter$FetchResult) access$fetchStubs;
                mutableState4.setValue(payHistoryListPresenter$FetchResult != null ? new PayHistoryListPresenter$DataState.Loaded(payHistoryListPresenter$FetchResult.stubs, payHistoryListPresenter$FetchResult.nextOffset, false) : PayHistoryListPresenter$DataState.Error.INSTANCE);
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i43 = this.label;
                if (i43 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$1;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass17 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(coroutineScope9, (TextSetter) obj2, i8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(anonymousClass17, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i43 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAppletWorker$setup$1$2$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$0 = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAppletWorker$setup$1$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAppletWorker$setup$1$2$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAppletWorker$setup$1$2$1(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = obj;
    }
}
