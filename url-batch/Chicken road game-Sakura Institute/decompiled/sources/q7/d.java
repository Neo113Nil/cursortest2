package q7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s1.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class d extends r6.h implements q6.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f7548n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i7, obj, cls, str, str2, i8, i9);
        this.f7548n = i10;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7548n) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                r6.k.f(serialDescriptor, "p0");
                e eVar = (e) this.f7949g;
                eVar.getClass();
                boolean z8 = !serialDescriptor.k(intValue) && serialDescriptor.j(intValue).h();
                eVar.f7550b = z8;
                return Boolean.valueOf(z8);
            default:
                return Boolean.valueOf(r.e((r) this.f7949g, (x0.b) obj, (y0.d) obj2));
        }
    }
}
