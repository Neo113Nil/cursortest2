package ru.rustore.unitysdk.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.util.RuStoreUtils;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreUnityCoreClient {

    @NotNull
    public static final RuStoreUnityCoreClient INSTANCE = new RuStoreUnityCoreClient();

    private RuStoreUnityCoreClient() {
    }

    public final boolean isRuStoreInstalled() {
        return RuStoreUtils.INSTANCE.isRuStoreInstalled(PlayerProvider.INSTANCE.getCurrentActivity());
    }

    public final void openRuStore() {
        RuStoreUtils.INSTANCE.openRuStore(PlayerProvider.INSTANCE.getCurrentActivity());
    }

    public final void openRuStoreAuthorization() {
        RuStoreUtils.INSTANCE.openRuStoreAuthorization(PlayerProvider.INSTANCE.getCurrentActivity());
    }

    public final void openRuStoreDownloadInstruction() {
        RuStoreUtils.INSTANCE.openRuStoreDownloadInstruction(PlayerProvider.INSTANCE.getCurrentActivity());
    }
}
