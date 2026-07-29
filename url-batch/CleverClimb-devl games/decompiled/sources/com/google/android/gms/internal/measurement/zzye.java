package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzye extends zzyh {
    private final int zzbtm;
    private final int zzbtn;

    zzye(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.zzbtm = i;
        this.zzbtn = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyh, com.google.android.gms.internal.measurement.zzyb
    public final int size() {
        return this.zzbtn;
    }

    @Override // com.google.android.gms.internal.measurement.zzyh, com.google.android.gms.internal.measurement.zzyb
    public final byte zzag(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzbto[this.zzbtm + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzyh
    protected final int zztq() {
        return this.zzbtm;
    }
}
