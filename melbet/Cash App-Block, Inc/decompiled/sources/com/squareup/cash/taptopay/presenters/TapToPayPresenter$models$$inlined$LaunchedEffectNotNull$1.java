package com.squareup.cash.taptopay.presenters;

import android.nfc.NfcAdapter;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.deviceintegrity.DeviceIntegrity$EntryPoint;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.nfc.screens.NfcNotAvailableScreen;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.screens.Back;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.taptopay.backend.api.TapToPayNonFatalError;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.api.TapToPayPolicyResult;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyError;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyResult;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyProvider;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayErrorReason;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.taptopay.screens.TapToPayInitiatorNotesScreen;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.protos.cash.cashbusinesspayments.plasma.v1beta1.EligibilityCheckFlowParameters;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.FullCashtag;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class TapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Money $amount$inlined;
    public final /* synthetic */ Screen $exitScreen$inlined;
    public final /* synthetic */ MutableState $photoUrl$delegate$inlined;
    public final /* synthetic */ PublicProfile $t1;
    public final /* synthetic */ Boolean $t2;
    public final /* synthetic */ Boolean $t3;
    public int I$0;
    public /* synthetic */ Object L$0;
    public String L$4;
    public String L$5;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ TapToPayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1(PublicProfile publicProfile, Boolean bool, Boolean bool2, Continuation continuation, TapToPayPresenter tapToPayPresenter, Screen screen, Money money, MutableState mutableState) {
        super(2, continuation);
        this.$t1 = publicProfile;
        this.$t2 = bool;
        this.$t3 = bool2;
        this.this$0 = tapToPayPresenter;
        this.$exitScreen$inlined = screen;
        this.$amount$inlined = money;
        this.$photoUrl$delegate$inlined = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1 tapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1 = new TapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1(this.$t1, this.$t2, this.$t3, continuation, this.this$0, this.$exitScreen$inlined, this.$amount$inlined, this.$photoUrl$delegate$inlined);
        tapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1.L$0 = obj;
        return tapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
    
        if (r8 == r5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        String str;
        boolean z;
        String str2;
        int i;
        String cashtagWithCurrencySymbol;
        Character ch;
        Character valueOf;
        Object buildSignedSerializedMRIContext$default;
        String str3;
        Object checkTapToPayPolicy;
        boolean z2;
        boolean z3;
        TapToPayPolicyResult tapToPayPolicyResult;
        boolean z4;
        Object provisionKeys;
        String str4;
        boolean areEqual;
        Screen tapToPayErrorScreen;
        HieroglyphKeyError hieroglyphKeyError;
        TapToPayPresenter tapToPayPresenter = this.this$0;
        RealHieroglyphKeyProvider realHieroglyphKeyProvider = (RealHieroglyphKeyProvider) tapToPayPresenter.keyProvider;
        FlowStarter flowStarter = (FlowStarter) tapToPayPresenter.flowStarter;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            boolean booleanValue2 = this.$t3.booleanValue();
            booleanValue = this.$t2.booleanValue();
            String m = re$$ExternalSyntheticOutline0.m();
            PublicProfile publicProfile = this.$t1;
            FullCashtag fullCashtag = publicProfile.fullCashtag;
            String str5 = publicProfile.fullName;
            if (fullCashtag == null || (cashtagWithCurrencySymbol = FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag)) == null) {
                str = m;
            } else {
                RealTapToPaySessionManager realTapToPaySessionManager = (RealTapToPaySessionManager) tapToPayPresenter.ttpSessionManager;
                String str6 = (String) this.$photoUrl$delegate$inlined.getValue();
                char charAt = (str5 == null || StringsKt.isBlank(str5)) ? (char) 0 : str5.charAt(0);
                if (Character.isLetter(charAt)) {
                    String valueOf2 = String.valueOf(charAt);
                    Locale locale = Locale.US;
                    locale.getClass();
                    String upperCase = valueOf2.toUpperCase(locale);
                    upperCase.getClass();
                    valueOf = Character.valueOf(upperCase.charAt(0));
                } else if (Character.isDigit(charAt)) {
                    valueOf = Character.valueOf(charAt);
                } else {
                    ch = null;
                    str = m;
                    realTapToPaySessionManager.ttpSessionData = new TapToPayPaymentData(this.$amount$inlined, cashtagWithCurrencySymbol, m, this.$exitScreen$inlined, str6, ch, PlatformKt.activeAccountTokenOrNull((SessionManager) tapToPayPresenter.sessionManager), false);
                }
                ch = valueOf;
                str = m;
                realTapToPaySessionManager.ttpSessionData = new TapToPayPaymentData(this.$amount$inlined, cashtagWithCurrencySymbol, m, this.$exitScreen$inlined, str6, ch, PlatformKt.activeAccountTokenOrNull((SessionManager) tapToPayPresenter.sessionManager), false);
            }
            if (booleanValue2) {
                screenNavigator.goTo(FlowStarter.startPlasmaFlow$default((RealFlowStarter) flowStarter, Flow$Type.C4B_TTP_ONBOARDING, PaymentScreens$HomeScreens$PaymentPad.INSTANCE, null, null, 12));
            } else {
                NfcAdapter nfcAdapter = (NfcAdapter) ((RealTapToPayEligibilityProvider) tapToPayPresenter.ttpEligibilityProvider).nfcPaymentManager.nfcAdapter$delegate.getValue();
                if (nfcAdapter != null && nfcAdapter.isEnabled()) {
                    RealDeviceIntegrityAttester realDeviceIntegrityAttester = (RealDeviceIntegrityAttester) tapToPayPresenter.deviceIntegrityAttester;
                    String str7 = "ttp_" + RealUuidGenerator.generate();
                    DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = DeviceIntegrity$EntryPoint.TTP;
                    this.L$0 = null;
                    this.L$4 = str;
                    this.Z$0 = booleanValue2;
                    this.Z$1 = booleanValue;
                    this.I$0 = 0;
                    this.label = 1;
                    if (realDeviceIntegrityAttester.attestStandardRequest(str7, "TTP", deviceIntegrity$EntryPoint, this) != coroutineSingletons) {
                        z = booleanValue2;
                        str2 = str;
                        i = 0;
                    }
                    return coroutineSingletons;
                }
                screenNavigator.goTo(new NfcNotAvailableScreen(TapToPayScreen.TapToPayReturnScreen.INSTANCE, Back.INSTANCE));
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i = this.I$0;
                booleanValue = this.Z$1;
                z = this.Z$0;
                str2 = this.L$4;
                SafeTrace.throwOnFailure(obj);
                buildSignedSerializedMRIContext$default = obj;
                str3 = str2;
                RealTapToPayRepository realTapToPayRepository = (RealTapToPayRepository) tapToPayPresenter.tapToPayRepository;
                this.L$0 = null;
                this.L$4 = null;
                this.L$5 = str3;
                this.Z$0 = z;
                this.Z$1 = booleanValue;
                this.I$0 = i;
                this.label = 3;
                checkTapToPayPolicy = realTapToPayRepository.checkTapToPayPolicy(str3, (SignedSerializedMRIContext) buildSignedSerializedMRIContext$default, this);
                if (checkTapToPayPolicy != coroutineSingletons) {
                    z2 = z;
                    z3 = booleanValue;
                    tapToPayPolicyResult = (TapToPayPolicyResult) checkTapToPayPolicy;
                    if (!(tapToPayPolicyResult instanceof TapToPayPolicyResult.Failure)) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                i = this.I$0;
                z3 = this.Z$1;
                boolean z5 = this.Z$0;
                str3 = this.L$5;
                SafeTrace.throwOnFailure(obj);
                checkTapToPayPolicy = obj;
                z2 = z5;
                tapToPayPolicyResult = (TapToPayPolicyResult) checkTapToPayPolicy;
                if (!(tapToPayPolicyResult instanceof TapToPayPolicyResult.Failure)) {
                    int ordinal = ((TapToPayPolicyResult.Failure) tapToPayPolicyResult).reason.ordinal();
                    Screen screen = this.$exitScreen$inlined;
                    if (ordinal == 0 || ordinal == 1) {
                        screenNavigator.goTo(new TapToPayErrorDialogScreen.TapToPayGenericErrorSupportDialogScreen(screen, TapToPayErrorReason.POLICY_FAILURE_API_ERROR, null, null));
                    } else if (ordinal == 2) {
                        screenNavigator.goTo(new TapToPayErrorDialogScreen.TapToPayPlayProtectErrorDialogScreen(screen, TapToPayErrorReason.POLICY_FAILURE_PLAY_PROTECT_NOT_AVAILABLE, null, null));
                    } else if (ordinal == 3) {
                        screenNavigator.goTo(new TapToPayErrorDialogScreen.TapToPayAndroidVersionOutdatedDialogScreen(screen, TapToPayErrorReason.POLICY_FAILURE_OS_PLATFORM_LEVEL_OUTDATED, null, null));
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(new TapToPayErrorDialogScreen.TapToPayScreenCastingDialogScreen(screen, TapToPayErrorReason.POLICY_FAILURE_SCREEN_RECORDING_ON, null, null));
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = null;
                this.L$4 = null;
                this.L$5 = str3;
                this.Z$0 = z2;
                this.Z$1 = z3;
                this.I$0 = i;
                this.label = 4;
                if (realHieroglyphKeyProvider.init(this) != coroutineSingletons) {
                    z4 = z3;
                    this.L$0 = null;
                    this.L$4 = null;
                    this.L$5 = str3;
                    this.Z$0 = z2;
                    this.Z$1 = z4;
                    this.I$0 = i;
                    this.label = 5;
                    provisionKeys = realHieroglyphKeyProvider.provisionKeys(this);
                    if (provisionKeys != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                i = this.I$0;
                z4 = this.Z$1;
                z2 = this.Z$0;
                String str8 = this.L$5;
                SafeTrace.throwOnFailure(obj);
                str3 = str8;
                this.L$0 = null;
                this.L$4 = null;
                this.L$5 = str3;
                this.Z$0 = z2;
                this.Z$1 = z4;
                this.I$0 = i;
                this.label = 5;
                provisionKeys = realHieroglyphKeyProvider.provisionKeys(this);
                if (provisionKeys != coroutineSingletons) {
                    str4 = str3;
                    HieroglyphKeyResult hieroglyphKeyResult = (HieroglyphKeyResult) provisionKeys;
                    areEqual = Intrinsics.areEqual(hieroglyphKeyResult, HieroglyphKeyResult.Success.INSTANCE);
                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                    if (!areEqual) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
            if (i2 != 5) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z6 = this.Z$1;
            str4 = this.L$5;
            SafeTrace.throwOnFailure(obj);
            z4 = z6;
            provisionKeys = obj;
            HieroglyphKeyResult hieroglyphKeyResult2 = (HieroglyphKeyResult) provisionKeys;
            areEqual = Intrinsics.areEqual(hieroglyphKeyResult2, HieroglyphKeyResult.Success.INSTANCE);
            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
            if (!areEqual) {
                if (z4) {
                    Money money = this.$amount$inlined;
                    money.getClass();
                    str4.getClass();
                    tapToPayErrorScreen = FlowStarter.startPlasmaFlowWithParams$default((RealFlowStarter) flowStarter, Flow$Type.C4B_TTP_PAYMENT_ELIGIBILITY_CHECK, new EligibilityCheckFlowParameters(str4, money, null, ByteString.EMPTY), TapToPayInitiatorNotesScreen.INSTANCE, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    ((RealTapToPayErrorReporter) tapToPayPresenter.tapToPayErrorReporter).errorReporter.report(new TapToPayNonFatalError("TapToPay unexpected onboarding activation state"), defaultSamplingStrategy2);
                    tapToPayErrorScreen = new TapToPayErrorScreen(TapToPayErrorReason.ONBOARDING_ACTIVATION_FAILURE);
                }
                screenNavigator.goTo(tapToPayErrorScreen);
            } else {
                if (!(hieroglyphKeyResult2 instanceof HieroglyphKeyResult.KeyImportFailure) && !(hieroglyphKeyResult2 instanceof HieroglyphKeyResult.ProvisioningFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ErrorReporter errorReporter = (ErrorReporter) tapToPayPresenter.errorReporter;
                hieroglyphKeyResult2.getClass();
                boolean z7 = hieroglyphKeyResult2 instanceof HieroglyphKeyResult.ProvisioningFailure;
                if (z7) {
                    hieroglyphKeyError = new HieroglyphKeyError("ProvisioningFailure; null");
                } else {
                    if (!(hieroglyphKeyResult2 instanceof HieroglyphKeyResult.KeyImportFailure)) {
                        a$$ExternalSyntheticBUOutline0.m$1("non error HieroglyphKeyResult");
                        return null;
                    }
                    hieroglyphKeyError = new HieroglyphKeyError(Recorder$$ExternalSyntheticOutline2.m("KeyImportFailure; ", ((HieroglyphKeyResult.KeyImportFailure) hieroglyphKeyResult2).keyAlias));
                }
                errorReporter.report(hieroglyphKeyError, defaultSamplingStrategy2);
                screenNavigator.goTo(new TapToPayErrorScreen(z7 ? TapToPayErrorReason.PROVISIONING_FAILURE : hieroglyphKeyResult2 instanceof HieroglyphKeyResult.KeyImportFailure ? TapToPayErrorReason.KEY_IMPORT_FAILURE : TapToPayErrorReason.UNKNOWN));
            }
            return Unit.INSTANCE;
        }
        i = this.I$0;
        booleanValue = this.Z$1;
        z = this.Z$0;
        str2 = this.L$4;
        SafeTrace.throwOnFailure(obj);
        RealMRIFactory realMRIFactory = (RealMRIFactory) tapToPayPresenter.mriFactory;
        MRIUseCase mRIUseCase = MRIUseCase.TTP;
        Boolean bool = (Boolean) ((RealScreenRecordingDetector) tapToPayPresenter.screenRecodingDetector)._screenIsBeingRecorded.getValue();
        this.L$0 = null;
        this.L$4 = str2;
        this.Z$0 = z;
        this.Z$1 = booleanValue;
        this.I$0 = i;
        this.label = 2;
        buildSignedSerializedMRIContext$default = RealMRIFactory.buildSignedSerializedMRIContext$default(realMRIFactory, mRIUseCase, bool, this, 4);
    }
}
