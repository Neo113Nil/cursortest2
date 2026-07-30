package q7;

import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends j6.h implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public int f7553g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ d6.b f7554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f7555i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, h6.d dVar) {
        super(3, dVar);
        this.f7555i = jVar;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        h hVar = new h(this.f7555i, (h6.d) obj3);
        hVar.f7554h = (d6.b) obj;
        return hVar.invokeSuspend(z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        j jVar = this.f7555i;
        j5.a aVar = (j5.a) jVar.f7565c;
        int i7 = this.f7553g;
        if (i7 == 0) {
            d6.a.e(obj);
            d6.b bVar = this.f7554h;
            byte y4 = aVar.y();
            if (y4 == 1) {
                return jVar.d(true);
            }
            if (y4 == 0) {
                return jVar.d(false);
            }
            if (y4 != 6) {
                if (y4 == 8) {
                    return jVar.c();
                }
                j5.a.o(aVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f7553g = 1;
            obj = j.a(jVar, bVar, this);
            i6.a aVar2 = i6.a.f4956f;
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        return (p7.k) obj;
    }
}
