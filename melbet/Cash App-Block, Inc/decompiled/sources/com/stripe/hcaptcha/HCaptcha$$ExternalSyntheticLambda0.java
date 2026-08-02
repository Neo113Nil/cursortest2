package com.stripe.hcaptcha;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.navigation.NamedNavArgument;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.be;
import com.squareup.cash.R;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotDisclosureManager;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.models.ProtoDeserializer;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.scannerview.PixelGrid;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import com.squareup.wire.internal.SealedOneOfBinding;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import com.stripe.android.challenge.passive.PassiveChallengeArgs;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerArgs;
import com.stripe.android.core.exception.GenericStripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationKt;
import com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.RequestSurface;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetKeyboardHandler;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import com.stripe.android.view.PaymentAuthWebViewClient;
import com.stripe.attestation.IntegrityStandardRequestManager;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.MarkwonConfiguration;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes8.dex */
public final /* synthetic */ class HCaptcha$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HCaptcha$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.text.MatchResult$Destructured] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object failure;
        Object failure2;
        String failure3;
        RealMoneybotDisclosureManager realMoneybotDisclosureManager;
        List split$default;
        int i = this.$r8$classId;
        int i2 = 6;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) ((HCaptcha) obj).onOpenListeners).iterator();
                while (it.hasNext()) {
                    ((IHCaptchaVerifier) it.next()).onOpen();
                }
                return Unit.INSTANCE;
            case 1:
                Object obj2 = ((Merchant) obj).protoJson;
                if (obj2 == null) {
                    return null;
                }
                Moshi moshi = ProtoDeserializer.moshi;
                try {
                    Result.Companion companion = Result.Companion;
                    Moshi moshi2 = ProtoDeserializer.moshi;
                    moshi2.getClass();
                    failure = moshi2.adapter(com.squareup.protos.wire.roster.mds.Merchant.class, Util.NO_ANNOTATIONS, null).fromJsonValue(obj2);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                return (com.squareup.protos.wire.roster.mds.Merchant) (failure instanceof Result.Failure ? 0 : failure);
            case 2:
                Object obj3 = ((Person) obj).protoJson;
                if (obj3 == null) {
                    return null;
                }
                Moshi moshi3 = ProtoDeserializer.moshi;
                try {
                    Result.Companion companion3 = Result.Companion;
                    Moshi moshi4 = ProtoDeserializer.moshi;
                    moshi4.getClass();
                    failure2 = moshi4.adapter(com.squareup.protos.person.Person.class, Util.NO_ANNOTATIONS, null).fromJsonValue(obj3);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                return (com.squareup.protos.person.Person) (failure2 instanceof Result.Failure ? null : failure2);
            case 3:
                ((ClockInOverlayState) obj).onBackFromPicker();
                return Unit.INSTANCE;
            case 4:
                return Integer.valueOf(((ShiftSection2ViewModel.Loaded) obj).shifts.size());
            case 5:
                PixelGrid pixelGrid = (PixelGrid) obj;
                int i3 = pixelGrid.pixelStride;
                byte[] bArr = pixelGrid.data;
                int i4 = pixelGrid.rowStride;
                int i5 = pixelGrid.width;
                if (i3 == 1 && i4 == i5) {
                    return bArr;
                }
                int i6 = pixelGrid.height;
                byte[] bArr2 = new byte[i5 * i6];
                if (i3 == 1) {
                    int i7 = (i5 - i3) + 1;
                    int i8 = i6 - 1;
                    for (int i9 = 0; i9 < i8; i9++) {
                        System.arraycopy(bArr, i9 * i4, bArr2, i9 * i5, i7);
                    }
                } else {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = i10 * i5;
                        for (int i12 = 0; i12 < i5; i12++) {
                            bArr2[i11 + i12] = bArr[(i12 * i3) + (i10 * i4)];
                        }
                    }
                }
                return bArr2;
            case 6:
                FieldOrOneOfBinding fieldOrOneOfBinding = (FieldOrOneOfBinding) obj;
                if (!fieldOrOneOfBinding.isMap()) {
                    ProtoAdapter withLabel$wire_runtime = fieldOrOneOfBinding.getSingleAdapter().withLabel$wire_runtime(fieldOrOneOfBinding.getLabel());
                    withLabel$wire_runtime.getClass();
                    return withLabel$wire_runtime;
                }
                ProtoAdapter.Companion companion5 = ProtoAdapter.Companion;
                ProtoAdapter keyAdapter = fieldOrOneOfBinding.getKeyAdapter();
                keyAdapter.getClass();
                ProtoAdapter singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                singleAdapter.getClass();
                companion5.getClass();
                return ProtoAdapter.Companion.newMapAdapter(keyAdapter, singleAdapter);
            case 7:
                Field declaredField = ((SealedOneOfBinding) obj).subclassType.getDeclaredField("value");
                declaredField.setAccessible(true);
                return declaredField;
            case 8:
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj;
                LinkResolverDef linkResolverDef = new LinkResolverDef(9);
                new LinkedHashMap();
                Pool pool = new Pool();
                pool.pool = IblLoaderKt.stateFlowOf(Boolean.FALSE);
                Context context = (Context) markwonConfiguration.imageDestinationProcessor;
                try {
                    Result.Companion companion6 = Result.Companion;
                    context.getClass();
                    PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
                    if (paymentConfiguration == null) {
                        SharedPreferences sharedPreferences = new PaymentConfiguration.Store(context).prefs;
                        String string2 = sharedPreferences.getString("key_publishable_key", null);
                        paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                        if (paymentConfiguration == null) {
                            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        }
                        PaymentConfiguration.instance = paymentConfiguration;
                    }
                    failure3 = paymentConfiguration.publishableKey;
                } catch (Throwable th3) {
                    Result.Companion companion7 = Result.Companion;
                    failure3 = new Result.Failure(th3);
                }
                if (!(failure3 instanceof Result.Failure)) {
                    markwonConfiguration.fireAnalyticsEvent(PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable, failure3);
                }
                if (Result.m4120exceptionOrNullimpl(failure3) != null) {
                    markwonConfiguration.fireAnalyticsEvent(PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable, "pk_undefined");
                }
                if (Result.m4120exceptionOrNullimpl(failure3) == null) {
                    String str = failure3;
                    context.getClass();
                    new StripeApiRepository(context, new PromotionsTitleBarKt$$ExternalSyntheticLambda0(str, 1), (RequestSurface) markwonConfiguration.syntaxHighlight, null, null, null, null, null, 65528);
                    new ApiRequest.Options(str, (String) r4, i2);
                    new DefaultAnalyticsRequestExecutor();
                    context.getClass();
                    new PaymentAnalyticsRequestFactory(context, str, (Set) markwonConfiguration.theme);
                    ?? destructured = new MatchResult.Destructured();
                    destructured.match = FlowKt.asStateFlow(FlowKt.MutableStateFlow(Boolean.FALSE));
                    realMoneybotDisclosureManager = destructured;
                } else {
                    realMoneybotDisclosureManager = new RealMoneybotDisclosureManager();
                }
                return new Plane(pool, realMoneybotDisclosureManager, new o0(), linkResolverDef);
            case 9:
                return ((PassiveChallengeActivity) obj).viewModelFactory;
            case 10:
                return ((PassiveChallengeArgs) obj).publishableKey;
            case 11:
                return ((PassiveChallengeWarmerActivity) obj).viewModelFactory;
            case 12:
                return ((PassiveChallengeWarmerArgs) obj).publishableKey;
            case 13:
                return ((RealAnalyticsRequestV2Storage) obj).context.getSharedPreferences("StripeAnalyticsRequestV2Storage", 0);
            case 14:
                return (ApiRequest.Options) obj;
            case 15:
                int i13 = FinancialConnectionsSheetActivity.$r8$clinit;
                FinancialConnectionsSheetViewModel.finishWithResult$default(((FinancialConnectionsSheetActivity) obj).getViewModel(), FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, 6);
                return Unit.INSTANCE;
            case 16:
                Destination destination = (Destination) obj;
                ArrayList arrayList = destination.arguments;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((NamedNavArgument) it2.next()).name);
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    linkedHashMap.put(next, "{" + ((String) next) + "}");
                }
                return DestinationKt.appendParamValues(destination.route, linkedHashMap);
            case 17:
                return Boolean.valueOf(((ModalBottomSheetState) obj).isVisible());
            case 18:
                DefaultGooglePayRepository defaultGooglePayRepository = (DefaultGooglePayRepository) obj;
                return new DefaultGooglePayAvailabilityClient(defaultGooglePayRepository.paymentsClientFactory.create(defaultGooglePayRepository.environment));
            case 19:
                return ((CollectBankAccountContract.Args) obj).getPublishableKey();
            case 20:
                return ((Stripe3ds2TransactionContract.Args) obj).publishableKey;
            case 21:
                try {
                    byte[] decode = Base64.decode(((PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) obj).hashedValue, 0);
                    decode.getClass();
                    split$default = StringsKt__StringsKt.split$default(new String(decode, Charsets.UTF_8), new String[]{":"}, false, 0, 6, null);
                    if (split$default.size() != 2) {
                        Result.Companion companion8 = Result.Companion;
                        return new Result(new Result.Failure(new GenericStripeException("invalidHashedValueIncorrectFormat", new IllegalArgumentException("Invalid hashed value! Please provided a hashed payment intent in the correct format!"))));
                    }
                    Result.Companion companion9 = Result.Companion;
                    return new Result(new Pair(split$default.get(0), split$default.get(1)));
                } catch (IllegalArgumentException e) {
                    Result.Companion companion10 = Result.Companion;
                    return new Result(new Result.Failure(new GenericStripeException("invalidHashedValueNotBase64", new IllegalArgumentException("Invalid hashed value! Please provided a hashed payment intent in the correct format!", e))));
                }
            case 22:
                View inflate = ((ChallengeSubmitDialogFactory.ChallengeSubmitDialog) obj).getLayoutInflater().inflate(R.layout.stripe_challenge_submit_dialog, (ViewGroup) null, false);
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                if (circularProgressIndicator != null) {
                    return new StripeChallengeSubmitDialogBinding((FrameLayout) inflate, circularProgressIndicator);
                }
                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progress_bar)));
                return null;
            case 23:
                Boolean bool = (Boolean) ((StripeBottomSheetKeyboardHandler) obj).isKeyboardVisible.getValue();
                bool.getClass();
                return bool;
            case 24:
                Boolean bool2 = (Boolean) ((State) ((RealWebSocket$connect$1) obj).$request).getValue();
                bool2.getClass();
                return bool2;
            case 25:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                return Unit.INSTANCE;
            case 26:
                return ((StateFlow) obj).getValue();
            case 27:
                int i14 = PaymentAuthWebViewActivity.$r8$clinit;
                ((PaymentAuthWebViewClient) obj).hasLoadedBlank = true;
                return Unit.INSTANCE;
            case 28:
                MapBuilder mapBuilder = new MapBuilder();
                String str2 = ((PaymentAuthWebViewActivityViewModel) obj).args.referrer;
                if (str2 != null) {
                    mapBuilder.put("Referer", str2);
                }
                MapBuilder build = mapBuilder.build();
                NetworkTypeDetector networkTypeDetector = new NetworkTypeDetector();
                boolean z = Stripe.advancedFraudSignalsEnabled;
                return MapsKt__MapsKt.plus(networkTypeDetector.create(), build);
            default:
                be createStandard = IntegrityManagerFactory.createStandard(((IntegrityStandardRequestManager) obj).factory.appContext);
                createStandard.getClass();
                return createStandard;
        }
    }
}
