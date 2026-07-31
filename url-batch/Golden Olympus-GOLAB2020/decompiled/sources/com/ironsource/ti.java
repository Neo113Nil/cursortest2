package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ms;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public class ti {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f19788a = new a(null);

    @Metadata
    public static final class a {
        private a() {
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            d8 d4 = d(context);
            return d4.d().length() > 0 && d4.e().length() > 0;
        }

        @Nullable
        public final ms c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            d8 d4 = d(context);
            if (d4.d().length() <= 0 || d4.e().length() <= 0) {
                d4 = null;
            }
            if (d4 == null) {
                return null;
            }
            ms msVar = new ms(context, d4.d(), d4.f(), d4.e());
            msVar.a(ms.a.CACHE);
            return msVar;
        }

        @NotNull
        public final d8 d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject a4 = a(context);
            String cachedAppKey = a4.optString("appKey");
            String cachedUserId = a4.optString("userId");
            String cachedSettings = a4.optString(ms.f18193n);
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new d8(cachedAppKey, cachedUserId, cachedSettings);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final boolean a(@NotNull Context context) {
        return f19788a.b(context);
    }

    @Nullable
    public static final ms b(@NotNull Context context) {
        return f19788a.c(context);
    }

    @NotNull
    public static final d8 c(@NotNull Context context) {
        return f19788a.d(context);
    }
}
