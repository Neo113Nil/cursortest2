package r3;

import android.content.Context;
import android.util.SparseIntArray;
import p3.a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f21246a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private o3.f f21247b;

    public d0(o3.f fVar) {
        o.i(fVar);
        this.f21247b = fVar;
    }

    public final int a(Context context, a.f fVar) {
        o.i(context);
        o.i(fVar);
        int i7 = 0;
        if (!fVar.h()) {
            return 0;
        }
        int j7 = fVar.j();
        int b7 = b(context, j7);
        if (b7 == -1) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.f21246a.size()) {
                    i7 = -1;
                    break;
                }
                int keyAt = this.f21246a.keyAt(i8);
                if (keyAt > j7 && this.f21246a.get(keyAt) == 0) {
                    break;
                }
                i8++;
            }
            b7 = i7 == -1 ? this.f21247b.h(context, j7) : i7;
            this.f21246a.put(j7, b7);
        }
        return b7;
    }

    public final int b(Context context, int i7) {
        return this.f21246a.get(i7, -1);
    }

    public final void c() {
        this.f21246a.clear();
    }
}
