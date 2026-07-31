package com.ironsource;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1499k5 implements InterfaceC1506l5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16908a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zp f16909b;

    public C1499k5(@NotNull String encryptedAuctionResponse, @NotNull zp providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f16908a = encryptedAuctionResponse;
        this.f16909b = providerName;
    }

    @Override // com.ironsource.InterfaceC1506l5
    @NotNull
    public Object a() {
        Object m243constructorimpl;
        String c4 = mb.b().c();
        Intrinsics.checkNotNullExpressionValue(c4, "getInstance().mediationKey");
        vk vkVar = new vk(new ga(this.f16908a, c4));
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(vkVar.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null) {
            return C1485i5.f16673h.a((JSONObject) m243constructorimpl, this.f16909b.value());
        }
        o9.d().a(d4);
        return d4 instanceof IllegalArgumentException ? Result.m243constructorimpl(ResultKt.createFailure(new rg(wb.f20181a.d()))) : Result.m243constructorimpl(ResultKt.createFailure(new rg(wb.f20181a.h())));
    }
}
