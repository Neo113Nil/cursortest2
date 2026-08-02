package p0;

import T.C0096n;
import T.C0097o;
import T.F;
import W.AbstractC0110c;
import W.J;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public C0097o f14703e;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] t4 = J.t(str);
            byte[] bArr2 = AbstractC0110c.f3295a;
            if (t4.length > 4) {
                int i4 = 0;
                while (true) {
                    byte[] bArr3 = AbstractC0110c.f3295a;
                    if (i4 >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i5 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i5));
                            i5 += 4;
                            int length = t4.length - 4;
                            while (true) {
                                if (i5 > length) {
                                    i5 = -1;
                                    break;
                                }
                                if (t4.length - i5 > 4) {
                                    int i6 = 0;
                                    while (true) {
                                        byte[] bArr4 = AbstractC0110c.f3295a;
                                        if (i6 >= 4) {
                                            break;
                                        }
                                        if (t4[i5 + i6] != bArr4[i6]) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                i5++;
                            }
                        } while (i5 != -1);
                        byte[][] bArr5 = new byte[arrayList2.size()][];
                        int i7 = 0;
                        while (i7 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i7)).intValue();
                            int intValue2 = (i7 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i7 + 1)).intValue() : t4.length) - intValue;
                            byte[] bArr6 = new byte[intValue2];
                            System.arraycopy(t4, intValue, bArr6, 0, intValue2);
                            bArr5[i7] = bArr6;
                            i7++;
                        }
                        bArr = bArr5;
                    } else {
                        if (t4[i4] != bArr3[i4]) {
                            break;
                        }
                        i4++;
                    }
                }
                if (bArr != null) {
                    arrayList.add(t4);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArr);
            }
            bArr = null;
            if (bArr != null) {
            }
        }
        return arrayList;
    }

    @Override // p0.d
    public final Object b() {
        return this.f14703e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // p0.d
    public final void j(XmlPullParser xmlPullParser) {
        int i4;
        C0096n c0096n = new C0096n();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new E0.d("FourCC", 1);
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((Integer) c("Type")).intValue();
        if (intValue == 2) {
            ArrayList m4 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            c0096n.f2830l = F.n("video/mp4");
            c0096n.f2836t = d.i(xmlPullParser, "MaxWidth");
            c0096n.f2837u = d.i(xmlPullParser, "MaxHeight");
            c0096n.f2832p = m4;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int i5 = d.i(xmlPullParser, "Channels");
            int i6 = d.i(xmlPullParser, "SamplingRate");
            ArrayList m5 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = m5.isEmpty();
            ArrayList arrayList = m5;
            if (isEmpty) {
                arrayList = m5;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = Collections.singletonList(AbstractC1569a.a(i6, i5));
                }
            }
            c0096n.f2830l = F.n("audio/mp4");
            c0096n.f2810E = i5;
            c0096n.f2811F = i6;
            c0096n.f2832p = arrayList;
        } else if (intValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i4 = 64;
                } else if (str2.equals("DESC")) {
                    i4 = 1024;
                }
                c0096n.f2830l = F.n("application/mp4");
                c0096n.f2824f = i4;
            }
            i4 = 0;
            c0096n.f2830l = F.n("application/mp4");
            c0096n.f2824f = i4;
        } else {
            c0096n.f2830l = F.n("application/mp4");
        }
        c0096n.f2819a = xmlPullParser.getAttributeValue(null, "Index");
        c0096n.f2820b = (String) c("Name");
        c0096n.f2831m = F.n(str);
        c0096n.f2826h = d.i(xmlPullParser, "Bitrate");
        c0096n.f2822d = (String) c("Language");
        this.f14703e = new C0097o(c0096n);
    }
}
