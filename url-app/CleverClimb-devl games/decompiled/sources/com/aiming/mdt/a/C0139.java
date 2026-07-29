package com.aiming.mdt.a;

import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0284;
import com.aiming.mdt.utils.Constants;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʼʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0139 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String[] f459 = {Constants.KEY_CACHE_CONTROL, Constants.KEY_CONTENT_TYPE, Constants.KEY_ETAG, Constants.KEY_LAST_MODIFIED, Constants.KEY_LOCATION};

    /* renamed from: com.aiming.mdt.a.ʼʿˈˉ$ʻ, reason: contains not printable characters */
    static class C0140 implements Comparator<File> {
        private C0140() {
        }

        /* synthetic */ C0140(byte b2) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            return file3.lastModified() == file4.lastModified() ? 0 : -1;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static File m526(Context context) {
        File cacheDir = context.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(cacheDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("adt");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m527(Context context, String str) {
        if (context == null) {
            try {
                if (C0226.m829() == null) {
                    return false;
                }
                context = C0226.m829();
            } catch (Exception e) {
                C0282.m972("Cache", e);
                C0076.m232().m236(e);
                return false;
            }
        }
        File m526 = m526(context);
        String m978 = C0284.m978(str);
        File file = new File(m526, m978);
        File file2 = new File(m526, m978.concat(Constants.FILE_HEADER_SUFFIX));
        if (file2.exists() && file.exists()) {
            if (file2.exists()) {
                file2.setLastModified(System.currentTimeMillis());
            }
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis());
            }
            String m534 = m534(file2, Constants.KEY_REQUEST_TIME);
            if ((TextUtils.isEmpty(m534) ? 0L : System.currentTimeMillis() - Long.valueOf(m534).longValue()) < m532(file2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m528(Context context, String str, C0052 c0052) {
        if (context == null) {
            return false;
        }
        try {
            boolean m533 = m533(context, str, c0052);
            if (m533) {
                m536(context, str, c0052);
            }
            return m533;
        } catch (Exception e) {
            C0282.m972("Cache", e);
            C0076.m232().m236(e);
            return false;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m529(File file, File file2, C0052 c0052, int i) {
        BufferedInputStream mo517 = c0052.m163().mo517();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        C0226.m836(mo517, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            C0282.m972("IOUtil", e);
            C0076.m232().m236(e);
        }
        if (mo517 != null) {
            try {
                mo517.close();
            } catch (Exception e2) {
                C0282.m972("IOUtil", e2);
                C0076.m232().m236(e2);
            }
        }
        file.renameTo(file2);
        if (i <= 0) {
            if (file2.length() <= 0) {
                return false;
            }
        } else if (file2.length() != i) {
            return false;
        }
        return true;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static File m530(Context context, String str, String str2) {
        File m526 = m526(context);
        String m978 = C0284.m978(str);
        if (!TextUtils.isEmpty(str2)) {
            m978 = m978.concat(Constants.FILE_HEADER_SUFFIX);
        }
        File file = new File(m526, m978);
        StringBuilder sb = new StringBuilder("result:");
        sb.append(file.toString());
        C0282.m971(sb.toString());
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static void m531(Context context) {
        File[] listFiles = m526(context).listFiles();
        if (listFiles == null) {
            return;
        }
        Object[] objArr = 0;
        int i = 0;
        for (File file : listFiles) {
            i = (int) (i + file.length());
        }
        if (i > 104857600) {
            double length = listFiles.length;
            Double.isNaN(length);
            int i2 = (int) ((length * 0.4d) + 1.0d);
            Arrays.sort(listFiles, new C0140(objArr == true ? 1 : 0));
            for (int i3 = 0; i3 < i2; i3++) {
                listFiles[i3].delete();
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static long m532(File file) {
        String m534 = m534(file, Constants.KEY_CACHE_CONTROL);
        long j = 0;
        if (!TextUtils.isEmpty(m534) && m534.contains(Constants.KEY_MAX_AGE)) {
            for (String str : m534.split(",")) {
                if (str.contains(Constants.KEY_MAX_AGE)) {
                    j = Long.valueOf(str.split("=")[1]).longValue() * 1000;
                }
            }
        }
        if (j > 86400000) {
            return 86400000L;
        }
        if (j < 3600000) {
            return 3600000L;
        }
        return j;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m533(Context context, String str, C0052 c0052) {
        File file;
        File m526 = m526(context);
        String m978 = C0284.m978(str);
        File file2 = new File(m526, m978);
        if (file2.exists()) {
            file2.delete();
            file2 = new File(m526, m978);
        }
        File file3 = new File(m526, String.format("%scache", m978));
        String m410 = c0052.m165().m410("Content-Length");
        if (TextUtils.isEmpty(m410)) {
            m410 = "0";
        }
        int parseLong = (int) Long.parseLong(m410);
        if (parseLong <= 0) {
            if (file3.exists()) {
                file3.delete();
            }
            file = new File(m526, String.format("%scache", m978));
        } else {
            long j = parseLong;
            if (file3.length() == j) {
                file3.renameTo(file2);
                return file2.length() == j;
            }
            if (file3.exists()) {
                file3.delete();
            }
            file = new File(m526, String.format("%scache", m978));
        }
        return m529(file, file2, c0052, parseLong);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m534(File file, String str) {
        if (file != null && file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
        FileInputStream fileInputStream = (file == null || !file.exists()) ? null : new FileInputStream(file);
        if (fileInputStream == null) {
            return "";
        }
        String str2 = new String(C0226.m838(fileInputStream));
        return TextUtils.isEmpty(str2) ? "" : new JSONObject(str2.substring(str2.indexOf("{"), str2.lastIndexOf("}") + 1)).optString(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m535() {
        if (C0226.m829() == null) {
            return;
        }
        File cacheDir = C0226.m829().getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(cacheDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("adt");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        m531(C0226.m829());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m536(Context context, String str, C0052 c0052) {
        C0110 m165 = c0052.m165();
        if (m165 == null || m165.m538()) {
            return;
        }
        File m526 = m526(context);
        String concat = C0284.m978(str).concat(Constants.FILE_HEADER_SUFFIX);
        File file = new File(m526, concat);
        if (file.length() > 0) {
            file.delete();
            file = new File(m526, concat);
        }
        JSONObject jSONObject = new JSONObject();
        for (String str2 : f459) {
            if (m165.mo407(str2)) {
                jSONObject.put(str2, m165.m413(str2).get(0).split(";")[0].trim());
            }
        }
        jSONObject.put(Constants.KEY_REQUEST_TIME, String.valueOf(System.currentTimeMillis()));
        C0226.m837(jSONObject.toString().getBytes(Charset.forName(AudienceNetworkActivity.WEBVIEW_ENCODING)), file);
    }
}
