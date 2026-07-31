package z0;

import R1.y;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import b0.M;
import e2.InterfaceC0426e;
import java.util.function.Consumer;
import q2.InterfaceC0835w;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260b extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10510h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f10511i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f10512j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Rect f10513k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Consumer f10514l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, V1.d dVar) {
        super(2, dVar);
        this.f10511i = fVar;
        this.f10512j = scrollCaptureSession;
        this.f10513k = rect;
        this.f10514l = consumer;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1260b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1260b(this.f10511i, this.f10512j, this.f10513k, this.f10514l, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10510h;
        if (i3 == 0) {
            R1.a.e(obj);
            ScrollCaptureSession scrollCaptureSession = this.f10512j;
            Rect rect = this.f10513k;
            O0.i iVar = new O0.i(rect.left, rect.top, rect.right, rect.bottom);
            this.f10510h = 1;
            obj = f.a(this.f10511i, scrollCaptureSession, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        this.f10514l.accept(M.A((O0.i) obj));
        return y.f4171a;
    }
}
