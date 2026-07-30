package com.onesignal.core.internal.backend.impl;

import A6.AbstractC0091c;
import A6.C0090b;
import A6.EnumC0089a;
import A6.h;
import A6.j;
import A6.l;
import A6.r;
import A6.y;
import B6.m;
import B6.n;
import c2.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.C;
import kotlin.collections.C0633l;
import kotlin.collections.I;
import kotlin.collections.s;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.StringsKt;
import w2.g;

/* loaded from: classes.dex */
public final class b {
    private static final String FEATURES_PROPERTY = "features";
    public static final b INSTANCE = new b();
    private static final AbstractC0091c format;

    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return Unit.f6114a;
        }

        public final void invoke(h Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.f107b = true;
        }
    }

    static {
        a builderAction = a.INSTANCE;
        C0090b json = AbstractC0091c.f96d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        h hVar = new h();
        j jVar = json.f97a;
        hVar.f106a = jVar.f115c;
        hVar.f107b = jVar.f114b;
        String str = (String) jVar.f117e;
        hVar.f108c = str;
        hVar.f109d = (String) jVar.f118f;
        hVar.f110e = (EnumC0089a) jVar.f119g;
        hVar.f111f = jVar.f116d;
        hVar.f112g = json.f98b;
        builderAction.invoke((Object) hVar);
        if (!Intrinsics.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z7 = hVar.f107b;
        boolean z8 = hVar.f106a;
        String str2 = hVar.f108c;
        String discriminator = hVar.f109d;
        j configuration = new j(z7, z8, str2, discriminator, hVar.f111f, hVar.f110e);
        e module = hVar.f112g;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        r rVar = new r(configuration, module);
        if (!Intrinsics.a(module, C6.a.f319a)) {
            Intrinsics.checkNotNullParameter(discriminator, "discriminator");
            n collector = new n();
            module.getClass();
            Intrinsics.checkNotNullParameter(collector, "collector");
            C c7 = C.f6117d;
            c7.getClass();
            z zVar = z.f6139d;
            zVar.getClass();
            c7.getClass();
            zVar.getClass();
            c7.getClass();
            zVar.getClass();
            c7.getClass();
            zVar.getClass();
        }
        format = rVar;
    }

    private b() {
    }

    private final String canonicalFeatureFlagId(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(Character.toLowerCase(str.charAt(i2)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final y findSiblingJsonObject(y yVar, String str, String str2) {
        for (String str3 : kotlin.collections.r.d(str, str2)) {
            if (!Intrinsics.a(str3, FEATURES_PROPERTY)) {
                l lVar = (l) yVar.get(str3);
                if (lVar instanceof y) {
                    return (y) lVar;
                }
            }
        }
        for (Map.Entry entry : yVar.f141d.entrySet()) {
            String str4 = (String) entry.getKey();
            l lVar2 = (l) entry.getValue();
            if (!Intrinsics.a(str4, FEATURES_PROPERTY) && kotlin.text.p.g(str4, str) && (lVar2 instanceof y)) {
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
        Pair pair;
        String a7;
        String obj;
        l lVar = (l) yVar.get(FEATURES_PROPERTY);
        if (lVar != null) {
            A6.e eVar = lVar instanceof A6.e ? (A6.e) lVar : null;
            if (eVar != null) {
                List<l> list = eVar.f100d;
                ArrayList arrayList = new ArrayList();
                for (l lVar2 : list) {
                    A6.C c7 = lVar2 instanceof A6.C ? (A6.C) lVar2 : null;
                    if (c7 != null) {
                        if (!c7.b()) {
                            c7 = null;
                        }
                        if (c7 != null && (a7 = c7.a()) != null && (obj = StringsKt.J(a7).toString()) != null) {
                            if (obj.length() <= 0) {
                                obj = null;
                            }
                            if (obj != null) {
                                pair = new Pair(obj, INSTANCE.canonicalFeatureFlagId(obj));
                                if (pair == null) {
                                    arrayList.add(pair);
                                }
                            }
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    if (hashSet.add((String) ((Pair) obj2).f6113e)) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(s.g(arrayList2, 10));
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj3 = arrayList2.get(i7);
                        i7++;
                        arrayList3.add((String) ((Pair) obj3).f6113e);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size3 = arrayList2.size();
                    while (i2 < size3) {
                        Object obj4 = arrayList2.get(i2);
                        i2++;
                        Pair pair2 = (Pair) obj4;
                        String str = (String) pair2.f6112d;
                        String key = (String) pair2.f6113e;
                        y element = INSTANCE.findSiblingJsonObject(yVar, str, key);
                        if (element != null) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(element, "element");
                        }
                    }
                    return new g(arrayList3, linkedHashMap.isEmpty() ? null : new y(linkedHashMap));
                }
                if (list.isEmpty()) {
                    return new g(A.f6115d, null);
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
        AbstractC0091c abstractC0091c = format;
        w6.a serializer = l.Companion.serializer();
        abstractC0091c.getClass();
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        B6.p pVar = new B6.p(0, (byte) 0);
        B6.b bVar = B6.b.f214c;
        synchronized (bVar) {
            C0633l c0633l = (C0633l) bVar.f216b;
            char[] cArr2 = (char[]) (c0633l.isEmpty() ? null : c0633l.removeLast());
            if (cArr2 != null) {
                bVar.f215a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        pVar.f234c = cArr;
        try {
            m.e(abstractC0091c, pVar, serializer, yVar);
            return pVar.toString();
        } finally {
            pVar.h();
        }
    }

    public final AbstractC0091c getFormat() {
        return format;
    }

    public final g parse(String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        g parseSuccessful = parseSuccessful(payload);
        return parseSuccessful == null ? g.Companion.getEMPTY() : parseSuccessful;
    }

    public final Map<String, y> parseStoredMetadataMap(String str) {
        if (str == null || StringsKt.z(str)) {
            return I.c();
        }
        try {
            l a7 = format.a(str);
            y yVar = a7 instanceof y ? (y) a7 : null;
            if (yVar == null) {
                return I.c();
            }
            Set<Map.Entry> entrySet = yVar.f141d.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : entrySet) {
                String str2 = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                y yVar2 = lVar instanceof y ? (y) lVar : null;
                Pair pair = yVar2 != null ? new Pair(str2, yVar2) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return I.h(arrayList);
        } catch (Throwable unused) {
            return I.c();
        }
    }

    public final g parseSuccessful(String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        try {
            l a7 = format.a(payload);
            y yVar = a7 instanceof y ? (y) a7 : null;
            if (yVar == null) {
                return null;
            }
            return parseRootStrict(yVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
