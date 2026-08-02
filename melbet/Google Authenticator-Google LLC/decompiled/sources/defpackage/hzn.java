package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzn {
    public static final bry a;
    public static final bry b;
    public static final bry c;
    public static final bry d;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hnu.aw(hzu.SHA1, hzg.a, hashMap, hashMap2);
        hnu.aw(hzu.SHA224, hzg.b, hashMap, hashMap2);
        hnu.aw(hzu.SHA256, hzg.c, hashMap, hashMap2);
        hnu.aw(hzu.SHA384, hzg.d, hashMap, hashMap2);
        hnu.aw(hzu.SHA512, hzg.e, hashMap, hashMap2);
        DesugarCollections.unmodifiableMap(hashMap);
        DesugarCollections.unmodifiableMap(hashMap2);
        a = new bry(hzi.class, (char[]) null);
        b = new bry("type.googleapis.com/google.crypto.tink.HmacKey", (char[]) null);
        c = new bry(hze.class, (char[]) null);
        d = new bry("type.googleapis.com/google.crypto.tink.HmacKey", (char[]) null);
    }
}
