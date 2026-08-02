package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes.dex */
public final class Bh extends AbstractC0709j6 {

    /* renamed from: d, reason: collision with root package name */
    public final Wn f10119d;

    public Bh(Context context, Wn wn, InterfaceC0684i6 interfaceC0684i6, ICrashTransformer iCrashTransformer) {
        this(wn, interfaceC0684i6, iCrashTransformer, new M9(context));
    }

    public Bh(Wn wn, InterfaceC0684i6 interfaceC0684i6, ICrashTransformer iCrashTransformer, M9 m9) {
        super(interfaceC0684i6, iCrashTransformer, m9);
        this.f10119d = wn;
    }
}
