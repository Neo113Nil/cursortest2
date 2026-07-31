package h2;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c2.b;
import c2.g;
import c2.h;
import c4.w0;
import h2.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.a0;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f16780t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    private final boolean f16781o;

    /* renamed from: p, reason: collision with root package name */
    private final b f16782p;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, c> f16783q;

    /* renamed from: r, reason: collision with root package name */
    private float f16784r;

    /* renamed from: s, reason: collision with root package name */
    private float f16785s;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f16784r = -3.4028235E38f;
        this.f16785s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f16781o = false;
            this.f16782p = null;
            return;
        }
        this.f16781o = true;
        String D = m0.D(list.get(0));
        o2.a.a(D.startsWith("Format:"));
        this.f16782p = (b) o2.a.e(b.a(D));
        H(new a0(list.get(1)));
    }

    private static int C(long j7, List<Long> list, List<List<c2.b>> list2) {
        int i7;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (list.get(size).longValue() == j7) {
                return size;
            }
            if (list.get(size).longValue() < j7) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        list.add(i7, Long.valueOf(j7));
        list2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList(list2.get(i7 - 1)));
        return i7;
    }

    private static float D(int i7) {
        if (i7 == 0) {
            return 0.05f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static c2.b E(String str, c cVar, c.b bVar, float f7, float f8) {
        float D;
        StyleSpan styleSpan;
        SpannableString spannableString = new SpannableString(str);
        b.C0043b o7 = new b.C0043b().o(spannableString);
        if (cVar != null) {
            if (cVar.f16793c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f16793c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f16800j == 3 && cVar.f16794d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f16794d.intValue()), 0, spannableString.length(), 33);
            }
            float f9 = cVar.f16795e;
            if (f9 != -3.4028235E38f && f8 != -3.4028235E38f) {
                o7.q(f9 / f8, 1);
            }
            boolean z6 = cVar.f16796f;
            if (z6 && cVar.f16797g) {
                styleSpan = new StyleSpan(3);
            } else if (z6) {
                styleSpan = new StyleSpan(1);
            } else {
                if (cVar.f16797g) {
                    styleSpan = new StyleSpan(2);
                }
                if (cVar.f16798h) {
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
                }
                if (cVar.f16799i) {
                    spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                }
            }
            spannableString.setSpan(styleSpan, 0, spannableString.length(), 33);
            if (cVar.f16798h) {
            }
            if (cVar.f16799i) {
            }
        }
        int i7 = bVar.f16816a;
        if (i7 == -1) {
            i7 = cVar != null ? cVar.f16792b : -1;
        }
        o7.p(N(i7)).l(M(i7)).i(L(i7));
        PointF pointF = bVar.f16817b;
        if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
            o7.k(D(o7.d()));
            D = D(o7.c());
        } else {
            o7.k(pointF.x / f7);
            D = bVar.f16817b.y / f8;
        }
        o7.h(D, 0);
        return o7.a();
    }

    private void F(String str, b bVar, List<List<c2.b>> list, List<Long> list2) {
        int i7;
        StringBuilder sb;
        o2.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f16790e);
        if (split.length != bVar.f16790e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long K = K(split[bVar.f16786a]);
            if (K == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long K2 = K(split[bVar.f16787b]);
                if (K2 != -9223372036854775807L) {
                    Map<String, c> map = this.f16783q;
                    c cVar = (map == null || (i7 = bVar.f16788c) == -1) ? null : map.get(split[i7].trim());
                    String str2 = split[bVar.f16789d];
                    c2.b E = E(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f16784r, this.f16785s);
                    int C = C(K2, list2, list);
                    for (int C2 = C(K, list2, list); C2 < C; C2++) {
                        list.get(C2).add(E);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        r.i("SsaDecoder", sb.toString());
    }

    private void G(a0 a0Var, List<List<c2.b>> list, List<Long> list2) {
        b bVar = this.f16781o ? this.f16782p : null;
        while (true) {
            String o7 = a0Var.o();
            if (o7 == null) {
                return;
            }
            if (o7.startsWith("Format:")) {
                bVar = b.a(o7);
            } else if (o7.startsWith("Dialogue:")) {
                if (bVar == null) {
                    r.i("SsaDecoder", "Skipping dialogue line before complete format: " + o7);
                } else {
                    F(o7, bVar, list, list2);
                }
            }
        }
    }

    private void H(a0 a0Var) {
        while (true) {
            String o7 = a0Var.o();
            if (o7 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(o7)) {
                I(a0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(o7)) {
                this.f16783q = J(a0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(o7)) {
                r.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(o7)) {
                return;
            }
        }
    }

    private void I(a0 a0Var) {
        while (true) {
            String o7 = a0Var.o();
            if (o7 == null) {
                return;
            }
            if (a0Var.a() != 0 && a0Var.h() == 91) {
                return;
            }
            String[] split = o7.split(":");
            if (split.length == 2) {
                String e7 = l4.b.e(split[0].trim());
                e7.hashCode();
                if (e7.equals("playresx")) {
                    this.f16784r = Float.parseFloat(split[1].trim());
                } else if (e7.equals("playresy")) {
                    try {
                        this.f16785s = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> J(a0 a0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String o7 = a0Var.o();
            if (o7 == null || (a0Var.a() != 0 && a0Var.h() == 91)) {
                break;
            }
            if (o7.startsWith("Format:")) {
                aVar = c.a.a(o7);
            } else if (o7.startsWith("Style:")) {
                if (aVar == null) {
                    r.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + o7);
                } else {
                    c b7 = c.b(o7, aVar);
                    if (b7 != null) {
                        linkedHashMap.put(b7.f16791a, b7);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = f16780t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) m0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) m0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int L(int i7) {
        switch (i7) {
            case -1:
                break;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i7);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case w0.f2149o /* 7 */:
            case w0.f2150p /* 8 */:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int M(int i7) {
        switch (i7) {
            case -1:
                break;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i7);
                break;
            case 1:
            case 4:
            case w0.f2149o /* 7 */:
                break;
            case 2:
            case 5:
            case w0.f2150p /* 8 */:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment N(int i7) {
        switch (i7) {
            case -1:
                return null;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i7);
                return null;
            case 1:
            case 4:
            case w0.f2149o /* 7 */:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case w0.f2150p /* 8 */:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // c2.g
    protected h A(byte[] bArr, int i7, boolean z6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(bArr, i7);
        if (!this.f16781o) {
            H(a0Var);
        }
        G(a0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
