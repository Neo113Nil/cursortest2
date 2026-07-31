package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3064wc extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3090xc f40075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064wc(C3090xc c3090xc) {
        super(0);
        this.f40075a = c3090xc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pc ye;
        C3090xc c3090xc = this.f40075a;
        Qc qc = c3090xc.f40169f;
        M9 m9 = c3090xc.f40165b;
        C2575dh c2575dh = c3090xc.f40164a;
        J4 j4 = c3090xc.f40166c;
        C2756kf c2756kf = c3090xc.f40167d;
        qc.getClass();
        if (FrameworkDetector.isNative()) {
            C2674ha h4 = Ia.f37730F.h();
            Bundle applicationMetaData = h4.f39138d.getApplicationMetaData(h4.f39135a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ye = new C2625fe();
                return ye.a();
            }
        }
        ye = new Ye(m9, c2575dh, j4, c2756kf);
        return ye.a();
    }
}
