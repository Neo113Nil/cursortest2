package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2186qg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1927fg f30770a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2186qg(Context context, mp1 mp1Var, er0 er0Var, int i4) {
        this(context, mp1Var, er0Var, new C1927fg(context, mp1Var, er0Var));
        er0Var = (i4 & 4) != 0 ? new er0(mp1Var) : er0Var;
    }

    @NotNull
    public final ArrayList a(@NotNull JSONObject jsonNative, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(jsonNative, "jsonNative");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jsonNative.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            boolean z4 = jSONObject.getBoolean("required");
            try {
                C1927fg c1927fg = this.f30770a;
                Intrinsics.checkNotNull(jSONObject);
                arrayList.add(c1927fg.a(jSONObject, base64EncodingParameters));
            } catch (Throwable th) {
                if (z4) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public C2186qg(@NotNull Context context, @NotNull mp1 reporter, @NotNull er0 linkJsonParser, @NotNull C1927fg assetJsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        Intrinsics.checkNotNullParameter(assetJsonParser, "assetJsonParser");
        this.f30770a = assetJsonParser;
    }
}
