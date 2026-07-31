package dev.hyo.openiap;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "options", "Ldev/hyo/openiap/DeepLinkOptions;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$deepLinkToSubscriptions$1", f = "OpenIapModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OpenIapModule$deepLinkToSubscriptions$1 extends SuspendLambda implements Function2<DeepLinkOptions, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$deepLinkToSubscriptions$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$deepLinkToSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$deepLinkToSubscriptions$1 openIapModule$deepLinkToSubscriptions$1 = new OpenIapModule$deepLinkToSubscriptions$1(this.this$0, continuation);
        openIapModule$deepLinkToSubscriptions$1.L$0 = obj;
        return openIapModule$deepLinkToSubscriptions$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeepLinkOptions deepLinkOptions, Continuation<? super Unit> continuation) {
        return ((OpenIapModule$deepLinkToSubscriptions$1) create(deepLinkOptions, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        String packageName;
        Uri parse;
        Context context2;
        DeepLinkOptions deepLinkOptions = (DeepLinkOptions) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (deepLinkOptions == null || (packageName = deepLinkOptions.getPackageNameAndroid()) == null) {
            context = this.this$0.context;
            packageName = context.getPackageName();
        }
        String skuAndroid = deepLinkOptions != null ? deepLinkOptions.getSkuAndroid() : null;
        if (skuAndroid != null && !StringsKt.isBlank(skuAndroid)) {
            Intrinsics.checkNotNull(deepLinkOptions);
            parse = Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + deepLinkOptions.getSkuAndroid() + "&package=" + packageName);
        } else {
            parse = Uri.parse("https://play.google.com/store/account/subscriptions?package=" + packageName);
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        context2 = this.this$0.context;
        context2.startActivity(intent);
        return Unit.INSTANCE;
    }
}
