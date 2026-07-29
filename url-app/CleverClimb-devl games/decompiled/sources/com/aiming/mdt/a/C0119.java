package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.a.C0189;
import com.cmplay.policy.gdpr.DimenUtils;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʼʽʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0119 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static volatile C0119 f355 = null;

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private static int f356 = 0;

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private static int f357 = 1;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private static char[] f358 = null;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private static long f359 = 440913160213130355L;

    /* renamed from: ʻ, reason: contains not printable characters */
    private Pattern f360;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private Set<String> f361;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private Pattern f362;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private Map<String, List<C0081>> f363;

    /* renamed from: ʼ, reason: contains not printable characters */
    private LinkedHashMap<Pattern, String> f364 = new LinkedHashMap<>();

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private LinkedList<C0048> f365;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private Map<String, C0059> f366;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Pattern f367;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Map<String, String[]> f368;

    static {
        char[] cArr = new char[622];
        ByteBuffer.wrap("\u0000(lLØ\u008fEp±é\u001e\u0017\u008a\u008d÷\u0004cÃÐW<\u001a¨\u0090\u0015I\u0081±î\u0017ZÆÇ\u00023Þ ?[\u009f7û\u0083i\u0088îäº\u0016\u0000zaÎ\u00810}\\.\u0000%lDØ¥\u0000\\l\u000e\u0000%lDØ¢\u0000\\l(\u0000%lFØ¤\u000e-\u0000%lFØ¢Æ§¯\u0087Ããwt\u0000<\u0000%l@Ø¥\u0000>\u0089Ôå±QRÍÉ¡Îci\u000f\r»\u0092\u0000\\lZòÄ\u009e *>á\b\u0000%lGØÖ\u0001qm\u0000&\u0015Jvþ\u0093us\u0019G\u00adÞ0|Ä¢\u0092¹\u0000[lzØëES±\u0091k¢\u0007Ñ³O.\u0083Ú\u0013u\u009dán\u009c\u008f\b0»©WÜë\u009e\u0087ú3n®ÇZEõ·a-\u001c¯\u0088\u0006;\u0082×öCoþíj_\u0000#l[Ø½E\u0007±ï\u001eb\u008a\u0099÷\fc»\u0000%lAØÕE}±ý\u001e\u001a\u008a\u0080÷\u0016\u0000^l\u001bØ\u0092E-±¼\u001eL\u008a\u008d÷\u0000c«ÐJ<[¨Ã\u0015\"\u0081òîxZû\u0000\\l\u0017ØÍE\u0005±¿\u001e\u0015\u008a\u0089÷\rc§Ð1<\"¨\u0082\u0015N\u0081¢î8ZÑÇl3Ð <\f´xÕåPQ¾¾&*â\u0097`\u0003\u0089p\u0003ÜÉI8µR!¶\u008e>úôgdÓä@\u0007¬¶\u0019I\u0085¢ñÚ^6Êá@Ð,Ü\u00980\u0005\u0089ñ<^éÊ\u0011·õ#M\u0090û|\u0088è'UÄÁu®\u009a\u001aK\u0087æ\u0000Hl\u0016Ø\u008aE)±©\u001eM\u008a\u0092÷LcöÐb<\n¨Ñ\u0015\u0001\u0081¥î8ZÒÇB3\u0083 Q\fýx¿å\u0000Q\u008c¾3*¡\u0097\\\u0003\u008epHÜçI'µ\u0014!\u0098\u008e\fú¿\u0000Hl\u0016Ø\u008aE)±©\u001eM\u008a\u0092÷LcöÐb<\n¨Ñ\u0015\u0001\u0081¥î8ZÒÇB3\u0083 f\fèx\u008eå\u000eQ\u008f¾&*è\u0097R\u0003Ýp\u0001ÜúIrµ\u0016!\u0081NW\"5\u0096 \u000b\u0003ÿ\u0093PjÄå¹g-Ç\u009eRr&æè[$Ï\u008f \u0018\u0014¥\u0089g}ûîDBÍ6¥«0\u001f°ðMd\u008eÙlMû>|\u0092Ã\u0007Vû)oöÀ7´\u0097)\u0013\u009dç\u000esâßWA\u0000Ul'Ø Et±ôú9\u0000:(·DØðMmöÐT¼;\b®\u0095\u0015a\u0083\u0000ml\u0012Ø\u0092E:±¤\u001e|\u008aÝ÷KcìÐn<\u0010¨\u0085\u0015D\u0081¶î?ZÎÇC3\u0099\u0000al\u0011Ø\u0089E,±¸\u001e\u0005\u008aÐ÷IcùÐe<\u0015\u0000al\u001fØ\u0083E+±¸\u001e\u0005Q\u001c=h\u0089ç\u0014Ià×O>/®CÐ÷H\u0000cl\u001aØ\u0082\u001cÖp\u0088Ä\u0014Y·\u00ad7\u0002Ó\u0096\fëÖ\u007fEÌô \u008d´\u001f\t\u009b\u009d ò³FMÛç/S¼â\u0010rd\u0001ù\u0085M\u0015¢¤68\u008bÖ\u001f\u0010lÖÀyU¹©ª=\u0006\u0092\u0092æ!\u0000Hl\u0016Ø\u008aE)±©\u001eM\u008a\u0092÷VcùÐm<\u001b¨´\u0015\n\u0081´î%ZÙÇU3ö D\fÅxÜå?Q\u0083¾'*©\u0097V\u0003çpOÜþIbµ\u0019!\u0099\u008e\tú¼g(Ó\u0099@I¬í\u0019`\u0085êñ\u008a^Q\u0000Hl\u0016Ø\u008aE)±©\u001eM\u008a\u0092÷VcùÐm<\u001b¨´\u0015\n\u0081´î%ZÙÇU3ö D\fÅxÜå+Q\u008d¾8*©\u0097R\u0003ÀphÜúImµ\u001f!\u008e\u008e\u0014úºg)Ó×@_¬¿\u0019w\u0085÷ñ\u008a^\u0004Ê¬7kbS\u000e\rº\u0091'2Ó²|Vè\u0089\u0095S\u0001Ç²\u007f^\bÊ\u008bw\u0016ã¢\u008c\u00188È¥AQÝÂnnæ\u001a\u008e\u0087\u001b3\u0097Ü=HóõIaÆ\u0012\u001a¾Á+i×\rC\u009a\u0000Hl\u0016Ø\u008aE)±©\u001eM\u008a\u0092÷VcùÐm<\u001b¨´\u0015\n\u0081´î%ZÙÇU3ö D\fÅxÜå\"Q¶¾\u0001*\u0081\u0097\u001b\u0003ËpSÜæIhµ\b!×\u0000Hl\u0016Ø\u008aE)±©\u001eM\u008a\u0092÷HcÕÐ\u007f<\n¨\u0098\u0015\u0017\u0081÷î#ZÎÇ\u00103í c\fåx\u0090|ö\u0010¨¤49\u0097Í\u0017bóö,\u008bè\u001fG¬Ó@¥Ô\ni´ý\n\u0092\u009b&g»ëOHÜúp{\u0004b\u0099´-.Â\u0099V\u0019ë÷\u007f*\u0000 l0Ø\u0087E4±¼\u001e^\u008aÛ÷BcöÐB<\u001a¨Ë\u0000.l\u0012Ø\u0096E2".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 622);
        f358 = cArr;
    }

    private C0119() {
        this.f364.put(Pattern.compile(m459((char) 0, 19, 0).intern()), m459((char) 23482, 3, 19).intern());
        this.f364.put(Pattern.compile(m459((char) 34994, 2, 22).intern()), m459((char) 5669, 3, 24).intern());
        this.f364.put(Pattern.compile(m459((char) 12321, 2, 27).intern()), m459((char) 0, 3, 29).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 2, 32).intern()), m459((char) 0, 3, 34).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 2, 37).intern()), m459((char) 0, 3, 39).intern());
        this.f364.put(Pattern.compile(m459((char) 3696, 1, 42).intern()), m459((char) 0, 3, 43).intern());
        this.f364.put(Pattern.compile(m459((char) 50823, 1, 46).intern()), m459((char) 44962, 3, 47).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 1, 50).intern()), m459((char) 0, 3, 51).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 1, 54).intern()), m459((char) 35313, 3, 55).intern());
        this.f364.put(Pattern.compile(m459((char) 52629, 2, 58).intern()), m459((char) 25420, 3, 60).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 2, 63).intern()), m459((char) 62177, 3, 65).intern());
        this.f364.put(Pattern.compile(m459((char) 57672, 1, 68).intern()), m459((char) 0, 3, 69).intern());
        this.f364.put(Pattern.compile(m459((char) 301, 2, 72).intern()), m459((char) 9776, 3, 74).intern());
        this.f364.put(Pattern.compile(m459((char) 30037, 5, 77).intern()), m459((char) 37535, 1, 82).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 5, 83).intern()), "");
        this.f364.put(Pattern.compile(m459((char) 27521, 11, 88).intern()), m459((char) 60347, 14, 99).intern());
        this.f364.put(Pattern.compile(m459((char) 0, 9, 113).intern()), m459((char) 0, 8, 122).intern());
        this.f367 = Pattern.compile(m459((char) 0, 16, 130).intern(), 2);
        this.f360 = Pattern.compile(m459((char) 0, 43, 146).intern(), 2);
        this.f362 = Pattern.compile(m459((char) 16523, 17, 189).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m452(List<C0189.C0190> list, C0189.C0190 c0190) {
        C0189.C0190 next;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ListIterator<C0189.C0190> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int i = f357 + 93;
            f356 = i % 128;
            if (i % 2 != 0) {
                next = listIterator.next();
                Object obj = null;
                super.hashCode();
                if (!(next == null)) {
                    if (next.f665 != null) {
                        int i2 = f356 + 61;
                        f357 = i2 % 128;
                        int i3 = i2 % 2;
                        if (next.f665.equals(c0190.f665)) {
                            int i4 = f356 + 67;
                            f357 = i4 % 128;
                            if (i4 % 2 == 0) {
                                listIterator.set(c0190);
                                atomicBoolean.set(false);
                            } else {
                                listIterator.set(c0190);
                                atomicBoolean.set(true);
                            }
                        }
                    }
                }
            } else {
                next = listIterator.next();
                if (next != null) {
                    if (next.f665 != null) {
                    }
                }
            }
        }
        if (!atomicBoolean.get()) {
            int i5 = f356 + 25;
            f357 = i5 % 128;
            if (i5 % 2 == 0) {
            }
            list.add(c0190);
        }
        int i6 = f357 + 9;
        f356 = i6 % 128;
        if (i6 % 2 != 0) {
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static boolean m453(String str, String str2) {
        int i = f356 + 103;
        f357 = i % 128;
        boolean matches = ((i % 2 == 0 ? '0' : (char) 29) != 29 ? Pattern.compile(str, 3) : Pattern.compile(str, 2)).matcher(str2).matches();
        int i2 = f357 + 115;
        f356 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return matches;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static String m454(C0090 c0090) {
        int i = f357 + 37;
        f356 = i % 128;
        int i2 = i % 2;
        String str = "";
        String m325 = c0090.m325();
        if (!(TextUtils.isEmpty(m325))) {
            int i3 = f357 + 67;
            f356 = i3 % 128;
            int i4 = i3 % 2;
            if (!m325.startsWith(m459((char) 20022, 39, 272).intern())) {
                str = new String(c0090.m332(), m459((char) 0, 5, 311).intern());
                int i5 = f357 + 35;
                f356 = i5 % 128;
                if (i5 % 2 != 0) {
                }
            }
        }
        return str;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    static /* synthetic */ void m455(C0119 c0119, C0109 c0109) {
        int i = f356 + 49;
        f357 = i % 128;
        int i2 = i % 2;
        if (c0109 == null) {
            m459((char) 0, 34, 206).intern();
            C0044.m104();
            throw new NullPointerException(m459((char) 0, 34, 206).intern());
        }
        c0119.f363 = c0109.m396();
        c0119.f368 = c0109.m398();
        c0119.f366 = c0109.m403();
        c0119.f365 = c0109.m394();
        c0119.f361 = c0109.m400();
        if ((c0119.f363 != null) && c0119.f368 != null) {
            int i3 = f356 + 9;
            f357 = i3 % 128;
            int i4 = i3 % 2;
            if (c0119.f366 != null) {
                if ((c0119.f365 != null) && c0119.f361 != null) {
                    return;
                }
            }
        }
        m459((char) 0, 32, DimenUtils.DENSITY_HIGH).intern();
        C0044.m104();
        throw new NullPointerException(m459((char) 0, 32, DimenUtils.DENSITY_HIGH).intern());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static C0119 m456() {
        if (f355 == null) {
            synchronized (C0119.class) {
                if (f355 == null) {
                    f355 = new C0119();
                }
            }
        }
        return f355;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Map<String, Integer> m457(String str) {
        String[] split = TextUtils.split(str, m459((char) 64021, 1, 316).intern());
        HashMap hashMap = new HashMap();
        int length = split.length;
        int i = f357 + 83;
        f356 = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (i3 < length) {
            String[] split2 = split[i3].split(m459((char) 0, 1, 317).intern());
            hashMap.put(split2[0], Integer.valueOf(split2[1]));
            i3++;
            int i4 = f357 + 39;
            f356 = i4 % 128;
            if (i4 % 2 != 0) {
            }
        }
        return hashMap;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static <T> T m458(Map<T, Integer> map) {
        Map.Entry<T, Integer> next;
        int i = f356 + 33;
        f357 = i % 128;
        if (i % 2 != 0 ? map != null : map != null) {
            if ((map.isEmpty() ? 'L' : 'a') != 'L') {
                if (map.size() == 1) {
                    Iterator<T> it = map.keySet().iterator();
                    if (it.hasNext()) {
                        return it.next();
                    }
                }
                Set<Map.Entry<T, Integer>> entrySet = map.entrySet();
                Iterator<Map.Entry<T, Integer>> it2 = entrySet.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (!(it2.hasNext())) {
                        break;
                    }
                    int i4 = f357 + 37;
                    f356 = i4 % 128;
                    int i5 = i4 % 2;
                    i3 += it2.next().getValue().intValue();
                }
                int nextInt = new SecureRandom().nextInt(i3);
                Iterator<Map.Entry<T, Integer>> it3 = entrySet.iterator();
                while (true) {
                    if ((it3.hasNext() ? (char) 25 : ')') != 25) {
                        return null;
                    }
                    int i6 = f357 + 25;
                    f356 = i6 % 128;
                    if (i6 % 2 != 0) {
                        next = it3.next();
                        i2 -= next.getValue().intValue();
                        if ((nextInt < i2 ? 'Z' : (char) 30) == 'Z') {
                            break;
                        }
                    } else {
                        next = it3.next();
                        i2 += next.getValue().intValue();
                        if (nextInt < i2) {
                            break;
                        }
                    }
                }
                return next.getKey();
            }
        }
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m459(char c2, int i, int i2) {
        int i3 = f356 + 91;
        f357 = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
        }
        char[] cArr = new char[i];
        while (true) {
            if ((i4 < i ? '(' : '/') != '(') {
                return new String(cArr);
            }
            int i5 = f356 + 71;
            f357 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[i4] = (char) ((f358[i2 - i4] * (i4 | f359)) + c2);
                i4 += 88;
            } else {
                cArr[i4] = (char) ((f358[i2 + i4] ^ (i4 * f359)) ^ c2);
                i4++;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v25 java.lang.String, still in use, count: 2, list:
          (r3v25 java.lang.String) from 0x0075: INVOKE (r3v25 java.lang.String) STATIC call: android.text.TextUtils.isEmpty(java.lang.CharSequence):boolean A[MD:(java.lang.CharSequence):boolean (c), WRAPPED]
          (r3v25 java.lang.String) from 0x0086: PHI (r3v19 java.lang.String) = (r3v18 java.lang.String), (r3v25 java.lang.String) binds: [B:50:0x0084, B:23:0x0079] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* renamed from: ʻ, reason: contains not printable characters */
    final java.lang.String m460(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiming.mdt.a.C0119.m460(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m461() {
        C0057.m177().m179(new RunnableC0034(this));
        int i = f357 + 105;
        f356 = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final String m462(String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = this.f360.matcher(str);
            if (matcher.find()) {
                int i = f356 + 3;
                f357 = i % 128;
                int i2 = i % 2;
                str2 = matcher.group(1);
                int i3 = f356 + 17;
                f357 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        int i5 = f357 + 73;
        f356 = i5 % 128;
        if (i5 % 2 != 0) {
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c2, code lost:
    
        if (r14.m253().equals(r10) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c4, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c7, code lost:
    
        if (r15 == true) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d1, code lost:
    
        if (android.text.TextUtils.isEmpty(r14.m251()) != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d3, code lost:
    
        r15 = com.aiming.mdt.a.C0119.f357 + 123;
        com.aiming.mdt.a.C0119.f356 = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e8, code lost:
    
        if (r14.m251().equals(r12.getRawPath()) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ee, code lost:
    
        m452(r9, new com.aiming.mdt.a.C0189.C0190(r14.m258(), com.aiming.mdt.a.AbstractC0135.m515(r16.f362, r14.m255(), r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c6, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b7, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020c, code lost:
    
        m459((char) 0, 42, 408).intern();
        r19.m701();
        com.aiming.mdt.a.C0044.m109();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r16.f367.matcher(r0).find() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e8, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.m185()) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r6 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0186, code lost:
    
        r15 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x016e, code lost:
    
        m459((char) 7326, 34, 374).intern();
        com.aiming.mdt.a.C0044.m104();
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r0 = com.aiming.mdt.a.C0187.m710(r0.toCharArray(), 0, r0.length());
        r6 = "";
        r9 = r16.f364.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00b1, code lost:
    
        r10 = r6.indexOf(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00b5, code lost:
    
        if (r10 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00b7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00b8, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00c1, code lost:
    
        r12 = new java.net.URI(r6.substring(0, r10).concat(com.aiming.mdt.a.C0189.m719(r6.substring(r10)).m720()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x035f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0042, code lost:
    
        r0 = java.net.URLDecoder.decode(r0, m459((char) 0, 5, 311).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x003b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0360, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r9.hasNext() == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0028, code lost:
    
        if (android.text.TextUtils.isEmpty(r17) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r6 = com.aiming.mdt.a.C0119.f356 + 65;
        com.aiming.mdt.a.C0119.f357 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if ((r6 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r6 = r9.next();
        r10 = r6.getKey().matcher(r0);
        r6 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r6 = r10.replaceAll(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        r6 = r9.next();
        r10 = r6.getKey().matcher(r0);
        r6 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r12 = new java.net.URI(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        if (r12.getScheme() != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        r6 = r18.resolve(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        r12 = r6;
        r6 = r6.toASCIIString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0361, code lost:
    
        m459((char) 31934, 27, 579).intern();
        m459((char) 0, 12, 606).intern();
        r19.m701();
        com.aiming.mdt.a.C0044.m109();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0386, code lost:
    
        if (r12.getHost() == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x038c, code lost:
    
        if (r12.getScheme() != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x038e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0391, code lost:
    
        if (r0 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03a9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0390, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03ae, code lost:
    
        if (r12.getPath() != null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03b0, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03b3, code lost:
    
        if (r0 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x03b6, code lost:
    
        r0 = com.aiming.mdt.a.C0119.f357 + 89;
        com.aiming.mdt.a.C0119.f356 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03bf, code lost:
    
        if ((r0 % 2) != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03d7, code lost:
    
        if (r12.getPath().toLowerCase().endsWith(m459((char) 0, 2, 30858).intern()) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03d9, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03da, code lost:
    
        if (r2 != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03f5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03f3, code lost:
    
        if (r12.getPath().toLowerCase().endsWith(m459((char) 0, 4, 618).intern()) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03b2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f0, code lost:
    
        if (android.text.TextUtils.isEmpty(r19.m706()) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        if (r12.getHost() == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
    
        if (m459((char) 20853, 6, 362).intern().equalsIgnoreCase(r12.getScheme()) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        r10 = r12.getHost().toLowerCase();
        r11 = new java.util.HashMap(5);
        r11.put(m459((char) 12234, 3, 368).intern(), r19.m706());
        r11.put(m459((char) 0, 3, 371).intern(), r19.m692());
        r9 = r6.indexOf(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
    
        if (r9 == (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        r9 = r9 + 1;
        r0 = r6.substring(0, r9);
        r9 = com.aiming.mdt.a.C0189.m717(r6.substring(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
    
        if (r16.f363 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
    
        r13 = com.aiming.mdt.a.C0119.f357 + 55;
        com.aiming.mdt.a.C0119.f356 = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
    
        r13 = r16.f363.get(r19.m701());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        if (r13 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0183, code lost:
    
        r15 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0188, code lost:
    
        if (r15 == '#') goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        if (r13.isEmpty() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0190, code lost:
    
        r14 = com.aiming.mdt.a.C0119.f356 + 49;
        com.aiming.mdt.a.C0119.f357 = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r2 ? 2 : 'S') != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0199, code lost:
    
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r13.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a3, code lost:
    
        r14 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a9, code lost:
    
        if (r14 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b3, code lost:
    
        if (android.text.TextUtils.isEmpty(r14.m253()) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b5, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r15 == true) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bc A[Catch: Exception -> 0x0361, TRY_LEAVE, TryCatch #9 {Exception -> 0x0361, blocks: (B:35:0x00d2, B:37:0x00d8, B:70:0x00e8, B:72:0x00f2, B:74:0x00f8, B:76:0x010f, B:78:0x0147, B:81:0x0161, B:86:0x018a, B:129:0x020c, B:130:0x0219, B:132:0x021f, B:152:0x02b8, B:154:0x02bc, B:158:0x02d5, B:161:0x02ea, B:165:0x02fd, B:171:0x0320, B:173:0x02e0, B:175:0x033c, B:177:0x032e, B:195:0x029c, B:196:0x02aa, B:198:0x016e, B:199:0x0358, B:168:0x0303, B:135:0x0227, B:136:0x0231, B:139:0x0240, B:144:0x0253, B:146:0x025b, B:151:0x027f, B:148:0x0273, B:186:0x0264, B:90:0x0199, B:91:0x019d, B:93:0x01a3, B:96:0x01ab, B:101:0x01ba, B:106:0x01c9, B:109:0x01dc, B:113:0x01ee), top: B:34:0x00d2, inners: #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032e A[Catch: Exception -> 0x0361, TryCatch #9 {Exception -> 0x0361, blocks: (B:35:0x00d2, B:37:0x00d8, B:70:0x00e8, B:72:0x00f2, B:74:0x00f8, B:76:0x010f, B:78:0x0147, B:81:0x0161, B:86:0x018a, B:129:0x020c, B:130:0x0219, B:132:0x021f, B:152:0x02b8, B:154:0x02bc, B:158:0x02d5, B:161:0x02ea, B:165:0x02fd, B:171:0x0320, B:173:0x02e0, B:175:0x033c, B:177:0x032e, B:195:0x029c, B:196:0x02aa, B:198:0x016e, B:199:0x0358, B:168:0x0303, B:135:0x0227, B:136:0x0231, B:139:0x0240, B:144:0x0253, B:146:0x025b, B:151:0x027f, B:148:0x0273, B:186:0x0264, B:90:0x0199, B:91:0x019d, B:93:0x01a3, B:96:0x01ab, B:101:0x01ba, B:106:0x01c9, B:109:0x01dc, B:113:0x01ee), top: B:34:0x00d2, inners: #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f5 A[RETURN] */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final URI m463(String str, URI uri, C0184 c0184) {
        URI uri2;
        String str2;
        String lowerCase;
        String substring;
        List<C0189.C0190> m717;
        String str3 = str;
        int i = f356 + 23;
        f357 = i % 128;
        Object obj = null;
        if (i % 2 == 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            super.hashCode();
        }
        if (this.f366 == null) {
            C0059 c0059 = this.f366.get(c0184.m701());
            if (c0059 != null) {
                int i2 = f356 + 43;
                f357 = i2 % 128;
                if (i2 % 2 == 0) {
                    if (!TextUtils.isEmpty(c0059.m185())) {
                    }
                }
                if ((c0059.m185().equals(lowerCase) ? '\n' : ')') != ')' && !TextUtils.isEmpty(str2)) {
                    try {
                        m452(m717, new C0189.C0190(c0059.m182(), (String) m458(m457(c0059.m183()))));
                    } catch (Exception unused) {
                        m459((char) 0, 32, 526).intern();
                        c0184.m701();
                        C0044.m109();
                    }
                }
            }
        } else {
            m459((char) 0, 21, 558).intern();
            C0044.m104();
        }
        str2 = substring.concat(C0189.m716(m717, m459((char) 0, 5, 311).intern()));
        int i3 = f357 + 19;
        f356 = i3 % 128;
        int i4 = i3 % 2;
        uri2 = new URI(str2);
        if (uri2 != null) {
        }
        return uri2;
        if (this.f368 == null || this.f368.isEmpty()) {
            m459((char) 25115, 32, 494).intern();
            C0044.m104();
        } else {
            try {
                for (Map.Entry<String, String[]> entry : this.f368.entrySet()) {
                    int i5 = f356 + 103;
                    f357 = i5 % 128;
                    int i6 = i5 % 2;
                    if (entry != null) {
                        int i7 = f357 + 115;
                        f356 = i7 % 128;
                        if (i7 % 2 != 0) {
                            boolean equals = lowerCase.equals(entry.getKey());
                            super.hashCode();
                            if (equals) {
                                m452(m717, new C0189.C0190(entry.getValue()[c0184.m698()], c0184.m706()));
                                break;
                            }
                            if (!lowerCase.endsWith(entry.getKey())) {
                                m452(m717, new C0189.C0190(entry.getValue()[c0184.m698()], c0184.m706()));
                                break;
                            }
                        } else {
                            if (lowerCase.equals(entry.getKey())) {
                                m452(m717, new C0189.C0190(entry.getValue()[c0184.m698()], c0184.m706()));
                                break;
                            }
                            if (!lowerCase.endsWith(entry.getKey())) {
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                m459((char) 0, 44, 450).intern();
                c0184.m701();
                C0044.m109();
            }
        }
        if (this.f366 == null) {
        }
        str2 = substring.concat(C0189.m716(m717, m459((char) 0, 5, 311).intern()));
        int i32 = f357 + 19;
        f356 = i32 % 128;
        int i42 = i32 % 2;
        uri2 = new URI(str2);
        if (uri2 != null) {
        }
        return uri2;
        str2 = substring.concat(C0189.m716(m717, m459((char) 0, 5, 311).intern()));
        int i322 = f357 + 19;
        f356 = i322 % 128;
        int i422 = i322 % 2;
        uri2 = new URI(str2);
        if (uri2 != null) {
        }
        return uri2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m464(URI uri) {
        int i = f357 + 1;
        f356 = i % 128;
        int i2 = i % 2;
        if ((uri != null ? '-' : 'L') != '-' || this.f361 == null) {
            return false;
        }
        String scheme = uri.getScheme();
        String str = null;
        String lowerCase = !(scheme != null) ? null : scheme.toLowerCase();
        String host = uri.getHost();
        if (!(host == null)) {
            str = host.toLowerCase();
        } else {
            int i3 = f357 + 53;
            f356 = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!lowerCase.equals(m459((char) 10463, 4, 318).intern()) && !lowerCase.equals(m459((char) 53308, 5, 322).intern())) {
            return true;
        }
        boolean contains = this.f361.contains(str);
        int i5 = f357 + 67;
        f356 = i5 % 128;
        if ((i5 % 2 == 0 ? 'W' : 'L') != 'W') {
        }
        return contains;
    }
}
