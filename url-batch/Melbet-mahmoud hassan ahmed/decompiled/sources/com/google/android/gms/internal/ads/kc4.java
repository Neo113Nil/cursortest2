package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class kc4 implements vc4 {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7465b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<? extends oc4> f7466c;

    static {
        Constructor<? extends oc4> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(oc4.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e7) {
            throw new RuntimeException("Error instantiating FLAC extension", e7);
        }
        f7466c = constructor;
    }

    private static final void b(int i7, List<oc4> list) {
        oc4 l2Var;
        switch (i7) {
            case 0:
                l2Var = new l2();
                break;
            case 1:
                l2Var = new o2();
                break;
            case 2:
                l2Var = new r2(0);
                break;
            case 3:
                l2Var = new be4(0);
                break;
            case 4:
                Constructor<? extends oc4> constructor = f7466c;
                if (constructor == null) {
                    l2Var = new he4(0);
                    break;
                } else {
                    try {
                        list.add(constructor.newInstance(0));
                        return;
                    } catch (Exception e7) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e7);
                    }
                }
            case 5:
                l2Var = new ke4();
                break;
            case 6:
                l2Var = new a0(0);
                break;
            case c4.w0.f2149o /* 7 */:
                l2Var = new j0(0);
                break;
            case c4.w0.f2150p /* 8 */:
                list.add(new e1(0, null));
                l2Var = new j1(0);
                break;
            case 9:
                l2Var = new y1();
                break;
            case 10:
                l2Var = new v3();
                break;
            case 11:
                l2Var = new f4(1, 0, 112800);
                break;
            case 12:
                l2Var = new s4();
                break;
            case 13:
            default:
                return;
            case 14:
                l2Var = new pe4();
                break;
        }
        list.add(l2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x02d0, code lost:
    
        if (r15 == r3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02d2, code lost:
    
        b(r15, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0181 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02da A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018d A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.vc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized oc4[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        char c7;
        int i7;
        String lastPathSegment;
        int i8;
        arrayList = new ArrayList(14);
        List<String> list = map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = list.get(0);
        }
        int i9 = 10;
        if (str != null) {
            String e7 = dy.e(str);
            switch (e7.hashCode()) {
                case -2123537834:
                    if (e7.equals("audio/eac3-joc")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1662384011:
                    if (e7.equals("video/mp2p")) {
                        c7 = 19;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1662384007:
                    if (e7.equals("video/mp2t")) {
                        c7 = 20;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1662095187:
                    if (e7.equals("video/webm")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1606874997:
                    if (e7.equals("audio/amr-wb")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1487394660:
                    if (e7.equals("image/jpeg")) {
                        c7 = 23;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1248337486:
                    if (e7.equals("application/mp4")) {
                        c7 = 17;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1004728940:
                    if (e7.equals("text/vtt")) {
                        c7 = 22;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -387023398:
                    if (e7.equals("audio/x-matroska")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -43467528:
                    if (e7.equals("application/webm")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 13915911:
                    if (e7.equals("video/x-flv")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 187078296:
                    if (e7.equals("audio/ac3")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 187078297:
                    if (e7.equals("audio/ac4")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 187078669:
                    if (e7.equals("audio/amr")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 187090232:
                    if (e7.equals("audio/mp4")) {
                        c7 = 16;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 187091926:
                    if (e7.equals("audio/ogg")) {
                        c7 = 18;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 187099443:
                    if (e7.equals("audio/wav")) {
                        c7 = 21;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1331848029:
                    if (e7.equals("video/mp4")) {
                        c7 = 15;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1503095341:
                    if (e7.equals("audio/3gpp")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1504578661:
                    if (e7.equals("audio/eac3")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1504619009:
                    if (e7.equals("audio/flac")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1504831518:
                    if (e7.equals("audio/mpeg")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1505118770:
                    if (e7.equals("audio/webm")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 2039520277:
                    if (e7.equals("video/x-matroska")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                case 1:
                case 2:
                    i7 = 0;
                    break;
                case 3:
                    i7 = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    i7 = 3;
                    break;
                case c4.w0.f2149o /* 7 */:
                    i7 = 4;
                    break;
                case c4.w0.f2150p /* 8 */:
                    i7 = 5;
                    break;
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                    i7 = 6;
                    break;
                case 14:
                    i7 = 7;
                    break;
                case 15:
                case 16:
                case 17:
                    i7 = 8;
                    break;
                case 18:
                    i7 = 9;
                    break;
                case 19:
                    i7 = 10;
                    break;
                case 20:
                    i7 = 11;
                    break;
                case 21:
                    i7 = 12;
                    break;
                case 22:
                    i7 = 13;
                    break;
                case 23:
                    i7 = 14;
                    break;
            }
            if (i7 != -1) {
                b(i7, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                    if (lastPathSegment.endsWith(".ac4")) {
                        i9 = 1;
                    } else {
                        if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                            if (lastPathSegment.endsWith(".amr")) {
                                i9 = 3;
                            } else if (lastPathSegment.endsWith(".flac")) {
                                i9 = 4;
                            } else if (lastPathSegment.endsWith(".flv")) {
                                i9 = 5;
                            } else {
                                if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                    if (lastPathSegment.endsWith(".mp3")) {
                                        i9 = 7;
                                    } else {
                                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                                                                    i9 = 14;
                                                                }
                                                            }
                                                            i9 = 13;
                                                        }
                                                        i9 = 12;
                                                    }
                                                    i9 = 11;
                                                }
                                            }
                                            i9 = 9;
                                        }
                                        i9 = 8;
                                    }
                                }
                                i9 = 6;
                            }
                        }
                        i9 = 2;
                    }
                    int[] iArr = f7465b;
                    for (i8 = 0; i8 < 14; i8++) {
                        int i10 = iArr[i8];
                        if (i10 != i7 && i10 != i9) {
                            b(i10, arrayList);
                        }
                    }
                }
                i9 = 0;
                int[] iArr2 = f7465b;
                while (i8 < 14) {
                }
            }
            i9 = -1;
            int[] iArr22 = f7465b;
            while (i8 < 14) {
            }
        }
        i7 = -1;
        if (i7 != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i9 = -1;
        int[] iArr222 = f7465b;
        while (i8 < 14) {
        }
        return (oc4[]) arrayList.toArray(new oc4[arrayList.size()]);
    }

    @Override // com.google.android.gms.internal.ads.vc4
    public final synchronized oc4[] zza() {
        return a(Uri.EMPTY, new HashMap());
    }
}
