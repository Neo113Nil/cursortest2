package com.yandex.mobile.ads.impl;

import O1.C0933m5;
import O1.InterfaceC0752c3;
import android.net.Uri;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x10 f29357a;

    public /* synthetic */ n20(int i4) {
        this(new x10());
    }

    @Nullable
    public final m20 a(@NotNull InterfaceC0752c3 divBase) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        this.f29357a.getClass();
        C0933m5 a4 = x10.a(divBase, com.ironsource.c9.f15700d);
        if (a4 == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = a4.f6989b;
            m243constructorimpl = Result.m243constructorimpl(Uri.parse(jSONObject != null ? jSONObject.getString("url") : null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        Uri uri = (Uri) m243constructorimpl;
        if (uri != null) {
            return new m20(uri);
        }
        return null;
    }

    public n20(@NotNull x10 divExtensionProvider) {
        Intrinsics.checkNotNullParameter(divExtensionProvider, "divExtensionProvider");
        this.f29357a = divExtensionProvider;
    }
}
