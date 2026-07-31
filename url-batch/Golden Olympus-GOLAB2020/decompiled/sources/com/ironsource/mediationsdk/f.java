package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C1478h5;
import com.ironsource.C1529o5;
import com.ironsource.InterfaceC1555s4;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1529o5 f17570a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f17571b;

    public f(@NotNull C1529o5 settings, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f17570a = settings;
        this.f17571b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    @NotNull
    public e.a a(@NotNull Context context, @NotNull i auctionRequestParams, @NotNull InterfaceC1555s4 auctionListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject a4 = a(context, auctionRequestParams);
        String a5 = this.f17570a.a(auctionRequestParams.r());
        return auctionRequestParams.r() ? new C1478h5(auctionListener, new URL(a5), a4, auctionRequestParams.s(), this.f17570a.g(), this.f17570a.m(), this.f17570a.n(), this.f17570a.o(), this.f17570a.d()) : new e.a(auctionListener, new URL(a5), a4, auctionRequestParams.s(), this.f17570a.g(), this.f17570a.m(), this.f17570a.n(), this.f17570a.o(), this.f17570a.d());
    }

    private final JSONObject a(Context context, i iVar) {
        JSONObject a4 = d.b().a(iVar);
        Intrinsics.checkNotNullExpressionValue(a4, "getInstance().enrichToke…low(auctionRequestParams)");
        return a4;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f17570a.g() > 0;
    }
}
