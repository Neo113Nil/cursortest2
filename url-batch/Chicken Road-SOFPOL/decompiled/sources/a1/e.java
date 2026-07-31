package a1;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import b.l;
import b.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f194f;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f192d = i;
        this.f193e = obj;
        this.f194f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f192d) {
            case 0:
                a.a.h((h) this.f193e, (LongSparseArray) this.f194f);
                break;
            case 1:
                l lVar = (l) this.f193e;
                lVar.f2714d.a(new b.e((t) this.f194f, lVar));
                break;
            default:
                ((h3.b) this.f193e).e((Typeface) this.f194f);
                break;
        }
    }
}
