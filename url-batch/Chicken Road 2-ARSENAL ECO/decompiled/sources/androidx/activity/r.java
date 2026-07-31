package androidx.activity;

import android.window.OnBackInvokedCallback;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3214a = new r();

    public final OnBackInvokedCallback a(InterfaceC0743l onBackStarted, InterfaceC0743l onBackProgressed, InterfaceC0732a onBackInvoked, InterfaceC0732a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new q(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
