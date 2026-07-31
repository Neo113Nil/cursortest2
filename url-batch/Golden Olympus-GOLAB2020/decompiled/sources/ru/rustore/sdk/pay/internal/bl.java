package ru.rustore.sdk.pay.internal;

import android.util.Base64;
import java.security.Signature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class bl extends kotlin.jvm.internal.s implements Function1<Signature, u7> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yk f43887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7 f43888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl f43889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(yk ykVar, u7 u7Var, cl clVar) {
        super(1);
        this.f43887a = ykVar;
        this.f43888b = u7Var;
        this.f43889c = clVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Signature localSignature = (Signature) obj;
        Intrinsics.checkNotNullParameter(localSignature, "localSignature");
        byte[] bytes = this.f43887a.f45300b.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        if (localSignature.verify(Base64.decode(bytes, 0))) {
            return this.f43888b;
        }
        RuStorePaymentException.RuStorePaySignatureException throwable = new RuStorePaymentException.RuStorePaySignatureException(null, null, 3, null);
        y7 y7Var = this.f43889c.f43936c;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
