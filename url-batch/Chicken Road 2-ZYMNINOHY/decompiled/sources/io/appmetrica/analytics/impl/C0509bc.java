package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import o3.InterfaceC1328a;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509bc extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0535cc f11533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0509bc(C0535cc c0535cc) {
        super(0);
        this.f11533a = c0535cc;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        InterfaceC1000uc ke;
        C0535cc c0535cc = this.f11533a;
        C1026vc c1026vc = c0535cc.f11606f;
        InterfaceC0919r9 interfaceC0919r9 = c0535cc.f11602b;
        Qg qg = c0535cc.f11601a;
        C0837o4 c0837o4 = c0535cc.f11603c;
        We we = c0535cc.f11604d;
        c1026vc.getClass();
        if (FrameworkDetector.isNative()) {
            M9 i4 = C0817na.f12417I.i();
            Bundle applicationMetaData = i4.f10640d.getApplicationMetaData(i4.f10637a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ke = new Qd();
                return ke.a();
            }
        }
        ke = new Ke(interfaceC0919r9, qg, c0837o4, we);
        return ke.a();
    }
}
