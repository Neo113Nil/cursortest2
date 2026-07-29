package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.utils.C0283;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʻʽʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0078 implements Runnable {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f183 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static char[] f184 = {'i', 58231, 50756, 43324, 35912, 28624, 21241, 13767, 6309, 64399, 57207, 49770, 42242, 37397, 28990, 21520, 15185, 7769, 64943, 18362, 42117, 33209, 61136, 52193, 10253, 5390, 29246, 24386, 48255, 39064, 34220, 58023, 'U', 58217, 50769, 43324, 35881, 28645, 21241, 13784, 6308, '/', 58235, 50752, 43361, 35841, 28655, 21228, 13764, 6383, 64412, 57145, 58589, 2017, 8921, 19892, 26829, 35659, 46707, 53595, 64566, 7958, 't', 58217, 'k', 4098, 'v', 'a', 58218, 'p', 58218, 50781, 43306, 63245, 5143, 12596, 12684, 'i', 58217, 50795, 43325, 35849, 28652, 21240, 32227, 40702, 48093, 54456, 61832, 20692, 46030, 'o', 58217, 21133, 62922, 5845, 13294, 23681, 47799, 22938, 31904, 5086, 14056, 54548, 59405, 36614, 41537, 16742, 25997, 30939, 8116, 13018, 53753, 62481, 35685, 44602, 19779, 24697, 1154, 7093, 16099};

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f185 = 1;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static long f186 = -1887888201491291366L;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ String f187;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f188;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ String f189;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ int f190;

    RunnableC0078(String str, String str2, int i, String str3) {
        this.f189 = str;
        this.f188 = str2;
        this.f190 = i;
        this.f187 = str3;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m238(int i, int i2, char c2) {
        char[] cArr;
        int i3;
        int i4 = f183 + 59;
        f185 = i4 % 128;
        if (i4 % 2 == 0) {
            cArr = new char[i2];
            i3 = 1;
        } else {
            cArr = new char[i2];
            i3 = 0;
        }
        while (true) {
            if (!(i3 < i2)) {
                String str = new String(cArr);
                int i5 = f185 + 15;
                f183 = i5 % 128;
                if (i5 % 2 != 0) {
                }
                return str;
            }
            int i6 = f183 + 59;
            f185 = i6 % 128;
            int i7 = i6 % 2;
            cArr[i3] = (char) ((f184[i + i3] ^ (i3 * f186)) ^ c2);
            i3++;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        m238(0, 13, (char) 0).intern();
        C0044.m108();
        try {
            C0131 m735 = C0195.m731().m735();
            String str = (String) C0162.m619().m622(m238(13, 6, (char) 37460).intern(), String.class);
            String str2 = (String) C0162.m619().m622(m238(19, 13, (char) 18427).intern(), String.class);
            String str3 = (String) C0162.m619().m622(m238(32, 9, (char) 0).intern(), String.class);
            String packageName = C0195.m731().m738().getPackageName();
            StringBuilder sb = new StringBuilder();
            sb.append(m735.m491());
            sb.append(m238(41, 11, (char) 0).intern());
            sb.append(189);
            String obj = sb.toString();
            HashMap<String, String> hashMap = new HashMap<>();
            if ((!TextUtils.isEmpty(str3) ? (char) 29 : '\b') == 29) {
                hashMap.put(m238(52, 10, (char) 58504).intern(), str3);
            }
            C0031.m33((HashMap) hashMap);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(m238(62, 2, (char) 0).intern(), System.currentTimeMillis());
            jSONObject2.put(m238(64, 1, (char) 0).intern(), str);
            jSONObject2.put(m238(65, 1, (char) 4198).intern(), str2);
            jSONObject2.put(m238(66, 1, (char) 0).intern(), 189);
            jSONObject2.put(m238(67, 2, (char) 0).intern(), this.f189);
            jSONObject2.put(m238(69, 4, (char) 0).intern(), this.f188);
            jSONObject2.put(m238(73, 3, (char) 63332).intern(), this.f190);
            jSONObject2.put(m238(76, 1, (char) 12769).intern(), this.f187);
            jSONObject2.put(m238(77, 7, (char) 0).intern(), m238(84, 5, (char) 32133).intern());
            jSONObject2.put(m238(89, 2, (char) 20644).intern(), packageName);
            jSONObject2.put(m238(91, 2, (char) 0).intern(), m238(93, 1, (char) 21180).intern());
            jSONObject.put(m238(94, 4, (char) 62894).intern(), jSONObject2);
            C0090 m361 = new C0025().m361(new C0145().m561(obj).m565(C0283.m975(jSONObject.toString())).m562(hashMap));
            if (!(m361.m336() == 200)) {
                int i = f185 + 121;
                f183 = i % 128;
                if (i % 2 != 0) {
                    C0031.m45(m361);
                    Object obj2 = null;
                    super.hashCode();
                } else {
                    C0031.m45(m361);
                }
            }
            int i2 = f183 + 17;
            f185 = i2 % 128;
            if ((i2 % 2 == 0 ? '(' : ']') != '(') {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m238(98, 23, (char) 47845).intern();
            C0044.m109();
        }
    }
}
