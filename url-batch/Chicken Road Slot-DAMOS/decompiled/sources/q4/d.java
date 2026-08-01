package q4;

import kotlin.Unit;
import kotlin.collections.s;
import kotlin.jvm.functions.Function1;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f7981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f7982e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f7983i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f7984r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f7985s;

    public /* synthetic */ d(z zVar, z zVar2, h hVar, boolean z10, s sVar) {
        this.f7981d = zVar;
        this.f7982e = zVar2;
        this.f7983i = hVar;
        this.f7984r = z10;
        this.f7985s = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n4.h hVar = (n4.h) obj;
        hVar.getClass();
        this.f7981d.f10164d = true;
        this.f7982e.f10164d = true;
        this.f7983i.o(hVar, this.f7984r, this.f7985s);
        return Unit.f5554a;
    }
}
