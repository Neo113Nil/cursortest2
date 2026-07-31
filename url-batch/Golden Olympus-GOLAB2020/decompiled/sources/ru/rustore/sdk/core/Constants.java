package ru.rustore.sdk.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class Constants {

    @NotNull
    public static final String DEEPLINK_RU_STORE_AUTH = "rustore://auth/sdk_flow?packageName=";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String RUSTORE_QA_PACKAGE = "ru.vk.store.qa";

    @NotNull
    public static final String RUSTORE_RELEASE_PACKAGE = "ru.vk.store";

    @NotNull
    public static final String RU_STORE_DOWNLOAD_URL = "https://trk.mail.ru/c/fd4xl1";

    private Constants() {
    }
}
