package com.onesignal.core.internal.backend.impl;

import B4.k;
import G0.F;
import M4.a;
import Q4.AbstractC0149c;
import Q4.C;
import Q4.C0148b;
import Q4.EnumC0147a;
import Q4.h;
import Q4.j;
import Q4.l;
import Q4.r;
import Q4.y;
import R4.b;
import R4.m;
import W1.e;
import com.onesignal.core.internal.backend.RemoteFeatureFlagsResult;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import f4.C0430g;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import g4.C0463h;
import g4.C0471p;
import g4.C0472q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class FeatureFlagsJsonParser {
    private static final String FEATURES_PROPERTY = "features";
    public static final FeatureFlagsJsonParser INSTANCE = new FeatureFlagsJsonParser();
    private static final AbstractC0149c format;

    static {
        FeatureFlagsJsonParser$format$1 builderAction = FeatureFlagsJsonParser$format$1.INSTANCE;
        C0148b from = AbstractC0149c.f2500d;
        i.e(from, "from");
        i.e(builderAction, "builderAction");
        h hVar = new h();
        j jVar = from.f2501a;
        hVar.f2510a = jVar.f2526a;
        hVar.f2511b = jVar.f2531f;
        hVar.f2512c = jVar.f2527b;
        hVar.f2513d = jVar.f2528c;
        hVar.f2514e = jVar.f2529d;
        hVar.f2515f = jVar.f2530e;
        String str = jVar.f2532g;
        hVar.f2516g = str;
        hVar.f2517h = jVar.f2533h;
        boolean z = jVar.f2534i;
        hVar.f2518i = z;
        String str2 = jVar.f2535j;
        hVar.f2519j = str2;
        EnumC0147a enumC0147a = jVar.f2540o;
        hVar.f2520k = enumC0147a;
        hVar.f2521l = jVar.f2536k;
        hVar.f2522m = jVar.f2537l;
        hVar.f2523n = jVar.f2538m;
        hVar.f2524o = jVar.f2539n;
        hVar.f2525p = from.f2502b;
        builderAction.invoke((Object) hVar);
        if (z) {
            if (!i.a(str2, WebViewManager.EVENT_TYPE_KEY)) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (enumC0147a != EnumC0147a.f2498a) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (hVar.f2515f) {
            if (!i.a(str, "    ")) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!i.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        j jVar2 = new j(hVar.f2510a, hVar.f2512c, hVar.f2513d, hVar.f2514e, hVar.f2515f, hVar.f2511b, hVar.f2516g, hVar.f2517h, hVar.f2518i, hVar.f2519j, hVar.f2521l, hVar.f2522m, hVar.f2523n, hVar.f2524o, hVar.f2520k);
        e module = hVar.f2525p;
        i.e(module, "module");
        format = new r(jVar2, module);
    }

    private FeatureFlagsJsonParser() {
    }

    private final String canonicalFeatureFlagId(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(Character.toLowerCase(str.charAt(i2)));
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    private final y findSiblingJsonObject(y yVar, String str, String str2) {
        for (String str3 : AbstractC0466k.A0(str, str2)) {
            if (!i.a(str3, FEATURES_PROPERTY)) {
                l lVar = (l) yVar.get(str3);
                if (lVar instanceof y) {
                    return (y) lVar;
                }
            }
        }
        for (Map.Entry entry : yVar.f2563a.entrySet()) {
            String str4 = (String) entry.getKey();
            l lVar2 = (l) entry.getValue();
            if (!i.a(str4, FEATURES_PROPERTY) && B4.r.I(str4, str) && (lVar2 instanceof y)) {
                return (y) lVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RemoteFeatureFlagsResult parseRootStrict(y yVar) {
        C0430g c0430g;
        String c2;
        String obj;
        l lVar = (l) yVar.get(FEATURES_PROPERTY);
        if (lVar == null) {
            return null;
        }
        Q4.e eVar = lVar instanceof Q4.e ? (Q4.e) lVar : null;
        if (eVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<l> list = eVar.f2504a;
        for (l lVar2 : list) {
            C c6 = lVar2 instanceof C ? (C) lVar2 : null;
            if (c6 != null) {
                if (!c6.d()) {
                    c6 = null;
                }
                if (c6 != null && (c2 = c6.c()) != null && (obj = k.n0(c2).toString()) != null) {
                    if (obj.length() <= 0) {
                        obj = null;
                    }
                    if (obj != null) {
                        c0430g = new C0430g(obj, INSTANCE.canonicalFeatureFlagId(obj));
                        if (c0430g == null) {
                            arrayList.add(c0430g);
                        }
                    }
                }
            }
            c0430g = null;
            if (c0430g == null) {
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add((String) ((C0430g) next).f5669b)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            if (list.isEmpty()) {
                return new RemoteFeatureFlagsResult(C0471p.f5750a, null);
            }
            return null;
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0467l.D0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) ((C0430g) it2.next()).f5669b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C0430g c0430g2 = (C0430g) it3.next();
            String str = (String) c0430g2.f5668a;
            String key = (String) c0430g2.f5669b;
            y findSiblingJsonObject = INSTANCE.findSiblingJsonObject(yVar, str, key);
            if (findSiblingJsonObject != null) {
                i.e(key, "key");
            }
        }
        return new RemoteFeatureFlagsResult(arrayList3, linkedHashMap.isEmpty() ? null : new y(linkedHashMap));
    }

    public final String encodeMetadata(y yVar) {
        String str = null;
        char[] cArr = null;
        if (yVar != null) {
            AbstractC0149c abstractC0149c = format;
            a serializer = l.Companion.serializer();
            abstractC0149c.getClass();
            i.e(serializer, "serializer");
            F f3 = new F(4, (byte) 0);
            b bVar = b.f2675c;
            synchronized (bVar) {
                C0463h c0463h = (C0463h) bVar.f2677b;
                char[] cArr2 = (char[]) (c0463h.isEmpty() ? null : c0463h.removeLast());
                if (cArr2 != null) {
                    bVar.f2676a -= cArr2.length;
                    cArr = cArr2;
                }
            }
            if (cArr == null) {
                cArr = new char[128];
            }
            f3.f754c = cArr;
            try {
                m.f(abstractC0149c, f3, serializer, yVar);
                str = f3.toString();
            } finally {
                f3.c();
            }
        }
        return str;
    }

    public final AbstractC0149c getFormat() {
        return format;
    }

    public final RemoteFeatureFlagsResult parse(String payload) {
        i.e(payload, "payload");
        RemoteFeatureFlagsResult parseSuccessful = parseSuccessful(payload);
        return parseSuccessful == null ? RemoteFeatureFlagsResult.Companion.getEMPTY() : parseSuccessful;
    }

    public final Map<String, y> parseStoredMetadataMap(String str) {
        C0472q c0472q = C0472q.f5751a;
        if (str == null || k.Z(str)) {
            return c0472q;
        }
        try {
            l a6 = format.a(str);
            y yVar = a6 instanceof y ? (y) a6 : null;
            if (yVar == null) {
                return c0472q;
            }
            Set<Map.Entry> entrySet = yVar.f2563a.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : entrySet) {
                String str2 = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                y yVar2 = lVar instanceof y ? (y) lVar : null;
                C0430g c0430g = yVar2 != null ? new C0430g(str2, yVar2) : null;
                if (c0430g != null) {
                    arrayList.add(c0430g);
                }
            }
            return AbstractC0476u.c0(arrayList);
        } catch (Throwable unused) {
            return c0472q;
        }
    }

    public final RemoteFeatureFlagsResult parseSuccessful(String payload) {
        i.e(payload, "payload");
        try {
            l a6 = format.a(payload);
            y yVar = a6 instanceof y ? (y) a6 : null;
            if (yVar == null) {
                return null;
            }
            return parseRootStrict(yVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
