package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n52 implements InterfaceC2259tl {

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC2259tl.a<n52> f29447g = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Pa
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            n52 a4;
            a4 = n52.a(bundle);
            return a4;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final int f29448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29450d;

    /* renamed from: e, reason: collision with root package name */
    private final yb0[] f29451e;

    /* renamed from: f, reason: collision with root package name */
    private int f29452f;

    public n52(String str, yb0... yb0VarArr) {
        C2253tf.a(yb0VarArr.length > 0);
        this.f29449c = str;
        this.f29451e = yb0VarArr;
        this.f29448b = yb0VarArr.length;
        int c4 = i01.c(yb0VarArr[0].f34991m);
        this.f29450d = c4 == -1 ? i01.c(yb0VarArr[0].f34990l) : c4;
        a();
    }

    public final yb0 a(int i4) {
        return this.f29451e[i4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n52.class == obj.getClass()) {
            n52 n52Var = (n52) obj;
            if (this.f29449c.equals(n52Var.f29449c) && Arrays.equals(this.f29451e, n52Var.f29451e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29452f == 0) {
            this.f29452f = C1842c3.a(this.f29449c, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.f29451e);
        }
        return this.f29452f;
    }

    public final int a(yb0 yb0Var) {
        int i4 = 0;
        while (true) {
            yb0[] yb0VarArr = this.f29451e;
            if (i4 >= yb0VarArr.length) {
                return -1;
            }
            if (yb0Var == yb0VarArr[i4]) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n52 a(Bundle bundle) {
        sj0 a4;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            a4 = sj0.h();
        } else {
            a4 = C2282ul.a(yb0.f34972I, parcelableArrayList);
        }
        return new n52(bundle.getString(Integer.toString(1, 36), ""), (yb0[]) a4.toArray(new yb0[0]));
    }

    private void a() {
        String str = this.f29451e[0].f34982d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i4 = this.f29451e[0].f34984f | 16384;
        int i5 = 1;
        while (true) {
            yb0[] yb0VarArr = this.f29451e;
            if (i5 >= yb0VarArr.length) {
                return;
            }
            String str2 = yb0VarArr[i5].f34982d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                yb0[] yb0VarArr2 = this.f29451e;
                ms0.a("TrackGroup", "", new IllegalStateException("Different languages combined in one TrackGroup: '" + yb0VarArr2[0].f34982d + "' (track 0) and '" + yb0VarArr2[i5].f34982d + "' (track " + i5 + ")"));
                return;
            }
            yb0[] yb0VarArr3 = this.f29451e;
            if (i4 != (yb0VarArr3[i5].f34984f | 16384)) {
                ms0.a("TrackGroup", "", new IllegalStateException("Different role flags combined in one TrackGroup: '" + Integer.toBinaryString(yb0VarArr3[0].f34984f) + "' (track 0) and '" + Integer.toBinaryString(this.f29451e[i5].f34984f) + "' (track " + i5 + ")"));
                return;
            }
            i5++;
        }
    }
}
