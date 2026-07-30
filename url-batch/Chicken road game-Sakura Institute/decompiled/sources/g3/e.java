package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public int f4112g;

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new e(1, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        e eVar = (e) create((h6.d) obj);
        d6.z zVar = d6.z.f2639a;
        eVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4112g;
        if (i7 == 0) {
            d6.a.e(obj);
            this.f4112g = 1;
            throw null;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d6.a.e(obj);
        return d6.z.f2639a;
    }
}
