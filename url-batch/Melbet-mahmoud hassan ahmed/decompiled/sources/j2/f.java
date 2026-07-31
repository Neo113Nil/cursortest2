package j2;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
final class f {
    public static void a(Spannable spannable, int i7, int i8, g gVar, d dVar, Map<String, g> map, int i9) {
        d e7;
        Object bVar;
        g f7;
        Object absoluteSizeSpan;
        int i10;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i7, i8, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i7, i8, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i7, i8, 33);
        }
        if (gVar.q()) {
            g2.c.a(spannable, new ForegroundColorSpan(gVar.c()), i7, i8, 33);
        }
        if (gVar.p()) {
            g2.c.a(spannable, new BackgroundColorSpan(gVar.b()), i7, i8, 33);
        }
        if (gVar.d() != null) {
            g2.c.a(spannable, new TypefaceSpan(gVar.d()), i7, i8, 33);
        }
        if (gVar.o() != null) {
            b bVar2 = (b) o2.a.e(gVar.o());
            int i11 = bVar2.f18089a;
            if (i11 == -1) {
                i11 = (i9 == 2 || i9 == 1) ? 3 : 1;
                i10 = 1;
            } else {
                i10 = bVar2.f18090b;
            }
            int i12 = bVar2.f18091c;
            if (i12 == -2) {
                i12 = 1;
            }
            g2.c.a(spannable, new g2.d(i11, i10, i12), i7, i8, 33);
        }
        int j7 = gVar.j();
        if (j7 == 2) {
            d d7 = d(dVar, map);
            if (d7 != null && (e7 = e(d7, map)) != null) {
                if (e7.g() != 1 || e7.f(0).f18110b == null) {
                    r.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) m0.j(e7.f(0).f18110b);
                    g f8 = f(e7.f18114f, e7.l(), map);
                    int i13 = f8 != null ? f8.i() : -1;
                    if (i13 == -1 && (f7 = f(d7.f18114f, d7.l(), map)) != null) {
                        i13 = f7.i();
                    }
                    bVar = new g2.b(str, i13);
                    spannable.setSpan(bVar, i7, i8, 33);
                }
            }
        } else if (j7 == 3 || j7 == 4) {
            bVar = new a();
            spannable.setSpan(bVar, i7, i8, 33);
        }
        if (gVar.n()) {
            g2.c.a(spannable, new g2.a(), i7, i8, 33);
        }
        int f9 = gVar.f();
        if (f9 == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) gVar.e(), true);
        } else if (f9 == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e());
        } else if (f9 != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e() / 100.0f);
        }
        g2.c.a(spannable, absoluteSizeSpan, i7, i8, 33);
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static d d(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g f7 = f(dVar.f18114f, dVar.l(), map);
            if (f7 != null && f7.j() == 1) {
                return dVar;
            }
            dVar = dVar.f18118j;
        }
        return null;
    }

    private static d e(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g f7 = f(dVar2.f18114f, dVar2.l(), map);
            if (f7 != null && f7.j() == 3) {
                return dVar2;
            }
            for (int g7 = dVar2.g() - 1; g7 >= 0; g7--) {
                arrayDeque.push(dVar2.f(g7));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i7 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i7 < length) {
                    gVar2.a(map.get(strArr[i7]));
                    i7++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    gVar.a(map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return gVar;
    }
}
