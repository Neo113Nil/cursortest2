package U;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import u0.C0372k;

/* loaded from: classes.dex */
public final class e extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f1081e;

    public e(f fVar) {
        this.f1081e = fVar;
    }

    @Override // H1.d
    public final void S(Throwable th) {
        this.f1081e.f1082a.d(th);
    }

    @Override // H1.d
    public final void V(T0.m mVar) {
        f fVar = this.f1081e;
        fVar.f1084c = mVar;
        T0.m mVar2 = fVar.f1084c;
        j jVar = fVar.f1082a;
        R0.e eVar = jVar.f1095g;
        d dVar = jVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? o.a() : H1.l.G();
        C0372k c0372k = new C0372k();
        c0372k.f4190a = eVar;
        c0372k.f4191b = mVar2;
        c0372k.f4192c = dVar;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                c0372k.k(str, 0, str.length(), 1, true, new q(str, 0));
            }
        }
        fVar.f1083b = c0372k;
        j jVar2 = fVar.f1082a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f1090a.writeLock().lock();
        try {
            jVar2.f1092c = 1;
            arrayList.addAll(jVar2.f1091b);
            jVar2.f1091b.clear();
            jVar2.f1090a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f1092c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f1090a.writeLock().unlock();
            throw th;
        }
    }
}
