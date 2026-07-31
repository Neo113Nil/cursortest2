package ru.rustore.sdk.pay.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class yg extends kotlin.jvm.internal.s implements Function1<k8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zg f45270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(zg zgVar) {
        super(1);
        this.f45270a = zgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object m243constructorimpl;
        k8 purchaseWithSberPay = (k8) obj;
        Intrinsics.checkNotNullParameter(purchaseWithSberPay, "purchaseWithSberPay");
        zg zgVar = this.f45270a;
        a aVar = zgVar.f45355a.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            f0 f0Var = zgVar.f45356b.f44056a.f44715b.f44719a;
            zgVar.f45359e.a(purchaseWithSberPay.f44425d);
        } else if (aVar instanceof a.b) {
            qb qbVar = zgVar.f45357c.f45261a.f43860b.f44876a;
            if (aVar instanceof a.C0255a) {
                zgVar.f45359e.a(purchaseWithSberPay.f44425d);
            } else {
                zgVar.f45360f.a(purchaseWithSberPay.f44425d);
            }
        } else {
            if (aVar != null) {
                throw new W1.m();
            }
            RuStorePaymentException.RuStorePayInvalidActivePurchase throwable = new RuStorePaymentException.RuStorePayInvalidActivePurchase("Active purchase disappeared during SberPay type update", null, 2, null);
            y7 y7Var = zgVar.f45362h;
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            zgVar.a((Throwable) throwable);
        }
        this.f45270a.f45358d.a(new ua.d(purchaseWithSberPay.f44423b));
        zg zgVar2 = this.f45270a;
        Url paymentUrl = purchaseWithSberPay.f44422a;
        PurchaseId purchaseId = purchaseWithSberPay.f44423b;
        tg tgVar = zgVar2.f45361g;
        tgVar.getClass();
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        li liVar = tgVar.f45042a;
        String uriString = paymentUrl.getValue();
        liVar.getClass();
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri build = Uri.parse(uriString).buildUpon().build();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(build);
        List<ResolveInfo> queryIntentActivities = liVar.f44585a.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
        if (queryIntentActivities.isEmpty()) {
            zgVar2.a((Throwable) new m1("Сбербанк", "bank100000000111"));
        } else {
            try {
                Result.Companion companion = Result.Companion;
                tg tgVar2 = zgVar2.f45361g;
                tgVar2.getClass();
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                tgVar2.f45042a.b(purchaseId);
                tg tgVar3 = zgVar2.f45361g;
                tgVar3.getClass();
                Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
                li liVar2 = tgVar3.f45042a;
                String uriString2 = paymentUrl.getValue();
                liVar2.getClass();
                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                Uri build2 = Uri.parse(uriString2).buildUpon().build();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(268435456);
                intent2.setData(build2);
                liVar2.f44585a.startActivity(intent2);
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                if (d4 instanceof ActivityNotFoundException) {
                    d4 = new m1("Сбербанк", "bank100000000111");
                }
                zgVar2.a(d4);
            }
        }
        return Unit.f41027a;
    }
}
