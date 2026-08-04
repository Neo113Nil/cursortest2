package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import androidx.window.core.layout.WindowSizeClass;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaae extends zzsz implements zzaat {
    private static final int[] zzb = {1920, WindowSizeClass.WIDTH_DP_EXTRA_LARGE_LOWER_BOUND, 1440, 1280, 960, 854, 640, 540, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzls zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbu zzI;
    private zzbu zzJ;
    private int zzK;
    private int zzL;
    private zzaar zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzabl zzg;
    private final boolean zzh;
    private final zzaau zzi;
    private final zzaas zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaad zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzaag zzu;
    private zzeg zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    protected zzaae(zzaac zzaacVar) {
        super(2, zzaacVar.zzg(), zzaacVar.zzf(), false, 30.0f);
        Context applicationContext = zzaacVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzabl(zzaacVar.zzh(), zzaacVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzaau(applicationContext, this, 0L);
        this.zzj = new zzaas();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeg.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbu.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
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
    public static int zzas(zzst zzstVar, zzu zzuVar) {
        int i = zzuVar.zzv;
        int i2 = zzuVar.zzw;
        if (i != -1 && i2 != -1) {
            String str = zzuVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = zztl.zza;
                Pair zze = zzdc.zze(zzuVar);
                if (zze != null) {
                    int intValue = ((Integer) zze.first).intValue();
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
                    if (str.equals("video/avc") && !"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zzstVar.zzf)))) {
                        String str2 = zzeo.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
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

    protected static int zzbe(zzst zzstVar, zzu zzuVar) {
        int i = zzuVar.zzp;
        if (i == -1) {
            return zzas(zzstVar, zzuVar);
        }
        List list = zzuVar.zzr;
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
    protected static final boolean zzbi(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaae.class) {
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

    protected static final boolean zzbj(zzst zzstVar) {
        return Build.VERSION.SDK_INT >= 35 && zzstVar.zzh;
    }

    private static List zzbk(Context context, zztb zztbVar, zzu zzuVar, boolean z, boolean z2) throws zztd {
        String str = zzuVar.zzo;
        if (str == null) {
            return zzgjz.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaab.zza(context)) {
            List zzd2 = zztl.zzd(zztbVar, zzuVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zztl.zzc(zztbVar, zzuVar, z, z2);
    }

    private final void zzbl(Object obj) throws zzhz {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbt();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int zze = zze();
        zzsq zzaD = zzaD();
        if (zzaD != null && this.zzp == null) {
            zzst zzaG = zzaG();
            zzaG.getClass();
            if (!zzbp(zzaG) || this.zzn) {
                zzaH();
                zzaz();
            } else {
                Surface zzbq = zzbq(zzaG);
                if (zzbq != null) {
                    zzaD.zzm(zzbq);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaD.zzn();
                }
            }
        }
        if (surface != null) {
            zzbt();
        } else {
            this.zzJ = null;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzq();
            }
        }
        if (zze == 2) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbm(zzhg zzhgVar) {
        if (zzdb() || zzhgVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzhgVar.zze - zzaZ()) <= 100000;
    }

    private final boolean zzbn(zzhg zzhgVar) {
        return zzhgVar.zze < zzG();
    }

    private final void zzbo(long j, long j2, zzu zzuVar) {
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            zzaarVar.zzcS(j, j2, zzuVar, zzaF());
        }
    }

    private final boolean zzbp(zzst zzstVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbj(zzstVar) || zzbd(zzstVar);
    }

    private final Surface zzbq(zzst zzstVar) {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbj(zzstVar)) {
            return null;
        }
        zzghc.zzh(zzbd(zzstVar));
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            if (zzaagVar.zza != zzstVar.zzf) {
                zzbr();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzaag.zzb(this.zze, zzstVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbr() {
        zzaag zzaagVar = this.zzu;
        if (zzaagVar != null) {
            zzaagVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public final void zzbg() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbt() {
        zzbu zzbuVar = this.zzJ;
        if (zzbuVar != null) {
            this.zzg.zzf(zzbuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzA(long j, boolean z) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null && !z) {
            zzabrVar.zzg(true);
        }
        super.zzA(j, z);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z) {
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzC() {
        if (this.zzA > 0) {
            long zzb2 = zzL().zzb();
            this.zzg.zzd(this.zzA, zzb2 - this.zzz);
            this.zzA = 0;
            this.zzz = zzb2;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zze(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzabl zzablVar = this.zzg;
            zzablVar.zzi(this.zza);
            zzablVar.zzf(zzbu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzF() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzf) {
            return;
        }
        zzabrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final void zzU(float f, float f2) throws zzhz {
        super.zzU(f, f2);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzV() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzabrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final void zzW(long j, long j2) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            try {
                zzabrVar.zzv(j, j2);
            } catch (zzabq e) {
                throw zzN(e, e.zza, false, 7001);
            }
        }
        super.zzW(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        boolean zzaV = zzaV();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            return zzabrVar.zzh(zzaV);
        }
        if (zzaV && zzaD() == null) {
            return true;
        }
        return this.zzi.zzi(zzaV);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        if (!super.zzY()) {
            return false;
        }
        zzabr zzabrVar = this.zzp;
        return zzabrVar == null || zzabrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaB(zzst zzstVar) {
        return zzbp(zzstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaJ() {
        zzst zzaG = zzaG();
        if (this.zzp != null && zzaG != null) {
            String str = zzaG.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaK() {
        boolean z;
        zzu zzaE = zzaE();
        long j = this.zzO;
        if (j != -9223372036854775807L) {
            if (zzaL() + j + 1 <= Long.MAX_VALUE - (zzaZ() + this.zzO)) {
                z = false;
                return this.zzD == null || this.zzE || (zzaE != null && zzaE.zzq > 0) || z || zzaT() != -9223372036854775807L;
            }
        }
        z = true;
        if (this.zzD == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaM() {
        super.zzaM();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzss zzaO(Throwable th, zzst zzstVar) {
        return new zzzy(th, zzstVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaP(zzu zzuVar) throws zzhz {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || zzabrVar.zze()) {
            return true;
        }
        try {
            zzabrVar.zzd(zzuVar);
            return true;
        } catch (zzabq e) {
            throw zzN(e, zzuVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaQ(zzhg zzhgVar) throws zzhz {
        int zzaR = zzaR(zzhgVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaR & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzaR(zzhg zzhgVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbn(zzhgVar) || zzbm(zzhgVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzaS(zzhg zzhgVar) {
        boolean z = false;
        if (zzbm(zzhgVar)) {
            return false;
        }
        if (zzbn(zzhgVar)) {
            if (zzhgVar.zze()) {
                return false;
            }
            if (zzhgVar.zzf()) {
                zzhgVar.zza();
                z = true;
            }
            if (z) {
                this.zza.zzd++;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaU(long j) {
        super.zzaU(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        boolean z;
        String str = zzuVar.zzo;
        if (!zzar.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzuVar.zzs != null;
        List zzbk = zzbk(context, zztbVar, zzuVar, z2, false);
        if (z2 && zzbk.isEmpty()) {
            zzbk = zzbk(context, zztbVar, zzuVar, false, false);
        }
        if (zzbk.isEmpty()) {
            return 129;
        }
        if (!zzbb(zzuVar)) {
            return 130;
        }
        zzst zzstVar = (zzst) zzbk.get(0);
        boolean zzc2 = zzstVar.zzc(zzuVar);
        if (!zzc2) {
            for (int i2 = 1; i2 < zzbk.size(); i2++) {
                zzst zzstVar2 = (zzst) zzbk.get(i2);
                if (zzstVar2.zzc(zzuVar)) {
                    zzc2 = true;
                    z = false;
                    zzstVar = zzstVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzstVar.zze(zzuVar) ? 8 : 16;
        int i5 = true != zzstVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaab.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            List zzbk2 = zzbk(context, zztbVar, zzuVar, z2, true);
            if (!zzbk2.isEmpty()) {
                zzst zzstVar3 = (zzst) zztl.zze(zzbk2, zzuVar).get(0);
                if (zzstVar3.zzc(zzuVar) && zzstVar3.zze(zzuVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd {
        return zztl.zze(zzbk(this.zze, zztbVar, zzuVar, false, false), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzsn zzae(zzst zzstVar, zzu zzuVar, MediaCrypto mediaCrypto, float f) {
        int i;
        zzaad zzaadVar;
        Point point;
        int i2;
        int i3;
        int i4;
        boolean z;
        zzu[] zzuVarArr;
        char c;
        boolean z2;
        int zzas;
        zzu[] zzI = zzI();
        int length = zzI.length;
        int zzbe = zzbe(zzstVar, zzuVar);
        int i5 = zzuVar.zzw;
        int i6 = zzuVar.zzv;
        if (length == 1) {
            if (zzbe != -1 && (zzas = zzas(zzstVar, zzuVar)) != -1) {
                zzbe = Math.min((int) (zzbe * 1.5f), zzas);
            }
            zzaadVar = new zzaad(i6, i5, zzbe);
            i = 35;
        } else {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            boolean z3 = false;
            i = 35;
            while (i9 < length) {
                zzu zzuVar2 = zzI[i9];
                zzh zzhVar = zzuVar.zzE;
                if (zzhVar != null && zzuVar2.zzE == null) {
                    zzs zza = zzuVar2.zza();
                    zza.zzC(zzhVar);
                    zzuVar2 = zza.zzM();
                }
                if (zzstVar.zzf(zzuVar, zzuVar2).zzd != 0) {
                    int i10 = zzuVar2.zzv;
                    c = 65535;
                    if (i10 != -1) {
                        zzuVarArr = zzI;
                        if (zzuVar2.zzw != -1) {
                            z2 = false;
                            z3 |= z2;
                            i8 = Math.max(i8, i10);
                            i7 = Math.max(i7, zzuVar2.zzw);
                            zzbe = Math.max(zzbe, zzbe(zzstVar, zzuVar2));
                        }
                    } else {
                        zzuVarArr = zzI;
                    }
                    z2 = true;
                    z3 |= z2;
                    i8 = Math.max(i8, i10);
                    i7 = Math.max(i7, zzuVar2.zzw);
                    zzbe = Math.max(zzbe, zzbe(zzstVar, zzuVar2));
                } else {
                    zzuVarArr = zzI;
                    c = 65535;
                }
                i9++;
                zzI = zzuVarArr;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 44 + String.valueOf(i7).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i8);
                sb.append("x");
                sb.append(i7);
                zzds.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i5 > i6;
                int i11 = z4 ? i5 : i6;
                int i12 = true != z4 ? i5 : i6;
                int[] iArr = zzb;
                int i13 = 0;
                while (i13 < 9) {
                    float f2 = i12;
                    float f3 = i11;
                    int i14 = iArr[i13];
                    int i15 = i13;
                    float f4 = i14;
                    if (i14 <= i11 || (i2 = (int) (f4 * (f2 / f3))) <= i12) {
                        break;
                    }
                    int i16 = i11;
                    if (true != z4) {
                        i3 = i12;
                        i4 = i14;
                    } else {
                        i3 = i12;
                        i4 = i2;
                    }
                    if (true != z4) {
                        i14 = i2;
                    }
                    point = zzstVar.zzi(i4, i14);
                    float f5 = zzuVar.zzz;
                    if (point != null) {
                        z = z4;
                        if (zzstVar.zzg(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i13 = i15 + 1;
                    i11 = i16;
                    i12 = i3;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i7 = Math.max(i7, point.y);
                    zzs zza2 = zzuVar.zza();
                    zza2.zzt(i8);
                    zza2.zzu(i7);
                    zzbe = Math.max(zzbe, zzas(zzstVar, zza2.zzM()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 35 + String.valueOf(i7).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i8);
                    sb2.append("x");
                    sb2.append(i7);
                    zzds.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzaadVar = new zzaad(i8, i7, zzbe);
        }
        String str = zzstVar.zzc;
        this.zzm = zzaadVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewProps.WIDTH, i6);
        mediaFormat.setInteger(ViewProps.HEIGHT, i5);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        float f6 = zzuVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzdv.zzb(mediaFormat, "rotation-degrees", zzuVar.zzA);
        zzh zzhVar2 = zzuVar.zzE;
        if (zzhVar2 != null) {
            zzdv.zzb(mediaFormat, "color-transfer", zzhVar2.zzd);
            zzdv.zzb(mediaFormat, "color-standard", zzhVar2.zzb);
            zzdv.zzb(mediaFormat, "color-range", zzhVar2.zzc);
            byte[] bArr = zzhVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzuVar.zzo)) {
            int i17 = zztl.zza;
            Pair zze = zzdc.zze(zzuVar);
            if (zze != null) {
                zzdv.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zze.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaadVar.zza);
        mediaFormat.setInteger("max-height", zzaadVar.zzb);
        zzdv.zzb(mediaFormat, "max-input-size", zzaadVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface zzbq = zzbq(zzstVar);
        if (this.zzp != null && !zzeo.zzS(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsn.zzb(zzstVar, mediaFormat, zzuVar, zzbq, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i2;
        zzhs zzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i3 = zzf.zze;
        zzaad zzaadVar = this.zzm;
        zzaadVar.getClass();
        if (zzuVar2.zzv > zzaadVar.zza || zzuVar2.zzw > zzaadVar.zzb) {
            i3 |= 256;
        }
        if (zzbe(zzstVar, zzuVar2) > zzaadVar.zzc) {
            i3 |= 64;
        }
        String str = zzstVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzf.zzd;
        }
        return new zzhs(str, zzuVar, zzuVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        zzst zzaG;
        float f2 = -1.0f;
        for (zzu zzuVar2 : zzuVarArr) {
            float f3 = zzuVar2.zzz;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzD == null || (zzaG = zzaG()) == null) {
            return f4;
        }
        float zzh = zzaG.zzh(zzuVar.zzv, zzuVar.zzw);
        return f4 != -1.0f ? Math.max(f4, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(String str, zzsn zzsnVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzn = zzbi(str);
        zzst zzaG = zzaG();
        zzaG.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaG.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaG.zzb();
            int length = zzb2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzb2[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(Exception exc) {
        zzds.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzhs zzal = super.zzal(zzkhVar);
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzg.zzc(zzuVar, zzal);
        return zzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzam(zzu zzuVar, MediaFormat mediaFormat) {
        zzsq zzaD = zzaD();
        if (zzaD != null) {
            zzaD.zzp(this.zzx);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewProps.WIDTH);
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewProps.HEIGHT);
        float f = zzuVar.zzB;
        int i = zzuVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzI = new zzbu(integer, integer2, f);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null || !this.zzP) {
            this.zzi.zze(zzuVar.zzz);
        } else {
            zzs zza = zzuVar.zza();
            zza.zzt(integer);
            zza.zzu(integer2);
            zza.zzz(f);
            zzu zzM = zza.zzM();
            int i3 = this.zzr;
            List list = this.zzs;
            if (list == null) {
                list = zzgjz.zzi();
            }
            zzabrVar.zzs(1, zzM, zzba(), i3, list);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzan(long j, long j2, long j3, boolean z, boolean z2) throws zzhz {
        int zzP;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        if (j >= -500000 || z || (zzP = zzP(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzhr zzhrVar = this.zza;
            int i = zzhrVar.zzd + zzP;
            zzhrVar.zzd = i;
            zzhrVar.zzf += this.zzC;
            zzhrVar.zzd = i + this.zzl.size();
        } else {
            this.zza.zzj++;
            zzav(zzP + this.zzl.size(), this.zzC);
        }
        zzaI();
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzao() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
            long j = this.zzN;
            if (j == -9223372036854775807L) {
                j = zzba();
                this.zzN = j;
            }
            this.zzp.zzo(-j);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaq() {
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            zzabrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzar(zzhg zzhgVar) throws zzhz {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhgVar.zzf;
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
                        zzsq zzaD = zzaD();
                        zzaD.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaD.zzo(bundle);
                    }
                }
            }
        }
    }

    protected final void zzat(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzau(zzsq zzsqVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzsqVar.zzc(i, false);
        Trace.endSection();
        zzav(0, 1);
    }

    protected final void zzav(int i, int i2) {
        zzhr zzhrVar = this.zza;
        zzhrVar.zzh += i;
        int i3 = i + i2;
        zzhrVar.zzg += i3;
        this.zzA += i3;
        int i4 = this.zzB + i3;
        this.zzB = i4;
        zzhrVar.zzi = Math.max(i4, zzhrVar.zzi);
    }

    protected final void zzaw(long j) {
        zzhr zzhrVar = this.zza;
        zzhrVar.zzk += j;
        zzhrVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    protected final void zzax(zzsq zzsqVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzsqVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbu zzbuVar = this.zzI;
            if (!zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzJ)) {
                this.zzJ = zzbuVar;
                this.zzg.zzf(zzbuVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    protected final boolean zzbd(zzst zzstVar) {
        if (zzbi(zzstVar.zza)) {
            return false;
        }
        return !zzstVar.zzf || zzaag.zza(this.zze);
    }

    final /* synthetic */ Surface zzbh() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzy(boolean z, boolean z2) throws zzhz {
        super.zzy(z, z2);
        zzJ();
        this.zzg.zza(this.zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzaai zzaaiVar = new zzaai(this.zze, this.zzi);
                zzaaiVar.zza(true);
                long j = this.zzk;
                zzaaiVar.zzc(j != -9223372036854775807L ? -j : -9223372036854775807L);
                zzaaiVar.zzb(zzL());
                zzaaq zzd2 = zzaaiVar.zzd();
                zzd2.zza(1);
                this.zzp = zzd2.zzb(0);
            }
            this.zzq = true;
        }
        int i = !z2 ? 1 : 0;
        zzabr zzabrVar = this.zzp;
        if (zzabrVar == null) {
            zzaau zzaauVar = this.zzi;
            zzaauVar.zzg(zzL());
            zzaauVar.zza(i);
            return;
        }
        zzabrVar.zzc(new zzzz(this), zzgpk.zza());
        zzaar zzaarVar = this.zzM;
        if (zzaarVar != null) {
            this.zzp.zzl(zzaarVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeg.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaW());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i;
        zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzz(zzu[] zzuVarArr, long j, long j2, zzup zzupVar) throws zzhz {
        super.zzz(zzuVarArr, j, j2, zzupVar);
        zzbe zzM = zzM();
        if (zzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzM.zzo(zzupVar.zza, new zzbc()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j, long j2, zzsq zzsqVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz {
        zzaae zzaaeVar;
        long j4;
        zzsqVar.getClass();
        long zzaZ = j3 - zzaZ();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzav(i4, 0);
        zzabr zzabrVar = this.zzp;
        if (zzabrVar != null) {
            if (!z || z2) {
                return zzabrVar.zzu(j3, new zzaaa(this, zzsqVar, i, zzaZ));
            }
            zzat(zzsqVar, i, zzaZ);
            return true;
        }
        zzaau zzaauVar = this.zzi;
        long zzba = zzba();
        zzaas zzaasVar = this.zzj;
        int zzk = zzaauVar.zzk(j3, j, j2, zzba, z, z2, zzaasVar);
        if (zzk == 0) {
            long zzc2 = zzL().zzc();
            zzbo(zzaZ, zzc2, zzuVar);
            zzax(zzsqVar, i, zzaZ, zzc2);
            zzaw(zzaasVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzau(zzsqVar, i, zzaZ);
                zzaw(zzaasVar.zza());
                return true;
            }
            if (zzk != 3) {
                return false;
            }
            zzat(zzsqVar, i, zzaZ);
            zzaw(zzaasVar.zza());
            return true;
        }
        long zzb2 = zzaasVar.zzb();
        long zza = zzaasVar.zza();
        if (zzb2 == this.zzH) {
            zzat(zzsqVar, i, zzaZ);
            j4 = zzb2;
            zzaaeVar = this;
        } else {
            zzbo(zzaZ, zzb2, zzuVar);
            zzax(zzsqVar, i, zzaZ, zzb2);
            zzaaeVar = this;
            j4 = zzb2;
        }
        zzaaeVar.zzaw(zza);
        zzaaeVar.zzH = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, Object obj) throws zzhz {
        if (i == 1) {
            zzbl(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaar zzaarVar = (zzaar) obj;
            this.zzM = zzaarVar;
            zzabr zzabrVar = this.zzp;
            if (zzabrVar != null) {
                zzabrVar.zzl(zzaarVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzL != intValue) {
                this.zzL = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzx = intValue2;
            zzsq zzaD = zzaD();
            if (zzaD != null) {
                zzaD.zzp(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzy = intValue3;
            zzabr zzabrVar2 = this.zzp;
            if (zzabrVar2 != null) {
                zzabrVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbq.zza)) {
                zzabr zzabrVar3 = this.zzp;
                if (zzabrVar3 == null || !zzabrVar3.zze()) {
                    return;
                }
                zzabrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzabr zzabrVar4 = this.zzp;
            if (zzabrVar4 != null) {
                zzabrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeg zzegVar = (zzeg) obj;
            if (zzegVar.zza() == 0 || zzegVar.zzb() == 0) {
                return;
            }
            this.zzv = zzegVar;
            zzabr zzabrVar5 = this.zzp;
            if (zzabrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzabrVar5.zzp(surface, zzegVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzsq zzaD2 = zzaD();
                if (zzaD2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzaD2.zzo(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbl(null);
                obj.getClass();
                ((zzaae) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzD != null;
                zzls zzlsVar = (zzls) obj;
                this.zzD = zzlsVar;
                if (z != (zzlsVar != null)) {
                    zzaY();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
