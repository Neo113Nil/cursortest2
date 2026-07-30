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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.text.HtmlCompat;
import com.facebook.ads.AdError;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzacc extends zzuu implements zzacr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzms zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private int zzK;
    private int zzL;
    private zzacp zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzadl zzg;
    private final boolean zzh;
    private final zzacs zzi;
    private final zzacq zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzacb zzm;
    private boolean zzn;
    private boolean zzo;
    private zzadr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzace zzu;
    private zzes zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    protected zzacc(zzaca zzacaVar) {
        super(2, zzacaVar.zzg(), zzacaVar.zzf(), false, 30.0f);
        Context applicationContext = zzacaVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzadl(zzacaVar.zzh(), zzacaVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzacs(applicationContext, this, 0L);
        this.zzj = new zzacq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzes.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
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
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        if (r3.equals("video/av01") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzat(zzun zzunVar, zzv zzvVar) {
        int i = zzvVar.zzv;
        int i2 = zzvVar.zzw;
        if (i != -1 && i2 != -1) {
            String str = zzvVar.zzo;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair zzd2 = zzdo.zzd(zzvVar);
                if (zzd2 != null) {
                    int intValue = ((Integer) zzd2.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zzunVar.zzf)))) {
                        String str2 = zzfj.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    protected static int zzbh(zzun zzunVar, zzv zzvVar) {
        int i = zzvVar.zzp;
        if (i == -1) {
            return zzat(zzunVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c1, code lost:
    
        if (r1.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079e, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L514;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbl(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzacc.class) {
            if (!zzc) {
                char c = 28;
                if (Build.VERSION.SDK_INT <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                if (Build.VERSION.SDK_INT > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 5;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        default:
                            if (Build.VERSION.SDK_INT <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = 'Y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = 'h';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c = '\"';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = AbstractJsonLexerKt.BEGIN_LIST;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = Ascii.MAX;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = 's';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = Typography.dollar;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = Typography.amp;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = AbstractJsonLexerKt.END_LIST;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = 'm';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = AbstractJsonLexerKt.STRING_ESC;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = '*';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = SignatureVisitor.EXTENDS;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = AbstractJsonLexerKt.COMMA;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = SignatureVisitor.SUPER;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = '/';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = 'M';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = Typography.less;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = 'z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = AbstractJsonLexerKt.BEGIN_OBJ;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = AbstractJsonLexerKt.END_OBJ;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = AbstractJsonLexerKt.COLON;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = Typography.greater;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = SignatureVisitor.INSTANCEOF;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = AbstractJsonLexerKt.UNICODE_ESC;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = 'd';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    default:
                                        String str5 = Build.MODEL;
                                        if (str5.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case Opcodes.V15 /* 59 */:
                                    case '<':
                                    case '=':
                                    case Opcodes.V18 /* 62 */:
                                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case TypeReference.NEW /* 68 */:
                                    case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                                    case TypeReference.METHOD_REFERENCE /* 70 */:
                                    case TypeReference.CAST /* 71 */:
                                    case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                                    case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                                    case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                                    case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                                    case Base64.mimeLineLength /* 76 */:
                                    case 'M':
                                    case 'N':
                                    case Opcodes.IASTORE /* 79 */:
                                    case Opcodes.LASTORE /* 80 */:
                                    case Opcodes.FASTORE /* 81 */:
                                    case Opcodes.DASTORE /* 82 */:
                                    case Opcodes.AASTORE /* 83 */:
                                    case Opcodes.BASTORE /* 84 */:
                                    case Opcodes.CASTORE /* 85 */:
                                    case Opcodes.SASTORE /* 86 */:
                                    case Opcodes.POP /* 87 */:
                                    case Opcodes.POP2 /* 88 */:
                                    case 'Y':
                                    case 'Z':
                                    case Opcodes.DUP_X2 /* 91 */:
                                    case Opcodes.DUP2 /* 92 */:
                                    case Opcodes.DUP2_X1 /* 93 */:
                                    case Opcodes.DUP2_X2 /* 94 */:
                                    case Opcodes.SWAP /* 95 */:
                                    case '`':
                                    case Opcodes.LADD /* 97 */:
                                    case Opcodes.FADD /* 98 */:
                                    case Opcodes.DADD /* 99 */:
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case Opcodes.LREM /* 113 */:
                                    case Opcodes.FREM /* 114 */:
                                    case Opcodes.DREM /* 115 */:
                                    case 't':
                                    case Opcodes.LNEG /* 117 */:
                                    case Opcodes.FNEG /* 118 */:
                                    case Opcodes.DNEG /* 119 */:
                                    case 'x':
                                    case Opcodes.LSHL /* 121 */:
                                    case 'z':
                                    case Opcodes.LSHR /* 123 */:
                                    case '|':
                                    case Opcodes.LUSHR /* 125 */:
                                    case '~':
                                    case 127:
                                    case 128:
                                    case Opcodes.LOR /* 129 */:
                                    case 130:
                                    case Opcodes.LXOR /* 131 */:
                                    case Opcodes.IINC /* 132 */:
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.I2F /* 134 */:
                                    case Opcodes.I2D /* 135 */:
                                    case Opcodes.L2I /* 136 */:
                                    case Opcodes.L2F /* 137 */:
                                    case Opcodes.L2D /* 138 */:
                                    case Opcodes.F2I /* 139 */:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                z3 = true;
                zzd = z3;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzbm(zzun zzunVar) {
        return Build.VERSION.SDK_INT >= 35 && zzunVar.zzh;
    }

    private static List zzbn(Context context, zzuw zzuwVar, zzv zzvVar, boolean z, boolean z2) throws zzuy {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzguf.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            List zzd2 = zzvg.zzd(zzuwVar, zzvVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzvg.zzc(zzuwVar, zzvVar, z, z2);
    }

    private final void zzbo(Object obj) throws zziw {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbw();
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
        zzuk zzaE = zzaE();
        if (zzaE != null && this.zzp == null) {
            zzun zzaH = zzaH();
            zzaH.getClass();
            if (!zzbs(zzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface zzbt = zzbt(zzaH);
                if (zzbt != null) {
                    zzaE.zzn(zzbt);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaE.zzo();
                }
            }
        }
        if (surface != null) {
            zzbw();
        } else {
            this.zzJ = null;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzq();
            }
        }
        if (zze == 2) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbp(zzih zzihVar) {
        if (zzcW() || zzihVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzihVar.zze - zzbb()) <= 100000;
    }

    private final boolean zzbq(zzih zzihVar) {
        return zzihVar.zze < zzG();
    }

    private final void zzbr(long j, long j2, zzv zzvVar) {
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            zzacpVar.zzcS(j, j2, zzvVar, zzaG());
        }
    }

    private final boolean zzbs(zzun zzunVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbm(zzunVar) || zzbg(zzunVar);
    }

    private final Surface zzbt(zzun zzunVar) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbm(zzunVar)) {
            return null;
        }
        zzgrc.zzi(zzbg(zzunVar));
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            if (zzaceVar.zza != zzunVar.zzf) {
                zzbu();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzace.zzb(this.zze, zzunVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbu() {
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            zzaceVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* renamed from: zzbv, reason: merged with bridge method [inline-methods] */
    public final void zzbj() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbw() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzA(long j, boolean z, boolean z2) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null && !z) {
            zzadrVar.zzg(true);
        }
        super.zzA(j, z, z2);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
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
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzadl zzadlVar = this.zzg;
            zzadlVar.zzi(this.zza);
            zzadlVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzF() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzf) {
            return;
        }
        zzadrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzU(long j) {
        long zzaU = zzaU();
        return zzaU == -9223372036854775807L || j > zzaU - zzbb();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final void zzV(float f, float f2) throws zziw {
        super.zzV(f, f2);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzW() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzadrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final void zzX(long j, long j2) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            try {
                zzadrVar.zzv(j, j2);
            } catch (zzadq e) {
                throw zzN(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzX(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        boolean zzaW = zzaW();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzh(zzaW);
        }
        if (zzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zzaW);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzadr zzadrVar = this.zzp;
        return zzadrVar == null || zzadrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaC(zzun zzunVar) {
        return zzbs(zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaK() {
        zzun zzaH = zzaH();
        if (this.zzp != null && zzaH != null) {
            String str = zzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaL() {
        boolean z;
        zzv zzaF = zzaF();
        long j = this.zzO;
        if (j != -9223372036854775807L) {
            if (zzaM() + j + 1 <= Long.MAX_VALUE - (zzbb() + this.zzO)) {
                z = false;
                return this.zzD == null || this.zzE || (zzaF != null && zzaF.zzq > 0) || z || zzba() != -9223372036854775807L;
            }
        }
        z = true;
        if (this.zzD == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzabw(th, zzunVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaQ(zzv zzvVar) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || zzadrVar.zze()) {
            return true;
        }
        try {
            zzadrVar.zzd(zzvVar);
            return true;
        } catch (zzadq e) {
            throw zzN(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaR(zzih zzihVar) throws zziw {
        int zzaS = zzaS(zzihVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaS & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzaS(zzih zzihVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbq(zzihVar) || zzbp(zzihVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaT(zzih zzihVar) {
        boolean z = false;
        if (zzbp(zzihVar)) {
            return false;
        }
        if (zzbq(zzihVar)) {
            if (zzihVar.zze()) {
                return false;
            }
            if (zzihVar.zzf()) {
                zzihVar.zza();
                z = true;
            }
            if (z) {
                this.zza.zzd++;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaV(long j) {
        super.zzaV(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        boolean z;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzs != null;
        List zzbn = zzbn(context, zzuwVar, zzvVar, z2, false);
        if (z2 && zzbn.isEmpty()) {
            zzbn = zzbn(context, zzuwVar, zzvVar, false, false);
        }
        if (zzbn.isEmpty()) {
            return Opcodes.LOR;
        }
        if (!zzbd(zzvVar)) {
            return 130;
        }
        zzun zzunVar = (zzun) zzbn.get(0);
        boolean zzc2 = zzunVar.zzc(zzvVar);
        if (!zzc2) {
            for (int i2 = 1; i2 < zzbn.size(); i2++) {
                zzun zzunVar2 = (zzun) zzbn.get(i2);
                if (zzunVar2.zzc(zzvVar)) {
                    zzc2 = true;
                    z = false;
                    zzunVar = zzunVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzunVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzunVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            List zzbn2 = zzbn(context, zzuwVar, zzvVar, z2, true);
            if (!zzbn2.isEmpty()) {
                zzun zzunVar3 = (zzun) zzvg.zze(zzbn2, zzvVar).get(0);
                if (zzunVar3.zzc(zzvVar) && zzunVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z) throws zzuy {
        return zzvg.zze(zzbn(this.zze, zzuwVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        int i;
        zzacb zzacbVar;
        Point point;
        int i2;
        int i3;
        int i4;
        boolean z;
        zzv[] zzvVarArr;
        char c;
        boolean z2;
        Pair zzd2;
        int zzat;
        zzv[] zzI = zzI();
        int length = zzI.length;
        int zzbh = zzbh(zzunVar, zzvVar);
        int i5 = zzvVar.zzw;
        int i6 = zzvVar.zzv;
        if (length == 1) {
            if (zzbh != -1 && (zzat = zzat(zzunVar, zzvVar)) != -1) {
                zzbh = Math.min((int) (zzbh * 1.5f), zzat);
            }
            zzacbVar = new zzacb(i6, i5, zzbh);
            i = 35;
        } else {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            boolean z3 = false;
            i = 35;
            while (i9 < length) {
                zzv zzvVar2 = zzI[i9];
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVar2.zzE == null) {
                    zzt zza = zzvVar2.zza();
                    zza.zzC(zziVar);
                    zzvVar2 = zza.zzM();
                }
                if (zzunVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    int i10 = zzvVar2.zzv;
                    c = 65535;
                    if (i10 != -1) {
                        zzvVarArr = zzI;
                        if (zzvVar2.zzw != -1) {
                            z2 = false;
                            z3 |= z2;
                            i8 = Math.max(i8, i10);
                            i7 = Math.max(i7, zzvVar2.zzw);
                            zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                        }
                    } else {
                        zzvVarArr = zzI;
                    }
                    z2 = true;
                    z3 |= z2;
                    i8 = Math.max(i8, i10);
                    i7 = Math.max(i7, zzvVar2.zzw);
                    zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                } else {
                    zzvVarArr = zzI;
                    c = 65535;
                }
                i9++;
                zzI = zzvVarArr;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 44 + String.valueOf(i7).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i8);
                sb.append("x");
                sb.append(i7);
                zzee.zzc("MediaCodecVideoRenderer", sb.toString());
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
                    point = zzunVar.zzi(i4, i14);
                    float f5 = zzvVar.zzz;
                    if (point != null) {
                        z = z4;
                        if (zzunVar.zzg(point.x, point.y, f5)) {
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
                    zzt zza2 = zzvVar.zza();
                    zza2.zzt(i8);
                    zza2.zzu(i7);
                    zzbh = Math.max(zzbh, zzat(zzunVar, zza2.zzM()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 35 + String.valueOf(i7).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i8);
                    sb2.append("x");
                    sb2.append(i7);
                    zzee.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzacbVar = new zzacb(i8, i7, zzbh);
        }
        String str = zzunVar.zzc;
        this.zzm = zzacbVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i6);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i5);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        float f6 = zzvVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzeh.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzeh.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzeh.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzeh.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo) && (zzd2 = zzdo.zzd(zzvVar)) != null) {
            zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zzd2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacbVar.zza);
        mediaFormat.setInteger("max-height", zzacbVar.zzb);
        zzeh.zzb(mediaFormat, "max-input-size", zzacbVar.zzc);
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
        Surface zzbt = zzbt(zzunVar);
        if (this.zzp != null && !zzfj.zzR(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuh.zzb(zzunVar, mediaFormat, zzvVar, zzbt, null);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i;
        int i2;
        zzio zzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        zzacb zzacbVar = this.zzm;
        zzacbVar.getClass();
        if (zzvVar2.zzv > zzacbVar.zza || zzvVar2.zzw > zzacbVar.zzb) {
            i3 |= 256;
        }
        if (zzbh(zzunVar, zzvVar2) > zzacbVar.zzc) {
            i3 |= 64;
        }
        String str = zzunVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzf.zzd;
        }
        return new zzio(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzun zzaH;
        float f2 = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.zzz;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzD == null || (zzaH = zzaH()) == null) {
            return f4;
        }
        float zzh = zzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f4 != -1.0f ? Math.max(f4, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaj(String str, zzuh zzuhVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzn = zzbl(str);
        zzun zzaH = zzaH();
        zzaH.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaH.zzb();
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

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzak(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzal(Exception exc) {
        zzee.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzio zzam(zzlh zzlhVar) throws zziw {
        zzio zzam = super.zzam(zzlhVar);
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzam);
        return zzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        zzuk zzaE = zzaE();
        if (zzaE != null) {
            zzaE.zzq(this.zzx);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        float f = zzvVar.zzB;
        int i = zzvVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzI = new zzbv(integer, integer2, f);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zza = zzvVar.zza();
            zza.zzt(integer);
            zza.zzu(integer2);
            zza.zzz(f);
            zzv zzM = zza.zzM();
            int i3 = this.zzr;
            List list = this.zzs;
            if (list == null) {
                list = zzguf.zzi();
            }
            zzadrVar.zzs(1, zzM, zzbc(), i3, list);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzao(long j, long j2, long j3, boolean z, boolean z2) throws zziw {
        int zzP;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        if (j >= -500000 || z || (zzP = zzP(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzin zzinVar = this.zza;
            int i = zzinVar.zzd + zzP;
            zzinVar.zzd = i;
            zzinVar.zzf += this.zzC;
            zzinVar.zzd = i + this.zzl.size();
        } else {
            this.zza.zzj++;
            zzaw(zzP + this.zzl.size(), this.zzC);
        }
        zzaJ();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzap() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
            long j = this.zzN;
            if (j == -9223372036854775807L) {
                j = zzbc();
                this.zzN = j;
            }
            this.zzp.zzo(-j);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzar() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzas(zzih zzihVar) throws zziw {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzihVar.zzf;
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
                        zzuk zzaE = zzaE();
                        zzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaE.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzau(zzuk zzukVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzukVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzav(zzuk zzukVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzukVar.zzc(i, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    protected final void zzaw(int i, int i2) {
        zzin zzinVar = this.zza;
        zzinVar.zzh += i;
        int i3 = i + i2;
        zzinVar.zzg += i3;
        this.zzA += i3;
        int i4 = this.zzB + i3;
        this.zzB = i4;
        zzinVar.zzi = Math.max(i4, zzinVar.zzi);
    }

    protected final void zzax(long j) {
        zzin zzinVar = this.zza;
        zzinVar.zzk += j;
        zzinVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    protected final void zzay(zzuk zzukVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzukVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbj();
        }
    }

    protected final boolean zzbg(zzun zzunVar) {
        if (zzbl(zzunVar.zza)) {
            return false;
        }
        return !zzunVar.zzf || zzace.zza(this.zze);
    }

    final /* synthetic */ Surface zzbk() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzy(boolean z, boolean z2) throws zziw {
        super.zzy(z, z2);
        zzJ();
        this.zzg.zza(this.zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzacg zzacgVar = new zzacg(this.zze, this.zzi);
                zzacgVar.zza(true);
                long j = this.zzk;
                zzacgVar.zzc(j != -9223372036854775807L ? -j : -9223372036854775807L);
                zzacgVar.zzb(zzL());
                zzaco zzd2 = zzacgVar.zzd();
                zzd2.zza(1);
                this.zzp = zzd2.zzb(0);
            }
            this.zzq = true;
        }
        int i = !z2 ? 1 : 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            zzacs zzacsVar = this.zzi;
            zzacsVar.zzg(zzL());
            zzacsVar.zza(i);
            return;
        }
        zzadrVar.zzc(new zzabx(this), zzhaf.zza());
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            this.zzp.zzl(zzacpVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzes.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaX());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i;
        zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzz(zzv[] zzvVarArr, long j, long j2, zzwk zzwkVar) throws zziw {
        super.zzz(zzvVarArr, j, j2, zzwkVar);
        zzbf zzM = zzM();
        if (zzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzM.zzo(zzwkVar.zza, new zzbd()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaq(long j, long j2, zzuk zzukVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zziw {
        zzacc zzaccVar;
        long j4;
        zzukVar.getClass();
        long zzbb = j3 - zzbb();
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
        zzaw(i4, 0);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            if (!z || z2) {
                return zzadrVar.zzu(j3, new zzaby(this, zzukVar, i, zzbb));
            }
            zzau(zzukVar, i, zzbb);
            return true;
        }
        zzacs zzacsVar = this.zzi;
        long zzbc = zzbc();
        zzacq zzacqVar = this.zzj;
        int zzk = zzacsVar.zzk(j3, j, j2, zzbc, z, z2, zzacqVar);
        if (zzk == 0) {
            long zzc2 = zzL().zzc();
            zzbr(zzbb, zzc2, zzvVar);
            zzay(zzukVar, i, zzbb, zzc2);
            zzax(zzacqVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzav(zzukVar, i, zzbb);
                zzax(zzacqVar.zza());
                return true;
            }
            if (zzk != 3) {
                return false;
            }
            zzau(zzukVar, i, zzbb);
            zzax(zzacqVar.zza());
            return true;
        }
        long zzb2 = zzacqVar.zzb();
        long zza = zzacqVar.zza();
        if (zzb2 == this.zzH) {
            zzau(zzukVar, i, zzbb);
            j4 = zzb2;
            zzaccVar = this;
        } else {
            zzbr(zzbb, zzb2, zzvVar);
            zzay(zzukVar, i, zzbb, zzb2);
            zzaccVar = this;
            j4 = zzb2;
        }
        zzaccVar.zzax(zza);
        zzaccVar.zzH = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i, Object obj) throws zziw {
        if (i == 1) {
            zzbo(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzacp zzacpVar = (zzacp) obj;
            this.zzM = zzacpVar;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzl(zzacpVar);
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
            zzuk zzaE = zzaE();
            if (zzaE != null) {
                zzaE.zzq(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzy = intValue3;
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzadr zzadrVar3 = this.zzp;
                if (zzadrVar3 == null || !zzadrVar3.zze()) {
                    return;
                }
                zzadrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzadr zzadrVar4 = this.zzp;
            if (zzadrVar4 != null) {
                zzadrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzes zzesVar = (zzes) obj;
            if (zzesVar.zza() == 0 || zzesVar.zzb() == 0) {
                return;
            }
            this.zzv = zzesVar;
            zzadr zzadrVar5 = this.zzp;
            if (zzadrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzadrVar5.zzp(surface, zzesVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzuk zzaE2 = zzaE();
                if (zzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzaE2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbo(null);
                obj.getClass();
                ((zzacc) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzD != null;
                zzms zzmsVar = (zzms) obj;
                this.zzD = zzmsVar;
                if (z != (zzmsVar != null)) {
                    zzaZ();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
