package dev.hyo.openiap;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.helpers.ProductManager;
import dev.hyo.openiap.listener.DeveloperProvidedBillingDetails;
import dev.hyo.openiap.listener.DeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapDeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import dev.hyo.openiap.listener.OpenIapUserChoiceBillingListener;
import dev.hyo.openiap.listener.UserChoiceBillingListener;
import dev.hyo.openiap.listener.UserChoiceDetails;
import dev.hyo.openiap.utils.BillingConverters;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000Ò\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 Â\u00012\u00020\u00012\u00020\u0002:\u0002Â\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u000e\u0010P\u001a\u00020\u000eH\u0097@¢\u0006\u0002\u0010QJ\u0016\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u0014H\u0097@¢\u0006\u0002\u0010TJ\u0010\u0010U\u001a\u0004\u0018\u00010HH\u0097@¢\u0006\u0002\u0010QJ\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020*H\u0096@¢\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010X\u001a\u00020*H\u0096@¢\u0006\u0002\u0010YJ\u001e\u0010\\\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u00142\u0006\u0010>\u001a\u00020]H\u0096@¢\u0006\u0002\u0010^J\u000e\u0010_\u001a\u00020(2\u0006\u0010X\u001a\u00020*J\u001c\u0010e\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010f\u001a\u00020gH\u0086@¢\u0006\u0002\u0010hJ\u000f\u0010¡\u0001\u001a\u00020HH\u0086@¢\u0006\u0002\u0010QJ\u0012\u0010¢\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020\u001cH\u0016J\u0012\u0010¤\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020\u001cH\u0016J\u0012\u0010¥\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020\u001eH\u0016J\u0012\u0010¦\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020\u001eH\u0016J\u0012\u0010§\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020 H\u0016J\u0012\u0010¨\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020 H\u0016J\u0012\u0010©\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020\"H\u0016J\u0012\u0010ª\u0001\u001a\u00020(2\u0007\u0010£\u0001\u001a\u00020\"H\u0016J%\u0010«\u0001\u001a\u00020(2\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0010\u0010®\u0001\u001a\u000b\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010&H\u0016J\t\u0010°\u0001\u001a\u00020(H\u0002J8\u0010±\u0001\u001a\u00020(2\u0013\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020(0$2\u0018\b\u0002\u0010³\u0001\u001a\u0011\u0012\u0007\u0012\u0005\u0018\u00010´\u0001\u0012\u0004\u0012\u00020(0$H\u0002J\u0013\u0010µ\u0001\u001a\u00020(2\b\u0010S\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010¶\u0001\u001a\u00020(2\t\u0010£\u0001\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010·\u0001\u001a\u00020(2\t\u0010£\u0001\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010¸\u0001\u001a\u00020(2\b\u0010¹\u0001\u001a\u00030º\u00012\u0007\u0010>\u001a\u00030»\u0001H\u0002J\u0013\u0010¼\u0001\u001a\u00020(2\b\u0010¹\u0001\u001a\u00030½\u0001H\u0002J\u001c\u0010¾\u0001\u001a\u00020(2\b\u0010¿\u0001\u001a\u00030À\u00012\u0007\u0010>\u001a\u00030Á\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010#\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%\u0012\u0004\u0012\u00020(\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000RG\u0010+\u001a3\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`3X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R0\u00107\u001a\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e01\u0012\u0006\u0012\u0004\u0018\u0001020$j\u0002`8X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:RE\u0010<\u001a1\b\u0001\u0012\u0013\u0012\u00110=¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(>\u0012\n\u0012\b\u0012\u0004\u0012\u00020?01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`@X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bA\u00105RM\u0010B\u001a9\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010C¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`EX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bF\u00105RS\u0010G\u001a?\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020H\u0018\u00010&¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(I\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0&01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`KX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bL\u00105RM\u0010M\u001a9\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020H\u0018\u00010&¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(I\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`NX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bO\u00105RG\u0010`\u001a3\b\u0001\u0012\u0013\u0012\u00110a¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(>\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010b01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`cX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bd\u00105Ro\u0010i\u001a[\b\u0001\u0012&\u0012$0'j\u0011`l¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(k¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(k\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(m\u0012\n\u0012\b\u0012\u0004\u0012\u00020(01\u0012\u0006\u0012\u0004\u0018\u0001020jj\u0002`nX\u0096\u0004¢\u0006\n\n\u0002\u0010q\u001a\u0004\bo\u0010pRE\u0010r\u001a1\b\u0001\u0012\u0013\u0012\u00110H¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(s\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`tX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bu\u00105RE\u0010v\u001a1\b\u0001\u0012\u0013\u0012\u00110H¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(s\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`wX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bx\u00105RG\u0010y\u001a3\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010z¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\n\u0012\b\u0012\u0004\u0012\u00020(01\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0002`{X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b|\u00105R0\u0010}\u001a\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020(01\u0012\u0006\u0012\u0004\u0018\u0001020$j\u0002`~X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b\u007f\u0010:RT\u0010\u0080\u0001\u001a4\b\u0001\u0012\u0014\u0012\u00120\u0081\u0001¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0082\u000101\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0003`\u0083\u00018\u0016X\u0097\u0004¢\u0006\u0013\n\u0002\u00106\u0012\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u00105RJ\u0010\u0087\u0001\u001a4\b\u0001\u0012\u0014\u0012\u00120\u0081\u0001¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0082\u000101\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0003`\u0088\u0001X\u0096\u0004¢\u0006\u000b\n\u0002\u00106\u001a\u0005\b\u0089\u0001\u00105RJ\u0010\u008a\u0001\u001a4\b\u0001\u0012\u0014\u0012\u00120\u008b\u0001¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(D\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u000101\u0012\u0006\u0012\u0004\u0018\u0001020,j\u0003`\u008d\u0001X\u0096\u0004¢\u0006\u000b\n\u0002\u00106\u001a\u0005\b\u008e\u0001\u00105R-\u0010\u008f\u0001\u001a\u001e\b\u0001\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0090\u000101\u0012\u0006\u0012\u0004\u0018\u0001020$j\u0003`\u0091\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;R,\u0010\u0092\u0001\u001a\u001d\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020'01\u0012\u0006\u0012\u0004\u0018\u0001020$j\u0003`\u0093\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;R\u0018\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u0098\u0001\u001a\u00030\u0099\u0001X\u0096\u0004¢\u0006\u0012\n\u0000\u0012\u0006\b\u009a\u0001\u0010\u0085\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009e\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001¨\u0006Ã\u0001"}, d2 = {"Ldev/hyo/openiap/OpenIapModule;", "Ldev/hyo/openiap/OpenIapProtocol;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "context", "Landroid/content/Context;", "alternativeBillingMode", "Ldev/hyo/openiap/AlternativeBillingMode;", "userChoiceBillingListener", "Ldev/hyo/openiap/listener/UserChoiceBillingListener;", "developerProvidedBillingListener", "Ldev/hyo/openiap/listener/DeveloperProvidedBillingListener;", "<init>", "(Landroid/content/Context;Ldev/hyo/openiap/AlternativeBillingMode;Ldev/hyo/openiap/listener/UserChoiceBillingListener;Ldev/hyo/openiap/listener/DeveloperProvidedBillingListener;)V", "enableAlternativeBilling", "", "(Landroid/content/Context;Z)V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "currentActivityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "productManager", "Ldev/hyo/openiap/helpers/ProductManager;", "gson", "Lcom/google/gson/Gson;", "fallbackActivity", "purchaseUpdateListeners", "", "Ldev/hyo/openiap/listener/OpenIapPurchaseUpdateListener;", "purchaseErrorListeners", "Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;", "userChoiceBillingListeners", "Ldev/hyo/openiap/listener/OpenIapUserChoiceBillingListener;", "developerProvidedBillingListeners", "Ldev/hyo/openiap/listener/OpenIapDeveloperProvidedBillingListener;", "currentPurchaseCallback", "Lkotlin/Function1;", "Lkotlin/Result;", "", "Ldev/hyo/openiap/Purchase;", "", "enabledBillingPrograms", "Ldev/hyo/openiap/BillingProgramAndroid;", "initConnection", "Lkotlin/Function2;", "Ldev/hyo/openiap/InitConnectionConfig;", "Lkotlin/ParameterName;", "name", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lkotlin/coroutines/Continuation;", "", "Ldev/hyo/openiap/MutationInitConnectionHandler;", "getInitConnection", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "endConnection", "Ldev/hyo/openiap/MutationEndConnectionHandler;", "getEndConnection", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "fetchProducts", "Ldev/hyo/openiap/ProductRequest;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/FetchProductsResult;", "Ldev/hyo/openiap/QueryFetchProductsHandler;", "getFetchProducts", "getAvailablePurchases", "Ldev/hyo/openiap/PurchaseOptions;", "options", "Ldev/hyo/openiap/QueryGetAvailablePurchasesHandler;", "getGetAvailablePurchases", "getActiveSubscriptions", "", "subscriptionIds", "Ldev/hyo/openiap/ActiveSubscription;", "Ldev/hyo/openiap/QueryGetActiveSubscriptionsHandler;", "getGetActiveSubscriptions", "hasActiveSubscriptions", "Ldev/hyo/openiap/QueryHasActiveSubscriptionsHandler;", "getHasActiveSubscriptions", "checkAlternativeBillingAvailability", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAlternativeBillingInformationDialog", "activity", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAlternativeBillingReportingToken", "isBillingProgramAvailable", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "program", "(Ldev/hyo/openiap/BillingProgramAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBillingProgramReportingDetails", "Ldev/hyo/openiap/BillingProgramReportingDetailsAndroid;", "launchExternalLink", "Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", "(Landroid/app/Activity;Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableBillingProgram", "requestPurchase", "Ldev/hyo/openiap/RequestPurchaseProps;", "Ldev/hyo/openiap/RequestPurchaseResult;", "Ldev/hyo/openiap/MutationRequestPurchaseHandler;", "getRequestPurchase", "getAvailableItems", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductQueryType;", "(Ldev/hyo/openiap/ProductQueryType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishTransaction", "Lkotlin/Function3;", "purchase", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", "Ldev/hyo/openiap/MutationFinishTransactionHandler;", "getFinishTransaction", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "acknowledgePurchaseAndroid", "purchaseToken", "Ldev/hyo/openiap/MutationAcknowledgePurchaseAndroidHandler;", "getAcknowledgePurchaseAndroid", "consumePurchaseAndroid", "Ldev/hyo/openiap/MutationConsumePurchaseAndroidHandler;", "getConsumePurchaseAndroid", "deepLinkToSubscriptions", "Ldev/hyo/openiap/DeepLinkOptions;", "Ldev/hyo/openiap/MutationDeepLinkToSubscriptionsHandler;", "getDeepLinkToSubscriptions", "restorePurchases", "Ldev/hyo/openiap/MutationRestorePurchasesHandler;", "getRestorePurchases", "validateReceipt", "Ldev/hyo/openiap/VerifyPurchaseProps;", "Ldev/hyo/openiap/VerifyPurchaseResult;", "Ldev/hyo/openiap/MutationValidateReceiptHandler;", "getValidateReceipt$annotations", "()V", "getValidateReceipt", "verifyPurchase", "Ldev/hyo/openiap/MutationVerifyPurchaseHandler;", "getVerifyPurchase", "verifyPurchaseWithProvider", "Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;", "Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "Ldev/hyo/openiap/MutationVerifyPurchaseWithProviderHandler;", "getVerifyPurchaseWithProvider", "purchaseError", "Ldev/hyo/openiap/PurchaseError;", "Ldev/hyo/openiap/SubscriptionPurchaseErrorHandler;", "purchaseUpdated", "Ldev/hyo/openiap/SubscriptionPurchaseUpdatedHandler;", "queryHandlers", "Ldev/hyo/openiap/QueryHandlers;", "getQueryHandlers", "()Ldev/hyo/openiap/QueryHandlers;", "mutationHandlers", "Ldev/hyo/openiap/MutationHandlers;", "getMutationHandlers$annotations", "getMutationHandlers", "()Ldev/hyo/openiap/MutationHandlers;", "subscriptionHandlers", "Ldev/hyo/openiap/SubscriptionHandlers;", "getSubscriptionHandlers", "()Ldev/hyo/openiap/SubscriptionHandlers;", "getStorefront", "addPurchaseUpdateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removePurchaseUpdateListener", "addPurchaseErrorListener", "removePurchaseErrorListener", "addUserChoiceBillingListener", "removeUserChoiceBillingListener", "addDeveloperProvidedBillingListener", "removeDeveloperProvidedBillingListener", "onPurchasesUpdated", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchases", "Lcom/android/billingclient/api/Purchase;", "buildBillingClient", "initBillingClient", "onSuccess", "onFailure", "", "setActivity", "setUserChoiceBillingListener", "setDeveloperProvidedBillingListener", "applySubscriptionProductReplacementParams", "builder", "Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;", "Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "enableExternalPaymentsProgram", "Lcom/android/billingclient/api/BillingClient$Builder;", "applyDeveloperBillingOption", "flowBuilder", "Lcom/android/billingclient/api/BillingFlowParams$Builder;", "Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapModule implements OpenIapProtocol, PurchasesUpdatedListener {
    private static final String TAG = "OpenIapModule";
    private final Function2<String, Continuation<? super Boolean>, Object> acknowledgePurchaseAndroid;
    private AlternativeBillingMode alternativeBillingMode;
    private BillingClient billingClient;
    private final Function2<String, Continuation<? super Boolean>, Object> consumePurchaseAndroid;
    private final Context context;
    private WeakReference<Activity> currentActivityRef;
    private Function1<? super Result<? extends List<? extends Purchase>>, Unit> currentPurchaseCallback;
    private final Function2<DeepLinkOptions, Continuation<? super Unit>, Object> deepLinkToSubscriptions;
    private DeveloperProvidedBillingListener developerProvidedBillingListener;
    private final Set<OpenIapDeveloperProvidedBillingListener> developerProvidedBillingListeners;
    private final Set<BillingProgramAndroid> enabledBillingPrograms;
    private final Function1<Continuation<? super Boolean>, Object> endConnection;
    private final Activity fallbackActivity;
    private final Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts;
    private final Function3<Purchase, Boolean, Continuation<? super Unit>, Object> finishTransaction;
    private final Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getActiveSubscriptions;
    private final Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getAvailablePurchases;
    private final Gson gson;
    private final Function2<List<String>, Continuation<? super Boolean>, Object> hasActiveSubscriptions;
    private final Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> initConnection;
    private final MutationHandlers mutationHandlers;
    private final ProductManager productManager;
    private final Function1<Continuation<? super PurchaseError>, Object> purchaseError;
    private final Set<OpenIapPurchaseErrorListener> purchaseErrorListeners;
    private final Set<OpenIapPurchaseUpdateListener> purchaseUpdateListeners;
    private final Function1<Continuation<? super Purchase>, Object> purchaseUpdated;
    private final QueryHandlers queryHandlers;
    private final Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> requestPurchase;
    private final Function1<Continuation<? super Unit>, Object> restorePurchases;
    private final SubscriptionHandlers subscriptionHandlers;
    private UserChoiceBillingListener userChoiceBillingListener;
    private final Set<OpenIapUserChoiceBillingListener> userChoiceBillingListeners;
    private final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> validateReceipt;
    private final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> verifyPurchase;
    private final Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> verifyPurchaseWithProvider;
    public static final int $stable = 8;

    /* compiled from: OpenIapModule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AlternativeBillingMode.values().length];
            try {
                iArr[AlternativeBillingMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlternativeBillingMode.USER_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlternativeBillingMode.ALTERNATIVE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BillingProgramAndroid.values().length];
            try {
                iArr2[BillingProgramAndroid.ExternalContentLink.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BillingProgramAndroid.ExternalOffer.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BillingProgramAndroid.ExternalPayments.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BillingProgramAndroid.UserChoiceBilling.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BillingProgramAndroid.Unspecified.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DeveloperBillingLaunchModeAndroid.values().length];
            try {
                iArr3[DeveloperBillingLaunchModeAndroid.LaunchInExternalBrowserOrApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DeveloperBillingLaunchModeAndroid.CallerWillLaunchLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DeveloperBillingLaunchModeAndroid.Unspecified.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ void getMutationHandlers$annotations() {
    }

    @Deprecated(message = "Use verifyPurchase")
    public static /* synthetic */ void getValidateReceipt$annotations() {
    }

    public OpenIapModule(Context context, AlternativeBillingMode alternativeBillingMode, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(alternativeBillingMode, "alternativeBillingMode");
        this.context = context;
        this.alternativeBillingMode = alternativeBillingMode;
        this.userChoiceBillingListener = userChoiceBillingListener;
        this.developerProvidedBillingListener = developerProvidedBillingListener;
        this.productManager = new ProductManager();
        this.gson = new Gson();
        this.fallbackActivity = context instanceof Activity ? (Activity) context : null;
        this.purchaseUpdateListeners = new LinkedHashSet();
        this.purchaseErrorListeners = new LinkedHashSet();
        this.userChoiceBillingListeners = new LinkedHashSet();
        this.developerProvidedBillingListeners = new LinkedHashSet();
        this.enabledBillingPrograms = new LinkedHashSet();
        this.initConnection = new OpenIapModule$initConnection$1(this, null);
        this.endConnection = new OpenIapModule$endConnection$1(this, null);
        this.fetchProducts = new OpenIapModule$fetchProducts$1(this, null);
        this.getAvailablePurchases = new OpenIapModule$getAvailablePurchases$1(this, null);
        this.getActiveSubscriptions = new OpenIapModule$getActiveSubscriptions$1(this, null);
        this.hasActiveSubscriptions = new OpenIapModule$hasActiveSubscriptions$1(this, null);
        this.requestPurchase = new OpenIapModule$requestPurchase$1(this, null);
        this.finishTransaction = new OpenIapModule$finishTransaction$1(this, null);
        this.acknowledgePurchaseAndroid = new OpenIapModule$acknowledgePurchaseAndroid$1(this, null);
        this.consumePurchaseAndroid = new OpenIapModule$consumePurchaseAndroid$1(this, null);
        this.deepLinkToSubscriptions = new OpenIapModule$deepLinkToSubscriptions$1(this, null);
        this.restorePurchases = new OpenIapModule$restorePurchases$1(this, null);
        this.validateReceipt = new OpenIapModule$validateReceipt$1(this, null);
        this.verifyPurchase = new OpenIapModule$verifyPurchase$1(null);
        this.verifyPurchaseWithProvider = new OpenIapModule$verifyPurchaseWithProvider$1(null);
        OpenIapModule$purchaseError$1 openIapModule$purchaseError$1 = new OpenIapModule$purchaseError$1(this, null);
        this.purchaseError = openIapModule$purchaseError$1;
        OpenIapModule$purchaseUpdated$1 openIapModule$purchaseUpdated$1 = new OpenIapModule$purchaseUpdated$1(this, null);
        this.purchaseUpdated = openIapModule$purchaseUpdated$1;
        this.queryHandlers = new QueryHandlers(null, null, getFetchProducts(), getGetActiveSubscriptions(), null, getGetAvailablePurchases(), null, null, null, null, null, new OpenIapModule$queryHandlers$1(this, null), null, getHasActiveSubscriptions(), null, null, null, null, null, null, 1038291, null);
        this.mutationHandlers = new MutationHandlers(getAcknowledgePurchaseAndroid(), null, null, null, getConsumePurchaseAndroid(), null, null, getDeepLinkToSubscriptions(), getEndConnection(), getFinishTransaction(), getInitConnection(), null, null, null, null, null, getRequestPurchase(), null, getRestorePurchases(), null, null, null, null, getValidateReceipt(), getVerifyPurchase(), getVerifyPurchaseWithProvider(), 8058990, null);
        this.subscriptionHandlers = new SubscriptionHandlers(null, null, openIapModule$purchaseError$1, openIapModule$purchaseUpdated$1, null, 19, null);
    }

    public /* synthetic */ OpenIapModule(Context context, AlternativeBillingMode alternativeBillingMode, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? AlternativeBillingMode.NONE : alternativeBillingMode, (i & 4) != 0 ? null : userChoiceBillingListener, (i & 8) != 0 ? null : developerProvidedBillingListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenIapModule(Context context, boolean z) {
        this(context, z ? AlternativeBillingMode.ALTERNATIVE_ONLY : AlternativeBillingMode.NONE, null, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> getInitConnection() {
        return this.initConnection;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function1<Continuation<? super Boolean>, Object> getEndConnection() {
        return this.endConnection;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> getFetchProducts() {
        return this.fetchProducts;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getGetAvailablePurchases() {
        return this.getAvailablePurchases;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getGetActiveSubscriptions() {
        return this.getActiveSubscriptions;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<List<String>, Continuation<? super Boolean>, Object> getHasActiveSubscriptions() {
        return this.hasActiveSubscriptions;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    @Deprecated(message = "Use isBillingProgramAvailable with BillingProgramAndroid.ExternalOffer instead")
    public Object checkAlternativeBillingAvailability(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$checkAlternativeBillingAvailability$2(this, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    @Deprecated(message = "Use launchExternalLink instead")
    public Object showAlternativeBillingInformationDialog(Activity activity, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$showAlternativeBillingInformationDialog$2(this, activity, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    @Deprecated(message = "Use createBillingProgramReportingDetails with BillingProgramAndroid.ExternalOffer instead")
    public Object createAlternativeBillingReportingToken(Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$createAlternativeBillingReportingToken$2(this, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Object isBillingProgramAvailable(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$isBillingProgramAvailable$2(this, billingProgramAndroid, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Object createBillingProgramReportingDetails(BillingProgramAndroid billingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$createBillingProgramReportingDetails$2(this, billingProgramAndroid, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Object launchExternalLink(Activity activity, LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$launchExternalLink$2(this, launchExternalLinkParamsAndroid, activity, null), continuation);
    }

    public final void enableBillingProgram(BillingProgramAndroid program) {
        Intrinsics.checkNotNullParameter(program, "program");
        if (program != BillingProgramAndroid.Unspecified) {
            this.enabledBillingPrograms.add(program);
            OpenIapLog.INSTANCE.d("Billing program enabled: " + program, TAG);
        }
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> getRequestPurchase() {
        return this.requestPurchase;
    }

    public final Object getAvailableItems(ProductQueryType productQueryType, Continuation<? super List<? extends Purchase>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$getAvailableItems$2(productQueryType, this, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function3<Purchase, Boolean, Continuation<? super Unit>, Object> getFinishTransaction() {
        return this.finishTransaction;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<String, Continuation<? super Boolean>, Object> getAcknowledgePurchaseAndroid() {
        return this.acknowledgePurchaseAndroid;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<String, Continuation<? super Boolean>, Object> getConsumePurchaseAndroid() {
        return this.consumePurchaseAndroid;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<DeepLinkOptions, Continuation<? super Unit>, Object> getDeepLinkToSubscriptions() {
        return this.deepLinkToSubscriptions;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function1<Continuation<? super Unit>, Object> getRestorePurchases() {
        return this.restorePurchases;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> getValidateReceipt() {
        return this.validateReceipt;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> getVerifyPurchase() {
        return this.verifyPurchase;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> getVerifyPurchaseWithProvider() {
        return this.verifyPurchaseWithProvider;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public QueryHandlers getQueryHandlers() {
        return this.queryHandlers;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public MutationHandlers getMutationHandlers() {
        return this.mutationHandlers;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public SubscriptionHandlers getSubscriptionHandlers() {
        return this.subscriptionHandlers;
    }

    public final Object getStorefront(Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$getStorefront$2(this, null), continuation);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void addPurchaseUpdateListener(OpenIapPurchaseUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.purchaseUpdateListeners.add(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void removePurchaseUpdateListener(OpenIapPurchaseUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.purchaseUpdateListeners.remove(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void addPurchaseErrorListener(OpenIapPurchaseErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.purchaseErrorListeners.add(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void removePurchaseErrorListener(OpenIapPurchaseErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.purchaseErrorListeners.remove(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void addUserChoiceBillingListener(OpenIapUserChoiceBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.userChoiceBillingListeners.add(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void removeUserChoiceBillingListener(OpenIapUserChoiceBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.userChoiceBillingListeners.remove(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void addDeveloperProvidedBillingListener(OpenIapDeveloperProvidedBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.developerProvidedBillingListeners.add(listener);
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void removeDeveloperProvidedBillingListener(OpenIapDeveloperProvidedBillingListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.developerProvidedBillingListeners.remove(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPurchasesUpdated(BillingResult billingResult, List<? extends com.android.billingclient.api.Purchase> purchases) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        OpenIapLog.INSTANCE.d("onPurchasesUpdated: code=" + billingResult.getResponseCode() + " msg=" + billingResult.getDebugMessage() + " count=" + (purchases != null ? purchases.size() : 0), TAG);
        if (purchases != null) {
            int i = 0;
            for (com.android.billingclient.api.Purchase purchase : purchases) {
                OpenIapLog.INSTANCE.d("[Purchase " + i + "] token=" + purchase.getPurchaseToken() + " orderId=" + purchase.getOrderId() + " state=" + purchase.getPurchaseState() + " autoRenew=" + purchase.isAutoRenewing() + " acknowledged=" + purchase.isAcknowledged() + " products=" + purchase.getProducts(), TAG);
                i++;
            }
        }
        if (billingResult.getResponseCode() == 0) {
            if (purchases != null) {
                List<? extends com.android.billingclient.api.Purchase> list = purchases;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.android.billingclient.api.Purchase purchase2 : list) {
                    List<String> products = purchase2.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                    String str3 = (String) CollectionsKt.firstOrNull((List) products);
                    ProductDetails productDetails = str3 != null ? this.productManager.get(str3) : null;
                    if (productDetails == null || (str = productDetails.getProductType()) == null) {
                        List<String> products2 = purchase2.getProducts();
                        Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
                        List<String> list2 = products2;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (String str4 : list2) {
                                Intrinsics.checkNotNull(str4);
                                if (StringsKt.contains((CharSequence) str4, (CharSequence) "subs", true)) {
                                    str = "subs";
                                    break;
                                }
                            }
                        }
                        str = "inapp";
                    }
                    if (Intrinsics.areEqual(str, "subs")) {
                        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails != null ? productDetails.getSubscriptionOfferDetails() : null;
                        if (subscriptionOfferDetails == null) {
                            subscriptionOfferDetails = CollectionsKt.emptyList();
                        }
                        if (subscriptionOfferDetails.size() > 1) {
                            OpenIapLog.INSTANCE.w("Multiple offers (" + subscriptionOfferDetails.size() + ") found for " + str3 + ", using first basePlanId (may be inaccurate)", TAG);
                        }
                        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails);
                        if (subscriptionOfferDetails2 != null) {
                            str2 = subscriptionOfferDetails2.getBasePlanId();
                            OpenIapLog.INSTANCE.d("Mapping purchase products=" + purchase2.getProducts() + " to type=" + str + " basePlanId=" + str2 + " (cached=" + (productDetails == null) + ")", TAG);
                            arrayList.add(BillingConverters.INSTANCE.toPurchase(purchase2, str, str2));
                        }
                    }
                    str2 = null;
                    OpenIapLog.INSTANCE.d("Mapping purchase products=" + purchase2.getProducts() + " to type=" + str + " basePlanId=" + str2 + " (cached=" + (productDetails == null) + ")", TAG);
                    arrayList.add(BillingConverters.INSTANCE.toPurchase(purchase2, str, str2));
                }
                ArrayList<PurchaseAndroid> arrayList2 = arrayList;
                OpenIapLog.INSTANCE.d("Mapped purchases=" + this.gson.toJson(arrayList2), TAG);
                for (PurchaseAndroid purchaseAndroid : arrayList2) {
                    for (OpenIapPurchaseUpdateListener openIapPurchaseUpdateListener : this.purchaseUpdateListeners) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            OpenIapModule openIapModule = this;
                            openIapPurchaseUpdateListener.onPurchaseUpdated(purchaseAndroid);
                            Result.m3984constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m3984constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                }
                Function1<? super Result<? extends List<? extends Purchase>>, Unit> function1 = this.currentPurchaseCallback;
                if (function1 != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    function1.invoke(Result.m3983boximpl(Result.m3984constructorimpl(arrayList2)));
                }
            } else {
                OpenIapLog.INSTANCE.d("Purchase successful but purchases list is null (DEFERRED mode)", TAG);
                Function1<? super Result<? extends List<? extends Purchase>>, Unit> function12 = this.currentPurchaseCallback;
                if (function12 != null) {
                    Result.Companion companion4 = Result.INSTANCE;
                    function12.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                }
            }
        } else if (billingResult.getResponseCode() == 1) {
            OpenIapError.UserCancelled userCancelled = OpenIapError.UserCancelled.INSTANCE;
            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener : this.purchaseErrorListeners) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    OpenIapModule openIapModule2 = this;
                    openIapPurchaseErrorListener.onPurchaseError(userCancelled);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion6 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th2));
                }
            }
            Function1<? super Result<? extends List<? extends Purchase>>, Unit> function13 = this.currentPurchaseCallback;
            if (function13 != null) {
                Result.Companion companion7 = Result.INSTANCE;
                function13.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
            }
        } else {
            OpenIapError fromBillingResponseCode = OpenIapErrorExtensionsKt.fromBillingResponseCode(OpenIapError.INSTANCE, billingResult.getResponseCode(), billingResult.getDebugMessage());
            OpenIapLog.INSTANCE.w("Purchase failed: code=" + billingResult.getResponseCode() + " msg=" + fromBillingResponseCode.getMessage(), TAG);
            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener2 : this.purchaseErrorListeners) {
                try {
                    Result.Companion companion8 = Result.INSTANCE;
                    OpenIapModule openIapModule3 = this;
                    openIapPurchaseErrorListener2.onPurchaseError(fromBillingResponseCode);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion9 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th3));
                }
            }
            Function1<? super Result<? extends List<? extends Purchase>>, Unit> function14 = this.currentPurchaseCallback;
            if (function14 != null) {
                Result.Companion companion10 = Result.INSTANCE;
                function14.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
            }
        }
        this.currentPurchaseCallback = null;
    }

    private final void buildBillingClient() {
        int i;
        OpenIapLog.INSTANCE.d("=== buildBillingClient START ===", TAG);
        OpenIapLog.INSTANCE.d("alternativeBillingMode: " + this.alternativeBillingMode, TAG);
        BillingClient.Builder enableAutoServiceReconnection = BillingClient.newBuilder(this.context).setListener(this).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).enableAutoServiceReconnection();
        Intrinsics.checkNotNullExpressionValue(enableAutoServiceReconnection, "enableAutoServiceReconnection(...)");
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.alternativeBillingMode.ordinal()];
        if (i2 == 1) {
            OpenIapLog.INSTANCE.d("Standard Google Play billing mode", TAG);
        } else if (i2 == 2) {
            OpenIapLog.INSTANCE.d("=== USER CHOICE BILLING INITIALIZATION ===", TAG);
            try {
                Class<?> cls = Class.forName("com.android.billingclient.api.UserChoiceBillingListener");
                enableAutoServiceReconnection.getClass().getMethod("enableUserChoiceBilling", cls).invoke(enableAutoServiceReconnection, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$$ExternalSyntheticLambda1
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        Object buildBillingClient$lambda$9;
                        buildBillingClient$lambda$9 = OpenIapModule.buildBillingClient$lambda$9(OpenIapModule.this, obj, method, objArr);
                        return buildBillingClient$lambda$9;
                    }
                }));
                OpenIapLog.INSTANCE.d("✓ User choice billing enabled successfully", TAG);
                if (this.userChoiceBillingListener != null) {
                    OpenIapLog.INSTANCE.d("✓ UserChoiceBillingListener registered", TAG);
                } else {
                    OpenIapLog.INSTANCE.w("⚠ No UserChoiceBillingListener provided", TAG);
                }
            } catch (Exception e) {
                OpenIapLog.INSTANCE.w("✗ Failed to enable user choice billing: " + e.getClass().getSimpleName() + ": " + e.getMessage(), TAG);
                OpenIapLog.INSTANCE.w("User choice billing requires Billing Library 7.0+ and Google Play Console setup", TAG);
            }
            OpenIapLog.INSTANCE.d("=== END USER CHOICE BILLING INITIALIZATION ===", TAG);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            OpenIapLog.INSTANCE.d("=== ALTERNATIVE BILLING ONLY INITIALIZATION ===", TAG);
            try {
                Method[] methods = enableAutoServiceReconnection.getClass().getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                Method[] methodArr = methods;
                ArrayList arrayList = new ArrayList(methodArr.length);
                for (Method method : methodArr) {
                    arrayList.add(method.getName());
                }
                OpenIapLog.INSTANCE.d("All BillingClient.Builder methods: " + CollectionsKt.sorted(arrayList), TAG);
            } catch (Exception e2) {
                OpenIapLog.INSTANCE.w("Could not list methods: " + e2.getMessage(), TAG);
            }
            try {
                OpenIapLog.INSTANCE.d("Attempting to call enableAlternativeBillingOnly()...", TAG);
                Method method2 = enableAutoServiceReconnection.getClass().getMethod("enableAlternativeBillingOnly", new Class[0]);
                OpenIapLog.INSTANCE.d("Method found: " + method2, TAG);
                method2.invoke(enableAutoServiceReconnection, new Object[0]);
                OpenIapLog.INSTANCE.d("✓ Alternative billing only enabled successfully", TAG);
            } catch (NoSuchMethodException e3) {
                OpenIapLog.INSTANCE.e("✗ enableAlternativeBillingOnly() method not found", e3, TAG);
                OpenIapLog.e$default(OpenIapLog.INSTANCE, "This method requires Billing Library 6.2+", null, TAG, 2, null);
                OpenIapLog.e$default(OpenIapLog.INSTANCE, "Current library version: 8.1.0", null, TAG, 2, null);
                OpenIapLog.e$default(OpenIapLog.INSTANCE, "Alternative billing will NOT work - standard Google Play billing will be used", null, TAG, 2, null);
            } catch (Exception e4) {
                OpenIapLog.INSTANCE.e("✗ Failed to enable alternative billing only: " + e4.getClass().getSimpleName() + ": " + e4.getMessage(), e4, TAG);
            }
            OpenIapLog.INSTANCE.d("=== END ALTERNATIVE BILLING ONLY INITIALIZATION ===", TAG);
        }
        if (!this.enabledBillingPrograms.isEmpty()) {
            OpenIapLog.INSTANCE.d("=== BILLING PROGRAMS INITIALIZATION ===", TAG);
            for (BillingProgramAndroid billingProgramAndroid : this.enabledBillingPrograms) {
                if (billingProgramAndroid == BillingProgramAndroid.UserChoiceBilling) {
                    OpenIapLog.INSTANCE.d("✓ User Choice Billing handled via AlternativeBillingMode", TAG);
                } else {
                    int i3 = WhenMappings.$EnumSwitchMapping$1[billingProgramAndroid.ordinal()];
                    if (i3 == 1) {
                        i = 1;
                    } else if (i3 != 2) {
                        i = 4;
                        if (i3 != 3) {
                            if (i3 != 4 && i3 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        i = 3;
                    }
                    if (billingProgramAndroid == BillingProgramAndroid.ExternalPayments) {
                        try {
                            enableExternalPaymentsProgram(enableAutoServiceReconnection);
                            OpenIapLog.INSTANCE.d("✓ External Payments program enabled (8.3.0+)", TAG);
                        } catch (NoSuchMethodException unused) {
                            OpenIapLog.INSTANCE.w("✗ EXTERNAL_PAYMENTS not found. Requires Billing Library 8.3.0+", TAG);
                        } catch (Exception e5) {
                            OpenIapLog.INSTANCE.w("✗ Failed to enable EXTERNAL_PAYMENTS: " + e5.getMessage(), TAG);
                        }
                    } else {
                        try {
                            enableAutoServiceReconnection.getClass().getMethod("enableBillingProgram", Integer.TYPE).invoke(enableAutoServiceReconnection, Integer.valueOf(i));
                            OpenIapLog.INSTANCE.d("✓ Billing program enabled: " + billingProgramAndroid + " (constant=" + i + ")", TAG);
                        } catch (NoSuchMethodException unused2) {
                            OpenIapLog.INSTANCE.w("✗ enableBillingProgram not found. Requires Billing Library 8.2.0+", TAG);
                        } catch (Exception e6) {
                            OpenIapLog.INSTANCE.w("✗ Failed to enable billing program " + billingProgramAndroid + ": " + e6.getMessage(), TAG);
                        }
                    }
                }
            }
            OpenIapLog.INSTANCE.d("=== END BILLING PROGRAMS INITIALIZATION ===", TAG);
        }
        this.billingClient = enableAutoServiceReconnection.build();
        OpenIapLog.INSTANCE.d("=== buildBillingClient END ===", TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object buildBillingClient$lambda$9(OpenIapModule openIapModule, Object obj, Method method, Object[] objArr) {
        Class<?> cls;
        if (Intrinsics.areEqual(method.getName(), "userSelectedAlternativeBilling")) {
            OpenIapLog.INSTANCE.d("=== USER SELECTED ALTERNATIVE BILLING ===", TAG);
            Object obj2 = objArr != null ? objArr[0] : null;
            OpenIapLog.INSTANCE.d("UserChoiceDetails: " + obj2, TAG);
            if (obj2 != null) {
                try {
                    cls = obj2.getClass();
                } catch (Exception e) {
                    OpenIapLog.INSTANCE.w("Error processing user choice details: " + e.getMessage(), TAG);
                    e.printStackTrace();
                }
            } else {
                cls = null;
            }
            Method method2 = cls != null ? cls.getMethod("getExternalTransactionToken", new Class[0]) : null;
            Method method3 = cls != null ? cls.getMethod("getProducts", new Class[0]) : null;
            Object invoke = method2 != null ? method2.invoke(obj2, new Object[0]) : null;
            String str = invoke instanceof String ? (String) invoke : null;
            Object invoke2 = method3 != null ? method3.invoke(obj2, new Object[0]) : null;
            List list = invoke2 instanceof List ? (List) invoke2 : null;
            if (str == null || list == null) {
                OpenIapLog.INSTANCE.w("Failed to extract user choice details", TAG);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String obj3 = next != null ? next.toString() : null;
                    if (obj3 != null) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = arrayList;
                OpenIapLog.INSTANCE.d("External transaction token: " + str, TAG);
                OpenIapLog.INSTANCE.d("Products: " + arrayList2, TAG);
                UserChoiceBillingDetails userChoiceBillingDetails = new UserChoiceBillingDetails(str, arrayList2);
                UserChoiceBillingListener userChoiceBillingListener = openIapModule.userChoiceBillingListener;
                if (userChoiceBillingListener != null) {
                    try {
                        userChoiceBillingListener.onUserSelectedAlternativeBilling(new UserChoiceDetails(str, arrayList2));
                    } catch (Exception e2) {
                        OpenIapLog.INSTANCE.w("Legacy UserChoiceBilling listener error: " + e2.getMessage(), TAG);
                    }
                }
                Iterator<OpenIapUserChoiceBillingListener> it2 = openIapModule.userChoiceBillingListeners.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onUserChoiceBilling(userChoiceBillingDetails);
                    } catch (Exception e3) {
                        OpenIapLog.INSTANCE.w("UserChoiceBilling listener error: " + e3.getMessage(), TAG);
                    }
                }
            }
            OpenIapLog.INSTANCE.d("==========================================", TAG);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initBillingClient$default(OpenIapModule openIapModule, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: dev.hyo.openiap.OpenIapModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit initBillingClient$lambda$11;
                    initBillingClient$lambda$11 = OpenIapModule.initBillingClient$lambda$11((Throwable) obj2);
                    return initBillingClient$lambda$11;
                }
            };
        }
        openIapModule.initBillingClient(function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initBillingClient$lambda$11(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initBillingClient(final Function1<? super BillingClient, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
        if (googleApiAvailability.isGooglePlayServicesAvailable(this.context) != 0) {
            onFailure.invoke(new IllegalStateException("Google Play Services are not available on this device"));
            return;
        }
        if (this.billingClient == null) {
            buildBillingClient();
        }
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.startConnection(new BillingClientStateListener() { // from class: dev.hyo.openiap.OpenIapModule$initBillingClient$2
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    BillingClient billingClient2;
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    if (billingResult.getResponseCode() == 0) {
                        billingClient2 = this.billingClient;
                        if (billingClient2 != null) {
                            onSuccess.invoke(billingClient2);
                            return;
                        }
                        return;
                    }
                    String debugMessage = billingResult.getDebugMessage();
                    if (debugMessage == null) {
                        debugMessage = "Billing setup failed";
                    }
                    OpenIapLog.INSTANCE.w(debugMessage, "OpenIapModule");
                    onFailure.invoke(new IllegalStateException(debugMessage));
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    OpenIapLog.INSTANCE.i("Billing service disconnected", "OpenIapModule");
                }
            });
        }
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void setActivity(Activity activity) {
        this.currentActivityRef = activity != null ? new WeakReference<>(activity) : null;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void setUserChoiceBillingListener(UserChoiceBillingListener listener) {
        this.userChoiceBillingListener = listener;
    }

    @Override // dev.hyo.openiap.OpenIapProtocol
    public void setDeveloperProvidedBillingListener(DeveloperProvidedBillingListener listener) {
        this.developerProvidedBillingListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySubscriptionProductReplacementParams(BillingFlowParams.ProductDetailsParams.Builder builder, SubscriptionProductReplacementParamsAndroid params) {
        try {
            int replacementModeConstant = SubscriptionReplacementModeAndroidExtKt.toReplacementModeConstant(params.getReplacementMode());
            Class<?> cls = Class.forName("com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$SubscriptionProductReplacementParams");
            Class<?> cls2 = Class.forName("com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$SubscriptionProductReplacementParams$Builder");
            Object invoke = cls.getMethod("newBuilder", new Class[0]).invoke(null, new Object[0]);
            cls2.getMethod("setOldProductId", String.class).invoke(invoke, params.getOldProductId());
            cls2.getMethod("setReplacementMode", Integer.TYPE).invoke(invoke, Integer.valueOf(replacementModeConstant));
            builder.getClass().getMethod("setSubscriptionProductReplacementParams", cls).invoke(builder, cls2.getMethod("build", new Class[0]).invoke(invoke, new Object[0]));
            OpenIapLog.INSTANCE.d("Applied SubscriptionProductReplacementParams: oldProductId=" + params.getOldProductId() + ", mode=" + params.getReplacementMode() + " (constant=" + replacementModeConstant + ")", TAG);
        } catch (ClassNotFoundException unused) {
            OpenIapLog.INSTANCE.w("SubscriptionProductReplacementParams class not found. Requires Billing Library 8.1.0+.", TAG);
        } catch (NoSuchMethodException unused2) {
            OpenIapLog.INSTANCE.w("setSubscriptionProductReplacementParams not found. Requires Billing Library 8.1.0+. Falling back to legacy replacement mode.", TAG);
        } catch (Exception e) {
            OpenIapLog.INSTANCE.e("Failed to apply SubscriptionProductReplacementParams: " + e.getMessage(), e, TAG);
        }
    }

    private final void enableExternalPaymentsProgram(BillingClient.Builder builder) {
        OpenIapLog.INSTANCE.d("=== EXTERNAL PAYMENTS INITIALIZATION (8.3.0+) ===", TAG);
        Class<?> cls = Class.forName("com.android.billingclient.api.DeveloperProvidedBillingListener");
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$$ExternalSyntheticLambda2
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object enableExternalPaymentsProgram$lambda$14;
                enableExternalPaymentsProgram$lambda$14 = OpenIapModule.enableExternalPaymentsProgram$lambda$14(OpenIapModule.this, obj, method, objArr);
                return enableExternalPaymentsProgram$lambda$14;
            }
        });
        Class<?> cls2 = Class.forName("com.android.billingclient.api.EnableBillingProgramParams");
        Class<?> cls3 = Class.forName("com.android.billingclient.api.EnableBillingProgramParams$Builder");
        Object invoke = cls2.getMethod("newBuilder", new Class[0]).invoke(null, new Object[0]);
        cls3.getMethod("setBillingProgram", Integer.TYPE).invoke(invoke, 4);
        cls3.getMethod("setDeveloperProvidedBillingListener", cls).invoke(invoke, newProxyInstance);
        builder.getClass().getMethod("enableBillingProgram", cls2).invoke(builder, cls3.getMethod("build", new Class[0]).invoke(invoke, new Object[0]));
        OpenIapLog.INSTANCE.d("✓ DeveloperProvidedBillingListener registered", TAG);
        OpenIapLog.INSTANCE.d("=== END EXTERNAL PAYMENTS INITIALIZATION ===", TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object enableExternalPaymentsProgram$lambda$14(OpenIapModule openIapModule, Object obj, Method method, Object[] objArr) {
        Class<?> cls;
        if (Intrinsics.areEqual(method.getName(), "onUserSelectedDeveloperBilling")) {
            OpenIapLog.INSTANCE.d("=== USER SELECTED DEVELOPER PROVIDED BILLING ===", TAG);
            Object obj2 = objArr != null ? objArr[0] : null;
            OpenIapLog.INSTANCE.d("DeveloperProvidedBillingDetails: " + obj2, TAG);
            if (obj2 != null) {
                try {
                    cls = obj2.getClass();
                } catch (Exception e) {
                    OpenIapLog.INSTANCE.w("Error processing developer billing details: " + e.getMessage(), TAG);
                    e.printStackTrace();
                }
            } else {
                cls = null;
            }
            Method method2 = cls != null ? cls.getMethod("getExternalTransactionToken", new Class[0]) : null;
            Object invoke = method2 != null ? method2.invoke(obj2, new Object[0]) : null;
            String str = invoke instanceof String ? (String) invoke : null;
            if (str != null) {
                OpenIapLog.INSTANCE.d("External transaction token: " + str, TAG);
                DeveloperProvidedBillingDetailsAndroid developerProvidedBillingDetailsAndroid = new DeveloperProvidedBillingDetailsAndroid(str);
                DeveloperProvidedBillingListener developerProvidedBillingListener = openIapModule.developerProvidedBillingListener;
                if (developerProvidedBillingListener != null) {
                    try {
                        developerProvidedBillingListener.onUserSelectedDeveloperBilling(new DeveloperProvidedBillingDetails(str));
                    } catch (Exception e2) {
                        OpenIapLog.INSTANCE.w("Legacy DeveloperProvidedBilling listener error: " + e2.getMessage(), TAG);
                    }
                }
                Iterator<OpenIapDeveloperProvidedBillingListener> it = openIapModule.developerProvidedBillingListeners.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDeveloperProvidedBilling(developerProvidedBillingDetailsAndroid);
                    } catch (Exception e3) {
                        OpenIapLog.INSTANCE.w("DeveloperProvidedBilling listener error: " + e3.getMessage(), TAG);
                    }
                }
            } else {
                OpenIapLog.INSTANCE.w("Failed to extract external transaction token", TAG);
            }
            OpenIapLog.INSTANCE.d("==========================================", TAG);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDeveloperBillingOption(BillingFlowParams.Builder flowBuilder, DeveloperBillingOptionParamsAndroid params) {
        int i;
        try {
            OpenIapLog.INSTANCE.d("Applying DeveloperBillingOption: program=" + params.getBillingProgram() + ", launchMode=" + params.getLaunchMode() + ", uri=" + params.getLinkUri(), TAG);
            int i2 = WhenMappings.$EnumSwitchMapping$1[params.getBillingProgram().ordinal()];
            int i3 = 2;
            if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = 4;
                if (i2 != 3) {
                    if (i2 == 4) {
                        throw new IllegalArgumentException("USER_CHOICE_BILLING does not use DeveloperBillingOption");
                    }
                    if (i2 == 5) {
                        throw new IllegalArgumentException("Cannot use UNSPECIFIED billing program");
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 3;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$2[params.getLaunchMode().ordinal()];
            if (i4 == 1) {
                i3 = 1;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    throw new IllegalArgumentException("Cannot use UNSPECIFIED launch mode");
                }
                throw new NoWhenBranchMatchedException();
            }
            Class<?> cls = Class.forName("com.android.billingclient.api.DeveloperBillingOptionParams");
            Class<?> cls2 = Class.forName("com.android.billingclient.api.DeveloperBillingOptionParams$Builder");
            Object invoke = cls.getMethod("newBuilder", new Class[0]).invoke(null, new Object[0]);
            cls2.getMethod("setBillingProgram", Integer.TYPE).invoke(invoke, Integer.valueOf(i));
            cls2.getMethod("setLinkUri", Uri.class).invoke(invoke, Uri.parse(params.getLinkUri()));
            cls2.getMethod("setLaunchMode", Integer.TYPE).invoke(invoke, Integer.valueOf(i3));
            flowBuilder.getClass().getMethod("enableDeveloperBillingOption", cls).invoke(flowBuilder, cls2.getMethod("build", new Class[0]).invoke(invoke, new Object[0]));
            OpenIapLog.INSTANCE.d("✓ DeveloperBillingOption applied successfully", TAG);
        } catch (ClassNotFoundException unused) {
            OpenIapLog.INSTANCE.w("DeveloperBillingOptionParams class not found. Requires Billing Library 8.3.0+", TAG);
        } catch (NoSuchMethodException unused2) {
            OpenIapLog.INSTANCE.w("DeveloperBillingOption not found. Requires Billing Library 8.3.0+", TAG);
        } catch (Exception e) {
            OpenIapLog.INSTANCE.e("Failed to apply DeveloperBillingOption: " + e.getMessage(), e, TAG);
        }
    }
}
