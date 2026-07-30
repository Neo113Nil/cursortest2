package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum xt {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF46("ISO8859_2", "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF61("ISO8859_3", "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    EF75("ISO8859_4", "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    EF89("ISO8859_5", "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    EF104("ISO8859_6", "ISO-8859-6"),
    /* JADX INFO: Fake field, exist only in values array */
    EF119("ISO8859_7", "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    EF134("ISO8859_8", "ISO-8859-8"),
    /* JADX INFO: Fake field, exist only in values array */
    EF149("ISO8859_9", "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    EF164("ISO8859_10", "ISO-8859-10"),
    /* JADX INFO: Fake field, exist only in values array */
    EF179("ISO8859_11", "ISO-8859-11"),
    /* JADX INFO: Fake field, exist only in values array */
    EF198("ISO8859_13", "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    EF217("ISO8859_14", "ISO-8859-14"),
    /* JADX INFO: Fake field, exist only in values array */
    EF236("ISO8859_15", "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    EF255("ISO8859_16", "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    EF274("SJIS", "Shift_JIS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF293("Cp1250", "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    EF312("Cp1251", "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    EF331("Cp1252", "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    EF350("Cp1256", "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    EF371("UnicodeBigUnmarked", "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    EF390("UTF8", "UTF-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new int[]{27, 170}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    Big5(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF458("GB18030", "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF477("EUC_KR", "EUC-KR");

    public static final HashMap o = new HashMap();
    public static final HashMap p = new HashMap();
    public final int[] m;
    public final String[] n;

    static {
        for (xt xtVar : values()) {
            for (int i : xtVar.m) {
                o.put(Integer.valueOf(i), xtVar);
            }
            p.put(xtVar.name(), xtVar);
            for (String str : xtVar.n) {
                p.put(str, xtVar);
            }
        }
    }

    xt(String str, String... strArr) {
        this.m = new int[]{r2};
        this.n = strArr;
    }

    xt(int[] iArr, String... strArr) {
        this.m = iArr;
        this.n = strArr;
    }
}
