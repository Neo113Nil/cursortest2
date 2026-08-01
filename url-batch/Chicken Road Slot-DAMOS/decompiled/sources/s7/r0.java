package s7;

import android.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements w7.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8968d;

    /* renamed from: e, reason: collision with root package name */
    public long f8969e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8970i;

    public r0(g7.a aVar) {
        this.f8968d = 1;
        c7.c0.g(aVar);
        this.f8970i = aVar;
    }

    @Override // w7.c
    public void d(Exception exc) {
        z6.b bVar;
        switch (this.f8968d) {
            case 0:
                ((AtomicLong) ((p.e) this.f8970i).f7590r).set(this.f8969e);
                break;
            default:
                v6.c cVar = (v6.c) this.f8970i;
                long j = this.f8969e;
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof a7.e) && (bVar = ((a7.e) exc).f316d.f2122r) != null && bVar.f10867e == 24) {
                    cVar.f9983b.set(j);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r0(Object obj, long j, int i3) {
        this.f8968d = i3;
        this.f8970i = obj;
        this.f8969e = j;
    }
}
