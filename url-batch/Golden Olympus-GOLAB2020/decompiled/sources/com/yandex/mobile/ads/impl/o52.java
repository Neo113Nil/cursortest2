package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o52 implements InterfaceC2259tl {

    /* renamed from: e, reason: collision with root package name */
    public static final o52 f29910e = new o52(new n52[0]);

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC2259tl.a<o52> f29911f = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Kb
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            o52 a4;
            a4 = o52.a(bundle);
            return a4;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final int f29912b;

    /* renamed from: c, reason: collision with root package name */
    private final sj0<n52> f29913c;

    /* renamed from: d, reason: collision with root package name */
    private int f29914d;

    public o52(n52... n52VarArr) {
        this.f29913c = sj0.b(n52VarArr);
        this.f29912b = n52VarArr.length;
        a();
    }

    public final n52 a(int i4) {
        return this.f29913c.get(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o52.class == obj.getClass()) {
            o52 o52Var = (o52) obj;
            if (this.f29912b == o52Var.f29912b && this.f29913c.equals(o52Var.f29913c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29914d == 0) {
            this.f29914d = this.f29913c.hashCode();
        }
        return this.f29914d;
    }

    public final int a(n52 n52Var) {
        int indexOf = this.f29913c.indexOf(n52Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o52 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            return new o52(new n52[0]);
        }
        return new o52((n52[]) C2282ul.a(n52.f29447g, parcelableArrayList).toArray(new n52[0]));
    }

    private void a() {
        int i4 = 0;
        while (i4 < this.f29913c.size()) {
            int i5 = i4 + 1;
            for (int i6 = i5; i6 < this.f29913c.size(); i6++) {
                if (this.f29913c.get(i4).equals(this.f29913c.get(i6))) {
                    ms0.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i4 = i5;
        }
    }
}
