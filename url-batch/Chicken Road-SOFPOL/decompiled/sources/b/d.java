package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f967e;

    public /* synthetic */ d(l lVar, int i) {
        this.f966d = i;
        this.f967e = lVar;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f966d) {
            case 0:
                this.f967e.reportFullyDrawn();
                return c6.m.f1757a;
            case 1:
                l lVar = this.f967e;
                return new n(lVar.i, new d(lVar, 0));
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                s4.a aVar = new s4.a();
                this.f967e.a().f1020b.c(aVar);
                return aVar;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                l lVar2 = this.f967e;
                return new p0(lVar2.getApplication(), lVar2, lVar2.getIntent() != null ? lVar2.getIntent().getExtras() : null);
            default:
                l lVar3 = this.f967e;
                t tVar = new t(new c(lVar3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (q6.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        lVar3.f2714d.a(new e(tVar, lVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a1.e(1, lVar3, tVar));
                    }
                }
                return tVar;
        }
    }
}
