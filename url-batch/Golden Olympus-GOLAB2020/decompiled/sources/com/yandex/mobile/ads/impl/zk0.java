package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yk0 f35614a;

    public /* synthetic */ zk0() {
        this(new yk0());
    }

    @NotNull
    public final ArrayList a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jsonObject.optJSONArray("installedPackages");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jsonObject2 = optJSONArray.getJSONObject(i4);
                yk0 yk0Var = this.f35614a;
                Intrinsics.checkNotNull(jsonObject2);
                yk0Var.getClass();
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonInstalledPackage");
                if (!y81.a(jsonObject2, "name")) {
                    throw new i61("Native Ad json has not required attributes");
                }
                String a4 = w81.a(jsonObject2, "jsonAsset", "name", "jsonAttribute", "name");
                if (a4 == null || a4.length() == 0 || Intrinsics.areEqual(a4, "null")) {
                    throw new i61("Native Ad json has not required attributes");
                }
                Intrinsics.checkNotNull(a4);
                int i5 = C2362y9.f34935b;
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
                Intrinsics.checkNotNullParameter("minVersion", "jsonAttribute");
                int optInt = jsonObject2.optInt("minVersion", 0);
                if (optInt < 0) {
                    optInt = 0;
                }
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
                Intrinsics.checkNotNullParameter("maxVersion", "jsonAttribute");
                int i6 = Integer.MAX_VALUE;
                int optInt2 = jsonObject2.optInt("maxVersion", Integer.MAX_VALUE);
                if (optInt2 >= 0) {
                    i6 = optInt2;
                }
                arrayList.add(new xk0(optInt, i6, a4));
            }
        }
        return arrayList;
    }

    public zk0(@NotNull yk0 installedPackageJsonParser) {
        Intrinsics.checkNotNullParameter(installedPackageJsonParser, "installedPackageJsonParser");
        this.f35614a = installedPackageJsonParser;
    }
}
