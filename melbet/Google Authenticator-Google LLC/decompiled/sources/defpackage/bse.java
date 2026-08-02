package defpackage;

import android.content.res.Resources;
import android.widget.Button;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.Array;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bse {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public bse(Resources resources, boolean z) {
        resources.getClass();
        this.b = resources;
        this.a = z;
        this.c = new kop(new aux(this, 10));
        this.d = new kop(new aux(this, 11));
    }

    public static Button a(bsa bsaVar) {
        return (Button) bsaVar.J().findViewById(R.id.next_button);
    }

    public static ViewPager2 b(bsa bsaVar) {
        return (ViewPager2) bsaVar.J().findViewById(R.id.pager);
    }

    public static jpk d(jpr jprVar) {
        int ordinal = jprVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? jpk.a(40) : jpk.a(26) : jpk.a(9);
    }

    static final void g(jpo[][][] jpoVarArr, int i, jpo jpoVar) {
        jpo[] jpoVarArr2 = jpoVarArr[i + jpoVar.d][jpoVar.c];
        jpi jpiVar = jpoVar.a;
        char c = 0;
        if (jpiVar != null) {
            int ordinal = jpiVar.ordinal();
            if (ordinal == 1) {
                c = 2;
            } else if (ordinal == 2) {
                c = 1;
            } else if (ordinal == 4) {
                c = 3;
            } else if (ordinal != 6) {
                throw new IllegalStateException("Illegal mode ".concat(jpiVar.toString()));
            }
        }
        jpo jpoVar2 = jpoVarArr2[c];
        if (jpoVar2 != null) {
            if (jpoVar2.f <= jpoVar.f) {
                return;
            }
        }
        jpoVarArr2[c] = jpoVar;
    }

    static final boolean h(jpi jpiVar, char c) {
        jpi jpiVar2 = jpi.TERMINATOR;
        int ordinal = jpiVar.ordinal();
        if (ordinal == 1) {
            return c >= '0' && c <= '9';
        }
        if (ordinal == 2) {
            return jpm.a(c) != -1;
        }
        if (ordinal == 4) {
            return true;
        }
        if (ordinal != 6) {
            return false;
        }
        return jpm.e(String.valueOf(c));
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, koi] */
    public final dpo c(int i) {
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return null;
        }
        dqk dqkVar = (true == this.a ? 2 : 1) + (-1) != 0 ? (dqk) this.d.a() : (dqk) this.c.a();
        return new dpo(gyf.a, gzp.h(dja.m(dqkVar.a, dqkVar.b, dqkVar.c, dqkVar.d)));
    }

    public final jpq e(jpk jpkVar) {
        int i;
        String str = (String) this.d;
        int length = str.length();
        jpd jpdVar = (jpd) this.c;
        jpo[][][] jpoVarArr = (jpo[][][]) Array.newInstance((Class<?>) jpo.class, length + 1, jpdVar.a(), 4);
        f(jpkVar, jpoVarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < jpdVar.a(); i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    jpo jpoVar = jpoVarArr[i2][i3][i4];
                    if (jpoVar != null && i2 < length) {
                        f(jpkVar, jpoVarArr, i2, jpoVar);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < jpdVar.a(); i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                jpo jpoVar2 = jpoVarArr[length][i8][i9];
                if (jpoVar2 != null && (i = jpoVar2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new jpq(this, jpkVar, jpoVarArr[length][i5][i7]);
        }
        throw new joz(a.Z(str, "Internal error: failed to encode \"", "\""));
    }

    final void f(jpk jpkVar, jpo[][][] jpoVarArr, int i, jpo jpoVar) {
        Object obj;
        int i2;
        jpd jpdVar = (jpd) this.c;
        int i3 = jpdVar.b;
        int a = jpdVar.a();
        int i4 = 0;
        if (i3 >= 0 && jpdVar.c(((String) this.d).charAt(i), i3)) {
            a = i3 + 1;
            i4 = i3;
        }
        int i5 = a;
        while (true) {
            obj = this.d;
            if (i4 >= i5) {
                break;
            }
            if (jpdVar.c(((String) obj).charAt(i), i4)) {
                g(jpoVarArr, i, new jpo(this, jpi.BYTE, i, i4, 1, jpoVar, jpkVar));
            }
            i4++;
        }
        jpi jpiVar = jpi.KANJI;
        String str = (String) obj;
        if (h(jpiVar, str.charAt(i))) {
            g(jpoVarArr, i, new jpo(this, jpiVar, i, 0, 1, jpoVar, jpkVar));
        }
        int length = str.length();
        jpi jpiVar2 = jpi.ALPHANUMERIC;
        int i6 = 2;
        if (h(jpiVar2, str.charAt(i))) {
            int i7 = i + 1;
            g(jpoVarArr, i, new jpo(this, jpiVar2, i, 0, (i7 >= length || !h(jpiVar2, str.charAt(i7))) ? 1 : 2, jpoVar, jpkVar));
        }
        jpi jpiVar3 = jpi.NUMERIC;
        if (h(jpiVar3, str.charAt(i))) {
            int i8 = i + 1;
            if (i8 >= length || !h(jpiVar3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length && h(jpiVar3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            g(jpoVarArr, i, new jpo(this, jpiVar3, i, 0, i2, jpoVar, jpkVar));
        }
    }

    public bse(String str, bsa bsaVar, brn brnVar, brn brnVar2) {
        this.a = str.equals("first_appearance");
        this.b = bsaVar;
        this.c = brnVar;
        this.d = brnVar2;
    }

    public bse(String str, Charset charset, boolean z, jph jphVar) {
        this.d = str;
        this.a = z;
        this.c = new jpd(str, charset);
        this.b = jphVar;
    }
}
