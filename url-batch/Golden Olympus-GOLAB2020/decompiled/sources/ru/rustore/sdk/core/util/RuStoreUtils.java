package ru.rustore.sdk.core.util;

import android.content.Context;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.Constants;
import ru.rustore.sdk.core.R;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreUtils {

    @NotNull
    public static final RuStoreUtils INSTANCE = new RuStoreUtils();

    private RuStoreUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOpenAppError(Context context) {
        Toast.makeText(context, context.getString(R.string.default_open_error), 0).show();
    }

    public final boolean isRuStoreInstalled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextExtKt.isAppInstalled(context, "ru.vk.store.qa") || ContextExtKt.isAppInstalled(context, "ru.vk.store");
    }

    public final void openRuStore(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (ContextExtKt.isAppInstalled(context, "ru.vk.store.qa")) {
            ContextExtKt.openApp(context, "ru.vk.store.qa", new RuStoreUtils$openRuStore$1$1(context));
        } else {
            ContextExtKt.openApp(context, "ru.vk.store", new RuStoreUtils$openRuStore$1$2(context));
        }
    }

    public final void openRuStoreAuthorization(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.openUrl(context, Constants.DEEPLINK_RU_STORE_AUTH + context.getPackageName(), new RuStoreUtils$openRuStoreAuthorization$1(context));
    }

    public final void openRuStoreDownloadInstruction(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.openUrl(context, Constants.RU_STORE_DOWNLOAD_URL, new RuStoreUtils$openRuStoreDownloadInstruction$1(context));
    }
}
