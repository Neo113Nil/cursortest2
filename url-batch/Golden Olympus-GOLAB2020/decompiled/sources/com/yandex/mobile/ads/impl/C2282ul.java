package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.sj0;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.ul, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2282ul {
    private C2282ul() {
    }

    public static sj0 a(InterfaceC2259tl.a aVar, ArrayList arrayList) {
        int i4 = sj0.f31764d;
        sj0.a aVar2 = new sj0.a();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Bundle bundle = (Bundle) arrayList.get(i5);
            bundle.getClass();
            aVar2.b(aVar.fromBundle(bundle));
        }
        return aVar2.a();
    }
}
