package ru.rustore.sdk.user.profile;

import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.core.exception.RuStoreConnectionTimeout;

@Metadata
/* loaded from: classes3.dex */
final class UserProfileProvider$getUserProfile$1 extends s implements Function1<Throwable, Throwable> {
    public static final UserProfileProvider$getUserProfile$1 INSTANCE = new UserProfileProvider$getUserProfile$1();

    UserProfileProvider$getUserProfile$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error instanceof TimeoutException ? new RuStoreConnectionTimeout() : error;
    }
}
