package X;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final long f3491c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3492d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3493e;

    public c(int i4, long j4) {
        super(i4);
        this.f3491c = j4;
        this.f3492d = new ArrayList();
        this.f3493e = new ArrayList();
    }

    public final c h(int i4) {
        ArrayList arrayList = this.f3493e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = (c) arrayList.get(i5);
            if (cVar.f3496b == i4) {
                return cVar;
            }
        }
        return null;
    }

    public final d i(int i4) {
        ArrayList arrayList = this.f3492d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) arrayList.get(i5);
            if (dVar.f3496b == i4) {
                return dVar;
            }
        }
        return null;
    }

    @Override // X.e
    public final String toString() {
        return e.d(this.f3496b) + " leaves: " + Arrays.toString(this.f3492d.toArray()) + " containers: " + Arrays.toString(this.f3493e.toArray());
    }
}
