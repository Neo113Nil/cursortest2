package com.squareup.scannerview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebSettings;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.Recording;
import androidx.collection.LruCache;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.emoji2.text.MetadataRepo;
import androidx.glance.layout.SizeModifiersKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.DirectEncrypter;
import com.nimbusds.jose.crypto.RSAEncrypter;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jwt.JWTClaimsSet;
import com.squareup.cash.blockers.views.ScannerTextSwapper;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.api.SupportSearchService$DefaultNodes;
import com.squareup.cash.support.backend.api.SupportSearchService$Result;
import com.squareup.cash.support.backend.api.SupportSearchService$SearchNode;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.articles.NewSupportSearchService$search$1;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.supportarticles.app.v1.AppSupportArticleService;
import com.squareup.cash.supportarticles.app.v1.SearchSupportArticlesRequest;
import com.squareup.cash.supportarticles.app.v1.SearchSupportArticlesResponse;
import com.squareup.cash.supportarticles.app.v1.SupportLink;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.ecr.EmbeddedCardReader;
import com.squareup.kotterknife.Lazy;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts$invoke$1;
import com.stripe.android.financialconnections.lite.network.FinancialConnectionsLiteRequestExecutor$execute$1;
import com.stripe.android.financialconnections.lite.network.FinancialConnectionsLiteRequestExecutor$executeInternal$1;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.RequestSurface;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.transaction.HttpResponse;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default;
import com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.webview.HCaptchaDebugInfo;
import com.stripe.hcaptcha.webview.HCaptchaJSInterface;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import com.stripe.hcaptcha.webview.HCaptchaWebViewHelper$HCaptchaWebChromeClient;
import com.stripe.hcaptcha.webview.HCaptchaWebViewHelper$HCaptchaWebClient;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.FinalizeRecordingError;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.RecordingHelper$RecordingState;
import com.withpersona.sdk2.camera.RecordingHelper$stop$1;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel_Factory;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator$perform$1;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator$runSna$1;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator$sendUpdate$1;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker;
import com.withpersona.sdk2.inquiry.sna.SnaClient$Response$Error;
import dagger.android.AndroidInjector;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.crypto.SecretKey;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.Charsets;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class TextSetter implements OffsetMapping, AndroidInjector {
    public Object scannerText;
    public Object textSwitcher;
    public final Object textView;

    public TextSetter(Handler handler, Context context, HCaptchaConfig hCaptchaConfig, HCaptchaInternalConfig hCaptchaInternalConfig, IHCaptchaVerifier iHCaptchaVerifier, HCaptchaStateListener hCaptchaStateListener, HCaptchaWebView hCaptchaWebView) {
        context.getClass();
        hCaptchaInternalConfig.getClass();
        this.textView = hCaptchaConfig;
        this.textSwitcher = hCaptchaStateListener;
        this.scannerText = hCaptchaWebView;
        HCaptchaJSInterface hCaptchaJSInterface = new HCaptchaJSInterface(handler, hCaptchaConfig, iHCaptchaVerifier);
        HCaptchaDebugInfo hCaptchaDebugInfo = new HCaptchaDebugInfo(context);
        WebSettings settings = hCaptchaWebView.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(-1);
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        hCaptchaWebView.setWebViewClient(new HCaptchaWebViewHelper$HCaptchaWebClient(this, handler, hCaptchaStateListener));
        hCaptchaWebView.setWebChromeClient(new HCaptchaWebViewHelper$HCaptchaWebChromeClient());
        hCaptchaWebView.setBackgroundColor(0);
        if (hCaptchaConfig.disableHardwareAcceleration) {
            hCaptchaWebView.setLayerType(1, null);
        }
        hCaptchaWebView.addJavascriptInterface(hCaptchaJSInterface, "JSInterface");
        hCaptchaWebView.addJavascriptInterface(hCaptchaDebugInfo, "JSDI");
        hCaptchaWebView.loadDataWithBaseURL(hCaptchaConfig.host, (String) hCaptchaInternalConfig.htmlProvider.invoke(), "text/html", "UTF-8", null);
    }

    public static final HttpResponse access$doPostRequestInternal(TextSetter textSetter, String str, String str2) {
        Object failure;
        String str3 = (String) textSetter.textView;
        str3.getClass();
        URLConnection openConnection = new URL(str3).openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", str2);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (200 > responseCode || responseCode >= 300) {
                    throw new SDKRuntimeException("Unsuccessful response code from " + str3 + ": " + responseCode, null);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.getClass();
                try {
                    Result.Companion companion = Result.Companion;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked);
                    try {
                        failure = AppUpdateData.readText(bufferedReader);
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                String str4 = (String) (failure instanceof Result.Failure ? null : failure);
                if (str4 == null) {
                    str4 = "";
                }
                return new HttpResponse(str4, httpURLConnection.getContentType());
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: durationInMs-BwNAW2A, reason: not valid java name */
    public static float m3979durationInMsBwNAW2A(Duration duration) {
        return duration != null ? (float) Duration.m4175toDoubleimpl(duration.rawValue, DurationUnit.MILLISECONDS) : RecyclerView.DECELERATION_RATE;
    }

    public static StripeException handleApiError(StripeResponse stripeResponse) {
        RequestId requestId = stripeResponse.requestId;
        String str = requestId != null ? requestId.value : null;
        int i = stripeResponse.code;
        StripeError parse = KClasses$$Lambda$1.parse(JsonUtilsKt.responseJson(stripeResponse));
        if (i != 202) {
            if (i == 429) {
                return new RateLimitException(parse, str);
            }
            if (i != 400) {
                if (i == 401) {
                    return new AuthenticationException(HttpStatusCode.UNAUTHORIZED_401, 24, parse, str, null, null);
                }
                if (i == 403) {
                    return new PermissionException(403, 24, parse, str, null, null);
                }
                if (i != 404) {
                    return new APIException(i, 24, parse, str, null, null);
                }
            }
        }
        return new InvalidRequestException(i, 24, parse, str, null, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public String encrypt(String str, PublicKey publicKey, String str2, String str3) {
        Object failure;
        char c;
        Iterator it;
        Object obj;
        str.getClass();
        publicKey.getClass();
        str2.getClass();
        String str4 = "The JWE algorithm \"alg\" cannot be \"none\"";
        if (publicKey instanceof RSAPublicKey) {
            Result.Companion companion = Result.Companion;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            ((y0) this.textView).getClass();
            JWEAlgorithm jWEAlgorithm = JWEAlgorithm.RSA_OAEP_256;
            EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
            if (jWEAlgorithm.name.equals(Algorithm.NONE.name)) {
                a$$ExternalSyntheticBUOutline0.m$3("The JWE algorithm \"alg\" cannot be \"none\"");
                return null;
            }
            Objects.requireNonNull(encryptionMethod);
            JWEObject jWEObject = new JWEObject(new JWEHeader(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, str3, null, null, null, null, null, 0, null, null, null, null, null, null, null, null), new Payload(str));
            jWEObject.encrypt(new RSAEncrypter(rSAPublicKey));
            failure = jWEObject.serialize();
        } else if (publicKey instanceof ECPublicKey) {
            Result.Companion companion2 = Result.Companion;
            Lazy lazy = (Lazy) this.textSwitcher;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            lazy.getClass();
            int i = JWTClaimsSet.$r8$clinit;
            Map parse = JSONObjectUtils.parse(-1, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = parse.keySet().iterator();
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                str5.getClass();
                String str6 = str4;
                switch (str5.hashCode()) {
                    case 96944:
                        if (str5.equals("aud")) {
                            c = 0;
                            it = it2;
                            break;
                        }
                        break;
                    case 100893:
                        if (str5.equals("exp")) {
                            c = 1;
                            it = it2;
                            break;
                        }
                        break;
                    case 104028:
                        if (str5.equals("iat")) {
                            c = 2;
                            it = it2;
                            break;
                        }
                        break;
                    case 104585:
                        if (str5.equals("iss")) {
                            c = 3;
                            it = it2;
                            break;
                        }
                        break;
                    case 105567:
                        if (str5.equals("jti")) {
                            c = 4;
                            it = it2;
                            break;
                        }
                        break;
                    case 108850:
                        if (str5.equals("nbf")) {
                            c = 5;
                            it = it2;
                            break;
                        }
                        break;
                    case 114240:
                        if (str5.equals("sub")) {
                            c = 6;
                            it = it2;
                            break;
                        }
                        break;
                }
                it = it2;
                c = 65535;
                switch (c) {
                    case 0:
                        Object obj2 = parse.get("aud");
                        if (!(obj2 instanceof String)) {
                            if (!(obj2 instanceof List)) {
                                if (obj2 != null) {
                                    JWK$$ExternalSyntheticBUOutline0.m$1("Illegal aud claim");
                                    break;
                                } else {
                                    obj = null;
                                    linkedHashMap.put("aud", null);
                                    it2 = it;
                                    str4 = str6;
                                }
                            } else {
                                linkedHashMap.put("aud", JSONObjectUtils.getStringList("aud", parse));
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add((String) JSONObjectUtils.getGeneric(parse, "aud", String.class));
                            linkedHashMap.put("aud", arrayList);
                        }
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    case 1:
                        linkedHashMap.put("exp", JSONObjectUtils.getEpochSecondAsDate("exp", parse));
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    case 2:
                        linkedHashMap.put("iat", JSONObjectUtils.getEpochSecondAsDate("iat", parse));
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    case 3:
                        linkedHashMap.put("iss", (String) JSONObjectUtils.getGeneric(parse, "iss", String.class));
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    case 4:
                        linkedHashMap.put("jti", (String) JSONObjectUtils.getGeneric(parse, "jti", String.class));
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    case 5:
                        linkedHashMap.put("nbf", JSONObjectUtils.getEpochSecondAsDate("nbf", parse));
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    case 6:
                        Object obj3 = parse.get("sub");
                        if (!(obj3 instanceof String)) {
                            if (!(obj3 instanceof Number)) {
                                if (obj3 != null) {
                                    JWK$$ExternalSyntheticBUOutline0.m$1("Illegal sub claim");
                                    break;
                                } else {
                                    obj = null;
                                    linkedHashMap.put("sub", null);
                                    it2 = it;
                                    str4 = str6;
                                }
                            } else {
                                linkedHashMap.put("sub", String.valueOf(obj3));
                            }
                        } else {
                            linkedHashMap.put("sub", (String) JSONObjectUtils.getGeneric(parse, "sub", String.class));
                        }
                        obj = null;
                        it2 = it;
                        str4 = str6;
                    default:
                        linkedHashMap.put(str5, parse.get(str5));
                        obj = null;
                        it2 = it;
                        str4 = str6;
                }
                return null;
            }
            String str7 = str4;
            new JWTClaimsSet(linkedHashMap);
            KeyPair generate = ((StripeEphemeralKeyPairGenerator) lazy.initializer).generate();
            StripeDiffieHellmanKeyGenerator stripeDiffieHellmanKeyGenerator = (StripeDiffieHellmanKeyGenerator) lazy.value;
            PrivateKey privateKey = generate.getPrivate();
            privateKey.getClass();
            SecretKey generate2 = stripeDiffieHellmanKeyGenerator.generate(eCPublicKey, (ECPrivateKey) privateKey, str2);
            Curve curve = Curve.P_256;
            PublicKey publicKey2 = generate.getPublic();
            publicKey2.getClass();
            ECPublicKey eCPublicKey2 = (ECPublicKey) publicKey2;
            Base64URL encodeCoordinate = ECKey.encodeCoordinate(eCPublicKey2.getParams().getCurve().getField().getFieldSize(), eCPublicKey2.getW().getAffineX());
            Base64URL encodeCoordinate2 = ECKey.encodeCoordinate(eCPublicKey2.getParams().getCurve().getField().getFieldSize(), eCPublicKey2.getW().getAffineY());
            Objects.requireNonNull(curve, "The curve must not be null");
            try {
                ECKey eCKey = new ECKey(curve, encodeCoordinate, encodeCoordinate2, null, null, null, null, null, null, null, null, null, null, null, null);
                JWEAlgorithm jWEAlgorithm2 = JWEAlgorithm.DIR;
                EncryptionMethod encryptionMethod2 = EncryptionMethod.A128CBC_HS256;
                if (jWEAlgorithm2.name.equals(Algorithm.NONE.name)) {
                    a$$ExternalSyntheticBUOutline0.m$3(str7);
                    return null;
                }
                Objects.requireNonNull(encryptionMethod2);
                JWEObject jWEObject2 = new JWEObject(new JWEHeader(jWEAlgorithm2, encryptionMethod2, null, null, null, null, null, null, null, null, null, null, ECKey.parse(JSONObjectUtils.parse(-1, JSONObjectUtils.toJSONString(eCKey.toJSONObject()))), null, null, null, null, 0, null, null, null, null, null, null, null, null), new Payload(str));
                jWEObject2.encrypt(new DirectEncrypter(generate2));
                failure = jWEObject2.serialize();
            } catch (IllegalArgumentException e) {
                a$$ExternalSyntheticBUOutline0.m(e.getMessage(), e);
                return null;
            }
        } else {
            Result.Companion companion3 = Result.Companion;
            failure = new Result.Failure(new SDKRuntimeException(Recorder$$ExternalSyntheticOutline2.m("Unsupported public key algorithm: ", publicKey.getAlgorithm()), null));
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            ((DefaultErrorReporter) this.scannerText).reportError(m4120exceptionOrNullimpl);
        }
        SafeTrace.throwOnFailure(failure);
        return (String) failure;
    }

    public boolean execute(ShareTarget shareTarget) {
        Activity activity = (Activity) this.textView;
        if (shareTarget instanceof ShareTarget.XApp) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", ((ShareTarget.XApp) shareTarget).content.cashtagUrl);
            intent.setPackage("com.twitter.android");
            activity.startActivity(intent);
            return true;
        }
        if (shareTarget instanceof ShareTarget.Instagram) {
            Uri uri = ((ShareTarget.Instagram) shareTarget).content.imageUri;
            if (uri != null) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("image/png");
                intent2.setPackage("com.instagram.android");
                intent2.addFlags(1);
                intent2.putExtra("android.intent.extra.STREAM", uri);
                activity.startActivity(intent2);
                return true;
            }
        } else {
            if (shareTarget instanceof ShareTarget.Sms) {
                ShareTarget.Sms sms = (ShareTarget.Sms) shareTarget;
                String str = sms.content.cashtagUrl;
                Intent intent3 = new Intent();
                intent3.setAction("android.intent.action.SEND");
                intent3.setType("text/plain");
                intent3.putExtra("android.intent.extra.TEXT", str);
                intent3.setPackage(sms.smsPackage);
                if (((AndroidPackageManager) this.scannerText).context.getPackageManager().resolveActivity(intent3, 0) != null) {
                    activity.startActivity(intent3);
                    return true;
                }
                startChooserActivity(str);
                return true;
            }
            if (shareTarget instanceof ShareTarget.CopyToClipboard) {
                ((RealClipboardManager) this.textSwitcher).copy("cashtag", ((ShareTarget.CopyToClipboard) shareTarget).content.cashtagUrl);
                return true;
            }
            if (shareTarget instanceof ShareTarget.SaveToPhotos) {
                Uri uri2 = ((ShareTarget.SaveToPhotos) shareTarget).content.imageUrl;
                if (uri2 != null) {
                    Intent intent4 = new Intent();
                    intent4.setAction("android.intent.action.SEND");
                    intent4.addFlags(1);
                    intent4.setType("image/png");
                    intent4.putExtra("android.intent.extra.STREAM", uri2);
                    activity.startActivity(Intent.createChooser(intent4, null));
                    return true;
                }
            } else if (shareTarget instanceof ShareTarget.More) {
                startChooserActivity(((ShareTarget.More) shareTarget).content.cashtagUrl);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3980execute0E7RQCE(ApiRequest apiRequest, KSerializer kSerializer, ContinuationImpl continuationImpl) {
        FinancialConnectionsLiteRequestExecutor$execute$1 financialConnectionsLiteRequestExecutor$execute$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsLiteRequestExecutor$execute$1) {
            financialConnectionsLiteRequestExecutor$execute$1 = (FinancialConnectionsLiteRequestExecutor$execute$1) continuationImpl;
            int i2 = financialConnectionsLiteRequestExecutor$execute$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsLiteRequestExecutor$execute$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsLiteRequestExecutor$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsLiteRequestExecutor$execute$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(22, this, kSerializer);
                financialConnectionsLiteRequestExecutor$execute$1.label = 1;
                Object m3981executeInternal0E7RQCE = m3981executeInternal0E7RQCE(apiRequest, heroCardViewKt$$ExternalSyntheticLambda0, financialConnectionsLiteRequestExecutor$execute$1);
                return m3981executeInternal0E7RQCE == obj2 ? obj2 : m3981executeInternal0E7RQCE;
            }
        }
        financialConnectionsLiteRequestExecutor$execute$1 = new FinancialConnectionsLiteRequestExecutor$execute$1(this, continuationImpl);
        Object obj3 = financialConnectionsLiteRequestExecutor$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsLiteRequestExecutor$execute$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:40|41))(3:42|43|(1:45))|12|13|(3:26|27|(2:29|(1:31)(2:32|33))(2:34|35))|15|(1:25)(3:17|18|19)))|48|6|7|(0)(0)|12|13|(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        r11 = kotlin.Result.Companion;
        r11 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: executeInternal-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3981executeInternal0E7RQCE(StripeRequest stripeRequest, HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        FinancialConnectionsLiteRequestExecutor$executeInternal$1 financialConnectionsLiteRequestExecutor$executeInternal$1;
        int i;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof FinancialConnectionsLiteRequestExecutor$executeInternal$1) {
            financialConnectionsLiteRequestExecutor$executeInternal$1 = (FinancialConnectionsLiteRequestExecutor$executeInternal$1) continuationImpl;
            int i2 = financialConnectionsLiteRequestExecutor$executeInternal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsLiteRequestExecutor$executeInternal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsLiteRequestExecutor$executeInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsLiteRequestExecutor$executeInternal$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Logger$Companion$NOOP_LOGGER$1) this.scannerText).debug("Executing " + stripeRequest.getMethod().code + " request to " + stripeRequest.getUrl());
                    Result.Companion companion = Result.Companion;
                    DefaultStripeNetworkClient defaultStripeNetworkClient = (DefaultStripeNetworkClient) this.textView;
                    financialConnectionsLiteRequestExecutor$executeInternal$1.L$0 = stripeRequest;
                    financialConnectionsLiteRequestExecutor$executeInternal$1.L$1 = heroCardViewKt$$ExternalSyntheticLambda0;
                    financialConnectionsLiteRequestExecutor$executeInternal$1.label = 1;
                    obj = defaultStripeNetworkClient.executeRequest(stripeRequest, financialConnectionsLiteRequestExecutor$executeInternal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    heroCardViewKt$$ExternalSyntheticLambda0 = financialConnectionsLiteRequestExecutor$executeInternal$1.L$1;
                    stripeRequest = financialConnectionsLiteRequestExecutor$executeInternal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                failure = (StripeResponse) obj;
                Result.Companion companion2 = Result.Companion;
                if (!(failure instanceof Result.Failure)) {
                    try {
                        StripeResponse stripeResponse = (StripeResponse) failure;
                        if (stripeResponse.isError) {
                            throw handleApiError(stripeResponse);
                        }
                        Object obj2 = stripeResponse.body;
                        if (obj2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Object obj3 = ((Result) heroCardViewKt$$ExternalSyntheticLambda0.invoke(obj2)).value;
                        SafeTrace.throwOnFailure(obj3);
                        failure = obj3;
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return failure;
                }
                try {
                    throw new APIConnectionException("Failed to execute " + stripeRequest, m4120exceptionOrNullimpl);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    return new Result.Failure(th2);
                }
            }
        }
        financialConnectionsLiteRequestExecutor$executeInternal$1 = new FinancialConnectionsLiteRequestExecutor$executeInternal$1(this, continuationImpl);
        Object obj4 = financialConnectionsLiteRequestExecutor$executeInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsLiteRequestExecutor$executeInternal$1.label;
        if (i != 0) {
        }
        failure = (StripeResponse) obj4;
        Result.Companion companion22 = Result.Companion;
        if (!(failure instanceof Result.Failure)) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
    }

    public void fireEvent(IntentConfirmationChallengeAnalyticsEvent intentConfirmationChallengeAnalyticsEvent) {
        ((DefaultAnalyticsRequestExecutor) this.textView).executeAsync(((PaymentAnalyticsRequestFactory) this.textSwitcher).createRequest(intentConfirmationChallengeAnalyticsEvent, intentConfirmationChallengeAnalyticsEvent.getParams()));
    }

    public SupportSearchService$DefaultNodes getDefaultNodes(List list) {
        list.getClass();
        RealArticlesService realArticlesService = (RealArticlesService) this.textSwitcher;
        List list2 = (List) realArticlesService.supportViewedArticlesStore.keyValue.blockingGet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Link link = (Link) realArticlesService.linkCache.get(((RecentlyViewedNode) it.next()).token);
            if (link != null) {
                arrayList.add(link);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Link) next).includeInRecentlyViewed) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Link link2 = (Link) it3.next();
            arrayList3.add(new SupportSearchService$SearchNode(link2.token, link2));
        }
        return new SupportSearchService$DefaultNodes(arrayList3);
    }

    public EmbeddedCardReader getEmbeddedCardReader() {
        return (EmbeddedCardReader) ((kotlin.Lazy) this.scannerText).getValue();
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        PermissionRequestFragment permissionRequestFragment = (PermissionRequestFragment) baseDaggerFragment;
        permissionRequestFragment.androidInjector = ((DaggerInquiryComponent$InquiryComponentImpl) this.textView).dispatchingAndroidInjector();
        permissionRequestFragment.viewModelFactory = (PermissionRequestViewModel_Factory_Impl) ((InstanceFactory) this.scannerText).instance;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, Set set, Boolean bool, ContinuationImpl continuationImpl) {
        SelectNetworkedAccounts$invoke$1 selectNetworkedAccounts$invoke$1;
        int i;
        Display display;
        TextUpdate textUpdate;
        SuccessPane successPane;
        if (continuationImpl instanceof SelectNetworkedAccounts$invoke$1) {
            selectNetworkedAccounts$invoke$1 = (SelectNetworkedAccounts$invoke$1) continuationImpl;
            int i2 = selectNetworkedAccounts$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectNetworkedAccounts$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = selectNetworkedAccounts$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectNetworkedAccounts$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) this.scannerText;
                    String str2 = ((FinancialConnectionsSheetConfiguration) this.textView).financialConnectionsSessionClientSecret;
                    selectNetworkedAccounts$invoke$1.label = 1;
                    ApiRequest.Factory factory = financialConnectionsAccountsRepositoryImpl.apiRequestFactory;
                    ApiRequest.Options invoke = financialConnectionsAccountsRepositoryImpl.provideApiRequestOptions.invoke(true);
                    MapBuilder filterNotNullValues = MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("client_secret", str2), new Pair("consumer_session_client_secret", str), new Pair("consent_acquired", bool)));
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                    int i3 = 0;
                    for (Object obj2 : set2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        arrayList.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "selected_accounts[", "]"), (String) obj2));
                        i3 = i4;
                    }
                    obj = financialConnectionsAccountsRepositoryImpl.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, "https://api.stripe.com/v1/link_account_sessions/share_networked_account", invoke, MapsKt__MapsKt.plus(filterNotNullValues, arrayList)), ShareNetworkedAccountsResponse.Companion.serializer(), selectNetworkedAccounts$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                display = ((ShareNetworkedAccountsResponse) obj).display;
                if (display != null && (textUpdate = display.text) != null && (successPane = textUpdate.successPane) != null) {
                    SuccessContentRepository successContentRepository = (SuccessContentRepository) this.textSwitcher;
                    TextResource.Text text = new TextResource.Text(successPane.caption);
                    TextResource.Text text2 = new TextResource.Text(successPane.subCaption);
                    successContentRepository.getClass();
                    ((SavedStateHandle) successContentRepository.zzd).set(new SuccessContentRepository.State(text2, text), (String) successContentRepository.zza);
                }
                return obj;
            }
        }
        selectNetworkedAccounts$invoke$1 = new SelectNetworkedAccounts$invoke$1(this, continuationImpl);
        Object obj3 = selectNetworkedAccounts$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectNetworkedAccounts$invoke$1.label;
        if (i != 0) {
        }
        display = ((ShareNetworkedAccountsResponse) obj3).display;
        if (display != null) {
            SuccessContentRepository successContentRepository2 = (SuccessContentRepository) this.textSwitcher;
            TextResource.Text text3 = new TextResource.Text(successPane.caption);
            TextResource.Text text22 = new TextResource.Text(successPane.subCaption);
            successContentRepository2.getClass();
            ((SavedStateHandle) successContentRepository2.zzd).set(new SuccessContentRepository.State(text22, text3), (String) successContentRepository2.zza);
        }
        return obj3;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        return ((OffsetMapping) this.textView).originalToTransformed(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (sendUpdate(r1, r4, r2) != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r4 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object perform(String str, String str2, int i, ContinuationImpl continuationImpl) {
        SilentNetworkAuthenticationOrchestrator$perform$1 silentNetworkAuthenticationOrchestrator$perform$1;
        int i2;
        String str3;
        Object m3982runSna0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        UpdateInquirySessionRequest updateInquirySessionRequest;
        if (continuationImpl instanceof SilentNetworkAuthenticationOrchestrator$perform$1) {
            silentNetworkAuthenticationOrchestrator$perform$1 = (SilentNetworkAuthenticationOrchestrator$perform$1) continuationImpl;
            int i3 = silentNetworkAuthenticationOrchestrator$perform$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                silentNetworkAuthenticationOrchestrator$perform$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = silentNetworkAuthenticationOrchestrator$perform$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = silentNetworkAuthenticationOrchestrator$perform$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str3 = str;
                    silentNetworkAuthenticationOrchestrator$perform$1.L$0 = str3;
                    silentNetworkAuthenticationOrchestrator$perform$1.label = 1;
                    m3982runSna0E7RQCE = m3982runSna0E7RQCE(i, str2, silentNetworkAuthenticationOrchestrator$perform$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = silentNetworkAuthenticationOrchestrator$perform$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m3982runSna0E7RQCE = ((Result) obj).value;
                    str3 = str4;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m3982runSna0E7RQCE);
                if (m4120exceptionOrNullimpl != null) {
                    SnaClient$Response$Error snaClient$Response$Error = (SnaClient$Response$Error) m3982runSna0E7RQCE;
                    if (!(snaClient$Response$Error instanceof SnaClient$Response$Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    updateInquirySessionRequest = new UpdateInquirySessionRequest(new UpdateInquirySessionRequest.Data(new UpdateInquirySessionRequest.Attributes(null, null, null, null, null, snaClient$Response$Error.errorName, snaClient$Response$Error.errorMessage, 15, null)));
                } else {
                    updateInquirySessionRequest = new UpdateInquirySessionRequest(new UpdateInquirySessionRequest.Data(new UpdateInquirySessionRequest.Attributes(null, null, null, null, null, "sdk_error", m4120exceptionOrNullimpl.getClass().getSimpleName(), 15, null)));
                }
                silentNetworkAuthenticationOrchestrator$perform$1.L$0 = null;
                silentNetworkAuthenticationOrchestrator$perform$1.label = 2;
            }
        }
        silentNetworkAuthenticationOrchestrator$perform$1 = new SilentNetworkAuthenticationOrchestrator$perform$1(this, continuationImpl);
        Object obj3 = silentNetworkAuthenticationOrchestrator$perform$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = silentNetworkAuthenticationOrchestrator$perform$1.label;
        if (i2 != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m3982runSna0E7RQCE);
        if (m4120exceptionOrNullimpl != null) {
        }
        silentNetworkAuthenticationOrchestrator$perform$1.L$0 = null;
        silentNetworkAuthenticationOrchestrator$perform$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: runSna-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3982runSna0E7RQCE(int i, String str, ContinuationImpl continuationImpl) {
        SilentNetworkAuthenticationOrchestrator$runSna$1 silentNetworkAuthenticationOrchestrator$runSna$1;
        int i2;
        Class<?> cls;
        try {
            try {
                if (continuationImpl instanceof SilentNetworkAuthenticationOrchestrator$runSna$1) {
                    silentNetworkAuthenticationOrchestrator$runSna$1 = (SilentNetworkAuthenticationOrchestrator$runSna$1) continuationImpl;
                    int i3 = silentNetworkAuthenticationOrchestrator$runSna$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        silentNetworkAuthenticationOrchestrator$runSna$1.label = i3 - PKIFailureInfo.systemUnavail;
                        Object obj = silentNetworkAuthenticationOrchestrator$runSna$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = silentNetworkAuthenticationOrchestrator$runSna$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj);
                            POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) this.textSwitcher;
                            Context context = (Context) this.textView;
                            str.getClass();
                            pOPMatchingFactory.getClass();
                            context.getClass();
                            try {
                                try {
                                    cls = Class.forName("com.withpersona.sdk2.inquiry.sna.impl.VonageSnaClientFactory");
                                } catch (ClassNotFoundException unused) {
                                    cls = null;
                                }
                                if (cls != null) {
                                    Object newInstance = cls.newInstance();
                                    newInstance.getClass();
                                    Recorder$$ExternalSyntheticOutline1.m(newInstance);
                                    throw null;
                                }
                            } catch (Exception unused2) {
                            }
                            SilentNetworkAuthWorker silentNetworkAuthWorker = new SilentNetworkAuthWorker(i);
                            Result.Companion companion = Result.Companion;
                            Flow work = silentNetworkAuthWorker.getWork();
                            silentNetworkAuthenticationOrchestrator$runSna$1.label = 1;
                            obj = FlowKt.first(work, silentNetworkAuthenticationOrchestrator$runSna$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        Result.Companion companion2 = Result.Companion;
                        return obj;
                    }
                }
                if (i2 != 0) {
                }
                Result.Companion companion22 = Result.Companion;
                return obj;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            return new Result.Failure(th);
        }
        silentNetworkAuthenticationOrchestrator$runSna$1 = new SilentNetworkAuthenticationOrchestrator$runSna$1(this, continuationImpl);
        Object obj2 = silentNetworkAuthenticationOrchestrator$runSna$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = silentNetworkAuthenticationOrchestrator$runSna$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object search(String str, String str2, ContinuationImpl continuationImpl) {
        NewSupportSearchService$search$1 newSupportSearchService$search$1;
        int i;
        ApiResult apiResult;
        LruCache lruCache = (LruCache) this.scannerText;
        if (continuationImpl instanceof NewSupportSearchService$search$1) {
            newSupportSearchService$search$1 = (NewSupportSearchService$search$1) continuationImpl;
            int i2 = newSupportSearchService$search$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                newSupportSearchService$search$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = newSupportSearchService$search$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = newSupportSearchService$search$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) lruCache.get(str2);
                    if (list != null) {
                        return new SupportSearchService$Result.Success(list);
                    }
                    AppSupportArticleService appSupportArticleService = (AppSupportArticleService) this.textView;
                    SearchSupportArticlesRequest searchSupportArticlesRequest = new SearchSupportArticlesRequest(str2, ByteString.EMPTY);
                    newSupportSearchService$search$1.L$1 = str2;
                    newSupportSearchService$search$1.label = 1;
                    obj = appSupportArticleService.searchSupportArticles(str, searchSupportArticlesRequest, newSupportSearchService$search$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = newSupportSearchService$search$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return SupportSearchService$Result.Failed.INSTANCE;
                }
                List<SupportLink> list2 = ((SearchSupportArticlesResponse) ((ApiResult.Success) apiResult).response).links;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (SupportLink supportLink : list2) {
                    String str3 = supportLink.link_token;
                    str3.getClass();
                    Link link = SizeModifiersKt.toLink(supportLink);
                    link.getClass();
                    arrayList.add(new SupportSearchService$SearchNode(str3, link));
                }
                lruCache.put(str2, arrayList);
                return new SupportSearchService$Result.Success(arrayList);
            }
        }
        newSupportSearchService$search$1 = new NewSupportSearchService$search$1(this, continuationImpl);
        Object obj2 = newSupportSearchService$search$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = newSupportSearchService$search$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendUpdate(String str, UpdateInquirySessionRequest updateInquirySessionRequest, ContinuationImpl continuationImpl) {
        SilentNetworkAuthenticationOrchestrator$sendUpdate$1 silentNetworkAuthenticationOrchestrator$sendUpdate$1;
        int i;
        if (continuationImpl instanceof SilentNetworkAuthenticationOrchestrator$sendUpdate$1) {
            silentNetworkAuthenticationOrchestrator$sendUpdate$1 = (SilentNetworkAuthenticationOrchestrator$sendUpdate$1) continuationImpl;
            int i2 = silentNetworkAuthenticationOrchestrator$sendUpdate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                silentNetworkAuthenticationOrchestrator$sendUpdate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = silentNetworkAuthenticationOrchestrator$sendUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = silentNetworkAuthenticationOrchestrator$sendUpdate$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InquiryService inquiryService = (InquiryService) this.scannerText;
                    silentNetworkAuthenticationOrchestrator$sendUpdate$1.label = 1;
                    if (inquiryService.updateInquiry(str, updateInquirySessionRequest, silentNetworkAuthenticationOrchestrator$sendUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        silentNetworkAuthenticationOrchestrator$sendUpdate$1 = new SilentNetworkAuthenticationOrchestrator$sendUpdate$1(this, continuationImpl);
        Object obj2 = silentNetworkAuthenticationOrchestrator$sendUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = silentNetworkAuthenticationOrchestrator$sendUpdate$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public void setText(CharSequence charSequence, boolean z, boolean z2) {
        TextView textView = (TextView) this.textView;
        if (textView != null) {
            textView.setText(charSequence);
            return;
        }
        TextSwitcher textSwitcher = (TextSwitcher) this.textSwitcher;
        if (textSwitcher != null) {
            if (z2) {
                textSwitcher.setText(charSequence);
                return;
            } else {
                textSwitcher.setCurrentText(charSequence);
                return;
            }
        }
        ScannerTextSwapper scannerTextSwapper = (ScannerTextSwapper) this.scannerText;
        if (z2) {
            scannerTextSwapper.getClass();
            scannerTextSwapper.setText(charSequence, z);
        } else {
            scannerTextSwapper.getClass();
            scannerTextSwapper.setCurrentText(charSequence);
        }
    }

    public boolean shouldRetry(HCaptchaException hCaptchaException) {
        hCaptchaException.getClass();
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) this.textView;
        Function2 function2 = hCaptchaConfig.retryPredicate;
        if (function2 != null) {
            return ((Boolean) function2.invoke(hCaptchaConfig, hCaptchaException)).booleanValue();
        }
        return false;
    }

    public void startChooserActivity(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        ((Activity) this.textView).startActivity(Intent.createChooser(intent, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: stop-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable m3983stopIoAF18A(ContinuationImpl continuationImpl) {
        RecordingHelper$stop$1 recordingHelper$stop$1;
        int i;
        TextSetter textSetter;
        File file;
        FinalizeRecordingError finalizeRecordingError;
        if (continuationImpl instanceof RecordingHelper$stop$1) {
            recordingHelper$stop$1 = (RecordingHelper$stop$1) continuationImpl;
            int i2 = recordingHelper$stop$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                recordingHelper$stop$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = recordingHelper$stop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recordingHelper$stop$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextSetter textSetter2 = (TextSetter) this.scannerText;
                    if (textSetter2 == null) {
                        Result.Companion companion = Result.Companion;
                        return new Result.Failure(new NoActiveRecordingError());
                    }
                    File file2 = (File) textSetter2.textSwitcher;
                    ((Recording) textSetter2.textView).close();
                    FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1((StateFlowImpl) this.textSwitcher, new RealSheetState$peek$3.AnonymousClass2(2, continuation, 15), 0);
                    recordingHelper$stop$1.L$0 = textSetter2;
                    recordingHelper$stop$1.L$1 = file2;
                    recordingHelper$stop$1.label = 1;
                    if (FlowKt.collect(flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1, recordingHelper$stop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    textSetter = textSetter2;
                    file = file2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    file = recordingHelper$stop$1.L$1;
                    textSetter = recordingHelper$stop$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                finalizeRecordingError = (FinalizeRecordingError) textSetter.scannerText;
                if (finalizeRecordingError == null) {
                    Result.Companion companion2 = Result.Companion;
                    return new Result.Failure(finalizeRecordingError);
                }
                Result.Companion companion3 = Result.Companion;
                return file;
            }
        }
        recordingHelper$stop$1 = new RecordingHelper$stop$1(this, continuationImpl);
        Object obj2 = recordingHelper$stop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recordingHelper$stop$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        finalizeRecordingError = (FinalizeRecordingError) textSetter.scannerText;
        if (finalizeRecordingError == null) {
        }
    }

    public StripeApiRepository stripeApiRepository() {
        Application application = (Application) this.textSwitcher;
        CollectBankAccountContract.Args args = (CollectBankAccountContract.Args) this.textView;
        int i = 19;
        HCaptcha$$ExternalSyntheticLambda0 hCaptcha$$ExternalSyntheticLambda0 = new HCaptcha$$ExternalSyntheticLambda0(args, i);
        RequestSurface requestSurface = RequestSurface.PaymentElement;
        LinkResolverDef linkResolverDef = (LinkResolverDef) this.scannerText;
        CoroutineContext provideWorkContext = CameraPreview_Factory.provideWorkContext(linkResolverDef);
        EmptySet emptySet = EmptySet.INSTANCE;
        Preconditions.checkNotNullFromProvides(emptySet);
        HCaptcha$$ExternalSyntheticLambda0 hCaptcha$$ExternalSyntheticLambda02 = new HCaptcha$$ExternalSyntheticLambda0(args, i);
        Preconditions.checkNotNullFromProvides(emptySet);
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(application, hCaptcha$$ExternalSyntheticLambda02, emptySet);
        CoroutineContext provideWorkContext2 = CameraPreview_Factory.provideWorkContext(linkResolverDef);
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Logger$Companion.NOOP_LOGGER;
        return new StripeApiRepository(application, hCaptcha$$ExternalSyntheticLambda0, requestSurface, provideWorkContext, emptySet, paymentAnalyticsRequestFactory, new DefaultAnalyticsRequestExecutor(logger$Companion$NOOP_LOGGER$1, provideWorkContext2), logger$Companion$NOOP_LOGGER$1);
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        TransformedText transformedText = (TransformedText) this.textSwitcher;
        return i <= transformedText.text.text.length() ? transformedText.offsetMapping.transformedToOriginal(i) : ((AnnotatedString) this.scannerText).text.length();
    }

    public TextSetter(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, DurationProvider durationProvider) {
        durationProvider.getClass();
        this.textView = defaultAnalyticsRequestExecutor;
        this.textSwitcher = paymentAnalyticsRequestFactory;
        this.scannerText = durationProvider;
    }

    public TextSetter(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SuccessContentRepository successContentRepository, FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl) {
        financialConnectionsSheetConfiguration.getClass();
        successContentRepository.getClass();
        financialConnectionsAccountsRepositoryImpl.getClass();
        this.textView = financialConnectionsSheetConfiguration;
        this.textSwitcher = successContentRepository;
        this.scannerText = financialConnectionsAccountsRepositoryImpl;
    }

    public TextSetter(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str) {
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        str.getClass();
        this.textView = financialConnectionsManifestRepositoryImpl;
        this.textSwitcher = financialConnectionsSheetConfiguration;
        this.scannerText = str;
    }

    public TextSetter(TextView textView, TextSwitcher textSwitcher, ScannerTextSwapper scannerTextSwapper, int i) {
        textView = (i & 1) != 0 ? null : textView;
        textSwitcher = (i & 2) != 0 ? null : textSwitcher;
        scannerTextSwapper = (i & 4) != 0 ? null : scannerTextSwapper;
        this.textView = textView;
        this.textSwitcher = textSwitcher;
        this.scannerText = scannerTextSwapper;
        if (CollectionsKt.filterNotNull(CollectionsKt__CollectionsKt.listOf(textView, textSwitcher, scannerTextSwapper)).size() == 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("One of (textView, textSwitcher, scannerText) must be non-null");
        throw null;
    }

    public TextSetter(FallbackMode fallbackMode, Environment environment, SavedStateHandle savedStateHandle) {
        fallbackMode.getClass();
        savedStateHandle.getClass();
        this.textView = fallbackMode;
        this.textSwitcher = environment;
        this.scannerText = savedStateHandle;
    }

    public TextSetter(Context context, POPMatchingFactory pOPMatchingFactory, InquiryService inquiryService) {
        context.getClass();
        pOPMatchingFactory.getClass();
        inquiryService.getClass();
        this.textView = context;
        this.textSwitcher = pOPMatchingFactory;
        this.scannerText = inquiryService;
    }

    public TextSetter(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        financialConnectionsManifestRepositoryImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.textView = financialConnectionsManifestRepositoryImpl;
        this.textSwitcher = logger$Companion$NOOP_LOGGER$1;
        this.scannerText = financialConnectionsSheetConfiguration;
    }

    public TextSetter(AppSupportArticleService appSupportArticleService, RealArticlesService realArticlesService) {
        this.textView = appSupportArticleService;
        this.textSwitcher = realArticlesService;
        this.scannerText = new LruCache(64);
    }

    public TextSetter(String str, DefaultErrorReporter defaultErrorReporter, CoroutineContext coroutineContext) {
        str.getClass();
        defaultErrorReporter.getClass();
        coroutineContext.getClass();
        this.textView = str;
        this.textSwitcher = defaultErrorReporter;
        this.scannerText = coroutineContext;
    }

    public TextSetter(DefaultStripeNetworkClient defaultStripeNetworkClient, Json json, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        json.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.textView = defaultStripeNetworkClient;
        this.textSwitcher = json;
        this.scannerText = logger$Companion$NOOP_LOGGER$1;
    }

    public TextSetter(DefaultErrorReporter defaultErrorReporter, CoroutineContext coroutineContext) {
        defaultErrorReporter.getClass();
        coroutineContext.getClass();
        ImageCache$Default imageCache$Default = ImageCache$Default.INSTANCE;
        ImageRepository$ImageSupplier$Default imageRepository$ImageSupplier$Default = new ImageRepository$ImageSupplier$Default(defaultErrorReporter, coroutineContext, 0);
        this.textView = coroutineContext;
        this.textSwitcher = imageCache$Default;
        this.scannerText = imageRepository$ImageSupplier$Default;
    }

    public TextSetter(Context context, Recorder recorder, SdkFilesManager sdkFilesManager, boolean z) {
        context.getClass();
        recorder.getClass();
        sdkFilesManager.getClass();
        Executor mainExecutor = context.getMainExecutor();
        mainExecutor.getClass();
        this.textView = mainExecutor;
        this.textSwitcher = FlowKt.MutableStateFlow(RecordingHelper$RecordingState.NotStarted);
    }

    public /* synthetic */ TextSetter(Object obj, Object obj2, Object obj3) {
        this.textView = obj;
        this.textSwitcher = obj2;
        this.scannerText = obj3;
    }

    public TextSetter(StripeEphemeralKeyPairGenerator stripeEphemeralKeyPairGenerator, DefaultErrorReporter defaultErrorReporter) {
        y0 y0Var = new y0();
        Lazy lazy = new Lazy(stripeEphemeralKeyPairGenerator, defaultErrorReporter);
        this.textView = y0Var;
        this.textSwitcher = lazy;
        this.scannerText = defaultErrorReporter;
    }

    public TextSetter(SandboxFlags sandboxFlags) {
        sandboxFlags.getClass();
        this.textView = sandboxFlags;
    }

    public TextSetter(AndroidAccessibilityManager androidAccessibilityManager, AndroidStringManager androidStringManager, RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl) {
        this.textView = androidAccessibilityManager;
        this.textSwitcher = androidStringManager;
        Locale locale = Locale.getDefault();
        locale.getClass();
        this.scannerText = realTimestampFormatter$Factory$Impl.create$1(locale, TimestampFormatter$DisplayContext.STANDALONE);
    }

    public TextSetter(TransformedText transformedText, AnnotatedString annotatedString) {
        this.textSwitcher = transformedText;
        this.scannerText = annotatedString;
        this.textView = transformedText.offsetMapping;
    }

    public TextSetter(Activity activity, String str, AssetPublicSuffixList assetPublicSuffixList) {
        this.textView = str;
        this.textSwitcher = assetPublicSuffixList;
        this.scannerText = LazyKt.lazy(new TaxWebAppBridge$$ExternalSyntheticLambda0(17, activity, this));
    }

    public TextSetter(DocumentService documentService, FallbackModeManager fallbackModeManager, DataCollector dataCollector) {
        documentService.getClass();
        fallbackModeManager.getClass();
        dataCollector.getClass();
        this.textView = documentService;
        this.textSwitcher = fallbackModeManager;
        this.scannerText = dataCollector;
    }

    public TextSetter(LinkResolverDef linkResolverDef, y0 y0Var, Plane plane, Application application, SharedFlowImpl sharedFlowImpl, SavedStateHandle savedStateHandle, CollectBankAccountContract.Args args) {
        this.textView = args;
        this.textSwitcher = application;
        this.scannerText = linkResolverDef;
    }

    public TextSetter(Recording recording, File file) {
        this.textView = recording;
        this.textSwitcher = file;
    }

    public TextSetter(String str, LazyPagingItems lazyPagingItems, LazyPagingItems lazyPagingItems2) {
        str.getClass();
        lazyPagingItems.getClass();
        lazyPagingItems2.getClass();
        this.textView = str;
        this.textSwitcher = lazyPagingItems;
        this.scannerText = lazyPagingItems2;
    }

    public TextSetter(DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl) {
        this.textView = daggerInquiryComponent$InquiryComponentImpl;
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory = daggerInquiryComponent$InquiryComponentImpl.contextProvider;
        this.textSwitcher = new DocumentCameraWorker_Factory(inquiryActivityModule_ContextFactory, daggerInquiryComponent$InquiryComponentImpl.requestPermissionResultLauncherProvider, daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider, 19);
        this.scannerText = InstanceFactory.create(new PermissionRequestViewModel_Factory_Impl(new DocumentStepViewModel_Factory(InstanceFactory.create(new PermissionRequestStateManager_Factory_Impl(new MetadataRepo(daggerInquiryComponent$InquiryComponentImpl.contextProvider, (DocumentCameraWorker_Factory) this.textSwitcher, InstanceFactory.create(new DeviceFeatureRequestWorker_Factory_Impl(new DeviceFeatureRequestWorker_Factory(daggerInquiryComponent$InquiryComponentImpl.resolvableApiLauncherProvider, inquiryActivityModule_ContextFactory))), daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider))))));
    }

    public void invoke(String str, AuthSessionEvent authSessionEvent) {
        str.getClass();
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(authSessionEvent);
        listOf.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(GlobalScope.INSTANCE, DefaultIoScheduler.INSTANCE, null, new TakeUntil$collectSafely$2(this, str, listOf, (Continuation) null, 28), 2);
    }
}
