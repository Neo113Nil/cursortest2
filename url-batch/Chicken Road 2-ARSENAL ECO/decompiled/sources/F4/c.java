package F4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class c extends D4.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f755b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f756c;

    public c(j[] jVarArr) {
        super(D4.j.e(J4.a.f1290a, jVarArr));
        this.f756c = jVarArr;
    }

    public static c d(List list, Function function) {
        int size = list.size();
        D4.f[] fVarArr = new D4.f[size];
        for (int i7 = 0; i7 < size; i7++) {
            fVarArr[i7] = (D4.f) function.apply(list.get(i7));
        }
        return new c(new b(fVarArr));
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        switch (this.f755b) {
            case 0:
                nVar.a(K4.a.f1375e, (b) this.f756c);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                nVar.a(K4.a.f1376f, (b) this.f756c);
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                nVar.h(M4.a.f1581a, (m[]) this.f756c);
                break;
            default:
                nVar.h(J4.a.f1290a, (j[]) this.f756c);
                break;
        }
    }

    public c(b bVar, byte b7) {
        super(D4.j.d(K4.a.f1376f, bVar));
        this.f756c = bVar;
    }

    public c(b bVar) {
        super(D4.j.d(K4.a.f1375e, bVar));
        this.f756c = bVar;
    }

    public c(m[] mVarArr) {
        super(D4.j.e(M4.a.f1581a, mVarArr));
        this.f756c = mVarArr;
    }
}
