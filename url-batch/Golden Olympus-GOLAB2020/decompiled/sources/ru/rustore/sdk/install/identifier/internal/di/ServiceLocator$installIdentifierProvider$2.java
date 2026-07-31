package ru.rustore.sdk.install.identifier.internal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.InstallIdentifierProvider;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$installIdentifierProvider$2 extends s implements Function0<InstallIdentifierProvider> {
    public static final ServiceLocator$installIdentifierProvider$2 INSTANCE = new ServiceLocator$installIdentifierProvider$2();

    public ServiceLocator$installIdentifierProvider$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstallIdentifierProvider invoke() {
        return new InstallIdentifierProvider();
    }
}
