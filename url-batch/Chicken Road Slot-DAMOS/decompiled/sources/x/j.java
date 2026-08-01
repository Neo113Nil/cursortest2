package x;

import kotlin.jvm.functions.Function1;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f10196e;

    public /* synthetic */ j(Object obj, z zVar, int i3) {
        this.f10195d = i3;
        this.f10196e = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        l lVar = (l) obj;
        switch (this.f10195d) {
            case 0:
                lVar.getClass();
                z zVar = this.f10196e;
                z10 = zVar.f10164d;
                zVar.f10164d = z10;
                break;
            default:
                lVar.getClass();
                z zVar2 = this.f10196e;
                z10 = zVar2.f10164d;
                zVar2.f10164d = z10;
                break;
        }
        return Boolean.valueOf(!z10);
    }
}
