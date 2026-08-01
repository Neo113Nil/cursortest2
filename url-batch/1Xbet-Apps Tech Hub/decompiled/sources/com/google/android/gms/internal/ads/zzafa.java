package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzafa {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaew zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!zzft.zzc(newPullParser, "x:xmpmeta")) {
                throw zzcf.zza("Couldn't find xmp metadata", null);
            }
            zzfwu zzl = zzfwu.zzl();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (zzft.zzc(newPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String zza2 = zzft.zza(newPullParser, strArr[i2]);
                        if (zza2 != null) {
                            if (Integer.parseInt(zza2) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    break;
                                }
                                String zza3 = zzft.zza(newPullParser, strArr2[i3]);
                                if (zza3 != null) {
                                    j = Long.parseLong(zza3);
                                    if (j == -1) {
                                    }
                                } else {
                                    i3++;
                                }
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzl = zzfwu.zzl();
                                    break;
                                }
                                String zza4 = zzft.zza(newPullParser, strArr3[i]);
                                if (zza4 != null) {
                                    zzl = zzfwu.zzn(new zzaev("image/jpeg", "Primary", 0L, 0L), new zzaev("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzft.zzc(newPullParser, "Container:Directory")) {
                    zzl = zzb(newPullParser, "Container", "Item");
                } else if (zzft.zzc(newPullParser, "GContainer:Directory")) {
                    zzl = zzb(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzft.zzb(newPullParser, "x:xmpmeta"));
            if (zzl.isEmpty()) {
                return null;
            }
            return new zzaew(j2, zzl);
        } catch (zzcf | NumberFormatException | XmlPullParserException unused) {
            zzez.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfwu zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfwr zzfwrVar = new zzfwr();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzft.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzft.zza(xmlPullParser, concat2);
                String zza3 = zzft.zza(xmlPullParser, concat3);
                String zza4 = zzft.zza(xmlPullParser, concat4);
                String zza5 = zzft.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzfwu.zzl();
                }
                zzfwrVar.zzf(new zzaev(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzft.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfwrVar.zzi();
    }
}
