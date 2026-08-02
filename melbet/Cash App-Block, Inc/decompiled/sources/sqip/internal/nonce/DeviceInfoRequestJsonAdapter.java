package sqip.internal.nonce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lsqip/internal/nonce/DeviceInfoRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/DeviceInfoRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "floatAdapter", "", "intAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeviceInfoRequestJsonAdapter extends JsonAdapter {
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter floatAdapter;
    private final JsonAdapter intAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public DeviceInfoRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("s0", "s1", "s2", "s3", "s4", "s6", "s7", "s8", "s9", "s10", "s12", "s13", "s14", "s15", "s16", "s17", "s18", "s19", "s20");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "s0");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "s1");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "s8");
        this.floatAdapter = moshi.adapter(Float.TYPE, emptySet, "s13");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DeviceInfoRequest fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num3 = null;
        Boolean bool3 = null;
        Float f = null;
        Boolean bool4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            Boolean bool5 = bool;
            Boolean bool6 = bool2;
            String str12 = str;
            Integer num4 = num;
            Integer num5 = num2;
            String str13 = str2;
            String str14 = str3;
            String str15 = str4;
            String str16 = str5;
            Integer num6 = num3;
            Boolean bool7 = bool3;
            Float f2 = f;
            Boolean bool8 = bool4;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str12 == null) {
                    throw Util.missingProperty("s0", "s0", reader);
                }
                if (bool5 == null) {
                    throw Util.missingProperty("s1", "s1", reader);
                }
                boolean booleanValue = bool5.booleanValue();
                if (bool6 == null) {
                    throw Util.missingProperty("s2", "s2", reader);
                }
                boolean booleanValue2 = bool6.booleanValue();
                if (str13 == null) {
                    throw Util.missingProperty("s3", "s3", reader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("s4", "s4", reader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("s6", "s6", reader);
                }
                if (str16 == null) {
                    throw Util.missingProperty("s7", "s7", reader);
                }
                if (num4 == null) {
                    throw Util.missingProperty("s8", "s8", reader);
                }
                int intValue = num4.intValue();
                if (num5 == null) {
                    throw Util.missingProperty("s9", "s9", reader);
                }
                int intValue2 = num5.intValue();
                if (num6 == null) {
                    throw Util.missingProperty("s10", "s10", reader);
                }
                int intValue3 = num6.intValue();
                if (bool7 == null) {
                    throw Util.missingProperty("s12", "s12", reader);
                }
                boolean booleanValue3 = bool7.booleanValue();
                if (f2 == null) {
                    throw Util.missingProperty("s13", "s13", reader);
                }
                float floatValue = f2.floatValue();
                if (str6 == null) {
                    throw Util.missingProperty("s14", "s14", reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("s15", "s15", reader);
                }
                if (bool8 == null) {
                    throw Util.missingProperty("s16", "s16", reader);
                }
                boolean booleanValue4 = bool8.booleanValue();
                if (str8 == null) {
                    throw Util.missingProperty("s17", "s17", reader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("s18", "s18", reader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("s19", "s19", reader);
                }
                if (str11 != null) {
                    return new DeviceInfoRequest(str12, booleanValue, booleanValue2, str13, str14, str15, str16, intValue, intValue2, intValue3, booleanValue3, floatValue, str6, str7, booleanValue4, str8, str9, str10, str11);
                }
                throw Util.missingProperty("s20", "s20", reader);
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("s0", "s0", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 1:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw Util.unexpectedNull("s1", "s1", reader);
                    }
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 2:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("s2", "s2", reader);
                    }
                    bool = bool5;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("s3", "s3", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("s4", "s4", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 5:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("s6", "s6", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 6:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("s7", "s7", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 7:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Util.unexpectedNull("s8", "s8", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 8:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("s9", "s9", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 9:
                    Integer num7 = (Integer) this.intAdapter.fromJson(reader);
                    if (num7 == null) {
                        throw Util.unexpectedNull("s10", "s10", reader);
                    }
                    num3 = num7;
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 10:
                    Boolean bool9 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool9 == null) {
                        throw Util.unexpectedNull("s12", "s12", reader);
                    }
                    bool3 = bool9;
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    f = f2;
                    bool4 = bool8;
                case 11:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 == null) {
                        throw Util.unexpectedNull("s13", "s13", reader);
                    }
                    f = f3;
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    bool4 = bool8;
                case 12:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("s14", "s14", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 13:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("s15", "s15", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 14:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("s16", "s16", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                case 15:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("s17", "s17", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 16:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("s18", "s18", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 17:
                    str10 = (String) this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw Util.unexpectedNull("s19", "s19", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                case 18:
                    str11 = (String) this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        throw Util.unexpectedNull("s20", "s20", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
                default:
                    bool = bool5;
                    bool2 = bool6;
                    str = str12;
                    num = num4;
                    num2 = num5;
                    str2 = str13;
                    str3 = str14;
                    str4 = str15;
                    str5 = str16;
                    num3 = num6;
                    bool3 = bool7;
                    f = f2;
                    bool4 = bool8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, DeviceInfoRequest value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("s0");
        this.stringAdapter.toJson(writer, value_.getS0());
        writer.name("s1");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getS1()));
        writer.name("s2");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getS2()));
        writer.name("s3");
        this.stringAdapter.toJson(writer, value_.getS3());
        writer.name("s4");
        this.stringAdapter.toJson(writer, value_.getS4());
        writer.name("s6");
        this.stringAdapter.toJson(writer, value_.getS6());
        writer.name("s7");
        this.stringAdapter.toJson(writer, value_.getS7());
        writer.name("s8");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getS8()));
        writer.name("s9");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getS9()));
        writer.name("s10");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getS10()));
        writer.name("s12");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getS12()));
        writer.name("s13");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getS13()));
        writer.name("s14");
        this.stringAdapter.toJson(writer, value_.getS14());
        writer.name("s15");
        this.stringAdapter.toJson(writer, value_.getS15());
        writer.name("s16");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getS16()));
        writer.name("s17");
        this.stringAdapter.toJson(writer, value_.getS17());
        writer.name("s18");
        this.stringAdapter.toJson(writer, value_.getS18());
        writer.name("s19");
        this.stringAdapter.toJson(writer, value_.getS19());
        writer.name("s20");
        this.stringAdapter.toJson(writer, value_.getS20());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(DeviceInfoRequest)");
    }
}
