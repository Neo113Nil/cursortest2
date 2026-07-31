package com.ironsource;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class yn {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C1485i5 f20447a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20448b;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f20449a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f20450b = "adm";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f20451c = "isOneFlow";

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f20452d = "isMultipleAdObjects";

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f20453e = "adsInternalInfo";

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f20454f = "success";

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f20455g = "error";

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f20456h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yn() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final HashMap<String, String> a() {
        C1522n5 g4;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.f20448b));
        hashMap.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.f17681g);
        List<C1524o0> a4 = nm.f18364r.d().F().a();
        String jSONObject = (a4 != null ? new JSONObject().put("success", true).put("data", a4) : new JSONObject().put("success", false).put("error", "Failed to get ad internal info")).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "if (jsonAdInternalInfo !…    .toString()\n        }");
        hashMap.put(a.f20453e, jSONObject);
        C1485i5 c1485i5 = this.f20447a;
        if (c1485i5 != null && (g4 = c1485i5.g()) != null) {
            hashMap.put("adm", g4.a());
            hashMap.putAll(g4.b());
        }
        return hashMap;
    }

    public yn(@Nullable C1485i5 c1485i5, boolean z4) {
        this.f20447a = c1485i5;
        this.f20448b = z4;
    }

    public /* synthetic */ yn(C1485i5 c1485i5, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : c1485i5, (i4 & 2) != 0 ? false : z4);
    }
}
