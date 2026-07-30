package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.ValueCallback;
import com.onevcat.uniwebview.UniWebViewInterface;
import com.onevcat.uniwebview.UniWebViewNativeChannel;
import com.unity3d.player.UnityPlayer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class p3 {
    public static void a(final String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Interface clearCookiesAsync", "message");
        b.a(A.INFO, "Interface clearCookiesAsync");
        AbstractC0125x0.a(new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.p3$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                p3.a(identifier, (Unit) obj);
            }
        });
    }

    public static final void b(String name, Function1 runner) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(runner, "$runner");
        C0055g c0055g = C0055g.b;
        c0055g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.d dVar = (com.onevcat.uniwebview.d) c0055g.a.get(name);
        if (dVar != null) {
            runner.invoke(dVar);
            return;
        }
        B b = B.b;
        String message = "Did not find the correct web view container for name: " + name + ". Has it been already destroyed or not yet added?";
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.CRITICAL, message);
    }

    public static Object c(Function0 function0) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(new E1(objectRef, function0, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            B b = B.b;
            String message = "Exception detected: " + e.getMessage();
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static void a(String url, String cookie, final String identifier) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        String message = "setCookieAsync: " + cookie + " | to url: " + url + ", identifier: " + identifier;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        AbstractC0125x0.a(url, cookie, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.p3$$ExternalSyntheticLambda3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                p3.b(identifier, (Unit) obj);
            }
        });
    }

    public static Object c(String str, Function1 function1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(str, new F1(objectRef, function1, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            B b = B.b;
            String message = "Exception detected: " + e.getMessage();
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static final void b(String identifier, Unit unit) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        C0056g0 c0056g0 = new C0056g0(new v3(identifier, "0", "", null));
        UniWebViewInterface.Companion.getClass();
        a(c0056g0);
    }

    public static final void b(Function0 runner) {
        Intrinsics.checkNotNullParameter(runner, "$runner");
        runner.invoke();
    }

    public static C0078l0 a(AbstractC0074k0 params) {
        UniWebViewNativeChannel uniWebViewNativeChannel;
        Intrinsics.checkNotNullParameter(params, "params");
        uniWebViewNativeChannel = UniWebViewInterface.channel;
        if (uniWebViewNativeChannel == null) {
            B b = B.b;
            C0095p1 messageProvider = new C0095p1(params);
            b.getClass();
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            b.a(A.CRITICAL, messageProvider);
            return null;
        }
        B.b.a("invokeChannelMethod: " + params.a + ", " + params.b + ", %s", params.c);
        String invokeChannelMethod = uniWebViewNativeChannel.invokeChannelMethod(params.a, params.b, params.c);
        if (invokeChannelMethod == null) {
            return null;
        }
        return new C0078l0(invokeChannelMethod);
    }

    public static final void a(String identifier, Unit unit) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        C0056g0 c0056g0 = new C0056g0(new v3(identifier, "0", "", null));
        UniWebViewInterface.Companion.getClass();
        a(c0056g0);
    }

    public static void a(final Function0 function0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.p3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                p3.b(Function0.this);
            }
        });
    }

    public static void a(final String str, final Function1 function1) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.p3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                p3.b(str, function1);
            }
        });
    }
}
