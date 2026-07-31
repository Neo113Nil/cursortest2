package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class s52 implements InterfaceC2259tl {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC2259tl.a<s52> f31588d = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Dd
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            s52 a4;
            a4 = s52.a(bundle);
            return a4;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final n52 f31589b;

    /* renamed from: c, reason: collision with root package name */
    public final sj0<Integer> f31590c;

    public s52(n52 n52Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= n52Var.f29448b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f31589b = n52Var;
        this.f31590c = sj0.a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s52 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        n52 fromBundle = n52.f29447g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new s52(fromBundle, pp0.a(intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s52.class == obj.getClass()) {
            s52 s52Var = (s52) obj;
            if (this.f31589b.equals(s52Var.f31589b) && this.f31590c.equals(s52Var.f31590c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31590c.hashCode() * 31) + this.f31589b.hashCode();
    }
}
