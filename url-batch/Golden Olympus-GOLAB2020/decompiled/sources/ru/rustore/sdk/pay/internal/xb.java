package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.gl;
import ru.rustore.sdk.pay.internal.jl;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;
import ru.rustore.sdk.pay.model.Title;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class xb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final fc f45218a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final df f45219b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final xf f45220c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final yf f45221d;

    public xb(@NotNull fc productTypeMapper, @NotNull df productInfoMapper, @NotNull xf subscriptionInfoMapper, @NotNull yf purchaseTypeMapper) {
        Intrinsics.checkNotNullParameter(productTypeMapper, "productTypeMapper");
        Intrinsics.checkNotNullParameter(productInfoMapper, "productInfoMapper");
        Intrinsics.checkNotNullParameter(subscriptionInfoMapper, "subscriptionInfoMapper");
        Intrinsics.checkNotNullParameter(purchaseTypeMapper, "purchaseTypeMapper");
        this.f45218a = productTypeMapper;
        this.f45219b = productInfoMapper;
        this.f45220c = subscriptionInfoMapper;
        this.f45221d = purchaseTypeMapper;
    }

    @NotNull
    public final qb a(@NotNull rb dto) {
        OrderId orderId;
        ProductId productId;
        PurchaseId purchaseId;
        InvoiceId invoiceId;
        ze aVar;
        ArrayList arrayList;
        gl aVar2;
        jl jlVar;
        jl jlVar2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        fc fcVar = this.f45218a;
        String str = dto.f44905h;
        fcVar.getClass();
        ProductType a4 = fc.a(str);
        String str2 = dto.f44900c;
        OrderId orderId2 = str2 != null ? new OrderId(str2) : null;
        ProductId productId2 = new ProductId(dto.f44909l.f44726a);
        PurchaseId purchaseId2 = new PurchaseId(dto.f44898a);
        InvoiceId invoiceId2 = new InvoiceId(dto.f44899b);
        PurchaseType a5 = this.f45221d.a(dto.f44906i);
        if (a4 == ProductType.SUBSCRIPTION) {
            xf xfVar = this.f45220c;
            xfVar.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            Url url = new Url(dto.f44909l.f44728c);
            Title title = new Title(dto.f44909l.f44727b);
            Price price = new Price(dto.f44902e);
            Price price2 = new Price(dto.f44902e);
            AmountLabel amountLabel = new AmountLabel(dto.f44901d);
            SubscriptionPurchaseStatus a6 = xfVar.f45226a.a(dto.f44903f);
            Quantity quantity = new Quantity(dto.f44908k);
            List<kl> list = dto.f44909l.f44729d;
            if (list != null) {
                orderId = orderId2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kl dto2 = (kl) it.next();
                    Iterator it2 = it;
                    xfVar.f45227b.getClass();
                    Intrinsics.checkNotNullParameter(dto2, "dto");
                    String str3 = dto2.f44491b;
                    ProductId productId3 = productId2;
                    int i4 = dto2.f44492c;
                    PurchaseId purchaseId3 = purchaseId2;
                    int hashCode = str3.hashCode();
                    InvoiceId invoiceId3 = invoiceId2;
                    if (hashCode == 67452) {
                        if (str3.equals("DAY")) {
                            aVar2 = new gl.a(i4);
                        }
                        aVar2 = null;
                    } else if (hashCode != 2719805) {
                        if (hashCode == 73542240 && str3.equals("MONTH")) {
                            aVar2 = new gl.b(i4);
                        }
                        aVar2 = null;
                    } else {
                        if (str3.equals("YEAR")) {
                            aVar2 = new gl.c(i4);
                        }
                        aVar2 = null;
                    }
                    if (aVar2 == null) {
                        jlVar = jl.d.f44397a;
                    } else {
                        Price price3 = new Price(dto2.f44490a);
                        String str4 = dto2.f44493d;
                        int hashCode2 = str4.hashCode();
                        if (hashCode2 == 76402927) {
                            if (str4.equals("PROMO")) {
                                jlVar2 = new jl.a(price3, aVar2);
                                jlVar = jlVar2;
                            }
                            jlVar = jl.d.f44397a;
                        } else if (hashCode2 != 79219778) {
                            if (hashCode2 == 2095255229 && str4.equals("STANDARD")) {
                                jlVar2 = new jl.b(price3, aVar2);
                                jlVar = jlVar2;
                            }
                            jlVar = jl.d.f44397a;
                        } else {
                            if (str4.equals("START")) {
                                jlVar2 = new jl.c(price3, aVar2);
                                jlVar = jlVar2;
                            }
                            jlVar = jl.d.f44397a;
                        }
                    }
                    arrayList2.add(jlVar);
                    it = it2;
                    productId2 = productId3;
                    purchaseId2 = purchaseId3;
                    invoiceId2 = invoiceId3;
                }
                productId = productId2;
                purchaseId = purchaseId2;
                invoiceId = invoiceId2;
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        if (!(((jl) obj) instanceof jl.d)) {
                            arrayList = arrayList2;
                            break;
                        }
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                    aVar = new ze.b(url, title, amountLabel, a6, quantity, price, price2, arrayList);
                }
            }
            IllegalArgumentException throwable = new IllegalArgumentException("Subscription tariffs is null or empty or unknown");
            y7 y7Var = xfVar.f45228c;
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            throw throwable;
        }
        orderId = orderId2;
        productId = productId2;
        purchaseId = purchaseId2;
        invoiceId = invoiceId2;
        df dfVar = this.f45219b;
        dfVar.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        cc ccVar = dfVar.f43963a;
        String str5 = dto.f44903f;
        ccVar.getClass();
        aVar = new ze.a(new Url(dto.f44909l.f44728c), new Title(dto.f44909l.f44727b), new AmountLabel(dto.f44901d), cc.a(str5), new Quantity(dto.f44908k), new Price(dto.f44902e), new Price(dto.f44902e));
        return new qb(orderId, productId, purchaseId, invoiceId, a5, a4, aVar, dto.f44910m.f44220a);
    }
}
