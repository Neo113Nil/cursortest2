package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zziu implements Cloneable {
    private Object value;
    private zzis<?, ?> zznc;
    private List<zziz> zznd = new ArrayList();

    zziu() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzaq()];
        zza(zzip.zzb(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzbj, reason: merged with bridge method [inline-methods] */
    public final zziu clone() {
        Object clone;
        zziu zziuVar = new zziu();
        try {
            zziuVar.zznc = this.zznc;
            if (this.zznd == null) {
                zziuVar.zznd = null;
            } else {
                zziuVar.zznd.addAll(this.zznd);
            }
            if (this.value != null) {
                if (this.value instanceof zzix) {
                    clone = (zzix) ((zzix) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zziuVar.value = bArr2;
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
                    } else if (this.value instanceof zzix[]) {
                        zzix[] zzixVarArr = (zzix[]) this.value;
                        zzix[] zzixVarArr2 = new zzix[zzixVarArr.length];
                        zziuVar.value = zzixVarArr2;
                        while (i < zzixVarArr.length) {
                            zzixVarArr2[i] = (zzix) zzixVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zziuVar.value = clone;
            }
            return zziuVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziu)) {
            return false;
        }
        zziu zziuVar = (zziu) obj;
        if (this.value != null && zziuVar.value != null) {
            if (this.zznc != zziuVar.zznc) {
                return false;
            }
            return !this.zznc.zzmx.isArray() ? this.value.equals(zziuVar.value) : this.value instanceof byte[] ? Arrays.equals((byte[]) this.value, (byte[]) zziuVar.value) : this.value instanceof int[] ? Arrays.equals((int[]) this.value, (int[]) zziuVar.value) : this.value instanceof long[] ? Arrays.equals((long[]) this.value, (long[]) zziuVar.value) : this.value instanceof float[] ? Arrays.equals((float[]) this.value, (float[]) zziuVar.value) : this.value instanceof double[] ? Arrays.equals((double[]) this.value, (double[]) zziuVar.value) : this.value instanceof boolean[] ? Arrays.equals((boolean[]) this.value, (boolean[]) zziuVar.value) : Arrays.deepEquals((Object[]) this.value, (Object[]) zziuVar.value);
        }
        if (this.zznd != null && zziuVar.zznd != null) {
            return this.zznd.equals(zziuVar.zznd);
        }
        try {
            return Arrays.equals(toByteArray(), zziuVar.toByteArray());
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

    final void zza(zzip zzipVar) throws IOException {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        for (zziz zzizVar : this.zznd) {
            zzipVar.zzp(zzizVar.tag);
            zzipVar.zzc(zzizVar.zzng);
        }
    }

    final void zza(zziz zzizVar) throws IOException {
        if (this.zznd != null) {
            this.zznd.add(zzizVar);
            return;
        }
        if (!(this.value instanceof zzix)) {
            if (this.value instanceof zzix[]) {
                Collections.singletonList(zzizVar);
                throw new NoSuchMethodError();
            }
            Collections.singletonList(zzizVar);
            throw new NoSuchMethodError();
        }
        byte[] bArr = zzizVar.zzng;
        zzio zza = zzio.zza(bArr, 0, bArr.length);
        int zzbe = zza.zzbe();
        if (zzbe != bArr.length - zzip.zzm(zzbe)) {
            throw zziw.zzbk();
        }
        zzix zza2 = ((zzix) this.value).zza(zza);
        this.zznc = this.zznc;
        this.value = zza2;
        this.zznd = null;
    }

    final int zzaq() {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        int i = 0;
        for (zziz zzizVar : this.zznd) {
            i += zzip.zzq(zzizVar.tag) + 0 + zzizVar.zzng.length;
        }
        return i;
    }
}
