package ru.rustore.sdk.install.identifier.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.install.identifier.internal.domain.GetInstallationIdUseCase;
import ru.rustore.sdk.install.identifier.internal.domain.UpdateInstallIdentifierUseCase;
import ru.rustore.sdk.install.identifier.model.InstallationId;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierController {

    @NotNull
    private final GetInstallationIdUseCase getInstallationIdUseCase;

    @Metadata
    /* renamed from: ru.rustore.sdk.install.identifier.internal.InstallIdentifierController$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function1<Throwable, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }
    }

    @Metadata
    /* renamed from: ru.rustore.sdk.install.identifier.internal.InstallIdentifierController$2, reason: invalid class name */
    public static final class AnonymousClass2 extends s implements Function1<Unit, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.f41027a;
        }
    }

    public InstallIdentifierController(@NotNull UpdateInstallIdentifierUseCase updateInstallIdentifierUseCase, @NotNull GetInstallationIdUseCase getInstallationIdUseCase) {
        Intrinsics.checkNotNullParameter(updateInstallIdentifierUseCase, "updateInstallIdentifierUseCase");
        Intrinsics.checkNotNullParameter(getInstallationIdUseCase, "getInstallationIdUseCase");
        this.getInstallationIdUseCase = getInstallationIdUseCase;
        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(updateInstallIdentifierUseCase.invoke(), Dispatchers.INSTANCE.getIo()), AnonymousClass1.INSTANCE), null, AnonymousClass2.INSTANCE, 1, null);
    }

    @Nullable
    public final InstallationId getInstallationId() {
        return this.getInstallationIdUseCase.invoke();
    }
}
