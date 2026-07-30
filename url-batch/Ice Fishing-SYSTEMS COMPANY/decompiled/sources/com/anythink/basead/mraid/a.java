package com.anythink.basead.mraid;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    Context f9764a;

    /* renamed from: c, reason: collision with root package name */
    MraidBaseWebView f9766c;

    /* renamed from: d, reason: collision with root package name */
    protected Pattern f9767d;

    /* renamed from: e, reason: collision with root package name */
    protected String f9768e;

    /* renamed from: f, reason: collision with root package name */
    List<String> f9769f = new ArrayList(Arrays.asList("open", com.anythink.expressad.foundation.d.d.cs, "unload", "useCustomClose", "expand"));

    /* renamed from: b, reason: collision with root package name */
    Handler f9765b = new Handler(Looper.getMainLooper(), this);

    /* renamed from: com.anythink.basead.mraid.a$a, reason: collision with other inner class name */
    public class C0043a {

        /* renamed from: a, reason: collision with root package name */
        public Object f9770a;

        /* renamed from: b, reason: collision with root package name */
        public String f9771b;

        /* renamed from: c, reason: collision with root package name */
        public String f9772c;

        /* renamed from: d, reason: collision with root package name */
        public String f9773d;

        /* renamed from: e, reason: collision with root package name */
        public String f9774e;

        /* renamed from: f, reason: collision with root package name */
        public String f9775f;

        public C0043a() {
        }
    }

    public a(Context context) {
        this.f9764a = context;
    }

    private void a(Pattern pattern) {
        this.f9767d = pattern;
    }

    private void c(String str) {
        this.f9768e = str;
    }

    private C0043a d(String str) {
        Set<String> unmodifiableSet;
        if (str == null) {
            return null;
        }
        C0043a c0043a = new C0043a();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(com.anythink.expressad.foundation.d.d.f18752s)) {
            return null;
        }
        String host = parse.getHost();
        c0043a.f9772c = host;
        if (!this.f9769f.contains(host) && this.f9766c != null) {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f9766c, host);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f9766c, host, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : unmodifiableSet) {
                jSONObject.put(str2, parse.getQueryParameter(str2));
            }
            c0043a.f9773d = jSONObject.toString();
            return c0043a;
        } catch (Exception e6) {
            e6.printStackTrace();
            return c0043a;
        }
    }

    public final void b(String str) {
        C0043a d2;
        Object jsObject;
        char c4;
        if (TextUtils.isEmpty(str) || (d2 = d(str)) == null || (jsObject = this.f9766c.getJsObject(d2.f9771b)) == null || !(jsObject instanceof h)) {
            return;
        }
        try {
            String str2 = d2.f9772c;
            switch (str2.hashCode()) {
                case -1289167206:
                    if (str2.equals("expand")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -840442113:
                    if (str2.equals("unload")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3417674:
                    if (str2.equals("open")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 94756344:
                    if (str2.equals(com.anythink.expressad.foundation.d.d.cs)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1614272768:
                    if (str2.equals("useCustomClose")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            String str3 = "{}";
            if (c4 == 0) {
                h hVar = (h) jsObject;
                if (!TextUtils.isEmpty(d2.f9773d)) {
                    str3 = d2.f9773d;
                }
                hVar.a(str3);
                return;
            }
            if (c4 == 1) {
                TextUtils.isEmpty(d2.f9773d);
                ((h) jsObject).a();
                return;
            }
            if (c4 == 2) {
                TextUtils.isEmpty(d2.f9773d);
                ((h) jsObject).b();
                return;
            }
            if (c4 == 3) {
                h hVar2 = (h) jsObject;
                if (!TextUtils.isEmpty(d2.f9773d)) {
                    str3 = d2.f9773d;
                }
                hVar2.b(str3);
                return;
            }
            if (c4 != 4) {
                return;
            }
            h hVar3 = (h) jsObject;
            if (!TextUtils.isEmpty(d2.f9773d)) {
                str3 = d2.f9773d;
            }
            hVar3.c(str3);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    private void a(MraidBaseWebView mraidBaseWebView) {
        this.f9766c = mraidBaseWebView;
    }

    public final boolean a(String str) {
        if (!com.anythink.core.express.d.d.a(str)) {
            return false;
        }
        this.f9767d = com.anythink.core.express.d.d.b(str);
        this.f9768e = str;
        return true;
    }

    private String a() {
        return this.f9768e;
    }

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private void a(C0043a c0043a) {
        char c4;
        Object jsObject = this.f9766c.getJsObject(c0043a.f9771b);
        if (jsObject != null && (jsObject instanceof h)) {
            try {
                String str = c0043a.f9772c;
                switch (str.hashCode()) {
                    case -1289167206:
                        if (str.equals("expand")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -840442113:
                        if (str.equals("unload")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3417674:
                        if (str.equals("open")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 94756344:
                        if (str.equals(com.anythink.expressad.foundation.d.d.cs)) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1614272768:
                        if (str.equals("useCustomClose")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                String str2 = "{}";
                if (c4 == 0) {
                    h hVar = (h) jsObject;
                    if (!TextUtils.isEmpty(c0043a.f9773d)) {
                        str2 = c0043a.f9773d;
                    }
                    hVar.a(str2);
                    return;
                }
                if (c4 == 1) {
                    TextUtils.isEmpty(c0043a.f9773d);
                    ((h) jsObject).a();
                    return;
                }
                if (c4 == 2) {
                    TextUtils.isEmpty(c0043a.f9773d);
                    ((h) jsObject).b();
                    return;
                }
                if (c4 == 3) {
                    h hVar2 = (h) jsObject;
                    if (!TextUtils.isEmpty(c0043a.f9773d)) {
                        str2 = c0043a.f9773d;
                    }
                    hVar2.b(str2);
                    return;
                }
                if (c4 != 4) {
                    return;
                }
                h hVar3 = (h) jsObject;
                if (!TextUtils.isEmpty(c0043a.f9773d)) {
                    str2 = c0043a.f9773d;
                }
                hVar3.c(str2);
            } catch (Throwable unused) {
            }
        }
    }
}
