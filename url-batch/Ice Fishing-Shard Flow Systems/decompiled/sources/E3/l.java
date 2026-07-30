package E3;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.H;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class l extends p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i2) {
        super(0);
        this.f688d = i2;
        this.f689e = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f688d) {
            case 0:
                StringBuilder sb = new StringBuilder("onesignal/");
                m mVar = this.f689e;
                sb.append(mVar.f690e.getSdkBase());
                sb.append('/');
                sb.append(mVar.f690e.getSdkBaseVersion());
                return H.b(new Pair(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, sb.toString()));
            default:
                m mVar2 = this.f689e;
                Map map = (Map) mVar2.f691f.getValue();
                f fVar = mVar2.f690e;
                return V6.b.l(map, fVar.getAppIdForHeaders(), fVar.getApiBaseUrl(), fVar.isOtelExporterLoggingEnabled());
        }
    }
}
