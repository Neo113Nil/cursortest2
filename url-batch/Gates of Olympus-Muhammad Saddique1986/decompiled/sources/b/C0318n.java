package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.T;
import e2.InterfaceC0422a;

/* renamed from: b.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318n extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0319o f5312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0318n(AbstractActivityC0319o abstractActivityC0319o, int i3) {
        super(0);
        this.f5311e = i3;
        this.f5312f = abstractActivityC0319o;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f5311e) {
            case 0:
                AbstractActivityC0319o abstractActivityC0319o = this.f5312f;
                return new T(abstractActivityC0319o.getApplication(), abstractActivityC0319o, abstractActivityC0319o.getIntent() != null ? abstractActivityC0319o.getIntent().getExtras() : null);
            case 1:
                this.f5312f.reportFullyDrawn();
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractActivityC0319o abstractActivityC0319o2 = this.f5312f;
                return new C0326v(abstractActivityC0319o2.f5318i, new C0318n(abstractActivityC0319o2, 1));
            default:
                AbstractActivityC0319o abstractActivityC0319o3 = this.f5312f;
                C0301E c0301e = new C0301E(new E.t(5, abstractActivityC0319o3));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (f2.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0319o3.getClass();
                        abstractActivityC0319o3.f4509d.a(new C0310f(c0301e, abstractActivityC0319o3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new L1.h(abstractActivityC0319o3, 2, c0301e));
                    }
                }
                return c0301e;
        }
    }
}
