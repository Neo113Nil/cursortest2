package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0096cc extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0122dc f1196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096cc(C0122dc c0122dc) {
        super(0);
        this.f1196a = c0122dc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0577vc le;
        C0122dc c0122dc = this.f1196a;
        C0602wc c0602wc = c0122dc.f;
        InterfaceC0499s9 interfaceC0499s9 = c0122dc.b;
        Rg rg = c0122dc.f1215a;
        C0420p4 c0420p4 = c0122dc.c;
        Xe xe = c0122dc.d;
        c0602wc.getClass();
        if (FrameworkDetector.isNative()) {
            N9 i = C0401oa.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.f968a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                le = new Rd();
                return le.a();
            }
        }
        le = new Le(interfaceC0499s9, rg, c0420p4, xe);
        return le.a();
    }
}
