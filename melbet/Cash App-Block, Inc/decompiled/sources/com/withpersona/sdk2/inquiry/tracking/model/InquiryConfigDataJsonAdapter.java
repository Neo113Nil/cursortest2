package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableUiFrameworkAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "nullableBooleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryConfigDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<InquiryConfigData> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableUiFrameworkAdapter;
    private final JsonReader.Options options;

    public InquiryConfigDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("template_id", "template_version", "environment", "environment_id", "ui_framework", "theme_set_id", "has_account_id", "has_fields", "has_inquiry_id", "has_one_time_link_code", "has_redirect_uri", "has_reference_id", "has_session_token", "has_theme");
        this.nullableStringAdapter = b.a(moshi, String.class, "templateId", "adapter(...)");
        this.nullableUiFrameworkAdapter = b.a(moshi, UiFramework.class, "uiFramework", "adapter(...)");
        this.nullableBooleanAdapter = b.a(moshi, Boolean.class, "hasAccountId", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InquiryConfigData fromJson(JsonReader reader) {
        int i;
        reader.getClass();
        reader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        UiFramework uiFramework = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    continue;
                case 0:
                    i = -2;
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    i = -3;
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    i = -5;
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    i = -9;
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    i = -17;
                    uiFramework = (UiFramework) this.nullableUiFrameworkAdapter.fromJson(reader);
                    break;
                case 5:
                    i = -33;
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    i = -65;
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    i = -129;
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    i = -257;
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    i = -513;
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    i = -1025;
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 11:
                    i = -2049;
                    bool6 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 12:
                    i = -4097;
                    bool7 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    i = -8193;
                    bool8 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
            i2 &= i;
        }
        reader.endObject();
        if (i2 == -16384) {
            Boolean bool9 = bool3;
            Boolean bool10 = bool2;
            Boolean bool11 = bool;
            String str6 = str5;
            UiFramework uiFramework2 = uiFramework;
            String str7 = str4;
            return new InquiryConfigData(str, str2, str3, str7, uiFramework2, str6, bool11, bool10, bool9, bool4, bool5, bool6, bool7, bool8);
        }
        Boolean bool12 = bool3;
        Boolean bool13 = bool2;
        Boolean bool14 = bool;
        String str8 = str5;
        UiFramework uiFramework3 = uiFramework;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        Constructor<InquiryConfigData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InquiryConfigData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, UiFramework.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        InquiryConfigData newInstance = constructor.newInstance(str12, str11, str10, str9, uiFramework3, str8, bool14, bool13, bool12, bool4, bool5, bool6, bool7, bool8, Integer.valueOf(i2), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InquiryConfigData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("template_id");
        this.nullableStringAdapter.toJson(writer, value_.getTemplateId());
        writer.name("template_version");
        this.nullableStringAdapter.toJson(writer, value_.getTemplateVersion());
        writer.name("environment");
        this.nullableStringAdapter.toJson(writer, value_.getEnvironment());
        writer.name("environment_id");
        this.nullableStringAdapter.toJson(writer, value_.getEnvironmentId());
        writer.name("ui_framework");
        this.nullableUiFrameworkAdapter.toJson(writer, value_.getUiFramework());
        writer.name("theme_set_id");
        this.nullableStringAdapter.toJson(writer, value_.getThemeSetId());
        writer.name("has_account_id");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasAccountId());
        writer.name("has_fields");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasFields());
        writer.name("has_inquiry_id");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasInquiryId());
        writer.name("has_one_time_link_code");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasOneTimeLinkCode());
        writer.name("has_redirect_uri");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasRedirectUri());
        writer.name("has_reference_id");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasReferenceId());
        writer.name("has_session_token");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasSessionToken());
        writer.name("has_theme");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasTheme());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(InquiryConfigData)", 39);
    }
}
