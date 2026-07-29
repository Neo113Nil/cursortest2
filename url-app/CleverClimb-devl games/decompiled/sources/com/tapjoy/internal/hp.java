package com.tapjoy.internal;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
abstract class hp implements gm {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8310a;

    hp() {
    }

    static {
        String[] strArr = {"reward", ProductAction.ACTION_PURCHASE, "custom_action"};
        f8310a = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tapjoy.internal.gm
    public final void a(gn gnVar) {
        if (this instanceof gq) {
            gq gqVar = (gq) this;
            gnVar.a(gqVar.a(), gqVar.b());
        } else if (this instanceof gr) {
            gr grVar = (gr) this;
            gnVar.a(grVar.a(), grVar.b(), grVar.c(), grVar.d());
        }
    }

    public static boolean a(String str) {
        return Arrays.binarySearch(f8310a, str) >= 0;
    }

    @Nullable
    public static hp a(String str, bn bnVar) {
        if ("reward".equals(str)) {
            return (hp) bnVar.a(hz.f8345a);
        }
        if (ProductAction.ACTION_PURCHASE.equals(str)) {
            return (hp) bnVar.a(hx.f8338a);
        }
        return null;
    }
}
