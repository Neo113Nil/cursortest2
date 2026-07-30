package com.onesignal.core.internal.backend.impl;

import C3.e;
import E7.l;
import M7.q;
import b8.AbstractC0534c;
import b8.C;
import b8.C0533b;
import b8.EnumC0532a;
import b8.h;
import b8.j;
import b8.r;
import b8.y;
import c8.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import q7.C4938g;
import q7.v;
import r7.AbstractC4980k;
import r7.AbstractC4981l;
import r7.C4977h;
import r7.C4985p;
import r7.t;
import u4.g;

/* loaded from: classes2.dex */
public final class b {
    private static final String FEATURES_PROPERTY = "features";
    public static final b INSTANCE = new b();
    private static final AbstractC0534c format;

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return v.f40183a;
        }

        public final void invoke(h Json) {
            kotlin.jvm.internal.h.e(Json, "$this$Json");
            Json.f5593b = true;
        }
    }

    static {
        a builderAction = a.INSTANCE;
        C0533b from = AbstractC0534c.f5582d;
        kotlin.jvm.internal.h.e(from, "from");
        kotlin.jvm.internal.h.e(builderAction, "builderAction");
        h hVar = new h();
        j jVar = from.f5583a;
        hVar.f5592a = jVar.f5601c;
        hVar.f5593b = jVar.f5600b;
        String str = (String) jVar.f5603e;
        hVar.f5594c = str;
        hVar.f5595d = (String) jVar.f5604f;
        hVar.f5596e = (EnumC0532a) jVar.f5605g;
        hVar.f5597f = jVar.f5602d;
        hVar.f5598g = from.f5584b;
        builderAction.invoke((Object) hVar);
        if (!kotlin.jvm.internal.h.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        j jVar2 = new j(hVar.f5593b, hVar.f5592a, hVar.f5594c, hVar.f5595d, hVar.f5597f, hVar.f5596e);
        e module = hVar.f5598g;
        kotlin.jvm.internal.h.e(module, "module");
        format = new r(jVar2, module);
    }

    private b() {
    }

    private final String canonicalFeatureFlagId(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    private final y findSiblingJsonObject(y yVar, String str, String str2) {
        for (String str3 : AbstractC4980k.B(str, str2)) {
            if (!kotlin.jvm.internal.h.a(str3, FEATURES_PROPERTY)) {
                b8.l lVar = (b8.l) yVar.get(str3);
                if (lVar instanceof y) {
                    return (y) lVar;
                }
            }
        }
        for (Map.Entry entry : yVar.f5627n.entrySet()) {
            String str4 = (String) entry.getKey();
            b8.l lVar2 = (b8.l) entry.getValue();
            if (!kotlin.jvm.internal.h.a(str4, FEATURES_PROPERTY) && q.C(str4, str) && (lVar2 instanceof y)) {
                return (y) lVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final g parseRootStrict(y yVar) {
        C4938g c4938g;
        String a9;
        String obj;
        b8.l lVar = (b8.l) yVar.get(FEATURES_PROPERTY);
        if (lVar != null) {
            b8.e eVar = lVar instanceof b8.e ? (b8.e) lVar : null;
            if (eVar != null) {
                ArrayList arrayList = new ArrayList();
                List<b8.l> list = eVar.f5586n;
                for (b8.l lVar2 : list) {
                    C c4 = lVar2 instanceof C ? (C) lVar2 : null;
                    if (c4 != null) {
                        if (!c4.c()) {
                            c4 = null;
                        }
                        if (c4 != null && (a9 = c4.a()) != null && (obj = M7.j.h0(a9).toString()) != null) {
                            if (obj.length() <= 0) {
                                obj = null;
                            }
                            if (obj != null) {
                                c4938g = new C4938g(obj, INSTANCE.canonicalFeatureFlagId(obj));
                                if (c4938g == null) {
                                    arrayList.add(c4938g);
                                }
                            }
                        }
                    }
                    c4938g = null;
                    if (c4938g == null) {
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add((String) ((C4938g) next).f40163u)) {
                        arrayList2.add(next);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(AbstractC4981l.E(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((String) ((C4938g) it2.next()).f40163u);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        C4938g c4938g2 = (C4938g) it3.next();
                        String str = (String) c4938g2.f40162n;
                        String key = (String) c4938g2.f40163u;
                        y findSiblingJsonObject = INSTANCE.findSiblingJsonObject(yVar, str, key);
                        if (findSiblingJsonObject != null) {
                            kotlin.jvm.internal.h.e(key, "key");
                        }
                    }
                    return new g(arrayList3, linkedHashMap.isEmpty() ? null : new y(linkedHashMap));
                }
                if (list.isEmpty()) {
                    return new g(C4985p.f40358n, null);
                }
            }
        }
        return null;
    }

    public final String encodeMetadata(y yVar) {
        char[] cArr = null;
        if (yVar == null) {
            return null;
        }
        AbstractC0534c abstractC0534c = format;
        X7.a serializer = b8.l.Companion.serializer();
        abstractC0534c.getClass();
        kotlin.jvm.internal.h.e(serializer, "serializer");
        G1.a aVar = new G1.a((char) 0, 3);
        c8.b bVar = c8.b.f5764c;
        synchronized (bVar) {
            C4977h c4977h = (C4977h) bVar.f5766b;
            char[] cArr2 = (char[]) (c4977h.isEmpty() ? null : c4977h.removeLast());
            if (cArr2 != null) {
                bVar.f5765a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.f1195v = cArr;
        try {
            new c8.r(new M.h(aVar), abstractC0534c, u.f5805v, new c8.r[u.f5804A.a()]).m(serializer, yVar);
            return aVar.toString();
        } finally {
            aVar.m();
        }
    }

    public final AbstractC0534c getFormat() {
        return format;
    }

    public final g parse(String payload) {
        kotlin.jvm.internal.h.e(payload, "payload");
        g parseSuccessful = parseSuccessful(payload);
        return parseSuccessful == null ? g.Companion.getEMPTY() : parseSuccessful;
    }

    public final Map<String, y> parseStoredMetadataMap(String str) {
        r7.q qVar = r7.q.f40359n;
        if (str != null && !M7.j.T(str)) {
            try {
                b8.l a9 = format.a(str);
                y yVar = a9 instanceof y ? (y) a9 : null;
                if (yVar != null) {
                    Set<Map.Entry> entrySet = yVar.f5627n.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        String str2 = (String) entry.getKey();
                        b8.l lVar = (b8.l) entry.getValue();
                        y yVar2 = lVar instanceof y ? (y) lVar : null;
                        C4938g c4938g = yVar2 != null ? new C4938g(str2, yVar2) : null;
                        if (c4938g != null) {
                            arrayList.add(c4938g);
                        }
                    }
                    return t.D(arrayList);
                }
            } catch (Throwable unused) {
            }
        }
        return qVar;
    }

    public final g parseSuccessful(String payload) {
        kotlin.jvm.internal.h.e(payload, "payload");
        try {
            b8.l a9 = format.a(payload);
            y yVar = a9 instanceof y ? (y) a9 : null;
            if (yVar == null) {
                return null;
            }
            return parseRootStrict(yVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
