package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f444o;

    public e(f fVar) {
        this.f444o = fVar;
    }

    @Override // b4.d
    public final void F(Throwable th) {
        this.f444o.f445a.d(th);
    }

    @Override // b4.d
    public final void K(a0.k kVar) {
        f fVar = this.f444o;
        fVar.f447c = kVar;
        a0.k kVar2 = fVar.f447c;
        l lVar = fVar.f445a;
        o2.f fVar2 = lVar.f460g;
        d dVar = lVar.i;
        Set<int[]> a5 = Build.VERSION.SDK_INT >= 34 ? p.a() : b4.l.v();
        t tVar = new t();
        tVar.f472a = fVar2;
        tVar.f473b = kVar2;
        tVar.f474c = dVar;
        if (!a5.isEmpty()) {
            for (int[] iArr : a5) {
                String str = new String(iArr, 0, iArr.length);
                tVar.j(str, 0, str.length(), 1, true, new a0.a(2, str));
            }
        }
        fVar.f446b = tVar;
        l lVar2 = fVar.f445a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f455a.writeLock().lock();
        try {
            lVar2.f457c = 1;
            arrayList.addAll(lVar2.f456b);
            lVar2.f456b.clear();
            lVar2.f455a.writeLock().unlock();
            lVar2.d.post(new j(arrayList, lVar2.f457c, (Throwable) null));
        } catch (Throwable th) {
            lVar2.f455a.writeLock().unlock();
            throw th;
        }
    }
}
