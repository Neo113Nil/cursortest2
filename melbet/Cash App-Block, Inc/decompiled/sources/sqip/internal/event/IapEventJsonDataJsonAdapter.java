package sqip.internal.event;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lsqip/internal/event/IapEventJsonDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/event/IapEventJsonData;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "intAdapter", "", "longAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IapEventJsonDataJsonAdapter extends JsonAdapter {
    private final JsonAdapter booleanAdapter;
    private volatile Constructor<IapEventJsonData> constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter longAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public IapEventJsonDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("sqip_base_square_application_id", "sqip_base_device_locale_country_code", "sqip_base_device_language", "sqip_base_square_device_id", "sqip_base_has_flutter_plugin", "sqip_base_has_flutter", "sqip_base_has_react_native", "sqip_base_has_react_native_plugin", "sqip_base_orientation", "sqip_base_screen_width_pixels", "sqip_base_screen_height_pixels", "sqip_base_time_zone", "sqip_base_is_app_debug_build", "sqip_base_is_sdk_debug_build", "sqip_android_base_app_package_name", "sqip_android_base_app_version_name", "sqip_android_base_app_version_code", "sqip_android_base_target_api_version", "sqip_android_base_min_api_version", "sqip_android_base_screen_density_dpi", "sqip_android_base_apk_byte_size", "sqip_android_base_uses_androidx", "sqip_android_base_process_uuid", "sqip_card_entry_base_name", "sqip_card_entry_base_session_uuid", "sqip_card_entry_base_session_order", "sqip_card_entry_base_theme", "sqip_card_entry_base_validation_error_field", "sqip_card_entry_base_nonce_error_code", "sqip_card_entry_base_app_error_message", "sqip_card_entry_base_flow_type", "sqip_card_entry_base_amount", "sqip_card_entry_base_buyer_action", "sqip_card_entry_base_contact_empty_fields", "sqip_card_entry_base_currency", "sqip_card_entry_base_location_id", "sqip_card_entry_base_challenges_completed_count", "sqip_card_entry_base_challenges_total_count", "sqip_card_entry_base_error_code", "sqip_card_entry_base_error_description", "sqip_card_entry_base_has_challenged_user", "sqip_card_entry_base_verification_duration_in_milliseconds", "sqip_card_entry_base_three_ds_trans_status", "sqip_card_entry_base_challenge_type", "sqip_card_entry_base_verification_token", "sqip_card_entry_base_three_ds_server_trans_id", "sqip_card_entry_base_three_ds_warning_severity", "sqip_card_entry_base_three_ds_warning_code", "sqip_card_entry_base_three_ds_warning_description", "sqip_base_device_model", "sqip_android_base_device_sdk_int", "sqip_android_base_device_manufacturer", "sqip_android_base_device_brand", "u_library_name", "u_library_version");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "sqip_base_square_application_id");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "sqip_base_has_flutter_plugin");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sqip_base_screen_width_pixels");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "sqip_android_base_apk_byte_size");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "sqip_card_entry_base_validation_error_field");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public IapEventJsonData fromJson(JsonReader reader) {
        String str;
        int i;
        reader.getClass();
        reader.beginObject();
        Integer num = 0;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str4 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str5 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str6 = null;
        String str7 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Long l = null;
        Boolean bool7 = null;
        String str8 = null;
        Integer num8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        Integer num9 = null;
        String str14 = null;
        Integer num10 = null;
        Integer num11 = null;
        Boolean bool8 = null;
        Long l2 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        int i2 = -1;
        while (true) {
            String str36 = str2;
            String str37 = str3;
            Boolean bool9 = bool;
            Boolean bool10 = bool2;
            Boolean bool11 = bool3;
            Boolean bool12 = bool4;
            String str38 = str4;
            Integer num12 = num2;
            int i3 = i2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i3 != -16515073) {
                    Constructor<IapEventJsonData> constructor = this.constructorRef;
                    if (constructor == null) {
                        Class cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                        Class cls2 = Long.TYPE;
                        Class cls3 = Boolean.TYPE;
                        Class cls4 = Integer.TYPE;
                        str = "sqip_android_base_apk_byte_size";
                        constructor = IapEventJsonData.class.getDeclaredConstructor(cls2, String.class, String.class, String.class, String.class, cls3, cls3, cls3, cls3, String.class, cls4, cls4, String.class, cls3, cls3, String.class, String.class, cls4, cls4, cls4, cls4, cls2, cls3, String.class, String.class, String.class, cls4, String.class, String.class, String.class, String.class, String.class, cls4, String.class, String.class, String.class, String.class, cls4, cls4, String.class, String.class, cls3, cls2, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls4, String.class, String.class, String.class, String.class, cls4, cls4, cls);
                        this.constructorRef = constructor;
                        constructor.getClass();
                    } else {
                        str = "sqip_android_base_apk_byte_size";
                    }
                    if (str36 == null) {
                        throw Util.missingProperty("sqip_base_square_application_id", "sqip_base_square_application_id", reader);
                    }
                    if (str37 == null) {
                        throw Util.missingProperty("sqip_base_device_locale_country_code", "sqip_base_device_locale_country_code", reader);
                    }
                    if (str21 == null) {
                        throw Util.missingProperty("sqip_base_device_language", "sqip_base_device_language", reader);
                    }
                    if (str22 == null) {
                        throw Util.missingProperty("sqip_base_square_device_id", "sqip_base_square_device_id", reader);
                    }
                    if (bool9 == null) {
                        throw Util.missingProperty("sqip_base_has_flutter_plugin", "sqip_base_has_flutter_plugin", reader);
                    }
                    if (bool10 == null) {
                        throw Util.missingProperty("sqip_base_has_flutter", "sqip_base_has_flutter", reader);
                    }
                    if (bool11 == null) {
                        throw Util.missingProperty("sqip_base_has_react_native", "sqip_base_has_react_native", reader);
                    }
                    if (bool12 == null) {
                        throw Util.missingProperty("sqip_base_has_react_native_plugin", "sqip_base_has_react_native_plugin", reader);
                    }
                    if (str38 == null) {
                        throw Util.missingProperty("sqip_base_orientation", "sqip_base_orientation", reader);
                    }
                    if (num12 == null) {
                        throw Util.missingProperty("sqip_base_screen_width_pixels", "sqip_base_screen_width_pixels", reader);
                    }
                    if (num3 == null) {
                        throw Util.missingProperty("sqip_base_screen_height_pixels", "sqip_base_screen_height_pixels", reader);
                    }
                    if (str5 == null) {
                        throw Util.missingProperty("sqip_base_time_zone", "sqip_base_time_zone", reader);
                    }
                    if (bool5 == null) {
                        throw Util.missingProperty("sqip_base_is_app_debug_build", "sqip_base_is_app_debug_build", reader);
                    }
                    if (bool6 == null) {
                        throw Util.missingProperty("sqip_base_is_sdk_debug_build", "sqip_base_is_sdk_debug_build", reader);
                    }
                    if (str6 == null) {
                        throw Util.missingProperty("sqip_android_base_app_package_name", "sqip_android_base_app_package_name", reader);
                    }
                    if (str7 == null) {
                        throw Util.missingProperty("sqip_android_base_app_version_name", "sqip_android_base_app_version_name", reader);
                    }
                    if (num4 == null) {
                        throw Util.missingProperty("sqip_android_base_app_version_code", "sqip_android_base_app_version_code", reader);
                    }
                    if (num5 == null) {
                        throw Util.missingProperty("sqip_android_base_target_api_version", "sqip_android_base_target_api_version", reader);
                    }
                    if (num6 == null) {
                        throw Util.missingProperty("sqip_android_base_min_api_version", "sqip_android_base_min_api_version", reader);
                    }
                    if (num7 == null) {
                        throw Util.missingProperty("sqip_android_base_screen_density_dpi", "sqip_android_base_screen_density_dpi", reader);
                    }
                    if (l == null) {
                        String str39 = str;
                        throw Util.missingProperty(str39, str39, reader);
                    }
                    if (bool7 == null) {
                        throw Util.missingProperty("sqip_android_base_uses_androidx", "sqip_android_base_uses_androidx", reader);
                    }
                    if (str23 == null) {
                        throw Util.missingProperty("sqip_android_base_process_uuid", "sqip_android_base_process_uuid", reader);
                    }
                    if (str24 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_name", "sqip_card_entry_base_name", reader);
                    }
                    if (str8 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_session_uuid", "sqip_card_entry_base_session_uuid", reader);
                    }
                    if (num8 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_session_order", "sqip_card_entry_base_session_order", reader);
                    }
                    if (str9 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_theme", "sqip_card_entry_base_theme", reader);
                    }
                    if (str13 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_flow_type", "sqip_card_entry_base_flow_type", reader);
                    }
                    if (num9 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_amount", "sqip_card_entry_base_amount", reader);
                    }
                    if (num10 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_challenges_completed_count", "sqip_card_entry_base_challenges_completed_count", reader);
                    }
                    if (num11 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_challenges_total_count", "sqip_card_entry_base_challenges_total_count", reader);
                    }
                    if (bool8 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_has_challenged_user", "sqip_card_entry_base_has_challenged_user", reader);
                    }
                    if (l2 == null) {
                        throw Util.missingProperty("sqip_card_entry_base_verification_duration_in_milliseconds", "sqip_card_entry_base_verification_duration_in_milliseconds", reader);
                    }
                    IapEventJsonData newInstance = constructor.newInstance(0L, str36, str37, str21, str22, bool9, bool10, bool11, bool12, str38, num12, num3, str5, bool5, bool6, str6, str7, num4, num5, num6, num7, l, bool7, str23, str24, str8, num8, str9, str10, str11, str12, str13, num9, str14, str25, str26, str27, num10, num11, str28, str29, bool8, l2, str15, str16, str17, str18, str19, str20, str30, str31, num, str32, str33, str34, str35, -1, Integer.valueOf(i3), null);
                    newInstance.getClass();
                    return newInstance;
                }
                if (str36 == null) {
                    throw Util.missingProperty("sqip_base_square_application_id", "sqip_base_square_application_id", reader);
                }
                if (str37 == null) {
                    throw Util.missingProperty("sqip_base_device_locale_country_code", "sqip_base_device_locale_country_code", reader);
                }
                if (str21 == null) {
                    throw Util.missingProperty("sqip_base_device_language", "sqip_base_device_language", reader);
                }
                if (str22 == null) {
                    throw Util.missingProperty("sqip_base_square_device_id", "sqip_base_square_device_id", reader);
                }
                if (bool9 == null) {
                    throw Util.missingProperty("sqip_base_has_flutter_plugin", "sqip_base_has_flutter_plugin", reader);
                }
                boolean booleanValue = bool9.booleanValue();
                if (bool10 == null) {
                    throw Util.missingProperty("sqip_base_has_flutter", "sqip_base_has_flutter", reader);
                }
                boolean booleanValue2 = bool10.booleanValue();
                if (bool11 == null) {
                    throw Util.missingProperty("sqip_base_has_react_native", "sqip_base_has_react_native", reader);
                }
                boolean booleanValue3 = bool11.booleanValue();
                if (bool12 == null) {
                    throw Util.missingProperty("sqip_base_has_react_native_plugin", "sqip_base_has_react_native_plugin", reader);
                }
                boolean booleanValue4 = bool12.booleanValue();
                if (str38 == null) {
                    throw Util.missingProperty("sqip_base_orientation", "sqip_base_orientation", reader);
                }
                if (num12 == null) {
                    throw Util.missingProperty("sqip_base_screen_width_pixels", "sqip_base_screen_width_pixels", reader);
                }
                int intValue = num12.intValue();
                if (num3 == null) {
                    throw Util.missingProperty("sqip_base_screen_height_pixels", "sqip_base_screen_height_pixels", reader);
                }
                int intValue2 = num3.intValue();
                if (str5 == null) {
                    throw Util.missingProperty("sqip_base_time_zone", "sqip_base_time_zone", reader);
                }
                if (bool5 == null) {
                    throw Util.missingProperty("sqip_base_is_app_debug_build", "sqip_base_is_app_debug_build", reader);
                }
                boolean booleanValue5 = bool5.booleanValue();
                if (bool6 == null) {
                    throw Util.missingProperty("sqip_base_is_sdk_debug_build", "sqip_base_is_sdk_debug_build", reader);
                }
                boolean booleanValue6 = bool6.booleanValue();
                if (str6 == null) {
                    throw Util.missingProperty("sqip_android_base_app_package_name", "sqip_android_base_app_package_name", reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("sqip_android_base_app_version_name", "sqip_android_base_app_version_name", reader);
                }
                if (num4 == null) {
                    throw Util.missingProperty("sqip_android_base_app_version_code", "sqip_android_base_app_version_code", reader);
                }
                int intValue3 = num4.intValue();
                if (num5 == null) {
                    throw Util.missingProperty("sqip_android_base_target_api_version", "sqip_android_base_target_api_version", reader);
                }
                int intValue4 = num5.intValue();
                if (num6 == null) {
                    throw Util.missingProperty("sqip_android_base_min_api_version", "sqip_android_base_min_api_version", reader);
                }
                int intValue5 = num6.intValue();
                if (num7 == null) {
                    throw Util.missingProperty("sqip_android_base_screen_density_dpi", "sqip_android_base_screen_density_dpi", reader);
                }
                int intValue6 = num7.intValue();
                if (l == null) {
                    throw Util.missingProperty("sqip_android_base_apk_byte_size", "sqip_android_base_apk_byte_size", reader);
                }
                long longValue = l.longValue();
                if (bool7 == null) {
                    throw Util.missingProperty("sqip_android_base_uses_androidx", "sqip_android_base_uses_androidx", reader);
                }
                boolean booleanValue7 = bool7.booleanValue();
                if (str23 == null) {
                    throw Util.missingProperty("sqip_android_base_process_uuid", "sqip_android_base_process_uuid", reader);
                }
                if (str24 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_name", "sqip_card_entry_base_name", reader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_session_uuid", "sqip_card_entry_base_session_uuid", reader);
                }
                if (num8 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_session_order", "sqip_card_entry_base_session_order", reader);
                }
                int intValue7 = num8.intValue();
                if (str9 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_theme", "sqip_card_entry_base_theme", reader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_flow_type", "sqip_card_entry_base_flow_type", reader);
                }
                if (num9 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_amount", "sqip_card_entry_base_amount", reader);
                }
                int intValue8 = num9.intValue();
                if (num10 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_challenges_completed_count", "sqip_card_entry_base_challenges_completed_count", reader);
                }
                int intValue9 = num10.intValue();
                if (num11 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_challenges_total_count", "sqip_card_entry_base_challenges_total_count", reader);
                }
                int intValue10 = num11.intValue();
                if (bool8 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_has_challenged_user", "sqip_card_entry_base_has_challenged_user", reader);
                }
                boolean booleanValue8 = bool8.booleanValue();
                if (l2 == null) {
                    throw Util.missingProperty("sqip_card_entry_base_verification_duration_in_milliseconds", "sqip_card_entry_base_verification_duration_in_milliseconds", reader);
                }
                long longValue2 = l2.longValue();
                str31.getClass();
                int intValue11 = num.intValue();
                str32.getClass();
                str33.getClass();
                str34.getClass();
                str35.getClass();
                return new IapEventJsonData(0L, str36, str37, str21, str22, booleanValue, booleanValue2, booleanValue3, booleanValue4, str38, intValue, intValue2, str5, booleanValue5, booleanValue6, str6, str7, intValue3, intValue4, intValue5, intValue6, longValue, booleanValue7, str23, str24, str8, intValue7, str9, str10, str11, str12, str13, intValue8, str14, str25, str26, str27, intValue9, intValue10, str28, str29, booleanValue8, longValue2, str15, str16, str17, str18, str19, str20, str30, str31, intValue11, str32, str33, str34, str35, 1, 0, null);
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("sqip_base_square_application_id", "sqip_base_square_application_id", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str3 = str37;
                    str4 = str38;
                case 1:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("sqip_base_device_locale_country_code", "sqip_base_device_locale_country_code", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str4 = str38;
                case 2:
                    str21 = (String) this.stringAdapter.fromJson(reader);
                    if (str21 == null) {
                        throw Util.unexpectedNull("sqip_base_device_language", "sqip_base_device_language", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 3:
                    str22 = (String) this.stringAdapter.fromJson(reader);
                    if (str22 == null) {
                        throw Util.unexpectedNull("sqip_base_square_device_id", "sqip_base_square_device_id", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 4:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw Util.unexpectedNull("sqip_base_has_flutter_plugin", "sqip_base_has_flutter_plugin", reader);
                    }
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 5:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("sqip_base_has_flutter", "sqip_base_has_flutter", reader);
                    }
                    bool = bool9;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 6:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("sqip_base_has_react_native", "sqip_base_has_react_native", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 7:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("sqip_base_has_react_native_plugin", "sqip_base_has_react_native_plugin", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 8:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("sqip_base_orientation", "sqip_base_orientation", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                case 9:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("sqip_base_screen_width_pixels", "sqip_base_screen_width_pixels", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 10:
                    num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw Util.unexpectedNull("sqip_base_screen_height_pixels", "sqip_base_screen_height_pixels", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 11:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("sqip_base_time_zone", "sqip_base_time_zone", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 12:
                    bool5 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw Util.unexpectedNull("sqip_base_is_app_debug_build", "sqip_base_is_app_debug_build", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 13:
                    bool6 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool6 == null) {
                        throw Util.unexpectedNull("sqip_base_is_sdk_debug_build", "sqip_base_is_sdk_debug_build", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 14:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("sqip_android_base_app_package_name", "sqip_android_base_app_package_name", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 15:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("sqip_android_base_app_version_name", "sqip_android_base_app_version_name", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 16:
                    num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw Util.unexpectedNull("sqip_android_base_app_version_code", "sqip_android_base_app_version_code", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 17:
                    num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        throw Util.unexpectedNull("sqip_android_base_target_api_version", "sqip_android_base_target_api_version", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 18:
                    num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        throw Util.unexpectedNull("sqip_android_base_min_api_version", "sqip_android_base_min_api_version", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 19:
                    num7 = (Integer) this.intAdapter.fromJson(reader);
                    if (num7 == null) {
                        throw Util.unexpectedNull("sqip_android_base_screen_density_dpi", "sqip_android_base_screen_density_dpi", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 20:
                    l = (Long) this.longAdapter.fromJson(reader);
                    if (l == null) {
                        throw Util.unexpectedNull("sqip_android_base_apk_byte_size", "sqip_android_base_apk_byte_size", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 21:
                    bool7 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool7 == null) {
                        throw Util.unexpectedNull("sqip_android_base_uses_androidx", "sqip_android_base_uses_androidx", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 22:
                    str23 = (String) this.stringAdapter.fromJson(reader);
                    if (str23 == null) {
                        throw Util.unexpectedNull("sqip_android_base_process_uuid", "sqip_android_base_process_uuid", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 23:
                    str24 = (String) this.stringAdapter.fromJson(reader);
                    if (str24 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_name", "sqip_card_entry_base_name", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 24:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_session_uuid", "sqip_card_entry_base_session_uuid", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 25:
                    num8 = (Integer) this.intAdapter.fromJson(reader);
                    if (num8 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_session_order", "sqip_card_entry_base_session_order", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 26:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_theme", "sqip_card_entry_base_theme", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 27:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 28:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 29:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 30:
                    str13 = (String) this.stringAdapter.fromJson(reader);
                    if (str13 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_flow_type", "sqip_card_entry_base_flow_type", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 31:
                    num9 = (Integer) this.intAdapter.fromJson(reader);
                    if (num9 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_amount", "sqip_card_entry_base_amount", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 32:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 33:
                    str25 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 34:
                    str26 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 35:
                    str27 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 36:
                    num10 = (Integer) this.intAdapter.fromJson(reader);
                    if (num10 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_challenges_completed_count", "sqip_card_entry_base_challenges_completed_count", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 37:
                    num11 = (Integer) this.intAdapter.fromJson(reader);
                    if (num11 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_challenges_total_count", "sqip_card_entry_base_challenges_total_count", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 38:
                    str28 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 39:
                    str29 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 40:
                    bool8 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool8 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_has_challenged_user", "sqip_card_entry_base_has_challenged_user", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 41:
                    l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("sqip_card_entry_base_verification_duration_in_milliseconds", "sqip_card_entry_base_verification_duration_in_milliseconds", reader);
                    }
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 42:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 43:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 44:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 45:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 46:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 47:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 48:
                    str30 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 49:
                    str31 = (String) this.stringAdapter.fromJson(reader);
                    if (str31 == null) {
                        throw Util.unexpectedNull("sqip_base_device_model", "sqip_base_device_model", reader);
                    }
                    i = -262145;
                    i2 = i3 & i;
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 50:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Util.unexpectedNull("sqip_android_base_device_sdk_int", "sqip_android_base_device_sdk_int", reader);
                    }
                    i = -524289;
                    i2 = i3 & i;
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 51:
                    str32 = (String) this.stringAdapter.fromJson(reader);
                    if (str32 == null) {
                        throw Util.unexpectedNull("sqip_android_base_device_manufacturer", "sqip_android_base_device_manufacturer", reader);
                    }
                    i = -1048577;
                    i2 = i3 & i;
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 52:
                    str33 = (String) this.stringAdapter.fromJson(reader);
                    if (str33 == null) {
                        throw Util.unexpectedNull("sqip_android_base_device_brand", "sqip_android_base_device_brand", reader);
                    }
                    i = -2097153;
                    i2 = i3 & i;
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 53:
                    str34 = (String) this.stringAdapter.fromJson(reader);
                    if (str34 == null) {
                        throw Util.unexpectedNull("u_library_name", "u_library_name", reader);
                    }
                    i = -4194305;
                    i2 = i3 & i;
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                case 54:
                    str35 = (String) this.stringAdapter.fromJson(reader);
                    if (str35 == null) {
                        throw Util.unexpectedNull("u_library_version", "u_library_version", reader);
                    }
                    i = -8388609;
                    i2 = i3 & i;
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
                default:
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    bool4 = bool12;
                    num2 = num12;
                    i2 = i3;
                    str2 = str36;
                    str3 = str37;
                    str4 = str38;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, IapEventJsonData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("sqip_base_square_application_id");
        this.stringAdapter.toJson(writer, value_.getSqip_base_square_application_id());
        writer.name("sqip_base_device_locale_country_code");
        this.stringAdapter.toJson(writer, value_.getSqip_base_device_locale_country_code());
        writer.name("sqip_base_device_language");
        this.stringAdapter.toJson(writer, value_.getSqip_base_device_language());
        writer.name("sqip_base_square_device_id");
        this.stringAdapter.toJson(writer, value_.getSqip_base_square_device_id());
        writer.name("sqip_base_has_flutter_plugin");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_base_has_flutter_plugin()));
        writer.name("sqip_base_has_flutter");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_base_has_flutter()));
        writer.name("sqip_base_has_react_native");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_base_has_react_native()));
        writer.name("sqip_base_has_react_native_plugin");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_base_has_react_native_plugin()));
        writer.name("sqip_base_orientation");
        this.stringAdapter.toJson(writer, value_.getSqip_base_orientation());
        writer.name("sqip_base_screen_width_pixels");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_base_screen_width_pixels()));
        writer.name("sqip_base_screen_height_pixels");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_base_screen_height_pixels()));
        writer.name("sqip_base_time_zone");
        this.stringAdapter.toJson(writer, value_.getSqip_base_time_zone());
        writer.name("sqip_base_is_app_debug_build");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_base_is_app_debug_build()));
        writer.name("sqip_base_is_sdk_debug_build");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_base_is_sdk_debug_build()));
        writer.name("sqip_android_base_app_package_name");
        this.stringAdapter.toJson(writer, value_.getSqip_android_base_app_package_name());
        writer.name("sqip_android_base_app_version_name");
        this.stringAdapter.toJson(writer, value_.getSqip_android_base_app_version_name());
        writer.name("sqip_android_base_app_version_code");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_android_base_app_version_code()));
        writer.name("sqip_android_base_target_api_version");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_android_base_target_api_version()));
        writer.name("sqip_android_base_min_api_version");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_android_base_min_api_version()));
        writer.name("sqip_android_base_screen_density_dpi");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_android_base_screen_density_dpi()));
        writer.name("sqip_android_base_apk_byte_size");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getSqip_android_base_apk_byte_size()));
        writer.name("sqip_android_base_uses_androidx");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_android_base_uses_androidx()));
        writer.name("sqip_android_base_process_uuid");
        this.stringAdapter.toJson(writer, value_.getSqip_android_base_process_uuid());
        writer.name("sqip_card_entry_base_name");
        this.stringAdapter.toJson(writer, value_.getSqip_card_entry_base_name());
        writer.name("sqip_card_entry_base_session_uuid");
        this.stringAdapter.toJson(writer, value_.getSqip_card_entry_base_session_uuid());
        writer.name("sqip_card_entry_base_session_order");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_card_entry_base_session_order()));
        writer.name("sqip_card_entry_base_theme");
        this.stringAdapter.toJson(writer, value_.getSqip_card_entry_base_theme());
        writer.name("sqip_card_entry_base_validation_error_field");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_validation_error_field());
        writer.name("sqip_card_entry_base_nonce_error_code");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_nonce_error_code());
        writer.name("sqip_card_entry_base_app_error_message");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_app_error_message());
        writer.name("sqip_card_entry_base_flow_type");
        this.stringAdapter.toJson(writer, value_.getSqip_card_entry_base_flow_type());
        writer.name("sqip_card_entry_base_amount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_card_entry_base_amount()));
        writer.name("sqip_card_entry_base_buyer_action");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_buyer_action());
        writer.name("sqip_card_entry_base_contact_empty_fields");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_contact_empty_fields());
        writer.name("sqip_card_entry_base_currency");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_currency());
        writer.name("sqip_card_entry_base_location_id");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_location_id());
        writer.name("sqip_card_entry_base_challenges_completed_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_card_entry_base_challenges_completed_count()));
        writer.name("sqip_card_entry_base_challenges_total_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_card_entry_base_challenges_total_count()));
        writer.name("sqip_card_entry_base_error_code");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_error_code());
        writer.name("sqip_card_entry_base_error_description");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_error_description());
        writer.name("sqip_card_entry_base_has_challenged_user");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSqip_card_entry_base_has_challenged_user()));
        writer.name("sqip_card_entry_base_verification_duration_in_milliseconds");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getSqip_card_entry_base_verification_duration_in_milliseconds()));
        writer.name("sqip_card_entry_base_three_ds_trans_status");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_three_ds_trans_status());
        writer.name("sqip_card_entry_base_challenge_type");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_challenge_type());
        writer.name("sqip_card_entry_base_verification_token");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_verification_token());
        writer.name("sqip_card_entry_base_three_ds_server_trans_id");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_three_ds_server_trans_id());
        writer.name("sqip_card_entry_base_three_ds_warning_severity");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_three_ds_warning_severity());
        writer.name("sqip_card_entry_base_three_ds_warning_code");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_three_ds_warning_code());
        writer.name("sqip_card_entry_base_three_ds_warning_description");
        this.nullableStringAdapter.toJson(writer, value_.getSqip_card_entry_base_three_ds_warning_description());
        writer.name("sqip_base_device_model");
        this.stringAdapter.toJson(writer, value_.getSqip_base_device_model());
        writer.name("sqip_android_base_device_sdk_int");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSqip_android_base_device_sdk_int()));
        writer.name("sqip_android_base_device_manufacturer");
        this.stringAdapter.toJson(writer, value_.getSqip_android_base_device_manufacturer());
        writer.name("sqip_android_base_device_brand");
        this.stringAdapter.toJson(writer, value_.getSqip_android_base_device_brand());
        writer.name("u_library_name");
        this.stringAdapter.toJson(writer, value_.getU_library_name());
        writer.name("u_library_version");
        this.stringAdapter.toJson(writer, value_.getU_library_version());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(38, "GeneratedJsonAdapter(IapEventJsonData)");
    }
}
