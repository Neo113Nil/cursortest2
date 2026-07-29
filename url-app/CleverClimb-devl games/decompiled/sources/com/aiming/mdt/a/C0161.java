package com.aiming.mdt.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʽʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0161 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static char[] f535 = {50595, 46752, 54356, 42840, 12897, 36096, 6199, 25098, 4388, 33817, 15203, 44627, 23883, 53437, 18322, 64214, 27094, 7376, 36902, 1813, 47721, 10534, 56393, 21415, 50819, 30199, 59618, 40920, 4884, 34314, 13619, 43105, 24410, 53945, 16859, 62593, 27647, 7876, 37424, 266, 46171, 13954, 'i', 29565, 't', 'h', 29551, 25434, 4183, 'l', 17763, 17995, 13648, 41066, 1902, 29800, 57695, 24097, 7459, 28215, 64280, 17508, 15039, 18865, 'h', 29546, 'c', 'f', 29547, 'r', 63681, 35794, 7924, 39113, 60364, 32490, 49542, 65239, 36289, 6381, 42902, 12980, 'd', 29552, 58966, 58242, 37054, 1429, 47784, 12262, 56522, 20737, 50701, 31608, 59465, 40195, 'R', 29564, 58945, 22843, 52235, 16147, 45797, 9674, 39054, 2958, 32392, 62078, 25933, 55345, 19326, 48657, 12799, 42203, 6063, 35514, 64896, 29004, 58450, 22379, 51769, 15618, 45281, 9202, 38601, 2480, 31899, 61538, 25344, 54876, 18720, 48153, 12267, 41711, 5516, 'f', 29558, 58944, 22822, 52229, 16137, 45777, 9691, 39068, 2944, 32393, 62072, 25878, 27370, 6565, 35977, 13223, '\t', ':', 29530, 58974, 22818, 52231, 16150, 45750, 9691, 39079, 3009, 32435, 62078, 25948, 55351, '/', 29546, 58966, 22884, 52227, 16146, 45737, '/', 29546, 58966, 22884, 52237, 16144, 45798, 9693, 39159, 'A', 29565, 58966, 22891, 52259, 16137, 45762, 9678, 39099, 2954, 32448, 'R', 29564, 58945, 22843, 52235, 16147, 45797, 9674, 39054, 2958, 32392, 62078, 25933, 55345, 19326, 48657, 12799, 42203, 6063, 35514, 64896, 29002, 58450, 22379, 51769, 15618, 45281, 9091, 38617, 2471, 31900, 61544, 25426, 54787, 58564, 38868, 738, 48516, 10407, 56235, 22113, 49476, 31776, 61305, 9093, 20621, 50613, 31455, 61436, 'd', 29558, 58975, 22826, 52237, 16147, 'm', 29549, 58950, 22818, 'r', 29564, 58965, 42857, 54388, 16732, 17630, 14320, 41677, 7607, 34951, 31647, 63081, 24902, 56322, 20226, 14852, 46834, 8641, 40125, 4082, 64157, 30067, 57431, 21283, 52790, 47372, 13780, 41187, 5113, 36596, 31128, 62580, 26461, 53855, 19755, 14424, 54439, 42940, 12955, 36351, 6337, 60368, 26165, 61701, 19539, 57164, 43610, 'p', 29560, 58950, 22819, 51512, 47679, 12059, 36974, 1353, 'p', 29551, 58963, 22823, 52241, 16152, 38997, 60285, 32325, 49455, 21516, 42801, 11005, 48576, 168, 37767, 59019, 27263, 64838, 16430, 54113, 52653, 48831, 11158, 38115, 452, 62170, 32556, ',', 45761, 49621, 21756, 60290, 2178, 31645, 61118, 20938, 'D', 29558, 58975, 22826, 52237, 16147, 45740, 15407, 20273, 55836, 25974, 61516, 836, 36525, 6538, 'c', 29560, 58975, 22843, 52229, 16148, 45809, 9665, 39063, 2952, 32414, 62048, 'r', 29564, 58965, 22830, 52252, 36119, 65051, 27437, 54350, 16740, 41469, 53971, 18426, 63617, 28083, 40680, 37354, 58071, 30687, 51329, 23986, 44716, 8969};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static long f536 = -766718852657548519L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f537 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f538 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0051 m607(String str) {
        C0051 c0051;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(m608(0, 2, (char) 50637).intern(), 0);
            ConcurrentLinkedQueue<C0087> m613 = m613(jSONObject.optJSONArray(m608(2, 5, (char) 54304).intern()));
            c0051 = new C0051();
            try {
                c0051.m159(optInt * 1000);
                c0051.m161(m613);
                int i = f537 + 27;
                f538 = i % 128;
                int i2 = i % 2;
            } catch (Exception unused) {
                m608(7, 34, (char) 25176).intern();
                C0044.m109();
                return c0051;
            }
        } catch (Exception unused2) {
            c0051 = null;
        }
        return c0051;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m608(int i, int i2, char c2) {
        char[] cArr = new char[i2];
        int i3 = f538 + 87;
        f537 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            if (!(i5 < i2)) {
                String str = new String(cArr);
                int i6 = f538 + 39;
                f537 = i6 % 128;
                if (i6 % 2 != 0) {
                }
                return str;
            }
            cArr[i5] = (char) ((f535[i + i5] ^ (i5 * f536)) ^ c2);
            i5++;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Map<String, C0059> m609(JSONArray jSONArray) {
        int length;
        HashMap hashMap = new HashMap();
        if ((jSONArray != null ? '>' : '-') != '-') {
            int i = f538 + 65;
            f537 = i % 128;
            for (int i2 = (i % 2 != 0 ? '4' : '&') != '4' ? 0 : 1; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                C0059 c0059 = new C0059();
                c0059.m186(optJSONObject.optString(m608(243, 6, (char) 0).intern()));
                c0059.m189(optJSONObject.optString(m608(238, 5, (char) 9205).intern()));
                c0059.m184(optJSONObject.optString(m608(354, 8, (char) 15452).intern()));
                JSONArray optJSONArray = optJSONObject.optJSONArray(m608(362, 12, (char) 0).intern());
                if (optJSONArray != null) {
                    int i3 = f537 + 63;
                    f538 = i3 % 128;
                    if (i3 % 2 != 0 ? (length = optJSONArray.length()) > 0 : (length = optJSONArray.length()) > 0) {
                        c0059.m187(new ArrayList(length));
                        int i4 = f537 + 79;
                        f538 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    for (int i6 = 0; i6 < length; i6++) {
                        c0059.m188().add(optJSONArray.optString(i6));
                    }
                    if (c0059.m188() != null) {
                        Iterator<String> it = c0059.m188().iterator();
                        while (true) {
                            if ((it.hasNext() ? 'M' : ' ') != ' ') {
                                hashMap.put(it.next(), c0059);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static Map<String, List<C0081>> m610(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray != null) {
            int i = f538 + 63;
            f537 = i % 128;
            int i2 = i % 2;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                C0081 c0081 = new C0081();
                c0081.m256(optJSONObject.optLong(m608(42, 2, (char) 0).intern()));
                c0081.m254(optJSONObject.optString(m608(290, 11, (char) 54468).intern()));
                c0081.m259(optJSONObject.optString(m608(243, 6, (char) 0).intern()));
                c0081.m252(optJSONObject.optString(m608(301, 4, (char) 0).intern()));
                c0081.m257(optJSONObject.optString(m608(305, 5, (char) 51528).intern()));
                c0081.m250(optJSONObject.optString(m608(310, 6, (char) 0).intern()));
                m608(316, 15, (char) 38917).intern();
                C0044.m108();
                List list = (List) hashMap.get(c0081.m249());
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(c0081.m249(), list);
                }
                if ((list.size() >= 500 ? '4' : (char) 11) != '4') {
                    int i4 = f537 + 97;
                    f538 = i4 % 128;
                    int i5 = i4 % 2;
                    list.add(c0081);
                }
            }
        }
        int i6 = f538 + 111;
        f537 = i6 % 128;
        if (i6 % 2 != 0) {
        }
        return hashMap;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static LinkedList<C0048> m611(JSONArray jSONArray) {
        LinkedList<C0048> linkedList = new LinkedList<>();
        if (!(jSONArray == null)) {
            int i = f537 + 7;
            f538 = i % 128;
            int i2 = i % 2 != 0 ? 0 : 1;
            while (i2 < jSONArray.length()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                C0048 c0048 = new C0048();
                c0048.m147(optJSONObject.optInt(m608(42, 2, (char) 0).intern()));
                c0048.m148(optJSONObject.optString(m608(374, 5, (char) 0).intern()));
                c0048.m145(optJSONObject.optInt(m608(379, 5, (char) 36208).intern()));
                String optString = optJSONObject.optString(m608(243, 6, (char) 0).intern());
                c0048.m143(optString);
                m608(384, 6, (char) 41391).intern();
                C0044.m108();
                if (TextUtils.isEmpty(optString)) {
                    linkedList.addLast(c0048);
                } else {
                    linkedList.addFirst(c0048);
                    int i3 = f538 + 31;
                    f537 = i3 % 128;
                    int i4 = i3 % 2;
                }
                i2++;
                int i5 = f538 + 75;
                f537 = i5 % 128;
                if (i5 % 2 != 0) {
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        if (r8 != false) goto L40;
     */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ConcurrentLinkedQueue<C0184> m612(String str) {
        m608(135, 13, (char) 0).intern();
        C0044.m108();
        ConcurrentLinkedQueue<C0184> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        try {
            String[] split = str.split(m608(148, 4, (char) 27313).intern());
            int i = f537 + 27;
            f538 = i % 128;
            int i2 = i % 2;
            for (String str2 : split) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    int i3 = f538 + 53;
                    f537 = i3 % 128;
                    int i4 = i3 % 2;
                    boolean z = true;
                    String[] split2 = trim.split(m608(152, 1, (char) 0).intern(), -1);
                    if (split2.length >= 5) {
                        C0184 c0184 = new C0184();
                        c0184.m703(split2[0]);
                        c0184.m693(split2[1]);
                        c0184.m700(split2[2]);
                        c0184.m709(split2[3]);
                        c0184.m708(split2[4]);
                        if (split2.length > 5) {
                            c0184.m702(Integer.parseInt(split2[5]));
                        }
                        if (split2.length > 6) {
                            c0184.m699(Integer.parseInt(split2[6]));
                        } else {
                            c0184.m699(0);
                        }
                        if (split2.length > 7) {
                            int i5 = f537 + 55;
                            f538 = i5 % 128;
                            if (i5 % 2 == 0) {
                                c0184.m707(Integer.parseInt(split2[109]) - 4262);
                            } else {
                                c0184.m707(Integer.parseInt(split2[7]) * 1000);
                            }
                        }
                        if (c0184.m705() != 1) {
                            if (c0184.m705() != 2) {
                                z = false;
                            }
                        }
                        c0184.m701();
                        m608(153, 14, (char) 0).intern();
                        C0044.m108();
                        c0184.m708(c0184.m694().replace(m608(167, 7, (char) 0).intern(), m608(174, 9, (char) 0).intern()));
                        int i6 = f537 + 45;
                        f538 = i6 % 128;
                        int i7 = i6 % 2;
                        m608(183, 11, (char) 0).intern();
                        C0044.m108();
                        concurrentLinkedQueue.add(c0184);
                    }
                }
            }
            int i8 = f538 + 69;
            f537 = i8 % 128;
            int i9 = i8 % 2;
        } catch (Exception unused) {
            m608(194, 34, (char) 0).intern();
            C0044.m109();
        }
        int i10 = f537 + 117;
        f538 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        return concurrentLinkedQueue;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ConcurrentLinkedQueue<C0087> m613(JSONArray jSONArray) {
        String m608;
        boolean z;
        JSONArray optJSONArray;
        int i;
        ConcurrentLinkedQueue<C0087> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                C0087 c0087 = new C0087();
                c0087.m291(optJSONObject.optString(m608(41, 1, (char) 14065).intern()));
                c0087.m279(optJSONObject.optString(m608(42, 2, (char) 0).intern()));
                c0087.m278(optJSONObject.optInt(m608(44, 1, (char) 0).intern()));
                c0087.m290(optJSONObject.optInt(m608(45, 2, (char) 0).intern()));
                c0087.m267(optJSONObject.optString(m608(47, 2, (char) 25391).intern()));
                c0087.m285(optJSONObject.optString(m608(49, 1, (char) 0).intern()));
                int optInt = optJSONObject.optInt(m608(50, 1, (char) 17678).intern());
                if ((optInt == 0 ? 'R' : 'A') != 'A') {
                    m608 = m608(51, 3, (char) 17932);
                } else {
                    if ((optInt == 1 ? '9' : 'K') != '9') {
                        if ((optInt == 2 ? '>' : (char) 18) == '>') {
                            int i3 = f537 + 115;
                            f538 = i3 % 128;
                            m608 = i3 % 2 == 0 ? m608(55, 4, (char) 7531) : m608(58, 4, (char) 7531);
                        }
                        if (optJSONObject.optInt(m608(62, 2, (char) 15068).intern()) == 1) {
                            int i4 = f537 + 35;
                            f538 = i4 % 128;
                            if (!(i4 % 2 == 0)) {
                                z = true;
                                c0087.m280(z);
                                optJSONArray = optJSONObject.optJSONArray(m608(64, 2, (char) 0).intern());
                                HashMap<String, String> hashMap = new HashMap<>();
                                i = 0;
                                while (i < optJSONArray.length()) {
                                    int i5 = f537 + 11;
                                    f538 = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
                                        hashMap.put(optJSONArray2.optString(1), optJSONArray2.optString(0));
                                        i += 82;
                                    } else {
                                        JSONArray optJSONArray3 = optJSONArray.optJSONArray(i);
                                        hashMap.put(optJSONArray3.optString(0), optJSONArray3.optString(1));
                                        i++;
                                    }
                                }
                                c0087.m272(hashMap);
                                c0087.m283(optJSONObject.optString(m608(66, 1, (char) 0).intern()));
                                c0087.m268(!(optJSONObject.optInt(m608(67, 2, (char) 0).intern()) != 1));
                                c0087.m292(optJSONObject.optInt(m608(69, 1, (char) 0).intern()) != 1 ? false : true);
                                c0087.m266(optJSONObject.optInt(m608(70, 3, (char) 63650).intern()));
                                c0087.m270(optJSONObject.optInt(m608(73, 4, (char) 39097).intern()));
                                c0087.m295(optJSONObject.optString(m608(77, 5, (char) 65204).intern()));
                                c0087.m274(optJSONObject.optString(m608(82, 3, (char) 0).intern()));
                                m608(85, 11, (char) 58307).intern();
                                C0044.m108();
                                concurrentLinkedQueue.add(c0087);
                                i2++;
                                int i6 = f538 + 93;
                                f537 = i6 % 128;
                                int i7 = i6 % 2;
                            }
                        }
                        z = false;
                        c0087.m280(z);
                        optJSONArray = optJSONObject.optJSONArray(m608(64, 2, (char) 0).intern());
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        i = 0;
                        while (i < optJSONArray.length()) {
                        }
                        c0087.m272(hashMap2);
                        c0087.m283(optJSONObject.optString(m608(66, 1, (char) 0).intern()));
                        c0087.m268(!(optJSONObject.optInt(m608(67, 2, (char) 0).intern()) != 1));
                        c0087.m292(optJSONObject.optInt(m608(69, 1, (char) 0).intern()) != 1 ? false : true);
                        c0087.m266(optJSONObject.optInt(m608(70, 3, (char) 63650).intern()));
                        c0087.m270(optJSONObject.optInt(m608(73, 4, (char) 39097).intern()));
                        c0087.m295(optJSONObject.optString(m608(77, 5, (char) 65204).intern()));
                        c0087.m274(optJSONObject.optString(m608(82, 3, (char) 0).intern()));
                        m608(85, 11, (char) 58307).intern();
                        C0044.m108();
                        concurrentLinkedQueue.add(c0087);
                        i2++;
                        int i62 = f538 + 93;
                        f537 = i62 % 128;
                        int i72 = i62 % 2;
                    } else {
                        m608 = m608(54, 4, (char) 1854);
                    }
                }
                c0087.m271(m608.intern());
                if (optJSONObject.optInt(m608(62, 2, (char) 15068).intern()) == 1) {
                }
                z = false;
                c0087.m280(z);
                optJSONArray = optJSONObject.optJSONArray(m608(64, 2, (char) 0).intern());
                HashMap<String, String> hashMap22 = new HashMap<>();
                i = 0;
                while (i < optJSONArray.length()) {
                }
                c0087.m272(hashMap22);
                c0087.m283(optJSONObject.optString(m608(66, 1, (char) 0).intern()));
                c0087.m268(!(optJSONObject.optInt(m608(67, 2, (char) 0).intern()) != 1));
                c0087.m292(optJSONObject.optInt(m608(69, 1, (char) 0).intern()) != 1 ? false : true);
                c0087.m266(optJSONObject.optInt(m608(70, 3, (char) 63650).intern()));
                c0087.m270(optJSONObject.optInt(m608(73, 4, (char) 39097).intern()));
                c0087.m295(optJSONObject.optString(m608(77, 5, (char) 65204).intern()));
                c0087.m274(optJSONObject.optString(m608(82, 3, (char) 0).intern()));
                m608(85, 11, (char) 58307).intern();
                C0044.m108();
                concurrentLinkedQueue.add(c0087);
                i2++;
                int i622 = f538 + 93;
                f537 = i622 % 128;
                int i722 = i622 % 2;
            } catch (Exception unused) {
                m608(96, 39, (char) 0).intern();
                C0044.m109();
            }
        }
        return concurrentLinkedQueue;
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static Set<String> m614(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            int i = f538 + 123;
            f537 = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            while (true) {
                if ((i3 < jSONArray.length() ? '$' : '.') == '.') {
                    break;
                }
                int i4 = f537 + 75;
                f538 = i4 % 128;
                if ((i4 % 2 == 0 ? (char) 30 : '$') != '$') {
                    String optString = jSONArray.optString(i3);
                    m608(27415, 110, (char) 37285).intern();
                    C0044.m108();
                    hashSet.add(optString);
                    i3 += 57;
                } else {
                    String optString2 = jSONArray.optString(i3);
                    m608(390, 7, (char) 37285).intern();
                    C0044.m108();
                    hashSet.add(optString2);
                    i3++;
                }
            }
        }
        int i5 = f538 + 1;
        f537 = i5 % 128;
        if (i5 % 2 != 0) {
        }
        return hashSet;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static C0109 m615(String str) {
        JSONObject jSONObject;
        C0109 c0109;
        int i = f538 + 27;
        f537 = i % 128;
        C0109 c01092 = null;
        try {
            if (!(i % 2 != 0)) {
                m608(228, 10, (char) 58530).intern();
                C0044.m108();
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
            } else {
                m608(9395, 123, (char) 58530).intern();
                C0044.m108();
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
            }
            jSONObject = new JSONObject(str);
            c0109 = new C0109();
        } catch (Exception unused) {
        }
        try {
            c0109.m399(m610(jSONObject.optJSONArray(m608(238, 5, (char) 9205).intern())));
            c0109.m397(m616(jSONObject.optJSONArray(m608(243, 6, (char) 0).intern())));
            c0109.m395(m609(jSONObject.optJSONArray(m608(249, 4, (char) 0).intern())));
            c0109.m401(m611(jSONObject.optJSONArray(m608(253, 3, (char) 0).intern())));
            c0109.m402(m614(jSONObject.optJSONArray(m608(256, 3, (char) 42758).intern())));
            int i2 = f538 + 53;
            f537 = i2 % 128;
            int i3 = i2 % 2;
            return c0109;
        } catch (Exception unused2) {
            c01092 = c0109;
            m608(259, 31, (char) 17548).intern();
            C0044.m109();
            return c01092;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Map<String, String[]> m616(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray != null) {
            int i = f537 + 43;
            f538 = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            while (true) {
                if ((i3 < jSONArray.length() ? (char) 3 : (char) 20) != 3) {
                    break;
                }
                int i4 = f538 + 27;
                f537 = i4 % 128;
                int i5 = i4 % 2;
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                String[] split = optJSONObject.optString(m608(331, 7, (char) 52681).intern()).split(m608(338, 1, (char) 0).intern());
                String[] strArr = {optJSONObject.optString(m608(339, 4, (char) 45736).intern()), optJSONObject.getString(m608(343, 4, (char) 2277).intern())};
                int length = split.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        String str = split[i6];
                        m608(347, 7, (char) 0).intern();
                        m608(152, 1, (char) 0).intern();
                        Arrays.toString(strArr);
                        C0044.m108();
                        hashMap.put(str, strArr);
                        i6++;
                    }
                }
                i3++;
                int i7 = f537 + 53;
                f538 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return hashMap;
    }
}
