package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzaba extends zztp implements zzabr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private zzmh zzC;
    private boolean zzD;
    private long zzE;
    private int zzF;
    private long zzG;
    private zzcd zzH;
    private zzcd zzI;
    private int zzJ;
    private int zzK;
    private zzabp zzL;
    private long zzM;
    private long zzN;
    private boolean zzO;
    private final Context zze;
    private final boolean zzf;
    private final zzaci zzg;
    private final boolean zzh;
    private final zzabs zzi;
    private final zzabq zzj;
    private final PriorityQueue zzk;
    private zzaaz zzl;
    private boolean zzm;
    private boolean zzn;
    private zzaco zzo;
    private boolean zzp;
    private int zzq;
    private List zzr;
    private Surface zzs;
    private zzabd zzt;
    private zzeo zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzaba(zzaay zzaayVar) {
        super(2, r2, r3, false, 30.0f);
        zztd zztdVar;
        zztr zztrVar;
        Context context;
        Handler handler;
        zzacj zzacjVar;
        zztdVar = zzaayVar.zzd;
        zztrVar = zzaayVar.zzc;
        context = zzaayVar.zza;
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzo = null;
        handler = zzaayVar.zze;
        zzacjVar = zzaayVar.zzf;
        this.zzg = new zzaci(handler, zzacjVar);
        this.zzf = this.zzo == null;
        this.zzi = new zzabs(applicationContext, this, 0L);
        this.zzj = new zzabq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzu = zzeo.zza;
        this.zzw = 1;
        this.zzx = 0;
        this.zzH = zzcd.zza;
        this.zzK = 0;
        this.zzI = null;
        this.zzJ = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.zzM = -9223372036854775807L;
        this.zzN = -9223372036854775807L;
        this.zzk = new PriorityQueue();
        this.zzC = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzaf(zzti zztiVar, zzz zzzVar) {
        int i = zzzVar.zzv;
        int i2 = zzzVar.zzw;
        if (i != -1 && i2 != -1) {
            String str = zzzVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = zzuc.zza;
                Pair zza = zzdk.zza(zzzVar);
                if (zza != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i4 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        return Math.max(2097152, ((i * i2) * 3) / 4);
                    }
                    break;
                case 1187890754:
                    break;
                case 1331836730:
                    if (str.equals("video/avc") && !"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zztiVar.zzf)))) {
                        String str2 = zzex.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 1599127256:
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        i4 = 8;
                        return ((i * i2) * 3) / i4;
                    }
                    break;
            }
        }
        return -1;
    }

    protected static int zzag(zzti zztiVar, zzz zzzVar) {
        int i = zzzVar.zzp;
        if (i == -1) {
            return zzaf(zztiVar, zzzVar);
        }
        List list = zzzVar.zzr;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ad, code lost:
    
        if (r1.equals("itel_S41") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        if (r1.equals("LS-5017") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c1, code lost:
    
        if (r1.equals("panell_d") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cb, code lost:
    
        if (r1.equals("j2xlteins") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d5, code lost:
    
        if (r1.equals("A7000plus") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01df, code lost:
    
        if (r1.equals("manning") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e9, code lost:
    
        if (r1.equals("GIONEE_WBL7519") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f3, code lost:
    
        if (r1.equals("GIONEE_WBL7365") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fd, code lost:
    
        if (r1.equals("GIONEE_WBL5708") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0207, code lost:
    
        if (r1.equals("QM16XE_U") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0211, code lost:
    
        if (r1.equals("Pixi5-10_4G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021b, code lost:
    
        if (r1.equals("TB3-850M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0225, code lost:
    
        if (r1.equals("TB3-850F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022f, code lost:
    
        if (r1.equals("TB3-730X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0239, code lost:
    
        if (r1.equals("TB3-730F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0243, code lost:
    
        if (r1.equals("A7020a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024d, code lost:
    
        if (r1.equals("A7010a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0257, code lost:
    
        if (r1.equals("griffin") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0261, code lost:
    
        if (r1.equals("marino_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026b, code lost:
    
        if (r1.equals("CPY83_I00") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0275, code lost:
    
        if (r1.equals("A2016a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027f, code lost:
    
        if (r1.equals("le_x6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0289, code lost:
    
        if (r1.equals("l5460") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0293, code lost:
    
        if (r1.equals("i9031") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029d, code lost:
    
        if (r1.equals("X3_HK") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a7, code lost:
    
        if (r1.equals("V23GB") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b1, code lost:
    
        if (r1.equals("Q4310") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bb, code lost:
    
        if (r1.equals("Q4260") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c5, code lost:
    
        if (r1.equals("PRO7S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cf, code lost:
    
        if (r1.equals("F3311") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r1.equals("machuca") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d9, code lost:
    
        if (r1.equals("F3215") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e3, code lost:
    
        if (r1.equals("F3213") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ed, code lost:
    
        if (r1.equals("F3211") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f7, code lost:
    
        if (r1.equals("F3116") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0301, code lost:
    
        if (r1.equals("F3113") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030b, code lost:
    
        if (r1.equals("F3111") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0315, code lost:
    
        if (r1.equals("E5643") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031f, code lost:
    
        if (r1.equals("A1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0329, code lost:
    
        if (r1.equals("Aura_Note_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0333, code lost:
    
        if (r1.equals("602LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033d, code lost:
    
        if (r1.equals("601LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0347, code lost:
    
        if (r1.equals("MEIZU_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0351, code lost:
    
        if (r1.equals("p212") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035b, code lost:
    
        if (r1.equals("mido") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0365, code lost:
    
        if (r1.equals("kate") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x036f, code lost:
    
        if (r1.equals("fugu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0379, code lost:
    
        if (r1.equals("XE2X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0383, code lost:
    
        if (r1.equals("Q427") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x038d, code lost:
    
        if (r1.equals("Q350") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0397, code lost:
    
        if (r1.equals("P681") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r1.equals("once") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a1, code lost:
    
        if (r1.equals("F04J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03ab, code lost:
    
        if (r1.equals("F04H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b5, code lost:
    
        if (r1.equals("F03H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bf, code lost:
    
        if (r1.equals("F02H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c9, code lost:
    
        if (r1.equals("F01J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03d3, code lost:
    
        if (r1.equals("F01H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03dd, code lost:
    
        if (r1.equals("1714") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e7, code lost:
    
        if (r1.equals("1713") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f1, code lost:
    
        if (r1.equals("1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03fb, code lost:
    
        if (r1.equals("flo") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r1.equals("magnolia") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0405, code lost:
    
        if (r1.equals("deb") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x040f, code lost:
    
        if (r1.equals("cv3") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0419, code lost:
    
        if (r1.equals("cv1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0423, code lost:
    
        if (r1.equals("Z80") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x042d, code lost:
    
        if (r1.equals("QX1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0437, code lost:
    
        if (r1.equals("PLE") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0441, code lost:
    
        if (r1.equals("P85") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x044b, code lost:
    
        if (r1.equals("MX6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0455, code lost:
    
        if (r1.equals("M5c") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x045f, code lost:
    
        if (r1.equals("M04") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r1.equals("aquaman") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0469, code lost:
    
        if (r1.equals("JGZ") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0473, code lost:
    
        if (r1.equals("mh") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x047d, code lost:
    
        if (r1.equals("b5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0487, code lost:
    
        if (r1.equals("V5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0491, code lost:
    
        if (r1.equals("V1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x049b, code lost:
    
        if (r1.equals("Q5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04a5, code lost:
    
        if (r1.equals("C1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04af, code lost:
    
        if (r1.equals("woods_fn") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04b9, code lost:
    
        if (r1.equals("ELUGA_A3_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c3, code lost:
    
        if (r1.equals("Z12_PRO") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r1.equals("oneday") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04cd, code lost:
    
        if (r1.equals("BLACK-1X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d7, code lost:
    
        if (r1.equals("taido_row") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04e1, code lost:
    
        if (r1.equals("Pixi4-7_3G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04eb, code lost:
    
        if (r1.equals("GIONEE_GBL7360") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04f5, code lost:
    
        if (r1.equals("GiONEE_CBL7513") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04ff, code lost:
    
        if (r1.equals("OnePlus5T") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0509, code lost:
    
        if (r1.equals("whyred") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0513, code lost:
    
        if (r1.equals("watson") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x051d, code lost:
    
        if (r1.equals("SVP-DTV15") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0527, code lost:
    
        if (r1.equals("A7000-a") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r1.equals("dangalUHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0531, code lost:
    
        if (r1.equals("nicklaus_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x053b, code lost:
    
        if (r1.equals("tcl_eu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0545, code lost:
    
        if (r1.equals("ELUGA_Ray_X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x054f, code lost:
    
        if (r1.equals("s905x018") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0559, code lost:
    
        if (r1.equals("A10-70L") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0563, code lost:
    
        if (r1.equals("A10-70F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x056d, code lost:
    
        if (r1.equals("namath") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0577, code lost:
    
        if (r1.equals("Slate_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0581, code lost:
    
        if (r1.equals("iris60") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x058b, code lost:
    
        if (r1.equals("BRAVIA_ATV2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r1.equals("dangalFHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0595, code lost:
    
        if (r1.equals("GiONEE_GBL7319") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x059f, code lost:
    
        if (r1.equals("panell_dt") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05a9, code lost:
    
        if (r1.equals("panell_ds") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05b3, code lost:
    
        if (r1.equals("panell_dl") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05bd, code lost:
    
        if (r1.equals("vernee_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05c7, code lost:
    
        if (r1.equals("pacificrim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05d1, code lost:
    
        if (r1.equals("Phantom6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05db, code lost:
    
        if (r1.equals("ComioS1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05e5, code lost:
    
        if (r1.equals("XT1663") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05ef, code lost:
    
        if (r1.equals("RAIJIN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r1.equals("dangal") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05f9, code lost:
    
        if (r1.equals("AquaPowerM") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0602, code lost:
    
        if (r1.equals("PGN611") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x060b, code lost:
    
        if (r1.equals("PGN610") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0614, code lost:
    
        if (r1.equals("PGN528") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x061d, code lost:
    
        if (r1.equals("NX573J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0626, code lost:
    
        if (r1.equals("NX541J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x062f, code lost:
    
        if (r1.equals("CP8676_I02") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0638, code lost:
    
        if (r1.equals("K50a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0641, code lost:
    
        if (r1.equals("GIONEE_SWW1631") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x064a, code lost:
    
        if (r1.equals("GIONEE_SWW1627") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0653, code lost:
    
        if (r1.equals("GIONEE_SWW1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0669, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r1.equals("AFTEUFF014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (r1.equals("AFTSO001") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        if (r1.equals("AFTEU014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        if (r1.equals("AFTEU011") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        if (r1.equals("AFTR") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r1.equals("AFTN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (r1.equals("AFTA") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        if (r1.equals("AFTKMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        if (r1.equals("AFTJMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ef, code lost:
    
        if (r1.equals("HWWAS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
    
        if (r1.equals("HWVNS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0103, code lost:
    
        if (r1.equals("ELUGA_Prim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
    
        if (r1.equals("ELUGA_Note") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
    
        if (r1.equals("ASUS_X00AD_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
    
        if (r1.equals("HWCAM-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012b, code lost:
    
        if (r1.equals("HWBLN-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        if (r1.equals("DM-01K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:
    
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        if (r1.equals("Infinix-X572") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0153, code lost:
    
        if (r1.equals("PB2-670M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015d, code lost:
    
        if (r1.equals("santoni") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0167, code lost:
    
        if (r1.equals("iball8735_9806") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
    
        if (r1.equals("CPH1715") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017b, code lost:
    
        if (r1.equals("CPH1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0185, code lost:
    
        if (r1.equals("woods_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018f, code lost:
    
        if (r1.equals("htc_e56ml_dtul") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0199, code lost:
    
        if (r1.equals("EverStar_S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a3, code lost:
    
        if (r1.equals("hwALE-H") != false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbe(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaba.class) {
            if (!zzc) {
                if (Build.VERSION.SDK_INT <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            break;
                        case -1220081023:
                            break;
                        case -1220066608:
                            break;
                        case -1012436106:
                            break;
                        case -760312546:
                            break;
                        case -64886864:
                            break;
                        case 3415681:
                            break;
                        case 825323514:
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                if (Build.VERSION.SDK_INT > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            break;
                        case -321033677:
                            break;
                        case 2006354:
                            break;
                        case 2006367:
                            break;
                        case 2006371:
                            break;
                        case 1785421873:
                            break;
                        case 1785421876:
                            break;
                        case 1798172390:
                            break;
                        case 2119412532:
                            break;
                        default:
                            if (Build.VERSION.SDK_INT <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        break;
                                    case -2144781185:
                                        break;
                                    case -2144781160:
                                        break;
                                    case -2097309513:
                                        break;
                                    case -2022874474:
                                        break;
                                    case -1978993182:
                                        break;
                                    case -1978990237:
                                        break;
                                    case -1936688988:
                                        break;
                                    case -1936688066:
                                        break;
                                    case -1936688065:
                                        break;
                                    case -1931988508:
                                        break;
                                    case -1885099851:
                                        break;
                                    case -1696512866:
                                        break;
                                    case -1680025915:
                                        break;
                                    case -1615810839:
                                        break;
                                    case -1600724499:
                                        break;
                                    case -1554255044:
                                        break;
                                    case -1481772737:
                                        break;
                                    case -1481772730:
                                        break;
                                    case -1481772729:
                                        break;
                                    case -1320080169:
                                        break;
                                    case -1217592143:
                                        break;
                                    case -1180384755:
                                        break;
                                    case -1139198265:
                                        break;
                                    case -1052835013:
                                        break;
                                    case -993250464:
                                        break;
                                    case -993250458:
                                        break;
                                    case -965403638:
                                        break;
                                    case -958336948:
                                        break;
                                    case -879245230:
                                        break;
                                    case -842500323:
                                        break;
                                    case -821392978:
                                        break;
                                    case -797483286:
                                        break;
                                    case -794946968:
                                        break;
                                    case -788334647:
                                        break;
                                    case -782144577:
                                        break;
                                    case -575125681:
                                        break;
                                    case -521118391:
                                        break;
                                    case -430914369:
                                        break;
                                    case -290434366:
                                        break;
                                    case -282781963:
                                        break;
                                    case -277133239:
                                        break;
                                    case -173639913:
                                        break;
                                    case -56598463:
                                        break;
                                    case 2126:
                                        break;
                                    case 2564:
                                        break;
                                    case 2715:
                                        break;
                                    case 2719:
                                        break;
                                    case 3091:
                                        break;
                                    case 3483:
                                        break;
                                    case 73405:
                                        break;
                                    case 75537:
                                        break;
                                    case 75739:
                                        break;
                                    case 76779:
                                        break;
                                    case 78669:
                                        break;
                                    case 79305:
                                        break;
                                    case 80618:
                                        break;
                                    case 88274:
                                        break;
                                    case 98846:
                                        break;
                                    case 98848:
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        break;
                                    case 1513190:
                                        break;
                                    case 1514184:
                                        break;
                                    case 1514185:
                                        break;
                                    case 2133089:
                                        break;
                                    case 2133091:
                                        break;
                                    case 2133120:
                                        break;
                                    case 2133151:
                                        break;
                                    case 2133182:
                                        break;
                                    case 2133184:
                                        break;
                                    case 2436959:
                                        break;
                                    case 2463773:
                                        break;
                                    case 2464648:
                                        break;
                                    case 2689555:
                                        break;
                                    case 3154429:
                                        break;
                                    case 3284551:
                                        break;
                                    case 3351335:
                                        break;
                                    case 3386211:
                                        break;
                                    case 41325051:
                                        break;
                                    case 51349633:
                                        break;
                                    case 51350594:
                                        break;
                                    case 55178625:
                                        break;
                                    case 61542055:
                                        break;
                                    case 65355429:
                                        break;
                                    case 66214468:
                                        break;
                                    case 66214470:
                                        break;
                                    case 66214473:
                                        break;
                                    case 66215429:
                                        break;
                                    case 66215431:
                                        break;
                                    case 66215433:
                                        break;
                                    case 66216390:
                                        break;
                                    case 76402249:
                                        break;
                                    case 76404105:
                                        break;
                                    case 76404911:
                                        break;
                                    case 80963634:
                                        break;
                                    case 82882791:
                                        break;
                                    case 98715550:
                                        break;
                                    case 101370885:
                                        break;
                                    case 102844228:
                                        break;
                                    case 165221241:
                                        break;
                                    case 182191441:
                                        break;
                                    case 245388979:
                                        break;
                                    case 287431619:
                                        break;
                                    case 307593612:
                                        break;
                                    case 308517133:
                                        break;
                                    case 316215098:
                                        break;
                                    case 316215116:
                                        break;
                                    case 316246811:
                                        break;
                                    case 316246818:
                                        break;
                                    case 407160593:
                                        break;
                                    case 507412548:
                                        break;
                                    case 793982701:
                                        break;
                                    case 794038622:
                                        break;
                                    case 794040393:
                                        break;
                                    case 835649806:
                                        break;
                                    case 917340916:
                                        break;
                                    case 958008161:
                                        break;
                                    case 1060579533:
                                        break;
                                    case 1150207623:
                                        break;
                                    case 1176899427:
                                        break;
                                    case 1280332038:
                                        break;
                                    case 1306947716:
                                        break;
                                    case 1349174697:
                                        break;
                                    case 1522194893:
                                        break;
                                    case 1691543273:
                                        break;
                                    case 1691544261:
                                        break;
                                    case 1709443163:
                                        break;
                                    case 1865889110:
                                        break;
                                    case 1906253259:
                                        break;
                                    case 1977196784:
                                        break;
                                    case 2006372676:
                                        break;
                                    case 2019281702:
                                        break;
                                    case 2029784656:
                                        break;
                                    case 2030379515:
                                        break;
                                    case 2033393791:
                                        break;
                                    case 2047190025:
                                        break;
                                    case 2047252157:
                                        break;
                                    case 2048319463:
                                        break;
                                    case 2048855701:
                                        break;
                                    default:
                                        String str5 = Build.MODEL;
                                        if (str5.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                }
                            }
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                z = true;
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzbf(zzti zztiVar) {
        return Build.VERSION.SDK_INT >= 35 && zztiVar.zzh;
    }

    private final Surface zzbg(zzti zztiVar) {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            return zzacoVar.zzb();
        }
        Surface surface = this.zzs;
        if (surface != null) {
            return surface;
        }
        if (zzbf(zztiVar)) {
            return null;
        }
        zzdd.zzf(zzbd(zztiVar));
        zzabd zzabdVar = this.zzt;
        if (zzabdVar != null) {
            if (zzabdVar.zza != zztiVar.zzf) {
                zzbl();
            }
        }
        if (this.zzt == null) {
            this.zzt = zzabd.zza(this.zze, zztiVar.zzf);
        }
        return this.zzt;
    }

    private static List zzbh(Context context, zztr zztrVar, zzz zzzVar, boolean z, boolean z2) throws zztw {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfyq.zzn();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            List zzc2 = zzuc.zzc(zztrVar, zzzVar, z, z2);
            if (!zzc2.isEmpty()) {
                return zzc2;
            }
        }
        return zzuc.zze(zztrVar, zzzVar, z, z2);
    }

    private final void zzbi() {
        zzcd zzcdVar = this.zzI;
        if (zzcdVar != null) {
            this.zzg.zzt(zzcdVar);
        }
    }

    private final void zzbj(long j, long j2, zzz zzzVar) {
        zzabp zzabpVar = this.zzL;
        if (zzabpVar != null) {
            zzabpVar.zzcT(j, j2, zzzVar, zzaC());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzbk() {
        this.zzg.zzq(this.zzs);
        this.zzv = true;
    }

    private final void zzbl() {
        zzabd zzabdVar = this.zzt;
        if (zzabdVar != null) {
            zzabdVar.release();
            this.zzt = null;
        }
    }

    private final void zzbm(Object obj) throws zzin {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzs == surface) {
            if (surface != null) {
                zzbi();
                Surface surface2 = this.zzs;
                if (surface2 == null || !this.zzv) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzs = surface;
        if (this.zzo == null) {
            this.zzi.zzk(surface);
        }
        this.zzv = false;
        int zzcU = zzcU();
        zztf zzaF = zzaF();
        if (zzaF != null && this.zzo == null) {
            zzti zzaH = zzaH();
            zzaH.getClass();
            if (!zzbn(zzaH) || this.zzm) {
                zzaM();
                zzaJ();
            } else {
                Surface zzbg = zzbg(zzaH);
                if (zzbg != null) {
                    zzaF.zzp(zzbg);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaF.zzi();
                }
            }
        }
        if (surface != null) {
            zzbi();
        } else {
            this.zzI = null;
            zzaco zzacoVar = this.zzo;
            if (zzacoVar != null) {
                zzacoVar.zzi();
            }
        }
        if (zzcU == 2) {
            zzaco zzacoVar2 = this.zzo;
            if (zzacoVar2 != null) {
                zzacoVar2.zzk(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    private final boolean zzbn(zzti zztiVar) {
        if (this.zzo != null) {
            return true;
        }
        Surface surface = this.zzs;
        return (surface != null && surface.isValid()) || zzbf(zztiVar) || zzbd(zztiVar);
    }

    private final boolean zzbo(zzhs zzhsVar) {
        return zzhsVar.zze < zzcW();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    protected final void zzA(long j, boolean z) throws zzin {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null && !z) {
            zzacoVar.zzj(true);
        }
        super.zzA(j, z);
        if (this.zzo == null) {
            this.zzi.zzg();
        }
        if (z) {
            zzaco zzacoVar2 = this.zzo;
            if (zzacoVar2 != null) {
                zzacoVar2.zzk(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzA = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzB() {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar == null || !this.zzf) {
            return;
        }
        zzacoVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    protected final void zzD() {
        try {
            super.zzD();
        } finally {
            this.zzp = false;
            this.zzM = -9223372036854775807L;
            zzbl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzE() {
        this.zzz = 0;
        this.zzy = zzcX().zzb();
        this.zzE = 0L;
        this.zzF = 0;
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            zzacoVar.zzx();
        } else {
            this.zzi.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzF() {
        if (this.zzz > 0) {
            long zzb2 = zzcX().zzb();
            this.zzg.zzn(this.zzz, zzb2 - this.zzy);
            this.zzz = 0;
            this.zzy = zzb2;
        }
        int i = this.zzF;
        if (i != 0) {
            this.zzg.zzr(this.zzE, i);
            this.zzE = 0L;
            this.zzF = 0;
        }
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            zzacoVar.zzy();
        } else {
            this.zzi.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    protected final void zzG(zzz[] zzzVarArr, long j, long j2, zzvh zzvhVar) throws zzin {
        super.zzG(zzzVarArr, j, j2, zzvhVar);
        zzbl zzi = zzi();
        if (zzi.zzo()) {
            this.zzN = -9223372036854775807L;
        } else {
            this.zzN = zzi.zzn(zzvhVar.zza, new zzbj()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final void zzN(float f, float f2) throws zzin {
        super.zzN(f, f2);
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            zzacoVar.zzt(f);
        } else {
            this.zzi.zzl(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzmd
    public final String zzV() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final void zzW(long j, long j2) throws zzin {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            try {
                zzacoVar.zzo(j, j2);
            } catch (zzacn e) {
                throw zzk(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzW(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzX() {
        if (!super.zzX()) {
            return false;
        }
        zzaco zzacoVar = this.zzo;
        return zzacoVar == null || zzacoVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzY() {
        boolean zzY = super.zzY();
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            return zzacoVar.zzD(zzY);
        }
        if (zzY && zzaF() == null) {
            return true;
        }
        return this.zzi.zzm(zzY);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final zzth zzaG(Throwable th, zzti zztiVar) {
        return new zzaau(th, zztiVar, this.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzaK(long j) {
        super.zzaK(j);
        this.zzB--;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzaL(zzhs zzhsVar) throws zzin {
        int zzay = zzay(zzhsVar);
        if (Build.VERSION.SDK_INT < 34 || (zzay & 32) == 0) {
            this.zzB++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzaN() {
        super.zzaN();
        this.zzk.clear();
        this.zzB = 0;
        this.zzD = false;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final boolean zzaT(zzz zzzVar) throws zzin {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar == null || zzacoVar.zzC()) {
            return true;
        }
        try {
            zzacoVar.zzA(zzzVar);
            return true;
        } catch (zzacn e) {
            throw zzk(e, zzzVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final boolean zzaU(zzhs zzhsVar) {
        boolean z = false;
        if (!zzR() && !zzhsVar.zzh() && this.zzN != -9223372036854775807L) {
            if (this.zzN - (zzhsVar.zze - zzaA()) > 100000 && zzbo(zzhsVar)) {
                if (zzhsVar.zze()) {
                    return false;
                }
                if (zzhsVar.zzi()) {
                    zzhsVar.zzb();
                    z = true;
                }
                if (z) {
                    this.zza.zzd++;
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final boolean zzaV() {
        return this.zzC == null || this.zzD || zzaQ() || zzaz() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final boolean zzaW(zzti zztiVar) {
        return zzbn(zztiVar);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final boolean zzaX() {
        zzti zzaH = zzaH();
        if (this.zzo != null && zzaH != null) {
            String str = zzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaX();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final float zzaa(float f, zzz zzzVar, zzz[] zzzVarArr) {
        zzti zzaH;
        float f2 = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f3 = zzzVar2.zzz;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzC == null || (zzaH = zzaH()) == null) {
            return f4;
        }
        float zza = zzaH.zza(zzzVar.zzv, zzzVar.zzw);
        return f4 != -1.0f ? Math.max(f4, zza) : zza;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final int zzab(zztr zztrVar, zzz zzzVar) throws zztw {
        boolean z;
        String str = zzzVar.zzo;
        if (!zzay.zzj(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzzVar.zzs != null;
        List zzbh = zzbh(context, zztrVar, zzzVar, z2, false);
        if (z2 && zzbh.isEmpty()) {
            zzbh = zzbh(context, zztrVar, zzzVar, false, false);
        }
        if (zzbh.isEmpty()) {
            return Opcodes.LOR;
        }
        if (!zzaY(zzzVar)) {
            return 130;
        }
        zzti zztiVar = (zzti) zzbh.get(0);
        boolean zzf = zztiVar.zzf(zzzVar);
        if (!zzf) {
            for (int i2 = 1; i2 < zzbh.size(); i2++) {
                zzti zztiVar2 = (zzti) zzbh.get(i2);
                if (zztiVar2.zzf(zzzVar)) {
                    zzf = true;
                    z = false;
                    zztiVar = zztiVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzf ? 3 : 4;
        int i4 = true != zztiVar.zzg(zzzVar) ? 8 : 16;
        int i5 = true != zztiVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            i6 = 256;
        }
        if (zzf) {
            List zzbh2 = zzbh(context, zztrVar, zzzVar, z2, true);
            if (!zzbh2.isEmpty()) {
                zzti zztiVar3 = (zzti) zzuc.zzf(zzbh2, zzzVar).get(0);
                if (zztiVar3.zzf(zzzVar) && zztiVar3.zzg(zzzVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final zzie zzad(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        int i;
        int i2;
        zzie zzc2 = zztiVar.zzc(zzzVar, zzzVar2);
        int i3 = zzc2.zze;
        zzaaz zzaazVar = this.zzl;
        zzaazVar.getClass();
        if (zzzVar2.zzv > zzaazVar.zza || zzzVar2.zzw > zzaazVar.zzb) {
            i3 |= 256;
        }
        if (zzag(zztiVar, zzzVar2) > zzaazVar.zzc) {
            i3 |= 64;
        }
        String str = zztiVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzc2.zzd;
        }
        return new zzie(str, zzzVar, zzzVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final zzie zzae(zzkv zzkvVar) throws zzin {
        zzie zzae = super.zzae(zzkvVar);
        zzz zzzVar = zzkvVar.zza;
        zzzVar.getClass();
        this.zzg.zzp(zzzVar, zzae);
        return zzae;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final zztc zzaj(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f) {
        zzaaz zzaazVar;
        Point point;
        int i;
        int i2;
        int i3;
        boolean z;
        zzz[] zzzVarArr;
        char c;
        boolean z2;
        int zzaf;
        zzz[] zzU = zzU();
        int length = zzU.length;
        int zzag = zzag(zztiVar, zzzVar);
        int i4 = zzzVar.zzw;
        int i5 = zzzVar.zzv;
        if (length == 1) {
            if (zzag != -1 && (zzaf = zzaf(zztiVar, zzzVar)) != -1) {
                zzag = Math.min((int) (zzag * 1.5f), zzaf);
            }
            zzaazVar = new zzaaz(i5, i4, zzag);
        } else {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z3 = false;
            while (i8 < length) {
                zzz zzzVar2 = zzU[i8];
                zzk zzkVar = zzzVar.zzE;
                if (zzkVar != null && zzzVar2.zzE == null) {
                    zzx zzb2 = zzzVar2.zzb();
                    zzb2.zzF(zzkVar);
                    zzzVar2 = zzb2.zzan();
                }
                if (zztiVar.zzc(zzzVar, zzzVar2).zzd != 0) {
                    int i9 = zzzVar2.zzv;
                    c = 65535;
                    if (i9 != -1) {
                        zzzVarArr = zzU;
                        if (zzzVar2.zzw != -1) {
                            z2 = false;
                            z3 |= z2;
                            i7 = Math.max(i7, i9);
                            i6 = Math.max(i6, zzzVar2.zzw);
                            zzag = Math.max(zzag, zzag(zztiVar, zzzVar2));
                        }
                    } else {
                        zzzVarArr = zzU;
                    }
                    z2 = true;
                    z3 |= z2;
                    i7 = Math.max(i7, i9);
                    i6 = Math.max(i6, zzzVar2.zzw);
                    zzag = Math.max(zzag, zzag(zztiVar, zzzVar2));
                } else {
                    zzzVarArr = zzU;
                    c = 65535;
                }
                i8++;
                zzU = zzzVarArr;
            }
            if (z3) {
                zzea.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i7 + "x" + i6);
                boolean z4 = i4 > i5;
                int i10 = z4 ? i4 : i5;
                int i11 = true != z4 ? i4 : i5;
                int[] iArr = zzb;
                int i12 = 0;
                while (i12 < 9) {
                    float f2 = i11;
                    float f3 = i10;
                    int i13 = iArr[i12];
                    int i14 = i12;
                    float f4 = i13;
                    if (i13 <= i10 || (i = (int) (f4 * (f2 / f3))) <= i11) {
                        break;
                    }
                    int i15 = i10;
                    if (true != z4) {
                        i2 = i11;
                        i3 = i13;
                    } else {
                        i2 = i11;
                        i3 = i;
                    }
                    if (true != z4) {
                        i13 = i;
                    }
                    point = zztiVar.zzb(i3, i13);
                    float f5 = zzzVar.zzz;
                    if (point != null) {
                        z = z4;
                        if (zztiVar.zzh(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i12 = i14 + 1;
                    i10 = i15;
                    i11 = i2;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i6 = Math.max(i6, point.y);
                    zzx zzb3 = zzzVar.zzb();
                    zzb3.zzam(i7);
                    zzb3.zzQ(i6);
                    zzag = Math.max(zzag, zzaf(zztiVar, zzb3.zzan()));
                    zzea.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i7 + "x" + i6);
                }
            }
            zzaazVar = new zzaaz(i7, i6, zzag);
        }
        String str = zztiVar.zzc;
        this.zzl = zzaazVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i5);
        mediaFormat.setInteger("height", i4);
        zzed.zzb(mediaFormat, zzzVar.zzr);
        float f6 = zzzVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzed.zza(mediaFormat, "rotation-degrees", zzzVar.zzA);
        zzk zzkVar2 = zzzVar.zzE;
        if (zzkVar2 != null) {
            zzed.zza(mediaFormat, "color-transfer", zzkVar2.zzd);
            zzed.zza(mediaFormat, "color-standard", zzkVar2.zzb);
            zzed.zza(mediaFormat, "color-range", zzkVar2.zzc);
            byte[] bArr = zzkVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzzVar.zzo)) {
            int i16 = zzuc.zza;
            Pair zza = zzdk.zza(zzzVar);
            if (zza != null) {
                zzed.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaazVar.zza);
        mediaFormat.setInteger("max-height", zzaazVar.zzb);
        zzed.zza(mediaFormat, "max-input-size", zzaazVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzJ));
        }
        Surface zzbg = zzbg(zztiVar);
        if (this.zzo != null && !zzex.zzL(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zztc.zzb(zztiVar, mediaFormat, zzzVar, zzbg, null);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final List zzak(zztr zztrVar, zzz zzzVar, boolean z) throws zztw {
        return zzuc.zzf(zzbh(this.zze, zztrVar, zzzVar, false, false), zzzVar);
    }

    protected final void zzam(zztf zztfVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zztfVar.zzn(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzA = 0;
        if (this.zzo == null) {
            zzcd zzcdVar = this.zzH;
            if (!zzcdVar.equals(zzcd.zza) && !zzcdVar.equals(this.zzI)) {
                this.zzI = zzcdVar;
                this.zzg.zzt(zzcdVar);
            }
            if (!this.zzi.zzn() || this.zzs == null) {
                return;
            }
            zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzan(zzhs zzhsVar) throws zzin {
        if (this.zzn) {
            ByteBuffer byteBuffer = zzhsVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztf zzaF = zzaF();
                        zzaF.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaF.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzao(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzap(String str, zztc zztcVar, long j, long j2) {
        this.zzg.zzk(str, j, j2);
        this.zzm = zzbe(str);
        zzti zzaH = zzaH();
        zzaH.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzi = zzaH.zzi();
            int length = zzi.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzi[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzaq(String str) {
        this.zzg.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzar(zzz zzzVar, MediaFormat mediaFormat) {
        zztf zzaF = zzaF();
        if (zzaF != null) {
            zzaF.zzr(this.zzw);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzzVar.zzB;
        int i = zzzVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzH = new zzcd(integer, integer2, f);
        zzaco zzacoVar = this.zzo;
        if (zzacoVar == null || !this.zzO) {
            this.zzi.zzj(zzzVar.zzz);
        } else {
            zzx zzb2 = zzzVar.zzb();
            zzb2.zzam(integer);
            zzb2.zzQ(integer2);
            zzb2.zzad(f);
            zzz zzan = zzb2.zzan();
            int i3 = this.zzq;
            List list = this.zzr;
            if (list == null) {
                list = zzfyq.zzn();
            }
            zzacoVar.zzl(1, zzan, zzaB(), i3, list);
            this.zzq = 2;
        }
        this.zzO = false;
    }

    protected final void zzas(zztf zztfVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztfVar.zzo(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzat() {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            zzacoVar.zzw();
            long j = this.zzM;
            if (j == -9223372036854775807L) {
                j = zzaB();
                this.zzM = j;
            }
            this.zzo.zzp(-j);
        } else {
            this.zzi.zzf(2);
        }
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final void zzau() {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            zzacoVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final int zzay(zzhs zzhsVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzC == null || !zzbo(zzhsVar)) ? 0 : 32;
    }

    protected final void zzba(int i, int i2) {
        zzid zzidVar = this.zza;
        zzidVar.zzh += i;
        int i3 = i + i2;
        zzidVar.zzg += i3;
        this.zzz += i3;
        int i4 = this.zzA + i3;
        this.zzA = i4;
        zzidVar.zzi = Math.max(i4, zzidVar.zzi);
    }

    protected final void zzbb(long j) {
        zzid zzidVar = this.zza;
        zzidVar.zzk += j;
        zzidVar.zzl++;
        this.zzE += j;
        this.zzF++;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzbc(long j, long j2, long j3, boolean z, boolean z2) throws zzin {
        int zzd2;
        if (this.zzo != null && this.zzf) {
            j2 -= -this.zzM;
        }
        if (j >= -500000 || z || (zzd2 = zzd(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzid zzidVar = this.zza;
            int i = zzidVar.zzd + zzd2;
            zzidVar.zzd = i;
            zzidVar.zzf += this.zzB;
            zzidVar.zzd = i + this.zzk.size();
        } else {
            this.zza.zzj++;
            zzba(zzd2 + this.zzk.size(), this.zzB);
        }
        zzaP();
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            zzacoVar.zzj(false);
        }
        return true;
    }

    protected final boolean zzbd(zzti zztiVar) {
        if (zzbe(zztiVar.zza)) {
            return false;
        }
        return !zztiVar.zzf || zzabd.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final void zzu() {
        zzaco zzacoVar = this.zzo;
        if (zzacoVar == null) {
            this.zzi.zzb();
            return;
        }
        int i = this.zzq;
        if (i == 0 || i == 1) {
            this.zzq = 0;
        } else {
            zzacoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    protected final void zzy() {
        this.zzI = null;
        this.zzN = -9223372036854775807L;
        this.zzv = false;
        this.zzD = true;
        try {
            super.zzy();
        } finally {
            zzaci zzaciVar = this.zzg;
            zzaciVar.zzm(this.zza);
            zzaciVar.zzt(zzcd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    protected final void zzz(boolean z, boolean z2) throws zzin {
        super.zzz(z, z2);
        zzo();
        this.zzg.zzo(this.zza);
        if (!this.zzp) {
            if (this.zzr != null && this.zzo == null) {
                zzabh zzabhVar = new zzabh(this.zze, this.zzi);
                zzabhVar.zze(true);
                zzabhVar.zzd(zzcX());
                zzabo zzf = zzabhVar.zzf();
                zzf.zzt(1);
                this.zzo = zzf.zze(0);
            }
            this.zzp = true;
        }
        int i = !z2 ? 1 : 0;
        zzaco zzacoVar = this.zzo;
        if (zzacoVar == null) {
            zzabs zzabsVar = this.zzi;
            zzabsVar.zzi(zzcX());
            zzabsVar.zzf(i);
            return;
        }
        zzacoVar.zzr(new zzaav(this), zzgef.zzc());
        zzabp zzabpVar = this.zzL;
        if (zzabpVar != null) {
            this.zzo.zzv(zzabpVar);
        }
        if (this.zzs != null && !this.zzu.equals(zzeo.zza)) {
            this.zzo.zzs(this.zzs, this.zzu);
        }
        this.zzo.zzq(this.zzx);
        this.zzo.zzt(zzax());
        List list = this.zzr;
        if (list != null) {
            this.zzo.zzu(list);
        }
        this.zzq = i;
        zzaI();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    protected final boolean zzav(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzzVar) throws zzin {
        zzaba zzabaVar;
        long j4;
        zztfVar.getClass();
        long zzaA = j3 - zzaA();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzk;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzba(i4, 0);
        zzaco zzacoVar = this.zzo;
        if (zzacoVar != null) {
            if (!z || z2) {
                return zzacoVar.zzz(j3, new zzaaw(this, zztfVar, i, zzaA));
            }
            zzas(zztfVar, i, zzaA);
            return true;
        }
        zzabs zzabsVar = this.zzi;
        long zzaB = zzaB();
        zzabq zzabqVar = this.zzj;
        int zza = zzabsVar.zza(j3, j, j2, zzaB, z, z2, zzabqVar);
        if (zza == 0) {
            long zzc2 = zzcX().zzc();
            zzbj(zzaA, zzc2, zzzVar);
            zzam(zztfVar, i, zzaA, zzc2);
            zzbb(zzabqVar.zzc());
            return true;
        }
        if (zza != 1) {
            if (zza != 2) {
                if (zza != 3) {
                    return false;
                }
                zzas(zztfVar, i, zzaA);
                zzbb(zzabqVar.zzc());
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            zztfVar.zzo(i, false);
            Trace.endSection();
            zzba(0, 1);
            zzbb(zzabqVar.zzc());
            return true;
        }
        long zzd2 = zzabqVar.zzd();
        long zzc3 = zzabqVar.zzc();
        if (zzd2 == this.zzG) {
            zzas(zztfVar, i, zzaA);
            j4 = zzd2;
            zzabaVar = this;
        } else {
            zzbj(zzaA, zzd2, zzzVar);
            zzam(zztfVar, i, zzaA, zzd2);
            zzabaVar = this;
            j4 = zzd2;
        }
        zzabaVar.zzbb(zzc3);
        zzabaVar.zzG = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public final void zzv(int i, Object obj) throws zzin {
        if (i == 1) {
            zzbm(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzabp zzabpVar = (zzabp) obj;
            this.zzL = zzabpVar;
            zzaco zzacoVar = this.zzo;
            if (zzacoVar != null) {
                zzacoVar.zzv(zzabpVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzK != intValue) {
                this.zzK = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzw = intValue2;
            zztf zzaF = zzaF();
            if (zzaF != null) {
                zzaF.zzr(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzx = intValue3;
            zzaco zzacoVar2 = this.zzo;
            if (zzacoVar2 != null) {
                zzacoVar2.zzq(intValue3);
                return;
            } else {
                this.zzi.zzh(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbz.zza)) {
                zzaco zzacoVar3 = this.zzo;
                if (zzacoVar3 == null || !zzacoVar3.zzC()) {
                    return;
                }
                zzacoVar3.zzm();
                return;
            }
            this.zzr = list;
            zzaco zzacoVar4 = this.zzo;
            if (zzacoVar4 != null) {
                zzacoVar4.zzu(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeo zzeoVar = (zzeo) obj;
            if (zzeoVar.zzb() == 0 || zzeoVar.zza() == 0) {
                return;
            }
            this.zzu = zzeoVar;
            zzaco zzacoVar5 = this.zzo;
            if (zzacoVar5 != null) {
                Surface surface = this.zzs;
                zzdd.zzb(surface);
                zzacoVar5.zzs(surface, zzeoVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzJ = ((Integer) obj).intValue();
                zztf zzaF2 = zzaF();
                if (zzaF2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzJ));
                    zzaF2.zzq(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzs;
                zzbm(null);
                obj.getClass();
                ((zzaba) obj).zzv(1, surface2);
                break;
            case 18:
                boolean z = this.zzC != null;
                zzmh zzmhVar = (zzmh) obj;
                this.zzC = zzmhVar;
                if (z != (zzmhVar != null)) {
                    zzaZ();
                    break;
                }
                break;
            default:
                super.zzv(i, obj);
                break;
        }
    }
}
