package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: com.aiming.mdt.a.ʼʽʾʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0110 extends C0142<String, String> {
    static {
        TimeZone.getTimeZone("GMT");
    }

    public C0110() {
        super(new TreeMap(new C0104()));
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m404(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.toLowerCase(Locale.ENGLISH).split("-");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            String substring = str2.substring(0, 1);
            String substring2 = str2.substring(1, str2.length());
            sb.append(substring.toUpperCase(Locale.ENGLISH));
            sb.append(substring2);
            sb.append("-");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.lastIndexOf("-"));
        }
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static String m405(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str3;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf > 0 && str2.equalsIgnoreCase(nextToken.substring(0, indexOf).trim())) {
                return nextToken.substring(indexOf + 1).trim();
            }
        }
        return str3;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Map<String, String> m406(C0110 c0110) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : c0110.m539()) {
            linkedHashMap.put(entry.getKey(), TextUtils.join("; ", entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // com.aiming.mdt.a.C0142
    /* renamed from: ʻ, reason: avoid collision after fix types in other method and contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean mo407(String str) {
        return super.mo407((C0110) m404(str));
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final String m409() {
        return (String) super.mo412((C0110) m404(Constants.KEY_CONTENT_TYPE));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final String m410(String str) {
        return (String) super.mo412((C0110) m404(str));
    }

    @Override // com.aiming.mdt.a.C0142
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final /* synthetic */ void mo411(String str, List<String> list) {
        String str2 = str;
        if (TextUtils.isEmpty(str2) || list.isEmpty()) {
            return;
        }
        super.mo411(m404(str2), list);
    }

    @Override // com.aiming.mdt.a.C0142
    /* renamed from: ʼ, reason: contains not printable characters */
    public final /* synthetic */ String mo412(String str) {
        return (String) super.mo412((C0110) m404(str));
    }

    /* renamed from: ʼ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final List<String> m413(String str) {
        return super.mo416(m404(str));
    }

    @Override // com.aiming.mdt.a.C0142
    /* renamed from: ʼ, reason: contains not printable characters */
    public final /* synthetic */ void mo414(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return;
        }
        super.mo414((C0110) m404(str3), str4);
    }

    /* renamed from: ʼ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void m415(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        super.mo414((C0110) m404(str), str2);
    }

    @Override // com.aiming.mdt.a.C0142
    /* renamed from: ʽ, reason: contains not printable characters */
    public final /* synthetic */ List<String> mo416(String str) {
        return super.mo416(m404(str));
    }

    @Override // com.aiming.mdt.a.C0142
    /* renamed from: ʽ, reason: contains not printable characters */
    public final /* synthetic */ void mo417(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return;
        }
        super.mo417((C0110) m404(str3), str4);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m418(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        super.mo411(m404(str), list);
    }
}
