package b8;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: d, reason: collision with root package name */
    public final q f1429d;

    public j() {
        super(4);
        this.f1429d = q.f1439d;
    }

    public final z c() {
        z zVar;
        Object[] objArr = this.f1410a;
        int i3 = this.f1411b;
        q qVar = this.f1429d;
        if (i3 == 0) {
            zVar = k.o(qVar);
        } else {
            z4.w.j(i3, objArr);
            Arrays.sort(objArr, 0, i3, qVar);
            int i10 = 1;
            for (int i11 = 1; i11 < i3; i11++) {
                Object obj = objArr[i11];
                if (qVar.compare(obj, objArr[i10 - 1]) != 0) {
                    objArr[i10] = obj;
                    i10++;
                }
            }
            Arrays.fill(objArr, i10, i3, (Object) null);
            if (i10 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i10);
            }
            zVar = new z(g.k(i10, objArr), qVar);
        }
        this.f1411b = zVar.f1467u.size();
        this.f1412c = true;
        return zVar;
    }
}
