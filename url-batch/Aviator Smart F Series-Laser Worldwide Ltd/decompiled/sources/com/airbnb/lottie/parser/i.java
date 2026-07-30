package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.platform.comapi.map.MapBundleKey;

/* loaded from: classes.dex */
public class i implements n0 {
    public static final i INSTANCE = new i();
    private static final JsonReader.a NAMES = JsonReader.a.of("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", MapBundleKey.MapObjKey.OBJ_OFFSET);

    private i() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public DocumentData parse(JsonReader jsonReader, float f8) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f9 = 0.0f;
        int i8 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        float f12 = 0.0f;
        boolean z7 = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    f9 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    justification2 = DocumentData.Justification.CENTER;
                    if (nextInt <= justification2.ordinal() && nextInt >= 0) {
                        justification2 = DocumentData.Justification.values()[nextInt];
                        break;
                    }
                    break;
                case 4:
                    i8 = jsonReader.nextInt();
                    break;
                case 5:
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    i9 = s.jsonToColor(jsonReader);
                    break;
                case 8:
                    i10 = s.jsonToColor(jsonReader);
                    break;
                case 9:
                    f12 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z7 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new DocumentData(str, str2, f9, justification2, i8, f10, f11, i9, i10, f12, z7);
    }
}
