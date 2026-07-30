package p0;

import com.android.installreferrer.api.InstallReferrerClient;
import e6.c0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final d f6993h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f6994i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6995g;

    static {
        int i7 = 2;
        f6993h = new d(i7, 0);
        f6994i = new d(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i8) {
        super(i7);
        this.f6995g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f6995g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) obj2;
                LinkedHashMap n02 = c0.n0(gVar.f7003a);
                for (f fVar : gVar.f7004b.values()) {
                    Object obj3 = fVar.f6999a;
                    if (fVar.f7000b) {
                        Map c4 = fVar.f7001c.c();
                        if (c4.isEmpty()) {
                            n02.remove(obj3);
                        } else {
                            n02.put(obj3, c4);
                        }
                    }
                }
                if (n02.isEmpty()) {
                    return null;
                }
                return n02;
            default:
                return obj2;
        }
    }
}
