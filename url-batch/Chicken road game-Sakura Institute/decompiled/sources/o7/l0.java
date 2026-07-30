package o7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6904f;

    public /* synthetic */ l0(int i7) {
        this.f6904f = i7;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f6904f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m7.h hVar = m7.h.f6466j;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (z6.h.G("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (hVar.equals(m7.h.f6463g)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                m7.a aVar = new m7.a("kotlin.Unit");
                return new m7.f("kotlin.Unit", hVar, aVar.f6435b.size(), e6.k.i0(serialDescriptorArr), aVar);
            case 1:
                return p7.a0.f7213b;
            case 2:
                return p7.t.f7237b;
            case 3:
                return p7.q.f7235a;
            case 4:
                return p7.x.f7242b;
            default:
                return p7.g.f7222b;
        }
    }

    public /* synthetic */ l0(m0 m0Var) {
        this.f6904f = 0;
    }
}
