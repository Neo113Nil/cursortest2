package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class m1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f fVar = f.b;
        String name = this.a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        f0 handler = (f0) fVar.a.get(name);
        if (handler != null) {
            d0.a.getClass();
            Intrinsics.checkNotNullParameter(handler, "handler");
            String handlerId = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
            c0.b.put(handlerId, handler);
            handler.g = handlerId;
            e0 e0Var = UniWebViewAuthenticationActivity.Companion;
            Activity context = handler.b;
            if (handlerId == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handlerId");
                handlerId = null;
            }
            e0Var.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(handlerId, "handlerId");
            Intent intent = new Intent(context, (Class<?>) UniWebViewAuthenticationActivity.class);
            intent.putExtra(UniWebViewProxyActivity.HANDLER_ID, handlerId);
            context.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
