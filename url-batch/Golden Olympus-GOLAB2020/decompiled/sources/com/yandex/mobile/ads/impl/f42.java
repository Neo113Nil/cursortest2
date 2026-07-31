package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.lx1;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class f42 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f25608b = Pattern.compile("\\s+");

    /* renamed from: c, reason: collision with root package name */
    private static final uj0<String> f25609c = uj0.a("auto", "none");

    /* renamed from: d, reason: collision with root package name */
    private static final uj0<String> f25610d = uj0.a("dot", "sesame", "circle");

    /* renamed from: e, reason: collision with root package name */
    private static final uj0<String> f25611e = uj0.a("filled", "open");

    /* renamed from: f, reason: collision with root package name */
    private static final uj0<String> f25612f = uj0.a("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f25613a;

    private f42(int i4, int i5, int i6) {
        this.f25613a = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f42 a(String str) {
        boolean z4;
        int i4;
        int hashCode;
        if (str == null) {
            return null;
        }
        String b4 = C2207rf.b(str.trim());
        if (b4.isEmpty()) {
            return null;
        }
        uj0 a4 = uj0.a(TextUtils.split(b4, f25608b));
        AbstractC1934g abstractC1934g = (AbstractC1934g) lx1.a((uj0) f25612f, a4).iterator();
        String str2 = (String) (abstractC1934g.hasNext() ? abstractC1934g.next() : "outside");
        int hashCode2 = str2.hashCode();
        int i5 = -1;
        if (hashCode2 == -1392885889) {
            if (str2.equals("before")) {
                z4 = 2;
            }
            z4 = -1;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str2.equals("after")) {
                z4 = false;
            }
            z4 = -1;
        } else {
            if (str2.equals("outside")) {
                z4 = true;
            }
            z4 = -1;
        }
        int i6 = z4 ? !z4 ? 1 : -2 : 2;
        lx1.d a5 = lx1.a((uj0) f25609c, a4);
        if (!a5.isEmpty()) {
            String str3 = (String) ((AbstractC1934g) a5.iterator()).next();
            int hashCode3 = str3.hashCode();
            if (hashCode3 == 3005871) {
                str3.equals("auto");
            } else if (hashCode3 == 3387192 && str3.equals("none")) {
                i5 = 0;
            }
            return new f42(i5, 0, i6);
        }
        lx1.d a6 = lx1.a((uj0) f25611e, a4);
        lx1.d a7 = lx1.a((uj0) f25610d, a4);
        if (a6.isEmpty() && a7.isEmpty()) {
            return new f42(-1, 0, i6);
        }
        AbstractC1934g abstractC1934g2 = (AbstractC1934g) a6.iterator();
        String str4 = (String) (abstractC1934g2.hasNext() ? abstractC1934g2.next() : "filled");
        int hashCode4 = str4.hashCode();
        if (hashCode4 == -1274499742) {
            str4.equals("filled");
        } else if (hashCode4 == 3417674 && str4.equals("open")) {
            i4 = 2;
            AbstractC1934g abstractC1934g3 = (AbstractC1934g) a7.iterator();
            String str5 = (String) (!abstractC1934g3.hasNext() ? abstractC1934g3.next() : "circle");
            hashCode = str5.hashCode();
            if (hashCode == -1360216880) {
                if (hashCode != -905816648) {
                    if (hashCode == 99657 && str5.equals("dot")) {
                        i5 = 0;
                    }
                } else if (str5.equals("sesame")) {
                    i5 = 1;
                }
            } else if (str5.equals("circle")) {
                i5 = 2;
            }
            return new f42(i5 != 0 ? i5 != 1 ? 1 : 3 : 2, i4, i6);
        }
        i4 = 1;
        AbstractC1934g abstractC1934g32 = (AbstractC1934g) a7.iterator();
        String str52 = (String) (!abstractC1934g32.hasNext() ? abstractC1934g32.next() : "circle");
        hashCode = str52.hashCode();
        if (hashCode == -1360216880) {
        }
        return new f42(i5 != 0 ? i5 != 1 ? 1 : 3 : 2, i4, i6);
    }
}
