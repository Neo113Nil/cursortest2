package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwi;
import com.google.android.gms.internal.ads.zzgwm;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzgwi<MessageType extends zzgwm<MessageType, BuilderType>, BuilderType extends zzgwi<MessageType, BuilderType>> extends zzgum<MessageType, BuilderType> {
    protected zzgwm zza;
    private final zzgwm zzb;

    protected zzgwi(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaY()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaD();
    }

    private static void zza(Object obj, Object obj2) {
        zzgye.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgum
    /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
    public final zzgwi clone() {
        zzgwi zzgwiVar = (zzgwi) this.zzb.zzb(5, null, null);
        zzgwiVar.zza = zzan();
        return zzgwiVar;
    }

    public final zzgwi zzaj(zzgwm zzgwmVar) {
        if (!this.zzb.equals(zzgwmVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgwmVar);
        }
        return this;
    }

    public final zzgwi zzak(byte[] bArr, int i, int i2, zzgvy zzgvyVar) throws zzgwy {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgye.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzguq(zzgvyVar));
            return this;
        } catch (zzgwy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgwy.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaX()) {
            return zzan;
        }
        throw new zzgzf(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaS();
        return (MessageType) this.zza;
    }

    protected final void zzap() {
        if (this.zza.zzaY()) {
            return;
        }
        zzaq();
    }

    protected void zzaq() {
        zzgwm zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final /* synthetic */ zzgxw zzbg() {
        throw null;
    }
}
