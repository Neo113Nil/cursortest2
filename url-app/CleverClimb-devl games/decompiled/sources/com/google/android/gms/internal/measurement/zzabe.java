package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzabd;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzabe<M extends zzabd<M>, T> {
    public final int tag;
    private final int type;
    protected final Class<T> zzbzi;
    protected final boolean zzbzj;
    private final zzyv<?, ?> zzbzk;

    private zzabe(int i, Class<T> cls, int i2, boolean z) {
        this(11, cls, null, 810, false);
    }

    private zzabe(int i, Class<T> cls, zzyv<?, ?> zzyvVar, int i2, boolean z) {
        this.type = i;
        this.zzbzi = cls;
        this.tag = i2;
        this.zzbzj = false;
        this.zzbzk = null;
    }

    public static <M extends zzabd<M>, T extends zzabj> zzabe<M, T> zza(int i, Class<T> cls, long j) {
        return new zzabe<>(11, cls, 810, false);
    }

    private final Object zzf(zzaba zzabaVar) {
        Class componentType = this.zzbzj ? this.zzbzi.getComponentType() : this.zzbzi;
        try {
            switch (this.type) {
                case 10:
                    zzabj zzabjVar = (zzabj) componentType.newInstance();
                    zzabaVar.zza(zzabjVar, this.tag >>> 3);
                    return zzabjVar;
                case 11:
                    zzabj zzabjVar2 = (zzabj) componentType.newInstance();
                    zzabaVar.zza(zzabjVar2);
                    return zzabjVar2;
                default:
                    int i = this.type;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        } catch (IllegalAccessException e2) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e2);
        } catch (InstantiationException e3) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabe)) {
            return false;
        }
        zzabe zzabeVar = (zzabe) obj;
        return this.type == zzabeVar.type && this.zzbzi == zzabeVar.zzbzi && this.tag == zzabeVar.tag && this.zzbzj == zzabeVar.zzbzj;
    }

    public final int hashCode() {
        return ((((((this.type + 1147) * 31) + this.zzbzi.hashCode()) * 31) + this.tag) * 31) + (this.zzbzj ? 1 : 0);
    }

    protected final void zza(Object obj, zzabb zzabbVar) {
        try {
            zzabbVar.zzat(this.tag);
            switch (this.type) {
                case 10:
                    int i = this.tag >>> 3;
                    ((zzabj) obj).zza(zzabbVar);
                    zzabbVar.zzg(i, 4);
                    return;
                case 11:
                    zzabbVar.zzb((zzabj) obj);
                    return;
                default:
                    int i2 = this.type;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    final T zzi(List<zzabl> list) {
        if (list == null) {
            return null;
        }
        if (!this.zzbzj) {
            if (list.isEmpty()) {
                return null;
            }
            return this.zzbzi.cast(zzf(zzaba.zzj(list.get(list.size() - 1).zzbto)));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzabl zzablVar = list.get(i);
            if (zzablVar.zzbto.length != 0) {
                arrayList.add(zzf(zzaba.zzj(zzablVar.zzbto)));
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        T cast = this.zzbzi.cast(Array.newInstance(this.zzbzi.getComponentType(), size));
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(cast, i2, arrayList.get(i2));
        }
        return cast;
    }

    protected final int zzx(Object obj) {
        int i = this.tag >>> 3;
        switch (this.type) {
            case 10:
                return (zzabb.zzas(i) << 1) + ((zzabj) obj).zzwg();
            case 11:
                return zzabb.zzb(i, (zzabj) obj);
            default:
                int i2 = this.type;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
