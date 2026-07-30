package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzaud implements zzauy {
    public static final /* synthetic */ zzaud zza;
    public static final /* synthetic */ zzaud zzb;
    public static final /* synthetic */ zzaud zzc;
    public static final /* synthetic */ zzaud zzd;
    public static final /* synthetic */ zzaud zze;
    public static final /* synthetic */ zzaud zzf;
    public static final /* synthetic */ zzaud zzg;
    public static final /* synthetic */ zzaud zzh;
    public static final /* synthetic */ zzaud zzi;
    public static final /* synthetic */ zzaud zzj;
    public static final /* synthetic */ zzaud zzk;
    public static final /* synthetic */ zzaud zzl;
    public static final /* synthetic */ zzaud zzm;
    public static final /* synthetic */ zzaud zzn;
    public static final /* synthetic */ zzaud zzo;
    public static final /* synthetic */ zzaud zzp;
    public static final /* synthetic */ zzaud zzq;
    public static final /* synthetic */ zzaud zzr;
    public static final /* synthetic */ zzaud zzs;
    public static final /* synthetic */ zzaud zzt;
    public static final /* synthetic */ zzaud zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i2 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i3 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i4 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i5 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i6 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i7 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzaud((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzaud((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzaud((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzaud(i7);
        zzq = new zzaud(i4);
        zzp = new zzaud(i5);
        zzaud zzaudVar = new zzaud(i6);
        int i8 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i9 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i10 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i11 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i12 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i13 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i14 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i15 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i16 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzaudVar;
        zzn = new zzaud(i3);
        zzm = new zzaud(i8);
        zzl = new zzaud(i9);
        zzk = new zzaud(i10);
        zzj = new zzaud(i2);
        zzi = new zzaud(i11);
        zzh = new zzaud(i12);
        zzg = new zzaud(i13);
        zzf = new zzaud(i);
        zze = new zzaud(i14);
        zzd = new zzaud(i15);
        zzc = new zzaud(i16);
        zzb = new zzaud(1);
        zza = new zzaud(0);
    }

    private /* synthetic */ zzaud(int i) {
        this.zzv = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatq zzatqVar;
        Object obj2;
        zzaux zzauxVar;
        zzavg zza2;
        zzatq zzatqVar2;
        Class<?> cls;
        zzatq zzatqVar3;
        long j = 1;
        int i = 0;
        try {
            try {
                try {
                    try {
                        switch (this.zzv) {
                            case 0:
                                zzaux zzauxVar2 = ((zzavb) obj).zzb;
                                zzauxVar2.zzb(zzavg.zzb(zzauxVar2.zzc().zzm() + zzauxVar2.zzc().zzm()));
                                return Optional.empty();
                            case 1:
                                zzaux zzauxVar3 = ((zzavb) obj).zzb;
                                zzauxVar3.zzb(zzavg.zzc(zzauxVar3.zzc().zzq() + zzauxVar3.zzc().zzq()));
                                return Optional.empty();
                            case 2:
                                zzaux zzauxVar4 = ((zzavb) obj).zzb;
                                zzauxVar4.zzb(zzavg.zzd(zzauxVar4.zzc().zzn().zzd(zzauxVar4.zzc().zzn())));
                                return Optional.empty();
                            case 3:
                                zzavb zzavbVar = (zzavb) obj;
                                try {
                                    long zze2 = zzavbVar.zzd.zze();
                                    for (long j2 = 0; j2 < zze2; j2++) {
                                        zzavbVar.zzb.zzb(zzavg.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzauw unused) {
                                    zzatqVar = zzatq.zza;
                                    return Optional.of(zzatqVar);
                                }
                            case 4:
                                zzaux zzauxVar5 = ((zzavb) obj).zzb;
                                zzauxVar5.zzb(zzavg.zzb(zzauxVar5.zzc().zzm() & zzauxVar5.zzc().zzm()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j3 = jArr[0];
                                long j4 = jArr[1];
                                long j5 = jArr[2];
                                long j6 = jArr[3];
                                long j7 = jArr[4];
                                long j8 = jArr[5];
                                long j9 = jArr[6];
                                long j10 = jArr[7];
                                long j11 = j9 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8);
                                long j12 = j10 % 102194872;
                                zzaux zzauxVar6 = ((zzavb) obj).zzb;
                                zzauxVar6.zzb(zzavg.zzb(zzauxVar6.zzc().zzm() ^ (j11 ^ j12)));
                                return Optional.empty();
                            case 6:
                                zzaux zzauxVar7 = ((zzavb) obj).zzb;
                                zzauxVar7.zzb(zzavg.zzb(zzauxVar7.zzc().zzm() | zzauxVar7.zzc().zzm()));
                                return Optional.empty();
                            case 7:
                                zzaux zzauxVar8 = ((zzavb) obj).zzb;
                                zzauxVar8.zzb(zzavg.zzb(zzauxVar8.zzc().zzm() ^ zzauxVar8.zzc().zzm()));
                                return Optional.empty();
                            case 8:
                                zzavb zzavbVar2 = (zzavb) obj;
                                try {
                                    long zzm2 = zzavbVar2.zzb.zzc().zzm();
                                    zzauu zzauuVar = zzavbVar2.zzc;
                                    zzaup zzaupVar = zzavbVar2.zzd;
                                    zzauuVar.zza(zzaupVar.zzb(), 0L, r2.zzb);
                                    zzaupVar.zza(zzm2);
                                    return Optional.empty();
                                } catch (zzaun | zzauo unused2) {
                                    zzatqVar = zzatq.zzr;
                                    return Optional.of(zzatqVar);
                                } catch (zzaus unused3) {
                                    zzatqVar = zzatq.zzB;
                                    return Optional.of(zzatqVar);
                                }
                            case 9:
                                zzavb zzavbVar3 = (zzavb) obj;
                                try {
                                    zzaux zzauxVar9 = zzavbVar3.zzb;
                                    long zzm3 = zzauxVar9.zzc().zzm();
                                    List zzo2 = zzauxVar9.zzc().zzo();
                                    int size = zzo2.size();
                                    Object zzh2 = zzauxVar9.zzc().zzh();
                                    Object zzl2 = zzauxVar9.zzc().zzl();
                                    if (zzl2 instanceof Method) {
                                        Method method = (Method) zzl2;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (zzh2 instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) zzh2).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List zzo3 = ((zzavg) zzo2.get(0)).zzo();
                                                if (zzo3.size() == length) {
                                                    for (int i2 = 0; i2 < zzo3.size(); i2++) {
                                                        objArr2[i2] = ((zzavg) zzo3.get(i2)).zzi(parameterTypes2[i2]);
                                                    }
                                                    obj2 = null;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                obj2 = null;
                                                while (i < size) {
                                                    objArr[i] = ((zzavg) zzo2.get(i)).zzi(parameterTypes[i]);
                                                    i++;
                                                }
                                            }
                                            try {
                                                Object invoke = method.invoke(zzh2, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) {
                                                    zzauxVar = zzavbVar3.zzb;
                                                    zza2 = zzavg.zza(obj2);
                                                } else if (zzm3 != 0) {
                                                    zzauxVar = zzavbVar3.zzb;
                                                    zza2 = zzavg.zzg(invoke);
                                                } else {
                                                    zzauxVar = zzavbVar3.zzb;
                                                    zza2 = zzavg.zza(invoke);
                                                }
                                                zzauxVar.zzb(zza2);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzatqVar = zzatq.zzq;
                                                return Optional.of(zzatqVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzatq.zzp);
                                } catch (zzavd unused5) {
                                    zzatqVar = zzatq.zzp;
                                }
                                break;
                            case 10:
                                int i3 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i4 = 1073781763 % 1003463633;
                                int i5 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i6 = 1917305981 % 575705360;
                                zzavb zzavbVar4 = (zzavb) obj;
                                zzaux zzauxVar10 = zzavbVar4.zzb;
                                int intExact = Math.toIntExact(zzauxVar10.zzc().zzm());
                                zzauk zzn2 = zzauxVar10.zzc().zzn();
                                zzauk zzn3 = zzauxVar10.zzc().zzn();
                                if (zzn2.zza.length != (i3 ^ i4)) {
                                    return Optional.of(zzatq.zzH);
                                }
                                int[] iArr = new int[i5 ^ i6];
                                ByteBuffer.wrap(zzn2.zza()).asIntBuffer().get(iArr);
                                zzauc zzaucVar = new zzauc(intExact, iArr);
                                int i7 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i8 = 1527793660 % 245277883;
                                int i9 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i10 = 2026478004 % 1659239833;
                                byte[] zza3 = zzn3.zza();
                                int i11 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i11];
                                int i12 = 0;
                                while (i12 < zza3.length) {
                                    if (i12 % i11 != 0) {
                                        if (i12 == 0) {
                                            i12 = 0;
                                        } else {
                                            int i13 = i9 ^ i10;
                                            zza3[i12] = (byte) (((zza3[i12] ^ bArr[i12 % i11]) << i13) >> i13);
                                            i12++;
                                        }
                                    }
                                    zzaucVar.zza(i12 >>> (i7 ^ i8), bArr);
                                    int i132 = i9 ^ i10;
                                    zza3[i12] = (byte) (((zza3[i12] ^ bArr[i12 % i11]) << i132) >> i132);
                                    i12++;
                                }
                                zzavbVar4.zzb.zzb(zzavg.zzd(zzauk.zze(zza3)));
                                return Optional.empty();
                            case 11:
                                zzaux zzauxVar11 = ((zzavb) obj).zzb;
                                double zzq2 = zzauxVar11.zzc().zzq();
                                double zzq3 = zzauxVar11.zzc().zzq();
                                if (zzq2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                    zzatqVar2 = zzatq.zzF;
                                    return Optional.of(zzatqVar2);
                                }
                                zzauxVar11.zzb(zzavg.zzc(zzq3 / zzq2));
                                return Optional.empty();
                            case 12:
                                zzaux zzauxVar12 = ((zzavb) obj).zzb;
                                long zzm4 = zzauxVar12.zzc().zzm();
                                long zzm5 = zzauxVar12.zzc().zzm();
                                if (zzm4 == 0) {
                                    zzatqVar2 = zzatq.zzF;
                                    return Optional.of(zzatqVar2);
                                }
                                zzauxVar12.zzb(zzavg.zzb(zzm5 / zzm4));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzavb) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzauv unused6) {
                                    zzatqVar = zzatq.zzA;
                                    return Optional.of(zzatqVar);
                                }
                            case 14:
                                zzavb zzavbVar5 = (zzavb) obj;
                                long zzm6 = zzavbVar5.zzb.zzc().zzm();
                                zzaux zzauxVar13 = zzavbVar5.zzb;
                                zzauxVar13.zzb(zzavg.zzj(zzauxVar13.zzd(zzm6)));
                                return Optional.empty();
                            case 15:
                                zzavb zzavbVar6 = (zzavb) obj;
                                long zzm7 = zzavbVar6.zzc.zzb().zzb + zzavbVar6.zzb.zzc().zzm();
                                zzaux zzauxVar14 = zzavbVar6.zzb;
                                zzauxVar14.zzb(zzavg.zzj(zzauxVar14.zzd(-zzm7)));
                                return Optional.empty();
                            case 16:
                                zzavb zzavbVar7 = (zzavb) obj;
                                long zze3 = zzavbVar7.zzc.zzb().zzb + zzavbVar7.zzd.zze();
                                zzaux zzauxVar15 = zzavbVar7.zzb;
                                zzauxVar15.zzb(zzavg.zzj(zzauxVar15.zzd(-zze3)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzaux zzauxVar16 = ((zzavb) obj).zzb;
                                    if (new zzavc(true).compare(zzauxVar16.zzc(), zzauxVar16.zzc()) != 0) {
                                        j = 0;
                                    }
                                    zzauxVar16.zzb(zzavg.zzb(j));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzatqVar = zzatq.zzd;
                                    return Optional.of(zzatqVar);
                                }
                            case 18:
                                try {
                                    zzaux zzauxVar17 = ((zzavb) obj).zzb;
                                    String zzc2 = zzauxVar17.zzc().zzn().zzc();
                                    switch (zzc2.hashCode()) {
                                        case -1325958191:
                                            if (zzc2.equals("double")) {
                                                cls = Double.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 104431:
                                            if (zzc2.equals("int")) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3039496:
                                            if (zzc2.equals("byte")) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3052374:
                                            if (zzc2.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3327612:
                                            if (zzc2.equals("long")) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3625364:
                                            if (zzc2.equals("void")) {
                                                cls = Void.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 64711720:
                                            if (zzc2.equals(TypedValues.Custom.S_BOOLEAN)) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 97526364:
                                            if (zzc2.equals(TypedValues.Custom.S_FLOAT)) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 109413500:
                                            if (zzc2.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        default:
                                            cls = Class.forName(zzc2);
                                            break;
                                    }
                                    zzauxVar17.zzb(zzavg.zza(cls));
                                    return Optional.empty();
                                } catch (zzavd unused8) {
                                    zzatqVar = zzatq.zzl;
                                    return Optional.of(zzatqVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzatqVar = zzatq.zzm;
                                    return Optional.of(zzatqVar);
                                }
                            case 19:
                                try {
                                    zzaux zzauxVar18 = ((zzavb) obj).zzb;
                                    List zzo4 = zzauxVar18.zzc().zzo();
                                    Class<?>[] clsArr = new Class[zzo4.size()];
                                    while (true) {
                                        if (i < zzo4.size()) {
                                            Object zzl3 = ((zzavg) zzo4.get(i)).zzl();
                                            if (zzl3 instanceof Class) {
                                                clsArr[i] = (Class) zzl3;
                                                i++;
                                            } else {
                                                zzatqVar3 = zzatq.zzn;
                                            }
                                        } else {
                                            String zzc3 = zzauxVar18.zzc().zzn().zzc();
                                            Object zzl4 = zzauxVar18.zzc().zzl();
                                            if (zzl4 instanceof Class) {
                                                zzauxVar18.zzb(zzavg.zza(((Class) zzl4).getMethod(zzc3, clsArr)));
                                                return Optional.empty();
                                            }
                                            zzatqVar3 = zzatq.zzn;
                                        }
                                    }
                                    return Optional.of(zzatqVar3);
                                } catch (zzavd unused10) {
                                    zzatqVar = zzatq.zzn;
                                    return Optional.of(zzatqVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzatqVar = zzatq.zzo;
                                    return Optional.of(zzatqVar);
                                } catch (SecurityException unused12) {
                                    zzatqVar = zzatq.zzC;
                                    return Optional.of(zzatqVar);
                                }
                            default:
                                int i14 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i15 = 1764892438 % 764851988;
                                zzaux zzauxVar19 = ((zzavb) obj).zzb;
                                long zzm8 = zzauxVar19.zzc().zzm();
                                zzavg zzc4 = zzauxVar19.zzc();
                                zzavg zzc5 = zzauxVar19.zzc();
                                int i16 = zzc5.zza;
                                int i17 = (i14 ^ i15) + i16;
                                if (i16 == 0) {
                                    throw null;
                                }
                                if (i17 == 3) {
                                    zzauk zzn4 = zzc5.zzn();
                                    int i18 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i19 = 2085308422 % 531900034;
                                    if (zzm8 < 0) {
                                        zzm8 += zzn4.zza.length;
                                    }
                                    if (zzc4.zza != (i18 ^ i19)) {
                                        throw new zzavd();
                                    }
                                    if (zzm8 >= 0 && zzm8 < zzn4.zza.length) {
                                        char charAt = zzn4.zzc().charAt((int) zzm8);
                                        StringBuilder sb = new StringBuilder(String.valueOf(charAt).length());
                                        sb.append(charAt);
                                        zzc4 = zzavg.zzd(zzauk.zzf(sb.toString()));
                                    }
                                } else {
                                    if (i17 != 4) {
                                        throw new zzavd();
                                    }
                                    List zzo5 = zzc5.zzo();
                                    if (zzm8 < 0) {
                                        zzm8 += zzo5.size();
                                    }
                                    if (zzm8 >= 0 && zzm8 < zzo5.size()) {
                                        zzc4 = (zzavg) zzo5.get((int) zzm8);
                                    }
                                }
                                zzauxVar19.zzb(zzc4);
                                return Optional.empty();
                        }
                    } catch (zzaut | zzauv unused13) {
                        zzatqVar = zzatq.zzx;
                    }
                } catch (zzauw e) {
                    throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzauv unused14) {
                zzatqVar = zzatq.zzf;
            }
        } catch (zzaum | zzauo | zzavd unused15) {
            zzatqVar = zzatq.zzy;
        }
    }
}
