package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebSettings;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118v1 extends Lambda implements Function0 {
    public static final C0118v1 a = new C0118v1();

    public C0118v1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            int i = com.onevcat.uniwebview.a.o;
            WebSettings.getDefaultUserAgent(UnityPlayer.currentActivity);
        } catch (Exception e) {
            B b = B.b;
            C0114u1 messageProvider = new C0114u1(e);
            b.getClass();
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            b.a(A.CRITICAL, messageProvider);
        }
        return Unit.INSTANCE;
    }
}
