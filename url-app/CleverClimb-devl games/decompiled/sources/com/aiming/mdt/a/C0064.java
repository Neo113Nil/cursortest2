package com.aiming.mdt.a;

import android.app.Application;
import android.text.TextUtils;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.Constants;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Set;

/* renamed from: com.aiming.mdt.a.ʻʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0064 {
    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static void m197(String str) {
        File m530 = C0139.m530(C0226.m829(), str, null);
        if (m530.exists()) {
            StringBuilder sb = new StringBuilder("delete content file when error : ");
            sb.append(m530.delete());
            C0282.m973("ResDownLoader", sb.toString());
        }
        File m5302 = C0139.m530(C0226.m829(), str, Constants.FILE_HEADER_SUFFIX);
        if (m5302.exists()) {
            StringBuilder sb2 = new StringBuilder("delete header file when error : ");
            sb2.append(m5302.delete());
            C0282.m973("ResDownLoader", sb2.toString());
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static boolean m198(Set<URI> set) {
        int size = set.size();
        int i = 0;
        for (URI uri : set) {
            if (!C0139.m527(C0226.m829(), uri.toURL().toString()) && m199(uri.toURL().toString()) == null) {
                i++;
            }
        }
        return i <= size / 2;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    static File m199(String str) {
        Throwable th;
        C0052 c0052;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C0172.C0175 m667 = C0026.m22().m672(str).m671(30000).m667(600000);
            Application m829 = C0226.m829();
            C0110 m826 = C0226.m826();
            File m530 = C0139.m530(m829, str, Constants.FILE_HEADER_SUFFIX);
            if (m530.exists()) {
                String m534 = C0139.m534(m530, Constants.KEY_ETAG);
                if (TextUtils.isEmpty(m534)) {
                    String m5342 = C0139.m534(m530, Constants.KEY_LAST_MODIFIED);
                    if (!TextUtils.isEmpty(m5342)) {
                        m826.m415(Constants.KEY_IF_MODIFIED_SINCE, m5342);
                    }
                } else {
                    m826.m415(Constants.KEY_IF_NONE_MATCH, m534);
                }
            }
            c0052 = m667.m668(m826).m663();
            if (c0052 == null) {
                StringBuilder sb = new StringBuilder("url is : ");
                sb.append(str);
                sb.append(" finally close response");
                C0282.m973("ResDownLoader", sb.toString());
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e) {
                        C0282.m972("IOUtil", e);
                        C0076.m232().m236(e);
                    }
                }
                return null;
            }
            try {
                int m164 = c0052.m164();
                if (m164 == 200) {
                    if (C0139.m528(C0226.m829(), str, c0052)) {
                        File m5302 = C0139.m530(C0226.m829(), str, null);
                        StringBuilder sb2 = new StringBuilder("url is : ");
                        sb2.append(str);
                        sb2.append(" finally close response");
                        C0282.m973("ResDownLoader", sb2.toString());
                        if (c0052 != null) {
                            try {
                                c0052.close();
                            } catch (Exception e2) {
                                C0282.m972("IOUtil", e2);
                                C0076.m232().m236(e2);
                            }
                        }
                        return m5302;
                    }
                    m197(str);
                    StringBuilder sb3 = new StringBuilder("url is : ");
                    sb3.append(str);
                    sb3.append(" finally close response");
                    C0282.m973("ResDownLoader", sb3.toString());
                    if (c0052 != null) {
                        try {
                            c0052.close();
                        } catch (Exception e3) {
                            C0282.m972("IOUtil", e3);
                            C0076.m232().m236(e3);
                        }
                    }
                    return null;
                }
                if (m164 == 304) {
                    if (!C0139.m527(C0226.m829(), str)) {
                        m197(str);
                        StringBuilder sb4 = new StringBuilder("url is : ");
                        sb4.append(str);
                        sb4.append(" finally close response");
                        C0282.m973("ResDownLoader", sb4.toString());
                        if (c0052 != null) {
                            try {
                                c0052.close();
                            } catch (Exception e4) {
                                C0282.m972("IOUtil", e4);
                                C0076.m232().m236(e4);
                            }
                        }
                        return null;
                    }
                    C0139.m536(C0226.m829(), str, c0052);
                    File m5303 = C0139.m530(C0226.m829(), str, null);
                    StringBuilder sb5 = new StringBuilder("url is : ");
                    sb5.append(str);
                    sb5.append(" finally close response");
                    C0282.m973("ResDownLoader", sb5.toString());
                    if (c0052 != null) {
                        try {
                            c0052.close();
                        } catch (Exception e5) {
                            C0282.m972("IOUtil", e5);
                            C0076.m232().m236(e5);
                        }
                    }
                    return m5303;
                }
                if (m164 != 301 && m164 != 302 && m164 != 303 && m164 != 307) {
                    m197(str);
                    StringBuilder sb6 = new StringBuilder("url is : ");
                    sb6.append(str);
                    sb6.append(" finally close response");
                    C0282.m973("ResDownLoader", sb6.toString());
                    if (c0052 != null) {
                        try {
                            c0052.close();
                        } catch (Exception e6) {
                            C0282.m972("IOUtil", e6);
                            C0076.m232().m236(e6);
                        }
                    }
                    return null;
                }
                C0139.m536(C0226.m829(), str, c0052);
                URL url = new URL(new URL(str), c0052.m165().m410(Constants.KEY_LOCATION));
                StringBuilder sb7 = new StringBuilder("redirect url is : ");
                sb7.append(url.toString());
                C0282.m973("ResDownLoader", sb7.toString());
                File m199 = m199(url.toString());
                StringBuilder sb8 = new StringBuilder("url is : ");
                sb8.append(str);
                sb8.append(" finally close response");
                C0282.m973("ResDownLoader", sb8.toString());
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e7) {
                        C0282.m972("IOUtil", e7);
                        C0076.m232().m236(e7);
                    }
                }
                return m199;
            } catch (Throwable th2) {
                th = th2;
                StringBuilder sb9 = new StringBuilder("url is : ");
                sb9.append(str);
                sb9.append(" finally close response");
                C0282.m973("ResDownLoader", sb9.toString());
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e8) {
                        C0282.m972("IOUtil", e8);
                        C0076.m232().m236(e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c0052 = null;
        }
    }
}
