package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeDetector.java */
/* loaded from: classes.dex */
public class bNS {
    private static volatile bNS vG;
    private Context Jd;
    private volatile boolean icD = false;
    private Map<String, String> pvs;

    public static String pvs(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return pvs(context).pvs(str);
    }

    static bNS pvs(Context context) {
        if (vG == null) {
            synchronized (bNS.class) {
                if (vG == null) {
                    vG = new bNS(context);
                }
            }
        }
        return vG;
    }

    private bNS(Context context) {
        if (context != null && this.Jd == null) {
            this.Jd = context.getApplicationContext();
            pvs();
        }
        this.Jd = context;
    }

    public final String pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String Jd = Jd(str);
        if (TextUtils.isEmpty(Jd)) {
            return null;
        }
        return icD(Jd);
    }

    private static String icD(String str) {
        String substring;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String lowerCase = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
        if (!vG(lowerCase)) {
            return null;
        }
        int i = indexOf + 1;
        if (indexOf2 < 0) {
            substring = str.substring(i);
        } else {
            substring = str.substring(i, indexOf2);
        }
        String lowerCase2 = substring.trim().toLowerCase(Locale.ENGLISH);
        if (!vG(lowerCase2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(lowerCase.length() + lowerCase2.length() + 1);
        sb.append(lowerCase);
        sb.append('/');
        sb.append(lowerCase2);
        return sb.toString();
    }

    private static boolean pvs(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    private static boolean vG(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!pvs(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private String Jd(String str) {
        String str2;
        String NB = NB(str);
        if (NB.isEmpty()) {
            return null;
        }
        pvs();
        Map<String, String> map = this.pvs;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.pvs.get(NB);
            if (str2 == null) {
                NB = NB(NB);
            }
            if (str2 != null) {
                break;
            }
        } while (!NB.isEmpty());
        return str2;
    }

    private static String NB(String str) {
        int indexOf;
        return (str == null || str.isEmpty() || (indexOf = str.indexOf(46)) < 0 || indexOf >= str.length() + (-1)) ? "" : str.substring(indexOf + 1);
    }

    private void pvs() {
        if (this.Jd == null || this.icD) {
            return;
        }
        synchronized (this) {
            if (!this.icD) {
                List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.bNS.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                    public List<String> run() {
                        BufferedReader bufferedReader;
                        InputStream inputStream = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            InputStream open = bNS.this.Jd.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(open));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        if (!TextUtils.isEmpty(readLine)) {
                                            arrayList.add(readLine);
                                        }
                                    } catch (Throwable unused) {
                                        inputStream = open;
                                        try {
                                            List<String> emptyList = Collections.emptyList();
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            return emptyList;
                                        } finally {
                                        }
                                    }
                                }
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused5) {
                                }
                                return arrayList;
                            } catch (Throwable unused6) {
                                bufferedReader = null;
                            }
                        } catch (Throwable unused7) {
                            bufferedReader = null;
                        }
                    }
                });
                this.pvs = new HashMap(list.size());
                String str = "";
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = str + ((String) it.next());
                    if (str2.endsWith("\\")) {
                        str = str2.substring(0, str2.length() - 1);
                    } else {
                        sUS(str2);
                        str = "";
                    }
                }
                if (!str.isEmpty()) {
                    sUS(str);
                }
                this.icD = true;
            }
        }
    }

    private void sUS(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return;
        }
        if (trim.charAt(0) == '#') {
            return;
        }
        String replaceAll = trim.replaceAll("\\s*#.*", "");
        if (replaceAll.indexOf(61) > 0) {
            Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(replaceAll);
            if (matcher.find()) {
                String substring = matcher.group().substring(5);
                if (substring.charAt(0) == '\"') {
                    substring = substring.substring(1, substring.length() - 1);
                }
                Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(replaceAll);
                if (matcher2.find()) {
                    String substring2 = matcher2.group().substring(5);
                    if (substring2.charAt(0) == '\"') {
                        substring2 = substring2.substring(1, substring2.length() - 1);
                    }
                    for (String str2 : substring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                        pvs(str2, substring);
                    }
                    return;
                }
                return;
            }
            return;
        }
        String[] split = replaceAll.split("\\s+");
        for (int i = 1; i < split.length; i++) {
            pvs(split[i], split[0]);
        }
    }

    private void pvs(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.pvs.containsKey(str)) {
            return;
        }
        this.pvs.put(str, str2);
    }
}
