package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Integration_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Config;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableBooleanAdapter", "", "stringAdapter", "", "nullableIntegrationStepBrowserTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "nullableLocalizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Integration_ConfigJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.Integration.Config> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableIntegrationStepBrowserTypeAdapter;
    private final JsonAdapter nullableLocalizationsAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_Integration_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("backStepEnabled", "cancelButtonEnabled", "type", "flowUrl", "redirectPath", "integrationStepMobileSdkBrowserType", "localizations");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "backStepEnabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.nullableIntegrationStepBrowserTypeAdapter = moshi.adapter(NextStep.Integration.IntegrationStepBrowserType.class, emptySet, "integrationStepBrowserType");
        this.nullableLocalizationsAdapter = moshi.adapter(NextStep.Integration.Localizations.class, emptySet, "localizations");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Integration.Config fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = null;
        NextStep.Integration.Localizations localizations = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -2;
                    break;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("flowUrl", "flowUrl", reader);
                    }
                    break;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("redirectPath", "redirectPath", reader);
                    }
                    i &= -17;
                    break;
                case 5:
                    integrationStepBrowserType = (NextStep.Integration.IntegrationStepBrowserType) this.nullableIntegrationStepBrowserTypeAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    localizations = (NextStep.Integration.Localizations) this.nullableLocalizationsAdapter.fromJson(reader);
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -116) {
            NextStep.Integration.Localizations localizations2 = localizations;
            NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType2 = integrationStepBrowserType;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            if (str6 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            if (str5 == null) {
                throw Util.missingProperty("flowUrl", "flowUrl", reader);
            }
            str4.getClass();
            return new NextStep.Integration.Config(bool4, bool3, str6, str5, str4, integrationStepBrowserType2, localizations2);
        }
        NextStep.Integration.Localizations localizations3 = localizations;
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType3 = integrationStepBrowserType;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        Constructor<NextStep.Integration.Config> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.Integration.Config.class.getDeclaredConstructor(Boolean.class, Boolean.class, String.class, String.class, String.class, NextStep.Integration.IntegrationStepBrowserType.class, NextStep.Integration.Localizations.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor<NextStep.Integration.Config> constructor2 = constructor;
        if (str9 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        if (str8 == null) {
            throw Util.missingProperty("flowUrl", "flowUrl", reader);
        }
        NextStep.Integration.Config newInstance = constructor2.newInstance(bool6, bool5, str9, str8, str7, integrationStepBrowserType3, localizations3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Integration.Config value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.name("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("flowUrl");
        this.stringAdapter.toJson(writer, value_.getFlowUrl());
        writer.name("redirectPath");
        this.stringAdapter.toJson(writer, value_.getRedirectPath());
        writer.name("integrationStepMobileSdkBrowserType");
        this.nullableIntegrationStepBrowserTypeAdapter.toJson(writer, value_.getIntegrationStepBrowserType());
        writer.name("localizations");
        this.nullableLocalizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(49, "GeneratedJsonAdapter(NextStep.Integration.Config)");
    }
}
