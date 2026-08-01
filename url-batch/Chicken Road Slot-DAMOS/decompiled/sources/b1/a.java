package b1;

import b7.o0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f930e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f931i;

    public /* synthetic */ a(int i3, Object obj, Object obj2) {
        this.f929d = i3;
        this.f930e = obj;
        this.f931i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f929d) {
            case 0:
                o oVar = (o) obj;
                synchronized (r.f1030c) {
                    j = r.f1032e;
                    r.f1032e = 1 + j;
                }
                return new d(j, oVar, (Function1) this.f930e, (Function1) this.f931i);
            default:
                o0 o0Var = (o0) this.f930e;
                Object obj2 = o0Var.f1326b;
                ge.h hVar = (ge.h) this.f931i;
                synchronized (obj2) {
                    ((ArrayList) o0Var.f1327c).remove(hVar);
                }
                return Unit.f5554a;
        }
    }
}
