package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxv {
    static final gzl a = gzl.b(',');
    public static final jxv b = new jxv(jxc.a, false, new jxv(new jxc(1), true, new jxv()));
    public final byte[] c;
    private final Map d;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, jxt] */
    private jxv(jxt jxtVar, boolean z, jxv jxvVar) {
        String b2 = jxtVar.b();
        hoq.y(!b2.contains(","), "Comma is currently not allowed in message encoding");
        int size = jxvVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(jxvVar.d.containsKey(jxtVar.b()) ? size : size + 1);
        for (jxu jxuVar : jxvVar.d.values()) {
            ?? r3 = jxuVar.b;
            String b3 = r3.b();
            if (!b3.equals(b2)) {
                linkedHashMap.put(b3, new jxu((Object) r3, jxuVar.a));
            }
        }
        linkedHashMap.put(b2, new jxu(jxtVar, z));
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = unmodifiableMap;
        gzl gzlVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((jxu) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = gzlVar.c(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jxt] */
    public final jxt a(String str) {
        jxu jxuVar = (jxu) this.d.get(str);
        if (jxuVar != null) {
            return jxuVar.b;
        }
        return null;
    }

    public jxv() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }
}
