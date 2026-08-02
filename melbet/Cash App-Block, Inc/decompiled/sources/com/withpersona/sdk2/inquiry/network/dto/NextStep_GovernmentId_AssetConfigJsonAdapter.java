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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_AssetConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableSelectPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "nullablePromptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "nullableCapturePageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "nullableCheckPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "nullablePendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_AssetConfigJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig> constructorRef;
    private final JsonAdapter nullableCapturePageAdapter;
    private final JsonAdapter nullableCheckPageAdapter;
    private final JsonAdapter nullablePendingPageAdapter;
    private final JsonAdapter nullablePromptPageAdapter;
    private final JsonAdapter nullableSelectPageAdapter;
    private final JsonReader.Options options;

    public NextStep_GovernmentId_AssetConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("selectPage", "promptPage", "capturePage", "checkPage", "pendingPage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableSelectPageAdapter = moshi.adapter(NextStep.GovernmentId.AssetConfig.SelectPage.class, emptySet, "selectPage");
        this.nullablePromptPageAdapter = moshi.adapter(NextStep.GovernmentId.AssetConfig.PromptPage.class, emptySet, "promptPage");
        this.nullableCapturePageAdapter = moshi.adapter(NextStep.GovernmentId.AssetConfig.CapturePage.class, emptySet, "capturePage");
        this.nullableCheckPageAdapter = moshi.adapter(NextStep.GovernmentId.AssetConfig.CheckPage.class, emptySet, "checkPage");
        this.nullablePendingPageAdapter = moshi.adapter(NextStep.GovernmentId.AssetConfig.PendingPage.class, emptySet, "pendingPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.AssetConfig fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = null;
        NextStep.GovernmentId.AssetConfig.PromptPage promptPage = null;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = null;
        NextStep.GovernmentId.AssetConfig.CheckPage checkPage = null;
        NextStep.GovernmentId.AssetConfig.PendingPage pendingPage = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                selectPage = (NextStep.GovernmentId.AssetConfig.SelectPage) this.nullableSelectPageAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                promptPage = (NextStep.GovernmentId.AssetConfig.PromptPage) this.nullablePromptPageAdapter.fromJson(reader);
                i &= -3;
            } else if (selectName == 2) {
                capturePage = (NextStep.GovernmentId.AssetConfig.CapturePage) this.nullableCapturePageAdapter.fromJson(reader);
                i &= -5;
            } else if (selectName == 3) {
                checkPage = (NextStep.GovernmentId.AssetConfig.CheckPage) this.nullableCheckPageAdapter.fromJson(reader);
                i &= -9;
            } else if (selectName == 4) {
                pendingPage = (NextStep.GovernmentId.AssetConfig.PendingPage) this.nullablePendingPageAdapter.fromJson(reader);
                i &= -17;
            }
        }
        reader.endObject();
        if (i == -32) {
            NextStep.GovernmentId.AssetConfig.PendingPage pendingPage2 = pendingPage;
            NextStep.GovernmentId.AssetConfig.CheckPage checkPage2 = checkPage;
            return new NextStep.GovernmentId.AssetConfig(selectPage, promptPage, capturePage, checkPage2, pendingPage2);
        }
        NextStep.GovernmentId.AssetConfig.PendingPage pendingPage3 = pendingPage;
        NextStep.GovernmentId.AssetConfig.CheckPage checkPage3 = checkPage;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage2 = capturePage;
        NextStep.GovernmentId.AssetConfig.PromptPage promptPage2 = promptPage;
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage2 = selectPage;
        Constructor<NextStep.GovernmentId.AssetConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.GovernmentId.AssetConfig.class.getDeclaredConstructor(NextStep.GovernmentId.AssetConfig.SelectPage.class, NextStep.GovernmentId.AssetConfig.PromptPage.class, NextStep.GovernmentId.AssetConfig.CapturePage.class, NextStep.GovernmentId.AssetConfig.CheckPage.class, NextStep.GovernmentId.AssetConfig.PendingPage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        NextStep.GovernmentId.AssetConfig newInstance = constructor.newInstance(selectPage2, promptPage2, capturePage2, checkPage3, pendingPage3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.AssetConfig value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("selectPage");
        this.nullableSelectPageAdapter.toJson(writer, value_.getSelectPage());
        writer.name("promptPage");
        this.nullablePromptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.name("capturePage");
        this.nullableCapturePageAdapter.toJson(writer, value_.getCapturePage());
        writer.name("checkPage");
        this.nullableCheckPageAdapter.toJson(writer, value_.getCheckPage());
        writer.name("pendingPage");
        this.nullablePendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(55, "GeneratedJsonAdapter(NextStep.GovernmentId.AssetConfig)");
    }
}
