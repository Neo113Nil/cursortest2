package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet_CardCtaPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "uiAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "nullableComponentNameMappingAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreatePersonaSheet_CardCtaPageJsonAdapter extends JsonAdapter {
    private volatile Constructor<CreatePersonaSheet.CardCtaPage> constructorRef;
    private final JsonAdapter nullableComponentNameMappingAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter uiAdapter;

    public CreatePersonaSheet_CardCtaPageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("uiStep", "componentNameMapping");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.uiAdapter = moshi.adapter(NextStep.Ui.class, emptySet, "uiStep");
        this.nullableComponentNameMappingAdapter = moshi.adapter(CreatePersonaSheet.CardCtaPage.ComponentNameMapping.class, emptySet, "componentNameMapping");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreatePersonaSheet.CardCtaPage fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.Ui ui = null;
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                ui = (NextStep.Ui) this.uiAdapter.fromJson(reader);
                if (ui == null) {
                    throw Util.unexpectedNull("uiStep", "uiStep", reader);
                }
            } else if (selectName == 1) {
                componentNameMapping = (CreatePersonaSheet.CardCtaPage.ComponentNameMapping) this.nullableComponentNameMappingAdapter.fromJson(reader);
                i = -3;
            }
        }
        reader.endObject();
        if (i == -3) {
            if (ui != null) {
                return new CreatePersonaSheet.CardCtaPage(ui, componentNameMapping);
            }
            throw Util.missingProperty("uiStep", "uiStep", reader);
        }
        Constructor<CreatePersonaSheet.CardCtaPage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreatePersonaSheet.CardCtaPage.class.getDeclaredConstructor(NextStep.Ui.class, CreatePersonaSheet.CardCtaPage.ComponentNameMapping.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (ui == null) {
            throw Util.missingProperty("uiStep", "uiStep", reader);
        }
        CreatePersonaSheet.CardCtaPage newInstance = constructor.newInstance(ui, componentNameMapping, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreatePersonaSheet.CardCtaPage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("uiStep");
        this.uiAdapter.toJson(writer, value_.getUiStep());
        writer.name("componentNameMapping");
        this.nullableComponentNameMappingAdapter.toJson(writer, value_.getComponentNameMapping());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(52, "GeneratedJsonAdapter(CreatePersonaSheet.CardCtaPage)");
    }
}
