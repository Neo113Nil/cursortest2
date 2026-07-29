package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxr;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzaum<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private ConcurrentMap<String, List<zzaun<P>>> zzdhk = new ConcurrentHashMap();
    private zzaun<P> zzdhl;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzaun<P> zza(P p, zzaxr.zzb zzbVar) throws GeneralSecurityException {
        ByteBuffer allocate;
        byte b2;
        byte[] array;
        List<zzaun<P>> put;
        switch (zzbVar.zzzs()) {
            case LEGACY:
            case CRUNCHY:
                allocate = ByteBuffer.allocate(5);
                b2 = 0;
                array = allocate.put(b2).putInt(zzbVar.zzzr()).array();
                zzaun<P> zzaunVar = new zzaun<>(p, array, zzbVar.zzzq(), zzbVar.zzzs());
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzaunVar);
                String str = new String(zzaunVar.zzwj(), UTF_8);
                put = this.zzdhk.put(str, Collections.unmodifiableList(arrayList));
                if (put != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(put);
                    arrayList2.add(zzaunVar);
                    this.zzdhk.put(str, Collections.unmodifiableList(arrayList2));
                }
                return zzaunVar;
            case TINK:
                allocate = ByteBuffer.allocate(5);
                b2 = 1;
                array = allocate.put(b2).putInt(zzbVar.zzzr()).array();
                zzaun<P> zzaunVar2 = new zzaun<>(p, array, zzbVar.zzzq(), zzbVar.zzzs());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(zzaunVar2);
                String str2 = new String(zzaunVar2.zzwj(), UTF_8);
                put = this.zzdhk.put(str2, Collections.unmodifiableList(arrayList3));
                if (put != null) {
                }
                return zzaunVar2;
            case RAW:
                array = zzauc.zzdhg;
                zzaun<P> zzaunVar22 = new zzaun<>(p, array, zzbVar.zzzq(), zzbVar.zzzs());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(zzaunVar22);
                String str22 = new String(zzaunVar22.zzwj(), UTF_8);
                put = this.zzdhk.put(str22, Collections.unmodifiableList(arrayList32));
                if (put != null) {
                }
                return zzaunVar22;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
    }

    protected final void zza(zzaun<P> zzaunVar) {
        this.zzdhl = zzaunVar;
    }

    public final zzaun<P> zzwh() {
        return this.zzdhl;
    }
}
