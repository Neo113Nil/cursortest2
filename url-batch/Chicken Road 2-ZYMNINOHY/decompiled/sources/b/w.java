package b;

import android.window.OnBackInvokedCallback;
import o3.InterfaceC1328a;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f5249a = new w();

    public final OnBackInvokedCallback a(InterfaceC1339l onBackStarted, InterfaceC1339l onBackProgressed, InterfaceC1328a onBackInvoked, InterfaceC1328a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new v(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
