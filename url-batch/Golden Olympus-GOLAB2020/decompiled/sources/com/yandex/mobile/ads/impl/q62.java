package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.q62;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class q62 implements InterfaceC2259tl {

    /* renamed from: c, reason: collision with root package name */
    public static final q62 f30688c = new q62(sj0.h());

    /* renamed from: b, reason: collision with root package name */
    private final sj0<a> f30689b;

    public static final class a implements InterfaceC2259tl {

        /* renamed from: g, reason: collision with root package name */
        public static final InterfaceC2259tl.a<a> f30690g = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Ec
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                q62.a a4;
                a4 = q62.a.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public final int f30691b;

        /* renamed from: c, reason: collision with root package name */
        private final n52 f30692c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f30693d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f30694e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean[] f30695f;

        public a(n52 n52Var, boolean z4, int[] iArr, boolean[] zArr) {
            int i4 = n52Var.f29448b;
            this.f30691b = i4;
            boolean z5 = false;
            C2253tf.a(i4 == iArr.length && i4 == zArr.length);
            this.f30692c = n52Var;
            if (z4 && i4 > 1) {
                z5 = true;
            }
            this.f30693d = z5;
            this.f30694e = (int[]) iArr.clone();
            this.f30695f = (boolean[]) zArr.clone();
        }

        public final yb0 a(int i4) {
            return this.f30692c.a(i4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f30693d == aVar.f30693d && this.f30692c.equals(aVar.f30692c) && Arrays.equals(this.f30694e, aVar.f30694e) && Arrays.equals(this.f30695f, aVar.f30695f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f30695f) + ((Arrays.hashCode(this.f30694e) + (((this.f30692c.hashCode() * 31) + (this.f30693d ? 1 : 0)) * 31)) * 31);
        }

        public final int a() {
            return this.f30692c.f29450d;
        }

        public final boolean b() {
            for (boolean z4 : this.f30695f) {
                if (z4) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            InterfaceC2259tl.a<n52> aVar = n52.f29447g;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            bundle2.getClass();
            n52 fromBundle = aVar.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[fromBundle.f29448b];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[fromBundle.f29448b];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new a(fromBundle, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }

        public final boolean b(int i4) {
            return this.f30695f[i4];
        }
    }

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Dc
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                q62 a4;
                a4 = q62.a(bundle);
                return a4;
            }
        };
    }

    public q62(sj0 sj0Var) {
        this.f30689b = sj0.a((Collection) sj0Var);
    }

    public final sj0<a> a() {
        return this.f30689b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q62.class != obj.getClass()) {
            return false;
        }
        return this.f30689b.equals(((q62) obj).f30689b);
    }

    public final int hashCode() {
        return this.f30689b.hashCode();
    }

    public final boolean a(int i4) {
        for (int i5 = 0; i5 < this.f30689b.size(); i5++) {
            a aVar = this.f30689b.get(i5);
            if (aVar.b() && aVar.a() == i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q62 a(Bundle bundle) {
        sj0 a4;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            a4 = sj0.h();
        } else {
            a4 = C2282ul.a(a.f30690g, parcelableArrayList);
        }
        return new q62(a4);
    }
}
