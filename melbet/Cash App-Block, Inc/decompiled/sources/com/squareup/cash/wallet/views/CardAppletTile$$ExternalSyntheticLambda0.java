package com.squareup.cash.wallet.views;

import android.view.View;
import androidx.camera.video.Recorder;
import androidx.collection.internal.Lock;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintSetScope;
import androidx.constraintlayout.compose.DimensionDescription;
import androidx.core.view.NestedScrollingChild;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.wallet.db.CardCustomizationQueries$select$2;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTile$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CardAppletTile$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinearGradient m132linearGradientmHitzGk;
        List split$default;
        int i = this.$r8$classId;
        AppletTileInstallationState.Installed installed = AppletTileInstallationState.Installed.INSTANCE;
        boolean z = true;
        z = true;
        final int i2 = 0;
        switch (i) {
            case 0:
                CardAppletTileViewModel cardAppletTileViewModel = (CardAppletTileViewModel) obj;
                cardAppletTileViewModel.getClass();
                if (cardAppletTileViewModel instanceof CardAppletTileViewModel.Loading) {
                    if (!((CardAppletTileViewModel.Loading) cardAppletTileViewModel).isAvailable) {
                        return AppletTileInstallationState.Loading.INSTANCE;
                    }
                } else {
                    if (!(cardAppletTileViewModel instanceof CardAppletTileViewModel.WithCardUi)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!(cardAppletTileViewModel instanceof CardAppletTileViewModel.Installed)) {
                        return AppletTileInstallationState.Uninstalled.INSTANCE;
                    }
                }
                return installed;
            case 1:
                return Boolean.valueOf(((View) obj) instanceof NestedScrollingChild);
            case 2:
                Digit digit = (Digit) obj;
                digit.getClass();
                if (!(digit instanceof Digit.Number) && !digit.isDecimalPoint$amountview()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((Double) obj).getClass();
                return "%";
            case 4:
                ((Digit) obj).getClass();
                return Boolean.TRUE;
            case 5:
                ConstraintSetScope constraintSetScope = (ConstraintSetScope) obj;
                constraintSetScope.getClass();
                final ConstrainedLayoutReference constrainedLayoutReference = new ConstrainedLayoutReference("imageVisual");
                final ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference("text");
                constraintSetScope.constrain(constrainedLayoutReference, new Function1() { // from class: com.squareup.cash.upsell.views.components.NullStateUiGroupViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i3 = i2;
                        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReference2;
                        ConstrainScope constrainScope = (ConstrainScope) obj2;
                        switch (i3) {
                            case 0:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference4 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference4.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference4.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference4.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference3.top, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription = new DimensionDescription("spread");
                                Dp dp = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass3 = dimensionDescription.min;
                                anonymousClass3.val$completer = dp;
                                anonymousClass3.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 1:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference3.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass1 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference5 = constrainScope.parent;
                                anonymousClass1.m110linkToVpY3zN4(constrainedLayoutReference5.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference5.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference5.bottom, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription2 = new DimensionDescription("spread");
                                Dp dp2 = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass32 = dimensionDescription2.min;
                                anonymousClass32.val$completer = dp2;
                                anonymousClass32.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription2);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 2:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass42 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference6 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass42, constrainedLayoutReference6.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference6.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference6.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference3.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                            default:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference3.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass12 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference7 = constrainScope.parent;
                                anonymousClass12.m110linkToVpY3zN4(constrainedLayoutReference7.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference7.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference7.bottom, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i3 = 3;
                constraintSetScope.constrain(constrainedLayoutReference2, new Function1() { // from class: com.squareup.cash.upsell.views.components.NullStateUiGroupViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i32 = i3;
                        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReference;
                        ConstrainScope constrainScope = (ConstrainScope) obj2;
                        switch (i32) {
                            case 0:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference4 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference4.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference4.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference4.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference3.top, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription = new DimensionDescription("spread");
                                Dp dp = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass3 = dimensionDescription.min;
                                anonymousClass3.val$completer = dp;
                                anonymousClass3.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 1:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference3.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass1 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference5 = constrainScope.parent;
                                anonymousClass1.m110linkToVpY3zN4(constrainedLayoutReference5.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference5.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference5.bottom, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription2 = new DimensionDescription("spread");
                                Dp dp2 = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass32 = dimensionDescription2.min;
                                anonymousClass32.val$completer = dp2;
                                anonymousClass32.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription2);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 2:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass42 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference6 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass42, constrainedLayoutReference6.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference6.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference6.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference3.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                            default:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference3.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass12 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference7 = constrainScope.parent;
                                anonymousClass12.m110linkToVpY3zN4(constrainedLayoutReference7.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference7.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference7.bottom, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            case 6:
                ConstraintSetScope constraintSetScope2 = (ConstraintSetScope) obj;
                constraintSetScope2.getClass();
                final ConstrainedLayoutReference constrainedLayoutReference3 = new ConstrainedLayoutReference("imageVisual");
                final ConstrainedLayoutReference constrainedLayoutReference4 = new ConstrainedLayoutReference("text");
                final int i4 = z ? 1 : 0;
                constraintSetScope2.constrain(constrainedLayoutReference3, new Function1() { // from class: com.squareup.cash.upsell.views.components.NullStateUiGroupViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i32 = i4;
                        ConstrainedLayoutReference constrainedLayoutReference32 = constrainedLayoutReference4;
                        ConstrainScope constrainScope = (ConstrainScope) obj2;
                        switch (i32) {
                            case 0:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference42 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference42.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference42.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference42.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference32.top, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription = new DimensionDescription("spread");
                                Dp dp = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass3 = dimensionDescription.min;
                                anonymousClass3.val$completer = dp;
                                anonymousClass3.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 1:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference32.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass1 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference5 = constrainScope.parent;
                                anonymousClass1.m110linkToVpY3zN4(constrainedLayoutReference5.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference5.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference5.bottom, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription2 = new DimensionDescription("spread");
                                Dp dp2 = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass32 = dimensionDescription2.min;
                                anonymousClass32.val$completer = dp2;
                                anonymousClass32.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription2);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 2:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass42 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference6 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass42, constrainedLayoutReference6.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference6.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference6.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference32.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                            default:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference32.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass12 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference7 = constrainScope.parent;
                                anonymousClass12.m110linkToVpY3zN4(constrainedLayoutReference7.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference7.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference7.bottom, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i5 = 2;
                constraintSetScope2.constrain(constrainedLayoutReference4, new Function1() { // from class: com.squareup.cash.upsell.views.components.NullStateUiGroupViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i32 = i5;
                        ConstrainedLayoutReference constrainedLayoutReference32 = constrainedLayoutReference3;
                        ConstrainScope constrainScope = (ConstrainScope) obj2;
                        switch (i32) {
                            case 0:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass4 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference42 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference42.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference42.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference42.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference32.top, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription = new DimensionDescription("spread");
                                Dp dp = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass3 = dimensionDescription.min;
                                anonymousClass3.val$completer = dp;
                                anonymousClass3.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 1:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference32.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass1 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference5 = constrainScope.parent;
                                anonymousClass1.m110linkToVpY3zN4(constrainedLayoutReference5.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference5.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference5.bottom, RecyclerView.DECELERATION_RATE, 6);
                                DimensionDescription dimensionDescription2 = new DimensionDescription("spread");
                                Dp dp2 = new Dp(100.0f);
                                Recorder.AnonymousClass3 anonymousClass32 = dimensionDescription2.min;
                                anonymousClass32.val$completer = dp2;
                                anonymousClass32.val$recordingToStart = null;
                                constrainScope.setHeight(dimensionDescription2);
                                constrainScope.setWidth(new DimensionDescription("80.0%"));
                                break;
                            case 2:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4 anonymousClass42 = constrainScope.top;
                                ConstrainedLayoutReference constrainedLayoutReference6 = constrainScope.parent;
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass42, constrainedLayoutReference6.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.start.m110linkToVpY3zN4(constrainedLayoutReference6.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference6.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference32.top, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                            default:
                                constrainScope.getClass();
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.top, constrainedLayoutReference32.bottom, RecyclerView.DECELERATION_RATE, 6);
                                Recorder.AnonymousClass1 anonymousClass12 = constrainScope.start;
                                ConstrainedLayoutReference constrainedLayoutReference7 = constrainScope.parent;
                                anonymousClass12.m110linkToVpY3zN4(constrainedLayoutReference7.start, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                constrainScope.end.m110linkToVpY3zN4(constrainedLayoutReference7.end, (r2 & 2) != 0 ? RecyclerView.DECELERATION_RATE : 20.0f);
                                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(constrainScope.bottom, constrainedLayoutReference7.bottom, RecyclerView.DECELERATION_RATE, 6);
                                constrainScope.setHeight(new DimensionDescription("wrap"));
                                constrainScope.setWidth(new DimensionDescription("parent"));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            case 7:
                UserJourney userJourney = (UserJourney) obj;
                userJourney.getClass();
                return Boolean.valueOf(userJourney.isSubJourney());
            case 8:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                return CardCustomizationQueries$select$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0), androidCursor.getBytes(1));
            case 9:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("cardCustomization");
                return Unit.INSTANCE;
            case 10:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("cardTabHeroState");
                return Unit.INSTANCE;
            case 11:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 14:
                ((WalletHomeViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((WalletHomeViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                layoutNodeDrawScope.drawContent();
                Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                long j = Color.Black;
                m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r11, new Pair[]{new Pair(valueOf, new Color(j)), new Pair(Float.valueOf(0.6f), new Color(j)), new Pair(Float.valueOf(1.0f), new Color(Color.Transparent))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                DrawScope.m746drawRectAsUm42w$default(layoutNodeDrawScope, m132linearGradientmHitzGk, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 6, 62);
                return Unit.INSTANCE;
            case 17:
                ((CardScene) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationY(-(Float.intBitsToFloat((int) (reusableGraphicsLayerScope.size & BodyPartID.bodyIdMax)) / 2.0f));
                return Unit.INSTANCE;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((CardSchemeViewModel.Module.HeroCardDetails) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.getClass();
                keyframesSpecConfig.durationMillis = 800;
                keyframesSpecConfig.at(Float.valueOf(RecyclerView.DECELERATION_RATE), 0).easing = CardNuxAnimationsKt.EXIT_PHASE1_EASING;
                keyframesSpecConfig.at(Float.valueOf(0.45875f), 367).easing = CardNuxAnimationsKt.EXIT_PHASE2_EASING;
                keyframesSpecConfig.at(Float.valueOf(1.0f), 800);
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver2, -1.0f);
                return Unit.INSTANCE;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 27:
                WorkAppletTileModel workAppletTileModel = (WorkAppletTileModel) obj;
                workAppletTileModel.getClass();
                if ((workAppletTileModel instanceof WorkAppletTileModel.Installed) || (workAppletTileModel instanceof WorkAppletTileModel.Loading)) {
                    return installed;
                }
                if (workAppletTileModel instanceof WorkAppletTileModel.Failed) {
                    return new AppletTileInstallationState.Failure(((WorkAppletTileModel.Failed) workAppletTileModel).cause);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 28:
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    return EmptySet.INSTANCE;
                }
                split$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
                return CollectionsKt.toSet(split$default);
            default:
                Set set = (Set) obj;
                set.getClass();
                return CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62);
        }
    }
}
