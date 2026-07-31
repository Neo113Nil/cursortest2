package ru.rustore.sdk.pay.internal;

import java.security.Signature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.single.Single;

/* loaded from: classes3.dex */
public final class uk extends kotlin.jvm.internal.s implements Function1<gc, Single<Signature>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wk f45106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(wk wkVar, String str) {
        super(1);
        this.f45106a = wkVar;
        this.f45107b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gc publicKey = (gc) obj;
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        wk wkVar = this.f45106a;
        String str = this.f45107b;
        wkVar.getClass();
        return Single.Companion.create(new vk(wkVar, publicKey, str));
    }
}
