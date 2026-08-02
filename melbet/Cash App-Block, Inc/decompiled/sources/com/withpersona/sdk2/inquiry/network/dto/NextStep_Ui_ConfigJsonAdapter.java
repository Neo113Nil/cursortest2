package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableListOfUiComponentConfigAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableBooleanAdapter", "", "nullableLocalizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "nullableListOfUiComponentErrorAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "nullableStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Ui_ConfigJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.Ui.Config> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableListOfUiComponentConfigAdapter;
    private final JsonAdapter nullableListOfUiComponentErrorAdapter;
    private final JsonAdapter nullableLocalizationsAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public NextStep_Ui_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("components", "backStepEnabled", "cancelButtonEnabled", "terminal", "localizations", "serverComponentErrors", "webviewUrl");
        Util.ParameterizedTypeImpl newParameterizedType = Types.newParameterizedType(List.class, UiComponentConfig.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfUiComponentConfigAdapter = moshi.adapter(newParameterizedType, emptySet, "components");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "backStepEnabled");
        this.nullableLocalizationsAdapter = moshi.adapter(NextStep.Ui.Localizations.class, emptySet, "localizations");
        this.nullableListOfUiComponentErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, UiComponentError.class), emptySet, "serverComponentErrors");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "webviewUrl");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Ui.Config fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        NextStep.Ui.Localizations localizations = null;
        List list2 = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    list = (List) this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
                    break;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    localizations = (NextStep.Ui.Localizations) this.nullableLocalizationsAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    list2 = (List) this.nullableListOfUiComponentErrorAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -127) {
            String str2 = str;
            List list3 = list2;
            NextStep.Ui.Localizations localizations2 = localizations;
            Boolean bool4 = bool3;
            return new NextStep.Ui.Config(list, bool, bool2, bool4, localizations2, list3, str2);
        }
        String str3 = str;
        List list4 = list2;
        NextStep.Ui.Localizations localizations3 = localizations;
        Boolean bool5 = bool3;
        Boolean bool6 = bool2;
        Boolean bool7 = bool;
        List list5 = list;
        Constructor<NextStep.Ui.Config> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.Ui.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, Boolean.class, NextStep.Ui.Localizations.class, List.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        NextStep.Ui.Config newInstance = constructor.newInstance(list5, bool7, bool6, bool5, localizations3, list4, str3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Ui.Config value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("components");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, value_.getComponents());
        writer.name("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.name("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.name("terminal");
        this.nullableBooleanAdapter.toJson(writer, value_.getTerminal());
        writer.name("localizations");
        this.nullableLocalizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.name("serverComponentErrors");
        this.nullableListOfUiComponentErrorAdapter.toJson(writer, value_.getServerComponentErrors());
        writer.name("webviewUrl");
        this.nullableStringAdapter.toJson(writer, value_.getWebviewUrl());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(NextStep.Ui.Config)");
    }
}
