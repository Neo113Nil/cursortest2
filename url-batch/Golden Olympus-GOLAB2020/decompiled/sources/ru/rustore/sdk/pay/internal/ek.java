package ru.rustore.sdk.pay.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.single.SingleTimeoutKt;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
public final class ek extends kotlin.jvm.internal.s implements Function1<Boolean, Single<ak>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(bk bkVar) {
        super(1);
        this.f44045a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ak.c cVar = this.f44045a.f43880f.f44952a.get();
        if (booleanValue) {
            fi fiVar = this.f44045a.f43875a;
            Context context = fiVar.f44130a;
            Intrinsics.checkNotNullParameter(context, "context");
            return SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(SingleMapKt.map(SingleMapErrorKt.mapError(SingleTimeoutKt.timeout$default(Single.Companion.create(new b1(context, false)), UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, TimeUnit.MILLISECONDS, null, 4, null), c1.f43894a), new ei(fiVar.f44131b)), Dispatchers.INSTANCE.getIo()), ck.f43933a);
        }
        if (cVar != null) {
            return Single.Companion.from(new dk(cVar));
        }
        bk bkVar = this.f44045a;
        bkVar.getClass();
        return SingleFlatMapKt.flatMap(Single.Companion.from(new kk(bkVar)), new mk(bkVar));
    }
}
