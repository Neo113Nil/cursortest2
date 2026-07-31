package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1927fg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f25779a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final er0 f25780b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f25781c;

    public C1927fg(@NotNull Context context, @NotNull mp1 reporter, @NotNull er0 linkJsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        this.f25779a = reporter;
        this.f25780b = linkJsonParser;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f25781c = applicationContext;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public final C2276uf<?> a(@NotNull JSONObject jsonAsset, @NotNull InterfaceC1906ej base64EncodingParameters) {
        InterfaceC1951gg ld1Var;
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        if (!y81.a(jsonAsset, "name", "type", "clickable", "required")) {
            throw new i61("Native Ad json has not required attributes");
        }
        String type = w81.a(jsonAsset, "jsonAsset", "type", "jsonAttribute", "type");
        if (type == null || type.length() == 0 || Intrinsics.areEqual(type, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(type);
        Intrinsics.checkNotNullParameter(jsonAsset, "jsonAsset");
        Intrinsics.checkNotNullParameter("name", "jsonAttribute");
        String name = jsonAsset.optString("name");
        if (name == null || name.length() == 0 || Intrinsics.areEqual(name, "null")) {
            throw new i61("Native Ad json has not required attributes");
        }
        Intrinsics.checkNotNull(name);
        JSONObject optJSONObject = jsonAsset.optJSONObject("link");
        dr0 a4 = optJSONObject == null ? null : this.f25780b.a(optJSONObject, base64EncodingParameters);
        Context context = this.f25781c;
        mp1 reporter = this.f25779a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        if (Intrinsics.areEqual(name, "close_button")) {
            ld1Var = new hp();
        } else {
            if (!Intrinsics.areEqual(name, "feedback")) {
                switch (type.hashCode()) {
                    case -1034364087:
                        if (type.equals("number")) {
                            ld1Var = new ld1(new kr1());
                            break;
                        }
                        break;
                    case -951532658:
                        if (type.equals("qrcode")) {
                            ld1Var = new oo(new f82());
                            break;
                        }
                        break;
                    case -891985903:
                        if (type.equals("string")) {
                            ld1Var = new v22();
                            break;
                        }
                        break;
                    case -410956671:
                        if (type.equals("container")) {
                            ld1Var = new u40();
                            break;
                        }
                        break;
                    case 100313435:
                        if (type.equals("image")) {
                            ld1Var = new hj0();
                            break;
                        }
                        break;
                    case 103772132:
                        if (type.equals(b9.h.f15446I0)) {
                            ld1Var = new nw0(context, reporter, base64EncodingParameters, new wv0(e92.a(base64EncodingParameters.b())), new ne2(context, reporter, base64EncodingParameters), new wi0(), new kj0());
                            break;
                        }
                        break;
                }
                ap0.b(new Object[0]);
                throw new i61("Native Ad json has not required attributes");
            }
            ld1Var = new ra0(new hj0());
        }
        return new C2276uf<>(name, type, ld1Var.a(jsonAsset), a4, jsonAsset.getBoolean("clickable"), jsonAsset.getBoolean("required"));
    }
}
