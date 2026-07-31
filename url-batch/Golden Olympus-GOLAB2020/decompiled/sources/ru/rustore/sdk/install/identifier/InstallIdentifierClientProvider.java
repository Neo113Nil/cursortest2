package ru.rustore.sdk.install.identifier;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.install.identifier.internal.di.ServiceLocator;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierClientProvider {
    @NotNull
    public final InstallIdentifierClient provide(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        return new ServiceLocator.ServiceLocatorInstanceFactory().create(applicationContext).getInstallIdentifierClient$sdk_public_install_identifier_release();
    }
}
