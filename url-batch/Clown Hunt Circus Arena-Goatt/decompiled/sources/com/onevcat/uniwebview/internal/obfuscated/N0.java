package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import com.onevcat.uniwebview.UniWebViewAuthenticationActivity;
import com.onevcat.uniwebview.UniWebViewProxyActivity;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class N0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0040d c0040d = C0040d.b;
        String name = this.a;
        c0040d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        T handler = (T) c0040d.a.get(name);
        if (handler != null) {
            Q.a.getClass();
            Intrinsics.checkNotNullParameter(handler, "handler");
            String handlerId = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
            P.b.put(handlerId, handler);
            handler.g = handlerId;
            S s = UniWebViewAuthenticationActivity.Companion;
            Activity context = handler.b;
            if (handlerId == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handlerId");
                handlerId = null;
            }
            s.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(handlerId, "handlerId");
            Intent intent = new Intent(context, (Class<?>) UniWebViewAuthenticationActivity.class);
            intent.putExtra(UniWebViewProxyActivity.HANDLER_ID, handlerId);
            context.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
