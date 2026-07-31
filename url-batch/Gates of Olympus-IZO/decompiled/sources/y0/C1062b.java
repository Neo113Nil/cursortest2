package y0;

import L1.z;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import b0.AbstractC0259J;
import java.util.function.Consumer;
import k2.InterfaceC0550w;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062b extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f8786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f8787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Rect f8788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Consumer f8789i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1062b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, P1.d dVar) {
        super(2, dVar);
        this.f8786f = fVar;
        this.f8787g = scrollCaptureSession;
        this.f8788h = rect;
        this.f8789i = consumer;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C1062b(this.f8786f, this.f8787g, this.f8788h, this.f8789i, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C1062b) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8785e;
        if (i3 == 0) {
            I2.l.Q(obj);
            ScrollCaptureSession scrollCaptureSession = this.f8787g;
            Rect rect = this.f8788h;
            M0.h hVar = new M0.h(rect.left, rect.top, rect.right, rect.bottom);
            this.f8785e = 1;
            obj = f.a(this.f8786f, scrollCaptureSession, hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        this.f8789i.accept(AbstractC0259J.C((M0.h) obj));
        return z.f2729a;
    }
}
