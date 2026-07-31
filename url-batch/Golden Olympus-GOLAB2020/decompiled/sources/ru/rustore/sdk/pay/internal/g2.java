package ru.rustore.sdk.pay.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.s implements Function1<l8, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f44151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f44152b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, h1 h1Var) {
        super(1);
        this.f44151a = h2Var;
        this.f44152b = h1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l8 purchaseWithSbp = (l8) obj;
        Intrinsics.checkNotNullParameter(purchaseWithSbp, "purchaseWithSbp");
        h2 h2Var = this.f44151a;
        q1 q1Var = h2Var.f44205k;
        PackageName selectedAppPackage = this.f44152b.f44193c;
        k a4 = h2.a(h2Var);
        InvoiceId invoiceId = purchaseWithSbp.f44508c;
        PurchaseId purchaseId = purchaseWithSbp.f44507b;
        q1Var.getClass();
        Intrinsics.checkNotNullParameter(selectedAppPackage, "selectedAppPackage");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(q1Var.f44807a.a());
        createMapBuilder.put("selectedBankName", selectedAppPackage.getValue());
        if (a4 != null) {
        }
        createMapBuilder.put("invoiceId", invoiceId.getValue());
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        q1Var.f44808b.a("PaySheetPaymentSBP.selected", MapsKt.build(createMapBuilder));
        h2 h2Var2 = this.f44151a;
        a aVar = h2Var2.f44196b.f45034a.f43892a.f43838a;
        if (aVar instanceof a.C0255a) {
            h2Var2.f44201g.a(purchaseWithSbp.f44509d);
        } else if (aVar instanceof a.b) {
            h2Var2.f44202h.a(purchaseWithSbp.f44509d);
        } else if (aVar == null) {
            h2Var2.a((Throwable) new RuStorePaymentException.RuStorePayInvalidActivePurchase(null, null, 3, null));
        }
        this.f44151a.f44204j.a(new ua.e(purchaseWithSbp.f44507b));
        h2 h2Var3 = this.f44151a;
        h1 h1Var = this.f44152b;
        b2 b2Var = h2Var3.f44203i;
        Url paymentUrl = purchaseWithSbp.f44506a;
        j2 schema = h1Var.f44194d;
        b2Var.getClass();
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        Intrinsics.checkNotNullParameter(schema, "schema");
        li liVar = b2Var.f43844a;
        String uriString = paymentUrl.getValue();
        String str = schema.f44355a;
        liVar.getClass();
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri.Builder buildUpon = Uri.parse(uriString).buildUpon();
        if (str != null) {
            buildUpon = buildUpon.scheme(str);
        }
        Uri build = buildUpon.build();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(build);
        List<ResolveInfo> queryIntentActivities = liVar.f44585a.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
        if (queryIntentActivities.isEmpty()) {
            h2Var3.a((Throwable) new m1(h1Var.f44191a.f45112a, h1Var.f44194d.f44355a));
        } else {
            try {
                b2 b2Var2 = h2Var3.f44203i;
                PurchaseId purchaseId2 = purchaseWithSbp.f44507b;
                b2Var2.getClass();
                Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
                b2Var2.f43844a.b(purchaseId2);
                b2 b2Var3 = h2Var3.f44203i;
                Url paymentUrl2 = purchaseWithSbp.f44506a;
                j2 schema2 = h1Var.f44194d;
                b2Var3.getClass();
                Intrinsics.checkNotNullParameter(paymentUrl2, "paymentUrl");
                Intrinsics.checkNotNullParameter(schema2, "schema");
                li liVar2 = b2Var3.f43844a;
                String uriString2 = paymentUrl2.getValue();
                String str2 = schema2.f44355a;
                liVar2.getClass();
                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                Uri.Builder buildUpon2 = Uri.parse(uriString2).buildUpon();
                if (str2 != null) {
                    buildUpon2 = buildUpon2.scheme(str2);
                }
                Uri build2 = buildUpon2.build();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(268435456);
                intent2.setData(build2);
                liVar2.f44585a.startActivity(intent2);
            } catch (ActivityNotFoundException unused) {
                h2Var3.a((Throwable) new m1(h1Var.f44191a.f45112a, h1Var.f44194d.f44355a));
            }
        }
        return Unit.f41027a;
    }
}
