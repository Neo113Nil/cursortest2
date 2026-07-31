package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1558b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f19140b = "b";

    /* renamed from: a, reason: collision with root package name */
    private final v.r f19141a;

    C1558b(v.r rVar) {
        this.f19141a = rVar;
    }

    void a(String str) {
        v.r rVar = this.f19141a;
        if (rVar != null) {
            rVar.c(str);
        }
    }

    void b(String str) {
        v.r rVar = this.f19141a;
        if (rVar != null) {
            rVar.d(str);
        }
    }

    synchronized void a(String str, String str2) {
        if (this.f19141a == null) {
            Logger.e(f19140b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f19141a, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }
}
