package com.cmplay.base.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import org.apache.a.r;

/* compiled from: ParseUrlUtils.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private Context f4060a;

    /* renamed from: b, reason: collision with root package name */
    private b f4061b = null;

    /* compiled from: ParseUrlUtils.java */
    public interface b {
        void a(String str);
    }

    public u() {
    }

    public u(Context context) {
        this.f4060a = context;
    }

    public void a(b bVar) {
        this.f4061b = bVar;
    }

    public r a(String str) {
        org.apache.a.i.b bVar = new org.apache.a.i.b();
        bVar.a("http.useragent", a());
        org.apache.a.i.c.c(bVar, 10000);
        org.apache.a.i.c.a(bVar, 10000);
        org.apache.a.f.b.h hVar = new org.apache.a.f.b.h(bVar);
        hVar.a(new org.apache.a.b.k() { // from class: com.cmplay.base.util.u.1
            @Override // org.apache.a.b.k
            public URI a(r rVar, org.apache.a.j.e eVar) throws org.apache.a.z {
                return null;
            }

            @Override // org.apache.a.b.k
            public boolean b(r rVar, org.apache.a.j.e eVar) {
                return false;
            }
        });
        try {
            return hVar.a(new org.apache.a.b.b.d(str), new org.apache.a.j.a());
        } catch (ConnectException e) {
            e.printStackTrace();
            return null;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return null;
        } catch (SocketException e3) {
            e3.printStackTrace();
            return null;
        } catch (SocketTimeoutException e4) {
            e4.printStackTrace();
            return null;
        } catch (org.apache.a.b.d e5) {
            e5.printStackTrace();
            return null;
        } catch (org.apache.a.c.h e6) {
            e6.printStackTrace();
            return null;
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        } catch (NullPointerException e8) {
            e8.printStackTrace();
            return null;
        } catch (org.apache.a.c.f e9) {
            e9.printStackTrace();
            return null;
        } catch (org.apache.a.x e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public String a() {
        if (this.f4060a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                return WebSettings.getDefaultUserAgent(this.f4060a);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            try {
                return a(this.f4060a, "android.webkit.WebSettings", "android.webkit.WebView");
            } catch (Exception unused2) {
                return a(this.f4060a, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
            }
        } catch (Exception unused3) {
            WebView webView = new WebView(this.f4060a);
            String userAgentString = webView.getSettings().getUserAgentString();
            webView.destroy();
            return userAgentString;
        }
    }

    private String a(Context context, String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class, Class.forName(str2));
        declaredConstructor.setAccessible(true);
        try {
            return (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(context, null), new Object[0]);
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    /* compiled from: ParseUrlUtils.java */
    public class a extends d<String, Void, String> {
        String e = "";
        String f = "";
        String g = "";

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.cmplay.base.util.d
        public String a(String... strArr) {
            int b2;
            org.apache.a.d firstHeader;
            String str = strArr[0];
            do {
                r a2 = u.this.a(str);
                if (a2 == null || a2.a() == null || (((b2 = a2.a().b()) != 301 && b2 != 302) || (firstHeader = a2.getFirstHeader(Constants.KEY_LOCATION)) == null || (str = firstHeader.d()) == null)) {
                    break;
                }
            } while (!p.a(str));
            return str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.cmplay.base.util.d
        public void a(String str) {
            if (TextUtils.isEmpty(str) || p.a(str)) {
                u.this.c(str);
            } else {
                u.this.c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.f4061b != null) {
            this.f4061b.a(str);
        }
    }

    public a b(String str) {
        a aVar = new a();
        aVar.c((Object[]) new String[]{str});
        return aVar;
    }
}
