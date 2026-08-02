package defpackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum jpc {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(new int[]{28}, new String[0]),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private final int[] E;
    private final String[] F;
    private static final Map C = new HashMap();
    public static final Map B = new HashMap();

    static {
        for (jpc jpcVar : values()) {
            if (Charset.isSupported(jpcVar.name())) {
                for (int i : jpcVar.E) {
                    C.put(Integer.valueOf(i), jpcVar);
                }
                B.put(jpcVar.name(), jpcVar);
                for (String str : jpcVar.F) {
                    B.put(str, jpcVar);
                }
            }
        }
    }

    jpc(int i, String... strArr) {
        this.E = new int[]{i};
        this.F = strArr;
    }

    public static jpc b(Charset charset) {
        return (jpc) B.get(charset.name());
    }

    public final int a() {
        return this.E[0];
    }

    jpc(int[] iArr, String... strArr) {
        this.E = iArr;
        this.F = strArr;
    }
}
