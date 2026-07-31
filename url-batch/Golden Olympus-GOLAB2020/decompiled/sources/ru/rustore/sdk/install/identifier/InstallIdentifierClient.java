package ru.rustore.sdk.install.identifier;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.install.identifier.internal.InstallIdentifierController;
import ru.rustore.sdk.install.identifier.internal.di.ServiceLocator;
import ru.rustore.sdk.install.identifier.model.InstallationId;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierClient {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final InstallIdentifierController controller;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InstallIdentifierClient getInstance() {
            return ServiceLocator.Companion.getInstance().getInstallIdentifierClient$sdk_public_install_identifier_release();
        }

        private Companion() {
        }
    }

    public InstallIdentifierClient(@NotNull InstallIdentifierController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    @Nullable
    public final InstallationId getInstallationId() {
        return this.controller.getInstallationId();
    }
}
