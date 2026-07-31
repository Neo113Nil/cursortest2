package ru.rustore.sdk.install.identifier.internal.data;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.reactive.single.SingleEmitter;

@Metadata
/* loaded from: classes3.dex */
public final class InstallIdentifierProvider$provide$1 extends s implements Function1<SingleEmitter<String>, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ InstallIdentifierProvider this$0;

    @Metadata
    /* renamed from: ru.rustore.sdk.install.identifier.internal.data.InstallIdentifierProvider$provide$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function1<String, Unit> {
        final /* synthetic */ SingleEmitter<String> $emitter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleEmitter<String> singleEmitter) {
            super(1);
            this.$emitter = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f41027a;
        }

        public final void invoke(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.$emitter.success(identifier);
        }
    }

    @Metadata
    /* renamed from: ru.rustore.sdk.install.identifier.internal.data.InstallIdentifierProvider$provide$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends s implements Function1<Throwable, Unit> {
        final /* synthetic */ SingleEmitter<String> $emitter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SingleEmitter<String> singleEmitter) {
            super(1);
            this.$emitter = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.$emitter.error(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallIdentifierProvider$provide$1(InstallIdentifierProvider installIdentifierProvider, Context context) {
        super(1);
        this.this$0 = installIdentifierProvider;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SingleEmitter<String>) obj);
        return Unit.f41027a;
    }

    public final void invoke(SingleEmitter<String> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            InstallIdentifierProvider installIdentifierProvider = this.this$0;
            Context context = this.$context;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            installIdentifierProvider.retrieveInstallIdentifierInternal(context, packageName, new AnonymousClass1(emitter), new AnonymousClass2(emitter));
        } catch (Throwable th) {
            emitter.error(th);
        }
    }
}
