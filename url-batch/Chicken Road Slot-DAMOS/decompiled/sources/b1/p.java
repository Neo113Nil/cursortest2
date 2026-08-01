package b1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f1024e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f1025i;

    public /* synthetic */ p(Function1 function1, Function1 function12, int i3) {
        this.f1023d = i3;
        this.f1024e = function1;
        this.f1025i = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1023d) {
            case 0:
                this.f1024e.invoke(obj);
                this.f1025i.invoke(obj);
                break;
            default:
                this.f1024e.invoke(obj);
                this.f1025i.invoke(obj);
                break;
        }
        return Unit.f5554a;
    }
}
