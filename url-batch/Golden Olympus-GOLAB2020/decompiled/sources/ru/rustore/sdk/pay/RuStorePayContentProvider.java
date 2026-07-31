package ru.rustore.sdk.pay;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.ConsoleApplicationId;

@Metadata
/* loaded from: classes3.dex */
public final class RuStorePayContentProvider extends ContentProvider {

    @Deprecated
    @NotNull
    public static final String CONSOLE_APP_ID_KEY = "console_app_id_value";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String SDK_PAY_SCHEME_KEY = "sdk_pay_scheme_value";

    @Deprecated
    @NotNull
    public static final String SDK_TYPE_KEY = "internal_config_key";

    @Deprecated
    @NotNull
    public static final String TYPE = "type";

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ConsoleApplicationId getConsoleAppId(Context context) {
        String obj;
        Serializable serializable;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = applicationInfo.metaData.getSerializable(CONSOLE_APP_ID_KEY, Serializable.class);
            if (serializable != null) {
                obj = serializable.toString();
            }
            obj = null;
        } else {
            Serializable serializable2 = applicationInfo.metaData.getSerializable(CONSOLE_APP_ID_KEY);
            if (serializable2 != null) {
                obj = serializable2.toString();
            }
            obj = null;
        }
        if (obj != null) {
            return new ConsoleApplicationId(obj);
        }
        return null;
    }

    private final Map<String, Object> getInternalConfig(Context context) {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
        String string = applicationInfo.metaData.getString(SDK_TYPE_KEY);
        String string2 = applicationInfo.metaData.getString(SDK_PAY_SCHEME_KEY);
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (string != null) {
        }
        if (string2 != null) {
            createMapBuilder.put("scheme", string2);
        }
        Map<String, Object> build = MapsKt.build(createMapBuilder);
        if (build.isEmpty()) {
            return null;
        }
        return build;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@NotNull Context context, @Nullable ProviderInfo providerInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.attachInfo(context, providerInfo);
        RuStorePayClientProvider ruStorePayClientProvider = new RuStorePayClientProvider();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        ruStorePayClientProvider.provide(applicationContext, getConsoleAppId(context), getInternalConfig(context));
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Integer.MIN_VALUE;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Integer.MIN_VALUE;
    }
}
