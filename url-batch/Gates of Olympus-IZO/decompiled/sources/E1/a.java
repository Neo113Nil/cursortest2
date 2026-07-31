package E1;

import G1.r;
import H1.y;
import L1.z;
import M1.v;
import e2.AbstractC0381e;
import h1.C0438i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.descriptors.SerialDescriptor;
import q1.C0775D;
import x2.s;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Y1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f736f;

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f734d = i3;
        this.f735e = obj;
        this.f736f = obj2;
    }

    @Override // Y1.a
    public final Object b() {
        String[] names;
        switch (this.f734d) {
            case 0:
                String str = ((m) this.f736f).f769a;
                C0775D c0775d = (C0775D) this.f735e;
                b bVar = new b(c0775d, 0);
                c0775d.getClass();
                C0775D.k(c0775d, str, AbstractC0381e.G(bVar), 4);
                return z.f2729a;
            case 1:
                ((r) this.f735e).f(new G1.c(((com.gates.olympus.miruv.data.b) this.f736f).getId()));
                return z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((y) this.f735e).e(new H1.k(((com.gates.olympus.miruv.data.b) this.f736f).getId()));
                return z.f2729a;
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                x2.c cVar = (x2.c) this.f736f;
                boolean z3 = cVar.f8732a.f8752m;
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.f735e;
                boolean z4 = z3 && Z1.i.a(serialDescriptor.i(), u2.g.f8549c);
                y2.e.i(serialDescriptor, cVar);
                int l3 = serialDescriptor.l();
                for (int i3 = 0; i3 < l3; i3++) {
                    List g3 = serialDescriptor.g(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : g3) {
                        if (obj instanceof s) {
                            arrayList.add(obj);
                        }
                    }
                    String str2 = null;
                    s sVar = (s) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (sVar != null && (names = sVar.names()) != null) {
                        for (String str3 : names) {
                            if (z4) {
                                str3 = str3.toLowerCase(Locale.ROOT);
                                Z1.i.e(str3, "toLowerCase(...)");
                            }
                            y2.e.b(linkedHashMap, serialDescriptor, str3, i3);
                        }
                    }
                    if (z4) {
                        str2 = serialDescriptor.a(i3).toLowerCase(Locale.ROOT);
                        Z1.i.e(str2, "toLowerCase(...)");
                    }
                    if (str2 != null) {
                        y2.e.b(linkedHashMap, serialDescriptor, str2, i3);
                    }
                }
                return linkedHashMap.isEmpty() ? v.f2804d : linkedHashMap;
        }
    }
}
