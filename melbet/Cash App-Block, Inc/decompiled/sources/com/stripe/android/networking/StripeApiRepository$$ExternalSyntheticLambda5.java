package com.stripe.android.networking;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavGraphBuilder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.VisualUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationKt;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.views.ChallengeZoneSelectView;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonBuilder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripeApiRepository$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StripeApiRepository$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WebAuthFlowState webAuthFlowState;
        Theme theme;
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver);
                break;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver2);
                break;
            case 3:
                ((String) obj).getClass();
                break;
            case 4:
                ((String) obj).getClass();
                break;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver3);
                break;
            case 6:
                ((String) obj).getClass();
                break;
            case 7:
                ((String) obj).getClass();
                break;
            case 8:
                break;
            case 9:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.ignoreUnknownKeys = true;
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                break;
            case 11:
                CreationExtras creationExtras = (CreationExtras) obj;
                creationExtras.getClass();
                SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                Object obj2 = creationExtras.get(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY);
                obj2.getClass();
                Application application = (Application) obj2;
                int i = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) createSavedStateHandle.get("FinancialConnectionsSheetNativeActivityArgs");
                if (financialConnectionsSheetNativeActivityArgs == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    break;
                } else {
                    SynchronizeSessionResponse synchronizeSessionResponse = financialConnectionsSheetNativeActivityArgs.initialSyncResponse;
                    Bundle bundle = (Bundle) createSavedStateHandle.get("FinancialConnectionsSheetNativeState");
                    FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType = financialConnectionsSheetNativeActivityArgs.flowType;
                    if (bundle == null || (webAuthFlowState = (WebAuthFlowState) bundle.getParcelable("webAuthFlow")) == null) {
                        webAuthFlowState = WebAuthFlowState.Uninitialized.INSTANCE;
                    }
                    WebAuthFlowState webAuthFlowState2 = webAuthFlowState;
                    VisualUpdate visualUpdate = synchronizeSessionResponse.visual;
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                    boolean z = visualUpdate.reducedBranding;
                    boolean z2 = !financialConnectionsSessionManifest.livemode;
                    boolean z3 = bundle != null ? bundle.getBoolean("firstInit", true) : true;
                    FinancialConnectionsSessionManifest.Pane pane = financialConnectionsSessionManifest.nextPane;
                    FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = financialConnectionsSheetNativeActivityArgs.configuration;
                    FinancialConnectionsSessionManifest.Theme theme2 = financialConnectionsSessionManifest.theme;
                    if (theme2 != null) {
                        theme = FinancialConnectionsSheetNativeActivityKt.toLocalTheme(theme2);
                    } else {
                        Theme.Companion.getClass();
                        theme = Theme.f825default;
                    }
                    Theme theme3 = theme;
                    LinkBrand linkBrand = financialConnectionsSessionManifest.rawLinkBrand;
                    if (linkBrand == null) {
                        linkBrand = LinkBrand.Link;
                    }
                    LinkBrand linkBrand2 = linkBrand;
                    Boolean bool = financialConnectionsSessionManifest.isLinkWithStripe;
                    boolean z4 = z3;
                    break;
                }
            case 12:
                NavGraphBuilder navGraphBuilder = (NavGraphBuilder) obj;
                int i2 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                navGraphBuilder.getClass();
                DestinationKt.composable$default(navGraphBuilder, Destination.Consent.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.IDConsentContent.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.ManualEntry.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.PartnerAuth.INSTANCE);
                DestinationKt.bottomSheet$default(navGraphBuilder, Destination.PartnerAuthDrawer.INSTANCE);
                DestinationKt.bottomSheet$default(navGraphBuilder, Destination.Exit.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.InstitutionPicker.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.AccountPicker.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.Success.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.Reset.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.Error.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.AttachLinkedPaymentAccount.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.NetworkingLinkSignup.INSTANCE);
                DestinationKt.bottomSheet$default(navGraphBuilder, Destination.NetworkingLinkLoginWarmup.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.NetworkingLinkVerification.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.NetworkingSaveToLinkVerification.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.LinkAccountPicker.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.BankAuthRepair.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.ManualEntrySuccess.INSTANCE);
                DestinationKt.bottomSheet$default(navGraphBuilder, Destination.Notice.INSTANCE);
                DestinationKt.bottomSheet$default(navGraphBuilder, Destination.AccountUpdateRequired.INSTANCE);
                DestinationKt.composable$default(navGraphBuilder, Destination.LinkLogin.INSTANCE);
                break;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver4);
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver5);
                break;
            case 15:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                DrawScope.m749drawRoundRectuAw5IA$default(drawScope, ColorKt.Attention300, 0L, 0L, (Float.floatToRawIntBits(8.0f) << 32) | (Float.floatToRawIntBits(8.0f) & BodyPartID.bodyIdMax), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
                break;
            case 16:
                JsonBuilder jsonBuilder2 = (JsonBuilder) obj;
                jsonBuilder2.getClass();
                jsonBuilder2.ignoreUnknownKeys = true;
                jsonBuilder2.explicitNulls = false;
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                ((HttpsURLConnection) obj).getClass();
                break;
            case 23:
                int i3 = PaymentLauncherConfirmationActivity.$r8$clinit;
                ((OnBackPressedCallback) obj).getClass();
                break;
            case 24:
                Pair pair = (Pair) obj;
                pair.getClass();
                break;
            case 25:
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = (ChallengeResponseData.ChallengeSelectOption) obj;
                int i4 = ChallengeZoneSelectView.$r8$clinit;
                challengeSelectOption.getClass();
                break;
            case 26:
                break;
            case 27:
                FocusProperties focusProperties = (FocusProperties) obj;
                focusProperties.getClass();
                focusProperties.setCanFocus(false);
                break;
            case 28:
                ((TextFieldValue) obj).getClass();
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                ContentType.Companion.getClass();
                SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver6, ContentType.Companion.SmsOtpCode);
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver6);
                break;
        }
        return Unit.INSTANCE;
    }
}
