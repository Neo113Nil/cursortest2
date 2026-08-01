package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzzw extends zzss implements zzaaw {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private zzdu zzC;
    private zzdu zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzaaa zzH;
    private zzaay zzI;
    private final Context zze;
    private final zzaai zzf;
    private final zzaaz zzg;
    private final zzaat zzh;
    private final boolean zzi;
    private zzzs zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzzz zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzw(Context context, zzsj zzsjVar, zzsu zzsuVar, long j, boolean z, Handler handler, zzaau zzaauVar, int i, float f) {
        super(2, zzsjVar, zzsuVar, false, 30.0f);
        zzzv zzzvVar = new zzzv(null);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzaai(applicationContext);
        this.zzh = new zzaat(handler, zzaauVar);
        this.zzg = new zzzm(context, new zzzg(zzzvVar), this);
        this.zzi = "NVIDIA".equals(zzfs.zzc);
        this.zzs = -9223372036854775807L;
        this.zzp = 1;
        this.zzC = zzdu.zza;
        this.zzG = 0;
        this.zzq = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04c3, code lost:
    
        if (r13.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x07a1, code lost:
    
        if (r10 != 0) goto L515;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzaR(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzzw.class) {
            if (!zzc) {
                char c = 28;
                char c2 = 65535;
                if (zzfs.zza <= 28) {
                    String str2 = zzfs.zzb;
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
                if (zzfs.zza > 27 || !"HWEML".equals(zzfs.zzb)) {
                    String str3 = zzfs.zzd;
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
                            if (zzfs.zza <= 26) {
                                String str4 = zzfs.zzb;
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
                                            c = GMTDateParser.YEAR;
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
                                            c = GMTDateParser.HOURS;
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
                                            c = GMTDateParser.SECONDS;
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
                                            c = GMTDateParser.MINUTES;
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
                                            c = GMTDateParser.ANY;
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
                                            c = GMTDateParser.MONTH;
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
                                            c = GMTDateParser.ZONE;
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
                                            c = GMTDateParser.DAY_OF_MONTH;
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
                                        if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                            c2 = 0;
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
                                    case 29:
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
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
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
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
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

    private static long zzaS(long j, long j2, long j3, boolean z, float f, zzeg zzegVar) {
        long j4 = (long) ((j3 - j) / f);
        return z ? j4 - (zzfs.zzq(SystemClock.elapsedRealtime()) - j2) : j4;
    }

    private static List zzaT(Context context, zzsu zzsuVar, zzam zzamVar, boolean z, boolean z2) throws zztb {
        if (zzamVar.zzm == null) {
            return zzfwu.zzl();
        }
        if (zzfs.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzzr.zza(context)) {
            List zzf = zzth.zzf(zzsuVar, zzamVar, z, z2);
            if (!zzf.isEmpty()) {
                return zzf;
            }
        }
        return zzth.zzh(zzsuVar, zzamVar, z, z2);
    }

    private final void zzaU(int i) {
        this.zzq = Math.min(this.zzq, i);
        int i2 = zzfs.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaV() {
        Surface surface = this.zzm;
        if (surface == null || this.zzq == 3) {
            return;
        }
        this.zzq = 3;
        this.zzh.zzq(surface);
        this.zzo = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaW(zzdu zzduVar) {
        if (zzduVar.equals(zzdu.zza) || zzduVar.equals(this.zzD)) {
            return;
        }
        this.zzD = zzduVar;
        this.zzh.zzt(zzduVar);
    }

    private final void zzaX() {
        zzdu zzduVar = this.zzD;
        if (zzduVar != null) {
            this.zzh.zzt(zzduVar);
        }
    }

    private final void zzaY() {
        Surface surface = this.zzm;
        zzzz zzzzVar = this.zzn;
        if (surface == zzzzVar) {
            this.zzm = null;
        }
        if (zzzzVar != null) {
            zzzzVar.release();
            this.zzn = null;
        }
    }

    private final void zzaZ(zzsk zzskVar, int i, long j, long j2) {
        if (zzfs.zza >= 21) {
            zzaN(zzskVar, i, j, j2);
        } else {
            zzaM(zzskVar, i, j);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzab(zzsn zzsnVar, zzam zzamVar) {
        int intValue;
        int i = zzamVar.zzr;
        int i2 = zzamVar.zzs;
        if (i != -1 && i2 != -1) {
            String str = zzamVar.zzm;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair zzb2 = zzth.zzb(zzamVar);
                str = (zzb2 == null || !((intValue = ((Integer) zzb2.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
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
                    if (!"BRAVIA 4K 2015".equals(zzfs.zzd) && (!"Amazon".equals(zzfs.zzc) || (!"KFSOWI".equals(zzfs.zzd) && (!"AFTS".equals(zzfs.zzd) || !zzsnVar.zzf)))) {
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

    protected static int zzac(zzsn zzsnVar, zzam zzamVar) {
        if (zzamVar.zzn == -1) {
            return zzab(zzsnVar, zzamVar);
        }
        int size = zzamVar.zzo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzamVar.zzo.get(i2)).length;
        }
        return zzamVar.zzn + i;
    }

    private static boolean zzba(long j) {
        return j < -30000;
    }

    private final boolean zzbb(long j, long j2) {
        if (this.zzs != -9223372036854775807L) {
            return false;
        }
        boolean z = zzbd() == 2;
        int i = this.zzq;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= zzar();
        }
        if (i != 3) {
            throw new IllegalStateException();
        }
        zzh();
        return z && zzba(j2) && zzfs.zzq(SystemClock.elapsedRealtime()) - this.zzy > 100000;
    }

    private final boolean zzbc(zzsn zzsnVar) {
        if (zzfs.zza < 23 || zzaR(zzsnVar.zza)) {
            return false;
        }
        return !zzsnVar.zzf || zzzz.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzA() {
        try {
            super.zzA();
            this.zzF = false;
            if (this.zzn != null) {
                zzaY();
            }
        } catch (Throwable th) {
            this.zzF = false;
            if (this.zzn != null) {
                zzaY();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected final void zzB() {
        this.zzu = 0;
        zzh();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzt = elapsedRealtime;
        this.zzy = zzfs.zzq(elapsedRealtime);
        this.zzz = 0L;
        this.zzA = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected final void zzC() {
        this.zzs = -9223372036854775807L;
        if (this.zzu > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzh.zzd(this.zzu, elapsedRealtime - this.zzt);
            this.zzu = 0;
            this.zzt = elapsedRealtime;
        }
        int i = this.zzA;
        if (i != 0) {
            this.zzh.zzr(this.zzz, i);
            this.zzz = 0L;
            this.zzA = 0;
        }
        this.zzf.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzlz
    public final void zzK(float f, float f2) throws zzit {
        super.zzK(f, f2);
        this.zzf.zze(f);
        zzaay zzaayVar = this.zzI;
        if (zzaayVar != null) {
            zzaayVar.zzl(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz, com.google.android.gms.internal.ads.zzmb
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzlz
    public final void zzT(long j, long j2) throws zzit {
        super.zzT(j, j2);
        zzaay zzaayVar = this.zzI;
        if (zzaayVar != null) {
            zzaayVar.zzi(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzlz
    public final boolean zzU() {
        return super.zzU() && this.zzI == null;
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzlz
    public final boolean zzV() {
        zzaay zzaayVar;
        zzzz zzzzVar;
        if (super.zzV() && (((zzaayVar = this.zzI) == null || zzaayVar.zzq()) && (this.zzq == 3 || (((zzzzVar = this.zzn) != null && this.zzm == zzzzVar) || zzas() == null)))) {
            this.zzs = -9223372036854775807L;
            return true;
        }
        if (this.zzs == -9223372036854775807L) {
            return false;
        }
        zzh();
        if (SystemClock.elapsedRealtime() < this.zzs) {
            return true;
        }
        this.zzs = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final float zzX(float f, zzam zzamVar, zzam[] zzamVarArr) {
        float f2 = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f3 = zzamVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final int zzY(zzsu zzsuVar, zzam zzamVar) throws zztb {
        boolean z;
        if (!zzce.zzg(zzamVar.zzm)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = zzamVar.zzp != null;
        List zzaT = zzaT(this.zze, zzsuVar, zzamVar, z2, false);
        if (z2 && zzaT.isEmpty()) {
            zzaT = zzaT(this.zze, zzsuVar, zzamVar, false, false);
        }
        if (!zzaT.isEmpty()) {
            if (zzaH(zzamVar)) {
                zzsn zzsnVar = (zzsn) zzaT.get(0);
                boolean zze = zzsnVar.zze(zzamVar);
                if (!zze) {
                    for (int i3 = 1; i3 < zzaT.size(); i3++) {
                        zzsn zzsnVar2 = (zzsn) zzaT.get(i3);
                        if (zzsnVar2.zze(zzamVar)) {
                            zze = true;
                            z = false;
                            zzsnVar = zzsnVar2;
                            break;
                        }
                    }
                }
                z = true;
                int i4 = true != zze ? 3 : 4;
                int i5 = true != zzsnVar.zzf(zzamVar) ? 8 : 16;
                int i6 = true != zzsnVar.zzg ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (zzfs.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzzr.zza(this.zze)) {
                    i7 = 256;
                }
                if (zze) {
                    List zzaT2 = zzaT(this.zze, zzsuVar, zzamVar, z2, true);
                    if (!zzaT2.isEmpty()) {
                        zzsn zzsnVar3 = (zzsn) zzth.zzi(zzaT2, zzamVar).get(0);
                        if (zzsnVar3.zze(zzamVar) && zzsnVar3.zzf(zzamVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final zzim zzZ(zzsn zzsnVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzim zzb2 = zzsnVar.zzb(zzamVar, zzamVar2);
        int i3 = zzb2.zze;
        zzzs zzzsVar = this.zzj;
        zzzsVar.getClass();
        if (zzamVar2.zzr > zzzsVar.zza || zzamVar2.zzs > zzzsVar.zzb) {
            i3 |= 256;
        }
        if (zzac(zzsnVar, zzamVar2) > zzzsVar.zzc) {
            i3 |= 64;
        }
        String str = zzsnVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb2.zzd;
            i2 = 0;
        }
        return new zzim(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzaA() {
        super.zzaA();
        this.zzw = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final boolean zzaG(zzsn zzsnVar) {
        return this.zzm != null || zzbc(zzsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzaK() {
        zzh();
        this.zzy = zzfs.zzq(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzaL(long j) {
        this.zzf.zzd(j);
    }

    protected final void zzaM(zzsk zzskVar, int i, long j) {
        int i2 = zzfs.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzskVar.zzn(i, true);
        Trace.endSection();
        this.zza.zze++;
        this.zzv = 0;
        if (this.zzI == null) {
            zzh();
            this.zzy = zzfs.zzq(SystemClock.elapsedRealtime());
            zzaW(this.zzC);
            zzaV();
        }
    }

    protected final void zzaN(zzsk zzskVar, int i, long j, long j2) {
        int i2 = zzfs.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzskVar.zzm(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzv = 0;
        if (this.zzI == null) {
            zzh();
            this.zzy = zzfs.zzq(SystemClock.elapsedRealtime());
            zzaW(this.zzC);
            zzaV();
        }
    }

    protected final void zzaO(zzsk zzskVar, int i, long j) {
        int i2 = zzfs.zza;
        Trace.beginSection("skipVideoBuffer");
        zzskVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaP(int i, int i2) {
        zzil zzilVar = this.zza;
        zzilVar.zzh += i;
        int i3 = i + i2;
        zzilVar.zzg += i3;
        this.zzu += i3;
        int i4 = this.zzv + i3;
        this.zzv = i4;
        zzilVar.zzi = Math.max(i4, zzilVar.zzi);
    }

    protected final void zzaQ(long j) {
        zzil zzilVar = this.zza;
        zzilVar.zzk += j;
        zzilVar.zzl++;
        this.zzz += j;
        this.zzA++;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final zzim zzaa(zzkv zzkvVar) throws zzit {
        zzim zzaa = super.zzaa(zzkvVar);
        zzam zzamVar = zzkvVar.zza;
        zzamVar.getClass();
        this.zzh.zzf(zzamVar, zzaa);
        return zzaa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x010e, code lost:
    
        if (true == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0110, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0113, code lost:
    
        if (true == r12) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0115, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0119, code lost:
    
        r3 = new android.graphics.Point(r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0112, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0259  */
    @Override // com.google.android.gms.internal.ads.zzss
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzsi zzad(zzsn zzsnVar, zzam zzamVar, MediaCrypto mediaCrypto, float f) {
        String str;
        Point point;
        int i;
        int i2;
        boolean z;
        MediaFormat mediaFormat;
        float f2;
        zzs zzsVar;
        zzaay zzaayVar;
        Pair zzb2;
        int zzab;
        zzzz zzzzVar = this.zzn;
        if (zzzzVar != null) {
            if (zzzzVar.zza != zzsnVar.zzf) {
                zzaY();
            }
        }
        String str2 = zzsnVar.zzc;
        zzam[] zzR = zzR();
        int i3 = zzamVar.zzr;
        int i4 = zzamVar.zzs;
        int zzac = zzac(zzsnVar, zzamVar);
        int length = zzR.length;
        if (length != 1) {
            boolean z2 = false;
            for (int i5 = 0; i5 < length; i5++) {
                zzam zzamVar2 = zzR[i5];
                if (zzamVar.zzy != null && zzamVar2.zzy == null) {
                    zzak zzb3 = zzamVar2.zzb();
                    zzb3.zzA(zzamVar.zzy);
                    zzamVar2 = zzb3.zzac();
                }
                if (zzsnVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    int i6 = zzamVar2.zzr;
                    z2 |= i6 == -1 || zzamVar2.zzs == -1;
                    i3 = Math.max(i3, i6);
                    i4 = Math.max(i4, zzamVar2.zzs);
                    zzac = Math.max(zzac, zzac(zzsnVar, zzamVar2));
                }
            }
            if (z2) {
                zzez.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i3 + "x" + i4);
                int i7 = zzamVar.zzs;
                int i8 = zzamVar.zzr;
                boolean z3 = i7 > i8;
                int i9 = z3 ? i7 : i8;
                if (true == z3) {
                    i7 = i8;
                }
                int[] iArr = zzb;
                int i10 = 0;
                while (true) {
                    if (i10 >= 9) {
                        str = str2;
                        break;
                    }
                    float f3 = i7;
                    float f4 = i9;
                    str = str2;
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    float f5 = i11;
                    if (i11 <= i9 || (i = (int) (f5 * (f3 / f4))) <= i7) {
                        break;
                    }
                    if (zzfs.zza >= 21) {
                        int i12 = true != z3 ? i11 : i;
                        if (true != z3) {
                            i11 = i;
                        }
                        point = zzsnVar.zza(i12, i11);
                        float f6 = zzamVar.zzt;
                        if (point != null) {
                            i2 = i7;
                            if (zzsnVar.zzg(point.x, point.y, f6)) {
                                break;
                            }
                        } else {
                            i2 = i7;
                        }
                        i10++;
                        str2 = str;
                        iArr = iArr2;
                        i7 = i2;
                    } else {
                        i2 = i7;
                        try {
                            int i13 = ((i11 + 15) / 16) * 16;
                            int i14 = ((i + 15) / 16) * 16;
                            if (i13 * i14 <= zzth.zza()) {
                                break;
                            }
                            i10++;
                            str2 = str;
                            iArr = iArr2;
                            i7 = i2;
                        } catch (zztb unused) {
                        }
                    }
                    zzzs zzzsVar = new zzzs(i3, i4, zzac);
                    this.zzj = zzzsVar;
                    z = this.zzi;
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", str);
                    mediaFormat.setInteger("width", zzamVar.zzr);
                    mediaFormat.setInteger("height", zzamVar.zzs);
                    zzfc.zzb(mediaFormat, zzamVar.zzo);
                    f2 = zzamVar.zzt;
                    if (f2 != -1.0f) {
                        mediaFormat.setFloat("frame-rate", f2);
                    }
                    zzfc.zza(mediaFormat, "rotation-degrees", zzamVar.zzu);
                    zzsVar = zzamVar.zzy;
                    if (zzsVar != null) {
                        zzfc.zza(mediaFormat, "color-transfer", zzsVar.zzf);
                        zzfc.zza(mediaFormat, "color-standard", zzsVar.zzd);
                        zzfc.zza(mediaFormat, "color-range", zzsVar.zze);
                        byte[] bArr = zzsVar.zzg;
                        if (bArr != null) {
                            mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
                        }
                    }
                    if ("video/dolby-vision".equals(zzamVar.zzm) && (zzb2 = zzth.zzb(zzamVar)) != null) {
                        zzfc.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
                    }
                    mediaFormat.setInteger("max-width", zzzsVar.zza);
                    mediaFormat.setInteger("max-height", zzzsVar.zzb);
                    zzfc.zza(mediaFormat, "max-input-size", zzzsVar.zzc);
                    if (zzfs.zza >= 23) {
                        mediaFormat.setInteger("priority", 0);
                        if (f != -1.0f) {
                            mediaFormat.setFloat("operating-rate", f);
                        }
                    }
                    if (z) {
                        mediaFormat.setInteger("no-post-process", 1);
                        mediaFormat.setInteger("auto-frc", 0);
                    }
                    if (this.zzm == null) {
                        if (!zzbc(zzsnVar)) {
                            throw new IllegalStateException();
                        }
                        if (this.zzn == null) {
                            this.zzn = zzzz.zza(this.zze, zzsnVar.zzf);
                        }
                        this.zzm = this.zzn;
                    }
                    zzaayVar = this.zzI;
                    if (zzaayVar != null && !zzaayVar.zzp()) {
                        mediaFormat.setInteger("allow-frame-drop", 0);
                    }
                    zzaay zzaayVar2 = this.zzI;
                    return zzsi.zzb(zzsnVar, mediaFormat, zzamVar, zzaayVar2 != null ? zzaayVar2.zzb() : this.zzm, null);
                }
                point = null;
                if (point != null) {
                    i3 = Math.max(i3, point.x);
                    i4 = Math.max(i4, point.y);
                    zzak zzb4 = zzamVar.zzb();
                    zzb4.zzab(i3);
                    zzb4.zzH(i4);
                    zzac = Math.max(zzac, zzab(zzsnVar, zzb4.zzac()));
                    zzez.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i3 + "x" + i4);
                }
                zzzs zzzsVar2 = new zzzs(i3, i4, zzac);
                this.zzj = zzzsVar2;
                z = this.zzi;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str);
                mediaFormat.setInteger("width", zzamVar.zzr);
                mediaFormat.setInteger("height", zzamVar.zzs);
                zzfc.zzb(mediaFormat, zzamVar.zzo);
                f2 = zzamVar.zzt;
                if (f2 != -1.0f) {
                }
                zzfc.zza(mediaFormat, "rotation-degrees", zzamVar.zzu);
                zzsVar = zzamVar.zzy;
                if (zzsVar != null) {
                }
                if ("video/dolby-vision".equals(zzamVar.zzm)) {
                    zzfc.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
                }
                mediaFormat.setInteger("max-width", zzzsVar2.zza);
                mediaFormat.setInteger("max-height", zzzsVar2.zzb);
                zzfc.zza(mediaFormat, "max-input-size", zzzsVar2.zzc);
                if (zzfs.zza >= 23) {
                }
                if (z) {
                }
                if (this.zzm == null) {
                }
                zzaayVar = this.zzI;
                if (zzaayVar != null) {
                    mediaFormat.setInteger("allow-frame-drop", 0);
                }
                zzaay zzaayVar22 = this.zzI;
                return zzsi.zzb(zzsnVar, mediaFormat, zzamVar, zzaayVar22 != null ? zzaayVar22.zzb() : this.zzm, null);
            }
        } else if (zzac != -1 && (zzab = zzab(zzsnVar, zzamVar)) != -1) {
            zzac = Math.min((int) (zzac * 1.5f), zzab);
        }
        str = str2;
        zzzs zzzsVar22 = new zzzs(i3, i4, zzac);
        this.zzj = zzzsVar22;
        z = this.zzi;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzamVar.zzr);
        mediaFormat.setInteger("height", zzamVar.zzs);
        zzfc.zzb(mediaFormat, zzamVar.zzo);
        f2 = zzamVar.zzt;
        if (f2 != -1.0f) {
        }
        zzfc.zza(mediaFormat, "rotation-degrees", zzamVar.zzu);
        zzsVar = zzamVar.zzy;
        if (zzsVar != null) {
        }
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
        }
        mediaFormat.setInteger("max-width", zzzsVar22.zza);
        mediaFormat.setInteger("max-height", zzzsVar22.zzb);
        zzfc.zza(mediaFormat, "max-input-size", zzzsVar22.zzc);
        if (zzfs.zza >= 23) {
        }
        if (z) {
        }
        if (this.zzm == null) {
        }
        zzaayVar = this.zzI;
        if (zzaayVar != null) {
        }
        zzaay zzaayVar222 = this.zzI;
        return zzsi.zzb(zzsnVar, mediaFormat, zzamVar, zzaayVar222 != null ? zzaayVar222.zzb() : this.zzm, null);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final List zzae(zzsu zzsuVar, zzam zzamVar, boolean z) throws zztb {
        return zzth.zzi(zzaT(this.zze, zzsuVar, zzamVar, false, false), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzaf(zzib zzibVar) throws zzit {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzibVar.zzf;
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
                        zzsk zzas = zzas();
                        zzas.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzas.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzag(Exception exc) {
        zzez.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzh.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzah(String str, zzsi zzsiVar, long j, long j2) {
        this.zzh.zza(str, j, j2);
        this.zzk = zzaR(str);
        zzsn zzau = zzau();
        zzau.getClass();
        boolean z = false;
        if (zzfs.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzau.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzau.zzh();
            int length = zzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzl = z;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzai(String str) {
        this.zzh.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzaj(zzam zzamVar, MediaFormat mediaFormat) {
        zzsk zzas = zzas();
        if (zzas != null) {
            zzas.zzq(this.zzp);
        }
        mediaFormat.getClass();
        int i = 0;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzamVar.zzv;
        if (zzfs.zza >= 21) {
            int i2 = zzamVar.zzu;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
        } else if (this.zzI == null) {
            i = zzamVar.zzu;
        }
        this.zzC = new zzdu(integer, integer2, i, f);
        this.zzf.zzc(zzamVar.zzt);
        zzaay zzaayVar = this.zzI;
        if (zzaayVar != null) {
            zzak zzb2 = zzamVar.zzb();
            zzb2.zzab(integer);
            zzb2.zzH(integer2);
            zzb2.zzT(i);
            zzb2.zzR(f);
            zzaayVar.zzg(1, zzb2.zzac());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final long zzak(long j, long j2, long j3, float f) {
        long zzaS = zzaS(j2, j3, j, zzbd() == 2, f, zzh());
        if (zzba(zzaS)) {
            return -2L;
        }
        if (zzbb(j2, zzaS)) {
            return -1L;
        }
        if (zzbd() != 2 || j2 == this.zzr || zzaS > 50000) {
            return -3L;
        }
        zzh();
        return this.zzf.zza(System.nanoTime() + (zzaS * 1000));
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzal() {
        zzaU(2);
        if (this.zzg.zzi()) {
            this.zzg.zzf(zzaq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final zzsl zzat(Throwable th, zzsn zzsnVar) {
        return new zzzp(th, zzsnVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzaw(long j) {
        super.zzaw(j);
        this.zzw--;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzax(zzib zzibVar) throws zzit {
        this.zzw++;
        int i = zzfs.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final void zzay(zzam zzamVar) throws zzit {
        if (this.zzE && !this.zzF && !this.zzg.zzi()) {
            try {
                this.zzg.zzc(zzamVar);
                this.zzg.zzf(zzaq());
                zzaaa zzaaaVar = this.zzH;
                if (zzaaaVar != null) {
                    this.zzg.zzh(zzaaaVar);
                }
            } catch (zzaax e) {
                throw zzi(e, zzamVar, false, 7000);
            }
        }
        if (this.zzI == null && this.zzg.zzi()) {
            zzaay zza = this.zzg.zza();
            this.zzI = zza;
            zza.zzj(new zzzq(this), zzgbr.zzb());
        }
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzlz
    public final void zzs() {
        if (this.zzq == 0) {
            this.zzq = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzw() {
        this.zzD = null;
        zzaU(0);
        this.zzo = false;
        try {
            super.zzw();
        } finally {
            this.zzh.zzc(this.zza);
            this.zzh.zzt(zzdu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzx(boolean z, boolean z2) throws zzit {
        super.zzx(z, z2);
        zzm();
        this.zzh.zze(this.zza);
        this.zzq = z2 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzss, com.google.android.gms.internal.ads.zzik
    protected final void zzy(long j, boolean z) throws zzit {
        zzaay zzaayVar = this.zzI;
        if (zzaayVar != null) {
            zzaayVar.zzd();
        }
        super.zzy(j, z);
        if (this.zzg.zzi()) {
            this.zzg.zzf(zzaq());
        }
        zzaU(1);
        this.zzf.zzf();
        this.zzx = -9223372036854775807L;
        this.zzr = -9223372036854775807L;
        this.zzv = 0;
        this.zzs = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzik
    protected final void zzz() {
        if (this.zzg.zzi()) {
            this.zzg.zzd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzik, com.google.android.gms.internal.ads.zzlu
    public final void zzt(int i, Object obj) throws zzit {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                zzaaa zzaaaVar = (zzaaa) obj;
                this.zzH = zzaaaVar;
                this.zzg.zzh(zzaaaVar);
                return;
            }
            if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (this.zzG != intValue) {
                    this.zzG = intValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                this.zzp = intValue2;
                zzsk zzas = zzas();
                if (zzas != null) {
                    zzas.zzq(intValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                zzaai zzaaiVar = this.zzf;
                obj.getClass();
                zzaaiVar.zzj(((Integer) obj).intValue());
                return;
            }
            if (i == 13) {
                obj.getClass();
                this.zzg.zzg((List) obj);
                this.zzE = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                zzfk zzfkVar = (zzfk) obj;
                if (!this.zzg.zzi() || zzfkVar.zzb() == 0 || zzfkVar.zza() == 0 || (surface = this.zzm) == null) {
                    return;
                }
                this.zzg.zze(surface, zzfkVar);
                return;
            }
        }
        zzzz zzzzVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzzzVar == null) {
            zzzz zzzzVar2 = this.zzn;
            if (zzzzVar2 != null) {
                zzzzVar = zzzzVar2;
            } else {
                zzsn zzau = zzau();
                if (zzau != null && zzbc(zzau)) {
                    zzzzVar = zzzz.zza(this.zze, zzau.zzf);
                    this.zzn = zzzzVar;
                }
            }
        }
        if (this.zzm == zzzzVar) {
            if (zzzzVar == null || zzzzVar == this.zzn) {
                return;
            }
            zzaX();
            Surface surface2 = this.zzm;
            if (surface2 == null || !this.zzo) {
                return;
            }
            this.zzh.zzq(surface2);
            return;
        }
        this.zzm = zzzzVar;
        this.zzf.zzi(zzzzVar);
        this.zzo = false;
        int zzbd = zzbd();
        zzsk zzas2 = zzas();
        zzzz zzzzVar3 = zzzzVar;
        if (zzas2 != null) {
            zzzzVar3 = zzzzVar;
            if (!this.zzg.zzi()) {
                zzzz zzzzVar4 = zzzzVar;
                if (zzfs.zza >= 23) {
                    if (zzzzVar != null) {
                        zzzzVar4 = zzzzVar;
                        if (!this.zzk) {
                            zzas2.zzo(zzzzVar);
                            zzzzVar3 = zzzzVar;
                        }
                    } else {
                        zzzzVar4 = null;
                    }
                }
                zzaz();
                zzav();
                zzzzVar3 = zzzzVar4;
            }
        }
        if (zzzzVar3 == null || zzzzVar3 == this.zzn) {
            this.zzD = null;
            zzaU(1);
            if (this.zzg.zzi()) {
                this.zzg.zzb();
                return;
            }
            return;
        }
        zzaX();
        zzaU(1);
        if (zzbd == 2) {
            this.zzs = -9223372036854775807L;
        }
        if (this.zzg.zzi()) {
            this.zzg.zze(zzzzVar3, zzfk.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzss
    protected final boolean zzan(long j, long j2, zzsk zzskVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzit {
        int zzd2;
        zzskVar.getClass();
        if (this.zzr == -9223372036854775807L) {
            this.zzr = j;
        }
        if (j3 != this.zzx) {
            if (this.zzI == null) {
                this.zzf.zzd(j3);
            }
            this.zzx = j3;
        }
        long zzaq = j3 - zzaq();
        if (z && !z2) {
            zzaO(zzskVar, i, zzaq);
            return true;
        }
        boolean z3 = zzbd() == 2;
        long zzaS = zzaS(j, j2, j3, z3, zzap(), zzh());
        if (this.zzm != this.zzn) {
            zzaay zzaayVar = this.zzI;
            if (zzaayVar != null) {
                zzaayVar.zzi(j, j2);
                long zza = this.zzI.zza(zzaq, z2);
                if (zza != -9223372036854775807L) {
                    zzaZ(zzskVar, i, zzaq, zza);
                    return true;
                }
            } else {
                if (zzbb(j, zzaS)) {
                    zzh();
                    zzaZ(zzskVar, i, zzaq, System.nanoTime());
                    zzaQ(zzaS);
                    return true;
                }
                if (z3 && j != this.zzr) {
                    zzh();
                    long nanoTime = System.nanoTime();
                    long zza2 = this.zzf.zza((zzaS * 1000) + nanoTime);
                    long j4 = this.zzs;
                    long j5 = (zza2 - nanoTime) / 1000;
                    if (j5 >= -500000 || z2 || (zzd2 = zzd(j)) == 0) {
                        if (zzba(j5) && !z2) {
                            if (j4 != -9223372036854775807L) {
                                zzaO(zzskVar, i, zzaq);
                            } else {
                                int i4 = zzfs.zza;
                                Trace.beginSection("dropVideoBuffer");
                                zzskVar.zzn(i, false);
                                Trace.endSection();
                                zzaP(0, 1);
                            }
                            zzaQ(j5);
                            return true;
                        }
                        if (zzfs.zza >= 21) {
                            if (j5 >= 50000) {
                                return false;
                            }
                            if (zza2 == this.zzB) {
                                zzaO(zzskVar, i, zzaq);
                            } else {
                                zzaN(zzskVar, i, zzaq, zza2);
                            }
                            zzaQ(j5);
                            this.zzB = zza2;
                            return true;
                        }
                        if (j5 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            return false;
                        }
                        if (j5 > 11000) {
                            try {
                                Thread.sleep(((-10000) + j5) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        zzaM(zzskVar, i, zzaq);
                        zzaQ(j5);
                        return true;
                    }
                    if (j4 != -9223372036854775807L) {
                        zzil zzilVar = this.zza;
                        zzilVar.zzd += zzd2;
                        zzilVar.zzf += this.zzw;
                    } else {
                        this.zza.zzj++;
                        zzaP(zzd2, this.zzw);
                    }
                    zzaC();
                    zzaay zzaayVar2 = this.zzI;
                    if (zzaayVar2 != null) {
                        zzaayVar2.zzd();
                    }
                }
            }
        } else if (zzba(zzaS)) {
            zzaO(zzskVar, i, zzaq);
            zzaQ(zzaS);
            return true;
        }
        return false;
    }
}
