package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class zzzy {
    private static final zzzy zzbwb = new zzzy();
    private final zzaab zzbwc;
    private final ConcurrentMap<Class<?>, zzaaa<?>> zzbwd = new ConcurrentHashMap();

    private zzzy() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzaab zzaabVar = null;
        for (int i = 0; i <= 0; i++) {
            zzaabVar = zzfo(strArr[0]);
            if (zzaabVar != null) {
                break;
            }
        }
        this.zzbwc = zzaabVar == null ? new zzzi() : zzaabVar;
    }

    private static zzaab zzfo(String str) {
        try {
            return (zzaab) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzzy zzuv() {
        return zzbwb;
    }

    public final <T> zzaaa<T> zzv(T t) {
        Class<?> cls = t.getClass();
        zzyw.zza(cls, "messageType");
        zzaaa<T> zzaaaVar = (zzaaa) this.zzbwd.get(cls);
        if (zzaaaVar != null) {
            return zzaaaVar;
        }
        zzaaa<T> zzg = this.zzbwc.zzg(cls);
        zzyw.zza(cls, "messageType");
        zzyw.zza(zzg, "schema");
        zzaaa<T> zzaaaVar2 = (zzaaa) this.zzbwd.putIfAbsent(cls, zzg);
        return zzaaaVar2 != null ? zzaaaVar2 : zzg;
    }
}
