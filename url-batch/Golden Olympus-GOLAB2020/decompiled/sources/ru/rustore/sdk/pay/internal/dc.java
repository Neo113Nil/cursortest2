package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.Currency;
import ru.rustore.sdk.pay.model.Description;
import ru.rustore.sdk.pay.model.GracePeriod;
import ru.rustore.sdk.pay.model.HoldPeriod;
import ru.rustore.sdk.pay.model.MainPeriod;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.Product;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PromoPeriod;
import ru.rustore.sdk.pay.model.SubscriptionInfo;
import ru.rustore.sdk.pay.model.SubscriptionPeriod;
import ru.rustore.sdk.pay.model.Title;
import ru.rustore.sdk.pay.model.TrialPeriod;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class dc extends kotlin.jvm.internal.s implements Function1<List<? extends ib>, List<? extends Product>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec f43962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(ec ecVar) {
        super(1);
        this.f43962a = ecVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterator it;
        pb pbVar;
        SubscriptionInfo subscriptionInfo;
        pb pbVar2;
        ArrayList arrayList;
        SubscriptionPeriod holdPeriod;
        List products = (List) obj;
        Intrinsics.checkNotNullParameter(products, "products");
        pb pbVar3 = this.f43962a.f44034b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(products, 10));
        Iterator it2 = products.iterator();
        while (it2.hasNext()) {
            ib dto = (ib) it2.next();
            pbVar3.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            ProductId productId = new ProductId(dto.f44321a);
            fc fcVar = pbVar3.f44780a;
            String str = dto.f44322b;
            fcVar.getClass();
            ProductType a4 = fc.a(str);
            AmountLabel amountLabel = new AmountLabel(dto.f44323c);
            Integer num = dto.f44324d;
            Price price = num != null ? new Price(num.intValue()) : null;
            Currency currency = new Currency(dto.f44325e);
            Url url = new Url(dto.f44326f);
            String str2 = dto.f44327g;
            Url url2 = str2 != null ? new Url(str2) : null;
            Title title = new Title(dto.f44328h);
            String str3 = dto.f44329i;
            Description description = str3 != null ? new Description(str3) : null;
            dl dto2 = dto.f44330j;
            if (dto2 != null) {
                pbVar3.f44781b.getClass();
                Intrinsics.checkNotNullParameter(dto2, "dto");
                ArrayList arrayList3 = dto2.f43978a;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    Iterator it3 = it2;
                    fl flVar = (fl) obj2;
                    String str4 = flVar.f44134a;
                    switch (str4.hashCode()) {
                        case 2223295:
                            pbVar2 = pbVar3;
                            arrayList = arrayList3;
                            if (!str4.equals("HOLD")) {
                                throw new IllegalArgumentException("Unknown period type: " + flVar.f44134a);
                            }
                            holdPeriod = new HoldPeriod(flVar.f44135b);
                            arrayList4.add(holdPeriod);
                            arrayList3 = arrayList;
                            it2 = it3;
                            pbVar3 = pbVar2;
                        case 68077464:
                            pbVar2 = pbVar3;
                            arrayList = arrayList3;
                            if (!str4.equals("GRACE")) {
                                throw new IllegalArgumentException("Unknown period type: " + flVar.f44134a);
                            }
                            holdPeriod = new GracePeriod(flVar.f44135b);
                            arrayList4.add(holdPeriod);
                            arrayList3 = arrayList;
                            it2 = it3;
                            pbVar3 = pbVar2;
                        case 76402927:
                            pbVar2 = pbVar3;
                            arrayList = arrayList3;
                            if (!str4.equals("PROMO")) {
                                throw new IllegalArgumentException("Unknown period type: " + flVar.f44134a);
                            }
                            String str5 = flVar.f44135b;
                            String str6 = flVar.f44136c;
                            if (str6 == null) {
                                throw new IllegalArgumentException("Currency is required for TRIAL period");
                            }
                            Integer num2 = flVar.f44137d;
                            if (num2 == null) {
                                throw new IllegalArgumentException("Price is required for TRIAL period");
                            }
                            holdPeriod = new TrialPeriod(str5, str6, num2.intValue());
                            arrayList4.add(holdPeriod);
                            arrayList3 = arrayList;
                            it2 = it3;
                            pbVar3 = pbVar2;
                        case 79219778:
                            pbVar2 = pbVar3;
                            arrayList = arrayList3;
                            if (!str4.equals("START")) {
                                throw new IllegalArgumentException("Unknown period type: " + flVar.f44134a);
                            }
                            String str7 = flVar.f44135b;
                            String str8 = flVar.f44136c;
                            if (str8 == null) {
                                throw new IllegalArgumentException("Currency is required for PROMO period");
                            }
                            Integer num3 = flVar.f44137d;
                            if (num3 == null) {
                                throw new IllegalArgumentException("Price is required for PROMO period");
                            }
                            holdPeriod = new PromoPeriod(str7, str8, num3.intValue());
                            arrayList4.add(holdPeriod);
                            arrayList3 = arrayList;
                            it2 = it3;
                            pbVar3 = pbVar2;
                        case 2095255229:
                            pbVar2 = pbVar3;
                            if (!str4.equals("STANDARD")) {
                                throw new IllegalArgumentException("Unknown period type: " + flVar.f44134a);
                            }
                            String str9 = flVar.f44135b;
                            arrayList = arrayList3;
                            String str10 = flVar.f44136c;
                            if (str10 == null) {
                                throw new IllegalArgumentException("Currency is required for MAIN period");
                            }
                            Integer num4 = flVar.f44137d;
                            if (num4 == null) {
                                throw new IllegalArgumentException("Price is required for MAIN period");
                            }
                            holdPeriod = new MainPeriod(str9, str10, num4.intValue());
                            arrayList4.add(holdPeriod);
                            arrayList3 = arrayList;
                            it2 = it3;
                            pbVar3 = pbVar2;
                        default:
                            throw new IllegalArgumentException("Unknown period type: " + flVar.f44134a);
                    }
                }
                it = it2;
                pbVar = pbVar3;
                subscriptionInfo = new SubscriptionInfo(arrayList4);
            } else {
                it = it2;
                pbVar = pbVar3;
                subscriptionInfo = null;
            }
            arrayList2.add(new Product(productId, a4, amountLabel, price, currency, url, url2, title, description, subscriptionInfo));
            it2 = it;
            pbVar3 = pbVar;
        }
        return arrayList2;
    }
}
