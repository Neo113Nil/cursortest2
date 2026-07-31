package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final au f15135a = new au();

    private au() {
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d4 = mu.f18248a.d();
        if (d4.containsKey(com.ironsource.mediationsdk.metadata.a.f17680f)) {
            return new JSONArray((Collection) d4.get(com.ironsource.mediationsdk.metadata.a.f17680f));
        }
        return null;
    }

    public final void b() {
        a(this, 70, null, null, 6, null);
    }

    public final void c() {
        a(this, 71, null, null, 6, null);
    }

    public final void d() {
        a(this, 73, null, null, 6, null);
    }

    public final void a(int i4) {
        a(72, Integer.valueOf(i4), null);
    }

    private final void a(int i4, Integer num, String str) {
        mu muVar = mu.f18248a;
        JSONObject a4 = muVar.a(false);
        if (num != null) {
            a4.put("errorCode", num.intValue());
            JSONArray a5 = a();
            if (a5 != null) {
                a4.put(com.ironsource.mediationsdk.metadata.a.f17680f, a5);
            }
        }
        if (str != null) {
            a4.put("reason", str);
        }
        muVar.a(i4, a4);
    }

    static /* synthetic */ void a(au auVar, int i4, Integer num, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            num = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        auVar.a(i4, num, str);
    }

    public final void a(@NotNull String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(74, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }
}
