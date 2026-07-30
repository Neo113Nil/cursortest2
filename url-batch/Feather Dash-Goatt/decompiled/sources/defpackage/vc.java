package defpackage;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ vc(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List list;
        int i = this.d;
        sq0 sq0Var = null;
        Object obj = this.g;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                wc wcVar = (wc) obj2;
                ld0 ld0Var = (ld0) obj;
                wcVar.A = wcVar.v.a(ld0Var.d.x(), ld0Var.getLayoutDirection(), ld0Var);
                return Unit.a;
            case 1:
                hl hlVar = ((rl) obj2).d;
                ab1 ab1Var = hlVar.c;
                za1 d = ab1Var.d();
                int i2 = 0;
                while (i2 < ab1Var.e) {
                    try {
                        if (d.l(i2)) {
                            Object n = d.n(i2);
                            if (n != obj) {
                                k21 k21Var = n instanceof k21 ? (k21) n : null;
                                if ((k21Var != null ? k21Var.a : null) == obj) {
                                }
                            }
                            sq0 sq0Var2 = new sq0(i2, null);
                            d.c();
                            sq0Var = sq0Var2;
                            if (sq0Var != null) {
                                int i3 = sq0Var.a;
                                Integer num = sq0Var.b;
                                d = ab1Var.d();
                                try {
                                    ArrayList T = uq1.T(d, i3, num);
                                    d.c();
                                    list = CollectionsKt.u(T, hlVar.E());
                                } finally {
                                }
                            } else {
                                list = nv.d;
                            }
                            return new vk(list);
                        }
                        int[] iArr = d.b;
                        int i4 = i2 + 1;
                        int b = (i4 < d.c ? iArr[(i4 * 5) + 4] : d.e) - cb1.b(iArr, i2);
                        for (int i5 = 0; i5 < b; i5++) {
                            Object h = d.h(i2, i5);
                            if (h != obj) {
                                k21 k21Var2 = h instanceof k21 ? (k21) h : null;
                                if ((k21Var2 != null ? k21Var2.a : null) != obj) {
                                }
                            }
                            sq0Var = new sq0(i2, Integer.valueOf(i5));
                            if (sq0Var != null) {
                            }
                            return new vk(list);
                        }
                        i2 = i4;
                    } finally {
                    }
                }
                if (sq0Var != null) {
                }
                return new vk(list);
            case 2:
                ((z11) obj2).d = mo.k((s10) obj, xw0.a);
                return Unit.a;
            case 3:
                ((z8) obj2).s(false);
                ((Function0) obj).invoke();
                return Unit.a;
            case 4:
                ov ovVar = ov.d;
                ovVar.getClass();
                return new zf0((t51) obj2, ovVar, (r51) obj);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ((Function1) obj2).invoke(((b2) obj).a.a);
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                j11 j11Var = (j11) obj;
                if (((ha) ((i8) obj2).e).get() == 0) {
                    j11Var.invoke();
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                wn0 wn0Var = (wn0) obj2;
                tl tlVar = (tl) obj;
                Object[] objArr = wn0Var.b;
                long[] jArr = wn0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    tlVar.A(objArr[(i6 << 3) + i8]);
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                String str = (String) obj;
                c21 c21Var = Regex.e;
                Matcher matcher = ((Regex) obj2).d.matcher(str);
                matcher.getClass();
                if (matcher.find(0)) {
                    return new kk0(matcher, str);
                }
                return null;
            default:
                qj0 qj0Var = (qj0) obj2;
                ao0 ao0Var = (ao0) obj;
                if (Build.VERSION.SDK_INT >= 33) {
                    qj0Var.k0("android.permission.POST_NOTIFICATIONS");
                } else {
                    ao0Var.setValue(Boolean.TRUE);
                }
                return Unit.a;
        }
    }
}
