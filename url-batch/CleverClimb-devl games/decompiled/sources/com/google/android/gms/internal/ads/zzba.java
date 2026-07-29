package com.google.android.gms.internal.ads;

import android.support.v7.widget.helper.ItemTouchHelper;
import com.aiming.mdt.utils.Constants;
import com.cmplay.policy.gdpr.DimenUtils;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzba extends zzbfc<zzba> {
    public Integer zzel;
    public Integer zzem;
    public Integer zzes;
    private Integer zzfe;
    private Integer zzff;
    private Integer zzfg;
    public Integer zzfj;
    public String zzdc = null;
    public String zzcw = null;
    public Long zzdd = null;
    private Long zzde = null;
    public Long zzdf = null;
    public Long zzdg = null;
    private Long zzdh = null;
    private Long zzdi = null;
    private Long zzdj = null;
    private Long zzdk = null;
    private Long zzdl = null;
    public Long zzdm = null;
    private String zzdn = null;
    public Long zzdo = null;
    public Long zzdp = null;
    public Long zzdq = null;
    public Long zzdr = null;
    private Long zzds = null;
    private Long zzdt = null;
    public Long zzdu = null;
    public Long zzdv = null;
    public Long zzdw = null;
    public String zzcx = null;
    public String zzdx = null;
    public Long zzdy = null;
    public Long zzdz = null;
    public Long zzea = null;
    public String zzcz = null;
    public Long zzeb = null;
    public Long zzec = null;
    public Long zzed = null;
    private zzbd zzee = null;
    public Long zzef = null;
    public Long zzeg = null;
    public Long zzeh = null;
    public Long zzei = null;
    public Long zzej = null;
    public Long zzek = null;
    public String zzda = null;
    public String zzdb = null;
    public Long zzen = null;
    public Long zzeo = null;
    public Long zzep = null;
    private Long zzeq = null;
    private Long zzer = null;
    public zzbb zzet = null;
    public zzbb[] zzeu = zzbb.zzs();
    public zzbc zzev = null;
    private Long zzew = null;
    public Long zzex = null;
    public Long zzey = null;
    public Long zzez = null;
    public Long zzfa = null;
    public Long zzfb = null;
    public String zzfc = null;
    private Long zzfd = null;
    private Long zzfh = null;
    public String zzfi = null;
    public Boolean zzfk = null;
    private String zzfl = null;
    public Long zzfm = null;
    public zzbf zzfn = null;

    public zzba() {
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r5 = new java.lang.StringBuilder(45);
        r5.append(r2);
        r5.append(" is not a valid enum DebuggerState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzba zza(zzbez zzbezVar) throws IOException {
        int zzacc;
        zzbfi zzbfiVar;
        int zzacc2;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 10:
                    this.zzdc = zzbezVar.readString();
                    continue;
                case 18:
                    this.zzcw = zzbezVar.readString();
                    continue;
                case 24:
                    this.zzdd = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 32:
                    this.zzde = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 40:
                    this.zzdf = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 48:
                    this.zzdg = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 56:
                    this.zzdh = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 64:
                    this.zzdi = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 72:
                    this.zzdj = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 80:
                    this.zzdk = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 88:
                    this.zzdl = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 96:
                    this.zzdm = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 106:
                    this.zzdn = zzbezVar.readString();
                    continue;
                case 112:
                    this.zzdo = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case DimenUtils.DENSITY_LOW /* 120 */:
                    this.zzdp = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 128:
                    this.zzdq = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 136:
                    this.zzdr = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 144:
                    this.zzds = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 152:
                    this.zzdt = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case DimenUtils.DENSITY_MEDIUM /* 160 */:
                    this.zzdu = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 168:
                    this.zzfh = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 176:
                    this.zzdv = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 184:
                    this.zzdw = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 194:
                    this.zzfi = zzbezVar.readString();
                    continue;
                case ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                    this.zzfm = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case Constants.VERSION /* 208 */:
                    zzbezVar.getPosition();
                    zzacc = zzbezVar.zzacc();
                    if (zzacc >= 0 && zzacc <= 6) {
                        this.zzfj = Integer.valueOf(zzacc);
                        continue;
                    }
                    break;
                case 218:
                    this.zzcx = zzbezVar.readString();
                    continue;
                case 224:
                    this.zzfk = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 234:
                    this.zzdx = zzbezVar.readString();
                    continue;
                case 242:
                    this.zzfl = zzbezVar.readString();
                    continue;
                case 248:
                    this.zzdy = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 256:
                    this.zzdz = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 264:
                    this.zzea = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 274:
                    this.zzcz = zzbezVar.readString();
                    continue;
                case 280:
                    this.zzeb = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 288:
                    this.zzec = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 296:
                    this.zzed = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 306:
                    if (this.zzee == null) {
                        this.zzee = new zzbd();
                    }
                    zzbfiVar = this.zzee;
                    break;
                case 312:
                    this.zzef = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case DimenUtils.DENSITY_XHIGH /* 320 */:
                    this.zzeg = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 328:
                    this.zzeh = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 336:
                    this.zzei = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 346:
                    int zzb = zzbfl.zzb(zzbezVar, 346);
                    int length = this.zzeu == null ? 0 : this.zzeu.length;
                    zzbb[] zzbbVarArr = new zzbb[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzeu, 0, zzbbVarArr, 0, length);
                    }
                    while (length < zzbbVarArr.length - 1) {
                        zzbbVarArr[length] = new zzbb();
                        zzbezVar.zza(zzbbVarArr[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzbbVarArr[length] = new zzbb();
                    zzbezVar.zza(zzbbVarArr[length]);
                    this.zzeu = zzbbVarArr;
                    continue;
                case 352:
                    this.zzej = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 360:
                    this.zzek = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 370:
                    this.zzda = zzbezVar.readString();
                    continue;
                case 378:
                    this.zzdb = zzbezVar.readString();
                    continue;
                case 384:
                    zzbezVar.getPosition();
                    this.zzel = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    continue;
                case 392:
                    zzbezVar.getPosition();
                    this.zzem = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    continue;
                case 402:
                    if (this.zzet == null) {
                        this.zzet = new zzbb();
                    }
                    zzbfiVar = this.zzet;
                    break;
                case 408:
                    this.zzen = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 416:
                    this.zzeo = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 424:
                    this.zzep = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 432:
                    this.zzeq = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 440:
                    this.zzer = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 448:
                    zzbezVar.getPosition();
                    this.zzes = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    continue;
                case 458:
                    if (this.zzev == null) {
                        this.zzev = new zzbc();
                    }
                    zzbfiVar = this.zzev;
                    break;
                case 464:
                    this.zzew = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 472:
                    this.zzex = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 480:
                    this.zzey = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 488:
                    this.zzez = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 496:
                    this.zzfa = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 504:
                    this.zzfb = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 512:
                    this.zzfd = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 520:
                    zzbezVar.getPosition();
                    this.zzfe = Integer.valueOf(zzaz.zzf(zzbezVar.zzacc()));
                    continue;
                case 528:
                    zzbezVar.getPosition();
                    this.zzff = Integer.valueOf(zzaz.zze(zzbezVar.zzacc()));
                    continue;
                case 538:
                    this.zzfc = zzbezVar.readString();
                    continue;
                case 544:
                    try {
                        zzacc2 = zzbezVar.zzacc();
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(zzbezVar.getPosition());
                        zza(zzbezVar, zzabk);
                    }
                    if (zzacc2 >= 0 && zzacc2 <= 3) {
                        this.zzfg = Integer.valueOf(zzacc2);
                        continue;
                    }
                    break;
                case 1610:
                    if (this.zzfn == null) {
                        this.zzfn = new zzbf();
                    }
                    zzbfiVar = this.zzfn;
                    break;
                default:
                    if (!super.zza(zzbezVar, zzabk)) {
                        return this;
                    }
                    continue;
            }
            zzbezVar.zza(zzbfiVar);
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append(zzacc);
        sb.append(" is not a valid enum DeviceIdType");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        if (this.zzdc != null) {
            zzbfaVar.zzf(1, this.zzdc);
        }
        if (this.zzcw != null) {
            zzbfaVar.zzf(2, this.zzcw);
        }
        if (this.zzdd != null) {
            zzbfaVar.zzi(3, this.zzdd.longValue());
        }
        if (this.zzde != null) {
            zzbfaVar.zzi(4, this.zzde.longValue());
        }
        if (this.zzdf != null) {
            zzbfaVar.zzi(5, this.zzdf.longValue());
        }
        if (this.zzdg != null) {
            zzbfaVar.zzi(6, this.zzdg.longValue());
        }
        if (this.zzdh != null) {
            zzbfaVar.zzi(7, this.zzdh.longValue());
        }
        if (this.zzdi != null) {
            zzbfaVar.zzi(8, this.zzdi.longValue());
        }
        if (this.zzdj != null) {
            zzbfaVar.zzi(9, this.zzdj.longValue());
        }
        if (this.zzdk != null) {
            zzbfaVar.zzi(10, this.zzdk.longValue());
        }
        if (this.zzdl != null) {
            zzbfaVar.zzi(11, this.zzdl.longValue());
        }
        if (this.zzdm != null) {
            zzbfaVar.zzi(12, this.zzdm.longValue());
        }
        if (this.zzdn != null) {
            zzbfaVar.zzf(13, this.zzdn);
        }
        if (this.zzdo != null) {
            zzbfaVar.zzi(14, this.zzdo.longValue());
        }
        if (this.zzdp != null) {
            zzbfaVar.zzi(15, this.zzdp.longValue());
        }
        if (this.zzdq != null) {
            zzbfaVar.zzi(16, this.zzdq.longValue());
        }
        if (this.zzdr != null) {
            zzbfaVar.zzi(17, this.zzdr.longValue());
        }
        if (this.zzds != null) {
            zzbfaVar.zzi(18, this.zzds.longValue());
        }
        if (this.zzdt != null) {
            zzbfaVar.zzi(19, this.zzdt.longValue());
        }
        if (this.zzdu != null) {
            zzbfaVar.zzi(20, this.zzdu.longValue());
        }
        if (this.zzfh != null) {
            zzbfaVar.zzi(21, this.zzfh.longValue());
        }
        if (this.zzdv != null) {
            zzbfaVar.zzi(22, this.zzdv.longValue());
        }
        if (this.zzdw != null) {
            zzbfaVar.zzi(23, this.zzdw.longValue());
        }
        if (this.zzfi != null) {
            zzbfaVar.zzf(24, this.zzfi);
        }
        if (this.zzfm != null) {
            zzbfaVar.zzi(25, this.zzfm.longValue());
        }
        if (this.zzfj != null) {
            zzbfaVar.zzm(26, this.zzfj.intValue());
        }
        if (this.zzcx != null) {
            zzbfaVar.zzf(27, this.zzcx);
        }
        if (this.zzfk != null) {
            zzbfaVar.zzf(28, this.zzfk.booleanValue());
        }
        if (this.zzdx != null) {
            zzbfaVar.zzf(29, this.zzdx);
        }
        if (this.zzfl != null) {
            zzbfaVar.zzf(30, this.zzfl);
        }
        if (this.zzdy != null) {
            zzbfaVar.zzi(31, this.zzdy.longValue());
        }
        if (this.zzdz != null) {
            zzbfaVar.zzi(32, this.zzdz.longValue());
        }
        if (this.zzea != null) {
            zzbfaVar.zzi(33, this.zzea.longValue());
        }
        if (this.zzcz != null) {
            zzbfaVar.zzf(34, this.zzcz);
        }
        if (this.zzeb != null) {
            zzbfaVar.zzi(35, this.zzeb.longValue());
        }
        if (this.zzec != null) {
            zzbfaVar.zzi(36, this.zzec.longValue());
        }
        if (this.zzed != null) {
            zzbfaVar.zzi(37, this.zzed.longValue());
        }
        if (this.zzee != null) {
            zzbfaVar.zza(38, this.zzee);
        }
        if (this.zzef != null) {
            zzbfaVar.zzi(39, this.zzef.longValue());
        }
        if (this.zzeg != null) {
            zzbfaVar.zzi(40, this.zzeg.longValue());
        }
        if (this.zzeh != null) {
            zzbfaVar.zzi(41, this.zzeh.longValue());
        }
        if (this.zzei != null) {
            zzbfaVar.zzi(42, this.zzei.longValue());
        }
        if (this.zzeu != null && this.zzeu.length > 0) {
            for (int i = 0; i < this.zzeu.length; i++) {
                zzbb zzbbVar = this.zzeu[i];
                if (zzbbVar != null) {
                    zzbfaVar.zza(43, zzbbVar);
                }
            }
        }
        if (this.zzej != null) {
            zzbfaVar.zzi(44, this.zzej.longValue());
        }
        if (this.zzek != null) {
            zzbfaVar.zzi(45, this.zzek.longValue());
        }
        if (this.zzda != null) {
            zzbfaVar.zzf(46, this.zzda);
        }
        if (this.zzdb != null) {
            zzbfaVar.zzf(47, this.zzdb);
        }
        if (this.zzel != null) {
            zzbfaVar.zzm(48, this.zzel.intValue());
        }
        if (this.zzem != null) {
            zzbfaVar.zzm(49, this.zzem.intValue());
        }
        if (this.zzet != null) {
            zzbfaVar.zza(50, this.zzet);
        }
        if (this.zzen != null) {
            zzbfaVar.zzi(51, this.zzen.longValue());
        }
        if (this.zzeo != null) {
            zzbfaVar.zzi(52, this.zzeo.longValue());
        }
        if (this.zzep != null) {
            zzbfaVar.zzi(53, this.zzep.longValue());
        }
        if (this.zzeq != null) {
            zzbfaVar.zzi(54, this.zzeq.longValue());
        }
        if (this.zzer != null) {
            zzbfaVar.zzi(55, this.zzer.longValue());
        }
        if (this.zzes != null) {
            zzbfaVar.zzm(56, this.zzes.intValue());
        }
        if (this.zzev != null) {
            zzbfaVar.zza(57, this.zzev);
        }
        if (this.zzew != null) {
            zzbfaVar.zzi(58, this.zzew.longValue());
        }
        if (this.zzex != null) {
            zzbfaVar.zzi(59, this.zzex.longValue());
        }
        if (this.zzey != null) {
            zzbfaVar.zzi(60, this.zzey.longValue());
        }
        if (this.zzez != null) {
            zzbfaVar.zzi(61, this.zzez.longValue());
        }
        if (this.zzfa != null) {
            zzbfaVar.zzi(62, this.zzfa.longValue());
        }
        if (this.zzfb != null) {
            zzbfaVar.zzi(63, this.zzfb.longValue());
        }
        if (this.zzfd != null) {
            zzbfaVar.zzi(64, this.zzfd.longValue());
        }
        if (this.zzfe != null) {
            zzbfaVar.zzm(65, this.zzfe.intValue());
        }
        if (this.zzff != null) {
            zzbfaVar.zzm(66, this.zzff.intValue());
        }
        if (this.zzfc != null) {
            zzbfaVar.zzf(67, this.zzfc);
        }
        if (this.zzfg != null) {
            zzbfaVar.zzm(68, this.zzfg.intValue());
        }
        if (this.zzfn != null) {
            zzbfaVar.zza(201, this.zzfn);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        if (this.zzdc != null) {
            zzr += zzbfa.zzg(1, this.zzdc);
        }
        if (this.zzcw != null) {
            zzr += zzbfa.zzg(2, this.zzcw);
        }
        if (this.zzdd != null) {
            zzr += zzbfa.zzd(3, this.zzdd.longValue());
        }
        if (this.zzde != null) {
            zzr += zzbfa.zzd(4, this.zzde.longValue());
        }
        if (this.zzdf != null) {
            zzr += zzbfa.zzd(5, this.zzdf.longValue());
        }
        if (this.zzdg != null) {
            zzr += zzbfa.zzd(6, this.zzdg.longValue());
        }
        if (this.zzdh != null) {
            zzr += zzbfa.zzd(7, this.zzdh.longValue());
        }
        if (this.zzdi != null) {
            zzr += zzbfa.zzd(8, this.zzdi.longValue());
        }
        if (this.zzdj != null) {
            zzr += zzbfa.zzd(9, this.zzdj.longValue());
        }
        if (this.zzdk != null) {
            zzr += zzbfa.zzd(10, this.zzdk.longValue());
        }
        if (this.zzdl != null) {
            zzr += zzbfa.zzd(11, this.zzdl.longValue());
        }
        if (this.zzdm != null) {
            zzr += zzbfa.zzd(12, this.zzdm.longValue());
        }
        if (this.zzdn != null) {
            zzr += zzbfa.zzg(13, this.zzdn);
        }
        if (this.zzdo != null) {
            zzr += zzbfa.zzd(14, this.zzdo.longValue());
        }
        if (this.zzdp != null) {
            zzr += zzbfa.zzd(15, this.zzdp.longValue());
        }
        if (this.zzdq != null) {
            zzr += zzbfa.zzd(16, this.zzdq.longValue());
        }
        if (this.zzdr != null) {
            zzr += zzbfa.zzd(17, this.zzdr.longValue());
        }
        if (this.zzds != null) {
            zzr += zzbfa.zzd(18, this.zzds.longValue());
        }
        if (this.zzdt != null) {
            zzr += zzbfa.zzd(19, this.zzdt.longValue());
        }
        if (this.zzdu != null) {
            zzr += zzbfa.zzd(20, this.zzdu.longValue());
        }
        if (this.zzfh != null) {
            zzr += zzbfa.zzd(21, this.zzfh.longValue());
        }
        if (this.zzdv != null) {
            zzr += zzbfa.zzd(22, this.zzdv.longValue());
        }
        if (this.zzdw != null) {
            zzr += zzbfa.zzd(23, this.zzdw.longValue());
        }
        if (this.zzfi != null) {
            zzr += zzbfa.zzg(24, this.zzfi);
        }
        if (this.zzfm != null) {
            zzr += zzbfa.zzd(25, this.zzfm.longValue());
        }
        if (this.zzfj != null) {
            zzr += zzbfa.zzq(26, this.zzfj.intValue());
        }
        if (this.zzcx != null) {
            zzr += zzbfa.zzg(27, this.zzcx);
        }
        if (this.zzfk != null) {
            this.zzfk.booleanValue();
            zzr += zzbfa.zzcd(28) + 1;
        }
        if (this.zzdx != null) {
            zzr += zzbfa.zzg(29, this.zzdx);
        }
        if (this.zzfl != null) {
            zzr += zzbfa.zzg(30, this.zzfl);
        }
        if (this.zzdy != null) {
            zzr += zzbfa.zzd(31, this.zzdy.longValue());
        }
        if (this.zzdz != null) {
            zzr += zzbfa.zzd(32, this.zzdz.longValue());
        }
        if (this.zzea != null) {
            zzr += zzbfa.zzd(33, this.zzea.longValue());
        }
        if (this.zzcz != null) {
            zzr += zzbfa.zzg(34, this.zzcz);
        }
        if (this.zzeb != null) {
            zzr += zzbfa.zzd(35, this.zzeb.longValue());
        }
        if (this.zzec != null) {
            zzr += zzbfa.zzd(36, this.zzec.longValue());
        }
        if (this.zzed != null) {
            zzr += zzbfa.zzd(37, this.zzed.longValue());
        }
        if (this.zzee != null) {
            zzr += zzbfa.zzb(38, this.zzee);
        }
        if (this.zzef != null) {
            zzr += zzbfa.zzd(39, this.zzef.longValue());
        }
        if (this.zzeg != null) {
            zzr += zzbfa.zzd(40, this.zzeg.longValue());
        }
        if (this.zzeh != null) {
            zzr += zzbfa.zzd(41, this.zzeh.longValue());
        }
        if (this.zzei != null) {
            zzr += zzbfa.zzd(42, this.zzei.longValue());
        }
        if (this.zzeu != null && this.zzeu.length > 0) {
            for (int i = 0; i < this.zzeu.length; i++) {
                zzbb zzbbVar = this.zzeu[i];
                if (zzbbVar != null) {
                    zzr += zzbfa.zzb(43, zzbbVar);
                }
            }
        }
        if (this.zzej != null) {
            zzr += zzbfa.zzd(44, this.zzej.longValue());
        }
        if (this.zzek != null) {
            zzr += zzbfa.zzd(45, this.zzek.longValue());
        }
        if (this.zzda != null) {
            zzr += zzbfa.zzg(46, this.zzda);
        }
        if (this.zzdb != null) {
            zzr += zzbfa.zzg(47, this.zzdb);
        }
        if (this.zzel != null) {
            zzr += zzbfa.zzq(48, this.zzel.intValue());
        }
        if (this.zzem != null) {
            zzr += zzbfa.zzq(49, this.zzem.intValue());
        }
        if (this.zzet != null) {
            zzr += zzbfa.zzb(50, this.zzet);
        }
        if (this.zzen != null) {
            zzr += zzbfa.zzd(51, this.zzen.longValue());
        }
        if (this.zzeo != null) {
            zzr += zzbfa.zzd(52, this.zzeo.longValue());
        }
        if (this.zzep != null) {
            zzr += zzbfa.zzd(53, this.zzep.longValue());
        }
        if (this.zzeq != null) {
            zzr += zzbfa.zzd(54, this.zzeq.longValue());
        }
        if (this.zzer != null) {
            zzr += zzbfa.zzd(55, this.zzer.longValue());
        }
        if (this.zzes != null) {
            zzr += zzbfa.zzq(56, this.zzes.intValue());
        }
        if (this.zzev != null) {
            zzr += zzbfa.zzb(57, this.zzev);
        }
        if (this.zzew != null) {
            zzr += zzbfa.zzd(58, this.zzew.longValue());
        }
        if (this.zzex != null) {
            zzr += zzbfa.zzd(59, this.zzex.longValue());
        }
        if (this.zzey != null) {
            zzr += zzbfa.zzd(60, this.zzey.longValue());
        }
        if (this.zzez != null) {
            zzr += zzbfa.zzd(61, this.zzez.longValue());
        }
        if (this.zzfa != null) {
            zzr += zzbfa.zzd(62, this.zzfa.longValue());
        }
        if (this.zzfb != null) {
            zzr += zzbfa.zzd(63, this.zzfb.longValue());
        }
        if (this.zzfd != null) {
            zzr += zzbfa.zzd(64, this.zzfd.longValue());
        }
        if (this.zzfe != null) {
            zzr += zzbfa.zzq(65, this.zzfe.intValue());
        }
        if (this.zzff != null) {
            zzr += zzbfa.zzq(66, this.zzff.intValue());
        }
        if (this.zzfc != null) {
            zzr += zzbfa.zzg(67, this.zzfc);
        }
        if (this.zzfg != null) {
            zzr += zzbfa.zzq(68, this.zzfg.intValue());
        }
        return this.zzfn != null ? zzr + zzbfa.zzb(201, this.zzfn) : zzr;
    }
}
