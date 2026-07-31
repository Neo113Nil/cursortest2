package ru.rustore.sdk.install.identifier.internal.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.domain.RemoteInstallIdentifier;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteInstallIdentifierRepository$get$2 extends s implements Function1<String, RemoteInstallIdentifier> {
    final /* synthetic */ RemoteInstallIdentifierRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteInstallIdentifierRepository$get$2(RemoteInstallIdentifierRepository remoteInstallIdentifierRepository) {
        super(1);
        this.this$0 = remoteInstallIdentifierRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RemoteInstallIdentifier invoke(String data) {
        RemoteInstallIdentifierMapper remoteInstallIdentifierMapper;
        Intrinsics.checkNotNullParameter(data, "data");
        remoteInstallIdentifierMapper = this.this$0.mapper;
        return remoteInstallIdentifierMapper.mapToModel(data);
    }
}
