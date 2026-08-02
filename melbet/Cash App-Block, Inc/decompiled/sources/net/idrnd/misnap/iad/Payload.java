package net.idrnd.misnap.iad;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.DatadogTracing;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.stripe.android.StripePaymentController;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeArgs;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionStarter;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession$invoke$1;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.model.ConsentUi;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default$cache$1;
import com.stripe.android.uicore.image.LoadedImage;
import com.stripe.android.view.ActivityHost;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.launchers.ReusableActivityResultLauncher;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonImpl;
import net.idrnd.face.iad.capture.internal.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.AppUpdateData;
import papa.SafeTrace;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.Response;

/* loaded from: classes8.dex */
public final class Payload implements IntentConfirmationChallengeNextActionStarter, ModelJsonParser, CallAdapter, Observer {
    public final /* synthetic */ int $r8$classId;
    public Object a;

    public Payload(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 5:
                this.a = AppUpdateData.Json$default(new StripeApiRepository$$ExternalSyntheticLambda5(16));
                break;
            case 8:
                this.a = new ImageCache$Default$cache$1(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, 1);
                break;
            case 9:
                this.a = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(5));
                break;
            case 13:
                break;
            case 14:
                this.a = new Stack();
                break;
            default:
                this.a = FlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
                break;
        }
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = new CompletableFutureCallAdapterFactory.CallCancelCompletableFuture(call);
        call.enqueue(new o0(callCancelCompletableFuture, 21));
        return callCancelCompletableFuture;
    }

    public void doBalance(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof RopeByteString)) {
                String valueOf = String.valueOf(byteString.getClass());
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
                return;
            } else {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
                return;
            }
        }
        int size = byteString.size();
        int[] iArr = RopeByteString.minLengthByDepth;
        int binarySearch = Arrays.binarySearch(iArr, size);
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int i = iArr[binarySearch + 1];
        Stack stack = (Stack) this.a;
        if (stack.isEmpty() || ((ByteString) stack.peek()).size() >= i) {
            stack.push(byteString);
            return;
        }
        int i2 = iArr[binarySearch];
        ByteString byteString2 = (ByteString) stack.pop();
        while (!stack.isEmpty() && ((ByteString) stack.peek()).size() < i2) {
            byteString2 = new RopeByteString((ByteString) stack.pop(), byteString2);
        }
        RopeByteString ropeByteString2 = new RopeByteString(byteString2, byteString);
        while (!stack.isEmpty()) {
            int[] iArr2 = RopeByteString.minLengthByDepth;
            int binarySearch2 = Arrays.binarySearch(iArr2, ropeByteString2.totalLength);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((ByteString) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                break;
            } else {
                ropeByteString2 = new RopeByteString((ByteString) stack.pop(), ropeByteString2);
            }
        }
        stack.push(ropeByteString2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        if (r0 == r2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c1 -> B:11:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(FinancialConnectionsSession financialConnectionsSession, ContinuationImpl continuationImpl) {
        FetchPaginatedAccountsForSession$invoke$1 fetchPaginatedAccountsForSession$invoke$1;
        int i;
        ArrayList arrayList;
        FinancialConnectionsAccountList financialConnectionsAccountList;
        ArrayList arrayList2;
        FinancialConnectionsSession financialConnectionsSession2;
        FinancialConnectionsSession financialConnectionsSession3 = financialConnectionsSession;
        FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = (FinancialConnectionsRepositoryImpl) this.a;
        if (continuationImpl instanceof FetchPaginatedAccountsForSession$invoke$1) {
            fetchPaginatedAccountsForSession$invoke$1 = (FetchPaginatedAccountsForSession$invoke$1) continuationImpl;
            int i2 = fetchPaginatedAccountsForSession$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fetchPaginatedAccountsForSession$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fetchPaginatedAccountsForSession$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchPaginatedAccountsForSession$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!financialConnectionsSession3.getAccounts().hasMore) {
                        return financialConnectionsSession3;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(financialConnectionsSession3.getAccounts().data);
                    GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = new GetFinancialConnectionsAcccountsParams(financialConnectionsSession3.clientSecret, ((FinancialConnectionsAccount) CollectionsKt.last((List) arrayList3)).id);
                    fetchPaginatedAccountsForSession$invoke$1.L$0 = financialConnectionsSession3;
                    fetchPaginatedAccountsForSession$invoke$1.L$1 = arrayList3;
                    fetchPaginatedAccountsForSession$invoke$1.label = 1;
                    Object financialConnectionsAccounts = financialConnectionsRepositoryImpl.getFinancialConnectionsAccounts(getFinancialConnectionsAcccountsParams, fetchPaginatedAccountsForSession$invoke$1);
                    if (financialConnectionsAccounts != coroutineSingletons) {
                        arrayList = arrayList3;
                        obj = financialConnectionsAccounts;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    List list = fetchPaginatedAccountsForSession$invoke$1.L$1;
                    FinancialConnectionsSession financialConnectionsSession4 = fetchPaginatedAccountsForSession$invoke$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    arrayList = list;
                    financialConnectionsSession3 = financialConnectionsSession4;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = fetchPaginatedAccountsForSession$invoke$1.L$1;
                    financialConnectionsSession2 = fetchPaginatedAccountsForSession$invoke$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    arrayList2 = list2;
                    financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
                    arrayList2.addAll(financialConnectionsAccountList.data);
                    if (financialConnectionsAccountList.hasMore || arrayList2.size() >= 100) {
                        return new FinancialConnectionsSession(financialConnectionsSession2.clientSecret, financialConnectionsSession2.id, null, new FinancialConnectionsAccountList(arrayList2, financialConnectionsAccountList.hasMore, financialConnectionsAccountList.url, new Integer(arrayList2.size()), financialConnectionsAccountList.totalCount), financialConnectionsSession2.livemode, null, null, null, null, null, null);
                    }
                    GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams2 = new GetFinancialConnectionsAcccountsParams(financialConnectionsSession2.clientSecret, ((FinancialConnectionsAccount) CollectionsKt.last((List) arrayList2)).id);
                    fetchPaginatedAccountsForSession$invoke$1.L$0 = financialConnectionsSession2;
                    fetchPaginatedAccountsForSession$invoke$1.L$1 = arrayList2;
                    fetchPaginatedAccountsForSession$invoke$1.label = 2;
                    obj = financialConnectionsRepositoryImpl.getFinancialConnectionsAccounts(getFinancialConnectionsAcccountsParams2, fetchPaginatedAccountsForSession$invoke$1);
                }
                financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
                arrayList.addAll(financialConnectionsAccountList.data);
                arrayList2 = arrayList;
                financialConnectionsSession2 = financialConnectionsSession3;
                if (financialConnectionsAccountList.hasMore) {
                }
                return new FinancialConnectionsSession(financialConnectionsSession2.clientSecret, financialConnectionsSession2.id, null, new FinancialConnectionsAccountList(arrayList2, financialConnectionsAccountList.hasMore, financialConnectionsAccountList.url, new Integer(arrayList2.size()), financialConnectionsAccountList.totalCount), financialConnectionsSession2.livemode, null, null, null, null, null, null);
            }
        }
        fetchPaginatedAccountsForSession$invoke$1 = new FetchPaginatedAccountsForSession$invoke$1(this, continuationImpl);
        Object obj2 = fetchPaginatedAccountsForSession$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchPaginatedAccountsForSession$invoke$1.label;
        if (i != 0) {
        }
        financialConnectionsAccountList = (FinancialConnectionsAccountList) obj2;
        arrayList.addAll(financialConnectionsAccountList.data);
        arrayList2 = arrayList;
        financialConnectionsSession2 = financialConnectionsSession3;
        if (financialConnectionsAccountList.hasMore) {
        }
        return new FinancialConnectionsSession(financialConnectionsSession2.clientSecret, financialConnectionsSession2.id, null, new FinancialConnectionsAccountList(arrayList2, financialConnectionsAccountList.hasMore, financialConnectionsAccountList.url, new Integer(arrayList2.size()), financialConnectionsAccountList.totalCount), financialConnectionsSession2.livemode, null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m4315invokeBWLJW6A(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RetrieveStripeIntent$invoke$1 retrieveStripeIntent$invoke$1;
        int i;
        if (continuationImpl instanceof RetrieveStripeIntent$invoke$1) {
            retrieveStripeIntent$invoke$1 = (RetrieveStripeIntent$invoke$1) continuationImpl;
            int i2 = retrieveStripeIntent$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                retrieveStripeIntent$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = retrieveStripeIntent$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retrieveStripeIntent$invoke$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((kotlin.Result) obj).value;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StripeApiRepository stripeApiRepository = (StripeApiRepository) this.a;
                ApiRequest.Options options = new ApiRequest.Options(str, str2, 4);
                retrieveStripeIntent$invoke$1.label = 1;
                StripeRepository.Companion companion = StripeRepository.Companion;
                Object m4049retrieveStripeIntentBWLJW6A = stripeApiRepository.m4049retrieveStripeIntentBWLJW6A(str3, options, EmptyList.INSTANCE, retrieveStripeIntent$invoke$1);
                return m4049retrieveStripeIntentBWLJW6A == coroutineSingletons ? coroutineSingletons : m4049retrieveStripeIntentBWLJW6A;
            }
        }
        retrieveStripeIntent$invoke$1 = new RetrieveStripeIntent$invoke$1(this, continuationImpl);
        Object obj2 = retrieveStripeIntent$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retrieveStripeIntent$invoke$1.label;
        if (i == 0) {
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        ((Observer) this.a).onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        Observer observer = (Observer) this.a;
        try {
            if (th == null) {
                throw new NullPointerException("error == null");
            }
            observer.onNext(new retrofit2.adapter.rxjava3.Result(null, th));
            observer.onComplete();
        } catch (Throwable th2) {
            try {
                observer.onError(th2);
            } catch (Throwable th3) {
                Longs.throwIfFatal(th3);
                UnsignedBytes.onError(new CompositeException(th2, th3));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(Object obj) {
        Response response = (Response) obj;
        Observer observer = (Observer) this.a;
        if (response != null) {
            observer.onNext(new retrofit2.adapter.rxjava3.Result(response, null));
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("response == null");
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        ((Observer) this.a).onSubscribe(disposable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /* renamed from: parse */
    public StripeModel mo4026parse(JSONObject jSONObject) {
        DisplayablePaymentDetails displayablePaymentDetails;
        ConsentUi consentUi;
        switch (this.$r8$classId) {
            case 3:
                return mo4026parse(jSONObject);
            default:
                boolean z = false;
                if (jSONObject.has("exists") && jSONObject.optBoolean("exists", false)) {
                    z = true;
                }
                boolean z2 = z;
                ConsumerSession parse = ConsumerSessionJsonParser.parse(jSONObject);
                String optString = StripeJsonUtils.optString("error_message", jSONObject);
                String optString2 = StripeJsonUtils.optString("publishable_key", jSONObject);
                JSONObject optJSONObject = jSONObject.optJSONObject("displayable_payment_details");
                LinkBrand linkBrand = null;
                if (optJSONObject != null) {
                    displayablePaymentDetails = new DisplayablePaymentDetails(StripeJsonUtils.optString("default_card_brand", optJSONObject), StripeJsonUtils.optString("default_payment_type", optJSONObject), StripeJsonUtils.optString("last_4", optJSONObject), !optJSONObject.has("number_of_saved_payment_details") ? null : Long.valueOf(optJSONObject.optLong("number_of_saved_payment_details")));
                } else {
                    displayablePaymentDetails = null;
                }
                String optString3 = StripeJsonUtils.optString("consent_ui", jSONObject);
                if (optString3 != null) {
                    JsonImpl jsonImpl = (JsonImpl) this.a;
                    jsonImpl.getClass();
                    consentUi = (ConsentUi) jsonImpl.decodeFromString(optString3, ConsentUi.Companion.serializer());
                } else {
                    consentUi = null;
                }
                String optString4 = StripeJsonUtils.optString("suggested_email", jSONObject);
                String optString5 = StripeJsonUtils.optString("link_brand", jSONObject);
                if (optString5 != null) {
                    Iterator<E> it = LinkBrand.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.areEqual(((LinkBrand) next).getValue(), optString5)) {
                                linkBrand = next;
                            }
                        }
                    }
                    linkBrand = linkBrand;
                    if (linkBrand == null) {
                        linkBrand = LinkBrand.Link;
                    }
                }
                return new ConsumerSessionLookup(z2, parse, optString, optString2, displayablePaymentDetails, consentUi, optString4, linkBrand);
        }
    }

    public void put(String str, LoadedImage loadedImage) {
        str.getClass();
        synchronized (this) {
            if (((ImageCache$Default$cache$1) this.a).get(String.valueOf(str.hashCode())) == null) {
                ((ImageCache$Default$cache$1) this.a).put(String.valueOf(str.hashCode()), loadedImage);
            }
        }
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.a;
    }

    @Override // com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionStarter
    public void start(IntentConfirmationChallengeActivityContract.Args args) {
        StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.StripeJs stripeJs;
        StripeIntent stripeIntent = args.intent;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        String str = null;
        StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge intentConfirmationChallenge = nextActionData instanceof StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge ? (StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge) nextActionData : null;
        ActivityHost activityHost = (ActivityHost) this.a;
        int i = IntentConfirmationChallengeActivity.$r8$clinit;
        String str2 = args.publishableKey;
        List list = CollectionsKt.toList(args.productUsage);
        if (intentConfirmationChallenge != null && (stripeJs = intentConfirmationChallenge.stripeJs) != null) {
            str = stripeJs.captchaVendorName;
        }
        Bundle bundleOf = BundleKt.bundleOf(new Pair("intent_confirmation_challenge_args", new IntentConfirmationChallengeArgs(str2, list, stripeIntent, str)));
        List list2 = StripePaymentController.EXPAND_PAYMENT_METHOD;
        activityHost.startActivityForResult(IntentConfirmationChallengeActivity.class, bundleOf, DatadogTracing.getRequestCode$payments_core_release(stripeIntent));
    }

    public Payload(Context context) {
        this.$r8$classId = 15;
        this.a = context.getSharedPreferences("AuthPreferences", 0);
    }

    public Payload(DataCollector dataCollector) {
        this.$r8$classId = 12;
        dataCollector.getClass();
        this.a = dataCollector;
    }

    public Payload(FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl) {
        this.$r8$classId = 4;
        financialConnectionsRepositoryImpl.getClass();
        this.a = financialConnectionsRepositoryImpl;
    }

    public /* synthetic */ Payload(Object obj, int i) {
        this.$r8$classId = i;
        this.a = obj;
    }

    public Payload(ReusableActivityResultLauncher reusableActivityResultLauncher) {
        this.$r8$classId = 11;
        reusableActivityResultLauncher.getClass();
        this.a = reusableActivityResultLauncher;
    }

    public Payload(ActivityHost activityHost) {
        this.$r8$classId = 2;
        activityHost.getClass();
        this.a = activityHost;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /* renamed from: parse */
    public FraudDetectionData mo4026parse(JSONObject jSONObject) {
        String optString;
        String optString2;
        String optString3 = StripeJsonUtils.optString("guid", jSONObject);
        if (optString3 == null || (optString = StripeJsonUtils.optString("muid", jSONObject)) == null || (optString2 = StripeJsonUtils.optString("sid", jSONObject)) == null) {
            return null;
        }
        return new FraudDetectionData(optString3, ((Number) ((Luhn$$ExternalSyntheticLambda0) this.a).invoke()).longValue(), optString, optString2);
    }
}
