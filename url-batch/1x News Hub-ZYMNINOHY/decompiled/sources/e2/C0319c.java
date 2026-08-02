package e2;

import d2.h;
import f2.AbstractC0326c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import l2.p;
import t2.AbstractC1191a;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319c extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public int f4974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f4975e;
    public final /* synthetic */ AbstractC1191a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319c(AbstractC1191a abstractC1191a, h hVar, p pVar, AbstractC1191a abstractC1191a2) {
        super(abstractC1191a, hVar);
        this.f4975e = pVar;
        this.f = abstractC1191a2;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        int i3 = this.f4974d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4974d = 2;
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        this.f4974d = 1;
        android.support.v4.media.session.a.T(obj);
        p pVar = this.f4975e;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.b(2, pVar);
        return pVar.invoke(this.f, this);
    }
}
