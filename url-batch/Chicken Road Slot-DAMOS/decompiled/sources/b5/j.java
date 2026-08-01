package b5;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements c0, z4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1146b;

    public /* synthetic */ j(int i3, Object obj) {
        this.f1145a = i3;
        this.f1146b = obj;
    }

    @Override // b5.c0
    public final i5.a b() {
        switch (this.f1145a) {
            case 0:
                return ((o) this.f1146b).f1165b;
            default:
                return ((b0) this.f1146b).f1109b;
        }
    }

    @Override // z4.l
    public final Object c(String str, Function1 function1, nd.c cVar) {
        switch (this.f1145a) {
            case 0:
                return ((o) this.f1146b).c(str, function1, cVar);
            default:
                return ((b0) this.f1146b).c(str, function1, cVar);
        }
    }
}
