package com.yandex.mobile.ads.impl;

import O1.C0933m5;
import O1.C1165z4;
import O1.InterfaceC0752c3;
import android.view.View;
import com.ironsource.b9;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sz1 implements DivExtensionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f32088a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x10 f32089b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m70 f32090c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n70 f32091d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<C1165z4, uz1> f32092e;

    public /* synthetic */ sz1(mp1 mp1Var) {
        this(mp1Var, new x10(), new m70(), new n70());
    }

    public final void a(@NotNull C1165z4 divData, @NotNull pz1 sliderAdPrivate) {
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(sliderAdPrivate, "sliderAdPrivate");
        this.f32092e.put(divData, new uz1(sliderAdPrivate, this.f32088a, new x10(), new m70(), new g61(), new C2208rg(g61.c(sliderAdPrivate))));
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* bridge */ /* synthetic */ void beforeBindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 interfaceC0752c3) {
        super.beforeBindView(div2View, expressionResolver, view, interfaceC0752c3);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 divBase) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        uz1 uz1Var = this.f32092e.get(div2View.getDivData());
        if (uz1Var != null) {
            uz1Var.a(div2View, view, divBase);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matches(@NotNull InterfaceC0752c3 divBase) {
        Integer valueOf;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        this.f32089b.getClass();
        C0933m5 divExtension = x10.a(divBase, "view");
        if (divExtension == null) {
            return false;
        }
        this.f32090c.getClass();
        Intrinsics.checkNotNullParameter(divExtension, "divExtension");
        JSONObject jSONObject2 = divExtension.f6989b;
        String str = null;
        if (jSONObject2 != null) {
            try {
                valueOf = Integer.valueOf(jSONObject2.getInt(b9.h.f15451L));
            } catch (JSONException unused) {
            }
            this.f32091d.getClass();
            Intrinsics.checkNotNullParameter(divExtension, "divExtension");
            jSONObject = divExtension.f6989b;
            if (jSONObject != null) {
                try {
                    str = jSONObject.getString("view_name");
                } catch (JSONException unused2) {
                }
            }
            return valueOf != null && Intrinsics.areEqual("native_ad_view", str);
        }
        valueOf = null;
        this.f32091d.getClass();
        Intrinsics.checkNotNullParameter(divExtension, "divExtension");
        jSONObject = divExtension.f6989b;
        if (jSONObject != null) {
        }
        if (valueOf != null) {
            return false;
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* bridge */ /* synthetic */ void preprocess(@NotNull InterfaceC0752c3 interfaceC0752c3, @NotNull ExpressionResolver expressionResolver) {
        super.preprocess(interfaceC0752c3, expressionResolver);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 divBase) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        if (this.f32092e.get(div2View.getDivData()) != null) {
            Intrinsics.checkNotNullParameter(div2View, "div2View");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(divBase, "divBase");
        }
    }

    public sz1(@NotNull mp1 reporter, @NotNull x10 divExtensionProvider, @NotNull m70 extensionPositionParser, @NotNull n70 extensionViewNameParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divExtensionProvider, "divExtensionProvider");
        Intrinsics.checkNotNullParameter(extensionPositionParser, "extensionPositionParser");
        Intrinsics.checkNotNullParameter(extensionViewNameParser, "extensionViewNameParser");
        this.f32088a = reporter;
        this.f32089b = divExtensionProvider;
        this.f32090c = extensionPositionParser;
        this.f32091d = extensionViewNameParser;
        this.f32092e = new ConcurrentHashMap<>();
    }
}
