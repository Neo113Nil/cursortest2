package H1;

import Z.C0323u;
import Z.D;
import a.AbstractC0345a;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.lifecycle.EnumC0475o;
import j2.InterfaceC0718h;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m2.InterfaceC0860b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p1.InterfaceC0992b;
import s1.C1193i;
import u1.InterfaceC1220d;
import z2.C1442z;
import z3.C1448f;
import z3.C1451i;

/* loaded from: classes.dex */
public class f implements F0.q, InterfaceC0992b, g2.u, InterfaceC0718h, InterfaceC0860b, InterfaceC1220d {

    /* renamed from: e, reason: collision with root package name */
    public static f f3262e;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3263d;

    public /* synthetic */ f(int i2, boolean z4) {
        this.f3263d = i2;
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i2) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f8958e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > i7 && bArr[i9] != 10) {
                i9 += i7;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i4 = i10 + i11;
                if (bArr[i4] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i4 - i10;
            int i13 = i2;
            boolean z5 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z5) {
                    i5 = 46;
                    z4 = false;
                } else {
                    byte b4 = bArr2[i13][i14];
                    byte[] bArr4 = n3.b.f8558a;
                    int i16 = b4 & 255;
                    z4 = z5;
                    i5 = i16;
                }
                byte b5 = bArr[i10 + i15];
                byte[] bArr5 = n3.b.f8558a;
                i6 = i5 - (b5 & 255);
                if (i6 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z5 = z4;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    z5 = true;
                    i14 = -1;
                }
            }
            if (i6 >= 0) {
                if (i6 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i10, i12, UTF_8);
                        }
                    }
                }
                i8 = i4 + 1;
                i7 = -1;
            }
            length = i9;
            i7 = -1;
        }
        return null;
    }

    public static final float g(float f4, float[] fArr, float[] fArr2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float max;
        float abs = Math.abs(f4);
        float signum = Math.signum(f4);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i2 = -(binarySearch + 1);
            int i4 = i2 - 1;
            if (i4 >= fArr.length - 1) {
                float f9 = fArr[fArr.length - 1];
                float f10 = fArr2[fArr.length - 1];
                if (f9 == 0.0f) {
                    return 0.0f;
                }
                return (f10 / f9) * f4;
            }
            if (i4 == -1) {
                float f11 = fArr[0];
                f7 = fArr2[0];
                f8 = f11;
                f6 = 0.0f;
                f5 = 0.0f;
            } else {
                float f12 = fArr[i4];
                float f13 = fArr[i2];
                f5 = fArr2[i4];
                f6 = f12;
                f7 = fArr2[i2];
                f8 = f13;
            }
            max = signum * (((f7 - f5) * Math.max(0.0f, Math.min(1.0f, f6 == f8 ? 0.0f : (abs - f6) / (f8 - f6)))) + f5);
        }
        return max;
    }

    public static ArrayList i(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((m3.t) obj) != m3.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((m3.t) it.next()).f8459d);
        }
        return arrayList2;
    }

    public static byte[] j(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        C1448f c1448f = new C1448f();
        Iterator it = i(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c1448f.y(str.length());
            c1448f.B(str);
        }
        return c1448f.i(c1448f.f11999e);
    }

    public static C1193i k(Context context, s1.v destination, Bundle bundle, EnumC0475o hostLifecycleState, s1.p pVar) {
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id, "id");
        return new C1193i(context, destination, bundle, hostLifecycleState, pVar, id, null);
    }

    public static Typeface l(String str, F0.k kVar, int i2) {
        if (F0.i.a(i2, 0) && Intrinsics.a(kVar, F0.k.f2614i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int z4 = j0.c.z(kVar, i2);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(z4) : Typeface.create(str, z4);
    }

    public static C1451i m(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i4 = i2 * 2;
            bArr[i2] = (byte) (A3.b.a(str.charAt(i4 + 1)) + (A3.b.a(str.charAt(i4)) << 4));
        }
        return new C1451i(bArr);
    }

    public static C1451i n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        C1451i c1451i = new C1451i(bytes);
        c1451i.f12003i = str;
        return c1451i;
    }

    public static boolean o() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static D q(Pair[] pairArr) {
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        long c4 = AbstractC0345a.c(0.0f, 0.0f);
        long c5 = AbstractC0345a.c(0.0f, Float.POSITIVE_INFINITY);
        ArrayList arrayList = new ArrayList(pairArr2.length);
        for (Pair pair : pairArr2) {
            arrayList.add(new C0323u(((C0323u) pair.f7486e).f4549a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr2.length);
        for (Pair pair2 : pairArr2) {
            arrayList2.add(Float.valueOf(((Number) pair2.f7485d).floatValue()));
        }
        return new D(arrayList, arrayList2, c4, c5, 0);
    }

    @Override // m2.InterfaceC0860b
    public o2.q a(o2.l lVar, o2.q qVar, boolean z4) {
        return null;
    }

    @Override // F0.q
    public Typeface b(F0.k kVar, int i2) {
        return l(null, kVar, i2);
    }

    @Override // F0.q
    public Typeface c(F0.m mVar, F0.k kVar, int i2) {
        String str = mVar.f2620e;
        int i4 = kVar.f2618d / 100;
        if (i4 >= 0 && i4 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i4 && i4 < 4) {
            str = str.concat("-light");
        } else if (i4 != 4) {
            if (i4 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i4 || i4 >= 8) && 8 <= i4 && i4 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface l4 = l(str, kVar, i2);
            if (!Intrinsics.a(l4, Typeface.create(Typeface.DEFAULT, j0.c.z(kVar, i2))) && !Intrinsics.a(l4, l(null, kVar, i2))) {
                typeface = l4;
            }
        }
        return typeface == null ? l(mVar.f2620e, kVar, i2) : typeface;
    }

    @Override // u1.InterfaceC1220d
    public void e(int i2, Serializable serializable) {
    }

    @Override // j2.InterfaceC0718h
    public boolean f(Object obj) {
        switch (this.f3263d) {
            case 12:
                ((g2.v) obj).getClass();
                break;
        }
        return true;
    }

    @Override // u1.InterfaceC1220d
    public void h() {
    }

    public boolean p(CharSequence charSequence) {
        return false;
    }

    public f(int i2) {
        this.f3263d = i2;
        switch (i2) {
            case 13:
                new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                new E0.b();
                E0.c cVar = new E0.c();
                cVar.f2271a = E0.a.f2262a;
                cVar.f2272b = E0.a.f2263b;
                cVar.f2273c = 0;
                break;
        }
    }
}
