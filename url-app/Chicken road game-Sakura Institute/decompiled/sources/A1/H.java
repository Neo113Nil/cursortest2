package A1;

import G.C0205j0;
import G.InterfaceC0191c0;
import android.content.Context;
import android.content.Intent;
import j3.AbstractC0724c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s1.C1183B;
import z1.AbstractC1366J;
import z1.C1367K;
import z1.C1372P;
import z1.C1377c;
import z1.C1381g;
import z1.C1393s;
import z1.EnumC1375a;
import z1.EnumC1387m;
import z1.EnumC1388n;
import z2.C1403G;
import z2.C1412P;
import z2.C1441y;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f469e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f470i;

    public /* synthetic */ H(Object obj, int i2, Object obj2) {
        this.f468d = i2;
        this.f469e = obj;
        this.f470i = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        String str;
        String str2;
        String str3;
        String[] names;
        String str4 = "<this>";
        Object obj2 = null;
        int i2 = 0;
        Object obj3 = this.f469e;
        Object obj4 = this.f470i;
        switch (this.f468d) {
            case 0:
                StringBuilder sb = new StringBuilder();
                C1372P c1372p = (C1372P) obj4;
                sb.append("HEAT SHEET — " + c1372p.f11838b + "\n");
                sb.append(c1372p.f11839c + " · " + c1372p.f11840d + "\n\n");
                Q.v vVar = AbstractC1366J.f11817c;
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = vVar.listIterator();
                while (true) {
                    A2.b bVar = (A2.b) listIterator;
                    if (!bVar.hasNext()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                C1441y.g();
                                throw null;
                            }
                            C1381g c1381g = (C1381g) next;
                            sb.append(i4 + ". " + AbstractC0071n0.j(c1381g) + "\n");
                            Q.v vVar2 = AbstractC1366J.f11820f;
                            ArrayList arrayList2 = new ArrayList();
                            ListIterator listIterator2 = vVar2.listIterator();
                            while (true) {
                                A2.b bVar2 = (A2.b) listIterator2;
                                if (bVar2.hasNext()) {
                                    Object next2 = bVar2.next();
                                    if (Intrinsics.a(((C1393s) next2).f11908b, c1381g.f11863a)) {
                                        arrayList2.add(next2);
                                    }
                                } else {
                                    List<C1393s> D3 = C1403G.D(arrayList2, new C0062j(2));
                                    if (D3.isEmpty()) {
                                        sb.append("   (no heats)\n");
                                    }
                                    for (C1393s c1393s : D3) {
                                        sb.append("   Heat " + c1393s.f11909c + ":\n");
                                        Map map = c1393s.f11910d;
                                        Intrinsics.checkNotNullParameter(map, str4);
                                        for (Map.Entry entry : new TreeMap(map).entrySet()) {
                                            Integer num = (Integer) entry.getKey();
                                            String str5 = (String) entry.getValue();
                                            ListIterator listIterator3 = AbstractC1366J.f11818d.listIterator();
                                            while (true) {
                                                A2.b bVar3 = (A2.b) listIterator3;
                                                if (bVar3.hasNext()) {
                                                    obj = bVar3.next();
                                                    if (Intrinsics.a(((C1377c) obj).f11851a, str5)) {
                                                    }
                                                } else {
                                                    obj = obj2;
                                                }
                                            }
                                            C1377c c1377c = (C1377c) obj;
                                            Long l4 = (Long) c1393s.f11911e.get(num);
                                            String k4 = l4 != null ? AbstractC0071n0.k(l4.longValue()) : "-";
                                            String str6 = "?";
                                            String valueOf = c1377c != null ? Integer.valueOf(c1377c.f11853c) : "?";
                                            if (c1377c == null || (str = c1377c.f11852b) == null) {
                                                str = "?";
                                            }
                                            if (c1377c != null && (str2 = c1377c.f11854d) != null) {
                                                str6 = str2;
                                            }
                                            sb.append("     L" + num + " · #" + valueOf + " " + str + " (" + str6 + ") · " + k4 + "\n");
                                            str4 = str4;
                                            obj2 = null;
                                        }
                                    }
                                    sb.append("\n");
                                    i2 = i4;
                                    obj2 = null;
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", sb2);
                        intent.putExtra("android.intent.extra.SUBJECT", "Heat sheet: " + c1372p.f11838b);
                        ((Context) obj3).startActivity(Intent.createChooser(intent, "Share heat sheet"));
                        return Unit.f7487a;
                    }
                    Object next3 = bVar.next();
                    if (Intrinsics.a(((C1381g) next3).f11864b, c1372p.f11837a)) {
                        arrayList.add(next3);
                    }
                }
                break;
            case 1:
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) obj4;
                if (((Number) interfaceC0191c0.getValue()).intValue() < ((List) obj3).size() - 1) {
                    interfaceC0191c0.setValue(Integer.valueOf(((Number) interfaceC0191c0.getValue()).intValue() + 1));
                }
                return Unit.f7487a;
            case 2:
                C0205j0 c0205j0 = AbstractC0071n0.f634a;
                ((InterfaceC0191c0) obj4).setValue((EnumC1375a) obj3);
                return Unit.f7487a;
            case 3:
                C0205j0 c0205j02 = AbstractC0071n0.f634a;
                ((InterfaceC0191c0) obj4).setValue((EnumC1387m) obj3);
                return Unit.f7487a;
            case 4:
                C0205j0 c0205j03 = AbstractC0071n0.f634a;
                ((InterfaceC0191c0) obj4).setValue((EnumC1388n) obj3);
                return Unit.f7487a;
            case 5:
                ((InterfaceC0191c0) obj4).setValue((String) obj3);
                return Unit.f7487a;
            case 6:
                SimpleDateFormat simpleDateFormat = R0.f534a;
                ((InterfaceC0191c0) obj3).setValue(null);
                R0.b((InterfaceC0191c0) obj4, false);
                return Unit.f7487a;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC0724c abstractC0724c = (AbstractC0724c) obj4;
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj3;
                boolean z4 = abstractC0724c.f7173a.f7210m && Intrinsics.a(serialDescriptor.i(), g3.h.f6806h);
                k3.h.n(abstractC0724c, serialDescriptor);
                int l5 = serialDescriptor.l();
                for (int i5 = 0; i5 < l5; i5++) {
                    List g4 = serialDescriptor.g(i5);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : g4) {
                        if (obj5 instanceof j3.t) {
                            arrayList3.add(obj5);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                    j3.t tVar = (j3.t) (arrayList3.size() == 1 ? arrayList3.get(0) : null);
                    if (tVar != null && (names = tVar.names()) != null) {
                        for (String str7 : names) {
                            if (z4) {
                                str7 = str7.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(str7, "toLowerCase(...)");
                            }
                            k3.h.f(linkedHashMap, serialDescriptor, str7, i5);
                        }
                    }
                    if (z4) {
                        str3 = serialDescriptor.a(i5).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        k3.h.f(linkedHashMap, serialDescriptor, str3, i5);
                    }
                }
                return linkedHashMap.isEmpty() ? C1412P.c() : linkedHashMap;
            default:
                String route = ((C1367K) obj4).f11827a;
                v0 builder = new v0(11);
                C1183B c1183b = (C1183B) obj3;
                c1183b.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(builder, "builder");
                C1183B.l(c1183b, route, m3.o.q(builder), 4);
                return Unit.f7487a;
        }
    }
}
