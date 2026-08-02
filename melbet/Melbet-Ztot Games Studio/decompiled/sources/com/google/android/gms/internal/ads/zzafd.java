package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzafd {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaez zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!zzeu.zzc(newPullParser, "x:xmpmeta")) {
                throw zzbo.zza("Couldn't find xmp metadata", null);
            }
            zzfxr zzm = zzfxr.zzm();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (zzeu.zzc(newPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String zza2 = zzeu.zza(newPullParser, strArr[i2]);
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
                                String zza3 = zzeu.zza(newPullParser, strArr2[i3]);
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
                                    zzm = zzfxr.zzm();
                                    break;
                                }
                                String zza4 = zzeu.zza(newPullParser, strArr3[i]);
                                if (zza4 != null) {
                                    zzm = zzfxr.zzo(new zzaey("image/jpeg", "Primary", 0L, 0L), new zzaey("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzeu.zzc(newPullParser, "Container:Directory")) {
                    zzm = zzb(newPullParser, "Container", "Item");
                } else if (zzeu.zzc(newPullParser, "GContainer:Directory")) {
                    zzm = zzb(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzeu.zzb(newPullParser, "x:xmpmeta"));
            if (zzm.isEmpty()) {
                return null;
            }
            return new zzaez(j2, zzm);
        } catch (zzbo | NumberFormatException | XmlPullParserException unused) {
            zzea.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfxr zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfxo zzfxoVar = new zzfxo();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzeu.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzeu.zza(xmlPullParser, concat2);
                String zza3 = zzeu.zza(xmlPullParser, concat3);
                String zza4 = zzeu.zza(xmlPullParser, concat4);
                String zza5 = zzeu.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzfxr.zzm();
                }
                zzfxoVar.zzf(new zzaey(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzeu.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfxoVar.zzi();
    }
}
