package com.onevcat.uniwebview;

import com.unity3d.player.UnityPlayer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class y4 {
    public static j0 a(i0 params) {
        UniWebViewNativeChannel uniWebViewNativeChannel;
        Intrinsics.checkNotNullParameter(params, "params");
        uniWebViewNativeChannel = UniWebViewInterface.channel;
        if (uniWebViewNativeChannel == null) {
            o oVar = o.b;
            String message = "Unity method channel does not exist when invoking. Check implementation. Method: " + params;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            oVar.a(n.CRITICAL, message);
            return null;
        }
        o oVar2 = o.b;
        String message2 = "invokeChannelMethod: " + params.a + ", " + params.b + ", " + params.c;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        oVar2.a(n.DEBUG, message2);
        String invokeChannelMethod = uniWebViewNativeChannel.invokeChannelMethod(params.a, params.b, params.c);
        if (invokeChannelMethod == null) {
            return null;
        }
        return new j0(invokeChannelMethod);
    }

    public static final void b(Function0 runner) {
        Intrinsics.checkNotNullParameter(runner, "$runner");
        runner.invoke();
    }

    public static Object c(String str, Function1 function1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(str, new r2(objectRef, function1, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            o oVar = o.b;
            String message = "Exception detected: " + e.getMessage();
            oVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            oVar.a(n.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static final void b(String name, Function1 runner) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(runner, "$runner");
        g gVar = g.b;
        g gVar2 = g.b;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        s0 s0Var = (s0) gVar2.a.get(name);
        if (s0Var != null) {
            runner.invoke(s0Var);
            return;
        }
        o oVar = o.b;
        o oVar2 = o.b;
        String message = "Did not find the correct web view container for name: " + name + ". Has it been already destroyed or not yet added?";
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar2.a(n.CRITICAL, message);
    }

    public static Object c(Function0 function0) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(new q2(objectRef, function0, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            o oVar = o.b;
            String message = "Exception detected: " + e.getMessage();
            oVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            oVar.a(n.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static void a(final String str, final Function1 function1) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.y4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                y4.b(str, function1);
            }
        });
    }

    public static void a(final Function0 function0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.y4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                y4.b(Function0.this);
            }
        });
    }
}
