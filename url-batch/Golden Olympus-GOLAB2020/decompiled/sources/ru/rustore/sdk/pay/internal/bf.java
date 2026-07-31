package ru.rustore.sdk.pay.internal;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.ApplicationPurchase;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;
import ru.rustore.sdk.pay.model.Currency;
import ru.rustore.sdk.pay.model.Description;
import ru.rustore.sdk.pay.model.DeveloperPayload;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.Purchase;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.SubscriptionPurchase;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;

/* loaded from: classes3.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final fc f43863a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final yf f43864b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final cc f43865c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final p0 f43866d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final il f43867e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final x4 f43868f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final y7 f43869g;

    public bf(@NotNull fc productTypeMapper, @NotNull yf purchaseTypeMapper, @NotNull cc productPurchaseStatusMapper, @NotNull p0 applicationPurchaseStatusMapper, @NotNull il subscriptionPurchaseStatusMapper, @NotNull x4 dateTimeMapper, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(productTypeMapper, "productTypeMapper");
        Intrinsics.checkNotNullParameter(purchaseTypeMapper, "purchaseTypeMapper");
        Intrinsics.checkNotNullParameter(productPurchaseStatusMapper, "productPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(applicationPurchaseStatusMapper, "applicationPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(subscriptionPurchaseStatusMapper, "subscriptionPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(dateTimeMapper, "dateTimeMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43863a = productTypeMapper;
        this.f43864b = purchaseTypeMapper;
        this.f43865c = productPurchaseStatusMapper;
        this.f43866d = applicationPurchaseStatusMapper;
        this.f43867e = subscriptionPurchaseStatusMapper;
        this.f43868f = dateTimeMapper;
        this.f43869g = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r7 = new ru.rustore.sdk.pay.model.PurchaseId(r23.f44528a);
        r2 = new ru.rustore.sdk.pay.model.ProductId(r23.f44529b);
        r8 = new ru.rustore.sdk.pay.model.InvoiceId(r23.f44530c);
        r3 = r23.f44531d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r9 = new ru.rustore.sdk.pay.model.OrderId(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r3 = r22.f43863a;
        r4 = r23.f44533f;
        r3.getClass();
        r21 = ru.rustore.sdk.pay.internal.fc.a(r4);
        r12 = new ru.rustore.sdk.pay.model.Description(r23.f44534g);
        r10 = r22.f43864b.a(r23.f44532e);
        r3 = r22.f43868f;
        r4 = r23.f44540m;
        r3.getClass();
        r13 = ru.rustore.sdk.pay.internal.x4.a(r4);
        r14 = new ru.rustore.sdk.pay.model.Price(r23.f44536i);
        r15 = new ru.rustore.sdk.pay.model.AmountLabel(r23.f44535h);
        r3 = new ru.rustore.sdk.pay.model.Currency(r23.f44537j);
        r4 = new ru.rustore.sdk.pay.model.Quantity(r23.f44538k);
        r6 = r22.f43865c;
        r11 = r23.f44539l;
        r6.getClass();
        r11 = ru.rustore.sdk.pay.internal.cc.a(r11);
        r6 = r23.f44541n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        r17 = new ru.rustore.sdk.pay.model.DeveloperPayload(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        return new ru.rustore.sdk.pay.model.ProductPurchase(r7, r8, r9, r10, r11, r12, r13, r14, r15, r3, r17, r23.f44542o.f44220a, r2, r4, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r9 = null;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Purchase a(@NotNull le dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String str = dto.f44533f;
        int hashCode = str.hashCode();
        if (hashCode != -1636482787) {
            if (hashCode != -587753168) {
                if (hashCode != 318720611) {
                }
            } else if (str.equals("APPLICATION")) {
                PurchaseId purchaseId = new PurchaseId(dto.f44528a);
                PackageName packageName = new PackageName(dto.f44529b);
                InvoiceId invoiceId = new InvoiceId(dto.f44530c);
                String str2 = dto.f44531d;
                OrderId orderId = str2 != null ? new OrderId(str2) : null;
                Description description = new Description(dto.f44534g);
                PurchaseType a4 = this.f43864b.a(dto.f44532e);
                x4 x4Var = this.f43868f;
                String str3 = dto.f44540m;
                x4Var.getClass();
                Date a5 = x4.a(str3);
                Price price = new Price(dto.f44536i);
                AmountLabel amountLabel = new AmountLabel(dto.f44535h);
                Currency currency = new Currency(dto.f44537j);
                p0 p0Var = this.f43866d;
                String str4 = dto.f44539l;
                p0Var.getClass();
                ApplicationPurchaseStatus a6 = p0.a(str4);
                String str5 = dto.f44541n;
                return new ApplicationPurchase(purchaseId, invoiceId, orderId, a4, a6, description, a5, price, amountLabel, currency, str5 != null ? new DeveloperPayload(str5) : null, dto.f44542o.f44220a, packageName);
            }
        } else if (str.equals("SUBSCRIPTION")) {
            PurchaseId purchaseId2 = new PurchaseId(dto.f44528a);
            ProductId productId = new ProductId(dto.f44529b);
            InvoiceId invoiceId2 = new InvoiceId(dto.f44530c);
            String str6 = dto.f44531d;
            OrderId orderId2 = str6 != null ? new OrderId(str6) : null;
            Description description2 = new Description(dto.f44534g);
            PurchaseType a7 = this.f43864b.a(dto.f44532e);
            x4 x4Var2 = this.f43868f;
            String str7 = dto.f44540m;
            x4Var2.getClass();
            Date a8 = x4.a(str7);
            Price price2 = new Price(dto.f44536i);
            AmountLabel amountLabel2 = new AmountLabel(dto.f44535h);
            Currency currency2 = new Currency(dto.f44537j);
            SubscriptionPurchaseStatus a9 = this.f43867e.a(dto.f44539l);
            String str8 = dto.f44541n;
            DeveloperPayload developerPayload = str8 != null ? new DeveloperPayload(str8) : null;
            boolean z4 = dto.f44542o.f44220a;
            hl hlVar = dto.f44543p;
            boolean areEqual = Intrinsics.areEqual(hlVar != null ? hlVar.f44292b : null, "GRACE");
            x4 x4Var3 = this.f43868f;
            hl hlVar2 = dto.f44543p;
            String str9 = hlVar2 != null ? hlVar2.f44291a : null;
            if (str9 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            x4Var3.getClass();
            return new SubscriptionPurchase(purchaseId2, invoiceId2, orderId2, a7, a9, description2, a8, price2, amountLabel2, currency2, developerPayload, z4, productId, x4.a(str9), areEqual);
        }
        IllegalArgumentException throwable = new IllegalArgumentException("Unknown product type: " + dto.f44533f);
        y7 y7Var = this.f43869g;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
