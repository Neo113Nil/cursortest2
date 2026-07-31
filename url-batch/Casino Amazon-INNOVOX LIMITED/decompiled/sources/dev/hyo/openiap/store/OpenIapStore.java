package dev.hyo.openiap.store;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import dev.hyo.openiap.ActiveSubscription;
import dev.hyo.openiap.BillingProgramAndroid;
import dev.hyo.openiap.BillingProgramAvailabilityResultAndroid;
import dev.hyo.openiap.BillingProgramReportingDetailsAndroid;
import dev.hyo.openiap.DeepLinkOptions;
import dev.hyo.openiap.FetchProductsResult;
import dev.hyo.openiap.InitConnectionConfig;
import dev.hyo.openiap.LaunchExternalLinkParamsAndroid;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapLog;
import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.Product;
import dev.hyo.openiap.ProductRequest;
import dev.hyo.openiap.ProductSubscription;
import dev.hyo.openiap.Purchase;
import dev.hyo.openiap.PurchaseOptions;
import dev.hyo.openiap.RequestPurchaseProps;
import dev.hyo.openiap.RequestPurchaseResult;
import dev.hyo.openiap.listener.DeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapDeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import dev.hyo.openiap.listener.OpenIapUserChoiceBillingListener;
import dev.hyo.openiap.listener.UserChoiceBillingListener;
import io.opentelemetry.semconv.OtelAttributes;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\rJ\u0010\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106J\u0010\u00107\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000108J\u0010\u00109\u001a\u0002042\b\u0010:\u001a\u0004\u0018\u00010;J\u0006\u0010<\u001a\u000204J\u000e\u0010=\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010HJ&\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\u00192\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010jJ \u0010k\u001a\u00020\u00122\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010jJ\u0018\u0010l\u001a\u0004\u0018\u0001042\u0006\u0010V\u001a\u00020mH\u0086@¢\u0006\u0002\u0010nJ\u000e\u0010o\u001a\u00020\u0012H\u0087@¢\u0006\u0002\u0010HJ\u0016\u0010p\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0087@¢\u0006\u0002\u0010qJ\u0010\u0010r\u001a\u0004\u0018\u00010\nH\u0087@¢\u0006\u0002\u0010HJ\u0016\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0086@¢\u0006\u0002\u0010wJ\u0016\u0010x\u001a\u00020y2\u0006\u0010u\u001a\u00020vH\u0086@¢\u0006\u0002\u0010wJ\u001e\u0010z\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;2\u0006\u0010Q\u001a\u00020{H\u0086@¢\u0006\u0002\u0010|J\u000e\u0010}\u001a\u0002042\u0006\u0010u\u001a\u00020vJ\u000e\u0010~\u001a\u0002042\u0006\u00105\u001a\u000200J\u000e\u0010\u007f\u001a\u0002042\u0006\u00105\u001a\u000200J\u000f\u0010\u0080\u0001\u001a\u0002042\u0006\u00105\u001a\u000202J\u000f\u0010\u0081\u0001\u001a\u0002042\u0006\u00105\u001a\u000202J\u0010\u0010\u0082\u0001\u001a\u0002042\u0007\u00105\u001a\u00030\u0083\u0001J\u0010\u0010\u0084\u0001\u001a\u0002042\u0007\u00105\u001a\u00030\u0083\u0001J\u0010\u0010\u0085\u0001\u001a\u0002042\u0007\u00105\u001a\u00030\u0086\u0001J\u0010\u0010\u0087\u0001\u001a\u0002042\u0007\u00105\u001a\u00030\u0086\u0001J\u001f\u0010\u0088\u0001\u001a\u0002042\u0014\u0010\u0089\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u0002040JH\u0002J\u0014\u0010\u008b\u0001\u001a\u0002042\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\nH\u0002JB\u0010\u008d\u0001\u001a\u0002042\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010*\u001a\u00030\u008e\u00012\u000b\b\u0002\u0010\u008f\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0002\u0010\u0090\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0002\u0010\u0091\u0001\u001a\u0004\u0018\u00010\nH\u0002J&\u0010\u0092\u0001\u001a\u0002042\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010*\u001a\u00030\u008e\u00012\u000b\b\u0002\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nJ\u0007\u0010\u0093\u0001\u001a\u000204J\u0012\u0010\u0094\u0001\u001a\u0002042\u0007\u0010\u008f\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u0095\u0001\u001a\u0002042\u0007\u0010\u008f\u0001\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00190\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010=\u001a3\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010?¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120C\u0012\u0006\u0012\u0004\u0018\u00010\u00010>j\u0002`D¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR-\u0010I\u001a\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120C\u0012\u0006\u0012\u0004\u0018\u00010\u00010Jj\u0002`K¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MRB\u0010O\u001a1\b\u0001\u0012\u0013\u0012\u00110P¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0C\u0012\u0006\u0012\u0004\u0018\u00010\u00010>j\u0002`S¢\u0006\n\n\u0002\u0010G\u001a\u0004\bT\u0010FRJ\u0010$\u001a9\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010U¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(V\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00190C\u0012\u0006\u0012\u0004\u0018\u00010\u00010>j\u0002`W¢\u0006\n\n\u0002\u0010G\u001a\u0004\bX\u0010FRD\u0010Y\u001a3\b\u0001\u0012\u0013\u0012\u00110Z¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(Q\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010[0C\u0012\u0006\u0012\u0004\u0018\u00010\u00010>j\u0002`\\¢\u0006\n\n\u0002\u0010G\u001a\u0004\b]\u0010FRl\u0010^\u001a[\b\u0001\u0012&\u0012$0\"j\u0011`a¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(`¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(`\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(b\u0012\n\u0012\b\u0012\u0004\u0012\u0002040C\u0012\u0006\u0012\u0004\u0018\u00010\u00010_j\u0002`c¢\u0006\n\n\u0002\u0010f\u001a\u0004\bd\u0010e¨\u0006\u0096\u0001"}, d2 = {"Ldev/hyo/openiap/store/OpenIapStore;", "", "module", "Ldev/hyo/openiap/OpenIapProtocol;", "<init>", "(Ldev/hyo/openiap/OpenIapProtocol;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "store", "", "(Landroid/content/Context;Ljava/lang/String;)V", "appId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "storeScope", "Lkotlinx/coroutines/CoroutineScope;", "_isConnected", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "connectionStatus", "getConnectionStatus", "_products", "", "Ldev/hyo/openiap/Product;", "products", "getProducts", "_subscriptions", "Ldev/hyo/openiap/ProductSubscription;", BillingClient.FeatureType.SUBSCRIPTIONS, "getSubscriptions", "_availablePurchases", "Ldev/hyo/openiap/Purchase;", "availablePurchases", "getAvailablePurchases", "_currentPurchase", "currentPurchase", "getCurrentPurchase", "_status", "Ldev/hyo/openiap/store/IapStatus;", NotificationCompat.CATEGORY_STATUS, "getStatus", "processedPurchaseTokens", "", "pendingRequestProductId", "purchaseUpdateListener", "Ldev/hyo/openiap/listener/OpenIapPurchaseUpdateListener;", "purchaseErrorListener", "Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;", "setUserChoiceBillingListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/hyo/openiap/listener/UserChoiceBillingListener;", "setDeveloperProvidedBillingListener", "Ldev/hyo/openiap/listener/DeveloperProvidedBillingListener;", "setActivity", "activity", "Landroid/app/Activity;", "clear", "initConnection", "Lkotlin/Function2;", "Ldev/hyo/openiap/InitConnectionConfig;", "Lkotlin/ParameterName;", "name", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lkotlin/coroutines/Continuation;", "Ldev/hyo/openiap/MutationInitConnectionHandler;", "getInitConnection", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endConnection", "Lkotlin/Function1;", "Ldev/hyo/openiap/MutationEndConnectionHandler;", "getEndConnection", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "fetchProducts", "Ldev/hyo/openiap/ProductRequest;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/FetchProductsResult;", "Ldev/hyo/openiap/QueryFetchProductsHandler;", "getFetchProducts", "Ldev/hyo/openiap/PurchaseOptions;", "options", "Ldev/hyo/openiap/QueryGetAvailablePurchasesHandler;", "getGetAvailablePurchases", "requestPurchase", "Ldev/hyo/openiap/RequestPurchaseProps;", "Ldev/hyo/openiap/RequestPurchaseResult;", "Ldev/hyo/openiap/MutationRequestPurchaseHandler;", "getRequestPurchase", "finishTransaction", "Lkotlin/Function3;", "purchase", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", "Ldev/hyo/openiap/MutationFinishTransactionHandler;", "getFinishTransaction", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "getActiveSubscriptions", "Ldev/hyo/openiap/ActiveSubscription;", "subscriptionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasActiveSubscriptions", "deepLinkToSubscriptions", "Ldev/hyo/openiap/DeepLinkOptions;", "(Ldev/hyo/openiap/DeepLinkOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAlternativeBillingAvailability", "showAlternativeBillingInformationDialog", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAlternativeBillingReportingToken", "isBillingProgramAvailable", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "program", "Ldev/hyo/openiap/BillingProgramAndroid;", "(Ldev/hyo/openiap/BillingProgramAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBillingProgramReportingDetails", "Ldev/hyo/openiap/BillingProgramReportingDetailsAndroid;", "launchExternalLink", "Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", "(Landroid/app/Activity;Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableBillingProgram", "addPurchaseUpdateListener", "removePurchaseUpdateListener", "addPurchaseErrorListener", "removePurchaseErrorListener", "addUserChoiceBillingListener", "Ldev/hyo/openiap/listener/OpenIapUserChoiceBillingListener;", "removeUserChoiceBillingListener", "addDeveloperProvidedBillingListener", "Ldev/hyo/openiap/listener/OpenIapDeveloperProvidedBillingListener;", "removeDeveloperProvidedBillingListener", "setLoading", "block", "Ldev/hyo/openiap/store/LoadingStates;", "setError", "message", "setStatusMessage", "Ldev/hyo/openiap/store/PurchaseResultStatus;", "productId", "transactionId", "code", "postStatusMessage", "clearStatusMessage", "addPurchasing", "removePurchasing", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapStore {
    public static final int $stable = 8;
    private final MutableStateFlow<List<Purchase>> _availablePurchases;
    private final MutableStateFlow<Purchase> _currentPurchase;
    private final MutableStateFlow<Boolean> _isConnected;
    private final MutableStateFlow<List<Product>> _products;
    private final MutableStateFlow<IapStatus> _status;
    private final MutableStateFlow<List<ProductSubscription>> _subscriptions;
    private final StateFlow<List<Purchase>> availablePurchases;
    private final StateFlow<Purchase> currentPurchase;
    private final Function1<Continuation<? super Boolean>, Object> endConnection;
    private final Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts;
    private final Function3<Purchase, Boolean, Continuation<? super Unit>, Object> finishTransaction;
    private final Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getAvailablePurchases;
    private final Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> initConnection;
    private final StateFlow<Boolean> isConnected;
    private final OpenIapProtocol module;
    private String pendingRequestProductId;
    private final Set<String> processedPurchaseTokens;
    private final StateFlow<List<Product>> products;
    private final OpenIapPurchaseErrorListener purchaseErrorListener;
    private final OpenIapPurchaseUpdateListener purchaseUpdateListener;
    private final Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> requestPurchase;
    private final StateFlow<IapStatus> status;
    private final CoroutineScope storeScope;
    private final StateFlow<List<ProductSubscription>> subscriptions;

    public OpenIapStore(OpenIapProtocol module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.module = module;
        Log.i("OpenIapStore", "Initialized with module: " + module.getClass().getSimpleName());
        this.storeScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isConnected = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<Product>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._products = MutableStateFlow2;
        this.products = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<ProductSubscription>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._subscriptions = MutableStateFlow3;
        this.subscriptions = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<Purchase>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._availablePurchases = MutableStateFlow4;
        this.availablePurchases = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Purchase> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._currentPurchase = MutableStateFlow5;
        this.currentPurchase = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<IapStatus> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new IapStatus(null, null, null, null, null, 31, null));
        this._status = MutableStateFlow6;
        this.status = FlowKt.asStateFlow(MutableStateFlow6);
        this.processedPurchaseTokens = new LinkedHashSet();
        OpenIapPurchaseUpdateListener openIapPurchaseUpdateListener = new OpenIapPurchaseUpdateListener() { // from class: dev.hyo.openiap.store.OpenIapStore$$ExternalSyntheticLambda0
            @Override // dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener
            public final void onPurchaseUpdated(Purchase purchase) {
                OpenIapStore.purchaseUpdateListener$lambda$0(OpenIapStore.this, purchase);
            }
        };
        this.purchaseUpdateListener = openIapPurchaseUpdateListener;
        OpenIapPurchaseErrorListener openIapPurchaseErrorListener = new OpenIapPurchaseErrorListener() { // from class: dev.hyo.openiap.store.OpenIapStore$$ExternalSyntheticLambda1
            @Override // dev.hyo.openiap.listener.OpenIapPurchaseErrorListener
            public final void onPurchaseError(OpenIapError openIapError) {
                OpenIapStore.purchaseErrorListener$lambda$2(OpenIapStore.this, openIapError);
            }
        };
        this.purchaseErrorListener = openIapPurchaseErrorListener;
        module.addPurchaseUpdateListener(openIapPurchaseUpdateListener);
        module.addPurchaseErrorListener(openIapPurchaseErrorListener);
        this.initConnection = new OpenIapStore$initConnection$1(this, null);
        this.endConnection = new OpenIapStore$endConnection$1(this, null);
        this.fetchProducts = new OpenIapStore$fetchProducts$1(this, null);
        this.getAvailablePurchases = new OpenIapStore$getAvailablePurchases$1(this, null);
        this.requestPurchase = new OpenIapStore$requestPurchase$1(this, null);
        this.finishTransaction = new OpenIapStore$finishTransaction$1(this, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenIapStore(Context context) {
        this(r2);
        OpenIapProtocol buildModule;
        Intrinsics.checkNotNullParameter(context, "context");
        buildModule = OpenIapStoreKt.buildModule(context, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenIapStore(Context context, String str) {
        this(r2);
        OpenIapProtocol buildModule;
        Intrinsics.checkNotNullParameter(context, "context");
        buildModule = OpenIapStoreKt.buildModule(context, str, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenIapStore(Context context, String str, String str2) {
        this(r2);
        OpenIapProtocol buildModule;
        Intrinsics.checkNotNullParameter(context, "context");
        buildModule = OpenIapStoreKt.buildModule(context, str, str2);
    }

    public final StateFlow<Boolean> isConnected() {
        return this.isConnected;
    }

    public final StateFlow<Boolean> getConnectionStatus() {
        return this.isConnected;
    }

    public final StateFlow<List<Product>> getProducts() {
        return this.products;
    }

    public final StateFlow<List<ProductSubscription>> getSubscriptions() {
        return this.subscriptions;
    }

    public final StateFlow<List<Purchase>> getAvailablePurchases() {
        return this.availablePurchases;
    }

    public final StateFlow<Purchase> getCurrentPurchase() {
        return this.currentPurchase;
    }

    public final StateFlow<IapStatus> getStatus() {
        return this.status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseUpdateListener$lambda$0(OpenIapStore openIapStore, Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        openIapStore._currentPurchase.setValue(purchase);
        setStatusMessage$default(openIapStore, "Purchase successful", PurchaseResultStatus.Success, purchase.getProductId(), purchase.getId(), null, 16, null);
        MutableStateFlow<IapStatus> mutableStateFlow = openIapStore._status;
        mutableStateFlow.setValue(IapStatus.copy$default(mutableStateFlow.getValue(), null, null, null, null, null, 27, null));
        openIapStore.pendingRequestProductId = null;
        BuildersKt__Builders_commonKt.launch$default(openIapStore.storeScope, null, null, new OpenIapStore$purchaseUpdateListener$1$1(openIapStore, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void purchaseErrorListener$lambda$2(OpenIapStore openIapStore, OpenIapError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if ((error instanceof OpenIapError.UserCancelled) || (error instanceof OpenIapError.PurchaseCancelled)) {
            String code = OpenIapError.INSTANCE.toCode(error);
            setStatusMessage$default(openIapStore, OpenIapError.INSTANCE.defaultMessage(code), PurchaseResultStatus.Info, openIapStore.pendingRequestProductId, null, code, 8, null);
            MutableStateFlow<IapStatus> mutableStateFlow = openIapStore._status;
            mutableStateFlow.setValue(IapStatus.copy$default(mutableStateFlow.getValue(), null, null, null, null, null, 27, null));
            openIapStore.pendingRequestProductId = null;
            return;
        }
        String code2 = OpenIapError.INSTANCE.toCode(error);
        String message = error.getMessage();
        if (message != null) {
            if (StringsKt.isBlank(message)) {
                message = null;
            }
        }
        message = OpenIapError.INSTANCE.defaultMessage(code2);
        setStatusMessage$default(openIapStore, message, PurchaseResultStatus.Error, openIapStore.pendingRequestProductId, null, code2, 8, null);
        MutableStateFlow<IapStatus> mutableStateFlow2 = openIapStore._status;
        mutableStateFlow2.setValue(IapStatus.copy$default(mutableStateFlow2.getValue(), null, null, new ErrorData(code2, message, null, 0L, 12, null), null, null, 27, null));
        openIapStore.pendingRequestProductId = null;
    }

    public final void setUserChoiceBillingListener(UserChoiceBillingListener listener) {
        this.module.setUserChoiceBillingListener(listener);
    }

    public final void setDeveloperProvidedBillingListener(DeveloperProvidedBillingListener listener) {
        this.module.setDeveloperProvidedBillingListener(listener);
    }

    public final void setActivity(Activity activity) {
        this.module.setActivity(activity);
    }

    public final void clear() {
        this.module.removePurchaseUpdateListener(this.purchaseUpdateListener);
        this.module.removePurchaseErrorListener(this.purchaseErrorListener);
        this.processedPurchaseTokens.clear();
        this.pendingRequestProductId = null;
        CoroutineScopeKt.cancel$default(this.storeScope, null, 1, null);
    }

    public final Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> getInitConnection() {
        return this.initConnection;
    }

    public final Object initConnection(Continuation<? super Boolean> continuation) {
        OpenIapLog.INSTANCE.i("OpenIapStore.initConnection(): Calling initConnection(null)...", "OpenIapStore");
        return this.initConnection.invoke(null, continuation);
    }

    public final Function1<Continuation<? super Boolean>, Object> getEndConnection() {
        return this.endConnection;
    }

    public final Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> getFetchProducts() {
        return this.fetchProducts;
    }

    public final Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getGetAvailablePurchases() {
        return this.getAvailablePurchases;
    }

    public final Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> getRequestPurchase() {
        return this.requestPurchase;
    }

    public final Function3<Purchase, Boolean, Continuation<? super Unit>, Object> getFinishTransaction() {
        return this.finishTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getActiveSubscriptions$default(OpenIapStore openIapStore, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return openIapStore.getActiveSubscriptions(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getActiveSubscriptions(List<String> list, Continuation<? super List<ActiveSubscription>> continuation) {
        OpenIapStore$getActiveSubscriptions$1 openIapStore$getActiveSubscriptions$1;
        int i;
        List list2;
        if (continuation instanceof OpenIapStore$getActiveSubscriptions$1) {
            openIapStore$getActiveSubscriptions$1 = (OpenIapStore$getActiveSubscriptions$1) continuation;
            if ((openIapStore$getActiveSubscriptions$1.label & Integer.MIN_VALUE) != 0) {
                openIapStore$getActiveSubscriptions$1.label -= Integer.MIN_VALUE;
                Object obj = openIapStore$getActiveSubscriptions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = openIapStore$getActiveSubscriptions$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getActiveSubscriptions = this.module.getQueryHandlers().getGetActiveSubscriptions();
                    if (getActiveSubscriptions != null) {
                        openIapStore$getActiveSubscriptions$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                        openIapStore$getActiveSubscriptions$1.label = 1;
                        obj = getActiveSubscriptions.invoke(list, openIapStore$getActiveSubscriptions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return CollectionsKt.emptyList();
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                list2 = (List) obj;
                if (list2 != null) {
                    return list2;
                }
                return CollectionsKt.emptyList();
            }
        }
        openIapStore$getActiveSubscriptions$1 = new OpenIapStore$getActiveSubscriptions$1(this, continuation);
        Object obj2 = openIapStore$getActiveSubscriptions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = openIapStore$getActiveSubscriptions$1.label;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object hasActiveSubscriptions$default(OpenIapStore openIapStore, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return openIapStore.hasActiveSubscriptions(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasActiveSubscriptions(List<String> list, Continuation<? super Boolean> continuation) {
        OpenIapStore$hasActiveSubscriptions$1 openIapStore$hasActiveSubscriptions$1;
        int i;
        boolean z;
        if (continuation instanceof OpenIapStore$hasActiveSubscriptions$1) {
            openIapStore$hasActiveSubscriptions$1 = (OpenIapStore$hasActiveSubscriptions$1) continuation;
            if ((openIapStore$hasActiveSubscriptions$1.label & Integer.MIN_VALUE) != 0) {
                openIapStore$hasActiveSubscriptions$1.label -= Integer.MIN_VALUE;
                Object obj = openIapStore$hasActiveSubscriptions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = openIapStore$hasActiveSubscriptions$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<List<String>, Continuation<? super Boolean>, Object> hasActiveSubscriptions = this.module.getQueryHandlers().getHasActiveSubscriptions();
                    if (hasActiveSubscriptions == null) {
                        z = false;
                        return Boxing.boxBoolean(z);
                    }
                    openIapStore$hasActiveSubscriptions$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                    openIapStore$hasActiveSubscriptions$1.label = 1;
                    obj = hasActiveSubscriptions.invoke(list, openIapStore$hasActiveSubscriptions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boxing.boxBoolean(z);
            }
        }
        openIapStore$hasActiveSubscriptions$1 = new OpenIapStore$hasActiveSubscriptions$1(this, continuation);
        Object obj2 = openIapStore$hasActiveSubscriptions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = openIapStore$hasActiveSubscriptions$1.label;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boxing.boxBoolean(z);
    }

    public final Object deepLinkToSubscriptions(DeepLinkOptions deepLinkOptions, Continuation<? super Unit> continuation) {
        Function2<DeepLinkOptions, Continuation<? super Unit>, Object> deepLinkToSubscriptions = this.module.getMutationHandlers().getDeepLinkToSubscriptions();
        if (deepLinkToSubscriptions == null) {
            return null;
        }
        Object invoke = deepLinkToSubscriptions.invoke(deepLinkOptions, continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }

    @Deprecated(message = "Use isBillingProgramAvailable with BillingProgramAndroid.ExternalOffer instead")
    public final Object checkAlternativeBillingAvailability(Continuation<? super Boolean> continuation) {
        return this.module.checkAlternativeBillingAvailability(continuation);
    }

    @Deprecated(message = "Use launchExternalLink instead")
    public final Object showAlternativeBillingInformationDialog(Activity activity, Continuation<? super Boolean> continuation) {
        return this.module.showAlternativeBillingInformationDialog(activity, continuation);
    }

    @Deprecated(message = "Use createBillingProgramReportingDetails with BillingProgramAndroid.ExternalOffer instead")
    public final Object createAlternativeBillingReportingToken(Continuation<? super String> continuation) {
        return this.module.createAlternativeBillingReportingToken(continuation);
    }

    public final Object isBillingProgramAvailable(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid> continuation) {
        return this.module.isBillingProgramAvailable(billingProgramAndroid, continuation);
    }

    public final Object createBillingProgramReportingDetails(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid> continuation) {
        return this.module.createBillingProgramReportingDetails(billingProgramAndroid, continuation);
    }

    public final Object launchExternalLink(Activity activity, LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid, Continuation<? super Boolean> continuation) {
        return this.module.launchExternalLink(activity, launchExternalLinkParamsAndroid, continuation);
    }

    public final void enableBillingProgram(BillingProgramAndroid program) {
        Intrinsics.checkNotNullParameter(program, "program");
        try {
            this.module.getClass().getMethod("enableBillingProgram", BillingProgramAndroid.class).invoke(this.module, program);
            OpenIapLog.INSTANCE.d("Billing program enabled via store: " + program, "OpenIapStore");
        } catch (NoSuchMethodException unused) {
            OpenIapLog.INSTANCE.w("enableBillingProgram not available (Horizon flavor or older library)", "OpenIapStore");
        } catch (Exception e) {
            OpenIapLog.INSTANCE.e("Failed to enable billing program: " + e.getMessage(), e, "OpenIapStore");
        }
    }

    public final void addPurchaseUpdateListener(OpenIapPurchaseUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.addPurchaseUpdateListener(listener);
    }

    public final void removePurchaseUpdateListener(OpenIapPurchaseUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.removePurchaseUpdateListener(listener);
    }

    public final void addPurchaseErrorListener(OpenIapPurchaseErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.addPurchaseErrorListener(listener);
    }

    public final void removePurchaseErrorListener(OpenIapPurchaseErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.removePurchaseErrorListener(listener);
    }

    public final void addUserChoiceBillingListener(OpenIapUserChoiceBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.addUserChoiceBillingListener(listener);
    }

    public final void removeUserChoiceBillingListener(OpenIapUserChoiceBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.removeUserChoiceBillingListener(listener);
    }

    public final void addDeveloperProvidedBillingListener(OpenIapDeveloperProvidedBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.addDeveloperProvidedBillingListener(listener);
    }

    public final void removeDeveloperProvidedBillingListener(OpenIapDeveloperProvidedBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.module.removeDeveloperProvidedBillingListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoading(Function1<? super LoadingStates, Unit> block) {
        IapStatus value = this._status.getValue();
        LoadingStates copy$default = LoadingStates.copy$default(value.getLoadings(), false, false, false, null, 15, null);
        block.invoke(copy$default);
        this._status.setValue(IapStatus.copy$default(value, copy$default, null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setError(String message) {
        setStatusMessage$default(this, message == null ? "Operation failed" : message, PurchaseResultStatus.Error, null, null, null, 28, null);
        MutableStateFlow<IapStatus> mutableStateFlow = this._status;
        mutableStateFlow.setValue(IapStatus.copy$default(mutableStateFlow.getValue(), null, null, message != null ? new ErrorData(OtelAttributes.OtelStatusCodeValues.ERROR, message, null, 0L, 12, null) : null, null, null, 27, null));
    }

    static /* synthetic */ void setStatusMessage$default(OpenIapStore openIapStore, String str, PurchaseResultStatus purchaseResultStatus, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        openIapStore.setStatusMessage(str, purchaseResultStatus, str2, str3, str4);
    }

    private final void setStatusMessage(String message, PurchaseResultStatus status, String productId, String transactionId, String code) {
        MutableStateFlow<IapStatus> mutableStateFlow = this._status;
        mutableStateFlow.setValue(IapStatus.copy$default(mutableStateFlow.getValue(), null, new PurchaseResultData(productId, transactionId, message, status, code, 0L, 32, null), null, null, null, 29, null));
    }

    public static /* synthetic */ void postStatusMessage$default(OpenIapStore openIapStore, String str, PurchaseResultStatus purchaseResultStatus, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        openIapStore.postStatusMessage(str, purchaseResultStatus, str2);
    }

    public final void postStatusMessage(String message, PurchaseResultStatus status, String productId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        setStatusMessage$default(this, message, status, productId, null, null, 24, null);
        MutableStateFlow<IapStatus> mutableStateFlow = this._status;
        mutableStateFlow.setValue(IapStatus.copy$default(mutableStateFlow.getValue(), null, null, status == PurchaseResultStatus.Error ? new ErrorData(OtelAttributes.OtelStatusCodeValues.ERROR, message, null, 0L, 12, null) : null, null, null, 27, null));
    }

    public final void clearStatusMessage() {
        MutableStateFlow<IapStatus> mutableStateFlow = this._status;
        mutableStateFlow.setValue(IapStatus.copy$default(mutableStateFlow.getValue(), null, null, null, null, null, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPurchasing(String productId) {
        IapStatus value = this._status.getValue();
        Set mutableSet = CollectionsKt.toMutableSet(value.getLoadings().getPurchasing());
        mutableSet.add(productId);
        this._status.setValue(IapStatus.copy$default(value, LoadingStates.copy$default(value.getLoadings(), false, false, false, mutableSet, 7, null), null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePurchasing(String productId) {
        IapStatus value = this._status.getValue();
        Set mutableSet = CollectionsKt.toMutableSet(value.getLoadings().getPurchasing());
        mutableSet.remove(productId);
        this._status.setValue(IapStatus.copy$default(value, LoadingStates.copy$default(value.getLoadings(), false, false, false, mutableSet, 7, null), null, null, null, null, 30, null));
    }
}
