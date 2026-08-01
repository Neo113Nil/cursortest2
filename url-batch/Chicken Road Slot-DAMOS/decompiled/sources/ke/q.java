package ke;

import b1.y;
import ge.a0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends nd.c implements je.f {

    /* renamed from: d, reason: collision with root package name */
    public final je.f f5542d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f5543e;

    /* renamed from: i, reason: collision with root package name */
    public final int f5544i;

    /* renamed from: r, reason: collision with root package name */
    public CoroutineContext f5545r;

    /* renamed from: s, reason: collision with root package name */
    public ld.a f5546s;

    public q(je.f fVar, CoroutineContext coroutineContext) {
        super(kotlin.coroutines.g.f5592d, o.f5539d);
        this.f5542d = fVar;
        this.f5543e = coroutineContext;
        this.f5544i = ((Number) coroutineContext.z(0, new a1.e(12, (byte) 0))).intValue();
    }

    @Override // je.f
    public final Object b(Object obj, ld.a aVar) {
        try {
            Object d10 = d(aVar, obj);
            return d10 == md.a.f6622d ? d10 : Unit.f5554a;
        } catch (Throwable th) {
            this.f5545r = new m(th, aVar.getContext());
            throw th;
        }
    }

    public final Object d(ld.a aVar, Object obj) {
        CoroutineContext context = aVar.getContext();
        a0.j(context);
        CoroutineContext coroutineContext = this.f5545r;
        if (coroutineContext != context) {
            if (coroutineContext instanceof m) {
                throw new IllegalStateException(kotlin.text.i.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((m) coroutineContext).f5538e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.z(0, new y(1, this))).intValue() != this.f5544i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f5543e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f5545r = context;
        }
        this.f5546s = aVar;
        vd.n nVar = s.f5548a;
        je.f fVar = this.f5542d;
        fVar.getClass();
        Object a9 = nVar.a(fVar, obj, this);
        if (!Intrinsics.a(a9, md.a.f6622d)) {
            this.f5546s = null;
        }
        return a9;
    }

    @Override // nd.a, nd.d
    public final nd.d getCallerFrame() {
        ld.a aVar = this.f5546s;
        if (aVar instanceof nd.d) {
            return (nd.d) aVar;
        }
        return null;
    }

    @Override // nd.c, ld.a
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f5545r;
        return coroutineContext == null ? kotlin.coroutines.g.f5592d : coroutineContext;
    }

    @Override // nd.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Throwable a9 = hd.n.a(obj);
        if (a9 != null) {
            this.f5545r = new m(a9, getContext());
        }
        ld.a aVar = this.f5546s;
        if (aVar != null) {
            aVar.resumeWith(obj);
        }
        return md.a.f6622d;
    }
}
