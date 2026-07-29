package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
class zzyh extends zzyg {
    protected final byte[] zzbto;

    zzyh(byte[] bArr) {
        this.zzbto = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzyb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzyb) || size() != ((zzyb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzyh)) {
            return obj.equals(this);
        }
        zzyh zzyhVar = (zzyh) obj;
        int zztp = zztp();
        int zztp2 = zzyhVar.zztp();
        if (zztp == 0 || zztp2 == 0 || zztp == zztp2) {
            return zza(zzyhVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzyb
    public int size() {
        return this.zzbto.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzyb
    protected final int zza(int i, int i2, int i3) {
        return zzyw.zza(i, this.zzbto, zztq(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzyg
    final boolean zza(zzyb zzybVar, int i, int i2) {
        if (i2 > zzybVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > zzybVar.size()) {
            int size2 = zzybVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzybVar instanceof zzyh)) {
            return zzybVar.zzb(0, i2).equals(zzb(0, i2));
        }
        zzyh zzyhVar = (zzyh) zzybVar;
        byte[] bArr = this.zzbto;
        byte[] bArr2 = zzyhVar.zzbto;
        int zztq = zztq() + i2;
        int zztq2 = zztq();
        int zztq3 = zzyhVar.zztq();
        while (zztq2 < zztq) {
            if (bArr[zztq2] != bArr2[zztq3]) {
                return false;
            }
            zztq2++;
            zztq3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzyb
    public byte zzag(int i) {
        return this.zzbto[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzyb
    public final zzyb zzb(int i, int i2) {
        int zzb = zzb(0, i2, size());
        return zzb == 0 ? zzyb.zzbtj : new zzye(this.zzbto, zztq(), zzb);
    }

    protected int zztq() {
        return 0;
    }
}
