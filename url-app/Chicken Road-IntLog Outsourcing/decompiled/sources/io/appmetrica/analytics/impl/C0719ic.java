package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import t4.InterfaceC1430a;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719ic extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0744jc f8451a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719ic(C0744jc c0744jc) {
        super(0);
        this.f8451a = c0744jc;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        Bc pe;
        C0744jc c0744jc = this.f8451a;
        Cc cc = c0744jc.f8534f;
        InterfaceC1129y9 interfaceC1129y9 = c0744jc.f8530b;
        Vg vg = c0744jc.f8529a;
        C1047v4 c1047v4 = c0744jc.f8531c;
        C0541bf c0541bf = c0744jc.f8532d;
        cc.getClass();
        if (FrameworkDetector.isNative()) {
            T9 i2 = C1027ua.f9366H.i();
            Bundle applicationMetaData = i2.f7526d.getApplicationMetaData(i2.f7523a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                pe = new Xd();
                return pe.a();
            }
        }
        pe = new Pe(interfaceC1129y9, vg, c1047v4, c0541bf);
        return pe.a();
    }
}
