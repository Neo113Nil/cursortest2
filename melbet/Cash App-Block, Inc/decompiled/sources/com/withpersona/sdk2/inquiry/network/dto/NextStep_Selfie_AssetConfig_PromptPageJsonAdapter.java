package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_AssetConfig_PromptPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableRemoteImageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_AssetConfig_PromptPageJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.Selfie.AssetConfig.PromptPage> constructorRef;
    private final JsonAdapter nullableRemoteImageAdapter;
    private final JsonReader.Options options;

    public NextStep_Selfie_AssetConfig_PromptPageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("headerPictograph", "selfiePictograph", "selfieCenterPictograph", "selfieLeftPictograph", "selfieRightPictograph");
        this.nullableRemoteImageAdapter = moshi.adapter(RemoteImage.class, EmptySet.INSTANCE, "headerPictograph");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.AssetConfig.PromptPage fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        RemoteImage remoteImage = null;
        RemoteImage remoteImage2 = null;
        RemoteImage remoteImage3 = null;
        RemoteImage remoteImage4 = null;
        RemoteImage remoteImage5 = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                remoteImage = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                remoteImage2 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                i &= -3;
            } else if (selectName == 2) {
                remoteImage3 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                i &= -5;
            } else if (selectName == 3) {
                remoteImage4 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                i &= -9;
            } else if (selectName == 4) {
                remoteImage5 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                i &= -17;
            }
        }
        reader.endObject();
        if (i == -32) {
            RemoteImage remoteImage6 = remoteImage5;
            RemoteImage remoteImage7 = remoteImage4;
            return new NextStep.Selfie.AssetConfig.PromptPage(remoteImage, remoteImage2, remoteImage3, remoteImage7, remoteImage6);
        }
        RemoteImage remoteImage8 = remoteImage5;
        RemoteImage remoteImage9 = remoteImage4;
        RemoteImage remoteImage10 = remoteImage3;
        RemoteImage remoteImage11 = remoteImage2;
        RemoteImage remoteImage12 = remoteImage;
        Constructor<NextStep.Selfie.AssetConfig.PromptPage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.Selfie.AssetConfig.PromptPage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        NextStep.Selfie.AssetConfig.PromptPage newInstance = constructor.newInstance(remoteImage12, remoteImage11, remoteImage10, remoteImage9, remoteImage8, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.AssetConfig.PromptPage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("headerPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getHeaderPictograph());
        writer.name("selfiePictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getSelfiePictograph());
        writer.name("selfieCenterPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getSelfieCenterPictograph());
        writer.name("selfieLeftPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getSelfieLeftPictograph());
        writer.name("selfieRightPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getSelfieRightPictograph());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(60, "GeneratedJsonAdapter(NextStep.Selfie.AssetConfig.PromptPage)");
    }
}
