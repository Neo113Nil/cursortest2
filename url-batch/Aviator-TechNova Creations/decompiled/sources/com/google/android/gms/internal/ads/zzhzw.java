package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzhzw<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidc {
    protected transient int zzq = 0;

    protected static void zzaV(zzian zzianVar) throws IllegalArgumentException {
        if (!zzianVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhzv.zzaT(iterable, list);
    }

    private String zzdU(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public zzian zzaM() {
        try {
            int zzbr = zzbr();
            zzian zzianVar = zzian.zza;
            byte[] bArr = new byte[zzbr];
            int i = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, zzbr);
            zzcX(zziatVar);
            return zziaj.zza(zziatVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdU("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int zzbr = zzbr();
            byte[] bArr = new byte[zzbr];
            int i = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, zzbr);
            zzcX(zziatVar);
            zziatVar.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdU("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzaO(OutputStream outputStream) throws IOException {
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zzbr()));
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int zzbr = zzbr();
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zziaw.zzA(zzbr) + zzbr));
        zziavVar.zzs(zzbr);
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzidh zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zzidu zziduVar) {
        return zzaQ();
    }

    zziee zzaU() {
        return new zziee(this);
    }
}
