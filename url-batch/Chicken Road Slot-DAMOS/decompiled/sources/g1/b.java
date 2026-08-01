package g1;

import a4.j;
import android.view.DragEvent;
import android.view.View;
import c2.b2;
import c2.k;
import s.f;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final e f4226a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4227b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4228c;

    public b() {
        e eVar = new e();
        eVar.E = 0L;
        this.f4226a = eVar;
        this.f4227b = new f(0);
        this.f4228c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        d9.c cVar = new d9.c(22, dragEvent);
        int action = dragEvent.getAction();
        f fVar = this.f4227b;
        e eVar = this.f4226a;
        switch (action) {
            case 1:
                z zVar = new z();
                a3.e eVar2 = new a3.e(cVar, eVar, zVar);
                if (eVar2.invoke(eVar) == b2.f1499d) {
                    k.y(eVar, eVar2);
                }
                boolean z10 = zVar.f10164d;
                fVar.getClass();
                s.a aVar = new s.a(fVar);
                while (aVar.hasNext()) {
                    ((e) aVar.next()).M();
                }
                break;
            case 2:
                eVar.L(cVar);
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                a3.e eVar3 = new a3.e(12, cVar);
                if (eVar3.invoke(eVar) == b2.f1499d) {
                    k.y(eVar, eVar3);
                }
                fVar.clear();
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                eVar.J();
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar.K();
                break;
        }
        return false;
    }
}
