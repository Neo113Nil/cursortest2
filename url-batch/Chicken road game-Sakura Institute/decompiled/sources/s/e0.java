package s;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p0.i f8000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(p0.i iVar, int i7) {
        super(1);
        this.f7999g = i7;
        this.f8000h = iVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f7999g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p0.i iVar = this.f8000h;
                return Boolean.valueOf(iVar != null ? iVar.a(obj) : true);
            default:
                return new g0(this.f8000h, (Map) obj);
        }
    }
}
