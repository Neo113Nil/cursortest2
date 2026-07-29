package com.aiming.mdt.a;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0189 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f659 = 1;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static long f660 = -6395234565214678174L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f661;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Pattern f662 = Pattern.compile(m718("퓃퓫\ua7ee땄랷\uf4b3Ꮹ饆䶸呱\ue79a\u0a37侠\u1a9d剙\ud8ef㱞켯鳨꽽\ue2f9経켤").intern());

    /* renamed from: ʼ, reason: contains not printable characters */
    private List<C0190> f663;

    /* renamed from: com.aiming.mdt.a.ʿˉ$ʽ, reason: contains not printable characters */
    public static class C0190 {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public String f664;

        /* renamed from: ʽ, reason: contains not printable characters */
        public String f665;

        public C0190(String str, Object obj) {
            this.f665 = str;
            this.f664 = obj == null ? "" : obj.toString();
        }
    }

    static {
        int i = f661 + 97;
        f659 = i % 128;
        if (i % 2 != 0) {
        }
    }

    public C0189() {
        this.f663 = new ArrayList();
    }

    private C0189(List<C0190> list) {
        this.f663 = list;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m716(List<C0190> list, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (C0190 c0190 : list) {
                int i = f659 + 91;
                f661 = i % 128;
                int i2 = i % 2;
                String encode = URLEncoder.encode(c0190.f665, str);
                String encode2 = URLEncoder.encode(c0190.f664, str);
                if ((sb.length() > 0 ? (char) 21 : 'F') == 21) {
                    sb.append('&');
                }
                sb.append(encode);
                if ((encode2 != null ? 'a' : '$') != '$') {
                    sb.append('=');
                    sb.append(encode2);
                    int i3 = f661 + 81;
                    f659 = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static List<C0190> m717(String str) {
        String str2;
        String[] split = f662.matcher(str).replaceAll(m718("乚乿\uf71f뵫ꑏᮚ料").intern()).split(m718("‒‴ឆ뮔㰜").intern(), -1);
        ArrayList arrayList = new ArrayList(split.length);
        int length = split.length;
        int i = f659 + 65;
        f661 = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if ((i3 < length ? (char) 14 : ',') == ',') {
                return arrayList;
            }
            int i4 = f659 + 3;
            f661 = i4 % 128;
            int i5 = i4 % 2;
            String str3 = split[i3];
            int indexOf = str3.indexOf(61);
            String str4 = null;
            if (!(indexOf == -1)) {
                String substring = str3.substring(0, indexOf);
                str2 = str3.substring(indexOf + 1);
                str3 = substring;
            } else {
                str2 = null;
            }
            try {
                String decode = URLDecoder.decode(str3, m718("ꄇꅒ卣诏ԕUⵍ\uece2＞").intern());
                if (str2 != null) {
                    str4 = URLDecoder.decode(str2, m718("ꄇꅒ卣诏ԕUⵍ\uece2＞").intern());
                }
                arrayList.add(new C0190(decode, str4));
                int i6 = f659 + 111;
                f661 = i6 % 128;
                int i7 = i6 % 2;
                i3++;
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m718(String str) {
        int i = f661 + 107;
        f659 = i % 128;
        int i2 = i % 2;
        char[] m724 = C0192.m724(f660, str.toCharArray());
        int i3 = 4;
        while (true) {
            if (i3 >= m724.length) {
                return new String(m724, 4, m724.length - 4);
            }
            int i4 = f659 + 23;
            f661 = i4 % 128;
            if (i4 % 2 != 0) {
                m724[i3] = (char) ((m724[i3] | m724[i3 >>> 2]) / ((i3 >> 3) * f660));
                i3 += 2;
            } else {
                m724[i3] = (char) ((m724[i3] ^ m724[i3 % 4]) ^ ((i3 - 4) * f660));
                i3++;
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static C0189 m719(String str) {
        C0189 c0189 = new C0189(m717(str));
        int i = f661 + 113;
        f659 = i % 128;
        if ((i % 2 == 0 ? '1' : 'M') != 'M') {
        }
        return c0189;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final String m720() {
        int i = f661 + 85;
        f659 = i % 128;
        if (i % 2 == 0) {
        }
        return m716(this.f663, m718("ꄇꅒ卣诏ԕUⵍ\uece2＞").intern());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final C0189 m721(String str, Object obj) {
        this.f663.add(new C0190(str, obj));
        int i = f661 + 111;
        f659 = i % 128;
        if (!(i % 2 != 0)) {
        }
        return this;
    }
}
