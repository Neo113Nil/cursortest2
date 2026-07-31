package com.bytedance.adsdk.fs.btk;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.fs.iv;
import com.bytedance.adsdk.fs.nps;
import com.bytedance.adsdk.fs.zn.zn.btk;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class nqi {
    public static com.bytedance.adsdk.fs.nps zmn(JsonReader jsonReader) throws IOException {
        float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn();
        LongSparseArray<com.bytedance.adsdk.fs.zn.zn.btk> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.fs.zn.fb> sparseArray = new SparseArray<>();
        nps.zn znVar = new nps.zn();
        nps.zmn zmnVar = new nps.zmn();
        nps.fs fsVar = new nps.fs();
        com.bytedance.adsdk.fs.nps npsVar = new com.bytedance.adsdk.fs.nps();
        jsonReader.beginObject();
        int i = 0;
        int i2 = 0;
        String str = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "assets":
                    zmn(jsonReader, npsVar, hashMap, hashMap2);
                    continue;
                case "layers":
                    zmn(jsonReader, npsVar, arrayList, longSparseArray);
                    continue;
                case "globalEvent":
                    zmn(jsonReader, fsVar);
                    continue;
                case "h":
                    i2 = jsonReader.nextInt();
                    continue;
                case "v":
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.fs.hhw.hhw.zmn(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        npsVar.zmn("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    } else {
                        continue;
                    }
                case "w":
                    i = jsonReader.nextInt();
                    continue;
                case "dl":
                    str = jsonReader.nextString();
                    continue;
                case "fr":
                    f3 = (float) jsonReader.nextDouble();
                    continue;
                case "gc":
                    zmn(jsonReader, zmnVar);
                    break;
                case "ip":
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case "op":
                    f = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                case "chars":
                    zmn(jsonReader, npsVar, sparseArray);
                    break;
                case "fonts":
                    zmn(jsonReader, hashMap3);
                    break;
                case "timer":
                    zmn(jsonReader, znVar);
                    break;
                case "markers":
                    zmn(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        npsVar.zmn(new Rect(0, 0, (int) (i * zmn), (int) (i2 * zmn)), f2, f, f3, arrayList, longSparseArray, hashMap, hashMap2, sparseArray, hashMap3, arrayList2, znVar, str, zmnVar, fsVar);
        return npsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zmn(JsonReader jsonReader, nps.fs fsVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3239) {
                    if (nextName.equals("el")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 107027) {
                    if (hashCode == 3237004 && nextName.equals("inel")) {
                        c = 0;
                        if (c != 0) {
                            fsVar.fs = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        fsVar.fs[0][i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else if (c == 1) {
                            fsVar.zmn = jsonReader.nextString();
                        } else if (c == 2) {
                            fsVar.zn = zn(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (nextName.equals("lel")) {
                        c = 2;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zmn(JsonReader jsonReader, nps.zmn zmnVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3139) {
                    if (nextName.equals("be")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode == 3232) {
                    if (nextName.equals("ee")) {
                        c = 2;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode == 3571) {
                    if (nextName.equals("pc")) {
                        c = 3;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 3666) {
                    if (hashCode == 98713 && nextName.equals("cpf")) {
                        c = 4;
                        if (c != 0) {
                            zmnVar.zmn = jsonReader.nextInt();
                        } else if (c == 1) {
                            zmnVar.fs = fs(jsonReader);
                        } else if (c == 2) {
                            zmnVar.zn = fs(jsonReader);
                        } else if (c == 3) {
                            zmnVar.fb = jsonReader.nextInt();
                        } else if (c == 4) {
                            fs(jsonReader, zmnVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (nextName.equals("se")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void fs(JsonReader jsonReader, nps.zmn zmnVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3239) {
                    if (nextName.equals("el")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 3276) {
                    if (hashCode == 107027 && nextName.equals("lel")) {
                        c = 2;
                        if (c != 0) {
                            zmnVar.btk = jsonReader.nextInt();
                        } else if (c == 1) {
                            zmnVar.hhw = jsonReader.nextString();
                        } else if (c == 2) {
                            zmnVar.nps = zn(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (nextName.equals("fr")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static Map<String, Object> fs(JsonReader jsonReader) throws IOException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("lel")) {
                hashMap.put("lel", zn(jsonReader));
            } else if (nextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                hashMap.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    if (nextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object remove = hashMap.remove("lottie_back");
        if (remove instanceof JSONObject) {
            Object obj = hashMap.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(remove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(remove);
                hashMap.put("lel", jSONArray);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zmn(JsonReader jsonReader, nps.zn znVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3123) {
                    if (nextName.equals(POBConstants.KEY_AT)) {
                        c = 3;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3239) {
                    if (nextName.equals("el")) {
                        c = 5;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3355) {
                    if (nextName.equals("id")) {
                        c = 1;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3418) {
                    if (nextName.equals("ke")) {
                        c = 0;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3704) {
                    if (nextName.equals("tl")) {
                        c = 2;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode != 107027) {
                    if (hashCode == 3237004 && nextName.equals("inel")) {
                        c = 4;
                        switch (c) {
                            case 0:
                                znVar.zmn = jsonReader.nextInt();
                                break;
                            case 1:
                                znVar.fs = jsonReader.nextString();
                                break;
                            case 2:
                                znVar.zn = jsonReader.nextString();
                                break;
                            case 3:
                                znVar.fb = jsonReader.nextString();
                                break;
                            case 4:
                                znVar.btk = new int[]{-1, -1};
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        znVar.btk[i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                                break;
                            case 5:
                                znVar.hhw = jsonReader.nextString();
                                break;
                            case 6:
                                znVar.nps = zn(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else {
                    if (nextName.equals("lel")) {
                        c = 6;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, List<com.bytedance.adsdk.fs.zn.zn.btk> list, LongSparseArray<com.bytedance.adsdk.fs.zn.zn.btk> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.fs.zn.zn.btk zmn = doe.zmn(jsonReader, npsVar);
            zmn.rc();
            btk.zmn zmnVar = btk.zmn.PRE_COMP;
            list.add(zmn);
            longSparseArray.put(zmn.btk(), zmn);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, Map<String, List<com.bytedance.adsdk.fs.zn.zn.btk>> map, Map<String, com.bytedance.adsdk.fs.iv> map2) throws IOException {
        int i;
        int i2 = 2;
        int i3 = -1;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int i4 = 0;
            int i5 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List<iv.zmn> list = null;
            String str5 = null;
            int[][] iArr = null;
            JSONArray jSONArray = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName.hashCode()) {
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            i = 0;
                            break;
                        }
                        i = i3;
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            i = 1;
                            break;
                        }
                        i = i3;
                        break;
                    case 112:
                        if (nextName.equals("p")) {
                            i = i2;
                            break;
                        }
                        i = i3;
                        break;
                    case ASSET_FAILED_STATUS_CODE_VALUE:
                        if (nextName.equals("u")) {
                            i = 3;
                            break;
                        }
                        i = i3;
                        break;
                    case JSON_ENCODE_ERROR_VALUE:
                        if (nextName.equals("w")) {
                            i = 4;
                            break;
                        }
                        i = i3;
                        break;
                    case 3239:
                        if (nextName.equals("el")) {
                            i = 5;
                            break;
                        }
                        i = i3;
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            i = 6;
                            break;
                        }
                        i = i3;
                        break;
                    case 3695:
                        if (nextName.equals("tc")) {
                            i = 7;
                            break;
                        }
                        i = i3;
                        break;
                    case 107027:
                        if (nextName.equals("lel")) {
                            i = 8;
                            break;
                        }
                        i = i3;
                        break;
                    case 112793:
                        if (nextName.equals("rel")) {
                            i = 9;
                            break;
                        }
                        i = i3;
                        break;
                    case 3237004:
                        if (nextName.equals("inel")) {
                            i = 10;
                            break;
                        }
                        i = i3;
                        break;
                    default:
                        i = i3;
                        break;
                }
                switch (i) {
                    case 0:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.fs.zn.zn.btk zmn = doe.zmn(jsonReader, npsVar);
                            longSparseArray.put(zmn.btk(), zmn);
                            arrayList.add(zmn);
                        }
                        jsonReader.endArray();
                        i2 = 2;
                        i3 = -1;
                        break;
                    case 1:
                        i5 = jsonReader.nextInt();
                        break;
                    case 2:
                        str2 = jsonReader.nextString();
                        break;
                    case 3:
                        str3 = jsonReader.nextString();
                        break;
                    case 4:
                        i4 = jsonReader.nextInt();
                        break;
                    case 5:
                        str5 = jsonReader.nextString();
                        break;
                    case 6:
                        str = jsonReader.nextString();
                        break;
                    case 7:
                        jsonReader.beginArray();
                        list = fb(jsonReader);
                        jsonReader.endArray();
                        break;
                    case 8:
                        jSONArray = zn(jsonReader);
                        break;
                    case 9:
                        str4 = jsonReader.nextString();
                        break;
                    case 10:
                        int[][] iArr2 = {new int[]{i3, i3}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i6 = 0; i6 < i2; i6++) {
                                if (jsonReader.hasNext()) {
                                    iArr2[0][i6] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        iArr = iArr2;
                        break;
                    default:
                        jsonReader.skipValue();
                        i2 = 2;
                        i3 = -1;
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.bytedance.adsdk.fs.iv ivVar = new com.bytedance.adsdk.fs.iv(i4, i5, str, str2, str3, str4, list, str5, iArr, jSONArray);
                map2.put(ivVar.zg(), ivVar);
            } else {
                map.put(str, arrayList);
            }
            i2 = 2;
            i3 = -1;
        }
        jsonReader.endArray();
    }

    private static JSONArray zn(JsonReader jsonReader) {
        char c;
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3324) {
                        if (hashCode == 116753 && nextName.equals("vid")) {
                            c = 0;
                        }
                        c = 65535;
                    } else {
                        if (nextName.equals("hd")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        jSONObject.put("vid", jsonReader.nextString());
                    } else if (c == 1) {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<iv.zmn> fb(JsonReader jsonReader) {
        char c;
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                iv.zmn zmnVar = new iv.zmn();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode == 99) {
                        if (nextName.equals("c")) {
                            c = 3;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 102) {
                        if (nextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                            c = 4;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 108) {
                        if (nextName.equals("l")) {
                            c = 0;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 115) {
                        if (nextName.equals("s")) {
                            c = 2;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 3153) {
                        if (nextName.equals("bs")) {
                            c = 5;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode != 3449) {
                        if (hashCode == 96670 && nextName.equals("ali")) {
                            c = 6;
                            switch (c) {
                                case 0:
                                    zmnVar.zmn = jsonReader.nextInt();
                                    break;
                                case 1:
                                    zmnVar.fs = jsonReader.nextInt();
                                    break;
                                case 2:
                                    zmnVar.btk = jsonReader.nextInt();
                                    break;
                                case 3:
                                    zmnVar.zn = jsonReader.nextString();
                                    break;
                                case 4:
                                    zmnVar.fb = jsonReader.nextString();
                                    break;
                                case 5:
                                    zmnVar.hhw = jsonReader.nextInt();
                                    break;
                                case 6:
                                    zmnVar.nps = jsonReader.nextString();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else {
                        if (nextName.equals("le")) {
                            c = 1;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    }
                }
                jsonReader.endObject();
                arrayList.add(zmnVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void zmn(JsonReader jsonReader, Map<String, com.bytedance.adsdk.fs.zn.zn> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.fs.zn.zn zmn = rt.zmn(jsonReader);
                    map.put(zmn.fs(), zmn);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, SparseArray<com.bytedance.adsdk.fs.zn.fb> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.fs.zn.fb zmn = mw.zmn(jsonReader, npsVar);
            sparseArray.put(zmn.hashCode(), zmn);
        }
        jsonReader.endArray();
    }

    private static void zmn(JsonReader jsonReader, List<com.bytedance.adsdk.fs.zn.hhw> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "cm":
                        str = jsonReader.nextString();
                        break;
                    case "dr":
                        f2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        f = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.fs.zn.hhw(str, f, f2));
        }
        jsonReader.endArray();
    }
}
