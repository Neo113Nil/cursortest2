package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgk;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhgk<MessageType extends zzhgk<MessageType, BuilderType>, BuilderType extends zzhgj<MessageType, BuilderType>> implements zzhjs {
    protected int zzq = 0;

    protected static void zzaV(zzhhb zzhhbVar) throws IllegalArgumentException {
        if (!zzhhbVar.zzm()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhgj.zzaT(iterable, list);
    }

    private String zzdZ(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public zzhhb zzaM() {
        try {
            int zzbr = zzbr();
            zzhhb zzhhbVar = zzhhb.zzb;
            byte[] bArr = new byte[zzbr];
            int i = zzhhm.zzf;
            zzhhj zzhhjVar = new zzhhj(bArr, 0, zzbr);
            zzdc(zzhhjVar);
            return zzhgx.zza(zzhhjVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdZ("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int zzbr = zzbr();
            byte[] bArr = new byte[zzbr];
            int i = zzhhm.zzf;
            zzhhj zzhhjVar = new zzhhj(bArr, 0, zzbr);
            zzdc(zzhhjVar);
            zzhhjVar.zzE();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdZ("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public void zzaO(OutputStream outputStream) throws IOException {
        zzhhl zzhhlVar = new zzhhl(outputStream, zzhhm.zzz(zzbr()));
        zzdc(zzhhlVar);
        zzhhlVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int zzbr = zzbr();
        zzhhl zzhhlVar = new zzhhl(outputStream, zzhhm.zzz(zzhhm.zzA(zzbr) + zzbr));
        zzhhlVar.zzs(zzbr);
        zzdc(zzhhlVar);
        zzhhlVar.zzy();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzhjx zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zzhkk zzhkkVar) {
        return zzaQ();
    }

    zzhku zzaU() {
        return new zzhku(this);
    }
}
