package pf;

import a1.n;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final String f7718d;

    /* renamed from: e, reason: collision with root package name */
    public final se f7719e;

    public c(String str, se seVar) {
        this.f7718d = str;
        this.f7719e = seVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jf.b bVar = (jf.b) this.f7719e.f2800i;
        bVar.getClass();
        ConcurrentHashMap concurrentHashMap = bVar.f5257c;
        lf.a aVar = (lf.a) concurrentHashMap.get(this.f7718d);
        if (aVar != null) {
            n nVar = (n) bVar.f5255a.f2801r;
            nVar.getClass();
            cf.b[] bVarArr = (cf.b[]) ((ConcurrentHashMap) nVar.f40e).values().toArray(new cf.b[0]);
            ArrayList arrayList = new ArrayList();
            for (cf.b bVar2 : bVarArr) {
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw v4.a.i(it);
            }
            concurrentHashMap.remove(aVar.f6017b);
        }
    }
}
