package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.C0195i;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2582e;
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i3) {
        super(0);
        this.f2582e = i3;
        this.f = mVar;
    }

    @Override // l2.a
    public final Object invoke() {
        switch (this.f2582e) {
            case 0:
                this.f.reportFullyDrawn();
                return C0195i.f2555a;
            case 1:
                m mVar = this.f;
                return new n(mVar.f, new l(mVar, 0));
            default:
                m mVar2 = this.f;
                t tVar = new t(new RunnableC0198c(mVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        mVar2.getClass();
                        mVar2.f10332a.a(new g(tVar, mVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new A1.a(mVar2, 5, tVar));
                    }
                }
                return tVar;
        }
    }
}
