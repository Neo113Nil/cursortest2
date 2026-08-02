package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568ic extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0593jc f7562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568ic(C0593jc c0593jc) {
        super(0);
        this.f7562a = c0593jc;
    }

    @Override // l2.a
    public final Object invoke() {
        Bc pe;
        C0593jc c0593jc = this.f7562a;
        Cc cc = c0593jc.f;
        InterfaceC0978y9 interfaceC0978y9 = c0593jc.f7636b;
        Vg vg = c0593jc.f7635a;
        C0896v4 c0896v4 = c0593jc.f7637c;
        C0390bf c0390bf = c0593jc.f7638d;
        cc.getClass();
        if (FrameworkDetector.isNative()) {
            T9 i3 = C0876ua.f8420H.i();
            Bundle applicationMetaData = i3.f6698d.getApplicationMetaData(i3.f6695a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                pe = new Xd();
                return pe.a();
            }
        }
        pe = new Pe(interfaceC0978y9, vg, c0896v4, c0390bf);
        return pe.a();
    }
}
