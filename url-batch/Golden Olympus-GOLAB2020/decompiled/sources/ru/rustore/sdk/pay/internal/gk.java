package ru.rustore.sdk.pay.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.single.SingleTimeoutKt;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
public final class gk extends kotlin.jvm.internal.s implements Function1<Boolean, Single<? extends ak>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(bk bkVar) {
        super(1);
        this.f44184a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            fi fiVar = this.f44184a.f43875a;
            Context context = fiVar.f44130a;
            Intrinsics.checkNotNullParameter(context, "context");
            return SingleSubscribeOnKt.subscribeOn(SingleMapKt.map(SingleMapErrorKt.mapError(SingleTimeoutKt.timeout$default(Single.Companion.create(new b1(context, true)), UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, TimeUnit.MILLISECONDS, null, 4, null), c1.f43894a), new ei(fiVar.f44131b)), Dispatchers.INSTANCE.getIo());
        }
        bk bkVar = this.f44184a;
        di diVar = bkVar.f43876b;
        r rVar = diVar.f43971a;
        rVar.getClass();
        return SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new p(rVar)), Dispatchers.INSTANCE.getIo()), new q(rVar)), new ci(diVar)), new ok(bkVar));
    }
}
