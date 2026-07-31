package ru.rustore.sdk.install.identifier.internal.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteInstallIdentifierRepository$get$1 extends s implements Function1<Throwable, String> {
    public static final RemoteInstallIdentifierRepository$get$1 INSTANCE = new RemoteInstallIdentifierRepository$get$1();

    public RemoteInstallIdentifierRepository$get$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "";
    }
}
