package com.withpersona.sdk2.inquiry.steps.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClickableStackComponentJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public volatile Constructor constructorRef;
    public final JsonAdapter listOfUiComponentAdapter;
    public final JsonAdapter nullableClickableStackComponentStyleAdapter;
    public final JsonAdapter nullableJsonLogicBooleanAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public ClickableStackComponentJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "children", "hidden", "disabled", "styles", "isActive");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.listOfUiComponentAdapter = moshi.adapter(Types.newParameterizedType(List.class, UiComponent.class), emptySet, "children");
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
        this.nullableClickableStackComponentStyleAdapter = moshi.adapter(ClickableStack.ClickableStackComponentStyle.class, emptySet, "styles");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isActive");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        JsonLogicBoolean jsonLogicBoolean = null;
        Boolean bool2 = bool;
        List list = null;
        String str = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = null;
        int i = -1;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    break;
                case 1:
                    list = (List) this.listOfUiComponentAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("children", "children", jsonReader);
                    }
                    break;
                case 2:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    clickableStackComponentStyle = (ClickableStack.ClickableStackComponentStyle) this.nullableClickableStackComponentStyleAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isActive", "isActive", jsonReader);
                    }
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            if (str == null) {
                throw Util.missingProperty("name", "name", jsonReader);
            }
            if (list == null) {
                throw Util.missingProperty("children", "children", jsonReader);
            }
            return new ClickableStackComponent(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle, bool2.booleanValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ClickableStackComponent.class.getDeclaredConstructor(String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, ClickableStack.ClickableStackComponentStyle.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("children", "children", jsonReader);
        }
        Object newInstance = constructor2.newInstance(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle, bool2, Integer.valueOf(i), null);
        newInstance.getClass();
        return (ClickableStackComponent) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) obj;
        jsonWriter.getClass();
        if (clickableStackComponent == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, clickableStackComponent.name);
        jsonWriter.name("children");
        this.listOfUiComponentAdapter.toJson(jsonWriter, clickableStackComponent.children);
        jsonWriter.name("hidden");
        JsonLogicBoolean jsonLogicBoolean = clickableStackComponent.hidden;
        JsonAdapter jsonAdapter = this.nullableJsonLogicBooleanAdapter;
        jsonAdapter.toJson(jsonWriter, jsonLogicBoolean);
        jsonWriter.name("disabled");
        jsonAdapter.toJson(jsonWriter, clickableStackComponent.disabled);
        jsonWriter.name("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(jsonWriter, clickableStackComponent.styles);
        jsonWriter.name("isActive");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(clickableStackComponent.isActive));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(45, "GeneratedJsonAdapter(ClickableStackComponent)");
    }
}
