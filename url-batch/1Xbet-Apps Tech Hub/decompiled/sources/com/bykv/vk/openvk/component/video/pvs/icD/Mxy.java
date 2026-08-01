package com.bykv.vk.openvk.component.video.pvs.icD;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public class Mxy {
    public final List<icD> icD;
    public final vG pvs;
    public final pvs vG;

    public Mxy(vG vGVar, List<icD> list, pvs pvsVar) {
        this.pvs = vGVar;
        this.icD = list;
        this.vG = pvsVar;
    }

    public static Mxy pvs(InputStream inputStream) throws IOException, Jd {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs));
        ArrayList arrayList = new ArrayList();
        vG vGVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (vGVar == null) {
                vGVar = vG.pvs(trim);
            } else {
                arrayList.add(icD.pvs(trim));
            }
        }
        if (vGVar == null) {
            throw new Jd("request line is null");
        }
        return new Mxy(vGVar, arrayList, pvs.pvs(vGVar, arrayList));
    }

    /* compiled from: Request.java */
    static final class vG {
        final String icD;
        final String pvs;
        final String vG;

        private vG(String str, String str2, String str3) {
            this.pvs = str;
            this.icD = str2;
            this.vG = str3;
        }

        static vG pvs(String str) throws Jd {
            int indexOf = str.indexOf(32);
            if (indexOf == -1) {
                throw new Jd("request line format error, line: ".concat(String.valueOf(str)));
            }
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf <= indexOf) {
                throw new Jd("request line format error, line: ".concat(String.valueOf(str)));
            }
            String trim = str.substring(0, indexOf).trim();
            String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
            String trim3 = str.substring(lastIndexOf + 1).trim();
            if (trim.length() == 0 || trim2.length() == 0 || trim3.length() == 0) {
                throw new Jd("request line format error, line: ".concat(String.valueOf(str)));
            }
            return new vG(trim, trim2, trim3);
        }

        public String toString() {
            return "RequestLine{method='" + this.pvs + "', path='" + this.icD + "', version='" + this.vG + "'}";
        }
    }

    /* compiled from: Request.java */
    public static final class icD {
        public final String icD;
        public final String pvs;

        public icD(String str, String str2) {
            this.pvs = str;
            this.icD = str2;
        }

        static icD pvs(String str) throws Jd {
            int indexOf = str.indexOf(":");
            if (indexOf == -1) {
                throw new Jd("request header format error, header: ".concat(String.valueOf(str)));
            }
            String trim = str.substring(0, indexOf).trim();
            String trim2 = str.substring(indexOf + 1).trim();
            if (trim.length() == 0 || trim2.length() == 0) {
                throw new Jd("request header format error, header: ".concat(String.valueOf(str)));
            }
            return new icD(trim, trim2);
        }

        public String toString() {
            return "Header{name='" + this.pvs + "', value='" + this.icD + "'}";
        }
    }

    /* compiled from: Request.java */
    static final class pvs {
        final int Jd;
        final int NB;
        final String icD;
        final int pvs;
        final String sUS;
        final String vG;
        final List<String> yiw;

        private pvs(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.pvs = i;
            this.icD = str;
            this.vG = str2;
            this.Jd = i2;
            this.NB = i3;
            this.sUS = str3;
            this.yiw = list;
        }

        static pvs pvs(vG vGVar, List<icD> list) throws Jd {
            String str;
            int i;
            int i2;
            int indexOf = vGVar.icD.indexOf("?");
            if (indexOf == -1) {
                throw new Jd("path format error, path: " + vGVar.icD);
            }
            ArrayList arrayList = new ArrayList();
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i3 = 0;
            for (String str5 : vGVar.icD.substring(indexOf + 1).split("&")) {
                String[] split = str5.split("=");
                if (split.length == 2) {
                    if ("rk".equals(split[0])) {
                        str3 = Uri.decode(split[1]);
                    } else if ("k".equals(split[0])) {
                        str4 = Uri.decode(split[1]);
                    } else if (split[0].startsWith("u")) {
                        arrayList.add(Uri.decode(split[1]));
                    } else if ("f".equals(split[0]) && com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD(split[1]) == 1) {
                        i3 = 1;
                    }
                }
            }
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                throw new Jd("rawKey or key is empty, path: " + vGVar.icD);
            }
            if (list != null) {
                i2 = 0;
                int i4 = 0;
                for (icD icd : list) {
                    if (icd != null && HttpHeaders.RANGE.equalsIgnoreCase(icd.pvs)) {
                        int indexOf2 = icd.icD.indexOf("=");
                        if (indexOf2 == -1) {
                            throw new Jd("Range format error, Range: " + icd.icD);
                        }
                        if (!"bytes".equalsIgnoreCase(icd.icD.substring(0, indexOf2).trim())) {
                            throw new Jd("Range format error, Range: " + icd.icD);
                        }
                        String substring = icd.icD.substring(indexOf2 + 1);
                        if (substring.contains(",")) {
                            throw new Jd("Range format error, Range: " + icd.icD);
                        }
                        int indexOf3 = substring.indexOf("-");
                        if (indexOf3 == -1) {
                            throw new Jd("Range format error, Range: " + icd.icD);
                        }
                        String trim = substring.substring(0, indexOf3).trim();
                        String trim2 = substring.substring(indexOf3 + 1).trim();
                        try {
                            if (trim.length() > 0) {
                                i2 = Integer.parseInt(trim);
                            }
                            if (trim2.length() > 0 && i2 > (i4 = Integer.parseInt(trim2))) {
                                throw new Jd("Range format error, Range: " + icd.icD);
                            }
                            str2 = icd.icD;
                        } catch (NumberFormatException unused) {
                            throw new Jd("Range format error, Range: " + icd.icD);
                        }
                    }
                }
                i = i4;
                str = str2;
            } else {
                str = null;
                i = 0;
                i2 = 0;
            }
            if (arrayList.isEmpty()) {
                throw new Jd("no url found: path: " + vGVar.icD);
            }
            return new pvs(i3, str3, str4, i2, i, str, arrayList);
        }

        public String toString() {
            return "Extra{flag=" + this.pvs + ", rawKey='" + this.icD + "', key='" + this.vG + "', from=" + this.Jd + ", to=" + this.NB + ", urls=" + this.yiw + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static String pvs(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = pvs(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    private static String pvs(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk=").append(Uri.encode(str));
        sb.append("&k=").append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&u").append(i).append("=").append(Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public String toString() {
        return "Request{requestLine=" + this.pvs + ", headers=" + this.icD + ", extra=" + this.vG + AbstractJsonLexerKt.END_OBJ;
    }

    /* compiled from: Request.java */
    static final class Jd extends Exception {
        Jd(String str) {
            super(str);
        }
    }
}
