package x0;

import W2.InterfaceC0302y;
import Z.K;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300b extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11405k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureCallbackC1304f f11406l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f11407m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Rect f11408n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Consumer f11409o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300b(ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, C2.a aVar) {
        super(2, aVar);
        this.f11406l = scrollCaptureCallbackC1304f;
        this.f11407m = scrollCaptureSession;
        this.f11408n = rect;
        this.f11409o = consumer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1300b) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1300b(this.f11406l, this.f11407m, this.f11408n, this.f11409o, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11405k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            ScrollCaptureSession scrollCaptureSession = this.f11407m;
            Rect rect = this.f11408n;
            M0.i iVar = new M0.i(rect.left, rect.top, rect.right, rect.bottom);
            this.f11405k = 1;
            obj = ScrollCaptureCallbackC1304f.a(this.f11406l, scrollCaptureSession, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        this.f11409o.accept(K.A((M0.i) obj));
        return Unit.f7487a;
    }
}
