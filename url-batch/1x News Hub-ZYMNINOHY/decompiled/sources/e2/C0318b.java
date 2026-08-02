package e2;

import f2.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import l2.p;
import t2.AbstractC1191a;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318b extends h {

    /* renamed from: b, reason: collision with root package name */
    public int f4971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1191a f4973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318b(p pVar, AbstractC1191a abstractC1191a, AbstractC1191a abstractC1191a2) {
        super(abstractC1191a);
        this.f4972c = pVar;
        this.f4973d = abstractC1191a2;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        int i3 = this.f4971b;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4971b = 2;
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        this.f4971b = 1;
        android.support.v4.media.session.a.T(obj);
        p pVar = this.f4972c;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.b(2, pVar);
        return pVar.invoke(this.f4973d, this);
    }
}
