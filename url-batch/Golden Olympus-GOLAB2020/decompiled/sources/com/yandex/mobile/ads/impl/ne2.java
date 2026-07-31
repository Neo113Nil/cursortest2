package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ne2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1906ej f29550a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d92 f29551b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sb2<ya1> f29552c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ja2 f29553d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qf2 f29554e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final wi0 f29555f;

    public /* synthetic */ ne2(Context context, mp1 mp1Var, InterfaceC1906ej interfaceC1906ej) {
        this(context, mp1Var, interfaceC1906ej, e92.a(interfaceC1906ej.b()), new sb2(context, new za1()), new ja2(context, mp1Var), new qf2(), new wi0());
    }

    public final Object a(JSONObject jsonValue) {
        j92 j92Var;
        pf2 pf2Var;
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        try {
            j92Var = this.f29553d.a(this.f29551b.a("vast", jsonValue), this.f29550a);
        } catch (Exception unused) {
            j92Var = null;
        }
        if (j92Var == null || j92Var.b().isEmpty()) {
            throw new i61("Invalid VAST in response");
        }
        ArrayList a4 = this.f29552c.a(j92Var.b());
        if (a4.isEmpty()) {
            throw new i61("Invalid VAST in response");
        }
        JSONObject settingsJson = jsonValue.optJSONObject("settings");
        if (settingsJson != null) {
            this.f29554e.getClass();
            Intrinsics.checkNotNullParameter(settingsJson, "settingsJson");
            boolean optBoolean = settingsJson.optBoolean("volumeControlVisible", true);
            boolean optBoolean2 = settingsJson.optBoolean("isProgressBarHidden", false);
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Double.valueOf(settingsJson.getDouble("initialVolume")));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            pf2Var = new pf2(optBoolean, optBoolean2, (Double) m243constructorimpl);
        } else {
            pf2Var = null;
        }
        JSONObject optJSONObject = jsonValue.optJSONObject("preview");
        return new ab2(a4, pf2Var, optJSONObject != null ? this.f29555f.b(optJSONObject) : null);
    }

    public ne2(@NotNull Context context, @NotNull mp1 reporter, @NotNull InterfaceC1906ej base64EncodingParameters, @NotNull d92 valueReader, @NotNull sb2<ya1> videoAdInfoListCreator, @NotNull ja2 vastXmlParser, @NotNull qf2 videoSettingsParser, @NotNull wi0 imageParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        Intrinsics.checkNotNullParameter(valueReader, "valueReader");
        Intrinsics.checkNotNullParameter(videoAdInfoListCreator, "videoAdInfoListCreator");
        Intrinsics.checkNotNullParameter(vastXmlParser, "vastXmlParser");
        Intrinsics.checkNotNullParameter(videoSettingsParser, "videoSettingsParser");
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f29550a = base64EncodingParameters;
        this.f29551b = valueReader;
        this.f29552c = videoAdInfoListCreator;
        this.f29553d = vastXmlParser;
        this.f29554e = videoSettingsParser;
        this.f29555f = imageParser;
    }
}
