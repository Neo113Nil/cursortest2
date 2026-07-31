package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.j7;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

@Metadata
/* loaded from: classes3.dex */
public final class hg extends V {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f44257o = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final xl f44258a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final q5 f44259b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final t5 f44260c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final f6 f44261d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final y5 f44262e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final bi f44263f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final ya f44264g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final zf f44265h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final bg f44266i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final y7 f44267j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateSubject<j7> f44268k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final Subject<j7> f44269l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList f44270m;

    /* renamed from: n, reason: collision with root package name */
    public int f44271n;

    public hg() {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f44258a = (xl) serviceLocator.f45599y1.getValue();
        this.f44259b = (q5) serviceLocator.f45604z1.getValue();
        this.f44260c = (t5) serviceLocator.f45435P1.getValue();
        this.f44261d = (f6) serviceLocator.f45439Q1.getValue();
        this.f44262e = (y5) serviceLocator.f45520i2.getValue();
        this.f44263f = (bi) serviceLocator.f45545n2.getValue();
        this.f44264g = (ya) serviceLocator.f45400G2.getValue();
        this.f44265h = (zf) serviceLocator.f45606z3.getValue();
        this.f44266i = (bg) serviceLocator.f45596x3.getValue();
        this.f44267j = (y7) serviceLocator.f45561q3.getValue();
        MutableStateSubject<j7> mutableStateSubject = new MutableStateSubject<>(j7.a.f44363a);
        this.f44268k = mutableStateSubject;
        this.f44269l = SubjectExtensionsKt.asSubject(mutableStateSubject);
        this.f44270m = new ArrayList();
    }

    public final void a(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        y7 y7Var = this.f44267j;
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(errorMessage, null, 2, null);
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        b(errorMessage);
    }

    public final void b(String str) {
        a aVar = this.f44260c.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = this.f44261d.f44056a.f44715b.f44719a;
            hf.a.b result = new hf.a.b(f0Var != null ? f0Var.f44047a : null, f0Var != null ? f0Var.f44048b : null, f0Var != null ? f0Var.f44050d : null, new RuStorePaymentException.RuStorePaymentCommonException(str, null, 2, null));
            bg bgVar = this.f44266i;
            bgVar.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            bgVar.f43870a.a((hf) result, false);
            return;
        }
        if (aVar instanceof a.b) {
            a(this.f44262e.f45261a.f43860b.f44876a, str);
        } else if (aVar == null) {
            a(null, str);
        }
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        ArrayList arrayList = this.f44270m;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Disposable) obj).dispose();
        }
        super.onCleared();
    }

    public final void a(qb qbVar, String str) {
        ze zeVar;
        PurchaseId purchaseId = qbVar != null ? qbVar.f44818c : null;
        InvoiceId invoiceId = qbVar != null ? qbVar.f44819d : null;
        OrderId orderId = qbVar != null ? qbVar.f44816a : null;
        Quantity quantity = (qbVar == null || (zeVar = qbVar.f44822g) == null) ? null : zeVar.getQuantity();
        hf.b.C0259b result = new hf.b.C0259b(orderId, purchaseId, qbVar != null ? qbVar.f44817b : null, invoiceId, quantity, qbVar != null ? qbVar.f44820e : null, qbVar != null ? Boolean.valueOf(qbVar.f44823h) : null, qbVar != null ? qbVar.f44821f : null, new RuStorePaymentException.RuStorePaymentCommonException(str, null, 2, null));
        bg bgVar = this.f44266i;
        bgVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        bgVar.f43870a.a((hf) result, false);
    }
}
