package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class ud3<P> {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<td3, List<rd3<P>>> f12754a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private rd3<P> f12755b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<P> f12756c;

    private ud3(Class<P> cls) {
        this.f12756c = cls;
    }

    public static <P> ud3<P> c(Class<P> cls) {
        return new ud3<>(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rd3<P> a(P p7, al3 al3Var) {
        ByteBuffer put;
        byte[] array;
        List<rd3<P>> put2;
        if (al3Var.J() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int K = al3Var.K() - 2;
        if (K != 1) {
            if (K != 2) {
                if (K == 3) {
                    array = yc3.f14618a;
                    rd3<P> rd3Var = new rd3<>(p7, array, al3Var.J(), al3Var.K(), al3Var.F());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(rd3Var);
                    td3 td3Var = new td3(rd3Var.b(), null);
                    put2 = this.f12754a.put(td3Var, Collections.unmodifiableList(arrayList));
                    if (put2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(put2);
                        arrayList2.add(rd3Var);
                        this.f12754a.put(td3Var, Collections.unmodifiableList(arrayList2));
                    }
                    return rd3Var;
                }
                if (K != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        array = put.putInt(al3Var.F()).array();
        rd3<P> rd3Var2 = new rd3<>(p7, array, al3Var.J(), al3Var.K(), al3Var.F());
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(rd3Var2);
        td3 td3Var2 = new td3(rd3Var2.b(), null);
        put2 = this.f12754a.put(td3Var2, Collections.unmodifiableList(arrayList3));
        if (put2 != null) {
        }
        return rd3Var2;
    }

    public final rd3<P> b() {
        return this.f12755b;
    }

    public final Class<P> d() {
        return this.f12756c;
    }

    public final void e(rd3<P> rd3Var) {
        if (rd3Var.c() != 3) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<rd3<P>> list = this.f12754a.get(new td3(rd3Var.b(), null));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f12755b = rd3Var;
    }
}
