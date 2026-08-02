package com.squareup.cash.wallet.views;

import androidx.compose.foundation.layout.RowScopeInstance$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.local.presenters.internal.CashBalanceKt;
import app.cash.local.presenters.internal.CashBannerKt;
import app.cash.local.presenters.internal.LocalBrandBannersKt;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.collections.MarkerManager;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$5$1$1$1$1;
import com.squareup.cash.graphics.backend.gl.core.ObjMesh;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda4(CardWobbleState cardWobbleState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.$r8$classId = 5;
        this.f$0 = cardWobbleState;
        this.f$2 = mutableState;
        this.f$3 = mutableState2;
        this.f$4 = mutableState3;
        this.f$6 = mutableState4;
        this.f$1 = mutableState5;
        this.f$5 = mutableState6;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b2  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        LocalBrandBannerModel localBrandBannerModel;
        LocalCashMarketingContent localCashMarketingContent;
        LocalCashMarketingContent.Template template;
        LocalBrandBanner brandBannerForSpot;
        int i = this.$r8$classId;
        Object obj = this.f$5;
        Object obj2 = this.f$1;
        Object obj3 = this.f$6;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                MutableState mutableState3 = (MutableState) obj3;
                CardSchemeViewModel.Module.Accessory.Button button = ((CardSchemeViewModel.Module.HeroCard) obj7).rightButton;
                button.getClass();
                button.onClick.invoke();
                if (!((Boolean) ((MutableState) obj6).getValue()).booleanValue()) {
                    CardModelView cardModelView = (CardModelView) mutableState.getValue();
                    JobKt.launch$default(coroutineScope, null, null, new RoomDatabase$performClear$1.AnonymousClass1(cardModelView != null ? ((Boolean) cardModelView._isFacingForward$delegate.getValue()).booleanValue() : ((Boolean) mutableState2.getValue()).booleanValue(), snapshotStateList, mutableState3, (Continuation) null, 19), 3);
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj2;
                MutableState mutableState4 = (MutableState) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                MutableState mutableState6 = (MutableState) obj4;
                State state = (State) obj3;
                State state2 = (State) obj;
                if (((MarketingMessageOfferDetails) obj7) != null || !((Boolean) mutableState4.getValue()).booleanValue() || ((Boolean) mutableState5.getValue()).booleanValue()) {
                    return null;
                }
                GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) mutableState6.getValue();
                if (buyerInfo != null && (brandBannerForSpot = LocalBrandBanner.Companion.brandBannerForSpot(buyerInfo, LocalBrandBanner.Spot.PROFILE)) != null) {
                    if (brandBannerForSpot.action instanceof LocalBrandBanner.Action.ApplySingleOffer) {
                        brandBannerForSpot = null;
                    }
                    if (brandBannerForSpot != null) {
                        localBrandBannerModel = LocalBrandBannersKt.toBannerModel(brandBannerForSpot);
                        if (localBrandBannerModel == null) {
                            return localBrandBannerModel;
                        }
                        if (!list.isEmpty() || (localCashMarketingContent = ((Brand) state.getValue()).marketingContent) == null || (template = localCashMarketingContent.brand_profile) == null) {
                            return null;
                        }
                        return CashBannerKt.cashBannerModel(template, CashBalanceKt.asLocalMoneyOrZero((LocalCashBalance) state2.getValue()), LocalBrandBannerModel.Mode.Dismissible.INSTANCE);
                    }
                }
                localBrandBannerModel = null;
                if (localBrandBannerModel == null) {
                }
                break;
            case 2:
                ClusterManager clusterManager = (ClusterManager) obj7;
                DefaultClusterRenderer defaultClusterRenderer = (DefaultClusterRenderer) obj2;
                Function1 function1 = (Function1) obj6;
                Function1 function12 = (Function1) obj5;
                Function1 function13 = (Function1) obj4;
                Function1 function14 = (Function1) obj3;
                Function1 function15 = (Function1) obj;
                if (clusterManager != null && defaultClusterRenderer != null) {
                    if (!Intrinsics.areEqual(clusterManager.mRenderer, defaultClusterRenderer)) {
                        DefaultClusterRenderer defaultClusterRenderer2 = clusterManager.mRenderer;
                        defaultClusterRenderer2.mClickListener = null;
                        defaultClusterRenderer2.mItemClickListener = null;
                        clusterManager.mClusterMarkers.clear();
                        clusterManager.mMarkers.clear();
                        ClusterManager clusterManager2 = clusterManager.mRenderer.mClusterManager;
                        MarkerManager.Collection collection = clusterManager2.mMarkers;
                        collection.mMarkerClickListener = null;
                        collection.mInfoWindowClickListener = null;
                        collection.mInfoWindowLongClickListener = null;
                        MarkerManager.Collection collection2 = clusterManager2.mClusterMarkers;
                        collection2.mMarkerClickListener = null;
                        collection2.mInfoWindowClickListener = null;
                        collection2.mInfoWindowLongClickListener = null;
                        clusterManager.mRenderer = defaultClusterRenderer;
                        defaultClusterRenderer.onAdd();
                        DefaultClusterRenderer defaultClusterRenderer3 = clusterManager.mRenderer;
                        defaultClusterRenderer3.mClickListener = clusterManager.mOnClusterClickListener;
                        defaultClusterRenderer3.mItemClickListener = clusterManager.mOnClusterItemClickListener;
                        defaultClusterRenderer3.mItemInfoWindowClickListener = clusterManager.mOnClusterItemInfoWindowClickListener;
                        defaultClusterRenderer3.mItemInfoWindowLongClickListener = clusterManager.mOnClusterItemInfoWindowLongClickListener;
                        clusterManager.cluster();
                    }
                    RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0 = new RowScopeInstance$$ExternalSyntheticLambda0(function1);
                    clusterManager.mOnClusterClickListener = rowScopeInstance$$ExternalSyntheticLambda0;
                    DefaultClusterRenderer defaultClusterRenderer4 = clusterManager.mRenderer;
                    defaultClusterRenderer4.mClickListener = rowScopeInstance$$ExternalSyntheticLambda0;
                    RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda02 = new RowScopeInstance$$ExternalSyntheticLambda0(function12);
                    clusterManager.mOnClusterItemClickListener = rowScopeInstance$$ExternalSyntheticLambda02;
                    defaultClusterRenderer4.mItemClickListener = rowScopeInstance$$ExternalSyntheticLambda02;
                    RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda03 = new RowScopeInstance$$ExternalSyntheticLambda0(function13);
                    clusterManager.mOnClusterItemInfoWindowClickListener = rowScopeInstance$$ExternalSyntheticLambda03;
                    defaultClusterRenderer4.mItemInfoWindowClickListener = rowScopeInstance$$ExternalSyntheticLambda03;
                    RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda04 = new RowScopeInstance$$ExternalSyntheticLambda0(function14);
                    clusterManager.mOnClusterItemInfoWindowLongClickListener = rowScopeInstance$$ExternalSyntheticLambda04;
                    defaultClusterRenderer4.mItemInfoWindowLongClickListener = rowScopeInstance$$ExternalSyntheticLambda04;
                    if (function15 != null) {
                        function15.invoke(clusterManager);
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 3:
                ((Ref$ObjectRef) obj7).element = Long.valueOf(System.currentTimeMillis());
                PointerInputModifierNodeKt.trackBlockerSubmission((Analytics) obj2, (BlockersData) obj6, (String) obj5, (String) obj4, (String) obj3, (BlockerFlowReferrerType) obj);
                return Unit.INSTANCE;
            case 4:
                GLSceneScope gLSceneScope = (GLSceneScope) obj7;
                PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) obj2;
                ObjMesh objMesh = (ObjMesh) obj6;
                Matrix4 matrix4 = (Matrix4) obj5;
                Matrix4 matrix42 = (Matrix4) obj4;
                Matrix4 matrix43 = (Matrix4) obj3;
                List list2 = (List) obj;
                CoroutineScope coroutineScope2 = gLSceneScope.glScope;
                if (coroutineScope2 != null) {
                    JobKt.launch$default(coroutineScope2, null, null, new GLSceneScope$FrameRenderer$5$1$1$1$1(pBRMaterialInstance, objMesh, matrix4, matrix42, matrix43, gLSceneScope, list2, null, 0), 3);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("glScope");
                throw null;
            default:
                CardWobbleState cardWobbleState = (CardWobbleState) obj7;
                MutableState mutableState7 = (MutableState) obj5;
                MutableState mutableState8 = (MutableState) obj4;
                MutableState mutableState9 = (MutableState) obj3;
                MutableState mutableState10 = (MutableState) obj2;
                MutableState mutableState11 = (MutableState) obj;
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) ((MutableState) obj6).getValue();
                CardSchemeViewModel.Module.CustomizationImage customizationImage = heroCardDetails != null ? heroCardDetails.customizationImage : null;
                return new CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate((CardModelView.ViewModel) mutableState7.getValue(), ((Quat) mutableState8.getValue()).times(cardWobbleState.wobbleRotation()), ((Number) ((InteractiveCardState) mutableState9.getValue()).zTranslation.getValue()).floatValue() + cardWobbleState.wobbleTranslation().vector[2], (EquatableBitmap) mutableState10.getValue(), customizationImage != null, Intrinsics.areEqual((CardSchemeViewModel.Module.CustomizationImage) mutableState11.getValue(), customizationImage));
        }
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda4(CardSchemeViewModel.Module.HeroCard heroCard, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SnapshotStateList snapshotStateList, MutableState mutableState4) {
        this.$r8$classId = 0;
        this.f$0 = heroCard;
        this.f$1 = coroutineScope;
        this.f$2 = mutableState;
        this.f$3 = mutableState2;
        this.f$4 = mutableState3;
        this.f$5 = snapshotStateList;
        this.f$6 = mutableState4;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$6 = obj6;
        this.f$5 = obj7;
    }
}
