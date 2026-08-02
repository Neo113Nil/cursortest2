package Y1;

import android.webkit.ValueCallback;
import b2.C0192f;

/* renamed from: Y1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0116m implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2.l f1872b;

    public /* synthetic */ C0116m(l2.l lVar, int i3) {
        this.f1871a = i3;
        this.f1872b = lVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f1871a) {
            case 0:
                B b3 = (B) this.f1872b;
                kotlin.jvm.internal.t.b(1, b3);
                b3.invoke(new C0192f((Boolean) obj));
                break;
            default:
                B b4 = (B) this.f1872b;
                kotlin.jvm.internal.t.b(1, b4);
                b4.invoke(new C0192f((String) obj));
                break;
        }
    }
}
