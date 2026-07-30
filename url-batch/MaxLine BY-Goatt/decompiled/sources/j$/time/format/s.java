package j$.time.format;

import com.google.firebase.encoders.json.BuildConfig;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public class s implements e {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final j$.time.a0 a;
    public final String b;

    public s(j$.time.a0 a0Var, String str) {
        this.a = a0Var;
        this.b = str;
    }

    public static int b(v vVar, CharSequence charSequence, int i, int i2, j jVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            vVar.e(j$.time.y.G(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || vVar.a(charSequence.charAt(i2), 'Z')) {
            vVar.e(j$.time.y.G(upperCase, true));
            return i2;
        }
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int B = jVar.B(vVar2, charSequence, i2);
        try {
            if (B >= 0) {
                vVar.e(j$.time.y.J(upperCase, ZoneOffset.b0((int) vVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return B;
            }
            if (jVar == j.e) {
                return ~i;
            }
            vVar.e(j$.time.y.G(upperCase, true));
            return i2;
        } catch (j$.time.c unused) {
            return ~i;
        }
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '+' || charAt == '-') {
            return b(vVar, charSequence, i, i, j.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char charAt2 = charSequence.charAt(i + 1);
            if (vVar.a(charAt, 'U') && vVar.a(charAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !vVar.a(charSequence.charAt(i3), 'C')) ? b(vVar, charSequence, i, i3, j.f) : b(vVar, charSequence, i, i4, j.f);
            }
            if (vVar.a(charAt, 'G') && length >= (i2 = i + 3) && vVar.a(charAt2, 'M') && vVar.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !vVar.a(charSequence.charAt(i2), '0')) {
                    return b(vVar, charSequence, i, i2, j.f);
                }
                vVar.e(j$.time.y.G("GMT0", true));
                return i5;
            }
        }
        m a = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String c2 = a.c(charSequence, parsePosition);
        if (c2 != null) {
            vVar.e(j$.time.y.G(c2, true));
            return parsePosition.getIndex();
        }
        if (!vVar.a(charAt, 'Z')) {
            return ~i;
        }
        vVar.e(ZoneOffset.UTC);
        return i + 1;
    }

    public m a(v vVar) {
        Set<String> set = j$.time.zone.i.d;
        int size = set.size();
        Map.Entry entry = vVar.b ? c : d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    entry = vVar.b ? c : d;
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        Integer valueOf = Integer.valueOf(size);
                        m mVar = vVar.b ? new m(BuildConfig.FLAVOR, null, null) : new l(BuildConfig.FLAVOR, null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        entry = new AbstractMap.SimpleImmutableEntry(valueOf, mVar);
                        if (vVar.b) {
                            c = entry;
                        } else {
                            d = entry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (m) entry.getValue();
    }

    @Override // j$.time.format.e
    public boolean s(y yVar, StringBuilder sb) {
        j$.time.y yVar2 = (j$.time.y) yVar.b(this.a);
        if (yVar2 == null) {
            return false;
        }
        sb.append(yVar2.q());
        return true;
    }

    public final String toString() {
        return this.b;
    }
}
