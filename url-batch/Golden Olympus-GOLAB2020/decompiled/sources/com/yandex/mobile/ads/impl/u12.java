package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.uu;
import com.yandex.mobile.ads.impl.w12;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u12 extends jy1 {

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f32767r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    private final boolean f32768m;

    /* renamed from: n, reason: collision with root package name */
    private final v12 f32769n;

    /* renamed from: o, reason: collision with root package name */
    private LinkedHashMap f32770o;

    /* renamed from: p, reason: collision with root package name */
    private float f32771p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    private float f32772q = -3.4028235E38f;

    public u12(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f32768m = false;
            this.f32769n = null;
            return;
        }
        this.f32768m = true;
        String a4 = u82.a(list.get(0));
        C2253tf.a(a4.startsWith("Format:"));
        this.f32769n = (v12) C2253tf.a(v12.a(a4));
        a(new sf1(list.get(1)));
    }

    private static int a(long j4, ArrayList arrayList, ArrayList arrayList2) {
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

    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        sf1 sf1Var;
        v12 v12Var;
        float f4;
        int i5;
        Layout.Alignment alignment;
        int i6;
        int i7;
        int i8;
        int i9;
        u12 u12Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        sf1 sf1Var2 = new sf1(i4, bArr);
        if (!u12Var.f32768m) {
            u12Var.a(sf1Var2);
        }
        v12 v12Var2 = u12Var.f32768m ? u12Var.f32769n : null;
        while (true) {
            String j4 = sf1Var2.j();
            if (j4 != null) {
                if (j4.startsWith("Format:")) {
                    v12Var2 = v12.a(j4);
                } else {
                    if (j4.startsWith("Dialogue:")) {
                        if (v12Var2 == null) {
                            ms0.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(j4));
                        } else if (j4.startsWith("Dialogue:")) {
                            String[] split = j4.substring(9).split(StringUtils.COMMA, v12Var2.f33466e);
                            if (split.length != v12Var2.f33466e) {
                                ms0.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(j4));
                            } else {
                                long a4 = a(split[v12Var2.f33462a]);
                                if (a4 == -9223372036854775807L) {
                                    ms0.d("SsaDecoder", "Skipping invalid timing: ".concat(j4));
                                } else {
                                    long a5 = a(split[v12Var2.f33463b]);
                                    if (a5 == -9223372036854775807L) {
                                        ms0.d("SsaDecoder", "Skipping invalid timing: ".concat(j4));
                                    } else {
                                        LinkedHashMap linkedHashMap = u12Var.f32770o;
                                        w12 w12Var = (linkedHashMap == null || (i9 = v12Var2.f33464c) == -1) ? null : (w12) linkedHashMap.get(split[i9].trim());
                                        String str = split[v12Var2.f33465d];
                                        w12.b a6 = w12.b.a(str);
                                        String replace = w12.b.c(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f5 = u12Var.f32771p;
                                        float f6 = u12Var.f32772q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        uu.a a7 = new uu.a().a(spannableString);
                                        if (w12Var != null) {
                                            if (w12Var.f33876c != null) {
                                                sf1Var = sf1Var2;
                                                v12Var = v12Var2;
                                                f4 = f5;
                                                spannableString.setSpan(new ForegroundColorSpan(w12Var.f33876c.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                sf1Var = sf1Var2;
                                                v12Var = v12Var2;
                                                f4 = f5;
                                            }
                                            if (w12Var.f33883j == 3 && w12Var.f33877d != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(w12Var.f33877d.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f7 = w12Var.f33878e;
                                            if (f7 != -3.4028235E38f && f6 != -3.4028235E38f) {
                                                a7.b(1, f7 / f6);
                                            }
                                            boolean z5 = w12Var.f33879f;
                                            if (z5 && w12Var.f33880g) {
                                                i7 = 0;
                                                i8 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i7 = 0;
                                                i8 = 33;
                                                if (z5) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (w12Var.f33880g) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (w12Var.f33881h) {
                                                spannableString.setSpan(new UnderlineSpan(), i7, spannableString.length(), i8);
                                            }
                                            if (w12Var.f33882i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i7, spannableString.length(), i8);
                                            }
                                        } else {
                                            sf1Var = sf1Var2;
                                            v12Var = v12Var2;
                                            f4 = f5;
                                        }
                                        int i10 = a6.f33899a;
                                        if (i10 != -1) {
                                            i5 = i10;
                                        } else {
                                            i5 = w12Var != null ? w12Var.f33875b : -1;
                                        }
                                        switch (i5) {
                                            case 0:
                                            default:
                                                fr0.a("Unknown alignment: ", i5, "SsaDecoder");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        uu.a b4 = a7.b(alignment);
                                        int i11 = Integer.MIN_VALUE;
                                        switch (i5) {
                                            case 0:
                                            default:
                                                fr0.a("Unknown alignment: ", i5, "SsaDecoder");
                                            case -1:
                                                i6 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i6 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i6 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i6 = 2;
                                                break;
                                        }
                                        uu.a b5 = b4.b(i6);
                                        switch (i5) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                fr0.a("Unknown alignment: ", i5, "SsaDecoder");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i11 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i11 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i11 = 0;
                                                break;
                                        }
                                        b5.a(i11);
                                        PointF pointF = a6.f33900b;
                                        if (pointF != null && f6 != -3.4028235E38f && f4 != -3.4028235E38f) {
                                            a7.b(pointF.x / f4);
                                            a7.a(0, a6.f33900b.y / f6);
                                        } else {
                                            int c4 = a7.c();
                                            a7.b(c4 != 0 ? c4 != 1 ? c4 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                            int b6 = a7.b();
                                            a7.a(0, b6 != 0 ? b6 != 1 ? b6 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                        }
                                        uu a8 = a7.a();
                                        int a9 = a(a5, arrayList2, arrayList);
                                        for (int a10 = a(a4, arrayList2, arrayList); a10 < a9; a10++) {
                                            ((List) arrayList.get(a10)).add(a8);
                                        }
                                        u12Var = this;
                                        sf1Var2 = sf1Var;
                                        v12Var2 = v12Var;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    sf1Var = sf1Var2;
                    v12Var = v12Var2;
                    u12Var = this;
                    sf1Var2 = sf1Var;
                    v12Var2 = v12Var;
                }
            } else {
                return new x12(arrayList, arrayList2);
            }
        }
    }

    private void a(sf1 sf1Var) {
        while (true) {
            String j4 = sf1Var.j();
            if (j4 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(j4)) {
                while (true) {
                    String j5 = sf1Var.j();
                    if (j5 != null && (sf1Var.a() == 0 || sf1Var.g() != 91)) {
                        String[] split = j5.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        if (split.length == 2) {
                            String b4 = C2207rf.b(split[0].trim());
                            b4.getClass();
                            if (b4.equals("playresx")) {
                                this.f32771p = Float.parseFloat(split[1].trim());
                            } else if (b4.equals("playresy")) {
                                try {
                                    this.f32772q = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(j4)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                w12.a aVar = null;
                while (true) {
                    String j6 = sf1Var.j();
                    if (j6 == null || (sf1Var.a() != 0 && sf1Var.g() == 91)) {
                        break;
                    }
                    if (j6.startsWith("Format:")) {
                        aVar = w12.a.a(j6);
                    } else if (j6.startsWith("Style:")) {
                        if (aVar == null) {
                            ms0.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(j6));
                        } else {
                            w12 a4 = w12.a(j6, aVar);
                            if (a4 != null) {
                                linkedHashMap.put(a4.f33874a, a4);
                            }
                        }
                    }
                }
                this.f32770o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(j4)) {
                ms0.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(j4)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f32767r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i4 = u82.f32873a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }
}
