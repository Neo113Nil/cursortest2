package b;

import android.window.OnBackInvokedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f5507a = new A();

    public final OnBackInvokedCallback a(Function1<? super C0487b, Unit> onBackStarted, Function1<? super C0487b, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
        Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
        Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new z(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
