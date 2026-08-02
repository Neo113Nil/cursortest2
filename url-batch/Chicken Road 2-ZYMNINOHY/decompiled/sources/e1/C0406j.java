package e1;

import T.G;
import V0.l;
import W.AbstractC0108a;
import W.AbstractC0111d;
import W.InterfaceC0113f;
import W.J;
import W.u;
import a.AbstractC0124a;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final u f8464a = new u();

    /* renamed from: b, reason: collision with root package name */
    public final C0398b f8465b = new C0398b();

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a1, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0112, code lost:
    
        if (")".equals(e1.C0398b.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // V0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, int i4, int i5, V0.k kVar, InterfaceC0113f interfaceC0113f) {
        C0400d c0400d;
        String str;
        ?? r12;
        String sb;
        int i6;
        char c4;
        C0406j c0406j = this;
        u uVar = c0406j.f8464a;
        uVar.K(i4 + i5, bArr);
        uVar.M(i4);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC0407k.d(uVar);
            while (!TextUtils.isEmpty(uVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i7 = -1;
                int i8 = 0;
                char c5 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c5 == 65535) {
                        i8 = uVar.f3352b;
                        String n = uVar.n(StandardCharsets.UTF_8);
                        c5 = n == null ? (char) 0 : "STYLE".equals(n) ? (char) 2 : n.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        uVar.M(i8);
                        if (c5 == 0) {
                            U.i.C(new B1.j(arrayList2), kVar, interfaceC0113f);
                            return;
                        }
                        if (c5 == 1) {
                            while (!TextUtils.isEmpty(uVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c5 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                uVar.n(StandardCharsets.UTF_8);
                                C0398b c0398b = c0406j.f8465b;
                                u uVar2 = c0398b.f8420a;
                                StringBuilder sb2 = c0398b.f8421b;
                                sb2.setLength(0);
                                int i9 = uVar.f3352b;
                                while (!TextUtils.isEmpty(uVar.n(StandardCharsets.UTF_8))) {
                                }
                                uVar2.K(uVar.f3352b, uVar.f3351a);
                                uVar2.M(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    C0398b.c(uVar2);
                                    if (uVar2.a() >= 5 && "::cue".equals(uVar2.x(5, StandardCharsets.UTF_8))) {
                                        int i10 = uVar2.f3352b;
                                        String b4 = C0398b.b(uVar2, sb2);
                                        if (b4 != null) {
                                            if ("{".equals(b4)) {
                                                uVar2.M(i10);
                                                str = "";
                                            } else if ("(".equals(b4)) {
                                                int i11 = uVar2.f3352b;
                                                int i12 = uVar2.f3353c;
                                                boolean z4 = z ? 1 : 0;
                                                while (i11 < i12 && z4 == 0) {
                                                    int i13 = i11 + 1;
                                                    z4 = ((char) uVar2.f3351a[i11]) == ')' ? r9 : z ? 1 : 0;
                                                    i11 = i13;
                                                }
                                                str = uVar2.x((i11 - 1) - uVar2.f3352b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(C0398b.b(uVar2, sb2))) {
                                                C0399c c0399c = new C0399c();
                                                c0399c.f8422a = "";
                                                c0399c.f8423b = "";
                                                c0399c.f8424c = Collections.EMPTY_SET;
                                                c0399c.f8425d = "";
                                                c0399c.f8426e = str2;
                                                c0399c.f8428g = z;
                                                c0399c.f8430i = z;
                                                c0399c.f8431j = i7;
                                                c0399c.f8432k = i7;
                                                c0399c.f8433l = i7;
                                                c0399c.f8434m = i7;
                                                c0399c.n = i7;
                                                c0399c.f8435p = i7;
                                                c0399c.f8436q = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i7) {
                                                        ?? matcher = C0398b.f8418c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            c0399c.f8425d = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = J.f3263a;
                                                    String[] split = str.split("\\.", i7);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i7) {
                                                        c0399c.f8423b = str4.substring(z ? 1 : 0, indexOf2);
                                                        c0399c.f8422a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        c0399c.f8423b = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        AbstractC0124a.h(length <= split.length ? r9 : z ? 1 : 0);
                                                        c0399c.f8424c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z5 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z6 = r9;
                                                while (z5 == 0) {
                                                    int i14 = uVar2.f3352b;
                                                    str5 = C0398b.b(uVar2, sb2);
                                                    boolean z7 = (str5 == null || "}".equals(str5)) ? z6 : z;
                                                    if (z7 == 0) {
                                                        uVar2.M(i14);
                                                        C0398b.c(uVar2);
                                                        String a3 = C0398b.a(uVar2, sb2);
                                                        if (!a3.isEmpty() && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(C0398b.b(uVar2, sb2))) {
                                                            C0398b.c(uVar2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z8 = false;
                                                            while (true) {
                                                                if (z8) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i15 = uVar2.f3352b;
                                                                    String b5 = C0398b.b(uVar2, sb2);
                                                                    if (b5 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b5) || ";".equals(b5)) {
                                                                        uVar2.M(i15);
                                                                        z8 = true;
                                                                    } else {
                                                                        sb3.append(b5);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i16 = uVar2.f3352b;
                                                                String b6 = C0398b.b(uVar2, sb2);
                                                                if (!";".equals(b6)) {
                                                                    if ("}".equals(b6)) {
                                                                        uVar2.M(i16);
                                                                    }
                                                                }
                                                                if ("color".equals(a3)) {
                                                                    i6 = 1;
                                                                    c0399c.f8427f = AbstractC0111d.a(sb, true);
                                                                    c0399c.f8428g = true;
                                                                } else {
                                                                    i6 = 1;
                                                                    if ("background-color".equals(a3)) {
                                                                        c0399c.f8429h = AbstractC0111d.a(sb, true);
                                                                        c0399c.f8430i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a3)) {
                                                                            if ("over".equals(sb)) {
                                                                                c0399c.f8435p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                c0399c.f8435p = 2;
                                                                                r12 = 1;
                                                                                z6 = r12;
                                                                                z5 = z7;
                                                                                z = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a3)) {
                                                                            c0399c.f8436q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a3)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i6 = 1;
                                                                                c0399c.f8432k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a3)) {
                                                                            c0399c.f8426e = U.i.D(sb);
                                                                        } else if (!"font-weight".equals(a3)) {
                                                                            i6 = 1;
                                                                            if ("font-style".equals(a3)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    c0399c.f8434m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a3)) {
                                                                                ?? matcher2 = C0398b.f8419d.matcher(U.i.D(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c4 = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c4 = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c4 = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c4 = 65535;
                                                                                    switch (c4) {
                                                                                        case 0:
                                                                                            r12 = 1;
                                                                                            c0399c.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r12 = 1;
                                                                                            c0399c.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r12 = 1;
                                                                                            c0399c.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(r12);
                                                                                    group3.getClass();
                                                                                    c0399c.o = Float.parseFloat(group3);
                                                                                    z6 = r12;
                                                                                    z5 = z7;
                                                                                    z = false;
                                                                                } else {
                                                                                    AbstractC0108a.s("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i6 = 1;
                                                                            c0399c.f8433l = 1;
                                                                        }
                                                                        z6 = r12;
                                                                        z5 = z7;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r12 = i6;
                                                                z6 = r12;
                                                                z5 = z7;
                                                                z = false;
                                                            }
                                                            r12 = 1;
                                                            z6 = r12;
                                                            z5 = z7;
                                                            z = false;
                                                        }
                                                    }
                                                    r12 = z6;
                                                    z6 = r12;
                                                    z5 = z7;
                                                    z = false;
                                                }
                                                boolean z9 = z6;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(c0399c);
                                                }
                                                r9 = z9;
                                                z = false;
                                                i7 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c5 == 3) {
                                Pattern pattern = AbstractC0405i.f8460a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n4 = uVar.n(charset);
                                if (n4 == null) {
                                    c0400d = null;
                                } else {
                                    Pattern pattern2 = AbstractC0405i.f8460a;
                                    Matcher matcher3 = pattern2.matcher(n4);
                                    if (matcher3.matches()) {
                                        c0400d = AbstractC0405i.d(null, matcher3, uVar, arrayList);
                                    } else {
                                        c0400d = null;
                                        String n5 = uVar.n(charset);
                                        if (n5 != null) {
                                            Matcher matcher4 = pattern2.matcher(n5);
                                            if (matcher4.matches()) {
                                                c0400d = AbstractC0405i.d(n4.trim(), matcher4, uVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (c0400d != null) {
                                    arrayList2.add(c0400d);
                                }
                            }
                            c0406j = this;
                        }
                    }
                }
            }
        } catch (G e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // V0.l
    public final int c() {
        return 1;
    }
}
