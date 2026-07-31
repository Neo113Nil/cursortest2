package com.yandex.mobile.ads.impl;

import O1.C0933m5;
import O1.InterfaceC0752c3;
import android.view.View;
import com.ironsource.b9;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uz1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pz1 f33450a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f33451b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x10 f33452c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m70 f33453d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2208rg f33454e;

    public uz1(@NotNull pz1 sliderAdPrivate, @NotNull mp1 reporter, @NotNull x10 divExtensionProvider, @NotNull m70 extensionPositionParser, @NotNull g61 assetNamesProvider, @NotNull C2208rg assetsNativeAdViewProviderCreator) {
        Intrinsics.checkNotNullParameter(sliderAdPrivate, "sliderAdPrivate");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divExtensionProvider, "divExtensionProvider");
        Intrinsics.checkNotNullParameter(extensionPositionParser, "extensionPositionParser");
        Intrinsics.checkNotNullParameter(assetNamesProvider, "assetNamesProvider");
        Intrinsics.checkNotNullParameter(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f33450a = sliderAdPrivate;
        this.f33451b = reporter;
        this.f33452c = divExtensionProvider;
        this.f33453d = extensionPositionParser;
        this.f33454e = assetsNativeAdViewProviderCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull Div2View div2View, @NotNull View view, @NotNull InterfaceC0752c3 divBase) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        view.setVisibility(8);
        this.f33452c.getClass();
        C0933m5 divExtension = x10.a(divBase, "view");
        if (divExtension == null) {
            return;
        }
        this.f33453d.getClass();
        Intrinsics.checkNotNullParameter(divExtension, "divExtension");
        JSONObject jSONObject = divExtension.f6989b;
        if (jSONObject != null) {
            try {
                valueOf = Integer.valueOf(jSONObject.getInt(b9.h.f15451L));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                ArrayList d4 = this.f33450a.d();
                if (valueOf.intValue() < 0 || valueOf.intValue() >= d4.size()) {
                    return;
                }
                try {
                    ((f61) d4.get(valueOf.intValue())).b(this.f33454e.a(view, new md1(valueOf.intValue())), j10.a(div2View).a(valueOf.intValue()));
                    view.setVisibility(0);
                    return;
                } catch (t51 e4) {
                    this.f33451b.reportError("Failed to bind DivKit Slider Inner Ad", e4);
                    return;
                }
            }
            return;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
