package ru.rustore.sdk.user.profile;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.user.profile.model.UserProfile;

@Metadata
/* loaded from: classes3.dex */
final class UserProfileProvider$getUserProfileInternal$1 extends s implements Function1<SingleEmitter<UserProfile>, Unit> {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ UserProfileProvider this$0;

    @Metadata
    /* renamed from: ru.rustore.sdk.user.profile.UserProfileProvider$getUserProfileInternal$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<UserProfile, Unit> {
        final /* synthetic */ SingleEmitter<UserProfile> $emitter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SingleEmitter<UserProfile> singleEmitter) {
            super(1);
            this.$emitter = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserProfile) obj);
            return Unit.f41027a;
        }

        public final void invoke(UserProfile userProfile) {
            Intrinsics.checkNotNullParameter(userProfile, "userProfile");
            this.$emitter.success(userProfile);
        }
    }

    @Metadata
    /* renamed from: ru.rustore.sdk.user.profile.UserProfileProvider$getUserProfileInternal$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function1<RuStoreException, Unit> {
        final /* synthetic */ SingleEmitter<UserProfile> $emitter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SingleEmitter<UserProfile> singleEmitter) {
            super(1);
            this.$emitter = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RuStoreException) obj);
            return Unit.f41027a;
        }

        public final void invoke(RuStoreException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.$emitter.error(error);
        }
    }

    @Metadata
    /* renamed from: ru.rustore.sdk.user.profile.UserProfileProvider$getUserProfileInternal$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements Function0<Unit> {
        final /* synthetic */ G $serviceConnection;
        final /* synthetic */ UserProfileProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(UserProfileProvider userProfileProvider, G g4) {
            super(0);
            this.this$0 = userProfileProvider;
            this.$serviceConnection = g4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m288invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m288invoke() {
            Context context;
            context = this.this$0.context;
            ContextExtKt.unbindServiceSafely(context, (ServiceConnection) this.$serviceConnection.f41132b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileProvider$getUserProfileInternal$1(UserProfileProvider userProfileProvider, String str) {
        super(1);
        this.this$0 = userProfileProvider;
        this.$applicationId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SingleEmitter<UserProfile>) obj);
        return Unit.f41027a;
    }

    public final void invoke(SingleEmitter<UserProfile> emitter) {
        Context context;
        Context context2;
        Context context3;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        RuStoreUtils ruStoreUtils = RuStoreUtils.INSTANCE;
        context = this.this$0.context;
        if (!ruStoreUtils.isRuStoreInstalled(context)) {
            emitter.error(new RuStoreNotInstalledException());
            return;
        }
        Intent intent = new Intent(UserProfileProvider.ACTION);
        context2 = this.this$0.context;
        List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
        ComponentName findRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(queryIntentServices);
        if (findRuStoreServiceComponentName == null) {
            emitter.error(new RuStoreOutdatedException());
            return;
        }
        intent.setComponent(findRuStoreServiceComponentName);
        G g4 = new G();
        g4.f41132b = new UserProfileProviderServiceConnection(this.$applicationId, new AnonymousClass1(emitter), new AnonymousClass2(emitter));
        emitter.onFinish(new AnonymousClass3(this.this$0, g4));
        context3 = this.this$0.context;
        if (context3.bindService(intent, (ServiceConnection) g4.f41132b, 1)) {
            return;
        }
        emitter.error(new RuStoreOutdatedException());
    }
}
