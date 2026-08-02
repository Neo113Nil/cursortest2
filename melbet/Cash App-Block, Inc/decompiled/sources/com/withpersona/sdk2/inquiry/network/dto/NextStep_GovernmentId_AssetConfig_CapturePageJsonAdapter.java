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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableRemoteImageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.CapturePage> constructorRef;
    private final JsonAdapter nullableRemoteImageAdapter;
    private final JsonReader.Options options;

    public NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "idFrontHelpModalPictograph", "idBackHelpModalPictograph", "barcodeHelpModalPictograph", "staticCaptureTipsIconPictograph");
        this.nullableRemoteImageAdapter = moshi.adapter(RemoteImage.class, EmptySet.INSTANCE, "idFrontPictograph");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.AssetConfig.CapturePage fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        RemoteImage remoteImage = null;
        RemoteImage remoteImage2 = null;
        RemoteImage remoteImage3 = null;
        RemoteImage remoteImage4 = null;
        RemoteImage remoteImage5 = null;
        RemoteImage remoteImage6 = null;
        RemoteImage remoteImage7 = null;
        RemoteImage remoteImage8 = null;
        RemoteImage remoteImage9 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    remoteImage = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -2;
                    break;
                case 1:
                    remoteImage2 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    remoteImage3 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    remoteImage4 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    remoteImage5 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    remoteImage6 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    remoteImage7 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -65;
                    break;
                case 7:
                    remoteImage8 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -129;
                    break;
                case 8:
                    remoteImage9 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(reader);
                    i &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i == -512) {
            RemoteImage remoteImage10 = remoteImage9;
            RemoteImage remoteImage11 = remoteImage8;
            RemoteImage remoteImage12 = remoteImage7;
            RemoteImage remoteImage13 = remoteImage6;
            RemoteImage remoteImage14 = remoteImage5;
            RemoteImage remoteImage15 = remoteImage4;
            return new NextStep.GovernmentId.AssetConfig.CapturePage(remoteImage, remoteImage2, remoteImage3, remoteImage15, remoteImage14, remoteImage13, remoteImage12, remoteImage11, remoteImage10);
        }
        RemoteImage remoteImage16 = remoteImage9;
        RemoteImage remoteImage17 = remoteImage8;
        RemoteImage remoteImage18 = remoteImage7;
        RemoteImage remoteImage19 = remoteImage6;
        RemoteImage remoteImage20 = remoteImage5;
        RemoteImage remoteImage21 = remoteImage4;
        RemoteImage remoteImage22 = remoteImage3;
        RemoteImage remoteImage23 = remoteImage2;
        RemoteImage remoteImage24 = remoteImage;
        Constructor<NextStep.GovernmentId.AssetConfig.CapturePage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.GovernmentId.AssetConfig.CapturePage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        NextStep.GovernmentId.AssetConfig.CapturePage newInstance = constructor.newInstance(remoteImage24, remoteImage23, remoteImage22, remoteImage21, remoteImage20, remoteImage19, remoteImage18, remoteImage17, remoteImage16, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.AssetConfig.CapturePage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("idFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdFrontPictograph());
        writer.name("idBackPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdBackPictograph());
        writer.name("barcodePdf417Pictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getBarcodePdf417Pictograph());
        writer.name("passportFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getPassportFrontPictograph());
        writer.name("passportSignaturePictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getPassportSignaturePictograph());
        writer.name("idFrontHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdFrontHelpModalPictograph());
        writer.name("idBackHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getIdBackHelpModalPictograph());
        writer.name("barcodeHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getBarcodeHelpModalPictograph());
        writer.name("staticCaptureTipsIconPictograph");
        this.nullableRemoteImageAdapter.toJson(writer, value_.getStaticCaptureTipsIconPictograph());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(67, "GeneratedJsonAdapter(NextStep.GovernmentId.AssetConfig.CapturePage)");
    }
}
