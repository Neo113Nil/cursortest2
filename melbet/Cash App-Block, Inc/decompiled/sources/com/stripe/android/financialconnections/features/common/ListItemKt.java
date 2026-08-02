package com.stripe.android.financialconnections.features.common;

import android.content.res.Configuration;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SwitchKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SweepGradient;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda5;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.z4$$ExternalSyntheticLambda3;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.api.internal.zabr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.moneybot.widgets.FloatingChatInputKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.presenters.RealOffersDetailsStateManager$states$1$1;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.details.OffersLoadingKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ProfileHeaderMenuSheet$Content$2$1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda32;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.cash.work.views.ClockedInStatusDotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda1;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNoticeBody;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.Entry;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsBody;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Primary;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.components.StringAnnotation;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.format.CurrencyFormatter;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.StripeImageKt;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda5;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes8.dex */
public abstract class ListItemKt {

    /* renamed from: lambda$-1477221777, reason: not valid java name */
    public static final ComposableLambdaImpl f798lambda$1477221777;

    /* renamed from: lambda$-1709284826, reason: not valid java name */
    public static final ComposableLambdaImpl f799lambda$1709284826;

    /* renamed from: lambda$-822699089, reason: not valid java name */
    public static final ComposableLambdaImpl f801lambda$822699089;

    /* renamed from: lambda$-983776976, reason: not valid java name */
    public static final ComposableLambdaImpl f802lambda$983776976;
    public static final ComposableLambdaImpl lambda$1704498329;
    public static final ComposableLambdaImpl lambda$347978968;

    /* renamed from: lambda$-117198573, reason: not valid java name */
    public static final ComposableLambdaImpl f797lambda$117198573 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(29), false, -117198573);

    /* renamed from: lambda$-2052014915, reason: not valid java name */
    public static final ComposableLambdaImpl f800lambda$2052014915 = new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(1), false, -2052014915);

    static {
        new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(2), false, -530833761);
        new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(19), false, -1209818533);
        f801lambda$822699089 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(20), false, -822699089);
        new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(4), false, 645670521);
        new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(24), false, 1361912381);
        new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(5), false, 205785441);
        f802lambda$983776976 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(25), false, -983776976);
        lambda$1704498329 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(26), false, 1704498329);
        new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(27), false, 922027301);
        new ComposableLambdaImpl(new ExitViewModel$$ExternalSyntheticLambda0(3), false, -1205081696);
        f798lambda$1477221777 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(21), false, -1477221777);
        lambda$347978968 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(22), false, 347978968);
        new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(23), false, -803806876);
        f799lambda$1709284826 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(28), false, -1709284826);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountItem(boolean z, boolean z2, Function1 function1, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        NetworkedAccount networkedAccount2;
        boolean z4;
        NetworkedAccount networkedAccount3;
        RecomposeScopeImpl endRestartGroup;
        boolean booleanValue;
        AccountSelectionState accountSelectionState;
        Applier applier;
        boolean z5;
        long j;
        Image image;
        AccountSelectionState accountSelectionState2;
        String str;
        int i5;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        float f;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        AccountSelectionState accountSelectionState3;
        String str2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-710651219);
        Applier applier2 = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z3 = z2;
            i3 |= gapComposer.changed(z3) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(partnerAccount) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                networkedAccount2 = networkedAccount;
                i3 |= gapComposer.changedInstance(networkedAccount2) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    boolean z6 = i6 != 0 ? true : z3;
                    NetworkedAccount networkedAccount4 = i4 != 0 ? null : networkedAccount2;
                    View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                    boolean changed = gapComposer.changed(partnerAccount) | gapComposer.changed(networkedAccount4);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        if (networkedAccount4 != null) {
                            booleanValue = networkedAccount4.allowSelection;
                        } else {
                            Boolean bool = partnerAccount._allowSelection;
                            booleanValue = bool != null ? bool.booleanValue() : true;
                        }
                        if (booleanValue) {
                            accountSelectionState = AccountSelectionState.Enabled;
                        } else {
                            accountSelectionState = (networkedAccount4 != null ? networkedAccount4.drawerOnSelection : null) != null ? AccountSelectionState.VisuallyDisabled : AccountSelectionState.Disabled;
                        }
                        rememberedValue = accountSelectionState;
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AccountSelectionState accountSelectionState4 = (AccountSelectionState) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    RoundedCornerShape roundedCornerShape = (RoundedCornerShape) rememberedValue2;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth(companion2, 1.0f), roundedCornerShape);
                    float f2 = z ? 2.0f : 1.0f;
                    if (z) {
                        applier = applier2;
                        gapComposer.startReplaceGroup(-36000908);
                        long j2 = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).primary;
                        gapComposer.end(false);
                        z5 = z6;
                        j = j2;
                    } else {
                        applier = applier2;
                        gapComposer.startReplaceGroup(-35999526);
                        z5 = z6;
                        long j3 = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).borderNeutral;
                        gapComposer.end(false);
                        j = j3;
                    }
                    Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(clip, f2, j, roundedCornerShape);
                    boolean z7 = accountSelectionState4 != AccountSelectionState.Disabled;
                    boolean changedInstance = gapComposer.changedInstance(view) | ((i3 & 896) == 256) | gapComposer.changedInstance(partnerAccount);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new HeroCardViewKt$$ExternalSyntheticLambda9(view, function1, partnerAccount, 15);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(AlphaKt.alpha(TextKt.m4021clickableSingleXHw0xAI$default(m178borderxT4_qwU, z7, null, (Function0) rememberedValue3, 6), accountSelectionState4.alpha), 16.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$15);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$16);
                    int i7 = i3;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                    SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$16);
                    if (networkedAccount4 == null || (image = networkedAccount4.accountIcon) == null) {
                        FinancialConnectionsInstitution financialConnectionsInstitution = partnerAccount.institution;
                        image = financialConnectionsInstitution != null ? financialConnectionsInstitution.icon : null;
                    }
                    if (image == null || (str2 = image.f809default) == null || !z5) {
                        accountSelectionState2 = accountSelectionState4;
                        str = null;
                    } else {
                        accountSelectionState2 = accountSelectionState4;
                        str = str2;
                    }
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1526955635);
                        i5 = 0;
                        gapComposer.end(false);
                        companion = companion2;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        accountSelectionState3 = accountSelectionState2;
                        f = 1.0f;
                    } else {
                        i5 = 0;
                        gapComposer.startReplaceGroup(-1526955634);
                        companion = companion2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        f = 1.0f;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        accountSelectionState3 = accountSelectionState2;
                        InstitutionIcon(0, 6, gapComposer, null, str, false);
                        gapComposer.end(false);
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f, true);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, i5);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$14);
                    SVG$Unit$EnumUnboxingLocalUtility.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$1);
                    String str3 = partnerAccount.name;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
                    NetworkedAccount networkedAccount5 = networkedAccount4;
                    androidx.compose.material.TextKt.m509Text4IGK_g(str3, null, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelLargeEmphasized, gapComposer, 0, 3120, 55290);
                    AccountSubtitle(accountSelectionState3, partnerAccount, networkedAccount5, gapComposer, (i7 >> 6) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                    gapComposer.end(true);
                    IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_checkmark, 0, gapComposer), "Selected", AlphaKt.alpha(SizeKt.m285size3ABfNKs(companion, 24.0f), z ? f : RecyclerView.DECELERATION_RATE), ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).primary, gapComposer, Painter.$stable | 48, 0);
                    gapComposer = gapComposer;
                    gapComposer.end(true);
                    gapComposer.end(true);
                    networkedAccount3 = networkedAccount5;
                    z4 = z5;
                } else {
                    gapComposer.skipToGroupEnd();
                    z4 = z3;
                    networkedAccount3 = networkedAccount2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(z, z4, function1, partnerAccount, networkedAccount3, i, i2);
                    return;
                }
                return;
            }
            networkedAccount2 = networkedAccount;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z2;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        networkedAccount2 = networkedAccount;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void AccountNumberRetrievalErrorContent(AccountNumberRetrievalError accountNumberRetrievalError, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Pair pair;
        accountNumberRetrievalError.getClass();
        boolean z = accountNumberRetrievalError.showManualEntry;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1714910993);
        int i3 = (gapComposer.changedInstance(accountNumberRetrievalError) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1439106829, new FieldBinding$$ExternalSyntheticLambda5(accountNumberRetrievalError, 5), gapComposer);
            String stringResource = Room.stringResource(gapComposer, R.string.stripe_attachlinkedpaymentaccount_error_title);
            if (z) {
                i2 = R.string.stripe_attachlinkedpaymentaccount_error_desc_manual_entry;
            } else {
                if (z) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = R.string.stripe_attachlinkedpaymentaccount_error_desc;
            }
            String stringResource2 = Room.stringResource(gapComposer, i2);
            Pair pair2 = new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_select_another_bank), function0);
            if (z) {
                gapComposer.startReplaceGroup(278295191);
                pair = new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_manual_entry), function02);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(278450005);
                gapComposer.end(false);
                pair = null;
            }
            ErrorContent(rememberComposableLambda, stringResource, stringResource2, pair2, pair, gapComposer, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) accountNumberRetrievalError, (Object) function0, (Object) function02, i, 15);
        }
    }

    public static final void AccountSubtitle(AccountSelectionState accountSelectionState, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, Composer composer, int i) {
        int i2;
        String str;
        String str2;
        String str3 = partnerAccount.allowSelectionMessage;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(242390471);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(accountSelectionState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(partnerAccount) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(networkedAccount) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str4 = null;
            if ((networkedAccount != null ? networkedAccount.caption : null) != null) {
                str3 = networkedAccount.caption;
            } else if (accountSelectionState == AccountSelectionState.Enabled || str3 == null || !(!StringsKt.isBlank(str3))) {
                str3 = null;
            }
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (str3 == null) {
                String str5 = partnerAccount.displayableAccountNumbers;
                if (str5 == null) {
                    str5 = "";
                }
                str = "••••".concat(str5);
            } else {
                str = str3;
            }
            String str6 = str3;
            ScanningStarPulseKt.m3552MiddleEllipsisTextoiE5lR0(str, null, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textSubdued, 0L, 0L, (accountSelectionState == AccountSelectionState.Disabled || str3 == null) ? null : TextDecoration.Underline, 0L, false, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelMedium, (char) 0, 0, gapComposer, 0, 57082);
            gapComposer = gapComposer;
            gapComposer.startReplaceGroup(131376579);
            Locale locale = PlatformKt.getLocales((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Integer num = partnerAccount.balanceAmount;
            String str7 = partnerAccount.currency;
            if (num == null || str7 == null) {
                gapComposer.end(false);
                str2 = null;
            } else {
                if (booleanValue) {
                    str2 = str7 + num;
                } else {
                    Map map = CurrencyFormatter.SERVER_DECIMAL_DIGITS;
                    long intValue = num.intValue();
                    locale.getClass();
                    String upperCase = str7.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    Currency currency = Currency.getInstance(upperCase);
                    currency.getClass();
                    int defaultDecimalDigits = CurrencyFormatter.getDefaultDecimalDigits(currency);
                    double pow = intValue / Math.pow(10.0d, defaultDecimalDigits);
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        currencyInstance.getClass();
                        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
                        decimalFormatSymbols.setCurrency(currency);
                        decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(locale));
                        ((DecimalFormat) currencyInstance).setMinimumFractionDigits(defaultDecimalDigits);
                        ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                    } catch (Throwable unused) {
                        Result.Companion companion3 = Result.Companion;
                    }
                    str2 = currencyInstance.format(pow);
                    str2.getClass();
                }
                gapComposer.end(false);
            }
            if (str2 != null && str6 == null) {
                str4 = str2;
            }
            if (str4 == null) {
                gapComposer.startReplaceGroup(497458529);
            } else {
                gapComposer.startReplaceGroup(497458530);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
                androidx.compose.material.TextKt.m509Text4IGK_g(str4, SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), 6.0f, 4.0f), ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textSubdued, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, gapComposer, 0, 0, 65528);
                gapComposer = gapComposer;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(accountSelectionState, partnerAccount, networkedAccount, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r9 == androidx.compose.runtime.Composer.Companion.Empty) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DataAccessBottomSheetContent(DataAccessNotice dataAccessNotice, Function1 function1, Function0 function0, Composer composer, int i) {
        Function1 function12;
        TextResource.Text rememberHtml;
        TextResource.Text text;
        String str;
        Object obj;
        dataAccessNotice.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1941374581);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(dataAccessNotice) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            function12 = function1;
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String str2 = dataAccessNotice.title;
            DataAccessNoticeBody dataAccessNoticeBody = dataAccessNotice.body;
            TextResource.Text rememberHtml2 = zabr.rememberHtml(str2, gapComposer);
            String str3 = dataAccessNotice.subtitle;
            if (str3 == null) {
                gapComposer.startReplaceGroup(539703198);
                gapComposer.end(false);
                rememberHtml = null;
            } else {
                gapComposer.startReplaceGroup(539703199);
                rememberHtml = zabr.rememberHtml(str3, gapComposer);
                gapComposer.end(false);
            }
            String str4 = dataAccessNotice.disclaimer;
            if (str4 == null) {
                gapComposer.startReplaceGroup(539771646);
                gapComposer.end(false);
                text = null;
            } else {
                gapComposer.startReplaceGroup(539771647);
                TextResource.Text rememberHtml3 = zabr.rememberHtml(str4, gapComposer);
                gapComposer.end(false);
                text = rememberHtml3;
            }
            boolean changed = gapComposer.changed(dataAccessNoticeBody.bullets);
            Object rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
                obj = rememberedValue;
            }
            List<Bullet> list = dataAccessNoticeBody.bullets;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Bullet bullet : list) {
                bullet.getClass();
                Image image = bullet.icon;
                ImageResource$Network imageResource$Network = (image == null || (str = image.f809default) == null) ? null : new ImageResource$Network(str);
                String str5 = bullet.title;
                TextResource.Text text2 = str5 != null ? new TextResource.Text(zabr.fromHtml(str5)) : null;
                String str6 = bullet.content;
                arrayList.add(new BulletUI(text2, str6 != null ? new TextResource.Text(zabr.fromHtml(str6)) : null, imageResource$Network));
            }
            gapComposer.updateRememberedValue(arrayList);
            obj = arrayList;
            ModalBottomSheetContent(function1, dataAccessNotice.cta, text, function0, null, Expect_jvmKt.rememberComposableLambda(-293161351, new SwipeToDismissKt$$ExternalSyntheticLambda2(18, dataAccessNotice, rememberHtml2, rememberHtml, (List) obj, function12), gapComposer), gapComposer, ((i3 >> 3) & 14) | 196608 | ((i3 << 3) & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(dataAccessNotice, function1, function0, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorContent(ComposableLambdaImpl composableLambdaImpl, String str, String str2, Pair pair, Pair pair2, Composer composer, int i, int i2) {
        Object obj;
        GapComposer gapComposer;
        Object obj2;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1729518300);
        int i3 = (gapComposer2.changed(str) ? 32 : 16) | i | (gapComposer2.changed(str2) ? 256 : 128) | (gapComposer2.changed(pair) ? 2048 : 1024);
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            obj = pair2;
            i3 |= gapComposer2.changed(obj) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                obj2 = obj;
            } else {
                Object obj3 = i4 != 0 ? null : obj;
                View view = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(view);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj4 = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == obj4) {
                    rememberedValue = new ProfileHeaderMenuSheet$Content$2$1(view, null, 1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(176489385, new Radiography$$ExternalSyntheticLambda1(15, obj3, pair), gapComposer2);
                boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z || rememberedValue2 == obj4) {
                    rememberedValue2 = new CardTransitionKt$$ExternalSyntheticLambda4(23, composableLambdaImpl, str, str2);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                gapComposer = gapComposer2;
                LayoutKt.LazyLayout(null, null, false, false, false, arrangement$SpacedAligned, false, null, rememberComposableLambda, (Function1) rememberedValue2, gapComposer, 100859904, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                obj2 = obj3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(composableLambdaImpl, str, str2, pair, obj2, i, i2, 21);
                return;
            }
            return;
        }
        obj = pair2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FullScreenGenericLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2130880376);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            m4014LoadingSpinneruFdPcIQ(SizeKt.m285size3ABfNKs(companion, 52.0f), RecyclerView.DECELERATION_RATE, null, gapComposer, 6, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 6);
        }
    }

    public static final void GenericBottomSheetContent(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        financialConnectionsGenericInfoScreen.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1870638783);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(financialConnectionsGenericInfoScreen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            FillrWidget.WidgetType.AnonymousClass1.GenericScreen(new GenericScreenState(financialConnectionsGenericInfoScreen, true), function0, function02, function1, gapComposer, ((i2 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION) | ((i2 << 6) & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(financialConnectionsGenericInfoScreen, i, function1, function0, function02, 5);
        }
    }

    public static final void GifWebView(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1283678679);
        int i2 = 16;
        int i3 = (gapComposer.changed(str) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                StringBuilder sb = new StringBuilder("<html><head><style>img{width:100%; height:auto;}</style></head><body style=\"margin: 0; padding: 0\">");
                sb.append("<img src=\"" + str + "\" style=\"width:100%;height:auto;\" />");
                sb.append("</body></html>");
                rememberedValue = sb.toString();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            String str2 = (String) rememberedValue;
            int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).backgroundSecondary);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Color.Transparent, ColorKt.RectangleShape);
            boolean changed = gapComposer.changed(m694toArgb8_81llA) | gapComposer.changed(booleanValue) | gapComposer.changed(str2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OTPElementUIKt$$ExternalSyntheticLambda2(str2, booleanValue, m694toArgb8_81llA, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            boolean changed2 = gapComposer.changed(str2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new StateBindingsKt$$ExternalSyntheticLambda0(str2, 14);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function1, m177backgroundbw27NRU, (Function1) rememberedValue3, gapComposer, 0, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, i2);
        }
    }

    public static final void IconWrapperBox(Modifier modifier, IconSize iconSize, Shape shape, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-352947287);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(iconSize.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(shape) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(modifier, iconSize.size), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).iconBackground, shape), shape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clip);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline2.m((i2 >> 9) & 14, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(modifier, iconSize, shape, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstitutionIcon(int i, int i2, Composer composer, Modifier modifier, String str, boolean z) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1092343159);
        int i4 = 2;
        int i5 = (gapComposer.changed(str) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= gapComposer.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z2 = z;
                i5 |= gapComposer.changed(z2) ? 256 : 128;
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    boolean z4 = i3 != 0 ? false : z2;
                    boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                    Modifier m591shadows4CzXII$default = ShadowKt.m591shadows4CzXII$default(SizeKt.m285size3ABfNKs(modifier4, 56.0f), 1.0f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f), true, 24);
                    if (str == null && z4) {
                        gapComposer.startReplaceGroup(972516926);
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(m591shadows4CzXII$default, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).backgroundSecondary, ColorKt.RectangleShape), gapComposer, 0);
                        gapComposer.end(false);
                    } else if (booleanValue || str == null) {
                        gapComposer.startReplaceGroup(972656829);
                        InstitutionPlaceholder(m591shadows4CzXII$default, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(972758664);
                        StripeImageKt.StripeImage(str, (DefaultStripeImageLoader) gapComposer.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), null, m591shadows4CzXII$default, ContentScale.Companion.Crop, null, null, null, Expect_jvmKt.rememberComposableLambda(-208683345, new ListItemKt$$ExternalSyntheticLambda2(m591shadows4CzXII$default, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(1510239003, new ListItemKt$$ExternalSyntheticLambda2(m591shadows4CzXII$default, 3), gapComposer), gapComposer, (i5 & 14) | 805331328, 6, 480);
                        gapComposer.end(false);
                    }
                    modifier3 = modifier4;
                    z3 = z4;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(str, modifier3, z3, i, i2, 9);
                    return;
                }
                return;
            }
            z2 = z;
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        z2 = z;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void InstitutionPlaceholder(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1265667876);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            modifier2 = modifier;
            ImageKt.Image(Countries.painterResource(R.drawable.stripe_ic_brandicon_institution, 0, gapComposer), "Bank icon placeholder", modifier2, null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624 | ((i2 << 6) & 896), 104);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier2, i, 28);
        }
    }

    public static final void InstitutionPlannedDowntimeErrorContent(InstitutionPlannedDowntimeError institutionPlannedDowntimeError, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Pair pair;
        institutionPlannedDowntimeError.getClass();
        long j = institutionPlannedDowntimeError.backUpAt;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(118813745);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(institutionPlannedDowntimeError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Locale(PlatformLocaleKt.platformLocaleDelegate.getCurrent().get().platformLocale.getLanguage());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Locale locale = (Locale) rememberedValue;
            boolean changed = gapComposer.changed(j);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale).format(Long.valueOf(j));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            String str = (String) rememberedValue2;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(443511827, new FieldBinding$$ExternalSyntheticLambda5(institutionPlannedDowntimeError, 6), gapComposer);
            String stringResource = Room.stringResource(R.string.stripe_error_planned_downtime_title, new Object[]{institutionPlannedDowntimeError.institution.name}, gapComposer);
            str.getClass();
            String stringResource2 = Room.stringResource(R.string.stripe_error_planned_downtime_desc, new Object[]{str}, gapComposer);
            Pair pair2 = new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_select_another_bank), function0);
            if (institutionPlannedDowntimeError.showManualEntry) {
                gapComposer.startReplaceGroup(528240023);
                pair = new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_manual_entry), function02);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(528394837);
                gapComposer.end(false);
                pair = null;
            }
            ErrorContent(rememberComposableLambda, stringResource, stringResource2, pair2, pair, gapComposer, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(institutionPlannedDowntimeError, function0, function02, i, 9);
        }
    }

    public static final void InstitutionUnknownErrorContent(Function0 function0, Composer composer, int i) {
        int i2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(517513307);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ErrorContent(f800lambda$2052014915, Room.stringResource(gapComposer, R.string.stripe_error_generic_title), Room.stringResource(gapComposer, R.string.stripe_error_unplanned_downtime_desc), new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_select_another_bank), function0), null, gapComposer, 6, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingChatInputKt$$ExternalSyntheticLambda8(function0, i, 3, b);
        }
    }

    public static final void InstitutionUnplannedDowntimeErrorContent(InstitutionUnplannedDowntimeError institutionUnplannedDowntimeError, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Pair pair;
        institutionUnplannedDowntimeError.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1547189329);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(institutionUnplannedDowntimeError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1017903923, new FieldBinding$$ExternalSyntheticLambda5(institutionUnplannedDowntimeError, 7), gapComposer);
            String stringResource = Room.stringResource(R.string.stripe_error_unplanned_downtime_title, new Object[]{institutionUnplannedDowntimeError.institution.name}, gapComposer);
            String stringResource2 = Room.stringResource(gapComposer, R.string.stripe_error_unplanned_downtime_desc);
            Pair pair2 = new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_select_another_bank), function0);
            if (institutionUnplannedDowntimeError.showManualEntry) {
                gapComposer.startReplaceGroup(-1270981577);
                pair = new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_manual_entry), function02);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1270826763);
                gapComposer.end(false);
                pair = null;
            }
            ErrorContent(rememberComposableLambda, stringResource, stringResource2, pair2, pair, gapComposer, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(institutionUnplannedDowntimeError, function0, function02, i, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.Companion.Empty) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegalDetailsBottomSheetContent(LegalDetailsNotice legalDetailsNotice, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Function1 function12;
        TextResource.Text rememberHtml;
        Object obj;
        legalDetailsNotice.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(12288811);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(legalDetailsNotice) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String str = legalDetailsNotice.title;
            LegalDetailsBody legalDetailsBody = legalDetailsNotice.body;
            TextResource.Text rememberHtml2 = zabr.rememberHtml(str, gapComposer);
            String str2 = legalDetailsNotice.subtitle;
            TextResource.Text text = null;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1023996094);
                gapComposer.end(false);
                rememberHtml = null;
            } else {
                gapComposer.startReplaceGroup(1023996095);
                rememberHtml = zabr.rememberHtml(str2, gapComposer);
                gapComposer.end(false);
            }
            String str3 = legalDetailsNotice.disclaimer;
            if (str3 == null) {
                gapComposer.startReplaceGroup(1024065534);
            } else {
                gapComposer.startReplaceGroup(1024065535);
                text = zabr.rememberHtml(str3, gapComposer);
            }
            gapComposer.end(false);
            TextResource.Text text2 = text;
            boolean changed = gapComposer.changed(legalDetailsBody.links);
            Object rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
                obj = rememberedValue;
            }
            List list = legalDetailsBody.links;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TextResource.Text(zabr.fromHtml(((ServerLink) it.next()).title)));
            }
            gapComposer.updateRememberedValue(arrayList);
            obj = arrayList;
            ModalBottomSheetContent(function1, legalDetailsNotice.cta, text2, function0, null, Expect_jvmKt.rememberComposableLambda(1658132761, new SwipeToDismissKt$$ExternalSyntheticLambda2(17, legalDetailsNotice, rememberHtml2, rememberHtml, (List) obj, function12), gapComposer), gapComposer, ((i3 >> 3) & 14) | 196608 | ((i3 << 3) & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(legalDetailsNotice, function1, function0, i, 11);
        }
    }

    public static final void Links(List list, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        boolean z;
        Function1 function13 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(385623561);
        int i2 = (gapComposer2.changedInstance(list) ? 4 : 2) | i | (gapComposer2.changedInstance(function13) ? 32 : 16);
        boolean z2 = false;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer2.consume(ThemeKt.LocalTypography)).labelLargeEmphasized, ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).textAction, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
            gapComposer2.startReplaceGroup(-88177826);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                TextResource.Text text = (TextResource.Text) obj;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
                int i5 = i3;
                GapComposer gapComposer3 = gapComposer2;
                CardKt.m468DivideroMI9zvI(null, ((FinancialConnectionsColors) gapComposer2.consume(staticProvidableCompositionLocal)).borderNeutral, 0.5f, gapComposer3, MLKEMEngine.KyberPolyBytes, 9);
                Modifier.Companion companion2 = companion;
                TextStyle textStyle = m994copyp1EtxEg$default;
                TextKt.m4020AnnotatedTextrm0N8CA(text, function13, textStyle, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1), MapsKt__MapsJVMKt.mapOf(new Pair(StringAnnotation.CLICKABLE, m994copyp1EtxEg$default.spanStyle)), 0, 0, gapComposer3, (i2 & 112) | 3072, 96);
                GapComposer gapComposer4 = gapComposer3;
                Function1 function14 = function13;
                if (CollectionsKt__CollectionsKt.getLastIndex(list) == i5) {
                    gapComposer4.startReplaceGroup(-359228352);
                    CardKt.m468DivideroMI9zvI(null, ((FinancialConnectionsColors) gapComposer4.consume(staticProvidableCompositionLocal)).borderNeutral, 0.5f, gapComposer4, MLKEMEngine.KyberPolyBytes, 9);
                    gapComposer4 = gapComposer4;
                    z = false;
                } else {
                    z = false;
                    gapComposer4.startReplaceGroup(-365705895);
                }
                gapComposer4.end(z);
                z2 = z;
                gapComposer2 = gapComposer4;
                function13 = function14;
                m994copyp1EtxEg$default = textStyle;
                i3 = i4;
                companion = companion2;
            }
            function12 = function13;
            gapComposer = gapComposer2;
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            function12 = function13;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function12, i, 16);
        }
    }

    public static final void ListItem(BulletUI bulletUI, Function1 function1, Composer composer, int i) {
        int i2;
        TextStyle textStyle;
        Function1 function12 = function1;
        bulletUI.getClass();
        TextResource textResource = bulletUI.title;
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-635115962);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(bulletUI) : gapComposer.changedInstance(bulletUI) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextResource textResource2 = bulletUI.content;
            TextResource text = textResource == null ? textResource2 == null ? new TextResource.Text("") : textResource2 : textResource;
            boolean changed = gapComposer.changed(text);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = (textResource2 == null || textResource == null) ? null : textResource2;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextResource textResource3 = (TextResource) rememberedValue;
            if (textResource3 != null) {
                gapComposer.startReplaceGroup(-461073542);
                textStyle = ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMediumEmphasized;
            } else {
                gapComposer.startReplaceGroup(-461072368);
                textStyle = ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium;
            }
            gapComposer.end(false);
            TextStyle textStyle2 = textStyle;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ListItemIcon(bulletUI.imageResource, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            int i3 = i2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            int i4 = i3 & 112;
            TextKt.m4020AnnotatedTextrm0N8CA(text, function1, TextStyle.m994copyp1EtxEg$default(textStyle2, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), null, null, 0, 0, gapComposer, i4, 120);
            if (textResource3 == null) {
                gapComposer.startReplaceGroup(-1083404114);
                gapComposer.end(false);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-1083404113);
                if (textResource2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return;
                } else {
                    function12 = function1;
                    TextKt.m4020AnnotatedTextrm0N8CA(textResource2, function12, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodySmall, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textSubdued, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), null, null, 0, 0, gapComposer, i4, 120);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(bulletUI, function12, i, 17);
        }
    }

    public static final void ListItemIcon(ImageResource$Network imageResource$Network, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-57878957);
        int i2 = (gapComposer.changed(imageResource$Network) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 10;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            long j = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).icon;
            Modifier m273offsetVpY3zN4$default = OffsetKt.m273offsetVpY3zN4$default(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 20.0f), RecyclerView.DECELERATION_RATE, 1.0f, 1);
            if (imageResource$Network == null) {
                gapComposer.startReplaceGroup(212906525);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m273offsetVpY3zN4$default, 6.0f);
                boolean changed = gapComposer.changed(j);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new c7$$ExternalSyntheticLambda6(j, 24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CanvasKt.Canvas(6, gapComposer, m298padding3ABfNKs, (Function1) rememberedValue);
                gapComposer.end(false);
            } else {
                if (!(imageResource$Network instanceof ImageResource$Network)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 212905274, false);
                }
                gapComposer.startReplaceGroup(-1989307175);
                StripeImageKt.StripeImage(imageResource$Network.url, (DefaultStripeImageLoader) gapComposer.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), null, m273offsetVpY3zN4$default, null, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), Countries.painterResource(R.drawable.stripe_ic_check_circle, 0, gapComposer), null, Expect_jvmKt.rememberComposableLambda(-1932758438, new PoolListSectionKt$$ExternalSyntheticLambda8(m273offsetVpY3zN4$default, j, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(1243576006, new ListItemKt$$ExternalSyntheticLambda2(m273offsetVpY3zN4$default, i3), gapComposer), gapComposer, 805309824 | (Painter.$stable << 18), 6, 400);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(imageResource$Network, i, 10);
        }
    }

    public static final void LoadedContent(boolean z, boolean z2, Async async, SharedPartnerAuthState.Payload payload, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        int i2;
        Function0 function03;
        Function0 function04;
        Function1 function12;
        TextUpdate textUpdate;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = payload.authSession;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1160710015);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(async) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(payload) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function03 = function0;
            i2 |= gapComposer.changedInstance(function03) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function03 = function0;
        }
        if ((196608 & i) == 0) {
            function04 = function02;
            i2 |= gapComposer.changedInstance(function04) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function04 = function02;
        }
        if ((1572864 & i) == 0) {
            function12 = function1;
            i2 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            function12 = function1;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(async instanceof Async.Uninitialized) && !(async instanceof Async.Loading) && !(async instanceof Async.Fail) && !(async instanceof Async.Success)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1249162442, false);
            }
            gapComposer.startReplaceGroup(-69219707);
            boolean isOAuth = financialConnectionsAuthorizationSession.isOAuth();
            if (isOAuth) {
                gapComposer.startReplaceGroup(-69166976);
                boolean z3 = !z2;
                Display display = financialConnectionsAuthorizationSession.display;
                OauthPrepane oauthPrepane = (display == null || (textUpdate = display.text) == null) ? null : textUpdate.oauthPrepane;
                if (oauthPrepane == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return;
                } else {
                    PrePaneContent(z, z3, oauthPrepane, async, function03, function04, function12, gapComposer, (i2 & 3670016) | (i2 & 14) | ((i2 << 3) & 7168) | (57344 & i2) | (458752 & i2));
                    gapComposer.end(false);
                }
            } else {
                if (isOAuth) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1249158883, false);
                }
                gapComposer.startReplaceGroup(-1249138464);
                SharedPartnerLoading(z, gapComposer, i2 & 14);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda1(z, z2, async, payload, function0, function02, function1, i, 2);
        }
    }

    public static final void LoadingPill(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2033185978);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            long j = com.stripe.android.financialconnections.ui.theme.ColorKt.Neutral900;
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(100);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion, j, RoundedCornerShape), 16.0f, 12.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.stripe_loading_pill_label);
            long j2 = Color.White;
            modifier2 = companion;
            androidx.compose.material.TextKt.m509Text4IGK_g(stringResource, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodySmall, gapComposer, MLKEMEngine.KyberPolyBytes, 0, 65530);
            gapComposer = gapComposer;
            m4014LoadingSpinneruFdPcIQ(SizeKt.m285size3ABfNKs(modifier2, 16.0f), 2.0f, new SweepGradient(9205357640488583168L, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.Transparent), new Color(j2)})), gapComposer, 438, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier2, i, 29);
        }
    }

    public static final void LoadingPillContainer(int i, int i2, Composer composer, Modifier modifier, boolean z) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(41514711);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Configuration configuration = (Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            boolean changed = gapComposer.changed(configuration) | gapComposer.changed(density);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (changed || rememberedValue == neverEqualPolicy) {
                Integer valueOf = Integer.valueOf(density.mo230roundToPx0680j_4(configuration.screenHeightDp));
                gapComposer.updateRememberedValue(valueOf);
                obj = valueOf;
            }
            int intValue = ((Number) obj).intValue();
            Object[] objArr = new Object[0];
            int i5 = i3 & 14;
            boolean changed2 = gapComposer.changed(booleanValue) | (i5 == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj2 = rememberedValue2;
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                z4$$ExternalSyntheticLambda3 z4__externalsyntheticlambda3 = new z4$$ExternalSyntheticLambda3(r5, booleanValue, z);
                gapComposer.updateRememberedValue(z4__externalsyntheticlambda3);
                obj2 = z4__externalsyntheticlambda3;
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj2, gapComposer, 0);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i6 = (gapComposer.changed(mutableState) ? 1 : 0) | (i5 != 4 ? 0 : 1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            Continuation continuation = null;
            Object obj3 = rememberedValue3;
            if (i6 != 0 || rememberedValue3 == neverEqualPolicy) {
                RealOffersDetailsStateManager$states$1$1 realOffersDetailsStateManager$states$1$1 = new RealOffersDetailsStateManager$states$1$1(z, mutableState, continuation, 3);
                gapComposer.updateRememberedValue(realOffersDetailsStateManager$states$1$1);
                obj3 = realOffersDetailsStateManager$states$1$1;
            }
            Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) obj3);
            boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
            TweenSpec tween$default = AnimatableKt.tween$default(600, 0, EasingKt.FastOutSlowInEasing, 2);
            boolean changed3 = gapComposer.changed(intValue);
            Object rememberedValue4 = gapComposer.rememberedValue();
            int i7 = 22;
            Object obj4 = rememberedValue4;
            if (changed3 || rememberedValue4 == neverEqualPolicy) {
                DatePickerKt$$ExternalSyntheticLambda10 datePickerKt$$ExternalSyntheticLambda10 = new DatePickerKt$$ExternalSyntheticLambda10(intValue, i7);
                gapComposer.updateRememberedValue(datePickerKt$$ExternalSyntheticLambda10);
                obj4 = datePickerKt$$ExternalSyntheticLambda10;
            }
            EnterTransitionImpl slideInVertically = EnterExitTransitionKt.slideInVertically(tween$default, (Function1) obj4);
            TweenSpec tween$default2 = AnimatableKt.tween$default(600, 0, null, 6);
            boolean changed4 = gapComposer.changed(intValue);
            Object rememberedValue5 = gapComposer.rememberedValue();
            Object obj5 = rememberedValue5;
            if (changed4 || rememberedValue5 == neverEqualPolicy) {
                DatePickerKt$$ExternalSyntheticLambda10 datePickerKt$$ExternalSyntheticLambda102 = new DatePickerKt$$ExternalSyntheticLambda10(intValue, i7);
                gapComposer.updateRememberedValue(datePickerKt$$ExternalSyntheticLambda102);
                obj5 = datePickerKt$$ExternalSyntheticLambda102;
            }
            AnimatedContentKt.AnimatedVisibility(booleanValue2, SizeKt.fillMaxWidth(modifier, 1.0f), slideInVertically, EnterExitTransitionKt.slideOutVertically(tween$default2, (Function1) obj5), (String) null, (Function3) f801lambda$822699089, (Composer) gapComposer, 196608, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockedInStatusDotKt$$ExternalSyntheticLambda0(z, modifier, i, i2);
        }
    }

    public static final void LoadingShimmerEffect(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(42208438);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp);
            float f = mo236toPx0680j_4 * 0.2f;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary), new Color(Color.m675copywmQWz5c$default(0.4f, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary, 14)), new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary)});
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("shimmer_transition", gapComposer, 0), RecyclerView.DECELERATION_RATE, mo236toPx0680j_4, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingKt.LinearEasing, 2), null, 6), "shimmer_translate_animation", gapComposer, 28728, 0);
            float floatValue = ((Number) animateFloat.value$delegate.getValue()).floatValue() - f;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = animateFloat.value$delegate;
            composableLambdaImpl.invoke(new LinearGradient(listOf, null, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState.getValue()).floatValue() - f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState.getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState.getValue()).floatValue()) & BodyPartID.bodyIdMax)), (Object) gapComposer, (Object) 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeThemeKt$$ExternalSyntheticLambda2(i, 9, composableLambdaImpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* renamed from: LoadingSpinner-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4014LoadingSpinneruFdPcIQ(Modifier modifier, float f, Brush brush, Composer composer, int i, int i2) {
        int i3;
        float f2;
        Brush brush2;
        float f3;
        Brush brush3;
        int i4;
        float f4;
        boolean changed;
        Object rememberedValue;
        int i5;
        int i6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(148599840);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (gapComposer.changed(f2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                f2 = f;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            f2 = f;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                brush2 = brush;
                if (gapComposer.changed(brush2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                brush2 = brush;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            brush2 = brush;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f2 = 4.0f;
                }
                if ((i2 & 4) != 0) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
                    SweepGradient sweepGradient = new SweepGradient(9205357640488583168L, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).background), new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).border)}));
                    float f5 = f2;
                    i4 = i3 & (-897);
                    f4 = f5;
                    brush2 = sweepGradient;
                    gapComposer.endDefaults();
                    Brush brush4 = brush2;
                    int i7 = i4;
                    InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("loading_transition", gapComposer, 0), RecyclerView.DECELERATION_RATE, 360.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), "loading_animation", gapComposer, 29112, 0);
                    changed = ((((i7 & 112) ^ 48) <= 32 && gapComposer.changed(f4)) || (i7 & 48) == 32) | gapComposer.changed(animateFloat) | ((((i7 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(brush4)) || (i7 & MLKEMEngine.KyberPolyBytes) == 256);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ThumbNode$$ExternalSyntheticLambda0(f4, animateFloat, brush4, 13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CanvasKt.Canvas(i7 & 14, gapComposer, modifier, (Function1) rememberedValue);
                    brush3 = brush4;
                    f3 = f4;
                }
            } else {
                gapComposer.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            float f6 = f2;
            i4 = i3;
            f4 = f6;
            gapComposer.endDefaults();
            Brush brush42 = brush2;
            int i72 = i4;
            InfiniteTransition.TransitionAnimationState animateFloat2 = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("loading_transition", gapComposer, 0), RecyclerView.DECELERATION_RATE, 360.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), "loading_animation", gapComposer, 29112, 0);
            if (((i72 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                changed = ((((i72 & 112) ^ 48) <= 32 && gapComposer.changed(f4)) || (i72 & 48) == 32) | gapComposer.changed(animateFloat2) | ((((i72 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(brush42)) || (i72 & MLKEMEngine.KyberPolyBytes) == 256);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new ThumbNode$$ExternalSyntheticLambda0(f4, animateFloat2, brush42, 13);
                gapComposer.updateRememberedValue(rememberedValue);
                CanvasKt.Canvas(i72 & 14, gapComposer, modifier, (Function1) rememberedValue);
                brush3 = brush42;
                f3 = f4;
            }
            changed = ((((i72 & 112) ^ 48) <= 32 && gapComposer.changed(f4)) || (i72 & 48) == 32) | gapComposer.changed(animateFloat2) | ((((i72 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(brush42)) || (i72 & MLKEMEngine.KyberPolyBytes) == 256);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new ThumbNode$$ExternalSyntheticLambda0(f4, animateFloat2, brush42, 13);
            gapComposer.updateRememberedValue(rememberedValue);
            CanvasKt.Canvas(i72 & 14, gapComposer, modifier, (Function1) rememberedValue);
            brush3 = brush42;
            f3 = f4;
        } else {
            gapComposer.skipToGroupEnd();
            f3 = f2;
            brush3 = brush2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersLoadingKt$$ExternalSyntheticLambda0(modifier, f3, brush3, i, i2, 1);
        }
    }

    public static final void LocalIcon(IconSize iconSize, Painter painter, String str, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-202466975);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(iconSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            IconKt.m492Iconww6aTOc(painter, str, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, iconSize.paddedSize), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).iconTint, gapComposer, (i3 & 112) | Painter.$stable | (i3 & 14), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(iconSize, painter, str, i, 13);
        }
    }

    public static final void ModalBottomSheetContent(Function1 function1, String str, TextResource textResource, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(518833689);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(textResource) : gapComposer2.changedInstance(textResource) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            LayoutKt.Layout(companion, null, true, null, false, null, Expect_jvmKt.rememberComposableLambda(-557003752, new ModalBottomSheetContentKt$$ExternalSyntheticLambda2(function1, textResource, function0, str), gapComposer2), Expect_jvmKt.rememberComposableLambda(-1704918551, new TaxesAppletTile$$ExternalSyntheticLambda10(composableLambdaImpl, i3), gapComposer2), gapComposer, ((i4 >> 12) & 14) | 905970048, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(function1, str, textResource, function0, modifier2, composableLambdaImpl, i);
        }
    }

    public static final void ModalBottomSheetFooter(Function1 function1, TextResource textResource, Function0 function0, String str, Composer composer, int i) {
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1581226918);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changed(textResource) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(str) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (textResource == null) {
                gapComposer.startReplaceGroup(295641413);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(295641414);
                companion = companion2;
                TextKt.m4020AnnotatedTextrm0N8CA(textResource, function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), null, 0, 0, gapComposer, (i2 << 3) & 112, 112);
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(19, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextKt.FinancialConnectionsButton((Function0) rememberedValue, SizeKt.fillMaxWidth(companion, 1.0f), null, null, false, false, Expect_jvmKt.rememberComposableLambda(997284405, new ShopErrorKt$$ExternalSyntheticLambda0(str, 15), gapComposer), gapComposer, 1572912, 60);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ModalBottomSheetContentKt$$ExternalSyntheticLambda2(function1, textResource, function0, str, i);
        }
    }

    public static final void NoAccountsAvailableErrorContent(AccountLoadError accountLoadError, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        int i2;
        Integer valueOf = Integer.valueOf(R.string.stripe_error_cta_select_another_bank);
        accountLoadError.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-162660842);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(accountLoadError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function03) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = accountLoadError.showManualEntry;
            boolean z2 = accountLoadError.canRetry;
            boolean changed = gapComposer.changed(z) | gapComposer.changed(z2);
            Object rememberedValue = gapComposer.rememberedValue();
            Pair pair = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = z2 ? new Pair(new Pair(Integer.valueOf(R.string.stripe_error_cta_retry), function03), new Pair(valueOf, function0)) : z ? new Pair(new Pair(Integer.valueOf(R.string.stripe_error_cta_manual_entry), function02), new Pair(valueOf, function0)) : new Pair(new Pair(valueOf, function0), null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Pair pair2 = (Pair) rememberedValue;
            Pair pair3 = (Pair) pair2.first;
            Pair pair4 = (Pair) pair2.second;
            boolean changed2 = gapComposer.changed(z) | gapComposer.changed(z2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Integer.valueOf(z2 ? R.string.stripe_accounts_error_desc_retry : z ? R.string.stripe_accounts_error_desc_manualentry : R.string.stripe_accounts_error_desc_no_retry);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int intValue = ((Number) rememberedValue2).intValue();
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2003844872, new FieldBinding$$ExternalSyntheticLambda5(accountLoadError, 9), gapComposer);
            String stringResource = Room.stringResource(R.string.stripe_account_picker_error_no_account_available_title, new Object[]{accountLoadError.institution.name}, gapComposer);
            String stringResource2 = Room.stringResource(gapComposer, intValue);
            Pair pair5 = new Pair(Room.stringResource(gapComposer, ((Number) pair3.first).intValue()), pair3.second);
            if (pair4 == null) {
                gapComposer.startReplaceGroup(-1104155874);
            } else {
                gapComposer.startReplaceGroup(-1104155873);
                pair = new Pair(Room.stringResource(gapComposer, ((Number) pair4.first).intValue()), pair4.second);
            }
            gapComposer.end(false);
            ErrorContent(rememberComposableLambda, stringResource, stringResource2, pair5, pair, gapComposer, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(accountLoadError, function0, function02, function03, i, 4);
        }
    }

    public static final void NoSupportedPaymentMethodTypeAccountsErrorContent(AccountNoneEligibleForPaymentMethodError accountNoneEligibleForPaymentMethodError, Function0 function0, Composer composer, int i) {
        int i2;
        accountNoneEligibleForPaymentMethodError.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1621855517);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(accountNoneEligibleForPaymentMethodError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-919686847, new FieldBinding$$ExternalSyntheticLambda5(accountNoneEligibleForPaymentMethodError, 8), gapComposer);
            String stringResource = Room.stringResource(gapComposer, R.string.stripe_account_picker_error_no_payment_method_title);
            int i4 = accountNoneEligibleForPaymentMethodError.accountsCount;
            ErrorContent(rememberComposableLambda, stringResource, TextKt.pluralStringResource(R.string.stripe_account_picker_error_no_payment_method_desc_singular, R.string.stripe_account_picker_error_no_payment_method_desc_plural, i4, new Object[]{String.valueOf(i4), accountNoneEligibleForPaymentMethodError.institution.name, accountNoneEligibleForPaymentMethodError.merchantName}, gapComposer), new Pair(Room.stringResource(gapComposer, R.string.stripe_error_cta_select_another_bank), function0), null, gapComposer, 24582, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(accountNoneEligibleForPaymentMethodError, function0, i, i3);
        }
    }

    public static final void PrePaneContent(boolean z, boolean z2, OauthPrepane oauthPrepane, Async async, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        int i2;
        Async async2;
        Function0 function03;
        Function0 function04;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2095317573);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(oauthPrepane) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            async2 = async;
            i2 |= gapComposer.changed(async2) ? 2048 : 1024;
        } else {
            async2 = async;
        }
        if ((i & 24576) == 0) {
            function03 = function0;
            i2 |= gapComposer.changedInstance(function03) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function03 = function0;
        }
        if ((196608 & i) == 0) {
            function04 = function02;
            i2 |= gapComposer.changedInstance(function04) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function04 = function02;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            boolean z3 = (i3 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, z ? 0.0f : 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            PaddingValues paddingValues = (PaddingValues) rememberedValue;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1484300552, new SharedPartnerAuthKt$$ExternalSyntheticLambda3(function03, function04, async2, oauthPrepane, z, z2), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(oauthPrepane) | ((3670016 & i3) == 1048576);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda0(14, oauthPrepane, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LayoutKt.LazyLayout(null, paddingValues, z, false, false, arrangement$SpacedAligned, false, null, rememberComposableLambda, (Function1) rememberedValue2, gapComposer, ((i3 << 6) & 896) | 100859904, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda1(z, z2, oauthPrepane, async, function0, function02, function1, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrepaneFooter(Function0 function0, Function0 function02, Async async, OauthPrepane oauthPrepane, boolean z, boolean z2, Composer composer, int i) {
        boolean z3;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        boolean z4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(599226916);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | (gapComposer.changed(async) ? 256 : 128) | (gapComposer.changedInstance(oauthPrepane) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z5 = async instanceof Async.Loading;
            if (z5) {
                SharedPartnerAuthState.AuthenticationStatus authenticationStatus = (SharedPartnerAuthState.AuthenticationStatus) ((Async) ((Async.Loading) async)).value;
                if ((authenticationStatus != null ? authenticationStatus.action : null) == SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING) {
                    z3 = true;
                    boolean z6 = !z5;
                    rememberedValue = gapComposer.rememberedValue();
                    neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(17);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "prepane_cta"), 1.0f), FinancialConnectionsButton$Type$Primary.INSTANCE, null, z6, z3, Expect_jvmKt.rememberComposableLambda(15284403, new SharedPartnerAuthKt$$ExternalSyntheticLambda6(oauthPrepane, i3), gapComposer), gapComposer, (i2 & 14) | 1573248, 8);
                    if (z2) {
                        z4 = false;
                        gapComposer.startReplaceGroup(-1457571000);
                    } else {
                        gapComposer.startReplaceGroup(-1443023444);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new MarkdownParser$$ExternalSyntheticLambda0(18);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        TextKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), "cancel_cta"), 1.0f), FinancialConnectionsButton$Type$Secondary.INSTANCE, null, z6, false, Expect_jvmKt.rememberComposableLambda(-1729200370, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 14), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1573248, 40);
                        z4 = false;
                    }
                    gapComposer.end(z4);
                    gapComposer.end(true);
                }
            }
            z3 = false;
            boolean z62 = !z5;
            rememberedValue = gapComposer.rememberedValue();
            neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
            }
            TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), "prepane_cta"), 1.0f), FinancialConnectionsButton$Type$Primary.INSTANCE, null, z62, z3, Expect_jvmKt.rememberComposableLambda(15284403, new SharedPartnerAuthKt$$ExternalSyntheticLambda6(oauthPrepane, i3), gapComposer), gapComposer, (i2 & 14) | 1573248, 8);
            if (z2) {
            }
            gapComposer.end(z4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SharedPartnerAuthKt$$ExternalSyntheticLambda3(function0, function02, async, oauthPrepane, z, z2, i);
        }
    }

    public static final void PrepaneHeader(OauthPrepane oauthPrepane, Modifier modifier, Composer composer, int i) {
        String str = oauthPrepane.title;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1907905063);
        int i2 = (gapComposer.changedInstance(oauthPrepane) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str2 = oauthPrepane.subtitle;
            boolean changed = gapComposer.changed(str);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new TextResource.Text(zabr.fromHtml(str));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextResource.Text text = (TextResource.Text) rememberedValue;
            boolean changed2 = gapComposer.changed(str2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = new TextResource.Text(zabr.fromHtml(str2));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            TextResource.Text text2 = (TextResource.Text) rememberedValue2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Image image = oauthPrepane.institutionIcon;
            String str3 = image != null ? image.f809default : null;
            if (str3 == null) {
                gapComposer.startReplaceGroup(1581157199);
            } else {
                gapComposer.startReplaceGroup(1581157200);
                InstitutionIcon(0, 6, gapComposer, null, str3, false);
            }
            gapComposer.end(false);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new MarkdownParser$$ExternalSyntheticLambda0(15);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function1 = (Function1) rememberedValue3;
            ProvidableCompositionLocal providableCompositionLocal = ThemeKt.LocalTypography;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(providableCompositionLocal)).headingLarge;
            ProvidableCompositionLocal providableCompositionLocal2 = ThemeKt.LocalColors;
            TextKt.m4020AnnotatedTextrm0N8CA(text, function1, TextStyle.m994copyp1EtxEg$default(textStyle, ((FinancialConnectionsColors) gapComposer.consume(providableCompositionLocal2)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), null, null, 0, 0, gapComposer, 48, 120);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new MarkdownParser$$ExternalSyntheticLambda0(16);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            TextKt.m4020AnnotatedTextrm0N8CA(text2, (Function1) rememberedValue4, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(providableCompositionLocal)).bodyMedium, ((FinancialConnectionsColors) gapComposer.consume(providableCompositionLocal2)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), null, null, 0, 0, gapComposer, 48, 120);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(oauthPrepane, modifier, i, 18);
        }
    }

    public static final void PrepaneImage(Entry.Image image, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-103760569);
        int i2 = (gapComposer.changed(image) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 200.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            Modifier background$default = ImageKt.background$default(companion, Lock.m131horizontalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary), new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).borderNeutral)}), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, 6);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BoxKt.Box(SizeKt.fillMaxHeight(rowScopeInstance.weight(1.0f, background$default, true), 1.0f), gapComposer, 0);
            long j = ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            BoxKt.Box(SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 8.0f), 1.0f), gapComposer, 0);
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(companion, 240.0f), 1.0f);
            String str = image.content.f809default;
            str.getClass();
            GifWebView(6, gapComposer, fillMaxHeight, str);
            BoxKt.Box(SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary, rectangleShapeKt$RectangleShape$1), 8.0f), 1.0f), gapComposer, 0);
            BoxKt.Box(SizeKt.fillMaxHeight(rowScopeInstance.weight(1.0f, ImageKt.background$default(companion, Lock.m131horizontalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).borderNeutral), new Color(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).backgroundSecondary)}), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, 6), true), 1.0f), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(image, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShapedIcon(String str, Modifier modifier, IconSize iconSize, Shape shape, String str2, boolean z, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Shape shape2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        String str3;
        boolean z3;
        GapComposer gapComposer;
        Modifier modifier2;
        IconSize iconSize2;
        Shape shape3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1654712672);
        int i8 = i | (gapComposer2.changed(str) ? 4 : 2);
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i8 | 48;
        } else {
            i3 = i8 | (gapComposer2.changed(modifier) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
        } else {
            i4 = i3 | (gapComposer2.changed(iconSize == null ? -1 : iconSize.ordinal()) ? 256 : 128);
        }
        if ((i2 & 8) == 0) {
            shape2 = shape;
            if (gapComposer2.changed(shape2)) {
                i5 = 2048;
                int i11 = i4 | i5;
                int i12 = 196608 | i11;
                i6 = i2 & 64;
                if (i6 == 0) {
                    i7 = i11 | 1769472;
                    z2 = z;
                } else {
                    z2 = z;
                    i7 = i12 | (gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                }
                if (gapComposer2.shouldExecute(i7 & 1, (599187 & i7) == 599186)) {
                    str3 = str2;
                    gapComposer2.skipToGroupEnd();
                    z3 = z2;
                    gapComposer = gapComposer2;
                    modifier2 = modifier;
                    iconSize2 = iconSize;
                    shape3 = shape2;
                } else {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        modifier2 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                        iconSize2 = i10 != 0 ? IconSize.Medium : iconSize;
                        if ((i2 & 8) != 0) {
                            shape3 = RoundedCornerShapeKt.CircleShape;
                            i7 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i7 &= -7169;
                        }
                        modifier2 = modifier;
                        iconSize2 = iconSize;
                        shape3 = shape2;
                    }
                    gapComposer2.endDefaults();
                    str3 = str2;
                    int i13 = i7 >> 3;
                    IconWrapperBox(modifier2, iconSize2, shape3, Expect_jvmKt.rememberComposableLambda(-1200239329, new HeroCardViewKt$$ExternalSyntheticLambda32(z2, iconSize2, str, str3), gapComposer2), gapComposer2, (i13 & 896) | (i13 & 14) | 3072 | (i13 & 112));
                    z3 = z2;
                    gapComposer = gapComposer2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(str, modifier2, iconSize2, shape3, str3, z3, i, i2);
                    return;
                }
                return;
            }
        } else {
            shape2 = shape;
        }
        i5 = 1024;
        int i112 = i4 | i5;
        int i122 = 196608 | i112;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (gapComposer2.shouldExecute(i7 & 1, (599187 & i7) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SharedPartnerAuth(SharedPartnerAuthState sharedPartnerAuthState, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, boolean z, Composer composer, int i) {
        int i2;
        Function0 function04;
        Function0 function05;
        Function1 function13;
        Function0 function06;
        int i3;
        SharedPartnerAuthState.ViewEffect viewEffect;
        sharedPartnerAuthState.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        function12.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1861935187);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sharedPartnerAuthState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function04 = function0;
            i2 |= gapComposer.changedInstance(function04) ? 32 : 16;
        } else {
            function04 = function0;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function05 = function02;
            i2 |= gapComposer.changedInstance(function05) ? 256 : 128;
        } else {
            function05 = function02;
        }
        if ((i & 3072) == 0) {
            function13 = function1;
            i2 |= gapComposer.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            function06 = function03;
            i2 |= gapComposer.changedInstance(function06) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function06 = function03;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 sharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 = SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1.INSTANCE;
            ReadonlyStateFlow readonlyStateFlow = parentViewModel.stateFlow;
            boolean changed = gapComposer.changed(sharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = FlowKt.distinctUntilChanged(new SquareAccountStore$userFlow$$inlined$map$1(readonlyStateFlow));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Flow flow = (Flow) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = readonlyStateFlow.$$delegate_0.getValue();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState collectAsState = Updater.collectAsState(flow, ((FinancialConnectionsSheetNativeState) rememberedValue2).webAuthFlow, null, gapComposer, 0, 2);
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            Object value = collectAsState.getValue();
            boolean changed2 = ((i2 & 57344) == 16384) | gapComposer.changed(collectAsState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                i3 = 57344;
                rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function12, collectAsState, null, 10);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                i3 = 57344;
            }
            Updater.LaunchedEffect(gapComposer, value, (Function2) rememberedValue3);
            SharedPartnerAuthState.ViewEffect viewEffect2 = sharedPartnerAuthState.viewEffect;
            if (viewEffect2 == null) {
                gapComposer.startReplaceGroup(592062567);
            } else {
                gapComposer.startReplaceGroup(592062568);
                boolean changedInstance = gapComposer.changedInstance(viewEffect2) | gapComposer.changedInstance(uriHandler) | gapComposer.changedInstance(parentViewModel) | ((458752 & i2) == 131072);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(viewEffect2, uriHandler, parentViewModel, function06, (Continuation) null, 13);
                    viewEffect = viewEffect2;
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    viewEffect = viewEffect2;
                }
                Updater.LaunchedEffect(gapComposer, viewEffect, (Function2) rememberedValue4);
            }
            gapComposer.end(false);
            int i4 = (i2 & 14) | ((i2 >> 15) & 112) | ((i2 >> 3) & 896);
            int i5 = i2 << 6;
            SharedPartnerAuthContent((i5 & i3) | i4 | (i5 & 7168), gapComposer, sharedPartnerAuthState, function04, function05, function13, z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(sharedPartnerAuthState, function0, function02, function1, function12, function03, z, i, 8);
        }
    }

    public static final void SharedPartnerAuthBody(int i, Composer composer, SharedPartnerAuthState sharedPartnerAuthState, Function0 function0, Function0 function02, Function1 function1, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1730645656);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sharedPartnerAuthState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Unit unit = null;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            SharedPartnerAuthState.Payload payload = (SharedPartnerAuthState.Payload) sharedPartnerAuthState.payload.invoke();
            if (payload == null) {
                gapComposer.startReplaceGroup(763400209);
                gapComposer.end(false);
                z2 = z;
                z3 = false;
            } else {
                gapComposer.startReplaceGroup(763400210);
                z2 = z;
                z3 = false;
                LoadedContent(z2, sharedPartnerAuthState.pane == FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR, sharedPartnerAuthState.authenticationStatus, payload, function02, function0, function1, gapComposer, ((i2 >> 3) & 14) | ((i2 << 3) & 57344) | ((i2 << 9) & 458752) | (3670016 & (i2 << 6)));
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-1222287061);
                SharedPartnerLoading(z2, gapComposer, (i2 >> 3) & 14);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-1222300670);
                gapComposer.end(z3);
            }
            gapComposer.end(true);
        } else {
            z2 = z;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SharedPartnerAuthKt$$ExternalSyntheticLambda20(sharedPartnerAuthState, z2, function0, function02, function1, i);
        }
    }

    public static final void SharedPartnerAuthContent(int i, Composer composer, SharedPartnerAuthState sharedPartnerAuthState, Function0 function0, Function0 function02, Function1 function1, boolean z) {
        int i2;
        Function0 function03;
        Function1 function12;
        Function0 function04;
        SharedPartnerAuthState sharedPartnerAuthState2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(919704421);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sharedPartnerAuthState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SharedPartnerAuthBody((i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i2 >> 6) & 896) | (i2 & 7168) | ((i2 << 6) & 57344), gapComposer, sharedPartnerAuthState, function02, function0, function1, z);
            sharedPartnerAuthState2 = sharedPartnerAuthState;
            function04 = function02;
            function03 = function0;
            function12 = function1;
            z2 = z;
        } else {
            function03 = function0;
            function12 = function1;
            function04 = function02;
            sharedPartnerAuthState2 = sharedPartnerAuthState;
            z2 = z;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SharedPartnerAuthKt$$ExternalSyntheticLambda20(sharedPartnerAuthState2, z2, function12, function03, function04, i);
        }
    }

    public static final void SharedPartnerLoading(boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(210017713);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            LoadingShimmerEffect(Expect_jvmKt.rememberComposableLambda(-644126576, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 15), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, 7, z);
        }
    }

    public static final void Subtitle(TextResource textResource, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1914060505);
        int i2 = (gapComposer.changed(textResource) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextKt.m4020AnnotatedTextrm0N8CA(textResource, function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), null, null, 0, 0, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(textResource, function1, i, 17);
        }
    }

    public static final void Title(TextResource.Text text, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1695488327);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(text) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            TextKt.m4020AnnotatedTextrm0N8CA(text, function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).headingLarge, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), null, null, 0, 0, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(text, function1, i, i2);
        }
    }

    public static final void UnclassifiedErrorContent(boolean z, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-406772431);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            z2 = i4 != 0 ? false : z;
            ErrorContent(f797lambda$117198573, Room.stringResource(gapComposer, R.string.stripe_error_generic_title), Room.stringResource(gapComposer, R.string.stripe_error_generic_desc), new Pair(Room.stringResource(gapComposer, z2 ? R.string.stripe_error_cta_manual_entry : R.string.stripe_error_cta_close), function0), null, gapComposer, 6, 16);
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda5(z2, function0, i, i2, 3);
        }
    }

    public static final void VerificationErrorText(ConfirmVerification.OTPError oTPError, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(14534336);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(oTPError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            int ordinal = oTPError.f1429type.ordinal();
            if (ordinal == 0) {
                i3 = R.string.stripe_verification_codeExpiredEmail;
            } else if (ordinal == 1) {
                i3 = R.string.stripe_verification_codeExpiredSms;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.string.stripe_verification_codeInvalid;
            }
            TextResource.StringId stringId = new TextResource.StringId(i3);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalTypography;
            TextStyle textStyle = ((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalColors;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textCritical, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446);
            Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(StringAnnotation.CLICKABLE, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal2)).textCritical, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 3, 0L, null, null, 0, 16740350).spanStyle));
            boolean changedInstance = gapComposer.changedInstance(uriHandler) | gapComposer.changedInstance(oTPError);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda0(15, uriHandler, oTPError);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextKt.m4020AnnotatedTextrm0N8CA(stringId, (Function1) rememberedValue, m994copyp1EtxEg$default, fillMaxWidth, mapOf, 0, 0, gapComposer, 3072, 96);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(oTPError, i, 6);
        }
    }

    public static final void VerificationSection(FocusRequester focusRequester, OTPElement oTPElement, boolean z, Throwable th, Modifier modifier, Composer composer, int i) {
        FocusRequester focusRequester2;
        focusRequester.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(621147059);
        int i2 = i | (gapComposer.changedInstance(oTPElement) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(th) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Continuation continuation = null;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            focusRequester2 = focusRequester;
            LayoutKt.StripeThemeForConnections(Expect_jvmKt.rememberComposableLambda(330722726, new ShiftListViewKt$$ExternalSyntheticLambda16(z, oTPElement, focusRequester2), gapComposer), gapComposer, 6);
            boolean changedInstance = gapComposer.changedInstance(th) | gapComposer.changedInstance(view);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InquiryViewModel.AnonymousClass1(th, view, continuation, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i3 = (i2 >> 9) & 14;
            Updater.LaunchedEffect(gapComposer, th, (Function2) rememberedValue);
            if (th instanceof ConfirmVerification.OTPError) {
                gapComposer.startReplaceGroup(-1596056585);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f));
                VerificationErrorText((ConfirmVerification.OTPError) th, gapComposer, i3);
            } else {
                gapComposer.startReplaceGroup(-1599341159);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            focusRequester2 = focusRequester;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(i, 17, focusRequester2, oTPElement, th, modifier, z);
        }
    }

    public static final boolean showManualEntryInErrors(SynchronizeSessionResponse synchronizeSessionResponse) {
        synchronizeSessionResponse.getClass();
        return synchronizeSessionResponse.manifest.allowManualEntry && !synchronizeSessionResponse.visual.reducedManualEntryProminenceInErrors;
    }

    public static final void ShapedIcon(Painter painter, Modifier modifier, IconSize iconSize, Shape shape, String str, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        Modifier modifier2;
        IconSize iconSize2;
        Shape shape3;
        IconSize iconSize3;
        Shape shape4;
        Modifier modifier3;
        int i4;
        painter.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(716371143);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 432;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (gapComposer.changed(shape2)) {
                    i4 = 2048;
                    i5 |= i4;
                }
            } else {
                shape2 = shape;
            }
            i4 = 1024;
            i5 |= i4;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            i5 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
                modifier3 = modifier;
                iconSize3 = iconSize;
                shape4 = shape2;
            } else {
                IconSize iconSize4 = IconSize.Medium;
                int i6 = i2 & 8;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i6 != 0) {
                    i5 &= -7169;
                    shape4 = RoundedCornerShapeKt.CircleShape;
                    iconSize3 = iconSize4;
                } else {
                    iconSize3 = iconSize4;
                    shape4 = shape2;
                }
                modifier3 = companion;
            }
            gapComposer.endDefaults();
            int i7 = i5 >> 3;
            IconWrapperBox(modifier3, iconSize3, shape4, Expect_jvmKt.rememberComposableLambda(-982781912, new PayCellViewKt$$ExternalSyntheticLambda0(16, iconSize3, painter, str), gapComposer), gapComposer, (i7 & 14) | 3072 | (i7 & 112) | (i7 & 896));
            modifier2 = modifier3;
            iconSize2 = iconSize3;
            shape3 = shape4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            iconSize2 = iconSize;
            shape3 = shape2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) painter, modifier2, (Object) iconSize2, (Object) shape3, (Object) str, i, i2, 22);
        }
    }
}
