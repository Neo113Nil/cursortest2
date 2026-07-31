package ru.rustore.sdk.pay.internal;

import java.security.PublicKey;
import java.security.Signature;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* loaded from: classes3.dex */
public final class vk extends kotlin.jvm.internal.s implements Function1<SingleEmitter<Signature>, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wk f45141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gc f45142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f45143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(wk wkVar, gc gcVar, String str) {
        super(1);
        this.f45141a = wkVar;
        this.f45142b = gcVar;
        this.f45143c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object m243constructorimpl;
        SingleEmitter emitter = (SingleEmitter) obj;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        wk wkVar = this.f45141a;
        gc gcVar = this.f45142b;
        String str = this.f45143c;
        try {
            Result.Companion companion = Result.Companion;
            wkVar.f45193b.getClass();
            PublicKey a4 = e7.a(gcVar);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(a4);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            m243constructorimpl = Result.m243constructorimpl(signature);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            emitter.error(d4);
        }
        if (Result.f(m243constructorimpl)) {
            Signature value = (Signature) m243constructorimpl;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            emitter.success(value);
        }
        return Unit.f41027a;
    }
}
