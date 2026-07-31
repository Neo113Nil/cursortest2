package r4;

import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import d6.m;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6576e;

    public /* synthetic */ d(int i, Object obj) {
        this.f6575d = i;
        this.f6576e = obj;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f6575d) {
            case 0:
                g gVar = (g) this.f6576e;
                gVar.f6599q = oVar.a();
                if (gVar.f6586c != null) {
                    ArrayList h02 = m.h0(gVar.f6589f);
                    int size = h02.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = h02.get(i);
                        i++;
                        o4.d dVar = (o4.d) obj;
                        dVar.getClass();
                        c cVar = dVar.f5626k;
                        cVar.getClass();
                        cVar.f6563a.f5623g = oVar.a();
                        cVar.f6566d = oVar.a();
                        cVar.b();
                    }
                    break;
                }
                break;
            default:
                z4.a aVar = (z4.a) this.f6576e;
                if (oVar != o.ON_START) {
                    if (oVar == o.ON_STOP) {
                        aVar.f9177h = false;
                        break;
                    }
                } else {
                    aVar.f9177h = true;
                    break;
                }
                break;
        }
    }
}
