package c3;

import a1.AbstractC0223a;
import java.util.Map;
import k5.C0477g;
import l5.t;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f3796g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i7) {
        super(0);
        this.f3795f = i7;
        this.f3796g = mVar;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        switch (this.f3795f) {
            case 0:
                StringBuilder sb = new StringBuilder("onesignal/");
                m mVar = this.f3796g;
                sb.append(mVar.f3797e.getSdkBase());
                sb.append('/');
                sb.append(mVar.f3797e.getSdkBaseVersion());
                return t.q0(new C0477g(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, sb.toString()));
            default:
                m mVar2 = this.f3796g;
                Map map = (Map) mVar2.f3798f.getValue();
                f fVar = mVar2.f3797e;
                return AbstractC0223a.q(map, fVar.getAppIdForHeaders(), fVar.getApiBaseUrl(), fVar.isOtelExporterLoggingEnabled());
        }
    }
}
