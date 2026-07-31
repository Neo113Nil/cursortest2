package com.onesignal.core.internal.backend.impl;

import N3.k;
import U1.g;
import U5.AbstractC0216c;
import U5.B;
import U5.C0215b;
import U5.EnumC0214a;
import U5.e;
import U5.h;
import U5.q;
import U5.x;
import V5.s;
import V5.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k5.C0477g;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.AbstractC0507k;
import l5.AbstractC0508l;
import l5.C0504h;
import l5.C0512p;
import l5.t;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b {
    private static final String FEATURES_PROPERTY = "features";
    public static final b INSTANCE = new b();
    private static final AbstractC0216c format;

    public static final class a extends j implements InterfaceC0743l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return v.f5219a;
        }

        public final void invoke(h Json) {
            i.e(Json, "$this$Json");
            Json.f2645b = true;
        }
    }

    static {
        a builderAction = a.INSTANCE;
        C0215b from = AbstractC0216c.f2634d;
        i.e(from, "from");
        i.e(builderAction, "builderAction");
        h hVar = new h();
        k kVar = from.f2635a;
        hVar.f2644a = kVar.f1722c;
        hVar.f2645b = kVar.f1721b;
        String str = (String) kVar.f1724e;
        hVar.f2646c = str;
        hVar.f2647d = (String) kVar.f1725f;
        hVar.f2648e = (EnumC0214a) kVar.f1726g;
        hVar.f2649f = kVar.f1723d;
        hVar.f2650g = from.f2636b;
        builderAction.invoke((Object) hVar);
        if (!i.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        k kVar2 = new k(hVar.f2645b, hVar.f2644a, hVar.f2646c, hVar.f2647d, hVar.f2649f, hVar.f2648e);
        U0.h module = hVar.f2650g;
        i.e(module, "module");
        format = new q(kVar2, module);
    }

    private b() {
    }

    private final String canonicalFeatureFlagId(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(Character.toLowerCase(str.charAt(i7)));
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    private final x findSiblingJsonObject(x xVar, String str, String str2) {
        for (String str3 : AbstractC0507k.z(str, str2)) {
            if (!i.a(str3, FEATURES_PROPERTY)) {
                U5.k kVar = (U5.k) xVar.get(str3);
                if (kVar instanceof x) {
                    return (x) kVar;
                }
            }
        }
        for (Map.Entry entry : xVar.f2672f.entrySet()) {
            String str4 = (String) entry.getKey();
            U5.k kVar2 = (U5.k) entry.getValue();
            if (!i.a(str4, FEATURES_PROPERTY) && F5.q.C(str4, str) && (kVar2 instanceof x)) {
                return (x) kVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final g parseRootStrict(x xVar) {
        C0477g c0477g;
        String a7;
        String obj;
        U5.k kVar = (U5.k) xVar.get(FEATURES_PROPERTY);
        if (kVar != null) {
            e eVar = kVar instanceof e ? (e) kVar : null;
            if (eVar != null) {
                List<U5.k> list = eVar.f2638f;
                ArrayList arrayList = new ArrayList();
                for (U5.k kVar2 : list) {
                    B b7 = kVar2 instanceof B ? (B) kVar2 : null;
                    if (b7 != null) {
                        if (!b7.b()) {
                            b7 = null;
                        }
                        if (b7 != null && (a7 = b7.a()) != null && (obj = F5.j.h0(a7).toString()) != null) {
                            if (obj.length() <= 0) {
                                obj = null;
                            }
                            if (obj != null) {
                                c0477g = new C0477g(obj, INSTANCE.canonicalFeatureFlagId(obj));
                                if (c0477g == null) {
                                    arrayList.add(c0477g);
                                }
                            }
                        }
                    }
                    c0477g = null;
                    if (c0477g == null) {
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    if (hashSet.add((String) ((C0477g) obj2).f5199g)) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(AbstractC0508l.C(arrayList2, 10));
                    int size2 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj3 = arrayList2.get(i9);
                        i9++;
                        arrayList3.add((String) ((C0477g) obj3).f5199g);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size3 = arrayList2.size();
                    while (i7 < size3) {
                        Object obj4 = arrayList2.get(i7);
                        i7++;
                        C0477g c0477g2 = (C0477g) obj4;
                        String str = (String) c0477g2.f5198f;
                        String key = (String) c0477g2.f5199g;
                        x findSiblingJsonObject = INSTANCE.findSiblingJsonObject(xVar, str, key);
                        if (findSiblingJsonObject != null) {
                            i.e(key, "key");
                        }
                    }
                    return new g(arrayList3, linkedHashMap.isEmpty() ? null : new x(linkedHashMap));
                }
                if (list.isEmpty()) {
                    return new g(C0512p.f5303f, null);
                }
            }
        }
        return null;
    }

    public final String encodeMetadata(x xVar) {
        char[] cArr = null;
        if (xVar == null) {
            return null;
        }
        AbstractC0216c abstractC0216c = format;
        Q5.a serializer = U5.k.Companion.serializer();
        abstractC0216c.getClass();
        i.e(serializer, "serializer");
        A.j jVar = new A.j(3);
        V5.b bVar = V5.b.f2726c;
        synchronized (bVar) {
            C0504h c0504h = bVar.f2727a;
            char[] cArr2 = (char[]) (c0504h.isEmpty() ? null : c0504h.removeLast());
            if (cArr2 != null) {
                bVar.f2728b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        jVar.f27c = cArr;
        try {
            new s(new D3.B(jVar), abstractC0216c, w.f2775h, new s[w.f2780m.a()]).m(serializer, xVar);
            return jVar.toString();
        } finally {
            jVar.g();
        }
    }

    public final AbstractC0216c getFormat() {
        return format;
    }

    public final g parse(String payload) {
        i.e(payload, "payload");
        g parseSuccessful = parseSuccessful(payload);
        return parseSuccessful == null ? g.Companion.getEMPTY() : parseSuccessful;
    }

    public final Map<String, x> parseStoredMetadataMap(String str) {
        if (str != null && !F5.j.T(str)) {
            try {
                U5.k a7 = format.a(str);
                x xVar = a7 instanceof x ? (x) a7 : null;
                if (xVar != null) {
                    Set<Map.Entry> entrySet = xVar.f2672f.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        String str2 = (String) entry.getKey();
                        U5.k kVar = (U5.k) entry.getValue();
                        x xVar2 = kVar instanceof x ? (x) kVar : null;
                        C0477g c0477g = xVar2 != null ? new C0477g(str2, xVar2) : null;
                        if (c0477g != null) {
                            arrayList.add(c0477g);
                        }
                    }
                    return t.t0(arrayList);
                }
            } catch (Throwable unused) {
            }
        }
        return l5.q.f5304f;
    }

    public final g parseSuccessful(String payload) {
        i.e(payload, "payload");
        try {
            U5.k a7 = format.a(payload);
            x xVar = a7 instanceof x ? (x) a7 : null;
            if (xVar == null) {
                return null;
            }
            return parseRootStrict(xVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
