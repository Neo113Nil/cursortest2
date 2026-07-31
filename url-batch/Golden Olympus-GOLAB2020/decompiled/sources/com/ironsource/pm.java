package com.ironsource;

import com.ironsource.sdk.controller.InterfaceC1562f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class pm {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f18690d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18691a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18692b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final JSONObject f18693c;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final pm a(@NotNull String jsonStr) {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(InterfaceC1562f.b.f19238c);
            String command = jSONObject.getString(InterfaceC1562f.b.f19242g);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new pm(adId, command, optJSONObject);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pm(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f18691a = adId;
        this.f18692b = command;
        this.f18693c = jSONObject;
    }

    public static /* synthetic */ pm a(pm pmVar, String str, String str2, JSONObject jSONObject, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = pmVar.f18691a;
        }
        if ((i4 & 2) != 0) {
            str2 = pmVar.f18692b;
        }
        if ((i4 & 4) != 0) {
            jSONObject = pmVar.f18693c;
        }
        return pmVar.a(str, str2, jSONObject);
    }

    @NotNull
    public final String b() {
        return this.f18692b;
    }

    @Nullable
    public final JSONObject c() {
        return this.f18693c;
    }

    @NotNull
    public final String d() {
        return this.f18691a;
    }

    @NotNull
    public final String e() {
        return this.f18692b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return Intrinsics.areEqual(this.f18691a, pmVar.f18691a) && Intrinsics.areEqual(this.f18692b, pmVar.f18692b) && Intrinsics.areEqual(this.f18693c, pmVar.f18693c);
    }

    @Nullable
    public final JSONObject f() {
        return this.f18693c;
    }

    public int hashCode() {
        int hashCode = ((this.f18691a.hashCode() * 31) + this.f18692b.hashCode()) * 31;
        JSONObject jSONObject = this.f18693c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessageToNative(adId=" + this.f18691a + ", command=" + this.f18692b + ", params=" + this.f18693c + ')';
    }

    @NotNull
    public static final pm a(@NotNull String str) {
        return f18690d.a(str);
    }

    @NotNull
    public final pm a(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new pm(adId, command, jSONObject);
    }

    @NotNull
    public final String a() {
        return this.f18691a;
    }
}
