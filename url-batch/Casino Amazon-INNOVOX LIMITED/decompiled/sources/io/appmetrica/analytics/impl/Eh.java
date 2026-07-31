package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes3.dex */
public final class Eh extends Y4 {
    public final String w;
    public final F6 x;

    public Eh(Context context, R4 r4, C0420p4 c0420p4, F6 f6, C0209gm c0209gm, W4 w4, InterfaceC0524t9 interfaceC0524t9) {
        this(context, r4, new C0290k0(), new TimePassedChecker(), new C0115d5(context, r4, c0420p4, w4, c0209gm, new C0682zh(f6), C0401oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0401oa.k().l(), interfaceC0524t9), f6, c0420p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(C0420p4 c0420p4) {
        super.a(c0420p4);
        this.x.a(this.w, c0420p4.i);
    }

    public Eh(Context context, R4 r4, C0290k0 c0290k0, TimePassedChecker timePassedChecker, C0115d5 c0115d5, F6 f6, C0420p4 c0420p4) {
        super(context, r4, c0290k0, timePassedChecker, c0115d5, c0420p4);
        this.w = r4.b();
        this.x = f6;
    }
}
