package f4;

import android.app.Application;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f3346g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b6.c f3348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b6.c cVar, h6.d dVar) {
        super(2, dVar);
        this.f3348i = cVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        s sVar = new s(this.f3348i, dVar);
        sVar.f3347h = obj;
        return sVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((s) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f3346g;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            return obj;
        }
        d6.a.e(obj);
        c7.x xVar = (c7.x) this.f3347h;
        this.f3347h = xVar;
        this.f3346g = 1;
        c7.h hVar = new c7.h(1, a8.m.A(this));
        hVar.r();
        InstallReferrerClient build = InstallReferrerClient.newBuilder((Application) this.f3348i.f1394g).build();
        hVar.t(new r(xVar, build));
        build.startConnection(new androidx.room.c(hVar, 5, build));
        Object q8 = hVar.q();
        i6.a aVar = i6.a.f4956f;
        return q8 == aVar ? aVar : q8;
    }
}
