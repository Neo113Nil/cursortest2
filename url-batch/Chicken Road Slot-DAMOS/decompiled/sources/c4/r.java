package c4;

import com.google.android.gms.internal.measurement.fh;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.gh;
import com.google.android.gms.internal.measurement.ih;
import com.google.android.gms.internal.measurement.yf;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1773a;

    /* renamed from: b, reason: collision with root package name */
    public int f1774b;

    /* renamed from: c, reason: collision with root package name */
    public int f1775c;

    /* renamed from: d, reason: collision with root package name */
    public int f1776d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1777e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1778f;
    public Object g;

    public r(com.google.android.gms.internal.measurement.g gVar, Object[] objArr, StringBuilder sb2) {
        this.f1773a = 2;
        this.f1774b = 0;
        this.f1775c = -1;
        g1.c(gVar, "context");
        this.f1777e = gVar;
        this.f1776d = 0;
        this.f1778f = objArr;
        this.g = sb2;
    }

    public static void h(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(ih.a(obj));
        sb2.append("]");
    }

    public void a() {
        this.f1774b = 1;
        this.f1778f = (u) this.f1777e;
        this.f1776d = 0;
    }

    public boolean b() {
        d4.a b10 = ((u) this.f1778f).f1789b.b();
        int a9 = b10.a(6);
        return !(a9 == 0 || ((ByteBuffer) b10.f3619r).get(a9 + b10.f3616d) == 0) || this.f1775c == 65039;
    }

    public void c() {
        if (this.f1775c == 0) {
            return;
        }
        HashMap hashMap = ((yf) this.g).f3021d;
        int[] iArr = (int[]) this.f1777e;
        yf yfVar = (yf) hashMap.get(Integer.valueOf(iArr[this.f1774b]));
        while (true) {
            int i3 = (yfVar.f3019b - yfVar.f3018a) + 1;
            int i10 = this.f1775c;
            if (i3 > i10) {
                return;
            }
            int i11 = this.f1774b + i3;
            this.f1774b = i11;
            this.g = yfVar;
            int i12 = i10 - i3;
            this.f1775c = i12;
            if (i12 > 0) {
                yfVar = (yf) yfVar.f3021d.get(Integer.valueOf(iArr[i11]));
            }
        }
    }

    public void d() {
        yf yfVar = ((yf) this.g).f3020c;
        if (yfVar != null) {
            this.g = yfVar;
        } else {
            this.g = (yf) this.f1778f;
            int i3 = this.f1775c;
            if (i3 > 0) {
                this.f1775c = i3 - 1;
            }
            if (this.f1776d > 0) {
                this.f1774b++;
            }
        }
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r9 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r9 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(Object obj, fh fhVar, gh ghVar) {
        String simpleName;
        gh ghVar2;
        boolean z10;
        StringBuilder sb2 = (StringBuilder) this.g;
        int i3 = fhVar.f2305e;
        String str = fhVar.f2307r;
        int b10 = a4.i.b(i3);
        if (b10 != 0) {
            if (b10 == 1) {
                z10 = obj instanceof Boolean;
            } else if (b10 == 2) {
                if (!(obj instanceof Character)) {
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        z10 = Character.isValidCodePoint(((Number) obj).intValue());
                    }
                    z10 = false;
                }
                z10 = true;
            } else if (b10 == 3) {
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        if (!(obj instanceof Byte)) {
                            if (!(obj instanceof Short)) {
                            }
                        }
                    }
                }
                z10 = true;
            } else {
                if (b10 != 4) {
                    throw null;
                }
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                    }
                }
                z10 = true;
            }
            if (!z10) {
                h(sb2, obj, str);
                return;
            }
        }
        int ordinal = fhVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            if (!ghVar.a()) {
                                int i10 = ghVar.f2346a;
                                int i11 = i10 & 128;
                                if (i11 == 0) {
                                    ghVar2 = gh.f2345e;
                                } else if (i11 != i10 || ghVar.f2347b != -1 || ghVar.f2348c != -1) {
                                    ghVar2 = new gh(i11, -1, -1);
                                }
                                if (ghVar2.equals(ghVar)) {
                                    Number number = (Number) obj;
                                    Locale locale = ih.f2412a;
                                    boolean c10 = ghVar.c();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        ih.b(sb2, longValue, c10);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        ih.b(sb2, longValue & 4294967295L, c10);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        ih.b(sb2, longValue & 255, c10);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        ih.b(sb2, longValue & 65535, c10);
                                        return;
                                    }
                                    if (!(number instanceof BigInteger)) {
                                        i0.l("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                        return;
                                    }
                                    String bigInteger = ((BigInteger) number).toString(16);
                                    if (c10) {
                                        bigInteger = bigInteger.toUpperCase(ih.f2412a);
                                    }
                                    sb2.append(bigInteger);
                                    return;
                                }
                            }
                            ghVar2 = ghVar;
                            if (ghVar2.equals(ghVar)) {
                            }
                        }
                    }
                } else if (ghVar.a()) {
                    if (obj instanceof Character) {
                        sb2.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb2.append((char) intValue);
                        return;
                    } else {
                        sb2.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (ghVar.a()) {
                sb2.append(obj);
                return;
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = ih.f2412a;
                int i12 = ghVar.f2346a;
                int i13 = i12 & 162;
                if (i13 != 0) {
                    i13 = ((i12 & 32) == 0 ? 0 : 1) | ((i12 & 128) != 0 ? 2 : 0) | ((i12 & 2) == 0 ? 0 : 4);
                }
                int length = sb2.length();
                Formatter formatter = new Formatter(sb2, ih.f2412a);
                try {
                    formattable.formatTo(formatter, i13, ghVar.f2347b, ghVar.f2348c);
                    return;
                } catch (RuntimeException e2) {
                    sb2.setLength(length);
                    try {
                        Appendable out = formatter.out();
                        try {
                            simpleName = e2.toString();
                        } catch (RuntimeException e9) {
                            simpleName = e9.getClass().getSimpleName();
                        }
                        out.append(ih.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (ghVar.a()) {
                sb2.append(ih.a(obj));
                return;
            }
        }
        if (!ghVar.a()) {
            int i14 = fhVar.f2304d;
            if (ghVar.c()) {
                i14 &= 65503;
            }
            StringBuilder sb3 = new StringBuilder("%");
            ghVar.d(sb3);
            sb3.append((char) i14);
            str = sb3.toString();
        }
        sb2.append(String.format(ih.f2412a, str, obj));
    }

    public void f(yf yfVar, StringBuilder sb2) {
        for (yf yfVar2 : yfVar.f3021d.values()) {
            sb2.append("  ");
            sb2.append(yfVar);
            sb2.append(" -> ");
            sb2.append(yfVar2);
            sb2.append(" [label=\"");
            int[] iArr = (int[]) this.f1777e;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, yfVar2.f3018a, Math.min(iArr.length, yfVar2.f3019b + 1))));
            sb2.append("\"]\n");
            f(yfVar2, sb2);
        }
    }

    public boolean g(int i3, int i10, int i11, int i12) {
        if (i3 < 0 || i11 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.f1777e;
        int length = iArr.length;
        int min = Math.min(length, i10);
        if (min - i3 != Math.min(length, i12) - i11) {
            return false;
        }
        for (int i13 = i3; i13 <= min; i13++) {
            if (iArr[i13] != iArr[(i11 + i13) - i3]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.f1773a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                f((yf) this.f1778f, sb2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public r(int[] iArr) {
        this.f1773a = 1;
        this.f1777e = iArr;
        yf yfVar = new yf(-1, -1);
        this.f1778f = yfVar;
        this.g = yfVar;
    }

    public r(u uVar) {
        this.f1773a = 0;
        this.f1774b = 1;
        this.f1777e = uVar;
        this.f1778f = uVar;
    }
}
