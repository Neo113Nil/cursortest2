package com.onevcat.uniwebview;

import com.unity3d.player.UnityPlayer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class U1 {
    public static E a(D params) {
        UniWebViewNativeChannel uniWebViewNativeChannel;
        Intrinsics.checkNotNullParameter(params, "params");
        uniWebViewNativeChannel = UniWebViewInterface.channel;
        if (uniWebViewNativeChannel == null) {
            C0060l c0060l = C0060l.b;
            String message = "Unity method channel does not exist when invoking. Check implementation. Method: " + params;
            c0060l.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0060l.a(EnumC0057k.CRITICAL, message);
            return null;
        }
        C0060l c0060l2 = C0060l.b;
        String message2 = "invokeChannelMethod: " + params.a + ", " + params.b + ", " + params.c;
        c0060l2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c0060l2.a(EnumC0057k.DEBUG, message2);
        String invokeChannelMethod = uniWebViewNativeChannel.invokeChannelMethod(params.a, params.b, params.c);
        if (invokeChannelMethod == null) {
            return null;
        }
        return new E(invokeChannelMethod);
    }

    public static final void b(Function0 runner) {
        Intrinsics.checkNotNullParameter(runner, "$runner");
        runner.invoke();
    }

    public static Object c(String str, Function1 function1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(str, new N0(objectRef, function1, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C0060l c0060l = C0060l.b;
            String message = "Exception detected: " + e.getMessage();
            c0060l.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0060l.a(EnumC0057k.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static final void b(String name, Function1 runner) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(runner, "$runner");
        C0039e c0039e = C0039e.b;
        c0039e.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        N n = (N) c0039e.a.get(name);
        if (n != null) {
            runner.invoke(n);
            return;
        }
        C0060l c0060l = C0060l.b;
        String message = "Did not find the correct web view container for name: " + name + ". Has it been already destroyed or not yet added?";
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.CRITICAL, message);
    }

    public static Object c(Function0 function0) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(new M0(objectRef, function0, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C0060l c0060l = C0060l.b;
            String message = "Exception detected: " + e.getMessage();
            c0060l.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0060l.a(EnumC0057k.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static void a(final String str, final Function1 function1) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.U1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                U1.b(str, function1);
            }
        });
    }

    public static void a(final Function0 function0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.U1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                U1.b(Function0.this);
            }
        });
    }
}
