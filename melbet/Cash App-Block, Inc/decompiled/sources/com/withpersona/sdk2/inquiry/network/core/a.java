package com.withpersona.sdk2.inquiry.network.core;

import android.util.Base64;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.HexExtensionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class a {
    public static final a a = new a();

    /* renamed from: com.withpersona.sdk2.inquiry.network.core.a$a, reason: collision with other inner class name */
    public static final class C0077a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public C0077a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Pair pair = (Pair) t;
            Pair pair2 = (Pair) t2;
            return ComparisonsKt__ComparisonsKt.compareValues(CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{pair.first, pair.second}), null, null, null, 0, null, null, 63), CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{pair2.first, pair2.second}), null, null, null, 0, null, null, 63));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0077a a(long j, Request request, SubsystemLogger subsystemLogger) {
        C0077a c0077a;
        List split$default;
        List split$default2;
        Headers headers = request.headers;
        String str = headers.get("Authorization");
        RequestBody requestBody = request.body;
        if (str == null || requestBody == null) {
            return null;
        }
        try {
            String str2 = headers.get("User-Agent");
            try {
                if (str2 != null) {
                    if (!StringsKt.isBlank(str2)) {
                        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("User-Agent", str2), new Pair("VTDGJLGG", headers.get("VTDGJLGG")), new Pair("Persona-Device-Vendor-Id", headers.get("Persona-Device-Vendor-Id")), new Pair("Persona-Version", headers.get("Persona-Version")), new Pair("BMRWJMTB", headers.get("BMRWJMTB")));
                        mutableMapOf.put("TLJLGGDG", CollectionsKt.joinToString$default(SetsKt___SetsKt.plus(mutableMapOf.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62));
                        Set keySet = mutableMapOf.keySet();
                        Collection values = mutableMapOf.values();
                        split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
                        String str3 = (String) CollectionsKt.lastOrNull(split$default);
                        if (str3 == null) {
                            subsystemLogger.error("Auth token is null.");
                            return null;
                        }
                        split$default2 = StringsKt__StringsKt.split$default(str3, new String[]{"."}, false, 0, 6, null);
                        String optString = new JSONObject(new String(Base64.decode((String) split$default2.get(1), 0), Charsets.UTF_8)).optString("sub");
                        if (optString != null && !StringsKt.isBlank(optString)) {
                            String valueOf = String.valueOf(j / 1000);
                            return new C0077a(a(CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{optString, valueOf, StringsKt__StringsJVMKt.replace$default(c(requestBody).toString(), "\\/", "/")}), ":", null, null, 0, null, null, 62)), valueOf, a(CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{CollectionsKt.joinToString$default(values, "", null, null, 0, null, null, 62), valueOf, StringsKt__StringsJVMKt.replace$default(c(requestBody).toString(), "\\/", "/")}), ":", null, null, 0, null, null, 62)), CollectionsKt.joinToString$default(keySet, ", ", null, null, 0, null, null, 62));
                        }
                        subsystemLogger.error("Session token is null.");
                        return null;
                    }
                }
                subsystemLogger.error("User agent is null.");
                return null;
            } catch (Exception e) {
                e = e;
                c0077a = request;
                subsystemLogger.error("An unexpected error occurred: " + e.getMessage() + ".");
                return c0077a;
            }
        } catch (Exception e2) {
            e = e2;
            c0077a = 0;
        }
    }

    public final boolean b(List<String> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsJVMKt.startsWith((String) it.next(), "filename=", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final JSONArray c(RequestBody requestBody) {
        String replace;
        Pair pair;
        List<Pair<String, Object>> c = a.c(a(requestBody));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(c, 10));
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            String str = (String) pair2.first;
            String obj = pair2.second.toString();
            if (new Regex("^[+-]?\\d+(\\.\\d+)?$").matches(obj)) {
                pair = new Pair(str, StringsKt___StringsKt.take(10, obj));
            } else {
                replace = new Regex("\\s").replace(obj, "");
                pair = new Pair(str, replace);
            }
            arrayList.add(pair);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) ((Pair) next).second).length() > 0) {
                arrayList2.add(next);
            }
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            linkedHashMap.put((String) ((Pair) next2).first, next2);
        }
        List<Pair> sortedWith = CollectionsKt.sortedWith(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Pair pair3 : sortedWith) {
            String str2 = (String) pair3.first;
            String str3 = (String) pair3.second;
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public final String b(RequestBody requestBody) {
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return StringsKt.trim(buffer.readUtf8()).toString();
    }

    public final List<Pair<String, Object>> c(List<? extends Pair<String, ? extends Object>> list) {
        List split$default;
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Pair<String, ? extends Object> pair : list) {
                String str = (String) pair.first;
                Object obj = pair.second;
                split$default = StringsKt__StringsKt.split$default(str, new String[]{"[]"}, false, 2, 2, null);
                if (split$default.size() == 1) {
                    arrayList.add(new Pair(str, obj));
                } else {
                    String str2 = (String) split$default.get(0);
                    String str3 = (String) split$default.get(1);
                    if (linkedHashMap.get(str2) == null) {
                        linkedHashMap.put(str2, 0);
                    }
                    if (!linkedHashSet.add(str) && !StringsKt.contains((CharSequence) str3, (CharSequence) "[]", false)) {
                        Object obj2 = linkedHashMap.get(str2);
                        if (obj2 != null) {
                            linkedHashMap.put(str2, Integer.valueOf(((Number) obj2).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(str);
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                    }
                    arrayList.add(new Pair(str2 + "[" + linkedHashMap.get(str2) + "]" + str3, obj));
                    z = true;
                }
            }
            if (!z) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    public final Request a(Request request, SubsystemLogger subsystemLogger, long j) {
        C0077a a2 = a(j, request, subsystemLogger);
        if (a2 == null) {
            return request;
        }
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.addHeader("NHMJLNRS", a2.d());
        newBuilder.addHeader("STPBWSBB", a2.b());
        newBuilder.addHeader("DNLGNZLZ", a2.a());
        newBuilder.addHeader("TLJLGGDG", a2.c());
        return new Request(newBuilder);
    }

    public static /* synthetic */ Request a(a aVar, Request request, SubsystemLogger subsystemLogger, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return aVar.a(request, subsystemLogger, j);
    }

    public final String a(String str) {
        return HexExtensionsKt.toHexString$default(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.split$default(r1, new java.lang.String[]{";"}, false, 0, 6, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v26, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.withpersona.sdk2.inquiry.network.core.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pair<String, Object>> a(RequestBody requestBody) {
        ?? r2;
        Iterable listOf;
        List split$default;
        String str;
        MediaType contentType = requestBody.contentType();
        if (contentType == null) {
            return CollectionsKt__CollectionsJVMKt.listOf(new Pair("", b(requestBody)));
        }
        String str2 = contentType.f1545type;
        if (Intrinsics.areEqual(contentType.subtype, "json")) {
            String b2 = b(requestBody);
            if (!Intrinsics.areEqual(b2, "{}") && !Intrinsics.areEqual(b2, "[]")) {
                if (StringsKt__StringsJVMKt.startsWith(b2, "{", false)) {
                    str = new JSONObject(b2);
                } else if (StringsKt__StringsJVMKt.startsWith(b2, "[", false)) {
                    str = new JSONArray(b2);
                }
                b2 = str;
            }
            if (b2 instanceof String) {
                return CollectionsKt__CollectionsJVMKt.listOf(new Pair("", b2));
            }
            return a((Object) b2);
        }
        if (Intrinsics.areEqual(str2, "multipart")) {
            List<MultipartBody.Part> list = ((MultipartBody) requestBody).parts;
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : list) {
                String str3 = part.headers.get("Content-Disposition");
                if (str3 != null && split$default != null) {
                    r2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        r2.add(StringsKt.trim((String) it.next()).toString());
                    }
                } else {
                    r2 = EmptyList.INSTANCE;
                }
                ?? r1 = a;
                String a2 = r1.a(r2);
                if (a2 != null) {
                    boolean b3 = r1.b(r2);
                    RequestBody requestBody2 = part.body;
                    if (b3) {
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(new Pair(a2, Long.valueOf(requestBody2.contentLength())));
                    } else {
                        List<Pair<String, Object>> a3 = r1.a(requestBody2);
                        if (a3.isEmpty()) {
                            listOf = EmptyList.INSTANCE;
                        } else if (a3.size() == 1) {
                            listOf = CollectionsKt__CollectionsJVMKt.listOf(new Pair(a2, a3.get(0).second));
                        } else {
                            Handlers$$ExternalSyntheticBUOutline0.m$1("Request body parts must contain a single value. Instead got: ", a3, ". Part name: ", a2);
                            return null;
                        }
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(listOf, arrayList);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("Request body parts must have names.");
                    return null;
                }
            }
            return CollectionsKt.toList(arrayList);
        }
        if (Intrinsics.areEqual(str2, "image")) {
            return CollectionsKt__CollectionsJVMKt.listOf(new Pair("", Long.valueOf(requestBody.contentLength())));
        }
        JWK$$ExternalSyntheticBUOutline0.m(contentType, "Unsupported type: ");
        return null;
    }

    public final List<Pair<String, Object>> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    public static /* synthetic */ void a(a aVar, Object obj, String str, List list, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        aVar.a(obj, str, (List<Pair<String, Object>>) list);
    }

    public final void a(Object obj, String str, List<Pair<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a aVar = a;
                Object opt = jSONObject.opt(next);
                if (str != null) {
                    next = Boxes$$ExternalSyntheticOutline1.m(str, "[", next, "]");
                }
                aVar.a(opt, next, list);
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                a(jSONArray.opt(i), str == null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "[", "]") : str + "[" + i + "]", list);
            }
            return;
        }
        if (str == null) {
            str = "";
        }
        list.add(new Pair<>(str, obj));
    }

    public final String a(List<String> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt__StringsJVMKt.startsWith((String) obj, "name=", false)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return Boxes$$ExternalSyntheticOutline1.m1148m(1, 6, str);
        }
        return null;
    }
}
