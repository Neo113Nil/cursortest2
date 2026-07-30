package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebResourceError;
import com.onesignal.inAppMessages.internal.display.impl.m;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import r4.f;
import u0.d;
import u0.q;
import v0.AbstractC0962f;
import v0.C;
import v0.F;
import v0.G;
import v0.J;

/* loaded from: classes.dex */
public class WebResourceErrorExt {
    private String description;
    private int type;

    public WebResourceErrorExt(int i2, String str) {
        this.type = i2;
        this.description = str;
    }

    public static WebResourceErrorExt fromWebResourceError(WebResourceError webResourceError) {
        return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt) obj;
        if (this.type != webResourceErrorExt.type) {
            return false;
        }
        return this.description.equals(webResourceErrorExt.description);
    }

    public String getDescription() {
        return this.description;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.type * 31);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(m.EVENT_TYPE_KEY, Integer.valueOf(getType()));
        hashMap.put("description", getDescription());
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebResourceErrorExt{type=");
        sb.append(this.type);
        sb.append(", description='");
        return f.f(sb, this.description, "'}");
    }

    public static WebResourceErrorExt fromWebResourceError(q qVar) {
        int i2;
        String str;
        if (d.a("WEB_RESOURCE_ERROR_GET_CODE")) {
            C c7 = (C) qVar;
            c7.getClass();
            F.f8164o.getClass();
            if (c7.f8133a == null) {
                J j = G.f8176a;
                c7.f8133a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) j.f8180b).convertWebResourceError(Proxy.getInvocationHandler(c7.f8134b));
            }
            i2 = AbstractC0962f.f(c7.f8133a);
        } else {
            i2 = -1;
        }
        if (d.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
            C c8 = (C) qVar;
            c8.getClass();
            F.f8163n.getClass();
            if (c8.f8133a == null) {
                J j7 = G.f8176a;
                c8.f8133a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) j7.f8180b).convertWebResourceError(Proxy.getInvocationHandler(c8.f8134b));
            }
            str = AbstractC0962f.e(c8.f8133a).toString();
        } else {
            str = "";
        }
        return new WebResourceErrorExt(i2, str);
    }
}
