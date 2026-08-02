package com.squareup.cash.wallet.views;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.IntSize;
import app.cash.redwood.treehouse.AppLifecycle$Companion$Adapter$GeneratedOutboundService;
import app.cash.sqldelight.db.QueryResult;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$2$1$2$1;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersSearchQueries$forId$2;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Hero3DCardViewKt$rotateDragFlow$2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $currentCardRotation;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ long J$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$rotateDragFlow$2(Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$currentCardRotation = obj;
        this.J$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$2 = new Hero3DCardViewKt$rotateDragFlow$2((Function0) this.$currentCardRotation, continuation, 0);
                hero3DCardViewKt$rotateDragFlow$2.J$0 = ((Offset) obj).packedValue;
                return hero3DCardViewKt$rotateDragFlow$2;
            case 1:
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$22 = new Hero3DCardViewKt$rotateDragFlow$2(this.J$0, continuation);
                hero3DCardViewKt$rotateDragFlow$22.$currentCardRotation = obj;
                return hero3DCardViewKt$rotateDragFlow$22;
            case 2:
                return new Hero3DCardViewKt$rotateDragFlow$2((AppLifecycle$Companion$Adapter$GeneratedOutboundService) this.$currentCardRotation, this.J$0, continuation, 2);
            case 3:
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$23 = new Hero3DCardViewKt$rotateDragFlow$2((DrawerViewKt$$ExternalSyntheticLambda2) this.$currentCardRotation, continuation, 3);
                hero3DCardViewKt$rotateDragFlow$23.J$0 = ((Offset) obj).packedValue;
                return hero3DCardViewKt$rotateDragFlow$23;
            case 4:
                return new Hero3DCardViewKt$rotateDragFlow$2((CardDesignLibraryScene) this.$currentCardRotation, this.J$0, continuation, 4);
            case 5:
                return new Hero3DCardViewKt$rotateDragFlow$2((Instrument$Adapter) this.$currentCardRotation, this.J$0, continuation, 5);
            case 6:
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$24 = new Hero3DCardViewKt$rotateDragFlow$2((GLSceneScope) this.$currentCardRotation, continuation, 6);
                hero3DCardViewKt$rotateDragFlow$24.J$0 = ((IntSize) obj).packedValue;
                return hero3DCardViewKt$rotateDragFlow$24;
            default:
                return new Hero3DCardViewKt$rotateDragFlow$2((RealOffersTabRepository) this.$currentCardRotation, this.J$0, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                long j = ((Offset) obj).packedValue;
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$2 = new Hero3DCardViewKt$rotateDragFlow$2((Function0) this.$currentCardRotation, (Continuation) obj2, 0);
                hero3DCardViewKt$rotateDragFlow$2.J$0 = j;
                return hero3DCardViewKt$rotateDragFlow$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((Hero3DCardViewKt$rotateDragFlow$2) create((ScrollingLogic$nestedScrollScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((Hero3DCardViewKt$rotateDragFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                long j2 = ((Offset) obj).packedValue;
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$22 = new Hero3DCardViewKt$rotateDragFlow$2((DrawerViewKt$$ExternalSyntheticLambda2) this.$currentCardRotation, (Continuation) obj2, 3);
                hero3DCardViewKt$rotateDragFlow$22.J$0 = j2;
                return hero3DCardViewKt$rotateDragFlow$22.invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((Hero3DCardViewKt$rotateDragFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((Hero3DCardViewKt$rotateDragFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                long j3 = ((IntSize) obj).packedValue;
                Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$23 = new Hero3DCardViewKt$rotateDragFlow$2((GLSceneScope) this.$currentCardRotation, (Continuation) obj2, 6);
                hero3DCardViewKt$rotateDragFlow$23.J$0 = j3;
                return hero3DCardViewKt$rotateDragFlow$23.invokeSuspend(Unit.INSTANCE);
            default:
                return ((Hero3DCardViewKt$rotateDragFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        char c = 0;
        switch (this.$r8$classId) {
            case 0:
                long j = this.J$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((Quat) ((Function0) this.$currentCardRotation).invoke()).times(new Quat((float) Math.toRadians(-Float.intBitsToFloat((int) (j >> 32))), Hero3DCardViewKt.Y_AXIS)).times(new Quat((float) Math.toRadians(-Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))), Hero3DCardViewKt.X_AXIS));
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) this.$currentCardRotation;
                long j2 = this.J$0;
                ScrollingLogic scrollingLogic = scrollingLogic$nestedScrollScope$1.this$0;
                scrollingLogic.m245performScroll3eAAhYA(scrollingLogic.outerStateScope, j2, 1);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AppLifecycle$Companion$Adapter$GeneratedOutboundService appLifecycle$Companion$Adapter$GeneratedOutboundService = (AppLifecycle$Companion$Adapter$GeneratedOutboundService) this.$currentCardRotation;
                Object call = appLifecycle$Companion$Adapter$GeneratedOutboundService.callHandler.call(appLifecycle$Companion$Adapter$GeneratedOutboundService, 1, Long.valueOf(this.J$0));
                call.getClass();
                return Unit.INSTANCE;
            case 3:
                long j3 = this.J$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((Quat) ((DrawerViewKt$$ExternalSyntheticLambda2) this.$currentCardRotation).invoke()).times(new Quat((float) Math.toRadians(Float.intBitsToFloat((int) (j3 >> 32)) * 0.8d), CardSceneEffectKt.Y_AXIS)).times(new Quat((float) Math.toRadians(Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) * 0.8d), CardSceneEffectKt.X_AXIS));
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) this.$currentCardRotation;
                long j4 = this.J$0;
                float m681getRedimpl = Color.m681getRedimpl(j4);
                float m680getGreenimpl = Color.m680getGreenimpl(j4);
                float m678getBlueimpl = Color.m678getBlueimpl(j4);
                float m677getAlphaimpl = Color.m677getAlphaimpl(j4);
                if (cardDesignLibraryScene.clearColorR != m681getRedimpl || cardDesignLibraryScene.clearColorG != m680getGreenimpl || cardDesignLibraryScene.clearColorB != m678getBlueimpl || cardDesignLibraryScene.clearColorA != m677getAlphaimpl) {
                    cardDesignLibraryScene.clearColorR = m681getRedimpl;
                    cardDesignLibraryScene.clearColorG = m680getGreenimpl;
                    cardDesignLibraryScene.clearColorB = m678getBlueimpl;
                    cardDesignLibraryScene.clearColorA = m677getAlphaimpl;
                    cardDesignLibraryScene.markDirty();
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) ((Instrument$Adapter) this.$currentCardRotation).card_brandAdapter;
                QueryResult execute = gpsConfigQueries.driver.execute(-2060187222, "UPDATE gpsConfig\nSET location_updated_at = ?", new c7$$ExternalSyntheticLambda6(this.J$0, 13));
                gpsConfigQueries.notifyQueries(-2060187222, new GpsConfigQueries$$ExternalSyntheticLambda1(c));
                return execute;
            case 6:
                long j5 = this.J$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope = ((GLSceneScope) this.$currentCardRotation).glScope;
                if (coroutineScope != null) {
                    JobKt.launch$default(coroutineScope, null, null, new GLSceneScope$FrameRenderer$2$1$2$1(j5, null), 3);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("glScope");
                throw null;
            default:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries2 = ((RealOffersTabRepository) this.$currentCardRotation).cashDatabase.offersSearchQueries;
                long j6 = this.J$0;
                gpsConfigQueries2.getClass();
                OffersSearchQueries$forId$2 offersSearchQueries$forId$2 = OffersSearchQueries$forId$2.INSTANCE;
                return new OffersHomeQueries$ForIdQuery(gpsConfigQueries2, j6, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries2, c), 5).executeAsOneOrNull();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hero3DCardViewKt$rotateDragFlow$2(long j, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.J$0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$rotateDragFlow$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$currentCardRotation = obj;
    }
}
