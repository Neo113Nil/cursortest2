package b5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f1156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1157e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f1158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, String str, Function1 function1, ld.a aVar) {
        super(1, aVar);
        this.f1156d = oVar;
        this.f1157e = str;
        this.f1158i = function1;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        return new m(this.f1156d, this.f1157e, this.f1158i, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((ld.a) obj)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        cf.c.M(obj);
        i5.c K = this.f1156d.f1165b.K(this.f1157e);
        try {
            Object invoke = this.f1158i.invoke(K);
            cf.c.m(K, null);
            return invoke;
        } finally {
        }
    }
}
