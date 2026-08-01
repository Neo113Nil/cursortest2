package h5;

import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import n9.c;
import q4.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4467e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f4466d = i3;
        this.f4467e = obj;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, o oVar) {
        switch (this.f4466d) {
            case 0:
                b bVar = (b) this.f4467e;
                if (oVar != o.ON_START) {
                    if (oVar == o.ON_STOP) {
                        bVar.f4474h = false;
                        break;
                    }
                } else {
                    bVar.f4474h = true;
                    break;
                }
                break;
            case 1:
                c cVar = (c) this.f4467e;
                if (oVar == o.ON_PAUSE) {
                    cVar.g();
                    break;
                }
                break;
            default:
                h hVar = (h) this.f4467e;
                hVar.f8008q = oVar.a();
                if (hVar.f7996c != null) {
                    ArrayList R = CollectionsKt.R(hVar.f7999f);
                    int size = R.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = R.get(i3);
                        i3++;
                        n4.h hVar2 = (n4.h) obj;
                        hVar2.getClass();
                        q4.c cVar2 = hVar2.f7069v;
                        cVar2.getClass();
                        cVar2.f7970a.f7065r = oVar.a();
                        cVar2.f7973d = oVar.a();
                        cVar2.b();
                    }
                    break;
                }
                break;
        }
    }
}
