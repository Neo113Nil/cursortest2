package com.aiming.mdt.a;

import android.app.Application;
import android.text.TextUtils;
import android.util.Base64;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.utils.C0283;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0031 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static char[] f27 = {8543, 28708, 33730, 53899, 25629, 47071, 50824, 6198, 65217, 44964, 23640, 3383, 48053, 26717, 'A', 20784, 41694, 62361, 17698, 38608, 59281, 14655, 35529, 56218, 11567, 32469, 53140, 'U', 20775, 41677, 62350, 17681, 38595, 59293, 14626, 35540, 's', 20775, 41668, 3970, '/', 20780, 41690, 62403, 27799, 61549, 60980, 49015, 19588, 7629, 20302, 7681, 60902, 48297, 2589, 'k', 't', 20789, 53388, 33247, 48208, 8151, 20140, 48458, 60419, 23189, 35159, 63488, 9918, 38243, 50192, 12978, 24880, 'A', 20794, 41692, 62357, 17667, 38593, 59286, 14632, 35554, 56219, 11564, 32485, 53194, 22108, 1838, 62660, 42375, 4980, 49388, 45462, 28448, 56519, 36233, 'U', 20736, 41710, 62417, 17768, 31826, 11569, 57049, 36745, 14645, 60119, 39820, 17689, 63188, 42909, 20772, 700, 46001, 23850, 3820, 49029, 26899, 6897, 52102, 30040, 9904, 55169, 33098, 13054, 58255, 36166, 16050, 53947, 33782, 28703, 8575, 38848, 17464, 13676, 60362, 22590, 2423, 65490, 44094, 7524, 62427, 40973, 4391, 'R', 20785, 41689, 62345, 17717, 38615, 59276, 14617, 35540, 56221, 11556, 32444, 53178, 8471, 29406, 50078, 5409, 26361, 46989, 2379, 23295, 43926, 64851, 20191, 40837, 61786, 17132, 37884, 58709, 14070, 34730, 55619, 10994, 31726, 'G', 20736, 41720, 62357, 17716, 49442, 36909, 25482, 12950, 33890, 22495, 9928, 63600, 19339, 6793, 60457, 49136, 3721, 57460, 45988, 711, 54334, 43005, 30350, 51271, 39840, 46349, 58452, 6053, 'p', 20797, 41676, 'R', 20785, 41689, 62345, 17717, 38615, 59276, 14617, 35540, 56221, 11556, 32444, 53148, 8491, 29433, 50056, 5377, 26336, 47036, 2397, 23267, 43919, 64792, 20201, 40850, 61766, 17127, 37806, 58634, 43962, 64181, 2322, 22539, 62119, 3721, 24528, 'r', 20791, 41671, 62360, 17717, 41287, 61452, 1006, 21166, 'h', 20775, 15070, 'A', 20768, 41725, 62348, 17724, 38603, 59289, 14632, 35553, 56192, 11548, 32509, 53123, 8495, 29386, 50057, 5427, 26337, 46980, 2376, 23216, 43959, 64845, 20207, 40835, 61777, 17147, 37807, 49023, 60956, 7668, 19620, 64024, 10746, 22689, 34356, 13817, 25776, 37385, 49553, 28840, 40473, 52697, 31918, 43532, 55773, 2180, 46693, 58857, 5288, 16998, 61898, 8351, 20092, 64982, 11396, 23153, 35293, 14549, 26212, 38367, 50315, 29290, 41251, 53447, 49312, 37295, 25152, 13132, 34217, 22038, 10053, 63973, 19036, 6943, 60844, 48741, 3906, 'R', 20785, 41689, 62345, 17717, 38615, 59276, 14617, 35540, 56221, 11556, 32444, 53148, 8491, 29433, 50056, 5383, 26336, 47036, 2397, 23267, 43919, 64792, 20201, 40850, 61766, 17127, 37806, 58634, 65509, 44779, 23819, 3164, 47781, 26904, 6159, 50866, 59328, 46755, 17739, 5147, 41639, 28997, 30, 56971, 27974, 15375, 51894, 39214, 10256, 50867, 38267, 9227, 62135, 33141, 20494, 61179, 48459, 19516, 6794, 43387, 30720, 5844, 42357, 29756, 664, 'C', 20795, 41670, 62344, 17717, 38602, 59276, 14689, 35572, 56205, 11576, 32505, 'a', 20772, 41688, 62352, 17721, 38599, 59289, 14648, 35529, 56219, 11558, 32435, 53151, 8487, 29420, 50057, 5428, 26297, 47003, 2376, 23266, 43905, 64857, 20193, 32220, 11428, 57177, 36365, 14506, 60248, 39443, 17594, 63312, 42501, 59831, 47340, 19219, 6747, 44257, 'A', 20791, 41675, 62361, 17696, 38608, 59349, 14601, 35534, 56215, 11559, 32504, 53145, 8490, 29439, 'g', 20782, 41665, 62348, 54536, 33899, 30593, 9942, 36965, 17296, 13009, 60531, 24511, 3804, 63584, 43945, 6872, 62500, 42903, 5860, 49238, 46068, 49542, 37041, 25441, 12862, 33939, 22328, 43046, 63775, 2763, 23433, 60709, 16067, 20377, 37167, 8860, 44273, 64958};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f28 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static long f29 = 6842085468142129492L;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f30 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0109 m32() {
        C0109 c0109 = null;
        try {
            String str = "";
            C0131 m735 = C0195.m731().m735();
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m491());
            sb.append(m38(365, 8, (char) 65482).intern());
            String obj = sb.toString();
            HashMap<String, String> hashMap = new HashMap<>();
            m46(hashMap);
            hashMap.put(m38(453, 15, (char) 0).intern(), m38(468, 4, (char) 0).intern());
            C0090 m361 = new C0025().m21().m361(new C0145().m561(obj).m565(m36()).m562(hashMap));
            if (m361.m336() == 200) {
                str = new String(C0239.m852(m361.m332()), m38(96, 5, (char) 0).intern());
            } else {
                m35(m361);
                int i = f30 + 109;
                f28 = i % 128;
                if (i % 2 == 0) {
                }
            }
            if ((!TextUtils.isEmpty(str) ? (char) 30 : 'M') != 'M') {
                int i2 = f30 + 93;
                f28 = i2 % 128;
                int i3 = i2 % 2;
                c0109 = C0161.m615(str);
            }
            int i4 = f30 + 53;
            f28 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(373, 29, (char) 59282).intern();
            C0044.m109();
        }
        return c0109;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ HashMap m33(HashMap hashMap) {
        int i = f30 + 75;
        f28 = i % 128;
        if (i % 2 != 0) {
        }
        HashMap<String, String> m46 = m46(hashMap);
        int i2 = f30 + 61;
        f28 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return m46;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static HashMap<String, String> m34(Map<String, List<String>> map) {
        String key;
        int i;
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        int i2 = f30 + 7;
        f28 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        while (true) {
            if (!it.hasNext()) {
                return hashMap;
            }
            int i3 = f30 + 99;
            f28 = i3 % 128;
            int i4 = i3 % 2;
            Map.Entry<String, List<String>> next = it.next();
            if ((!next.getValue().isEmpty() ? (char) 21 : 'K') == 21) {
                int i5 = f28 + 69;
                f30 = i5 % 128;
                if (i5 % 2 == 0) {
                    key = next.getKey();
                    i = 5536;
                } else {
                    key = next.getKey();
                    i = 505;
                }
                hashMap.put(key, TextUtils.join(m38(i, 2, (char) 44234).intern(), next.getValue()));
            }
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static void m35(C0090 c0090) {
        int i = f30 + 65;
        f28 = i % 128;
        int i2 = i % 2;
        m38(472, 18, (char) 54618).intern();
        m38(490, 6, (char) 49574).intern();
        c0090.m336();
        m38(496, 9, (char) 43014).intern();
        c0090.m334();
        C0044.m104();
        int i3 = f30 + 9;
        f28 = i3 % 128;
        if ((i3 % 2 != 0 ? '=' : '[') != '[') {
            Object obj = null;
            super.hashCode();
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static byte[] m36() {
        int i = f28 + 101;
        f30 = i % 128;
        int i2 = i % 2;
        Application m738 = C0195.m731().m738();
        byte[] m975 = C0283.m975(TextUtils.join(m38(60, 1, (char) 48209).intern(), new Object[]{Long.valueOf(System.currentTimeMillis()), 1, Integer.valueOf(GmsClientSupervisor.DEFAULT_BIND_FLAGS), (String) C0162.m619().m622(m38(14, 13, (char) 0).intern(), String.class), Integer.valueOf(((Integer) C0162.m619().m622(m38(178, 5, (char) 0).intern(), Integer.TYPE)).intValue()), C0124.m472(m738)}));
        int i3 = f30 + 5;
        f28 = i3 % 128;
        if ((i3 % 2 != 0 ? '\\' : '7') != '\\') {
        }
        return m975;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static C0051 m37() {
        String str;
        C0051 c0051 = null;
        try {
            C0131 m735 = C0195.m731().m735();
            String str2 = (String) C0162.m619().m622(m38(14, 13, (char) 0).intern(), String.class);
            int intValue = ((Integer) C0162.m619().m622(m38(178, 5, (char) 0).intern(), Integer.TYPE)).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m491());
            sb.append(m38(183, 21, (char) 49421).intern());
            sb.append(m38(50, 5, (char) 20347).intern());
            String obj = sb.toString();
            HashMap<String, String> hashMap = new HashMap<>();
            m46(hashMap);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m38(204, 3, (char) 46441).intern(), str2);
            jSONObject.put(m38(207, 3, (char) 0).intern(), intValue);
            jSONObject.put(m38(56, 1, (char) 0).intern(), System.currentTimeMillis());
            C0090 m361 = new C0025().m361(new C0145().m561(obj).m565(C0283.m974(C0239.m853(jSONObject.toString().getBytes(m38(96, 5, (char) 0).intern())))).m562(hashMap));
            if (m361.m336() == 200) {
                str = new String(C0239.m852(C0283.m976(m361.m332())), m38(96, 5, (char) 0).intern());
            } else {
                m35(m361);
                str = null;
            }
            if ((!TextUtils.isEmpty(str) ? '\'' : (char) 17) == '\'') {
                int i = f30 + 39;
                f28 = i % 128;
                int i2 = i % 2;
                c0051 = C0161.m607(str);
            }
            int i3 = f28 + 121;
            f30 = i3 % 128;
            if (i3 % 2 == 0) {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(210, 29, (char) 0).intern();
            C0044.m109();
        }
        return c0051;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m38(int i, int i2, char c2) {
        char[] cArr = new char[i2];
        int i3 = f30 + 89;
        f28 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                return new String(cArr);
            }
            int i6 = f30 + 1;
            f28 = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((f27[i + i5] ^ (i5 * f29)) ^ c2);
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014f A[Catch: Exception -> 0x0171, TRY_LEAVE, TryCatch #0 {Exception -> 0x0171, blocks: (B:2:0x0000, B:6:0x00a2, B:9:0x00b3, B:10:0x00c6, B:12:0x00d8, B:15:0x00e0, B:16:0x010e, B:20:0x014f, B:27:0x016d, B:30:0x00ec), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d A[Catch: Exception -> 0x0171, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0171, blocks: (B:2:0x0000, B:6:0x00a2, B:9:0x00b3, B:10:0x00c6, B:12:0x00d8, B:15:0x00e0, B:16:0x010e, B:20:0x014f, B:27:0x016d, B:30:0x00ec), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014c  */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m39(C0090 c0090, C0087 c0087) {
        C0090 m361;
        try {
            C0131 m735 = C0195.m731().m735();
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m491());
            sb.append(m38(239, 4, (char) 43925).intern());
            String obj = sb.toString();
            HashMap<String, String> hashMap = new HashMap<>();
            m46(hashMap);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m38(243, 1, (char) 62164).intern(), c0087.m277());
            jSONObject.put(m38(244, 2, (char) 3808).intern(), c0087.m265());
            jSONObject.put(m38(246, 5, (char) 0).intern(), c0090.m336());
            jSONObject.put(m38(251, 4, (char) 41269).intern(), c0090.m334());
            jSONObject.put(m38(56, 1, (char) 0).intern(), System.currentTimeMillis());
            Map<String, List<String>> m322 = c0090.m322();
            if ((m322 != null) && m322.size() > 0) {
                int i = f30 + 33;
                f28 = i % 128;
                int i2 = i % 2;
                jSONObject.put(m38(255, 2, (char) 0).intern(), m43(m34(m322)));
            }
            String encodeToString = Base64.encodeToString(c0090.m332(), 0);
            if (c0087.m289() != 1 && c0087.m289() != 3) {
                jSONObject.put(m38(257, 1, (char) 15037).intern(), encodeToString);
                m361 = new C0025().m361(new C0145().m561(obj).m565(C0283.m974(C0239.m853(jSONObject.toString().getBytes(m38(96, 5, (char) 0).intern())))).m562(hashMap));
                if (!(m361.m336() == 200)) {
                    m35(m361);
                    return;
                }
                m38(258, 28, (char) 0).intern();
                C0044.m108();
                int i3 = f30 + 79;
                f28 = i3 % 128;
                if (i3 % 2 != 0) {
                }
                return;
            }
            String intern = m38(257, 1, (char) 15037).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0090.m333().toString());
            sb2.append(encodeToString);
            jSONObject.put(intern, sb2.toString());
            m361 = new C0025().m361(new C0145().m561(obj).m565(C0283.m974(C0239.m853(jSONObject.toString().getBytes(m38(96, 5, (char) 0).intern())))).m562(hashMap));
            if (!(m361.m336() == 200)) {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(286, 37, (char) 48941).intern();
            C0044.m109();
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m40(String str, String str2, String str3, int i) {
        C0057.m177().m179(new RunnableC0078(str, str3, i, str2));
        int i2 = f30 + 89;
        f28 = i2 % 128;
        if ((i2 % 2 != 0 ? 'T' : '\\') != 'T') {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r0.append(r9);
        r7 = com.aiming.mdt.a.C0031.f30 + 73;
        com.aiming.mdt.a.C0031.f28 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if ((r5 ? 'M' : '[') != '[') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((!r5) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r5 = false;
     */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m41(CharSequence charSequence, byte[] bArr) {
        byte b2;
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        boolean z = true;
        while (i < length) {
            int i2 = f28 + 115;
            f30 = i2 % 128;
            if (i2 % 2 == 0) {
                b2 = bArr[i];
            } else {
                b2 = bArr[i];
            }
            sb.append((int) b2);
            i++;
            int i3 = f28 + 65;
            f30 = i3 % 128;
            int i4 = i3 % 2;
        }
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ConcurrentLinkedQueue<C0184> m42() {
        String str;
        ConcurrentLinkedQueue<C0184> concurrentLinkedQueue = null;
        try {
            C0131 m735 = C0195.m731().m735();
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m491());
            sb.append(m38(323, 13, (char) 49295).intern());
            sb.append(m38(50, 5, (char) 20347).intern());
            String obj = sb.toString();
            HashMap<String, String> hashMap = new HashMap<>();
            m46(hashMap);
            C0090 m361 = new C0025().m361(new C0145().m561(obj).m565(m36()).m562(hashMap));
            if (m361.m336() == 200) {
                str = new String(m361.m332(), m38(96, 5, (char) 0).intern());
            } else {
                m35(m361);
                str = null;
            }
            if ((!TextUtils.isEmpty(str) ? '%' : 'O') == '%') {
                int i = f30 + 5;
                f28 = i % 128;
                int i2 = i % 2;
                concurrentLinkedQueue = C0161.m612(str);
            }
            int i3 = f28 + 15;
            f30 = i3 % 128;
            if (i3 % 2 == 0) {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(336, 29, (char) 0).intern();
            C0044.m109();
        }
        return concurrentLinkedQueue;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static JSONArray m43(HashMap<String, String> hashMap) {
        String[] strArr;
        ArrayList arrayList = new ArrayList(hashMap.size());
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        int i = f28 + 11;
        f30 = i % 128;
        if (i % 2 == 0) {
        }
        while (true) {
            if (!it.hasNext()) {
                return new JSONArray((Collection) arrayList);
            }
            int i2 = f28 + 69;
            f30 = i2 % 128;
            if ((i2 % 2 == 0 ? 'A' : '>') != '>') {
                Map.Entry<String, String> next = it.next();
                strArr = new String[2];
                strArr[0] = next.getKey();
                strArr[0] = next.getValue();
            } else {
                Map.Entry<String, String> next2 = it.next();
                strArr = new String[]{next2.getKey(), next2.getValue()};
            }
            arrayList.add(strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        if ((r3.size() <= 0) != true) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0187 A[Catch: Exception -> 0x01ac, TryCatch #0 {Exception -> 0x01ac, blocks: (B:2:0x0000, B:6:0x00b4, B:9:0x00c6, B:10:0x00bb, B:15:0x00db, B:23:0x0105, B:26:0x0114, B:27:0x0146, B:31:0x0187, B:34:0x018b, B:46:0x010c, B:49:0x0120), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018b A[Catch: Exception -> 0x01ac, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ac, blocks: (B:2:0x0000, B:6:0x00b4, B:9:0x00c6, B:10:0x00bb, B:15:0x00db, B:23:0x0105, B:26:0x0114, B:27:0x0146, B:31:0x0187, B:34:0x018b, B:46:0x010c, B:49:0x0120), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m44(C0087 c0087, C0157 c0157) {
        C0090 m361;
        try {
            C0131 m735 = C0195.m731().m735();
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m491());
            sb.append(m38(239, 4, (char) 43925).intern());
            String obj = sb.toString();
            HashMap<String, String> hashMap = new HashMap<>();
            m46(hashMap);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m38(243, 1, (char) 62164).intern(), c0087.m277());
            jSONObject.put(m38(244, 2, (char) 3808).intern(), c0087.m265());
            jSONObject.put(m38(246, 5, (char) 0).intern(), c0157.m597().m336());
            jSONObject.put(m38(251, 4, (char) 41269).intern(), c0157.m597().m334());
            jSONObject.put(m38(56, 1, (char) 0).intern(), System.currentTimeMillis());
            Map<String, List<String>> m322 = c0157.m597().m322();
            if (m322 != null) {
                int i = f28 + 41;
                f30 = i % 128;
                if (i % 2 == 0) {
                    if (m322.size() > 0) {
                        jSONObject.put(m38(255, 2, (char) 0).intern(), m43(m34(m322)));
                    }
                }
            }
            String encodeToString = Base64.encodeToString(c0157.m597().m332(), 0);
            if ((c0087.m289() != 1 ? '0' : '7') != '7') {
                int i2 = f28 + 83;
                f30 = i2 % 128;
                if (i2 % 2 == 0) {
                    if (c0087.m289() == 5) {
                    }
                    jSONObject.put(m38(257, 1, (char) 15037).intern(), encodeToString);
                } else {
                    if (c0087.m289() == 3) {
                    }
                    jSONObject.put(m38(257, 1, (char) 15037).intern(), encodeToString);
                }
                m361 = new C0025().m361(new C0145().m561(obj).m565(C0283.m974(C0239.m853(jSONObject.toString().getBytes(m38(96, 5, (char) 0).intern())))).m562(hashMap));
                if (m361.m336() != 200) {
                    m35(m361);
                    return;
                }
                m38(258, 28, (char) 0).intern();
                C0044.m108();
                int i3 = f30 + 75;
                f28 = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    super.hashCode();
                    return;
                }
                return;
            }
            String intern = m38(257, 1, (char) 15037).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0157.m597().m333().toString());
            sb2.append(encodeToString);
            jSONObject.put(intern, sb2.toString());
            m361 = new C0025().m361(new C0145().m561(obj).m565(C0283.m974(C0239.m853(jSONObject.toString().getBytes(m38(96, 5, (char) 0).intern())))).m562(hashMap));
            if (m361.m336() != 200) {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(286, 37, (char) 48941).intern();
            C0044.m109();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ void m45(C0090 c0090) {
        int i = f30 + 83;
        f28 = i % 128;
        if (i % 2 != 0) {
            m35(c0090);
        } else {
            m35(c0090);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static HashMap<String, String> m46(HashMap<String, String> hashMap) {
        int i = f30 + 39;
        f28 = i % 128;
        int i2 = i % 2;
        hashMap.put(m38(402, 12, (char) 0).intern(), m38(414, 24, (char) 0).intern());
        hashMap.put(m38(438, 10, (char) 32159).intern(), m38(448, 5, (char) 59860).intern());
        int i3 = f28 + 119;
        f30 = i3 % 128;
        if (!(i3 % 2 != 0)) {
        }
        return hashMap;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m47() {
        m38(0, 8, (char) 8478).intern();
        C0044.m108();
        try {
            C0131 m735 = C0195.m731().m735();
            String str = (String) C0162.m619().m622(m38(8, 6, (char) 65152).intern(), String.class);
            String str2 = (String) C0162.m619().m622(m38(14, 13, (char) 0).intern(), String.class);
            String str3 = (String) C0162.m619().m622(m38(27, 9, (char) 0).intern(), String.class);
            String str4 = (String) C0162.m619().m622(m38(36, 3, (char) 0).intern(), String.class);
            if (str4 == null) {
                str4 = m38(39, 1, (char) 4018).intern();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m496());
            sb.append(m38(40, 4, (char) 0).intern());
            sb.append(new C0189().m721(m38(44, 1, (char) 27873).intern(), m38(45, 1, (char) 61532).intern()).m721(m38(46, 4, (char) 60999).intern(), m38(50, 5, (char) 20347).intern()).m721(m38(55, 1, (char) 0).intern(), str).m721(m38(56, 1, (char) 0).intern(), m38(57, 1, (char) 20820).intern()).m721(m38(58, 2, (char) 53496).intern(), Long.valueOf(System.currentTimeMillis())).m720());
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(m38(60, 1, (char) 48209).intern());
            sb2.append(m41(m38(60, 1, (char) 48209).intern(), C0124.f378));
            sb2.append(m38(60, 1, (char) 48209).intern());
            sb2.append(str4);
            sb2.append(m38(60, 1, (char) 48209).intern());
            sb2.append(C0124.f375);
            String obj2 = sb2.toString();
            if (obj2.contains(m38(45, 1, (char) 61532).intern())) {
                m38(61, 12, (char) 8086).intern();
                C0044.m108();
                m38(73, 13, (char) 0).intern();
                C0044.m108();
                HashMap<String, String> hashMap = new HashMap<>();
                if (!(TextUtils.isEmpty(str3))) {
                    hashMap.put(m38(86, 10, (char) 22025).intern(), str3);
                    int i = f28 + 19;
                    f30 = i % 128;
                    int i2 = i % 2;
                }
                m46(hashMap);
                C0090 m361 = new C0025().m361(new C0145().m561(obj).m565(C0239.m853(obj2.getBytes(m38(96, 5, (char) 0).intern()))).m562(hashMap));
                if ((m361.m336() != 200 ? '$' : '%') != '%') {
                    int i3 = f30 + 115;
                    f28 = i3 % 128;
                    int i4 = i3 % 2;
                    m35(m361);
                }
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(101, 27, (char) 31744).intern();
            C0044.m107();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m48(String str, int i, String str2, int i2) {
        C0057.m177().m179(new RunnableC0099(str, i, str2, i2));
        int i3 = f28 + 23;
        f30 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m49(String str, String str2) {
        m38(128, 16, (char) 54001).intern();
        C0044.m108();
        C0044.m108();
        try {
            byte[] m974 = C0283.m974(C0239.m853(str2.getBytes(m38(96, 5, (char) 0).intern())));
            HashMap<String, String> hashMap = new HashMap<>();
            m46(hashMap);
            C0090 m361 = new C0025().m361(new C0145().m561(str).m565(m974).m562(hashMap));
            if (!(m361.m336() == 200)) {
                int i = f30 + 81;
                f28 = i % 128;
                int i2 = i % 2;
                m35(m361);
            }
            int i3 = f30 + 117;
            f28 = i3 % 128;
            if ((i3 % 2 != 0 ? 'Z' : (char) 25) != 25) {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m38(144, 34, (char) 0).intern();
            C0044.m107();
        }
    }
}
