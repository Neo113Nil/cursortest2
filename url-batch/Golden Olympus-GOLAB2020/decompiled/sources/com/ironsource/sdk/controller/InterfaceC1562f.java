package com.ironsource.sdk.controller;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.sdk.controller.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1562f {

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.f$a */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0159a f19233c = new C0159a(null);

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f19234a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final JSONObject f19235b;

        @Metadata
        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0159a {
            private C0159a() {
            }

            @NotNull
            public final a a(@NotNull String jsonStr) {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id = jSONObject.getString(b.f19237b);
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id, "id");
                return new a(id, optJSONObject);
            }

            public /* synthetic */ C0159a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.f19234a = msgId;
            this.f19235b = jSONObject;
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aVar.f19234a;
            }
            if ((i4 & 2) != 0) {
                jSONObject = aVar.f19235b;
            }
            return aVar.a(str, jSONObject);
        }

        @Nullable
        public final JSONObject b() {
            return this.f19235b;
        }

        @NotNull
        public final String c() {
            return this.f19234a;
        }

        @Nullable
        public final JSONObject d() {
            return this.f19235b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f19234a, aVar.f19234a) && Intrinsics.areEqual(this.f19235b, aVar.f19235b);
        }

        public int hashCode() {
            int hashCode = this.f19234a.hashCode() * 31;
            JSONObject jSONObject = this.f19235b;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.f19234a + ", params=" + this.f19235b + ')';
        }

        @NotNull
        public static final a a(@NotNull String str) {
            return f19233c.a(str);
        }

        @NotNull
        public final a a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.f19234a;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f19236a = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f19237b = "msgId";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f19238c = "adId";

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f19239d = "params";

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f19240e = "success";

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f19241f = "reason";

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f19242g = "command";

        private b() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.f$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f19243a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f19244b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final JSONObject f19245c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private String f19246d;

        public c(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f19243a = adId;
            this.f19244b = command;
            this.f19245c = params;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.f19246d = uuid;
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = cVar.f19243a;
            }
            if ((i4 & 2) != 0) {
                str2 = cVar.f19244b;
            }
            if ((i4 & 4) != 0) {
                jSONObject = cVar.f19245c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        @NotNull
        public final String b() {
            return this.f19244b;
        }

        @NotNull
        public final JSONObject c() {
            return this.f19245c;
        }

        @NotNull
        public final String d() {
            return this.f19243a;
        }

        @NotNull
        public final String e() {
            return this.f19244b;
        }

        public boolean equals(@Nullable Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return Intrinsics.areEqual(this.f19246d, cVar.f19246d) && Intrinsics.areEqual(this.f19243a, cVar.f19243a) && Intrinsics.areEqual(this.f19244b, cVar.f19244b) && Intrinsics.areEqual(this.f19245c.toString(), cVar.f19245c.toString());
        }

        @NotNull
        public final String f() {
            return this.f19246d;
        }

        @NotNull
        public final JSONObject g() {
            return this.f19245c;
        }

        @NotNull
        public final String h() {
            String jSONObject = new JSONObject().put(b.f19237b, this.f19246d).put(b.f19238c, this.f19243a).put("params", this.f19245c).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n          .…ms)\n          .toString()");
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public String toString() {
            return "MessageToController(adId=" + this.f19243a + ", command=" + this.f19244b + ", params=" + this.f19245c + ')';
        }

        @NotNull
        public final c a(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new c(adId, command, params);
        }

        @NotNull
        public final String a() {
            return this.f19243a;
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f19246d = str;
        }
    }
}
