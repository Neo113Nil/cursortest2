package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ri {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ri f18913a = new ri();

    private ri() {
    }

    @NotNull
    public static final JSONObject a() {
        new bk().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject put = new JSONObject().put("data", IronSourceAES.encode(mb.b().c(), new qi().a().toString()));
        Intrinsics.checkNotNullExpressionValue(put, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return put;
    }
}
