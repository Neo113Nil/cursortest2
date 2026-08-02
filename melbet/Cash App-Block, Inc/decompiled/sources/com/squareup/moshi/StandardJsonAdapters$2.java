package com.squareup.moshi;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.storage.StorageLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class StandardJsonAdapters$2 extends JsonAdapter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StandardJsonAdapters$2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 1:
                jsonReader.getClass();
                jsonReader.beginObject();
                String nextName = jsonReader.nextName();
                if (!Intrinsics.areEqual(nextName, "type")) {
                    a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("expected type, was: ", nextName));
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (Intrinsics.areEqual(nextString, "legacy")) {
                    jsonReader.endObject();
                    return StorageLink.Legacy.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("expected legacy, was: ", nextString));
                return null;
            case 2:
                return jsonReader.nextString();
            case 3:
                return Byte.valueOf((byte) Types.rangeCheckNextInt(jsonReader, "a byte", -128, 255));
            case 4:
                String nextString2 = jsonReader.nextString();
                if (nextString2.length() <= 1) {
                    return Character.valueOf(nextString2.charAt(0));
                }
                throw new JsonDataException(CameraSelector$$ExternalSyntheticOutline0.m("Expected a char but was ", JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\"', "\"", nextString2), " at path ", jsonReader.getPath()));
            case 5:
                return Double.valueOf(jsonReader.nextDouble());
            case 6:
                float nextDouble = (float) jsonReader.nextDouble();
                if (jsonReader.lenient || !Float.isInfinite(nextDouble)) {
                    return Float.valueOf(nextDouble);
                }
                throw new JsonDataException("JSON forbids NaN and infinities: " + nextDouble + " at path " + jsonReader.getPath());
            case 7:
                return Integer.valueOf(jsonReader.nextInt());
            case 8:
                return Long.valueOf(jsonReader.nextLong());
            default:
                return Short.valueOf((short) Types.rangeCheckNextInt(jsonReader, "a short", -32768, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE));
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                jsonWriter.value(((Boolean) obj).booleanValue());
                break;
            case 1:
                jsonWriter.getClass();
                break;
            case 2:
                jsonWriter.value((String) obj);
                break;
            case 3:
                jsonWriter.value(((Byte) obj).intValue() & 255);
                break;
            case 4:
                jsonWriter.value(((Character) obj).toString());
                break;
            case 5:
                jsonWriter.value(((Double) obj).doubleValue());
                break;
            case 6:
                Float f = (Float) obj;
                f.getClass();
                jsonWriter.value(f);
                break;
            case 7:
                jsonWriter.value(((Integer) obj).intValue());
                break;
            case 8:
                jsonWriter.value(((Long) obj).longValue());
                break;
            default:
                jsonWriter.value(((Short) obj).intValue());
                break;
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "JsonAdapter(Boolean)";
            case 1:
            default:
                return super.toString();
            case 2:
                return "JsonAdapter(String)";
            case 3:
                return "JsonAdapter(Byte)";
            case 4:
                return "JsonAdapter(Character)";
            case 5:
                return "JsonAdapter(Double)";
            case 6:
                return "JsonAdapter(Float)";
            case 7:
                return "JsonAdapter(Integer)";
            case 8:
                return "JsonAdapter(Long)";
            case 9:
                return "JsonAdapter(Short)";
        }
    }
}
