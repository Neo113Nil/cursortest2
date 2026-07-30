package com.just.agentweb;

import android.webkit.JavascriptInterface;
import com.just.agentweb.AgentWeb;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class JsBaseInterfaceHolder implements JsInterfaceHolder {
    private AgentWeb.SecurityType mSecurityType;
    private WebCreator mWebCreator;

    protected JsBaseInterfaceHolder(WebCreator webCreator, AgentWeb.SecurityType securityType) {
        this.mSecurityType = securityType;
        this.mWebCreator = webCreator;
    }

    @Override // com.just.agentweb.JsInterfaceHolder
    public boolean checkObject(Object obj) {
        if (this.mWebCreator.getWebViewType() == 2) {
            return true;
        }
        boolean z7 = false;
        for (Method method : obj.getClass().getMethods()) {
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (annotations[i8] instanceof JavascriptInterface) {
                    z7 = true;
                    break;
                }
                i8++;
            }
            if (z7) {
                break;
            }
        }
        return z7;
    }

    protected boolean checkSecurity() {
        if (this.mSecurityType != AgentWeb.SecurityType.STRICT_CHECK) {
            return true;
        }
        this.mWebCreator.getWebViewType();
        return true;
    }
}
