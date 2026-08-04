package com.google.android.gms.internal.ads;

import android.R;
import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgk;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhgj<MessageType extends zzhgk<MessageType, BuilderType>, BuilderType extends zzhgj<MessageType, BuilderType>> implements zzhjr {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    protected static zzhku zzaR(zzhjs zzhjsVar) {
        return new zzhku(zzhjsVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhiu.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzhjd)) {
            if (iterable instanceof zzhkb) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzhjd) iterable).zza();
        zzhjd zzhjdVar = (zzhjd) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                int size2 = zzhjdVar.size() - size;
                StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = zzhjdVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(sb2);
                    }
                    zzhjdVar.remove(size3);
                }
            } else if (obj instanceof zzhhb) {
                zzhjdVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzhhb.zzr(bArr2, 0, bArr2.length);
                zzhjdVar.zzb();
            } else {
                zzhjdVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzhkd) {
                ((zzhkd) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            R r = (Object) list2.get(i);
            if (r == null) {
                zzc(list, size2);
            }
            list.add(r);
        }
    }

    private static void zzc(List<?> list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzhhg zzhhgVar) throws IOException {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return zzbd(zzhhgVar, zzhhr.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException;

    public BuilderType zzaF(zzhhb zzhhbVar) throws zzhiw {
        try {
            zzhhg zzp = zzhhbVar.zzp();
            zzbe(zzp);
            zzp.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    public BuilderType zzaG(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        try {
            zzhhg zzp = zzhhbVar.zzp();
            zzbd(zzp, zzhhrVar);
            zzp.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzhiw {
        return zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzhiw {
        try {
            zzhhg zzG = zzhhg.zzG(bArr, i, i2, false);
            zzbe(zzG);
            zzG.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return zzaX(bArr, 0, bArr.length, zzhhrVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i2, zzhhr zzhhrVar) throws zzhiw {
        try {
            zzhhg zzG = zzhhg.zzG(bArr, i, i2, false);
            zzbd(zzG, zzhhrVar);
            zzG.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzhhg zzF = zzhhg.zzF(inputStream, 4096);
        zzbe(zzF);
        zzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        zzhhg zzF = zzhhg.zzF(inputStream, 4096);
        zzbd(zzF, zzhhrVar);
        zzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaM(new zzhgi(inputStream, zzhhg.zzM(read, inputStream)), zzhhrVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return zzaN(inputStream, zzhhr.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzhjs zzhjsVar) {
        if (zzbw().getClass().isInstance(zzhjsVar)) {
            return (BuilderType) zzaQ((zzhgk) zzhjsVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzhjr zzaV(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        zzaM(inputStream, zzhhrVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhjr zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhjr zzbb(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        zzaG(zzhhbVar, zzhhrVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhjr zzbc(zzhhb zzhhbVar) throws zzhiw {
        zzaF(zzhhbVar);
        return this;
    }
}
