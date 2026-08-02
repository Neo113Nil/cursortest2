package Z0;

import E.AbstractC0005f;
import U.i;
import V0.k;
import V0.l;
import W.AbstractC0108a;
import W.InterfaceC0113f;
import W.J;
import W.u;
import a.AbstractC0124a;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f3802g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3803a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.b f3804b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f3806d;

    /* renamed from: e, reason: collision with root package name */
    public float f3807e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f3808f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final u f3805c = new u();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f3803a = false;
            this.f3804b = null;
            return;
        }
        this.f3803a = true;
        String p2 = J.p((byte[]) list.get(0));
        AbstractC0124a.h(p2.startsWith("Format:"));
        X0.b a3 = X0.b.a(p2);
        a3.getClass();
        this.f3804b = a3;
        e(new u((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int d(long j4, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j4) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j4) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, Long.valueOf(j4));
        arrayList2.add(i4, i4 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i4 - 1)));
        return i4;
    }

    public static long f(String str) {
        Matcher matcher = f3802g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = J.f3263a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // V0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f) {
        Charset charset;
        u uVar;
        X0.b bVar;
        long j4;
        int parseInt;
        long f4;
        float f5;
        float f6;
        int i6;
        float f7;
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i8;
        int i9;
        int i10;
        float f8;
        float f9;
        float f10;
        boolean z;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        int i17;
        a aVar = this;
        long j5 = kVar.f3208a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        u uVar2 = aVar.f3805c;
        uVar2.K(i4 + i5, bArr);
        uVar2.M(i4);
        Charset I4 = uVar2.I();
        if (I4 == null) {
            I4 = StandardCharsets.UTF_8;
        }
        boolean z4 = aVar.f3803a;
        if (!z4) {
            aVar.e(uVar2, I4);
        }
        X0.b bVar2 = z4 ? aVar.f3804b : null;
        while (true) {
            String n = uVar2.n(I4);
            if (n == null) {
                long j6 = j5;
                ArrayList arrayList3 = (j6 == -9223372036854775807L || !kVar.f3209b) ? null : new ArrayList();
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    List list = (List) arrayList.get(i18);
                    if (!list.isEmpty() || i18 == 0) {
                        if (i18 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i18)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i18 + 1)).longValue();
                        V0.a aVar2 = new V0.a(longValue, longValue2 - longValue, list);
                        if (j6 == -9223372036854775807L || longValue2 >= j6) {
                            interfaceC0113f.accept(aVar2);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar2);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj = arrayList3.get(i19);
                        i19++;
                        interfaceC0113f.accept((V0.a) obj);
                    }
                    return;
                }
                return;
            }
            if (n.startsWith("Format:")) {
                bVar2 = X0.b.a(n);
            } else {
                if (n.startsWith("Dialogue:")) {
                    if (bVar2 == null) {
                        AbstractC0108a.s("SsaParser", "Skipping dialogue line before complete format: ".concat(n));
                    } else {
                        int i20 = bVar2.f3569f;
                        AbstractC0124a.h(n.startsWith("Dialogue:"));
                        String substring = n.substring(9);
                        int i21 = bVar2.f3564a;
                        String[] split = substring.split(StringUtils.COMMA, i20);
                        if (split.length != i20) {
                            AbstractC0108a.s("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(n));
                        } else {
                            if (i21 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i21].trim());
                                } catch (RuntimeException unused) {
                                    AbstractC0108a.s("SsaParser", "Fail to parse layer: " + split[i21]);
                                }
                                f4 = f(split[bVar2.f3565b]);
                                charset = I4;
                                if (f4 != -9223372036854775807L) {
                                    AbstractC0108a.s("SsaParser", "Skipping invalid timing: ".concat(n));
                                    j4 = j5;
                                    bVar = bVar2;
                                    uVar = uVar2;
                                    aVar = this;
                                    I4 = charset;
                                    j5 = j4;
                                    bVar2 = bVar;
                                    uVar2 = uVar;
                                } else {
                                    j4 = j5;
                                    long f13 = f(split[bVar2.f3566c]);
                                    if (f13 == -9223372036854775807L || f13 <= f4) {
                                        bVar = bVar2;
                                        uVar = uVar2;
                                        AbstractC0108a.s("SsaParser", "Skipping invalid timing: ".concat(n));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f3806d;
                                        d dVar = (linkedHashMap == null || (i17 = bVar2.f3567d) == -1) ? null : (d) linkedHashMap.get(split[i17].trim());
                                        String str = split[bVar2.f3568e];
                                        Matcher matcher = c.f3820a.matcher(str);
                                        bVar = bVar2;
                                        PointF pointF = null;
                                        int i22 = -1;
                                        while (matcher.find()) {
                                            u uVar3 = uVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a3 = c.a(group);
                                                if (a3 != null) {
                                                    pointF = a3;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = c.f3823d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i16 = d.a(group2);
                                                } else {
                                                    i16 = -1;
                                                }
                                                if (i16 != -1) {
                                                    i22 = i16;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            uVar2 = uVar3;
                                        }
                                        uVar = uVar2;
                                        String replace = c.f3820a.matcher(str).replaceAll("").replace("\\N", IOUtils.LINE_SEPARATOR_UNIX).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX).replace("\\h", " ");
                                        float f14 = aVar.f3807e;
                                        float f15 = aVar.f3808f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            boolean z5 = dVar.f3830g;
                                            Integer num = dVar.f3827d;
                                            Integer num2 = dVar.f3826c;
                                            if (num2 != null) {
                                                z = z5;
                                                f5 = f14;
                                                f6 = f15;
                                                i11 = 33;
                                                i12 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z = z5;
                                                f5 = f14;
                                                f6 = f15;
                                                i11 = 33;
                                                i12 = 0;
                                            }
                                            if (dVar.f3833j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i12, spannableString.length(), i11);
                                            }
                                            float f16 = dVar.f3828e;
                                            if (f16 == -3.4028235E38f || f6 == -3.4028235E38f) {
                                                f11 = -3.4028235E38f;
                                                i13 = Integer.MIN_VALUE;
                                            } else {
                                                f11 = f16 / f6;
                                                i13 = 1;
                                            }
                                            boolean z6 = dVar.f3829f;
                                            if (z6 && z) {
                                                i14 = i13;
                                                f12 = f11;
                                                i15 = 33;
                                                i6 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i14 = i13;
                                                f12 = f11;
                                                i15 = 33;
                                                i6 = 0;
                                                if (z6) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.f3831h) {
                                                spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i15);
                                            }
                                            if (dVar.f3832i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i15);
                                            }
                                            i7 = i14;
                                            f7 = f12;
                                        } else {
                                            f5 = f14;
                                            f6 = f15;
                                            i6 = 0;
                                            f7 = -3.4028235E38f;
                                            i7 = Integer.MIN_VALUE;
                                        }
                                        if (i22 == -1) {
                                            i22 = dVar != null ? dVar.f3825b : -1;
                                        }
                                        switch (i22) {
                                            case 0:
                                            default:
                                                AbstractC0005f.u(i22, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i23 = Integer.MIN_VALUE;
                                        switch (i22) {
                                            case 0:
                                            default:
                                                AbstractC0005f.u(i22, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i8 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i8 = i6;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i8 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i8 = 2;
                                                break;
                                        }
                                        switch (i22) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                AbstractC0005f.u(i22, "Unknown alignment: ", "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i23 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i23 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i23 = i6;
                                                break;
                                        }
                                        if (pointF == null || f6 == -3.4028235E38f || f5 == -3.4028235E38f) {
                                            float f17 = 0.95f;
                                            if (i8 != 0) {
                                                i9 = 1;
                                                if (i8 != 1) {
                                                    i10 = 2;
                                                    f8 = i8 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i10 = 2;
                                                    f8 = 0.5f;
                                                }
                                            } else {
                                                i9 = 1;
                                                i10 = 2;
                                                f8 = 0.05f;
                                            }
                                            if (i23 == 0) {
                                                f17 = 0.05f;
                                            } else if (i23 == i9) {
                                                f17 = 0.5f;
                                            } else if (i23 != i10) {
                                                f17 = -3.4028235E38f;
                                            }
                                            f9 = f17;
                                            f10 = f8;
                                        } else {
                                            f10 = pointF.x / f5;
                                            f9 = pointF.y / f6;
                                        }
                                        V.b bVar3 = new V.b(spannableString, alignment2, null, null, f9, i6, i23, f10, i8, i7, f7, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, parseInt);
                                        int d4 = d(f13, arrayList2, arrayList);
                                        for (int d5 = d(f4, arrayList2, arrayList); d5 < d4; d5++) {
                                            ((List) arrayList.get(d5)).add(bVar3);
                                        }
                                    }
                                    aVar = this;
                                    I4 = charset;
                                    j5 = j4;
                                    bVar2 = bVar;
                                    uVar2 = uVar;
                                }
                            }
                            parseInt = 0;
                            f4 = f(split[bVar2.f3565b]);
                            charset = I4;
                            if (f4 != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = I4;
                j4 = j5;
                bVar = bVar2;
                uVar = uVar2;
                aVar = this;
                I4 = charset;
                j5 = j4;
                bVar2 = bVar;
                uVar2 = uVar;
            }
        }
    }

    @Override // V0.l
    public final int c() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(u uVar, Charset charset) {
        int i4;
        d dVar;
        while (true) {
            String n = uVar.n(charset);
            if (n == null) {
                return;
            }
            int i5 = 0;
            int i6 = 91;
            if ("[Script Info]".equalsIgnoreCase(n)) {
                while (true) {
                    String n4 = uVar.n(charset);
                    if (n4 == null) {
                        break;
                    }
                    if (uVar.a() != 0) {
                        if ((uVar.h(charset) != 0 ? O3.d.g(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = n4.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length == 2) {
                        String D3 = i.D(split[0].trim());
                        D3.getClass();
                        if (D3.equals("playresx")) {
                            this.f3807e = Float.parseFloat(split[1].trim());
                        } else if (D3.equals("playresy")) {
                            try {
                                this.f3808f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(n)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String n5 = uVar.n(charset);
                    if (n5 != null) {
                        if (uVar.a() != 0) {
                            if ((uVar.h(charset) != 0 ? O3.d.g(r0 >>> 8) : 1114112) == i6) {
                            }
                        }
                        int i7 = -1;
                        if (n5.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(n5.substring(7), StringUtils.COMMA);
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            for (int i18 = i5; i18 < split2.length; i18++) {
                                String D4 = i.D(split2[i18].trim());
                                D4.getClass();
                                switch (D4.hashCode()) {
                                    case -1178781136:
                                        if (D4.equals("italic")) {
                                            i4 = i5;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case -1026963764:
                                        if (D4.equals("underline")) {
                                            i4 = 1;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case -192095652:
                                        if (D4.equals("strikeout")) {
                                            i4 = 2;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case -70925746:
                                        if (D4.equals("primarycolour")) {
                                            i4 = 3;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case 3029637:
                                        if (D4.equals("bold")) {
                                            i4 = 4;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case 3373707:
                                        if (D4.equals("name")) {
                                            i4 = 5;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case 366554320:
                                        if (D4.equals("fontsize")) {
                                            i4 = 6;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case 767321349:
                                        if (D4.equals("borderstyle")) {
                                            i4 = 7;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case 1767875043:
                                        if (D4.equals("alignment")) {
                                            i4 = 8;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    case 1988365454:
                                        if (D4.equals("outlinecolour")) {
                                            i4 = 9;
                                            break;
                                        }
                                        i4 = -1;
                                        break;
                                    default:
                                        i4 = -1;
                                        break;
                                }
                                switch (i4) {
                                    case 0:
                                        i14 = i18;
                                        break;
                                    case 1:
                                        i15 = i18;
                                        break;
                                    case 2:
                                        i16 = i18;
                                        break;
                                    case 3:
                                        i10 = i18;
                                        break;
                                    case 4:
                                        i13 = i18;
                                        break;
                                    case 5:
                                        i8 = i18;
                                        break;
                                    case 6:
                                        i12 = i18;
                                        break;
                                    case 7:
                                        i17 = i18;
                                        break;
                                    case 8:
                                        i9 = i18;
                                        break;
                                    case 9:
                                        i11 = i18;
                                        break;
                                }
                            }
                            bVar = i8 != -1 ? new b(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, split2.length) : null;
                        } else {
                            if (n5.startsWith("Style:")) {
                                if (bVar == null) {
                                    AbstractC0108a.s("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(n5));
                                } else {
                                    AbstractC0124a.h(n5.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(n5.substring(6), StringUtils.COMMA);
                                    int length = split3.length;
                                    int i19 = bVar.f3819k;
                                    if (length != i19) {
                                        int length2 = split3.length;
                                        String str = J.f3263a;
                                        Locale locale = Locale.US;
                                        AbstractC0108a.s("SsaStyle", "Skipping malformed 'Style:' line (expected " + i19 + " values, found " + length2 + "): '" + n5 + "'");
                                    } else {
                                        try {
                                            String trim = split3[bVar.f3809a].trim();
                                            int i20 = bVar.f3810b;
                                            int a3 = i20 != -1 ? d.a(split3[i20].trim()) : -1;
                                            int i21 = bVar.f3811c;
                                            Integer c4 = i21 != -1 ? d.c(split3[i21].trim()) : null;
                                            int i22 = bVar.f3812d;
                                            Integer c5 = i22 != -1 ? d.c(split3[i22].trim()) : null;
                                            int i23 = bVar.f3813e;
                                            float f4 = -3.4028235E38f;
                                            if (i23 != -1) {
                                                String trim2 = split3[i23].trim();
                                                try {
                                                    f4 = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e4) {
                                                    AbstractC0108a.t("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e4);
                                                }
                                            }
                                            float f5 = f4;
                                            int i24 = bVar.f3814f;
                                            boolean z = i24 != -1 && d.b(split3[i24].trim());
                                            int i25 = bVar.f3815g;
                                            boolean z4 = i25 != -1 && d.b(split3[i25].trim());
                                            int i26 = bVar.f3816h;
                                            boolean z5 = i26 != -1 && d.b(split3[i26].trim());
                                            int i27 = bVar.f3817i;
                                            boolean z6 = i27 != -1 && d.b(split3[i27].trim());
                                            int i28 = bVar.f3818j;
                                            if (i28 != -1) {
                                                String trim3 = split3[i28].trim();
                                                try {
                                                    int parseInt = Integer.parseInt(trim3.trim());
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i7 = parseInt;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                AbstractC0108a.s("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                            }
                                            dVar = new d(trim, a3, c4, c5, f5, z, z4, z5, z6, i7);
                                        } catch (RuntimeException e5) {
                                            AbstractC0108a.t("SsaStyle", "Skipping malformed 'Style:' line: '" + n5 + "'", e5);
                                        }
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.f3824a, dVar);
                                        }
                                    }
                                    dVar = null;
                                    if (dVar != null) {
                                    }
                                }
                            }
                            i5 = 0;
                            i6 = 91;
                        }
                    }
                }
                this.f3806d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(n)) {
                AbstractC0108a.j("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(n)) {
                return;
            }
        }
    }
}
