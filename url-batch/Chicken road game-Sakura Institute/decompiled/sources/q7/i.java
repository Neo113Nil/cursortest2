package q7;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public d6.b f7556f;

    /* renamed from: g, reason: collision with root package name */
    public j f7557g;

    /* renamed from: h, reason: collision with root package name */
    public LinkedHashMap f7558h;

    /* renamed from: i, reason: collision with root package name */
    public String f7559i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7560j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f7561k;

    /* renamed from: l, reason: collision with root package name */
    public int f7562l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, j6.a aVar) {
        super(aVar);
        this.f7561k = jVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f7560j = obj;
        this.f7562l |= Integer.MIN_VALUE;
        return j.a(this.f7561k, null, this);
    }
}
