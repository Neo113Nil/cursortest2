package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqb {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private final koe h;

    static {
        hfm.r("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        d = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        a = Pattern.compile("([^\\?]+)(\\?+)");
        e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
        c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
        f = Pattern.compile("([a-zA-Z0-9-_]+)");
        g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public eqb(koe koeVar) {
        this.h = koeVar;
    }

    static String a(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lgv c(Iterable iterable) {
        int i;
        String str;
        lfy lfyVar;
        int i2;
        int i3;
        int i4;
        long j;
        eru eruVar;
        int i5;
        int i6;
        Integer num;
        String b2;
        String group;
        jkj k = lfe.a.k();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eqa eqaVar = (eqa) it.next();
            jkj k2 = lfd.a.k();
            int i7 = eqaVar.e;
            if (i7 > 0) {
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar = (lfd) k2.b;
                lfdVar.b |= 128;
                lfdVar.l = i7;
            }
            int i8 = eqaVar.d;
            if (i8 > 0) {
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar2 = (lfd) k2.b;
                lfdVar2.b |= 64;
                lfdVar2.k = i8;
            }
            long j2 = eqaVar.c;
            if (j2 > 0) {
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar3 = (lfd) k2.b;
                lfdVar3.b |= 8;
                lfdVar3.h = (int) j2;
            }
            long j3 = eqaVar.b;
            if (j3 > 0) {
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar4 = (lfd) k2.b;
                lfdVar4.b |= 16;
                lfdVar4.i = (int) j3;
            }
            int i9 = eqaVar.j;
            if (!k2.b.M()) {
                k2.t();
            }
            lfd lfdVar5 = (lfd) k2.b;
            lfdVar5.b |= 32;
            lfdVar5.j = i9;
            if (eqaVar.p >= 0) {
                jkj k3 = lff.a.k();
                int i10 = eqaVar.p;
                if (!k3.b.M()) {
                    k3.t();
                }
                lff lffVar = (lff) k3.b;
                lffVar.b |= 1;
                lffVar.c = i10;
                lff lffVar2 = (lff) k3.q();
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar6 = (lfd) k2.b;
                lffVar2.getClass();
                lfdVar6.C = lffVar2;
                lfdVar6.b |= 4194304;
            }
            String str2 = eqaVar.k;
            String str3 = null;
            if (str2 != null) {
                if (!hoq.S(str2)) {
                    Matcher matcher = d.matcher(str2);
                    if (matcher.find()) {
                        group = matcher.group(0);
                        if (group != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            lfd lfdVar7 = (lfd) k2.b;
                            lfdVar7.b |= 1;
                            lfdVar7.e = group;
                        }
                    } else {
                        ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector", "extractContentType", 445, "NetworkMetricCollector.java")).u("contentType extraction failed for %s, skipping logging path", str2);
                    }
                }
                group = null;
                if (group != null) {
                }
            }
            String str4 = eqaVar.i;
            if (!hoq.S(str4)) {
                if (str4.equals("http/1.1")) {
                    i = 2;
                } else if (str4.equals("spdy/2")) {
                    i = 3;
                } else if (str4.equals("spdy/3")) {
                    i = 4;
                } else if (str4.equals("spdy/3.1")) {
                    i = 5;
                } else if (str4.startsWith("h2")) {
                    i = 6;
                } else if (str4.equals("quic/1+spdy/3")) {
                    i = 7;
                } else if (str4.startsWith("http/2+quic")) {
                    i = 11;
                } else if (str4.startsWith("h3")) {
                    i = 12;
                } else if (str4.equals("http/0.9")) {
                    i = 9;
                } else if (str4.equals("http/1.0")) {
                    i = 10;
                }
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar8 = (lfd) k2.b;
                lfdVar8.m = i - 1;
                lfdVar8.b |= 256;
                eii eiiVar = (eii) this.h;
                eiiVar.b();
                str = eqaVar.f;
                if (str != null) {
                    if (eqaVar.h) {
                        str3 = eqaVar.g;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        lfd lfdVar9 = (lfd) k2.b;
                        lfdVar9.b = 4 | lfdVar9.b;
                        lfdVar9.g = str;
                    } else {
                        String a2 = a(str);
                        int i11 = eqaVar.t;
                        eiiVar.b();
                        if (!hoq.S(str)) {
                            String a3 = a(str);
                            if (a3 != null) {
                                str = a3;
                            }
                            boolean z = a3 != null;
                            Matcher matcher2 = a.matcher(str);
                            if (matcher2.find()) {
                                str = matcher2.group(1);
                                z = true;
                            }
                            String b3 = b(str);
                            if (b3 != null && !b3.equals(str)) {
                                z = true;
                            }
                            if (b3 != null) {
                                Matcher matcher3 = g.matcher(b3);
                                if (matcher3.find()) {
                                    b3 = matcher3.replaceFirst("<ip>");
                                    z = true;
                                }
                            }
                            if (b3 == null || z) {
                                str3 = b3;
                            } else {
                                Matcher matcher4 = f.matcher(b3);
                                if (matcher4.find()) {
                                    str3 = matcher4.group(1);
                                }
                            }
                        }
                        if (str3 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            lfd lfdVar10 = (lfd) k2.b;
                            lfdVar10.b |= 2;
                            lfdVar10.f = str3;
                        }
                        str3 = a2;
                    }
                }
                if (str3 != null && (b2 = b(str3)) != null) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar11 = (lfd) k2.b;
                    lfdVar11.b |= 2097152;
                    lfdVar11.B = b2;
                }
                lfyVar = eqaVar.l;
                if (lfyVar != null) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar12 = (lfd) k2.b;
                    lfdVar12.n = lfyVar;
                    lfdVar12.b |= 512;
                }
                i2 = eqaVar.r;
                if (i2 != 0) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar13 = (lfd) k2.b;
                    lfdVar13.o = i2 - 1;
                    lfdVar13.b |= 1024;
                }
                jkj k4 = lfc.a.k();
                i3 = eqaVar.s;
                if (i3 != 0) {
                    if (!k4.b.M()) {
                        k4.t();
                    }
                    lfc lfcVar = (lfc) k4.b;
                    lfcVar.c = i3 - 2;
                    lfcVar.b |= 1;
                }
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar14 = (lfd) k2.b;
                lfc lfcVar2 = (lfc) k4.q();
                lfcVar2.getClass();
                lfdVar14.p = lfcVar2;
                lfdVar14.b |= 2048;
                i4 = eqaVar.t;
                if (i4 != 0) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar15 = (lfd) k2.b;
                    lfdVar15.q = i4 - 1;
                    lfdVar15.b |= 4096;
                }
                lew lewVar = eqaVar.m;
                j = eqaVar.a;
                if (j > 0) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar16 = (lfd) k2.b;
                    lfdVar16.b |= 16384;
                    lfdVar16.u = j;
                }
                int i12 = eqaVar.o;
                eruVar = eqaVar.q;
                if (eruVar != null) {
                    if (eruVar.d()) {
                        int i13 = eruVar.c;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        lfd lfdVar17 = (lfd) k2.b;
                        lfdVar17.c = 28;
                        lfdVar17.d = Long.valueOf(i13);
                    } else {
                        jkj k5 = lga.a.k();
                        int i14 = eruVar.c;
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        jkp jkpVar = k5.b;
                        lga lgaVar = (lga) jkpVar;
                        lgaVar.b = 1 | lgaVar.b;
                        lgaVar.c = i14;
                        int i15 = eruVar.d;
                        if (!jkpVar.M()) {
                            k5.t();
                        }
                        lga lgaVar2 = (lga) k5.b;
                        lgaVar2.b |= 2;
                        lgaVar2.d = i15;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        lfd lfdVar18 = (lfd) k2.b;
                        lga lgaVar3 = (lga) k5.q();
                        lgaVar3.getClass();
                        lfdVar18.d = lgaVar3;
                        lfdVar18.c = 29;
                    }
                }
                i5 = eqaVar.u;
                if (i5 != 0) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar19 = (lfd) k2.b;
                    lfdVar19.w = i5 - 1;
                    lfdVar19.b |= 65536;
                }
                i6 = eqaVar.v;
                if (i6 != 0) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar20 = (lfd) k2.b;
                    lfdVar20.v = i6 - 1;
                    lfdVar20.b |= 32768;
                }
                num = eqaVar.n;
                if (num != null) {
                    int intValue = num.intValue();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lfd lfdVar21 = (lfd) k2.b;
                    lfdVar21.b |= 131072;
                    lfdVar21.x = intValue;
                }
                if (!k2.b.M()) {
                    k2.t();
                }
                lfd lfdVar22 = (lfd) k2.b;
                lfdVar22.b |= 262144;
                lfdVar22.y = 0;
                if (k.b.M()) {
                    k.t();
                }
                lfe lfeVar = (lfe) k.b;
                lfd lfdVar23 = (lfd) k2.q();
                lfdVar23.getClass();
                lfeVar.b();
                lfeVar.b.add(lfdVar23);
            }
            i = 1;
            if (!k2.b.M()) {
            }
            lfd lfdVar82 = (lfd) k2.b;
            lfdVar82.m = i - 1;
            lfdVar82.b |= 256;
            eii eiiVar2 = (eii) this.h;
            eiiVar2.b();
            str = eqaVar.f;
            if (str != null) {
            }
            if (str3 != null) {
                if (!k2.b.M()) {
                }
                lfd lfdVar112 = (lfd) k2.b;
                lfdVar112.b |= 2097152;
                lfdVar112.B = b2;
            }
            lfyVar = eqaVar.l;
            if (lfyVar != null) {
            }
            i2 = eqaVar.r;
            if (i2 != 0) {
            }
            jkj k42 = lfc.a.k();
            i3 = eqaVar.s;
            if (i3 != 0) {
            }
            if (!k2.b.M()) {
            }
            lfd lfdVar142 = (lfd) k2.b;
            lfc lfcVar22 = (lfc) k42.q();
            lfcVar22.getClass();
            lfdVar142.p = lfcVar22;
            lfdVar142.b |= 2048;
            i4 = eqaVar.t;
            if (i4 != 0) {
            }
            lew lewVar2 = eqaVar.m;
            j = eqaVar.a;
            if (j > 0) {
            }
            int i122 = eqaVar.o;
            eruVar = eqaVar.q;
            if (eruVar != null) {
            }
            i5 = eqaVar.u;
            if (i5 != 0) {
            }
            i6 = eqaVar.v;
            if (i6 != 0) {
            }
            num = eqaVar.n;
            if (num != null) {
            }
            if (!k2.b.M()) {
            }
            lfd lfdVar222 = (lfd) k2.b;
            lfdVar222.b |= 262144;
            lfdVar222.y = 0;
            if (k.b.M()) {
            }
            lfe lfeVar2 = (lfe) k.b;
            lfd lfdVar232 = (lfd) k2.q();
            lfdVar232.getClass();
            lfeVar2.b();
            lfeVar2.b.add(lfdVar232);
        }
        jkj k6 = lgv.a.k();
        if (!k6.b.M()) {
            k6.t();
        }
        lgv lgvVar = (lgv) k6.b;
        lfe lfeVar3 = (lfe) k.q();
        lfeVar3.getClass();
        lgvVar.h = lfeVar3;
        lgvVar.b |= 32;
        return (lgv) k6.q();
    }
}
