package com.aiming.mdt.a;

import android.text.TextUtils;
import java.net.CookieManager;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʽʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0157 {

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private static char[] f517 = null;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private static long f518 = 353912445496368266L;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private static int f519 = 0;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private static int f520 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private URI f521;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private C0090 f522;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private C0184 f525;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private int f526;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private String f528;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private String f529;

    /* renamed from: ʽ, reason: contains not printable characters */
    private InterfaceC0101 f530;

    /* renamed from: ʾ, reason: contains not printable characters */
    private HashMap<String, String> f531;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f527 = 0;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private CookieManager f523 = new CookieManager();

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private Map<String, List<String>> f524 = new HashMap();

    static {
        char[] cArr = new char[544];
        ByteBuffer.wrap("\u0000G\u009cþ9FÕûrY\u000eÇ«YGµä5\u0080®\u001dD¹\u00adV\nóg\u008fí,bÈÅe\u0010\u0000n\u009cï9cÕ¾ro\u000eÆ«nG£ä!\u0080¯\u001d\u0001¹\u009dV\u001dóv\u008f¬,sÈÒeX\u0001Û\u009eL:òV\u000fÊ¢o;\u0083¬$NX\u0092ý\u001b\u0011é²z\u0000G\u009cþ9FÕûrY\u000eÇ«YGµä5\u0080®\u001dD¹\u009dV\u001dól\u008fè,,\u0000R\u009cï9eÕërM\u000eÁ«YG²ä\u0013\u0080µ\u001d\u0011¹\u0080V\fó\"\u008f²,6È\u0098\u0000C\u009cå9zÕðrM\u000eÑ«HG¯ä?\u0080´HèÔmqð\u009df:Æ\u0000U\u009cù9qÕìr\u0005\u000eó«[G£ä>\u0080®'\u0089»!\u001e¿ò3U\u0090)\u000e\u0012à\u008e{+øÇ~`\u0093\u001cN¹ÜU?ö¨\u0092b\u000f\u0091«\nD\u009cáú\u009dq>áÚUwÊ\u0013I\u008cÅ(2Åéa0\u0002\u009a¾\u0010[\u0083ôü\u00901\rô©[JÔæ\u000e\u0083µ?.Ø°t&\u0011\u0095\u008d\u0005.\u0089Ëægm\u0000á¼^Y\u0095õT\u0096»24¯ùK\u0005äÃ\u0080P=ÄÞ¥z*\u0017á³_,ÅÈIeµ\u0001u¢»^\u0013û\u009a\u0097\u001208\u00ad÷Imêë\u0086[#Ãß\u0007x³\u00144± -\u0017ÎÖjF\u00079 ²\\9ùÅ\u0095\u00036\u0090Ò\u0004Oä¿¸##\u0086 j&ÍË±\u0016\u0014\u0084øg[ð?:¢É\u0006RéÄL¢0)\u0093¹w\rÚ\u0092¾\u0011!\u009d\u0085jh±Ìh¯Â\u0013HöÛY¤=i ¬\u0004\u0003ç\u008cKV.í\u0092vuèÙ~¼Í ]\u0083Ñf¾Ê5\u00ad¹\u0011\u0006ôÍX\f;ã\u009fl\u0002¡æ]I\u009b-\b\u0090\u009csý×rºú\u001eE\u0081ÖeMÈù¬?\u000f¤ó\u0000V\u0098\u0000A\u009cî9pÕÝrG\u000eÝ«WG¯ä5\u0080ú\u001d1¹\u009cV\u0014ó8\u001a\u007f\u0086\u008a#.Ï·h\u001e\u0014Û¬?0®\u0000A\u009cî9pÕÝrG\u000eÝ«WG¯ä5\u0080ú\u001d/¹\u008bV\u0001ó8¤\u009a8j\u009dÃqDÖëªa\u000f°rÎîvKÿ§f\u0000ö|@ÙÎ50\u0096¤ò\"oÙË&$\u0097\u0081óý+\u0000R\u009cï9gÕîrG\u000eÜ«OG£ä\u0013\u0080µ\u001d\u0000¹\u008bVB\u0000R\u009cï9gÕîrG\u000eÜ«OG£ä\u0013\u0080µ\u001d\n¹\u009aV\u001dól\u008fø,,=â¡_\u0004×è^O÷3l\u0096ÿz\u0013Ù²½\u000f ²\u0084,k\u00adÎÁ²T\u0011\u009c\u0096<\n\u0081¯\tC\u0080ä)\u0098²=!ÑÍrr\u0016Û\u008bi/áÀbe\u0005\u0019\u008dº\u0016^ô\u0000R\u009cï9gÕîrG\u000eÜ«OG£äp\u0080\u0099\u001d\u000b¹\u008aV\u001dóG\u008fþ,dÈÏeX\u0001\u008e\u0000G\u009cþ9FÕûrY\u000eÇ«YGµä5\u0080®\u001dD¹\u009dV\u001dól\u008fè,6ÈÅeX\u0001Æ\u009eQ:º×hp\u0086ì?I\u0087¥:\u0002\u0098~\u0006Û\u00987t\u0094ôðom\u0085É\\&Ü\u0083\u00adÿ)\\÷¸\u0004\u0015\u0099q\u0007î\u0090J{\u0000U\u009cØ9]Õ¾rE\u000eÓ«HG¥ä8\u0080ú\u001d\u0002¹\u008fV\u0011ón\u0000G\u009cþ9FÕûrY\u000eÇ«YGµä$\u0080ú\u001d\t¹\u008fV\fóa\u008fä,UÈÏeD\u0001À\u009e[:¦×&sü\u0010\u0003¬\u0082I\bæk\u0082ü\u001f\"\u0000G\u009cþ9FÕûrY\u000eÇ«YGµä$\u0080ú\u001d\t¹\u008fV\fóa\u008fä,DÈÅeL\u0001Æ\u009e[:»×:sü\u0010\u0003¬\u0082I\bæk\u0082ü\u001f\"\u0000G\u009cþ9FÕûrY\u000eÇ«YGµä$\u0080ú\u001d\t¹\u008fV\fóa\u008fä,ZÈÏeI\u0001Õ\u009eJ:¡×=s²\u0010F¬\u0095I\bæv\u0082á\u001fj»\u0098".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 544);
        f517 = cArr;
    }

    public C0157(C0184 c0184, InterfaceC0101 interfaceC0101) {
        try {
            this.f525 = c0184;
            this.f530 = interfaceC0101;
            this.f531 = new HashMap<>();
            this.f521 = new URI(this.f525.m694());
            this.f528 = this.f525.m704();
            this.f526 = this.f525.m698();
            m594(18, (char) 0, 0).intern();
            C0044.m108();
        } catch (Throwable th) {
            C0076.m232().m236(th);
            m594(21, (char) 0, 18).intern();
            C0044.m109();
            m594(9, (char) 22086, 39).intern();
            if (this.f530 != null) {
                this.f530.mo103(this.f525, this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #2 {Exception -> 0x0052, blocks: (B:18:0x0037, B:20:0x004d), top: B:17:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m593(String str) {
        boolean z;
        URI m463;
        int i;
        int i2 = f519 + 85;
        f520 = i2 % 128;
        boolean z2 = true;
        if (!(i2 % 2 != 0)) {
            try {
                if ((!TextUtils.isEmpty(str) ? (char) 7 : 'b') == 7) {
                    z = true;
                    try {
                        m463 = C0119.m456().m463(C0119.m456().m462(str), this.f521, this.f525);
                        if (m463 == null) {
                            this.f521 = m463;
                        } else {
                            z2 = z;
                        }
                    } catch (Exception e) {
                        e = e;
                        z2 = z;
                        C0076.m232().m236(e);
                        m594(29, (char) 0, 485).intern();
                        C0044.m109();
                        i = f519 + 87;
                        f520 = i % 128;
                        if (i % 2 != 0) {
                        }
                        return z2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                C0076.m232().m236(e);
                m594(29, (char) 0, 485).intern();
                C0044.m109();
                i = f519 + 87;
                f520 = i % 128;
                if (i % 2 != 0) {
                }
                return z2;
            }
        } else {
            try {
                if ((!TextUtils.isEmpty(str) ? '3' : 'X') != '3') {
                    z2 = false;
                } else {
                    z = false;
                    m463 = C0119.m456().m463(C0119.m456().m462(str), this.f521, this.f525);
                    if (m463 == null) {
                    }
                }
            } catch (Exception e3) {
                e = e3;
                z2 = false;
                C0076.m232().m236(e);
                m594(29, (char) 0, 485).intern();
                C0044.m109();
                i = f519 + 87;
                f520 = i % 128;
                if (i % 2 != 0) {
                }
                return z2;
            }
        }
        i = f519 + 87;
        f520 = i % 128;
        if (i % 2 != 0) {
        }
        return z2;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m594(int i, char c2, int i2) {
        char[] cArr = new char[i];
        int i3 = 0;
        while (true) {
            if ((i3 < i ? 'J' : '>') != 'J') {
                String str = new String(cArr);
                int i4 = f519 + 73;
                f520 = i4 % 128;
                if (i4 % 2 == 0) {
                }
                return str;
            }
            int i5 = f519 + 125;
            f520 = i5 % 128;
            if ((i5 % 2 == 0 ? 'Q' : (char) 24) != 24) {
                cArr[i3] = (char) ((f517[i2 - i3] * (i3 | f518)) % c2);
                i3 += 105;
            } else {
                cArr[i3] = (char) ((f517[i2 + i3] ^ (i3 * f518)) ^ c2);
                i3++;
            }
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private boolean m595(String str) {
        int i = f520 + 61;
        f519 = i % 128;
        int i2 = i % 2;
        boolean z = false;
        try {
            if (!TextUtils.isEmpty(str)) {
                int i3 = f520 + 55;
                f519 = i3 % 128;
                int i4 = i3 % 2;
                String m460 = C0119.m456().m460(this.f521.getHost(), str);
                if ((!TextUtils.isEmpty(m460) ? (char) 6 : 'S') == 6) {
                    int i5 = f519 + 33;
                    f520 = i5 % 128;
                    int i6 = i5 % 2;
                    URI m463 = C0119.m456().m463(m460, this.f521, this.f525);
                    if ((m463 != null ? '\"' : '@') != '@') {
                        int i7 = f519 + 97;
                        f520 = i7 % 128;
                        int i8 = i7 % 2;
                        this.f529 = this.f521.toASCIIString();
                        this.f521 = m463;
                        z = true;
                    }
                }
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m594(29, (char) 0, 456).intern();
            C0044.m109();
        }
        int i9 = f519 + 25;
        f520 = i9 % 128;
        if (i9 % 2 == 0) {
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if ((r7 == null) != true) goto L25;
     */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m596(String str) {
        URI m463;
        boolean z = false;
        try {
            if ((!TextUtils.isEmpty(str) ? '8' : '5') != '5') {
                int i = f520 + 117;
                f519 = i % 128;
                if (i % 2 != 0) {
                    m463 = C0119.m456().m463(str, this.f521, this.f525);
                    if (m463 == null) {
                    }
                } else {
                    m463 = C0119.m456().m463(str, this.f521, this.f525);
                }
                this.f521 = m463;
                int i2 = f520 + 73;
                f519 = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m594(30, (char) 0, 514).intern();
            C0044.m109();
        }
        int i4 = f520 + 53;
        f519 = i4 % 128;
        if (i4 % 2 != 0) {
        }
        return z;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final C0090 m597() {
        int i = f520 + 55;
        f519 = i % 128;
        int i2 = i % 2;
        C0090 c0090 = this.f522;
        int i3 = f519 + 19;
        f520 = i3 % 128;
        if ((i3 % 2 == 0 ? ',' : '\t') != ',') {
        }
        return c0090;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x02e2 A[Catch: Throwable -> 0x02f9, TryCatch #0 {Throwable -> 0x02f9, blocks: (B:3:0x0005, B:9:0x0028, B:12:0x0046, B:16:0x0035, B:22:0x004e, B:26:0x006a, B:29:0x0074, B:32:0x0070, B:35:0x007c, B:37:0x0084, B:38:0x0089, B:42:0x00c5, B:43:0x00d4, B:48:0x00e6, B:49:0x00fe, B:50:0x011c, B:56:0x01c5, B:58:0x01ed, B:61:0x0201, B:62:0x0220, B:66:0x027a, B:67:0x027d, B:73:0x029b, B:75:0x02a3, B:78:0x02ab, B:82:0x02b6, B:86:0x02c7, B:89:0x02d5, B:91:0x02e2, B:94:0x02ce, B:97:0x02ea, B:102:0x0131, B:106:0x0140, B:108:0x016b, B:112:0x0177, B:115:0x0189, B:123:0x0102), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m598() {
        HashMap<String, String> hashMap;
        String intern;
        String intern2;
        try {
            m594(16, (char) 0, 48).intern();
            C0044.m108();
            if (this.f527 > 8) {
                int i = f519 + 35;
                f520 = i % 128;
                if (i % 2 == 0) {
                    m594(76, (char) 0, 59).intern();
                    if (this.f530 == null) {
                        return;
                    }
                } else {
                    m594(17, (char) 0, 64).intern();
                    if (this.f530 == null) {
                        return;
                    }
                }
                this.f530.mo103(this.f525, this);
                return;
            }
            this.f527++;
            if (C0119.m456().m464(this.f521)) {
                int i2 = f519 + 93;
                f520 = i2 % 128;
                if (i2 % 2 == 0) {
                    if (this.f530 == null) {
                        return;
                    }
                } else if (this.f530 == null) {
                    return;
                }
                this.f530.mo102(this.f525, this);
                return;
            }
            if (this.f531.size() > 0) {
                this.f531.clear();
            }
            this.f531.put(m594(10, (char) 0, 81).intern(), m594(5, (char) 18571, 91).intern());
            this.f531.put(m594(10, (char) 0, 96).intern(), this.f528);
            if (!TextUtils.isEmpty(this.f529)) {
                this.f531.put(m594(10, (char) 0, 96).intern(), this.f528);
            }
            if ((this.f526 == 1 ? '&' : '!') != '!') {
                hashMap = this.f531;
                intern = m594(6, (char) 10184, 106).intern();
                intern2 = m594(85, (char) 4756, 112).intern();
            } else {
                hashMap = this.f531;
                intern = m594(6, (char) 10184, 106).intern();
                intern2 = m594(63, (char) 49100, 197).intern();
            }
            hashMap.put(intern, intern2);
            Map<String, List<String>> map = this.f523.get(this.f521, this.f524);
            if (!(map == null)) {
                if ((!map.isEmpty() ? (char) 23 : ' ') != ' ') {
                    m594(14, (char) 0, 260).intern();
                    m594(6, (char) 6739, 274).intern();
                    map.size();
                    C0044.m108();
                    Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
                    int i3 = f520 + 87;
                    f519 = i3 % 128;
                    int i4 = i3 % 2;
                    while (true) {
                        if ((it.hasNext() ? (char) 19 : (char) 6) == 6) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        if (!next.getValue().isEmpty()) {
                            String key = next.getKey();
                            String join = TextUtils.join(m594(2, (char) 44036, 280).intern(), next.getValue());
                            m594(14, (char) 0, 282).intern();
                            m594(7, (char) 42166, 296).intern();
                            C0044.m108();
                            this.f531.put(key, join);
                        }
                    }
                }
            }
            this.f522 = new C0182().m360(new C0145().m558(this.f521).m562(this.f531).m564(false));
            Map<String, List<String>> m322 = this.f522.m322();
            if (m322 != null && m322.size() > 0) {
                int i5 = f519 + 91;
                f520 = i5 % 128;
                int i6 = i5 % 2;
                m594(15, (char) 29341, 303).intern();
                m594(6, (char) 6739, 274).intern();
                m322.size();
                C0044.m108();
                this.f523.put(this.f521, m322);
            }
            int m336 = this.f522.m336();
            m594(13, (char) 0, 318).intern();
            C0044.m108();
            C0119.m456();
            String m454 = C0119.m454(this.f522);
            m594(16, (char) 0, 331).intern();
            C0044.m108();
            String m338 = this.f522.m338();
            m594(16, (char) 15792, 347).intern();
            C0044.m108();
            String m328 = this.f522.m328();
            m594(17, (char) 38510, 363).intern();
            C0044.m108();
            if (m336 != 200 && m336 != 307) {
                switch (m336) {
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        m594(19, (char) 0, 380).intern();
                        if (this.f530 != null) {
                            int i7 = f519 + 57;
                            f520 = i7 % 128;
                            if (!(i7 % 2 == 0)) {
                                this.f530.mo103(this.f525, this);
                                break;
                            } else {
                                this.f530.mo103(this.f525, this);
                                break;
                            }
                        }
                        break;
                }
                return;
            }
            if (!(m595(m454)) && !m593(m338)) {
                int i8 = f519 + 83;
                f520 = i8 % 128;
                if (i8 % 2 == 0) {
                    if (m596(m328)) {
                    }
                    m594(14, (char) 0, 442).intern();
                    if (this.f530 == null) {
                        this.f530.mo103(this.f525, this);
                        return;
                    }
                    return;
                }
                if (m596(m328)) {
                }
                m594(14, (char) 0, 442).intern();
                if (this.f530 == null) {
                }
            }
            m598();
            int i9 = f519 + 67;
            f520 = i9 % 128;
            if (i9 % 2 == 0) {
            }
        } catch (Throwable th) {
            C0076.m232().m236(th);
            m594(22, (char) 0, 399).intern();
            C0044.m109();
            m594(21, (char) 28865, 421).intern();
            if (this.f530 != null) {
                this.f530.mo103(this.f525, this);
            }
        }
    }
}
