package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3147zh extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final Hf f40389b;

    /* renamed from: c, reason: collision with root package name */
    public final C3024uo f40390c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f40391d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f40392e;

    public C3147zh(@NonNull C2953s5 c2953s5) {
        this(c2953s5, c2953s5.t(), Ia.j().s(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        C2953s5 c2953s5 = this.f38930a;
        if (this.f40390c.d()) {
            return false;
        }
        C2773l6 a4 = ((C3095xh) c2953s5.f39775k.a()).f40178e ? C2773l6.a(c2773l6, EnumC3063wb.EVENT_TYPE_APP_UPDATE) : C2773l6.a(c2773l6, EnumC3063wb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f40391d.getInstallerPackageName(c2953s5.f39765a, c2953s5.f39766b.f39374a), ""));
            Hf hf = this.f40389b;
            hf.f39188h.a(hf.f39181a);
            jSONObject.put("preloadInfo", ((Ef) hf.c()).b());
        } catch (Throwable unused) {
        }
        a4.setValue(jSONObject.toString());
        F9 f9 = c2953s5.f39778n;
        f9.a(a4, Sk.a(f9.f37519c.b(a4), a4.f39384i));
        C3024uo c3024uo = this.f40390c;
        synchronized (c3024uo) {
            C3050vo c3050vo = c3024uo.f39951a;
            c3050vo.a(c3050vo.a().put("init_event_done", true));
        }
        this.f40390c.a(this.f40392e.currentTimeMillis());
        return false;
    }

    public C3147zh(C2953s5 c2953s5, C3024uo c3024uo, Hf hf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c2953s5);
        this.f40390c = c3024uo;
        this.f40389b = hf;
        this.f40391d = safePackageManager;
        this.f40392e = systemTimeProvider;
    }
}
