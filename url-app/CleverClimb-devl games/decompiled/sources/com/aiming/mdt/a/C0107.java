package com.aiming.mdt.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.Constants;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0107 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static final Pattern[] f306 = {Pattern.compile("<link.+href=['\"]([^'\"]+)['\"]", 2), Pattern.compile("\\s+src\\s*=\\s*['\"]([^'\"]+)['\"]", 2), Pattern.compile("url\\(['\"]?([^'\")]+)['\"]?\\)", 2)};

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Pattern f308 = Pattern.compile("nopreload=\"([^\"]+)\"", 2);

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Pattern f305 = Pattern.compile("http\\-equiv\\s*=\\s*\"Refresh\"\\s+content\\s*=\\s*\"\\d+;url=([^\"]+)\"", 2);

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final String[] f307 = {".jpg", ".jepg", ".png", ".webp", ".mp4", ".mp3", ".avi", ".rmvb", ".3gp", ".flv", ".ogg", ".wav", ".flac", ".ape"};

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Set<URI> m383(Context context, URI uri, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (m391(uri.toURL().toString())) {
            linkedHashSet.add(uri);
            return linkedHashSet;
        }
        if (TextUtils.isEmpty(str)) {
            return linkedHashSet;
        }
        String m388 = m388(context, uri.toURL().toString());
        if (!TextUtils.isEmpty(m388) && !TextUtils.equals(m388, uri.toString())) {
            StringBuilder sb = new StringBuilder("URI:");
            sb.append(uri.toString());
            C0282.m971(sb.toString());
            StringBuilder sb2 = new StringBuilder("locationURI:");
            sb2.append(m388);
            C0282.m971(sb2.toString());
            uri = new URI(m388);
        }
        HashSet hashSet = new HashSet();
        m384(uri, str, f308, hashSet, null);
        Pattern[] patternArr = f306;
        for (int i = 0; i < 3; i++) {
            m384(uri, str, patternArr[i], linkedHashSet, hashSet);
        }
        return linkedHashSet;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m384(URI uri, String str, Pattern pattern, Set<URI> set, Set<URI> set2) {
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            if (!TextUtils.isEmpty(group)) {
                String trim = group.trim();
                if (!trim.startsWith("data:") && !trim.startsWith("javascript:")) {
                    int indexOf = trim.indexOf(35);
                    if (indexOf != -1) {
                        trim = trim.substring(0, indexOf);
                    }
                    URL url = new URL(uri.toURL(), trim);
                    URI uri2 = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
                    if (set2 == null || !set2.contains(uri2)) {
                        set.add(uri2);
                    }
                }
            }
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static Set<URI> m385(Context context, String str, int i) {
        if (i > 5) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        File m199 = !C0139.m527(context, str) ? C0064.m199(str) : C0139.m530(context, str, null);
        if (m199 != null) {
            StringBuilder sb = new StringBuilder("file:");
            sb.append(m199.getName());
            C0282.m971(sb.toString());
            String m387 = m387(context, str);
            String m392 = m392(context, m387);
            if (!TextUtils.equals(m387, m392)) {
                hashSet.addAll(m385(context, m392, i + 1));
            }
            if (!TextUtils.isEmpty(m387)) {
                URI uri = new URI(m387);
                hashSet.add(uri);
                hashSet.addAll(m389(context, uri, m199));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:17:0x004b, B:19:0x0065, B:22:0x0078, B:23:0x0080, B:25:0x0086, B:27:0x0094, B:30:0x009b, B:33:0x00a5, B:35:0x00b5), top: B:16:0x004b, outer: #1 }] */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebResourceResponse m386(WebView webView, String str) {
        FileInputStream fileInputStream;
        try {
            C0282.m971(str);
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            File m530 = C0139.m530(webView.getContext(), str, Constants.FILE_HEADER_SUFFIX);
            if (m530.exists() && TextUtils.isEmpty(C0139.m534(m530, Constants.KEY_LOCATION)) && C0139.m527(webView.getContext(), str)) {
                StringBuilder sb = new StringBuilder("exist:");
                sb.append(str);
                C0282.m971(sb.toString());
                try {
                    String m534 = C0139.m534(C0139.m530(webView.getContext().getApplicationContext(), str, Constants.FILE_HEADER_SUFFIX), Constants.KEY_CONTENT_TYPE);
                    if (TextUtils.isEmpty(m534)) {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                        m534 = TextUtils.equals("js", fileExtensionFromUrl.toLowerCase()) ? "application/x-javascript" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    }
                    if (!TextUtils.isEmpty(m534)) {
                        File m5302 = C0139.m530(webView.getContext().getApplicationContext(), str, null);
                        if (m5302 != null && m5302.exists()) {
                            fileInputStream = new FileInputStream(m5302);
                            if (fileInputStream != null) {
                                return null;
                            }
                            WebResourceResponse webResourceResponse = new WebResourceResponse(m534, null, fileInputStream);
                            HashMap hashMap = new HashMap();
                            if (Build.VERSION.SDK_INT >= 21) {
                                hashMap.put("Access-Control-Allow-Origin", "*");
                                webResourceResponse.setResponseHeaders(hashMap);
                            }
                            return webResourceResponse;
                        }
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                    }
                } catch (Exception e) {
                    C0282.m972("ResUtil", e);
                    C0076.m232().m236(e);
                }
            }
        } catch (Exception e2) {
            C0282.m972("ResUtil", e2);
            C0076.m232().m236(e2);
        }
        return null;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m387(Context context, String str) {
        File m530;
        try {
            m530 = C0139.m530(context, str, Constants.FILE_HEADER_SUFFIX);
        } catch (Exception e) {
            C0282.m972("getHtmlRes error", e);
        }
        if (!m530.exists()) {
            return str;
        }
        String m534 = C0139.m534(m530, Constants.KEY_LOCATION);
        return !TextUtils.isEmpty(m534) ? m387(context, new URL(new URL(str), m534).toString()) : (C0139.m530(context, str, null).exists() && TextUtils.equals(C0139.m534(m530, Constants.KEY_CONTENT_TYPE), AudienceNetworkActivity.WEBVIEW_MIME_TYPE)) ? str : str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m388(Context context, String str) {
        try {
            File m530 = C0139.m530(context, str, Constants.FILE_HEADER_SUFFIX);
            if (!m530.exists()) {
                return "";
            }
            String m534 = C0139.m534(m530, Constants.KEY_LOCATION);
            return TextUtils.isEmpty(m534) ? str : m388(context, m534);
        } catch (Exception e) {
            C0282.m972("getRedirectUrl error", e);
            C0076.m232().m236(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:34:0x0008, B:37:0x000f, B:7:0x001c, B:8:0x0024, B:10:0x002a, B:13:0x0040, B:24:0x004e, B:19:0x005d, B:15:0x0061, B:18:0x0084), top: B:33:0x0008 }] */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Set<URI> m389(Context context, URI uri, File file) {
        FileInputStream fileInputStream;
        Set<URI> m389;
        HashSet hashSet = new HashSet();
        if (file != null) {
            try {
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    if (fileInputStream != null) {
                        return hashSet;
                    }
                    for (URI uri2 : m393(context, uri, fileInputStream)) {
                        if (uri2.toURL().getFile().endsWith("css")) {
                            if (C0139.m527(context, uri2.toURL().toString())) {
                                hashSet.add(uri2);
                                m389 = m389(context, uri2, C0139.m530(context, uri2.toString(), null));
                            } else {
                                StringBuilder sb = new StringBuilder("download css file URI:");
                                sb.append(uri2.toString());
                                C0282.m971(sb.toString());
                                File m199 = C0064.m199(uri2.toURL().toString());
                                if (m199 != null) {
                                    hashSet.add(uri2);
                                    m389 = m389(context, uri2, m199);
                                }
                            }
                            hashSet.addAll(m389);
                        }
                    }
                    return hashSet;
                }
            } catch (Exception e) {
                C0282.m972("getHtmlRes error", e);
                return hashSet;
            }
        }
        fileInputStream = null;
        if (fileInputStream != null) {
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m390(Context context, List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                Set<URI> m385 = m385(context, str, 1);
                StringBuilder sb = new StringBuilder("resSet:");
                sb.append(m385.toString());
                C0282.m971(sb.toString());
                for (URI uri : m385) {
                    if (C0139.m527(context, uri.toString())) {
                        FileInputStream fileInputStream = null;
                        File m530 = C0139.m530(context, uri.toString(), null);
                        if (m530 != null && m530.exists()) {
                            fileInputStream = new FileInputStream(m530);
                        }
                        if (fileInputStream != null) {
                            Set<URI> m393 = m393(context, uri, fileInputStream);
                            StringBuilder sb2 = new StringBuilder("res uri is : ");
                            sb2.append(uri.toURL().toString());
                            sb2.append(" s:");
                            sb2.append(m393.toString());
                            C0282.m971(sb2.toString());
                            hashSet.addAll(m393);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e) {
                                    C0282.m972("IOUtil", e);
                                    C0076.m232().m236(e);
                                }
                            }
                        }
                    }
                    hashSet.add(uri);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        StringBuilder sb3 = new StringBuilder("resSet:");
        sb3.append(hashSet.toString());
        C0282.m971(sb3.toString());
        return C0064.m198(hashSet);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m391(String str) {
        String file = new URL(str).getFile();
        String[] strArr = f307;
        boolean z = false;
        for (int i = 0; i < 14; i++) {
            if (file.endsWith(strArr[i])) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m392(Context context, String str) {
        Matcher matcher;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    File m530 = C0139.m530(context, str, null);
                    if (m530 != null && m530.exists()) {
                        fileInputStream = new FileInputStream(m530);
                    }
                    matcher = f305.matcher(new String(C0226.m838(fileInputStream), AudienceNetworkActivity.WEBVIEW_ENCODING));
                } catch (Exception e) {
                    C0282.m972("getRefreshPage error", e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                }
            } catch (Exception e2) {
                C0282.m972("IOUtil", e2);
                C0076.m232().m236(e2);
            }
            if (!matcher.find()) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return str;
            }
            String group = matcher.group(1);
            if (group.startsWith("data:")) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e3) {
                        C0282.m972("IOUtil", e3);
                        C0076.m232().m236(e3);
                    }
                }
                return str;
            }
            int indexOf = group.indexOf(35);
            if (indexOf != -1) {
                group = group.substring(0, indexOf);
            }
            URL url = new URL(new URL(str), group);
            StringBuilder sb = new StringBuilder("u:");
            sb.append(url.toString());
            C0282.m971(sb.toString());
            String obj = url.toString();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e4) {
                    C0282.m972("IOUtil", e4);
                    C0076.m232().m236(e4);
                }
            }
            return obj;
            return str;
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e5) {
                    C0282.m972("IOUtil", e5);
                    C0076.m232().m236(e5);
                }
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Set<URI> m393(Context context, URI uri, InputStream inputStream) {
        return m383(context, uri, new String(C0226.m838(inputStream), Charset.forName("UTF-8")));
    }
}
