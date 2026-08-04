package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzacq implements zzada {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacp zzc = new zzacp(zzacn.zza);
    private static final zzacp zzd = new zzacp(zzacm.zza);
    private zzgjz zze;
    private final zzajt zzf = new zzajo();

    @Override // com.google.android.gms.internal.ads.zzada
    public final synchronized zzacu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0138, code lost:
    
        if (r4.equals("application/mp4") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0162, code lost:
    
        if (r4.equals("image/heic") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0177, code lost:
    
        if (r4.equals("audio/amr-wb") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0181, code lost:
    
        if (r4.equals("video/webm") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01a2, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L111;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a7 A[Catch: all -> 0x038b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01a7, B:15:0x01aa, B:20:0x036d, B:21:0x0370, B:23:0x0375, B:26:0x037b, B:28:0x037e, B:32:0x0381, B:37:0x01b3, B:39:0x01bb, B:42:0x01c5, B:45:0x01d0, B:47:0x01d8, B:50:0x01e2, B:53:0x01ed, B:56:0x01f8, B:59:0x0203, B:61:0x020b, B:63:0x0213, B:66:0x021d, B:68:0x022b, B:71:0x0235, B:74:0x0240, B:76:0x0248, B:78:0x0256, B:80:0x0264, B:83:0x0274, B:85:0x0282, B:88:0x028c, B:90:0x0294, B:92:0x029c, B:94:0x02a4, B:97:0x02ae, B:99:0x02b6, B:102:0x02c6, B:104:0x02ce, B:107:0x02d8, B:109:0x02e0, B:112:0x02ea, B:114:0x02f2, B:117:0x02fb, B:120:0x0307, B:123:0x0313, B:126:0x031e, B:128:0x0326, B:131:0x032f, B:133:0x0337, B:136:0x0340, B:152:0x0046, B:153:0x004e, B:155:0x0052, B:159:0x005c, B:162:0x0066, B:165:0x0071, B:168:0x007d, B:171:0x0088, B:175:0x0092, B:179:0x009c, B:183:0x00a6, B:186:0x00b1, B:189:0x00bc, B:192:0x00c6, B:195:0x00d0, B:198:0x00db, B:201:0x00e5, B:204:0x00f0, B:207:0x00fa, B:210:0x0104, B:213:0x0110, B:216:0x011b, B:219:0x0126, B:222:0x0132, B:224:0x013e, B:227:0x0149, B:230:0x0153, B:234:0x015c, B:236:0x0167, B:239:0x0171, B:241:0x017b, B:243:0x0186, B:246:0x0191, B:249:0x019c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0375 A[Catch: all -> 0x038b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01a7, B:15:0x01aa, B:20:0x036d, B:21:0x0370, B:23:0x0375, B:26:0x037b, B:28:0x037e, B:32:0x0381, B:37:0x01b3, B:39:0x01bb, B:42:0x01c5, B:45:0x01d0, B:47:0x01d8, B:50:0x01e2, B:53:0x01ed, B:56:0x01f8, B:59:0x0203, B:61:0x020b, B:63:0x0213, B:66:0x021d, B:68:0x022b, B:71:0x0235, B:74:0x0240, B:76:0x0248, B:78:0x0256, B:80:0x0264, B:83:0x0274, B:85:0x0282, B:88:0x028c, B:90:0x0294, B:92:0x029c, B:94:0x02a4, B:97:0x02ae, B:99:0x02b6, B:102:0x02c6, B:104:0x02ce, B:107:0x02d8, B:109:0x02e0, B:112:0x02ea, B:114:0x02f2, B:117:0x02fb, B:120:0x0307, B:123:0x0313, B:126:0x031e, B:128:0x0326, B:131:0x032f, B:133:0x0337, B:136:0x0340, B:152:0x0046, B:153:0x004e, B:155:0x0052, B:159:0x005c, B:162:0x0066, B:165:0x0071, B:168:0x007d, B:171:0x0088, B:175:0x0092, B:179:0x009c, B:183:0x00a6, B:186:0x00b1, B:189:0x00bc, B:192:0x00c6, B:195:0x00d0, B:198:0x00db, B:201:0x00e5, B:204:0x00f0, B:207:0x00fa, B:210:0x0104, B:213:0x0110, B:216:0x011b, B:219:0x0126, B:222:0x0132, B:224:0x013e, B:227:0x0149, B:230:0x0153, B:234:0x015c, B:236:0x0167, B:239:0x0171, B:241:0x017b, B:243:0x0186, B:246:0x0191, B:249:0x019c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b3 A[Catch: all -> 0x038b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01a7, B:15:0x01aa, B:20:0x036d, B:21:0x0370, B:23:0x0375, B:26:0x037b, B:28:0x037e, B:32:0x0381, B:37:0x01b3, B:39:0x01bb, B:42:0x01c5, B:45:0x01d0, B:47:0x01d8, B:50:0x01e2, B:53:0x01ed, B:56:0x01f8, B:59:0x0203, B:61:0x020b, B:63:0x0213, B:66:0x021d, B:68:0x022b, B:71:0x0235, B:74:0x0240, B:76:0x0248, B:78:0x0256, B:80:0x0264, B:83:0x0274, B:85:0x0282, B:88:0x028c, B:90:0x0294, B:92:0x029c, B:94:0x02a4, B:97:0x02ae, B:99:0x02b6, B:102:0x02c6, B:104:0x02ce, B:107:0x02d8, B:109:0x02e0, B:112:0x02ea, B:114:0x02f2, B:117:0x02fb, B:120:0x0307, B:123:0x0313, B:126:0x031e, B:128:0x0326, B:131:0x032f, B:133:0x0337, B:136:0x0340, B:152:0x0046, B:153:0x004e, B:155:0x0052, B:159:0x005c, B:162:0x0066, B:165:0x0071, B:168:0x007d, B:171:0x0088, B:175:0x0092, B:179:0x009c, B:183:0x00a6, B:186:0x00b1, B:189:0x00bc, B:192:0x00c6, B:195:0x00d0, B:198:0x00db, B:201:0x00e5, B:204:0x00f0, B:207:0x00fa, B:210:0x0104, B:213:0x0110, B:216:0x011b, B:219:0x0126, B:222:0x0132, B:224:0x013e, B:227:0x0149, B:230:0x0153, B:234:0x015c, B:236:0x0167, B:239:0x0171, B:241:0x017b, B:243:0x0186, B:246:0x0191, B:249:0x019c), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzacu[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        arrayList = new ArrayList(21);
        List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        if (str != null) {
            String zzi = zzar.zzi(str);
            switch (zzi.hashCode()) {
                case -2123537834:
                    break;
                case -1662384011:
                    if (zzi.equals("video/mp2p")) {
                        i = 10;
                        break;
                    }
                    break;
                case -1662384007:
                    if (zzi.equals("video/mp2t")) {
                        i = 11;
                        break;
                    }
                    break;
                case -1662095187:
                    break;
                case -1606874997:
                    break;
                case -1487656890:
                    if (zzi.equals("image/avif")) {
                        i = 21;
                        break;
                    }
                    break;
                case -1487464693:
                    break;
                case -1487464690:
                    if (zzi.equals("image/heif")) {
                        i = 20;
                        break;
                    }
                    break;
                case -1487394660:
                    if (zzi.equals("image/jpeg")) {
                        i = 14;
                        break;
                    }
                    break;
                case -1487018032:
                    if (zzi.equals("image/webp")) {
                        i = 18;
                        break;
                    }
                    break;
                case -1248337486:
                    break;
                case -1079884372:
                    if (zzi.equals("video/x-msvideo")) {
                        i = 16;
                        break;
                    }
                    break;
                case -1004728940:
                    if (zzi.equals("text/vtt")) {
                        i = 13;
                        break;
                    }
                    break;
                case -879272239:
                    if (zzi.equals("image/bmp")) {
                        i = 19;
                        break;
                    }
                    break;
                case -879258763:
                    if (zzi.equals("image/png")) {
                        i = 17;
                        break;
                    }
                    break;
                case -387023398:
                    if (zzi.equals("audio/x-matroska")) {
                        i = 6;
                        break;
                    }
                    break;
                case -43467528:
                    if (zzi.equals("application/webm")) {
                        i = 6;
                        break;
                    }
                    break;
                case 13915911:
                    if (zzi.equals("video/x-flv")) {
                        i = 5;
                        break;
                    }
                    break;
                case 187078296:
                    if (zzi.equals("audio/ac3")) {
                        i = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (zzi.equals("audio/ac4")) {
                        i = 1;
                        break;
                    }
                    break;
                case 187078669:
                    if (zzi.equals("audio/amr")) {
                        i = 3;
                        break;
                    }
                    break;
                case 187090232:
                    if (zzi.equals("audio/mp4")) {
                        i = 8;
                        break;
                    }
                    break;
                case 187091926:
                    if (zzi.equals("audio/ogg")) {
                        i = 9;
                        break;
                    }
                    break;
                case 187099443:
                    if (zzi.equals("audio/wav")) {
                        i = 12;
                        break;
                    }
                    break;
                case 1331848029:
                    if (zzi.equals("video/mp4")) {
                        i = 8;
                        break;
                    }
                    break;
                case 1503095341:
                    if (zzi.equals("audio/3gpp")) {
                        i = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (zzi.equals("audio/eac3")) {
                        i = 0;
                        break;
                    }
                    break;
                case 1504619009:
                    if (zzi.equals("audio/flac")) {
                        i = 4;
                        break;
                    }
                    break;
                case 1504824762:
                    if (zzi.equals("audio/midi")) {
                        i = 15;
                        break;
                    }
                    break;
                case 1504831518:
                    if (zzi.equals("audio/mpeg")) {
                        i = 7;
                        break;
                    }
                    break;
                case 1505118770:
                    if (zzi.equals("audio/webm")) {
                        i = 6;
                        break;
                    }
                    break;
                case 2039520277:
                    if (zzi.equals("video/x-matroska")) {
                        i = 6;
                        break;
                    }
                    break;
            }
            if (i != -1) {
                zzc(i, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                    if (lastPathSegment.endsWith(".ac4")) {
                        i2 = 1;
                    } else {
                        if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                            if (lastPathSegment.endsWith(".amr")) {
                                i2 = 3;
                            } else if (lastPathSegment.endsWith(".flac")) {
                                i2 = 4;
                            } else if (lastPathSegment.endsWith(".flv")) {
                                i2 = 5;
                            } else {
                                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                        if (lastPathSegment.endsWith(".mp3")) {
                                            i2 = 7;
                                        } else {
                                            if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                    if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                        if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                            if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                    if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                        if (lastPathSegment.endsWith(".avi")) {
                                                                            i2 = 16;
                                                                        } else if (lastPathSegment.endsWith(".png")) {
                                                                            i2 = 17;
                                                                        } else if (lastPathSegment.endsWith(".webp")) {
                                                                            i2 = 18;
                                                                        } else {
                                                                            if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                                                if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                                                    if (lastPathSegment.endsWith(".avif")) {
                                                                                        i2 = 21;
                                                                                    }
                                                                                }
                                                                                i2 = 20;
                                                                            }
                                                                            i2 = 19;
                                                                        }
                                                                    }
                                                                    i2 = 14;
                                                                }
                                                                i2 = 13;
                                                            }
                                                            i2 = 12;
                                                        }
                                                        i2 = 11;
                                                    }
                                                    i2 = 10;
                                                }
                                                i2 = 9;
                                            }
                                            i2 = 8;
                                        }
                                    }
                                    i2 = 6;
                                }
                                i2 = 15;
                            }
                        }
                        i2 = 2;
                    }
                    if (i2 != -1 && i2 != i) {
                        zzc(i2, arrayList);
                    }
                    int[] iArr = zzb;
                    for (i3 = 0; i3 < 21; i3++) {
                        int i4 = iArr[i3];
                        if (i4 != i && i4 != i2) {
                            zzc(i4, arrayList);
                        }
                    }
                }
                i2 = 0;
                if (i2 != -1) {
                    zzc(i2, arrayList);
                }
                int[] iArr2 = zzb;
                while (i3 < 21) {
                }
            }
            i2 = -1;
            if (i2 != -1) {
            }
            int[] iArr22 = zzb;
            while (i3 < 21) {
            }
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i2 = -1;
        if (i2 != -1) {
        }
        int[] iArr222 = zzb;
        while (i3 < 21) {
        }
        return (zzacu[]) arrayList.toArray(new zzacu[0]);
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzals());
                break;
            case 1:
                list.add(new zzalv());
                break;
            case 2:
                list.add(new zzaly(0));
                break;
            case 3:
                list.add(new zzaej(0));
                break;
            case 4:
                zzacu zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzafa(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzafd());
                break;
            case 6:
                list.add(new zzagz(this.zzf, 0));
                break;
            case 7:
                list.add(new zzahg(0));
                break;
            case 8:
                zzajt zzajtVar = this.zzf;
                list.add(new zzaif(zzajtVar, 0, null, null, zzgjz.zzi(), null));
                list.add(new zzaim(zzajtVar, 0));
                break;
            case 9:
                list.add(new zzajc());
                break;
            case 10:
                list.add(new zzanc());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgjz.zzi();
                }
                list.add(new zzann(1, 0, this.zzf, new zzel(0L), new zzama(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaoa());
                break;
            case 14:
                list.add(new zzafj(0));
                break;
            case 15:
                zzacu zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzaen(0, this.zzf));
                break;
            case 17:
                list.add(new zzajm());
                break;
            case 18:
                list.add(new zzaof());
                break;
            case 19:
                list.add(new zzaev());
                break;
            case 20:
                list.add(new zzafi());
                break;
            case 21:
                list.add(new zzaeu());
                break;
        }
    }
}
