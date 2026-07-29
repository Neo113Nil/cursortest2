package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzabg implements Cloneable {
    private Object value;
    private zzabe<?, ?> zzbzp;
    private List<zzabl> zzbzq = new ArrayList();

    zzabg() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zza()];
        zza(zzabb.zzk(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzwa, reason: merged with bridge method [inline-methods] */
    public final zzabg clone() {
        Object clone;
        zzabg zzabgVar = new zzabg();
        try {
            zzabgVar.zzbzp = this.zzbzp;
            if (this.zzbzq == null) {
                zzabgVar.zzbzq = null;
            } else {
                zzabgVar.zzbzq.addAll(this.zzbzq);
            }
            if (this.value != null) {
                if (this.value instanceof zzabj) {
                    clone = (zzabj) ((zzabj) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzabgVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        clone = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        clone = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        clone = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        clone = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        clone = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzabj[]) {
                        zzabj[] zzabjVarArr = (zzabj[]) this.value;
                        zzabj[] zzabjVarArr2 = new zzabj[zzabjVarArr.length];
                        zzabgVar.value = zzabjVarArr2;
                        while (i < zzabjVarArr.length) {
                            zzabjVarArr2[i] = (zzabj) zzabjVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zzabgVar.value = clone;
            }
            return zzabgVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzabg)) {
            return false;
        }
        zzabg zzabgVar = (zzabg) obj;
        if (this.value != null && zzabgVar.value != null) {
            if (this.zzbzp != zzabgVar.zzbzp) {
                return false;
            }
            return !this.zzbzp.zzbzi.isArray() ? this.value.equals(zzabgVar.value) : this.value instanceof byte[] ? Arrays.equals((byte[]) this.value, (byte[]) zzabgVar.value) : this.value instanceof int[] ? Arrays.equals((int[]) this.value, (int[]) zzabgVar.value) : this.value instanceof long[] ? Arrays.equals((long[]) this.value, (long[]) zzabgVar.value) : this.value instanceof float[] ? Arrays.equals((float[]) this.value, (float[]) zzabgVar.value) : this.value instanceof double[] ? Arrays.equals((double[]) this.value, (double[]) zzabgVar.value) : this.value instanceof boolean[] ? Arrays.equals((boolean[]) this.value, (boolean[]) zzabgVar.value) : Arrays.deepEquals((Object[]) this.value, (Object[]) zzabgVar.value);
        }
        if (this.zzbzq != null && zzabgVar.zzbzq != null) {
            return this.zzbzq.equals(zzabgVar.zzbzq);
        }
        try {
            return Arrays.equals(toByteArray(), zzabgVar.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    final int zza() {
        if (this.value == null) {
            int i = 0;
            for (zzabl zzablVar : this.zzbzq) {
                i += zzabb.zzau(zzablVar.tag) + 0 + zzablVar.zzbto.length;
            }
            return i;
        }
        zzabe<?, ?> zzabeVar = this.zzbzp;
        Object obj = this.value;
        if (!zzabeVar.zzbzj) {
            return zzabeVar.zzx(obj);
        }
        int length = Array.getLength(obj);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (Array.get(obj, i3) != null) {
                i2 += zzabeVar.zzx(Array.get(obj, i3));
            }
        }
        return i2;
    }

    final void zza(zzabb zzabbVar) throws IOException {
        if (this.value == null) {
            for (zzabl zzablVar : this.zzbzq) {
                zzabbVar.zzat(zzablVar.tag);
                zzabbVar.zzl(zzablVar.zzbto);
            }
            return;
        }
        zzabe<?, ?> zzabeVar = this.zzbzp;
        Object obj = this.value;
        if (!zzabeVar.zzbzj) {
            zzabeVar.zza(obj, zzabbVar);
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                zzabeVar.zza(obj2, zzabbVar);
            }
        }
    }

    final void zza(zzabl zzablVar) throws IOException {
        Object zzi;
        if (this.zzbzq != null) {
            this.zzbzq.add(zzablVar);
            return;
        }
        if (this.value instanceof zzabj) {
            byte[] bArr = zzablVar.zzbto;
            zzaba zza = zzaba.zza(bArr, 0, bArr.length);
            int zzvs = zza.zzvs();
            if (zzvs != bArr.length - zzabb.zzaq(zzvs)) {
                throw zzabi.zzwb();
            }
            zzi = ((zzabj) this.value).zzb(zza);
        } else if (this.value instanceof zzabj[]) {
            zzabj[] zzabjVarArr = (zzabj[]) this.zzbzp.zzi(Collections.singletonList(zzablVar));
            zzabj[] zzabjVarArr2 = (zzabj[]) this.value;
            zzabj[] zzabjVarArr3 = (zzabj[]) Arrays.copyOf(zzabjVarArr2, zzabjVarArr2.length + zzabjVarArr.length);
            System.arraycopy(zzabjVarArr, 0, zzabjVarArr3, zzabjVarArr2.length, zzabjVarArr.length);
            zzi = zzabjVarArr3;
        } else {
            zzi = this.zzbzp.zzi(Collections.singletonList(zzablVar));
        }
        this.zzbzp = this.zzbzp;
        this.value = zzi;
        this.zzbzq = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final <T> T zzb(zzabe<?, T> zzabeVar) {
        if (this.value == null) {
            this.zzbzp = zzabeVar;
            this.value = zzabeVar.zzi(this.zzbzq);
            this.zzbzq = null;
        } else if (!this.zzbzp.equals(zzabeVar)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return (T) this.value;
    }
}
