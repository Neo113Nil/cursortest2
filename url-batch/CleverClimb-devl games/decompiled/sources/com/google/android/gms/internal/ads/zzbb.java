package com.google.android.gms.internal.ads;

import com.cmplay.policy.gdpr.DimenUtils;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbb extends zzbfc<zzbb> {
    private static volatile zzbb[] zzfo;
    public Integer zzft;
    public Integer zzfx;
    public Long zzdo = null;
    public Long zzdp = null;
    public Long zzfp = null;
    public Long zzfq = null;
    public Long zzfr = null;
    public Long zzfs = null;
    public Long zzfu = null;
    public Long zzfv = null;
    public Long zzfw = null;
    public Long zzfy = null;
    public Long zzfz = null;
    public Long zzga = null;
    public Long zzgb = null;
    public Long zzgc = null;
    public Long zzgd = null;
    public Long zzge = null;
    public Long zzgf = null;
    private Long zzgg = null;
    private Long zzgh = null;

    public zzbb() {
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzbb zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 8:
                    this.zzdo = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 16:
                    this.zzdp = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 24:
                    this.zzfp = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 32:
                    this.zzfq = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 40:
                    this.zzfr = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 48:
                    this.zzfs = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 56:
                    zzbezVar.getPosition();
                    this.zzft = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    break;
                case 64:
                    this.zzfu = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 72:
                    this.zzfv = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 80:
                    this.zzfw = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 88:
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzfx = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                        break;
                    }
                case 96:
                    this.zzfy = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 104:
                    this.zzfz = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 112:
                    this.zzga = Long.valueOf(zzbezVar.zzacd());
                    break;
                case DimenUtils.DENSITY_LOW /* 120 */:
                    this.zzgb = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 128:
                    this.zzgc = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 136:
                    this.zzgd = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 144:
                    this.zzge = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 152:
                    this.zzgf = Long.valueOf(zzbezVar.zzacd());
                    break;
                case DimenUtils.DENSITY_MEDIUM /* 160 */:
                    this.zzgg = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 168:
                    this.zzgh = Long.valueOf(zzbezVar.zzacd());
                    break;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static zzbb[] zzs() {
        if (zzfo == null) {
            synchronized (zzbfg.zzebs) {
                if (zzfo == null) {
                    zzfo = new zzbb[0];
                }
            }
        }
        return zzfo;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzdo != null) {
            zzbfaVar.zzi(1, this.zzdo.longValue());
        }
        if (this.zzdp != null) {
            zzbfaVar.zzi(2, this.zzdp.longValue());
        }
        if (this.zzfp != null) {
            zzbfaVar.zzi(3, this.zzfp.longValue());
        }
        if (this.zzfq != null) {
            zzbfaVar.zzi(4, this.zzfq.longValue());
        }
        if (this.zzfr != null) {
            zzbfaVar.zzi(5, this.zzfr.longValue());
        }
        if (this.zzfs != null) {
            zzbfaVar.zzi(6, this.zzfs.longValue());
        }
        if (this.zzft != null) {
            zzbfaVar.zzm(7, this.zzft.intValue());
        }
        if (this.zzfu != null) {
            zzbfaVar.zzi(8, this.zzfu.longValue());
        }
        if (this.zzfv != null) {
            zzbfaVar.zzi(9, this.zzfv.longValue());
        }
        if (this.zzfw != null) {
            zzbfaVar.zzi(10, this.zzfw.longValue());
        }
        if (this.zzfx != null) {
            zzbfaVar.zzm(11, this.zzfx.intValue());
        }
        if (this.zzfy != null) {
            zzbfaVar.zzi(12, this.zzfy.longValue());
        }
        if (this.zzfz != null) {
            zzbfaVar.zzi(13, this.zzfz.longValue());
        }
        if (this.zzga != null) {
            zzbfaVar.zzi(14, this.zzga.longValue());
        }
        if (this.zzgb != null) {
            zzbfaVar.zzi(15, this.zzgb.longValue());
        }
        if (this.zzgc != null) {
            zzbfaVar.zzi(16, this.zzgc.longValue());
        }
        if (this.zzgd != null) {
            zzbfaVar.zzi(17, this.zzgd.longValue());
        }
        if (this.zzge != null) {
            zzbfaVar.zzi(18, this.zzge.longValue());
        }
        if (this.zzgf != null) {
            zzbfaVar.zzi(19, this.zzgf.longValue());
        }
        if (this.zzgg != null) {
            zzbfaVar.zzi(20, this.zzgg.longValue());
        }
        if (this.zzgh != null) {
            zzbfaVar.zzi(21, this.zzgh.longValue());
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzdo != null) {
            zzr += zzbfa.zzd(1, this.zzdo.longValue());
        }
        if (this.zzdp != null) {
            zzr += zzbfa.zzd(2, this.zzdp.longValue());
        }
        if (this.zzfp != null) {
            zzr += zzbfa.zzd(3, this.zzfp.longValue());
        }
        if (this.zzfq != null) {
            zzr += zzbfa.zzd(4, this.zzfq.longValue());
        }
        if (this.zzfr != null) {
            zzr += zzbfa.zzd(5, this.zzfr.longValue());
        }
        if (this.zzfs != null) {
            zzr += zzbfa.zzd(6, this.zzfs.longValue());
        }
        if (this.zzft != null) {
            zzr += zzbfa.zzq(7, this.zzft.intValue());
        }
        if (this.zzfu != null) {
            zzr += zzbfa.zzd(8, this.zzfu.longValue());
        }
        if (this.zzfv != null) {
            zzr += zzbfa.zzd(9, this.zzfv.longValue());
        }
        if (this.zzfw != null) {
            zzr += zzbfa.zzd(10, this.zzfw.longValue());
        }
        if (this.zzfx != null) {
            zzr += zzbfa.zzq(11, this.zzfx.intValue());
        }
        if (this.zzfy != null) {
            zzr += zzbfa.zzd(12, this.zzfy.longValue());
        }
        if (this.zzfz != null) {
            zzr += zzbfa.zzd(13, this.zzfz.longValue());
        }
        if (this.zzga != null) {
            zzr += zzbfa.zzd(14, this.zzga.longValue());
        }
        if (this.zzgb != null) {
            zzr += zzbfa.zzd(15, this.zzgb.longValue());
        }
        if (this.zzgc != null) {
            zzr += zzbfa.zzd(16, this.zzgc.longValue());
        }
        if (this.zzgd != null) {
            zzr += zzbfa.zzd(17, this.zzgd.longValue());
        }
        if (this.zzge != null) {
            zzr += zzbfa.zzd(18, this.zzge.longValue());
        }
        if (this.zzgf != null) {
            zzr += zzbfa.zzd(19, this.zzgf.longValue());
        }
        if (this.zzgg != null) {
            zzr += zzbfa.zzd(20, this.zzgg.longValue());
        }
        return this.zzgh != null ? zzr + zzbfa.zzd(21, this.zzgh.longValue()) : zzr;
    }
}
