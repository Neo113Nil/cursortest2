package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class s {
    private static final JsonReader.a POINT_NAMES = JsonReader.a.of("x", "y");

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF jsonArrayToPoint(JsonReader jsonReader, float f8) {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f8, nextDouble2 * f8);
    }

    private static PointF jsonNumbersToPoint(JsonReader jsonReader, float f8) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f8, nextDouble2 * f8);
    }

    private static PointF jsonObjectToPoint(JsonReader jsonReader, float f8) {
        jsonReader.beginObject();
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(POINT_NAMES);
            if (selectName == 0) {
                f9 = valueFromObject(jsonReader);
            } else if (selectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                f10 = valueFromObject(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f9 * f8, f10 * f8);
    }

    @ColorInt
    static int jsonToColor(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static PointF jsonToPoint(JsonReader jsonReader, float f8) {
        int i8 = a.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[jsonReader.peek().ordinal()];
        if (i8 == 1) {
            return jsonNumbersToPoint(jsonReader, f8);
        }
        if (i8 == 2) {
            return jsonArrayToPoint(jsonReader, f8);
        }
        if (i8 == 3) {
            return jsonObjectToPoint(jsonReader, f8);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    static List<PointF> jsonToPoints(JsonReader jsonReader, float f8) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(jsonToPoint(jsonReader, f8));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    static float valueFromObject(JsonReader jsonReader) {
        JsonReader.Token peek = jsonReader.peek();
        int i8 = a.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[peek.ordinal()];
        if (i8 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i8 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + peek);
        }
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return nextDouble;
    }
}
