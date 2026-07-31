package E2;

import D2.s;
import R1.y;
import S1.v;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import e2.InterfaceC0422a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n.T;
import t1.C1013A;
import t1.C1016D;
import t1.u;
import t1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0422a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1053f;

    public /* synthetic */ g(Object obj, int i3, Object obj2) {
        this.f1051d = i3;
        this.f1052e = obj;
        this.f1053f = obj2;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        String str;
        String[] names;
        Object obj = this.f1052e;
        Object obj2 = this.f1053f;
        switch (this.f1051d) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                D2.c cVar = (D2.c) obj2;
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean z3 = cVar.f871a.f891m && f2.j.a(serialDescriptor.i(), A2.j.f256d);
                h.i(cVar, serialDescriptor);
                int l3 = serialDescriptor.l();
                for (int i3 = 0; i3 < l3; i3++) {
                    List g3 = serialDescriptor.g(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : g3) {
                        if (obj3 instanceof s) {
                            arrayList.add(obj3);
                        }
                    }
                    s sVar = (s) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (sVar != null && (names = sVar.names()) != null) {
                        for (String str2 : names) {
                            if (z3) {
                                str2 = str2.toLowerCase(Locale.ROOT);
                                f2.j.e(str2, "toLowerCase(...)");
                            }
                            h.b(linkedHashMap, serialDescriptor, str2, i3);
                        }
                    }
                    if (z3) {
                        str = serialDescriptor.a(i3).toLowerCase(Locale.ROOT);
                        f2.j.e(str, "toLowerCase(...)");
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        h.b(linkedHashMap, serialDescriptor, str, i3);
                    }
                }
                return linkedHashMap.isEmpty() ? v.f4321d : linkedHashMap;
            default:
                String str3 = ((M1.a) obj2).f3462d;
                C1013A c1013a = (C1013A) obj;
                A2.g gVar = new A2.g(3, c1013a);
                c1013a.getClass();
                C1016D n3 = T.n(gVar);
                if (c1013a.f8808c == null) {
                    throw new IllegalArgumentException(("Cannot navigate to " + str3 + ". Navigation graph has not been set for NavController " + c1013a + '.').toString());
                }
                x h3 = c1013a.h(c1013a.f8812g);
                t1.s l4 = h3.l(str3, true, h3);
                if (l4 == null) {
                    throw new IllegalArgumentException("Navigation destination that matches route " + str3 + " cannot be found in the navigation graph " + c1013a.f8808c);
                }
                u uVar = l4.f8923d;
                Bundle b3 = uVar.b(l4.f8924e);
                if (b3 == null) {
                    b3 = new Bundle();
                }
                Intent intent = new Intent();
                int i4 = u.f8930l;
                String str4 = uVar.f8937j;
                Uri parse = Uri.parse(str4 != null ? "android-app://androidx.navigation/".concat(str4) : "");
                f2.j.b(parse);
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                b3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                c1013a.j(uVar, b3, n3);
                return y.f4171a;
        }
    }
}
