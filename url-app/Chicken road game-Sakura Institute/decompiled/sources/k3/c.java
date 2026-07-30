package k3;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import e6.c0;
import j6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5349g;

    /* renamed from: h, reason: collision with root package name */
    public int f5350h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5351i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f5352j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(q6.e eVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f5349g = i7;
        switch (i7) {
            case 1:
                this.f5352j = (i) eVar;
                super(2, dVar);
                break;
            default:
                this.f5352j = (i) eVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.i, q6.e] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f5349g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = new c(this.f5352j, dVar, 0);
                cVar.f5351i = obj;
                return cVar;
            default:
                c cVar2 = new c(this.f5352j, dVar, 1);
                cVar2.f5351i = obj;
                return cVar2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        b bVar = (b) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f5349g) {
        }
        return ((c) create(bVar, dVar)).invokeSuspend(z.f2639a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r4v13, types: [j6.i, q6.e] */
    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5349g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f5350h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    b bVar = (b) this.f5351i;
                    this.f5350h = 1;
                    obj = this.f5352j.d(bVar, this);
                    i6.a aVar = i6.a.f4956f;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                b bVar2 = (b) obj;
                k.d(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                bVar2.f5348b.f4886a.set(true);
                return bVar2;
            default:
                int i8 = this.f5350h;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.f5351i;
                    d6.a.e(obj);
                    return bVar3;
                }
                d6.a.e(obj);
                b bVar4 = new b(c0.n0(((b) this.f5351i).a()), false);
                this.f5351i = bVar4;
                this.f5350h = 1;
                Object d8 = this.f5352j.d(bVar4, this);
                i6.a aVar2 = i6.a.f4956f;
                return d8 == aVar2 ? aVar2 : bVar4;
        }
    }
}
