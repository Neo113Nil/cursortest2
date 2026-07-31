package com.margelo.nitro.iap;

import android.app.Activity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.margelo.nitro.iap.Variant_NullType_Array_AndroidSubscriptionOfferInput_;
import com.margelo.nitro.iap.Variant_NullType_NitroRequestPurchaseAndroid;
import com.margelo.nitro.iap.Variant_NullType_SubscriptionProductReplacementParamsAndroid;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import dev.hyo.openiap.FetchProductsResult;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.ProductCommon;
import dev.hyo.openiap.ProductQueryType;
import dev.hyo.openiap.ProductRequest;
import dev.hyo.openiap.RequestPurchaseAndroidProps;
import dev.hyo.openiap.RequestPurchaseProps;
import dev.hyo.openiap.RequestPurchasePropsByPlatforms;
import dev.hyo.openiap.RequestSubscriptionAndroidProps;
import dev.hyo.openiap.RequestSubscriptionPropsByPlatforms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/RequestPurchaseResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$requestPurchase$1", f = "HybridRnIap.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 4}, l = {TypedValues.Cycle.TYPE_WAVE_PHASE, 428, 439, 448, 534}, m = "invokeSuspend", n = {"defaultResult", "androidRequest", "defaultResult", "androidRequest", "defaultResult", "androidRequest", "defaultResult", "androidRequest", "sku", "defaultResult"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$4", "L$0"})
/* loaded from: classes2.dex */
final class HybridRnIap$requestPurchase$1 extends SuspendLambda implements Function1<Continuation<? super RequestPurchaseResult>, Object> {
    final /* synthetic */ NitroPurchaseRequest $request;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* compiled from: HybridRnIap.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductQueryType.values().length];
            try {
                iArr[ProductQueryType.Subs.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductQueryType.InApp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductQueryType.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$requestPurchase$1(NitroPurchaseRequest nitroPurchaseRequest, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$requestPurchase$1> continuation) {
        super(1, continuation);
        this.$request = nitroPurchaseRequest;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$requestPurchase$1(this.$request, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super RequestPurchaseResult> continuation) {
        return ((HybridRnIap$requestPurchase$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:37|(3:38|39|40)|41|42|43|(1:45)(1:130)|46|(1:48)|49|(2:51|52)(3:53|54|(5:56|57|58|(9:60|41|42|43|(0)(0)|46|(0)|49|(0)(0))|61)(16:66|67|(1:69)|129|71|(1:73)(1:128)|(1:127)(4:77|(5:79|(3:84|(2:86|87)(1:89)|88)|90|(0)(0)|88)|91|92)|93|(1:95)(1:126)|96|(2:(2:102|103)|104)(6:112|(1:114)(1:125)|115|(1:117)(1:124)|(1:123)(1:121)|122)|105|(1:107)(1:111)|108|(5:110|13|(1:14)|29|30)|61))) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0250, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02d3, code lost:
    
        if (r5 == null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0495 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03be A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0267 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c5 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e4 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0177 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0193 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x04eb A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #2 {Exception -> 0x002d, blocks: (B:11:0x0024, B:13:0x04d7, B:14:0x04e5, B:16:0x04eb, B:19:0x0528, B:22:0x052e, B:28:0x051e, B:18:0x04f1), top: B:10:0x0024, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027c A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0299 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f4 A[Catch: Exception -> 0x0088, TRY_LEAVE, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c7 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e5 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02eb A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0323 A[Catch: Exception -> 0x0088, TryCatch #3 {Exception -> 0x0088, blocks: (B:43:0x025e, B:46:0x0272, B:48:0x027c, B:49:0x028f, B:51:0x0299, B:54:0x01ee, B:56:0x01f4, B:65:0x0254, B:67:0x02bb, B:69:0x02c7, B:71:0x02d7, B:73:0x02e5, B:75:0x02eb, B:77:0x02f1, B:79:0x02fd, B:81:0x0310, B:84:0x031a, B:86:0x0323, B:88:0x0326, B:92:0x0329, B:93:0x0330, B:96:0x033e, B:102:0x034e, B:103:0x0353, B:104:0x0354, B:105:0x046c, B:107:0x0495, B:108:0x049c, B:112:0x03be, B:114:0x03ca, B:115:0x03d8, B:117:0x03e0, B:119:0x03e6, B:121:0x03ec, B:122:0x0404, B:127:0x032c, B:130:0x0267, B:137:0x0067, B:138:0x01b3, B:140:0x01c5, B:142:0x01d1, B:144:0x01d4, B:147:0x01d9, B:149:0x01e4, B:151:0x0074, B:153:0x0173, B:155:0x0177, B:157:0x0193, B:161:0x0083, B:162:0x0153, B:188:0x0140), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0348  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0244 -> B:36:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0254 -> B:38:0x025e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RequestPurchaseResult requestPurchaseResult;
        RequestPurchaseResult create;
        NitroRequestPurchaseAndroid value;
        List emptyList;
        Object ensureConnection;
        String[] skus;
        Object withContext;
        Activity activity;
        int i;
        ArrayList arrayList;
        HybridRnIap hybridRnIap;
        NitroRequestPurchaseAndroid nitroRequestPurchaseAndroid;
        Iterator it;
        Map map;
        String str;
        String str2;
        ProductQueryType parseProductQueryType;
        Variant_NullType_Array_AndroidSubscriptionOfferInput_.Second second;
        ArrayList emptyList2;
        int i2;
        Double unwrapDouble;
        dev.hyo.openiap.SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid;
        Boolean unwrapBool;
        String unwrapString;
        String unwrapString2;
        String unwrapString3;
        RequestPurchaseProps requestPurchaseProps;
        SubscriptionProductReplacementParamsAndroid value2;
        dev.hyo.openiap.SubscriptionReplacementModeAndroid parseSubscriptionReplacementMode;
        Object withContext2;
        Boolean unwrapBool2;
        String unwrapString4;
        String unwrapString5;
        String unwrapString6;
        AndroidSubscriptionOfferInput[] value3;
        dev.hyo.openiap.AndroidSubscriptionOfferInput androidSubscriptionOfferInput;
        Map map2;
        Throwable th;
        Object m3984constructorimpl;
        OpenIapModule openIap;
        Object invoke;
        Throwable m3987exceptionOrNullimpl;
        ProductCommon productCommon;
        Map map3;
        Map map4;
        List productsOrEmpty;
        List<dev.hyo.openiap.Purchase> purchasesOrEmpty;
        Object m3984constructorimpl2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        try {
        } catch (Exception e) {
            e = e;
            requestPurchaseResult = 5;
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            create = RequestPurchaseResult.INSTANCE.create(new Purchase[0]);
            Variant_NullType_NitroRequestPurchaseAndroid android2 = this.$request.getAndroid();
            Variant_NullType_NitroRequestPurchaseAndroid.Second second2 = android2 instanceof Variant_NullType_NitroRequestPurchaseAndroid.Second ? (Variant_NullType_NitroRequestPurchaseAndroid.Second) android2 : null;
            if (second2 == null || (value = second2.getValue()) == null) {
                Variant_NullType_NitroRequestPurchaseAndroid google = this.$request.getGoogle();
                Variant_NullType_NitroRequestPurchaseAndroid.Second second3 = google instanceof Variant_NullType_NitroRequestPurchaseAndroid.Second ? (Variant_NullType_NitroRequestPurchaseAndroid.Second) google : null;
                value = second3 != null ? second3.getValue() : null;
            }
            RnIapLog rnIapLog = RnIapLog.INSTANCE;
            Pair[] pairArr = new Pair[2];
            if (value == null || (skus = value.getSkus()) == null || (emptyList = ArraysKt.toList(skus)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            pairArr[0] = TuplesKt.to("androidSkus", emptyList);
            pairArr[1] = TuplesKt.to("hasIOS", Boxing.boxBoolean(this.$request.getIos() != null));
            rnIapLog.payload("requestPurchase", MapsKt.mapOf(pairArr));
            if (value == null) {
                RnIapLog.INSTANCE.warn("requestPurchase called without android payload");
                HybridRnIap hybridRnIap2 = this.this$0;
                hybridRnIap2.sendPurchaseError(HybridRnIap.toErrorResult$default(hybridRnIap2, OpenIapError.DeveloperError.INSTANCE, null, null, null, 14, null));
                return create;
            }
            if (value.getSkus().length == 0) {
                RnIapLog.INSTANCE.warn("requestPurchase received empty SKU list");
                HybridRnIap hybridRnIap3 = this.this$0;
                hybridRnIap3.sendPurchaseError(HybridRnIap.toErrorResult$default(hybridRnIap3, OpenIapError.EmptySkuList.INSTANCE, null, null, null, 14, null));
                return create;
            }
            this.L$0 = create;
            this.L$1 = value;
            this.label = 1;
            ensureConnection = this.this$0.ensureConnection(this);
            if (ensureConnection == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    value = (NitroRequestPurchaseAndroid) this.L$1;
                    create = (RequestPurchaseResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    withContext = obj;
                    activity = (Activity) withContext;
                    if (activity != null) {
                        RnIapLog.INSTANCE.warn("requestPurchase: Activity is null - cannot start purchase flow");
                        HybridRnIap hybridRnIap4 = this.this$0;
                        hybridRnIap4.sendPurchaseError(HybridRnIap.toErrorResult$default(hybridRnIap4, OpenIapError.MissingCurrentActivity.INSTANCE, null, null, null, 14, null));
                        return create;
                    }
                    this.L$0 = create;
                    this.L$1 = value;
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, activity, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String[] skus2 = value.getSkus();
                    HybridRnIap hybridRnIap5 = this.this$0;
                    ArrayList arrayList2 = new ArrayList();
                    i = 0;
                    while (r9 < r15) {
                    }
                    arrayList = arrayList2;
                    if (!arrayList.isEmpty()) {
                    }
                    str = (String) ArraysKt.firstOrNull(value.getSkus());
                    if (str != null) {
                    }
                    str2 = "inapp";
                    parseProductQueryType = this.this$0.parseProductQueryType(str2);
                    Variant_NullType_Array_AndroidSubscriptionOfferInput_ subscriptionOffers = value.getSubscriptionOffers();
                    if (subscriptionOffers instanceof Variant_NullType_Array_AndroidSubscriptionOfferInput_.Second) {
                    }
                    if (second != null) {
                    }
                    emptyList2 = CollectionsKt.emptyList();
                    if (!emptyList2.isEmpty()) {
                    }
                    i2 = WhenMappings.$EnumSwitchMapping$0[parseProductQueryType.ordinal()];
                    if (i2 != 1) {
                    }
                    RnIapLog rnIapLog2 = RnIapLog.INSTANCE;
                    Pair[] pairArr2 = new Pair[3];
                    pairArr2[i] = TuplesKt.to("skus", ArraysKt.toList(value.getSkus()));
                    pairArr2[1] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, requestPurchaseProps.getType().getRawValue());
                    pairArr2[2] = TuplesKt.to("offerCount", Boxing.boxInt(r25 != null ? r25.size() : i));
                    rnIapLog2.payload("requestPurchase.native", MapsKt.mapOf(pairArr2));
                    this.L$0 = create;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 5;
                    withContext2 = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$requestPurchase$1$result$1(this.this$0, requestPurchaseProps, null), this);
                    if (withContext2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i3 == 3) {
                    value = (NitroRequestPurchaseAndroid) this.L$1;
                    create = (RequestPurchaseResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    String[] skus22 = value.getSkus();
                    HybridRnIap hybridRnIap52 = this.this$0;
                    ArrayList arrayList22 = new ArrayList();
                    i = 0;
                    for (String str3 : skus22) {
                        map = hybridRnIap52.productTypeBySku;
                        if (!map.containsKey(str3)) {
                            arrayList22.add(str3);
                        }
                    }
                    arrayList = arrayList22;
                    if (!arrayList.isEmpty()) {
                        hybridRnIap = this.this$0;
                        nitroRequestPurchaseAndroid = value;
                        it = arrayList.iterator();
                        if (!it.hasNext()) {
                        }
                    }
                    str = (String) ArraysKt.firstOrNull(value.getSkus());
                    if (str != null) {
                    }
                    str2 = "inapp";
                    parseProductQueryType = this.this$0.parseProductQueryType(str2);
                    Variant_NullType_Array_AndroidSubscriptionOfferInput_ subscriptionOffers2 = value.getSubscriptionOffers();
                    if (subscriptionOffers2 instanceof Variant_NullType_Array_AndroidSubscriptionOfferInput_.Second) {
                    }
                    if (second != null) {
                    }
                    emptyList2 = CollectionsKt.emptyList();
                    if (!emptyList2.isEmpty()) {
                    }
                    i2 = WhenMappings.$EnumSwitchMapping$0[parseProductQueryType.ordinal()];
                    if (i2 != 1) {
                    }
                    RnIapLog rnIapLog22 = RnIapLog.INSTANCE;
                    Pair[] pairArr22 = new Pair[3];
                    pairArr22[i] = TuplesKt.to("skus", ArraysKt.toList(value.getSkus()));
                    pairArr22[1] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, requestPurchaseProps.getType().getRawValue());
                    pairArr22[2] = TuplesKt.to("offerCount", Boxing.boxInt(r25 != null ? r25.size() : i));
                    rnIapLog22.payload("requestPurchase.native", MapsKt.mapOf(pairArr22));
                    this.L$0 = create;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 5;
                    withContext2 = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$requestPurchase$1$result$1(this.this$0, requestPurchaseProps, null), this);
                    if (withContext2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestPurchaseResult = (RequestPurchaseResult) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        withContext2 = obj;
                        i = 0;
                        purchasesOrEmpty = this.this$0.purchasesOrEmpty((dev.hyo.openiap.RequestPurchaseResult) withContext2);
                        for (dev.hyo.openiap.Purchase purchase : purchasesOrEmpty) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                RnIapLog rnIapLog3 = RnIapLog.INSTANCE;
                                Pair[] pairArr3 = new Pair[2];
                                pairArr3[i] = TuplesKt.to("id", purchase.getId());
                                pairArr3[1] = TuplesKt.to("sku", purchase.getProductId());
                                rnIapLog3.result("requestPurchase.native", MapsKt.mapOf(pairArr3));
                                m3984constructorimpl2 = Result.m3984constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th2) {
                                Result.Companion companion2 = Result.INSTANCE;
                                m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th2));
                            }
                            Throwable m3987exceptionOrNullimpl2 = Result.m3987exceptionOrNullimpl(m3984constructorimpl2);
                            if (m3987exceptionOrNullimpl2 != null) {
                                RnIapLog.INSTANCE.failure("requestPurchase.native", m3987exceptionOrNullimpl2);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        RnIapLog.INSTANCE.failure("requestPurchase", e);
                        HybridRnIap hybridRnIap6 = this.this$0;
                        hybridRnIap6.sendPurchaseError(HybridRnIap.toErrorResult$default(hybridRnIap6, OpenIapError.PurchaseFailed.INSTANCE, null, e.getMessage(), e.getMessage(), 2, null));
                        return requestPurchaseResult;
                    }
                    return requestPurchaseResult;
                }
                HybridRnIap hybridRnIap7 = (HybridRnIap) this.L$5;
                String str4 = (String) this.L$4;
                it = (Iterator) this.L$3;
                HybridRnIap hybridRnIap8 = (HybridRnIap) this.L$2;
                nitroRequestPurchaseAndroid = (NitroRequestPurchaseAndroid) this.L$1;
                create = (RequestPurchaseResult) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    hybridRnIap = hybridRnIap7;
                    i = 0;
                    invoke = obj;
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    Result.Companion companion3 = Result.INSTANCE;
                    m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
                    HybridRnIap hybridRnIap9 = hybridRnIap8;
                    m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
                    if (m3987exceptionOrNullimpl != null) {
                    }
                    productCommon = (ProductCommon) CollectionsKt.firstOrNull((List) m3984constructorimpl);
                    if (productCommon != null) {
                    }
                    map3 = hybridRnIap9.productTypeBySku;
                    if (!map3.containsKey(str4)) {
                    }
                }
                productsOrEmpty = hybridRnIap.productsOrEmpty((FetchProductsResult) invoke);
                m3984constructorimpl = Result.m3984constructorimpl(productsOrEmpty);
                HybridRnIap hybridRnIap92 = hybridRnIap8;
                m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
                if (m3987exceptionOrNullimpl != null) {
                    RnIapLog.INSTANCE.failure("requestPurchase.fetchMissing", m3987exceptionOrNullimpl);
                    m3984constructorimpl = CollectionsKt.emptyList();
                }
                productCommon = (ProductCommon) CollectionsKt.firstOrNull((List) m3984constructorimpl);
                if (productCommon != null) {
                    map4 = hybridRnIap92.productTypeBySku;
                    map4.put(productCommon.getId(), productCommon.getType().getRawValue());
                }
                map3 = hybridRnIap92.productTypeBySku;
                if (!map3.containsKey(str4)) {
                    hybridRnIap92.sendPurchaseError(HybridRnIap.toErrorResult$default(hybridRnIap92, new OpenIapError.SkuNotFound(str4), null, null, null, 14, null));
                    return create;
                }
                hybridRnIap = hybridRnIap92;
                if (!it.hasNext()) {
                    str4 = (String) it.next();
                    RnIapLog.INSTANCE.warn("requestPurchase missing cached type for " + str4 + "; attempting fetch");
                    try {
                    } catch (Throwable th4) {
                        th = th4;
                        hybridRnIap8 = hybridRnIap;
                        Result.Companion companion32 = Result.INSTANCE;
                        m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
                        HybridRnIap hybridRnIap922 = hybridRnIap8;
                        m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
                        if (m3987exceptionOrNullimpl != null) {
                        }
                        productCommon = (ProductCommon) CollectionsKt.firstOrNull((List) m3984constructorimpl);
                        if (productCommon != null) {
                        }
                        map3 = hybridRnIap922.productTypeBySku;
                        if (!map3.containsKey(str4)) {
                        }
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    openIap = hybridRnIap.getOpenIap();
                    Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts = openIap.getFetchProducts();
                    ProductRequest productRequest = new ProductRequest(CollectionsKt.listOf(str4), ProductQueryType.All);
                    this.L$0 = create;
                    this.L$1 = nitroRequestPurchaseAndroid;
                    this.L$2 = hybridRnIap;
                    this.L$3 = it;
                    this.L$4 = str4;
                    this.L$5 = hybridRnIap;
                    this.label = 4;
                    invoke = fetchProducts.invoke(productRequest, this);
                    if (invoke != coroutine_suspended) {
                        hybridRnIap8 = hybridRnIap;
                        productsOrEmpty = hybridRnIap.productsOrEmpty((FetchProductsResult) invoke);
                        m3984constructorimpl = Result.m3984constructorimpl(productsOrEmpty);
                        HybridRnIap hybridRnIap9222 = hybridRnIap8;
                        m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
                        if (m3987exceptionOrNullimpl != null) {
                        }
                        productCommon = (ProductCommon) CollectionsKt.firstOrNull((List) m3984constructorimpl);
                        if (productCommon != null) {
                        }
                        map3 = hybridRnIap9222.productTypeBySku;
                        if (!map3.containsKey(str4)) {
                        }
                    }
                    return coroutine_suspended;
                }
                value = nitroRequestPurchaseAndroid;
                str = (String) ArraysKt.firstOrNull(value.getSkus());
                if (str != null) {
                    map2 = this.this$0.productTypeBySku;
                    str2 = (String) map2.get(str);
                }
                str2 = "inapp";
                parseProductQueryType = this.this$0.parseProductQueryType(str2);
                Variant_NullType_Array_AndroidSubscriptionOfferInput_ subscriptionOffers22 = value.getSubscriptionOffers();
                second = subscriptionOffers22 instanceof Variant_NullType_Array_AndroidSubscriptionOfferInput_.Second ? (Variant_NullType_Array_AndroidSubscriptionOfferInput_.Second) subscriptionOffers22 : null;
                if (second != null || (value3 = second.getValue()) == null) {
                    emptyList2 = CollectionsKt.emptyList();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int length = value3.length;
                    for (int i4 = i; i4 < length; i4++) {
                        AndroidSubscriptionOfferInput androidSubscriptionOfferInput2 = value3[i4];
                        String sku = androidSubscriptionOfferInput2.getSku();
                        String offerToken = androidSubscriptionOfferInput2.getOfferToken();
                        if (!StringsKt.isBlank(sku) && !StringsKt.isBlank(offerToken)) {
                            androidSubscriptionOfferInput = new dev.hyo.openiap.AndroidSubscriptionOfferInput(offerToken, sku);
                            if (androidSubscriptionOfferInput == null) {
                                arrayList3.add(androidSubscriptionOfferInput);
                            }
                        }
                        androidSubscriptionOfferInput = null;
                        if (androidSubscriptionOfferInput == null) {
                        }
                    }
                    emptyList2 = arrayList3;
                }
                List list = !emptyList2.isEmpty() ? emptyList2 : null;
                i2 = WhenMappings.$EnumSwitchMapping$0[parseProductQueryType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    unwrapBool2 = this.this$0.unwrapBool(value.isOfferPersonalized());
                    unwrapString4 = this.this$0.unwrapString(value.getObfuscatedAccountId());
                    unwrapString5 = this.this$0.unwrapString(value.getObfuscatedProfileId());
                    unwrapString6 = this.this$0.unwrapString(value.getOfferToken());
                    requestPurchaseProps = new RequestPurchaseProps(new RequestPurchaseProps.Request.Purchase(new RequestPurchasePropsByPlatforms(new RequestPurchaseAndroidProps(null, unwrapBool2, unwrapString4, unwrapString5, unwrapString6, ArraysKt.toList(value.getSkus()), 1, null), null, null, null, 14, null)), ProductQueryType.InApp, null, 4, null);
                } else {
                    unwrapDouble = this.this$0.unwrapDouble(value.getReplacementMode());
                    Integer boxInt = unwrapDouble != null ? Boxing.boxInt((int) unwrapDouble.doubleValue()) : null;
                    Variant_NullType_SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams = value.getSubscriptionProductReplacementParams();
                    Variant_NullType_SubscriptionProductReplacementParamsAndroid.Second second4 = subscriptionProductReplacementParams instanceof Variant_NullType_SubscriptionProductReplacementParamsAndroid.Second ? (Variant_NullType_SubscriptionProductReplacementParamsAndroid.Second) subscriptionProductReplacementParams : null;
                    if (second4 == null || (value2 = second4.getValue()) == null) {
                        subscriptionProductReplacementParamsAndroid = null;
                    } else {
                        HybridRnIap hybridRnIap10 = this.this$0;
                        String oldProductId = value2.getOldProductId();
                        parseSubscriptionReplacementMode = hybridRnIap10.parseSubscriptionReplacementMode(value2.getReplacementMode());
                        subscriptionProductReplacementParamsAndroid = new dev.hyo.openiap.SubscriptionProductReplacementParamsAndroid(oldProductId, parseSubscriptionReplacementMode);
                    }
                    unwrapBool = this.this$0.unwrapBool(value.isOfferPersonalized());
                    unwrapString = this.this$0.unwrapString(value.getObfuscatedAccountId());
                    unwrapString2 = this.this$0.unwrapString(value.getObfuscatedProfileId());
                    unwrapString3 = this.this$0.unwrapString(value.getPurchaseToken());
                    requestPurchaseProps = new RequestPurchaseProps(new RequestPurchaseProps.Request.Subscription(new RequestSubscriptionPropsByPlatforms(new RequestSubscriptionAndroidProps(null, unwrapBool, unwrapString, unwrapString2, unwrapString3, boxInt, ArraysKt.toList(value.getSkus()), list, subscriptionProductReplacementParamsAndroid, 1, null), null, null, null, 14, null)), ProductQueryType.Subs, null, 4, null);
                }
                RnIapLog rnIapLog222 = RnIapLog.INSTANCE;
                Pair[] pairArr222 = new Pair[3];
                pairArr222[i] = TuplesKt.to("skus", ArraysKt.toList(value.getSkus()));
                pairArr222[1] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, requestPurchaseProps.getType().getRawValue());
                pairArr222[2] = TuplesKt.to("offerCount", Boxing.boxInt(list != null ? list.size() : i));
                rnIapLog222.payload("requestPurchase.native", MapsKt.mapOf(pairArr222));
                this.L$0 = create;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 5;
                withContext2 = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$requestPurchase$1$result$1(this.this$0, requestPurchaseProps, null), this);
                if (withContext2 != coroutine_suspended) {
                    requestPurchaseResult = create;
                    purchasesOrEmpty = this.this$0.purchasesOrEmpty((dev.hyo.openiap.RequestPurchaseResult) withContext2);
                    while (r4.hasNext()) {
                    }
                    return requestPurchaseResult;
                }
                return coroutine_suspended;
            }
            value = (NitroRequestPurchaseAndroid) this.L$1;
            create = (RequestPurchaseResult) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = create;
        this.L$1 = value;
        this.label = 2;
        withContext = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$requestPurchase$1$activity$1(this.this$0, null), this);
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        activity = (Activity) withContext;
        if (activity != null) {
        }
    }

    /* compiled from: HybridRnIap.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$requestPurchase$1$1", f = "HybridRnIap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.margelo.nitro.iap.HybridRnIap$requestPurchase$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        int label;
        final /* synthetic */ HybridRnIap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HybridRnIap hybridRnIap, Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hybridRnIap;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OpenIapModule openIap;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                openIap = this.this$0.getOpenIap();
                openIap.setActivity(this.$activity);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
