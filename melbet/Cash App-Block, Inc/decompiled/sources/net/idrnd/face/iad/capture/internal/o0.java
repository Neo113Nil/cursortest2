package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.maps.zzai;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.jakewharton.disklrucache.DiskLruCache;
import com.jakewharton.disklrucache.Util;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.jwk.ECParameterTable;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.internal.RealGrpcServerStreamingCall$executeIn$1;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.frauddetection.FraudDetectionDataRequest;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken$invoke$1;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.VerificationMethodParam;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forDeferredIntent$1;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forPaymentIntent$1;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.AcsData;
import com.stripe.android.uicore.image.ImageLruDiskCache$WhenMappings;
import com.stripe.android.uicore.image.LoadedImage;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.launchers.ReusableActivityResultLauncher;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.Converter;

/* loaded from: classes9.dex */
public final class o0 implements CardAccountRangeSource, CameraController, OnSuccessListener, ListUpdateCallback, DFS.Neighbors, Callback, Converter {
    public final /* synthetic */ int $r8$classId;
    public Object a;

    public o0(Context context, int i) {
        Object failure;
        String bigDecimal;
        this.$r8$classId = i;
        switch (i) {
            case 10:
                context.getClass();
                this.a = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(this, context));
                break;
            default:
                context.getClass();
                context.getClass();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                displayMetrics.getClass();
                String packageName = context.getPackageName();
                packageName = packageName == null ? "" : packageName;
                try {
                    Result.Companion companion = Result.Companion;
                    failure = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                PackageInfo packageInfo = (PackageInfo) (failure instanceof Result.Failure ? null : failure);
                String str = packageInfo != null ? packageInfo.versionName : null;
                int rawOffset = (int) (TimeZone.getDefault().getRawOffset() / 60000);
                if (rawOffset % 60 == 0) {
                    bigDecimal = String.valueOf(rawOffset / 60);
                } else {
                    bigDecimal = new BigDecimal(rawOffset).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
                    bigDecimal.getClass();
                }
                bigDecimal.getClass();
                MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration();
                markwonConfiguration.theme = packageName;
                markwonConfiguration.syntaxHighlight = str;
                markwonConfiguration.linkResolver = bigDecimal;
                markwonConfiguration.imageDestinationProcessor = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
                String str2 = Build.VERSION.RELEASE;
                String str3 = Build.VERSION.CODENAME;
                int i2 = Build.VERSION.SDK_INT;
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Android ", str2, " ", str3, " ");
                m.append(i2);
                markwonConfiguration.spansFactory = m.toString();
                this.a = markwonConfiguration;
                break;
        }
    }

    public static ECPublicKey parsePublicKey(Object obj) {
        ECKey parse;
        if (obj instanceof Map) {
            parse = ECKey.parse((Map) obj);
        } else {
            String obj2 = obj != null ? obj.toString() : null;
            if (obj2 == null) {
                obj2 = "";
            }
            Set set = ECKey.SUPPORTED_CURVES;
            parse = ECKey.parse(JSONObjectUtils.parse(-1, obj2));
        }
        Curve curve = parse.crv;
        curve.getClass();
        ECParameterSpec eCParameterSpec = ECParameterTable.get(curve);
        if (eCParameterSpec == null) {
            JWK$$ExternalSyntheticBUOutline0.m$2(curve, "Couldn't get EC parameter spec for curve ");
            return null;
        }
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(parse.x.decodeToBigInteger(), parse.y.decodeToBigInteger()), eCParameterSpec));
            eCPublicKey.getClass();
            return eCPublicKey;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static CreateFinancialConnectionsSessionParams toCreateSessionParams(CollectBankAccountConfiguration collectBankAccountConfiguration, String str, String str2) {
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.USBankAccount) {
            CollectBankAccountConfiguration.USBankAccount uSBankAccount = (CollectBankAccountConfiguration.USBankAccount) collectBankAccountConfiguration;
            return new CreateFinancialConnectionsSessionParams.USBankAccount(str, uSBankAccount.name, uSBankAccount.email, str2, null);
        }
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.USBankAccountInternal) {
            CollectBankAccountConfiguration.USBankAccountInternal uSBankAccountInternal = (CollectBankAccountConfiguration.USBankAccountInternal) collectBankAccountConfiguration;
            String str3 = uSBankAccountInternal.name;
            String str4 = uSBankAccountInternal.email;
            ElementsSessionContext elementsSessionContext = uSBankAccountInternal.elementsSessionContext;
            return new CreateFinancialConnectionsSessionParams.USBankAccount(str, str3, str4, str2, elementsSessionContext != null ? elementsSessionContext.linkMode : null);
        }
        if (!(collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.InstantDebits)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        CollectBankAccountConfiguration.InstantDebits instantDebits = (CollectBankAccountConfiguration.InstantDebits) collectBankAccountConfiguration;
        String str5 = instantDebits.email;
        ElementsSessionContext elementsSessionContext2 = instantDebits.elementsSessionContext;
        return new CreateFinancialConnectionsSessionParams.InstantDebits(str, str5, str2, elementsSessionContext2 != null ? elementsSessionContext2.linkMode : null);
    }

    public static boolean writeImageToFile(LoadedImage loadedImage, Response response, LoadedImage.ContentType contentType) {
        BufferedOutputStream bufferedOutputStream;
        OutputStreamWriter outputStreamWriter;
        BufferedOutputStream bufferedOutputStream2 = null;
        Bitmap.CompressFormat compressFormat = null;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(response.newOutputStream(0), PKIFailureInfo.certRevoked);
        } catch (Throwable th) {
            th = th;
        }
        try {
            String value = loadedImage.contentType.getValue();
            try {
                outputStreamWriter = new OutputStreamWriter(response.newOutputStream(1), Util.UTF_8);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                outputStreamWriter.write(value);
                Util.closeQuietly(outputStreamWriter);
                if (contentType == LoadedImage.ContentType.Known.Jpeg) {
                    compressFormat = Bitmap.CompressFormat.JPEG;
                } else if (contentType == LoadedImage.ContentType.Known.Png) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } else if (contentType == LoadedImage.ContentType.Known.Webp) {
                    compressFormat = Bitmap.CompressFormat.WEBP;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unexpected image type: ", contentType.getValue()));
                }
                Bitmap bitmap = loadedImage.bitmap;
                int i = ImageLruDiskCache$WhenMappings.$EnumSwitchMapping$0[compressFormat.ordinal()];
                int i2 = 80;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 100;
                    } else if (i != 3) {
                        throw new IllegalArgumentException("Unexpected compress format: " + compressFormat);
                    }
                }
                boolean compress = bitmap.compress(compressFormat, i2, bufferedOutputStream);
                bufferedOutputStream.close();
                return compress;
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter2 = outputStreamWriter;
                Util.closeQuietly(outputStreamWriter2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }

    public ArrayList a(f3 f3Var, int i, int i2) {
        if (i2 < 0 || i2 >= 101) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        System.currentTimeMillis();
        int i3 = f3Var.b;
        int i4 = f3Var.c;
        int i5 = i / 2;
        int i6 = i3 / 2;
        int i7 = i3 - i5;
        int i8 = i4 / 2;
        int i9 = i4 - i5;
        i2 c = j2.c();
        c.a$1(i6);
        c.b$1(i5);
        Pair pair = new Pair(n1.CENTER_TOP, c);
        i2 c2 = j2.c();
        c2.a$1(i6);
        c2.b$1(i8);
        Pair pair2 = new Pair(n1.CENTER_CENTER, c2);
        i2 c3 = j2.c();
        c3.a$1(i6);
        c3.b$1(i9);
        Pair pair3 = new Pair(n1.CENTER_BOTTOM, c3);
        i2 c4 = j2.c();
        c4.a$1(i5);
        c4.b$1(i5);
        Pair pair4 = new Pair(n1.LEFT_TOP, c4);
        i2 c5 = j2.c();
        c5.a$1(i5);
        c5.b$1(i8);
        Pair pair5 = new Pair(n1.LEFT_CENTER, c5);
        i2 c6 = j2.c();
        c6.a$1(i5);
        c6.b$1(i9);
        Pair pair6 = new Pair(n1.LEFT_BOTTOM, c6);
        i2 c7 = j2.c();
        c7.a$1(i7);
        c7.b$1(i5);
        Pair pair7 = new Pair(n1.RIGHT_TOP, c7);
        i2 c8 = j2.c();
        c8.a$1(i7);
        c8.b$1(i8);
        Pair pair8 = new Pair(n1.RIGHT_CENTER, c8);
        i2 c9 = j2.c();
        c9.a$1(i7);
        c9.b$1(i9);
        Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(n1.RIGHT_BOTTOM, c9));
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapOf.size()));
        for (Map.Entry entry : mapOf.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            GeneratedMessageLite build = ((i2) value).build();
            build.getClass();
            j2 j2Var = (j2) build;
            linkedHashMap.put(key, new Rect(j2Var.a() - i5, j2Var.b() - i5, j2Var.a() + i5, j2Var.b() + i5));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            n1 n1Var = (n1) entry2.getKey();
            Rect rect = (Rect) entry2.getValue();
            byte[] a = ((p0) this.a).a(f3Var, i2, rect);
            u1 a2 = v1.a();
            a2.a$1(ByteStringsKt.toByteString(a));
            m2 a3 = n2.a();
            a3.b$2(i);
            a3.a$2(i);
            a2.a(a3);
            i2 c10 = j2.c();
            c10.a$1(rect.left);
            c10.b$1(rect.top);
            a2.a(c10);
            a2.a(n1Var);
            arrayList.add((v1) a2.build());
        }
        System.currentTimeMillis();
        return arrayList;
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        return Optional.ofNullable(((Converter) this.a).convert((ResponseBody) obj));
    }

    public FraudDetectionDataRequest create(FraudDetectionData fraudDetectionData) {
        MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.a;
        markwonConfiguration.getClass();
        Pair pair = new Pair("v2", 1);
        Pair pair2 = new Pair("tag", "23.9.1");
        Pair pair3 = new Pair("src", "android-sdk");
        String locale = Locale.getDefault().toString();
        locale.getClass();
        Pair pair4 = new Pair("a", MapsKt__MapsKt.mapOf(new Pair("c", Thread$State$EnumUnboxingLocalUtility.m("v", locale)), new Pair("d", Thread$State$EnumUnboxingLocalUtility.m("v", (String) markwonConfiguration.spansFactory)), new Pair("f", Thread$State$EnumUnboxingLocalUtility.m("v", (String) markwonConfiguration.imageDestinationProcessor)), new Pair("g", Thread$State$EnumUnboxingLocalUtility.m("v", (String) markwonConfiguration.linkResolver))));
        String str = fraudDetectionData != null ? fraudDetectionData.muid : null;
        if (str == null) {
            str = "";
        }
        Pair pair5 = new Pair("d", str);
        String str2 = fraudDetectionData != null ? fraudDetectionData.sid : null;
        if (str2 == null) {
            str2 = "";
        }
        Map mapOf = MapsKt__MapsKt.mapOf(pair5, new Pair("e", str2), new Pair("k", (String) markwonConfiguration.theme), new Pair("o", Build.VERSION.RELEASE), new Pair("p", Integer.valueOf(Build.VERSION.SDK_INT)), new Pair("q", Build.MANUFACTURER), new Pair("r", Build.BRAND), new Pair("s", Build.MODEL), new Pair("t", Build.TAGS));
        String str3 = (String) markwonConfiguration.syntaxHighlight;
        Map m = str3 != null ? Thread$State$EnumUnboxingLocalUtility.m("l", str3) : null;
        if (m == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        }
        Map mapOf2 = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, new Pair("b", MapsKt__MapsKt.plus(mapOf, m)));
        String str4 = fraudDetectionData != null ? fraudDetectionData.guid : null;
        return new FraudDetectionDataRequest(mapOf2, str4 == null ? "" : str4);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void destroy() {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void enableTorch(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object executeIn(CoroutineScope coroutineScope, AndroidMessage androidMessage, ContinuationImpl continuationImpl) {
        RealGrpcServerStreamingCall$executeIn$1 realGrpcServerStreamingCall$executeIn$1;
        int i;
        ReceiveChannel receiveChannel;
        try {
            if (continuationImpl instanceof RealGrpcServerStreamingCall$executeIn$1) {
                realGrpcServerStreamingCall$executeIn$1 = (RealGrpcServerStreamingCall$executeIn$1) continuationImpl;
                int i2 = realGrpcServerStreamingCall$executeIn$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realGrpcServerStreamingCall$executeIn$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realGrpcServerStreamingCall$executeIn$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realGrpcServerStreamingCall$executeIn$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Pair executeIn = ((RealGrpcStreamingCall) this.a).executeIn(coroutineScope);
                        SendChannel sendChannel = (SendChannel) executeIn.first;
                        receiveChannel = (ReceiveChannel) executeIn.second;
                        realGrpcServerStreamingCall$executeIn$1.L$0 = sendChannel;
                        realGrpcServerStreamingCall$executeIn$1.L$1 = receiveChannel;
                        realGrpcServerStreamingCall$executeIn$1.label = 1;
                        Object send = sendChannel.send(androidMessage, realGrpcServerStreamingCall$executeIn$1);
                        coroutineScope = sendChannel;
                        if (send == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        receiveChannel = realGrpcServerStreamingCall$executeIn$1.L$1;
                        SendChannel sendChannel2 = realGrpcServerStreamingCall$executeIn$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = sendChannel2;
                    }
                    return receiveChannel;
                }
            }
            if (i != 0) {
            }
            return receiveChannel;
        } finally {
            coroutineScope.close(null);
        }
        realGrpcServerStreamingCall$executeIn$1 = new RealGrpcServerStreamingCall$executeIn$1(this, continuationImpl);
        Object obj2 = realGrpcServerStreamingCall$executeIn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGrpcServerStreamingCall$executeIn$1.label;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void focus() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: forDeferredIntent-5p_uFSQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m4265forDeferredIntent5p_uFSQ(String str, String str2, String str3, String str4, String str5, String str6, LinkMode linkMode, Integer num, String str7, String str8, ContinuationImpl continuationImpl) {
        CreateFinancialConnectionsSession$forDeferredIntent$1 createFinancialConnectionsSession$forDeferredIntent$1;
        int i;
        if (continuationImpl instanceof CreateFinancialConnectionsSession$forDeferredIntent$1) {
            createFinancialConnectionsSession$forDeferredIntent$1 = (CreateFinancialConnectionsSession$forDeferredIntent$1) continuationImpl;
            int i2 = createFinancialConnectionsSession$forDeferredIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                createFinancialConnectionsSession$forDeferredIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = createFinancialConnectionsSession$forDeferredIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createFinancialConnectionsSession$forDeferredIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StripeApiRepository stripeApiRepository = (StripeApiRepository) this.a;
                VerificationMethodParam verificationMethodParam = VerificationMethodParam.Automatic;
                CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = new CreateFinancialConnectionsSessionForDeferredPaymentParams(str3, str6, str4, str5, linkMode, str8, num, str7);
                ApiRequest.Options options = new ApiRequest.Options(str, str2, 4);
                createFinancialConnectionsSession$forDeferredIntent$1.label = 1;
                Object m4038createFinancialConnectionsSessionForDeferredPayments0E7RQCE = stripeApiRepository.m4038createFinancialConnectionsSessionForDeferredPayments0E7RQCE(createFinancialConnectionsSessionForDeferredPaymentParams, options, createFinancialConnectionsSession$forDeferredIntent$1);
                return m4038createFinancialConnectionsSessionForDeferredPayments0E7RQCE == coroutineSingletons ? coroutineSingletons : m4038createFinancialConnectionsSessionForDeferredPayments0E7RQCE;
            }
        }
        createFinancialConnectionsSession$forDeferredIntent$1 = new CreateFinancialConnectionsSession$forDeferredIntent$1(this, continuationImpl);
        Object obj2 = createFinancialConnectionsSession$forDeferredIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createFinancialConnectionsSession$forDeferredIntent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: forPaymentIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m4266forPaymentIntenthUnOzRk(String str, String str2, String str3, String str4, CollectBankAccountConfiguration collectBankAccountConfiguration, ContinuationImpl continuationImpl) {
        CreateFinancialConnectionsSession$forPaymentIntent$1 createFinancialConnectionsSession$forPaymentIntent$1;
        int i;
        Object failure;
        Object m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A;
        try {
            if (continuationImpl instanceof CreateFinancialConnectionsSession$forPaymentIntent$1) {
                createFinancialConnectionsSession$forPaymentIntent$1 = (CreateFinancialConnectionsSession$forPaymentIntent$1) continuationImpl;
                int i2 = createFinancialConnectionsSession$forPaymentIntent$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    createFinancialConnectionsSession$forPaymentIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = createFinancialConnectionsSession$forPaymentIntent$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = createFinancialConnectionsSession$forPaymentIntent$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        try {
                            Result.Companion companion = Result.Companion;
                            failure = new PaymentIntent.ClientSecret(str2);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            return failure;
                        }
                        StripeApiRepository stripeApiRepository = (StripeApiRepository) this.a;
                        String str5 = ((PaymentIntent.ClientSecret) failure).paymentIntentId;
                        CreateFinancialConnectionsSessionParams createSessionParams = toCreateSessionParams(collectBankAccountConfiguration, str2, str4);
                        ApiRequest.Options options = new ApiRequest.Options(str, str3, 4);
                        createFinancialConnectionsSession$forPaymentIntent$1.label = 1;
                        m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A = stripeApiRepository.m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A(str5, createSessionParams, options, createFinancialConnectionsSession$forPaymentIntent$1);
                        if (m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A = ((Result) obj).value;
                    }
                    SafeTrace.throwOnFailure(m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A);
                    FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A;
                    Result.Companion companion3 = Result.Companion;
                    return financialConnectionsSession;
                }
            }
            if (i != 0) {
            }
            SafeTrace.throwOnFailure(m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A);
            FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A;
            Result.Companion companion32 = Result.Companion;
            return financialConnectionsSession2;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(th2);
        }
        createFinancialConnectionsSession$forPaymentIntent$1 = new CreateFinancialConnectionsSession$forPaymentIntent$1(this, continuationImpl);
        Object obj2 = createFinancialConnectionsSession$forPaymentIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createFinancialConnectionsSession$forPaymentIntent$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: forSetupIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m4267forSetupIntenthUnOzRk(String str, String str2, String str3, String str4, CollectBankAccountConfiguration collectBankAccountConfiguration, ContinuationImpl continuationImpl) {
        CreateFinancialConnectionsSession$forSetupIntent$1 createFinancialConnectionsSession$forSetupIntent$1;
        int i;
        Object failure;
        Object m4041createSetupIntentFinancialConnectionsSessionBWLJW6A;
        try {
            if (continuationImpl instanceof CreateFinancialConnectionsSession$forSetupIntent$1) {
                createFinancialConnectionsSession$forSetupIntent$1 = (CreateFinancialConnectionsSession$forSetupIntent$1) continuationImpl;
                int i2 = createFinancialConnectionsSession$forSetupIntent$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    createFinancialConnectionsSession$forSetupIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = createFinancialConnectionsSession$forSetupIntent$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = createFinancialConnectionsSession$forSetupIntent$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        try {
                            Result.Companion companion = Result.Companion;
                            failure = new SetupIntent.ClientSecret(str2);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            return failure;
                        }
                        StripeApiRepository stripeApiRepository = (StripeApiRepository) this.a;
                        String str5 = ((SetupIntent.ClientSecret) failure).setupIntentId;
                        CreateFinancialConnectionsSessionParams createSessionParams = toCreateSessionParams(collectBankAccountConfiguration, str2, str4);
                        ApiRequest.Options options = new ApiRequest.Options(str, str3, 4);
                        createFinancialConnectionsSession$forSetupIntent$1.label = 1;
                        m4041createSetupIntentFinancialConnectionsSessionBWLJW6A = stripeApiRepository.m4041createSetupIntentFinancialConnectionsSessionBWLJW6A(str5, createSessionParams, options, createFinancialConnectionsSession$forSetupIntent$1);
                        if (m4041createSetupIntentFinancialConnectionsSessionBWLJW6A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        m4041createSetupIntentFinancialConnectionsSessionBWLJW6A = ((Result) obj).value;
                    }
                    SafeTrace.throwOnFailure(m4041createSetupIntentFinancialConnectionsSessionBWLJW6A);
                    FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) m4041createSetupIntentFinancialConnectionsSessionBWLJW6A;
                    Result.Companion companion3 = Result.Companion;
                    return financialConnectionsSession;
                }
            }
            if (i != 0) {
            }
            SafeTrace.throwOnFailure(m4041createSetupIntentFinancialConnectionsSessionBWLJW6A);
            FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) m4041createSetupIntentFinancialConnectionsSessionBWLJW6A;
            Result.Companion companion32 = Result.Companion;
            return financialConnectionsSession2;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(th2);
        }
        createFinancialConnectionsSession$forSetupIntent$1 = new CreateFinancialConnectionsSession$forSetupIntent$1(this, continuationImpl);
        Object obj2 = createFinancialConnectionsSession$forSetupIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createFinancialConnectionsSession$forSetupIntent$1.label;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public CameraProperties getCameraProperties() {
        return new CameraProperties(null, null, null, 0, 31, 0);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public StateFlowImpl getCameraState() {
        return FlowKt.MutableStateFlow(CameraState.Error.INSTANCE$1);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public ReadonlyStateFlow getLoading() {
        return (ReadonlyStateFlow) this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = (JvmBuiltInsCustomizer) this.a;
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.$$delegatedProperties;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj).getTypeConstructor().getSupertypes();
        supertypes.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = ((KotlinType) it.next()).getConstructor().mo4153getDeclarationDescriptor();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            ClassifierDescriptor original = mo4153getDeclarationDescriptor != null ? mo4153getDeclarationDescriptor.getOriginal() : null;
            ClassDescriptor classDescriptor = original instanceof ClassDescriptor ? (ClassDescriptor) original : null;
            if (classDescriptor != null && (lazyJavaClassDescriptor = jvmBuiltInsCustomizer.getJavaAnalogue(classDescriptor)) == null) {
                lazyJavaClassDescriptor = classDescriptor;
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public View getPreviewView() {
        return (View) this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable invoke(String str, ContinuationImpl continuationImpl) {
        FetchFinancialConnectionsSessionForToken$invoke$1 fetchFinancialConnectionsSessionForToken$invoke$1;
        int i;
        Token parsedToken;
        if (continuationImpl instanceof FetchFinancialConnectionsSessionForToken$invoke$1) {
            fetchFinancialConnectionsSessionForToken$invoke$1 = (FetchFinancialConnectionsSessionForToken$invoke$1) continuationImpl;
            int i2 = fetchFinancialConnectionsSessionForToken$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fetchFinancialConnectionsSessionForToken$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fetchFinancialConnectionsSessionForToken$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchFinancialConnectionsSessionForToken$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = (FinancialConnectionsRepositoryImpl) this.a;
                    fetchFinancialConnectionsSessionForToken$invoke$1.label = 1;
                    obj = financialConnectionsRepositoryImpl.getFinancialConnectionsSession(str, fetchFinancialConnectionsSessionForToken$invoke$1);
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
                com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession = (com.stripe.android.financialconnections.model.FinancialConnectionsSession) obj;
                parsedToken = financialConnectionsSession.getParsedToken();
                if (parsedToken == null) {
                    return new Pair(financialConnectionsSession, parsedToken);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Could not extract Token from FinancialConnectionsSession.");
                return null;
            }
        }
        fetchFinancialConnectionsSessionForToken$invoke$1 = new FetchFinancialConnectionsSessionForToken$invoke$1(this, continuationImpl);
        Object obj2 = fetchFinancialConnectionsSessionForToken$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchFinancialConnectionsSessionForToken$invoke$1.label;
        if (i != 0) {
        }
        com.stripe.android.financialconnections.model.FinancialConnectionsSession financialConnectionsSession2 = (com.stripe.android.financialconnections.model.FinancialConnectionsSession) obj2;
        parsedToken = financialConnectionsSession2.getParsedToken();
        if (parsedToken == null) {
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public boolean isRecordingLocally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i, int i2, Object obj) {
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) ((zzai) this.a).zad;
        if (adapter != null) {
            adapter.notifyItemRangeChanged(i, i2, obj);
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((CompletableFutureCallAdapterFactory.CallCancelCompletableFuture) this.a).completeExceptionally(th);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) ((zzai) this.a).zad;
        if (adapter != null) {
            adapter.notifyItemRangeInserted(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) ((zzai) this.a).zad;
        if (adapter != null) {
            adapter.notifyItemMoved(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) ((zzai) this.a).zad;
        if (adapter != null) {
            adapter.notifyItemRangeRemoved(i, i2);
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, retrofit2.Response response) {
        ((CompletableFutureCallAdapterFactory.CallCancelCompletableFuture) this.a).complete(response);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 13:
                ((Function1) this.a).invoke(obj);
                break;
            default:
                ((AndroidLocationSettingsChecker$check$2$1) this.a).invoke(obj);
                break;
        }
    }

    public AcsData parse(JSONObject jSONObject) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            Map parse = JSONObjectUtils.parse(-1, jSONObject.toString());
            parse.getClass();
            Map map = MapsKt__MapsKt.toMap(parse);
            failure = new AcsData(String.valueOf(map.get("acsURL")), parsePublicKey(map.get("acsEphemPubKey")), parsePublicKey(map.get("sdkEphemPubKey")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            ((DefaultErrorReporter) this.a).reportError(new IllegalArgumentException("Failed to parse ACS data: " + jSONObject, m4120exceptionOrNullimpl));
        }
        SafeTrace.throwOnFailure(failure);
        return (AcsData) failure;
    }

    public synchronized void plusAssign(StandaloneCoroutine standaloneCoroutine) {
        StandaloneCoroutine standaloneCoroutine2 = (StandaloneCoroutine) this.a;
        if (standaloneCoroutine2 != null) {
            standaloneCoroutine2.cancel(null);
        }
        this.a = standaloneCoroutine;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void prepare() {
    }

    public void put(String str, LoadedImage loadedImage) {
        boolean z;
        str.getClass();
        String valueOf = String.valueOf(str.hashCode());
        try {
            DiskLruCache diskLruCache = (DiskLruCache) ((Lazy) this.a).getValue();
            DiskLruCache.Snapshot snapshot = diskLruCache != null ? diskLruCache.get(String.valueOf(str.hashCode())) : null;
            z = snapshot != null;
            if (snapshot != null) {
                snapshot.close();
            }
        } catch (IOException e) {
            Log.e("stripe_image_disk_cache", "error reading from cache", e);
            z = false;
        }
        if (z) {
            return;
        }
        try {
            DiskLruCache diskLruCache2 = (DiskLruCache) ((Lazy) this.a).getValue();
            r3 = diskLruCache2 != null ? diskLruCache2.edit(valueOf) : null;
            if (r3 == null) {
                return;
            }
            if (!writeImageToFile(loadedImage, r3, loadedImage.contentType)) {
                r3.abort();
                Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + valueOf);
                return;
            }
            DiskLruCache diskLruCache3 = (DiskLruCache) ((Lazy) this.a).getValue();
            if (diskLruCache3 != null) {
                synchronized (diskLruCache3) {
                    if (diskLruCache3.journalWriter == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    diskLruCache3.trimToSize();
                    diskLruCache3.journalWriter.flush();
                }
            }
            boolean z2 = r3.intermediate;
            DiskLruCache diskLruCache4 = (DiskLruCache) r3.error;
            if (!z2) {
                DiskLruCache.access$2200(diskLruCache4, r3, true);
            } else {
                DiskLruCache.access$2200(diskLruCache4, r3, false);
                diskLruCache4.remove(((DiskLruCache.Entry) r3.result).key);
            }
        } catch (IOException unused) {
            Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + valueOf);
            try {
                Result.Companion companion = Result.Companion;
                if (r3 != null) {
                    r3.abort();
                }
            } catch (Throwable unused2) {
                Result.Companion companion2 = Result.Companion;
            }
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void setAnalyzerEnabled(boolean z) {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: startVideo-IoAF18A */
    public Object mo4083startVideoIoAF18A(Continuation continuation) {
        Result.Companion companion = Result.Companion;
        return Boolean.FALSE;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: stopVideo-IoAF18A */
    public Object mo4084stopVideoIoAF18A(Continuation continuation) {
        Result.Companion companion = Result.Companion;
        return new Result.Failure(new NoSuitableCameraError());
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: takePicture-IoAF18A */
    public Object mo4085takePictureIoAF18A(Continuation continuation) {
        Result.Companion companion = Result.Companion;
        return new Result.Failure(new NoSuitableCameraError());
    }

    public /* synthetic */ o0(Object obj, int i) {
        this.$r8$classId = i;
        this.a = obj;
    }

    public o0(FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl) {
        this.$r8$classId = 6;
        financialConnectionsRepositoryImpl.getClass();
        this.a = financialConnectionsRepositoryImpl;
    }

    public o0() {
        this.$r8$classId = 4;
        this.a = IblLoaderKt.stateFlowOf(Boolean.FALSE);
    }

    public o0(ReusableActivityResultLauncher reusableActivityResultLauncher) {
        this.$r8$classId = 14;
        reusableActivityResultLauncher.getClass();
        this.a = reusableActivityResultLauncher;
    }

    public /* synthetic */ o0(int i) {
        this.$r8$classId = i;
    }

    public o0(RealGrpcStreamingCall realGrpcStreamingCall, GrpcMethod grpcMethod) {
        this.$r8$classId = 3;
        this.a = realGrpcStreamingCall;
    }

    public o0(DocumentService documentService) {
        this.$r8$classId = 12;
        documentService.getClass();
        this.a = documentService;
    }
}
