package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
public final class nk extends kotlin.jvm.internal.s implements Function0<Single<ak>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44710a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(bk bkVar) {
        super(0);
        this.f44710a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bk bkVar = this.f44710a;
        ji jiVar = bkVar.f43877c;
        UserProfileProvider userProfileProvider = jiVar.f44389b;
        String packageName = jiVar.f44388a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return SingleMapKt.map(SingleFlatMapKt.flatMap(SingleOnErrorReturnKt.onErrorReturn(SingleMapKt.map(userProfileProvider.getUserProfile(packageName), hi.f44288a), ii.f44346a), new gk(bkVar)), new hk(bkVar));
    }
}
