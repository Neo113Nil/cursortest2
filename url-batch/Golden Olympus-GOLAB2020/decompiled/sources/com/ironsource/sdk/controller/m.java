package com.ironsource.sdk.controller;

import com.ironsource.fh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface m {

    @Metadata
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f19275a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f19276b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f19277c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f19278d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall) {
            this(funToCall, null, null, null, 14, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.f19275a);
            String str = this.f19276b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.f19276b);
            }
            String str2 = this.f19277c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.f19277c);
            }
            String str3 = this.f19278d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.f19278d);
            }
            sb.append("');");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall, @Nullable String str) {
            this(funToCall, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall, @Nullable String str, @Nullable String str2) {
            this(funToCall, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(@NotNull String funToCall, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.f19275a = funToCall;
            this.f19276b = str;
            this.f19277c = str2;
            this.f19278d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4);
        }
    }

    @Metadata
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private int f19279a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f19280b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m jsMethod, int i4) {
            this(jsMethod.a(), i4);
            Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            String str = "try{" + this.f19280b + "}catch(e){" + ((this.f19279a != fh.d.MODE_0.a() && (this.f19279a < fh.d.MODE_1.a() || this.f19279a > fh.d.MODE_3.a())) ? "empty" : "console.log(\"JS exception: \" + JSON.stringify(e));") + "}";
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …}\")\n          .toString()");
            return str;
        }

        public b(@NotNull String script, int i4) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.f19280b = script;
            this.f19279a = i4;
        }
    }

    @NotNull
    String a();
}
