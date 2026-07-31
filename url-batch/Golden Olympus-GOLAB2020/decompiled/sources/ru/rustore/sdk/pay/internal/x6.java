package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.ne;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

@Metadata
/* loaded from: classes3.dex */
public final class x6 extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f45209a;

    public x6() {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f45209a = serviceLocator;
    }

    public final <T> T a(Function1<? super f0, ? extends T> function1, Function1<? super qb, ? extends T> function12) {
        a aVar = ((t5) this.f45209a.f45435P1.getValue()).f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            return (T) function1.invoke(((f6) this.f45209a.f45439Q1.getValue()).f44056a.f44715b.f44719a);
        }
        if (aVar instanceof a.b) {
            return (T) function12.invoke(((y5) this.f45209a.f45520i2.getValue()).f45261a.f43860b.f44876a);
        }
        if (aVar == null) {
            throw new IllegalStateException("invalid active purchase type");
        }
        throw new W1.m();
    }

    public final void a(hf result) {
        ne event;
        h5 h5Var = (h5) this.f45209a.f45447S1.getValue();
        h5Var.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof hf.a.c) {
            f0 f0Var = ((hf.a.c) result).f44243a;
            event = new ne.b(f0Var.f44047a, f0Var.f44048b);
        } else if (result instanceof hf.b.c) {
            qb qbVar = ((hf.b.c) result).f44256a;
            event = new ne.b(qbVar.f44818c, qbVar.f44819d);
        } else if (result instanceof hf.a.b) {
            hf.a.b bVar = (hf.a.b) result;
            event = new ne.d(bVar.f44240b, bVar.f44241c);
        } else if (result instanceof hf.b.C0259b) {
            hf.b.C0259b c0259b = (hf.b.C0259b) result;
            event = new ne.d(c0259b.f44247a, c0259b.f44248b);
        } else if (result instanceof hf.a.C0258a) {
            event = new ne.a(((hf.a.C0258a) result).f44237a);
        } else if (result instanceof hf.b.a) {
            event = new ne.a(((hf.b.a) result).f44244a);
        } else {
            throw new W1.m();
        }
        pe peVar = h5Var.f44218b;
        peVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oe oeVar = peVar.f44782a;
        oeVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        oeVar.f44732a.emit(event);
        mf mfVar = h5Var.f44217a;
        mfVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        kf kfVar = mfVar.f44644a;
        kfVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        kfVar.f44479a.emit(result);
        ((wa) this.f45209a.f45456U2.getValue()).f45161a.f45124a = null;
        ((e) this.f45209a.f45460V2.getValue()).f43981a = d.c.f43945a;
    }
}
