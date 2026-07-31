package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.user.profile.model.UserProfile;

/* loaded from: classes3.dex */
public final class hi extends kotlin.jvm.internal.s implements Function1<UserProfile, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final hi f44288a = new hi();

    public hi() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserProfile it = (UserProfile) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
