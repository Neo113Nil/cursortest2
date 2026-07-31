package com.bytedance.adsdk.fs.btk;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.zn.btk;
import com.mbridge.msdk.foundation.entity.b;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes11.dex */
public class doe {
    public static com.bytedance.adsdk.fs.zn.zn.btk zmn(com.bytedance.adsdk.fs.nps npsVar) {
        Rect fb = npsVar.fb();
        return new com.bytedance.adsdk.fs.zn.zn.btk(Collections.emptyList(), npsVar, "__container", -1L, btk.zmn.PRE_COMP, -1L, null, Collections.emptyList(), new com.bytedance.adsdk.fs.zn.zmn.klz(), 0, 0, 0, 0.0f, 0.0f, fb.width(), fb.height(), null, null, Collections.emptyList(), btk.fs.NONE, null, false, null, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.fs.zn.zn.btk zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        ArrayList arrayList;
        String str;
        int i = 2;
        int i2 = 1;
        btk.fs fsVar = btk.fs.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        long j = 0;
        boolean z = false;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        btk.fs fsVar2 = fsVar;
        com.bytedance.adsdk.fs.zn.zmn.klz klzVar = null;
        com.bytedance.adsdk.fs.zn.zmn.iv ivVar = null;
        com.bytedance.adsdk.fs.zn.zmn.rc rcVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar3 = null;
        com.bytedance.adsdk.fs.zn.fs.zmn zmnVar = null;
        iv ivVar2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        long j2 = -1;
        float f5 = 1.0f;
        btk.zmn zmnVar2 = null;
        String str2 = null;
        float f6 = 0.0f;
        String str3 = "UNSET";
        String str4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i6 = -1;
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        i6 = z ? 1 : 0;
                        break;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        i6 = i2;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        i6 = i;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        i6 = 3;
                        break;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    if (nextName.equals("w")) {
                        i6 = 4;
                        break;
                    }
                    break;
                case 3177:
                    if (nextName.equals("cl")) {
                        i6 = 5;
                        break;
                    }
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        i6 = 6;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        i6 = 7;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals(POBConstants.KEY_IP)) {
                        i6 = 8;
                        break;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        i6 = 9;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        i6 = 10;
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        i6 = 11;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        i6 = 12;
                        break;
                    }
                    break;
                case 3669:
                    if (nextName.equals(b.JSON_KEY_SH)) {
                        i6 = 13;
                        break;
                    }
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        i6 = 14;
                        break;
                    }
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        i6 = 15;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        i6 = 16;
                        break;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        i6 = 17;
                        break;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        i6 = 18;
                        break;
                    }
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        i6 = 19;
                        break;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        i6 = 20;
                        break;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        i6 = 21;
                        break;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        i6 = 22;
                        break;
                    }
                    break;
            }
            switch (i6) {
                case 0:
                    j2 = jsonReader.nextInt();
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.fs.zn.fs.zn zmn = zg.zmn(jsonReader, npsVar);
                        if (zmn != null) {
                            arrayList3.add(zmn);
                        }
                    }
                    jsonReader.endArray();
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
                case 2:
                    f3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.fs.hhw.hhw.zmn());
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                rcVar = fs.zmn(jsonReader, npsVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (nextName2.equals("d")) {
                            ivVar = fb.hhw(jsonReader, npsVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
                case 4:
                    f2 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.fs.hhw.hhw.zmn());
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
                case 5:
                    str4 = jsonReader.nextString();
                    i = 2;
                    i2 = 1;
                    break;
                case 6:
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (!nextName3.equals("nm")) {
                                if (nextName3.equals("ty")) {
                                    int nextInt = jsonReader.nextInt();
                                    if (nextInt == 29) {
                                        zmnVar = btk.zmn(jsonReader, npsVar);
                                    } else if (nextInt == 25) {
                                        ivVar2 = new rc().zmn(jsonReader, npsVar);
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else {
                                arrayList4.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    npsVar.zmn("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList4)));
                    i = 2;
                    i2 = 1;
                    break;
                case 7:
                    z2 = jsonReader.nextBoolean();
                    i = 2;
                    i2 = 1;
                    break;
                case 8:
                    f6 = (float) jsonReader.nextDouble();
                    i = 2;
                    i2 = 1;
                    break;
                case 9:
                    klzVar = zn.zmn(jsonReader, npsVar);
                    i = 2;
                    i2 = 1;
                    break;
                case 10:
                    str3 = jsonReader.nextString();
                    i = 2;
                    i2 = 1;
                    break;
                case 11:
                    f4 = (float) jsonReader.nextDouble();
                    i = 2;
                    i2 = 1;
                    break;
                case 12:
                    i5 = Color.parseColor(jsonReader.nextString());
                    i = 2;
                    i2 = 1;
                    break;
                case 13:
                    i4 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.fs.hhw.hhw.zmn());
                    i = 2;
                    i2 = 1;
                    break;
                case 14:
                    f5 = (float) jsonReader.nextDouble();
                    i = 2;
                    i2 = 1;
                    break;
                case 15:
                    f = (float) jsonReader.nextDouble();
                    i = 2;
                    i2 = 1;
                    break;
                case 16:
                    i3 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.fs.hhw.hhw.zmn());
                    break;
                case 17:
                    fsVar3 = fb.zmn(jsonReader, npsVar, z);
                    break;
                case 18:
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= btk.fs.values().length) {
                        npsVar.zmn("Unsupported matte type: ".concat(String.valueOf(nextInt2)));
                        i = 2;
                        i2 = 1;
                        z = false;
                        break;
                    } else {
                        fsVar2 = btk.fs.values()[nextInt2];
                        int i7 = AnonymousClass1.zmn[fsVar2.ordinal()];
                        if (i7 == i2) {
                            npsVar.zmn("Unsupported matte type: Luma");
                        } else if (i7 == i) {
                            npsVar.zmn("Unsupported matte type: Luma Inverted");
                        }
                        npsVar.zmn(i2);
                        break;
                    }
                case 19:
                    int nextInt3 = jsonReader.nextInt();
                    zmnVar2 = btk.zmn.UNKNOWN;
                    if (nextInt3 >= zmnVar2.ordinal()) {
                        break;
                    } else {
                        zmnVar2 = btk.zmn.values()[nextInt3];
                        break;
                    }
                case 20:
                    j = jsonReader.nextInt();
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(uqh.zmn(jsonReader, npsVar));
                    }
                    npsVar.zmn(arrayList2.size());
                    jsonReader.endArray();
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
                default:
                    jsonReader.skipValue();
                    i = 2;
                    i2 = 1;
                    z = false;
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList2;
            str = str4;
            arrayList5.add(new com.bytedance.adsdk.fs.nps.zmn(npsVar, valueOf, valueOf, null, 0.0f, Float.valueOf(f6)));
        } else {
            arrayList = arrayList2;
            str = str4;
        }
        if (f4 <= 0.0f) {
            f4 = npsVar.nps();
        }
        arrayList5.add(new com.bytedance.adsdk.fs.nps.zmn(npsVar, valueOf2, valueOf2, null, f6, Float.valueOf(f4)));
        arrayList5.add(new com.bytedance.adsdk.fs.nps.zmn(npsVar, valueOf, valueOf, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str)) {
            npsVar.zmn("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.fs.zn.zn.btk(arrayList3, npsVar, str3, j, zmnVar2, j2, str2, arrayList, klzVar, i3, i4, i5, f5, f, f2, f3, ivVar, rcVar, arrayList5, fsVar2, fsVar3, z2, zmnVar, ivVar2);
    }

    /* renamed from: com.bytedance.adsdk.fs.btk.doe$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[btk.fs.values().length];
            zmn = iArr;
            try {
                iArr[btk.fs.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[btk.fs.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
