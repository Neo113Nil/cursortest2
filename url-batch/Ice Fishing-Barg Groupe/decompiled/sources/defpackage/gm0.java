package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gm0 {
    public static final fm0 Companion = new fm0();
    public final String PxuCJdSBwIXG;
    public final String RAsUl2FVSrh6;
    public final String TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final List a92UlCVFR9N8;
    public final int e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;
    public final String rtx2ld2ELZv4;

    public gm0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = str3;
        this.Y1f8riQaR6yg = str4;
        this.e9gEMXR7LXtO = i;
        this.a92UlCVFR9N8 = arrayList;
        this.RAsUl2FVSrh6 = str5;
        this.rtx2ld2ELZv4 = str6;
    }

    public final String PxuCJdSBwIXG() {
        if (this.TSizfFm2Yiuu.length() == 0) {
            return "";
        }
        int length = this.PxuCJdSBwIXG.length() + 3;
        String str = this.rtx2ld2ELZv4;
        return str.substring(ia2.rxipThha848g(str, ':', length, 4) + 1, ia2.rxipThha848g(str, '@', 0, 6));
    }

    public final URI RAsUl2FVSrh6() {
        String substring;
        String str;
        em0 em0Var = new em0();
        String str2 = this.PxuCJdSBwIXG;
        em0Var.PxuCJdSBwIXG = str2;
        em0Var.lS5Rgt96tfkO = e9gEMXR7LXtO();
        em0Var.TSizfFm2Yiuu = PxuCJdSBwIXG();
        em0Var.Y1f8riQaR6yg = this.Y1f8riQaR6yg;
        Companion.getClass();
        int PxuCJdSBwIXG = fm0.PxuCJdSBwIXG(str2);
        int i = this.e9gEMXR7LXtO;
        if (i == PxuCJdSBwIXG) {
            i = -1;
        }
        em0Var.e9gEMXR7LXtO = i;
        ArrayList arrayList = em0Var.a92UlCVFR9N8;
        arrayList.clear();
        arrayList.addAll(TSizfFm2Yiuu());
        String Y1f8riQaR6yg = Y1f8riQaR6yg();
        em0Var.RAsUl2FVSrh6 = Y1f8riQaR6yg != null ? em0.TSizfFm2Yiuu(mm2.pnx5pC0XzaCw(Y1f8riQaR6yg, 0, 0, " \"'<>#", 83)) : null;
        if (this.RAsUl2FVSrh6 == null) {
            substring = null;
        } else {
            String str3 = this.rtx2ld2ELZv4;
            substring = str3.substring(ia2.rxipThha848g(str3, '#', 0, 6) + 1);
        }
        em0Var.rtx2ld2ELZv4 = substring;
        String str4 = em0Var.Y1f8riQaR6yg;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str4).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        em0Var.Y1f8riQaR6yg = str;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, mm2.pnx5pC0XzaCw((String) arrayList.get(i2), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = em0Var.RAsUl2FVSrh6;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str5 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str5 != null ? mm2.pnx5pC0XzaCw(str5, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str6 = em0Var.rtx2ld2ELZv4;
        em0Var.rtx2ld2ELZv4 = str6 != null ? mm2.pnx5pC0XzaCw(str6, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String em0Var2 = em0Var.toString();
        try {
            return new URI(em0Var2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(em0Var2).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final ArrayList TSizfFm2Yiuu() {
        int length = this.PxuCJdSBwIXG.length() + 3;
        String str = this.rtx2ld2ELZv4;
        int rxipThha848g = ia2.rxipThha848g(str, '/', length, 4);
        int lS5Rgt96tfkO = kv2.lS5Rgt96tfkO(rxipThha848g, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (rxipThha848g < lS5Rgt96tfkO) {
            int i = rxipThha848g + 1;
            int TSizfFm2Yiuu = kv2.TSizfFm2Yiuu(str, '/', i, lS5Rgt96tfkO);
            arrayList.add(str.substring(i, TSizfFm2Yiuu));
            rxipThha848g = TSizfFm2Yiuu;
        }
        return arrayList;
    }

    public final String Y1f8riQaR6yg() {
        if (this.a92UlCVFR9N8 == null) {
            return null;
        }
        String str = this.rtx2ld2ELZv4;
        int rxipThha848g = ia2.rxipThha848g(str, '?', 0, 6) + 1;
        return str.substring(rxipThha848g, kv2.TSizfFm2Yiuu(str, '#', rxipThha848g, str.length()));
    }

    public final String a92UlCVFR9N8() {
        em0 em0Var;
        try {
            em0Var = new em0();
            em0Var.lS5Rgt96tfkO(this, "/...");
        } catch (IllegalArgumentException unused) {
            em0Var = null;
        }
        em0Var.getClass();
        em0Var.lS5Rgt96tfkO = mm2.pnx5pC0XzaCw("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        em0Var.TSizfFm2Yiuu = mm2.pnx5pC0XzaCw("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return em0Var.PxuCJdSBwIXG().rtx2ld2ELZv4;
    }

    public final String e9gEMXR7LXtO() {
        if (this.lS5Rgt96tfkO.length() == 0) {
            return "";
        }
        int length = this.PxuCJdSBwIXG.length() + 3;
        String str = this.rtx2ld2ELZv4;
        return str.substring(length, kv2.lS5Rgt96tfkO(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gm0) && ((gm0) obj).rtx2ld2ELZv4.equals(this.rtx2ld2ELZv4);
    }

    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    public final String lS5Rgt96tfkO() {
        int length = this.PxuCJdSBwIXG.length() + 3;
        String str = this.rtx2ld2ELZv4;
        int rxipThha848g = ia2.rxipThha848g(str, '/', length, 4);
        return str.substring(rxipThha848g, kv2.lS5Rgt96tfkO(rxipThha848g, str.length(), str, "?#"));
    }

    public final String toString() {
        return this.rtx2ld2ELZv4;
    }
}
