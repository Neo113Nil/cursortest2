package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wk extends pr2 implements xt0 {
    public final /* synthetic */ int m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk(int i, o30 o30Var, int i2) {
        super(i, o30Var);
        this.m = i2;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.m) {
            case 0:
                wk wkVar = new wk(i, (o30) obj3, 0);
                wkVar.n = (jk) obj;
                wkVar.o = (String) obj2;
                return wkVar.invokeSuspend(Unit.a);
            default:
                wk wkVar2 = new wk(i, (o30) obj3, 1);
                wkVar2.n = (zk2) obj;
                wkVar2.o = (d42) obj2;
                return wkVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                jk jkVar = (jk) this.n;
                String str = (String) this.o;
                b50 b50Var = b50.m;
                ca2.b(obj);
                return new Pair(jkVar, str);
            default:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                zk2 zk2Var = (zk2) this.n;
                d42 d42Var = (d42) this.o;
                Set keySet = d42Var.a().keySet();
                ArrayList arrayList = new ArrayList(rv.l(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b42) it.next()).a);
                }
                Map<String, ?> all = zk2Var.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(li1.a(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = zv.Q((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        on1 on1Var = new on1(new LinkedHashMap(d42Var.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str2 = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                str2.getClass();
                                on1Var.d(new b42(str2), value2);
                            } else if (value2 instanceof Float) {
                                str2.getClass();
                                on1Var.d(new b42(str2), value2);
                            } else if (value2 instanceof Integer) {
                                str2.getClass();
                                on1Var.d(new b42(str2), value2);
                            } else if (value2 instanceof Long) {
                                str2.getClass();
                                on1Var.d(new b42(str2), value2);
                            } else if (value2 instanceof String) {
                                str2.getClass();
                                on1Var.d(new b42(str2), value2);
                            } else if (value2 instanceof Set) {
                                str2.getClass();
                                on1Var.d(new b42(str2), (Set) value2);
                            }
                        }
                        return new on1(new LinkedHashMap(on1Var.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = zk2Var.b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
        }
    }
}
