package G3;

import android.view.ViewGroup;
import androidx.fragment.app.C0209m;
import c3.C0297i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f885h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i4) {
        super(0);
        this.f882e = i4;
        this.f883f = obj;
        this.f884g = obj2;
        this.f885h = obj3;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        switch (this.f882e) {
            case 0:
                List list = (List) this.f884g;
                O3.l lVar = ((e) this.f883f).f888b;
                List e4 = lVar == null ? null : lVar.e((String) this.f885h, list);
                if (e4 != null) {
                    list = e4;
                }
                ArrayList arrayList = new ArrayList(d3.k.Y(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            case 1:
                O3.l lVar2 = ((e) this.f883f).f888b;
                kotlin.jvm.internal.i.b(lVar2);
                return lVar2.e(((C0050a) this.f885h).f863h.f950d, ((l) this.f884g).a());
            default:
                ((C0209m) this.f883f).f4914f.c((ViewGroup) this.f884g, this.f885h);
                return C0297i.f5732a;
        }
    }
}
