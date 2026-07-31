package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3080x2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C2641g3 f40114a;

    public C3080x2() {
        this(new C2641g3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3132z2 fromModel(@NonNull C3054w2 c3054w2) {
        C3132z2 c3132z2 = new C3132z2();
        c3132z2.f40299a = new C3106y2[c3054w2.f39998a.size()];
        int i4 = 0;
        for (BillingInfo billingInfo : c3054w2.f39998a) {
            C3106y2[] c3106y2Arr = c3132z2.f40299a;
            this.f40114a.getClass();
            c3106y2Arr[i4] = C2641g3.a(billingInfo);
            i4++;
        }
        c3132z2.f40300b = c3054w2.f39999b;
        return c3132z2;
    }

    public C3080x2(C2641g3 c2641g3) {
        this.f40114a = c2641g3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3054w2 toModel(@NonNull C3132z2 c3132z2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c3132z2.f40299a.length);
        for (C3106y2 c3106y2 : c3132z2.f40299a) {
            this.f40114a.getClass();
            int i4 = c3106y2.f40246a;
            if (i4 == 2) {
                productType = ProductType.INAPP;
            } else if (i4 != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c3106y2.f40247b, c3106y2.f40248c, c3106y2.f40249d, c3106y2.f40250e));
        }
        return new C3054w2(arrayList, c3132z2.f40300b);
    }
}
