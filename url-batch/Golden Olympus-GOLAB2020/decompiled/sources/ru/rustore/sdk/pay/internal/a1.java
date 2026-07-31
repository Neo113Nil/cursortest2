package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import ru.rustore.sdk.core.util.ContextExtKt;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function0<Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f43791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f43792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, G g4) {
        super(0);
        this.f43791a = context;
        this.f43792b = g4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContextExtKt.unbindServiceSafely(this.f43791a, (ServiceConnection) this.f43792b.f41132b);
        return Unit.f41027a;
    }
}
