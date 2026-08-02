package c;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f2610a = new s();

    public final OnBackInvokedCallback a(l2.l onBackStarted, l2.l onBackProgressed, l2.a onBackInvoked, l2.a onBackCancelled) {
        kotlin.jvm.internal.j.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.j.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.j.e(onBackCancelled, "onBackCancelled");
        return new r(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
