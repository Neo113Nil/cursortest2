package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandBanner$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = null;
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = null;
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BrandBanner((LocalImage) obj, brandBanner$Title$TitleText, brandBanner$Subtitle$SubtitleText, brandBanner$Action$ApplySingleOffer, (LocalColor) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                brandBanner$Title$TitleText = new BrandBanner$Title$TitleText((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 4) {
                brandBanner$Subtitle$SubtitleText = new BrandBanner$Subtitle$SubtitleText((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 6) {
                brandBanner$Action$ApplySingleOffer = new BrandBanner$Action$ApplySingleOffer((Offer) Offer.ADAPTER.decode(protoReader));
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrandBanner brandBanner = (BrandBanner) obj;
        reverseProtoWriter.getClass();
        brandBanner.getClass();
        reverseProtoWriter.writeBytes(brandBanner.unknownFields());
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = brandBanner.action;
        if (brandBanner$Action$ApplySingleOffer != null) {
            Offer.ADAPTER.encodeWithTag(reverseProtoWriter, 6, brandBanner$Action$ApplySingleOffer.value);
        } else if (brandBanner$Action$ApplySingleOffer != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = brandBanner.subtitle;
        if (brandBanner$Subtitle$SubtitleText != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, brandBanner$Subtitle$SubtitleText.value);
        } else if (brandBanner$Subtitle$SubtitleText != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = brandBanner.title;
        if (brandBanner$Title$TitleText != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, brandBanner$Title$TitleText.value);
        } else if (brandBanner$Title$TitleText != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalColor.ADAPTER.encodeWithTag(reverseProtoWriter, 9, brandBanner.icon_background_color);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, brandBanner.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrandBanner brandBanner = (BrandBanner) obj;
        brandBanner.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(1, brandBanner.icon) + brandBanner.unknownFields().getSize$okio();
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = brandBanner.title;
        if (brandBanner$Title$TitleText != null) {
            encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, brandBanner$Title$TitleText.value);
        } else if (brandBanner$Title$TitleText != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = brandBanner.subtitle;
        if (brandBanner$Subtitle$SubtitleText != null) {
            encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, brandBanner$Subtitle$SubtitleText.value);
        } else if (brandBanner$Subtitle$SubtitleText != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = brandBanner.action;
        if (brandBanner$Action$ApplySingleOffer != null) {
            encodedSizeWithTag += Offer.ADAPTER.encodedSizeWithTag(6, brandBanner$Action$ApplySingleOffer.value);
        } else if (brandBanner$Action$ApplySingleOffer != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return LocalColor.ADAPTER.encodedSizeWithTag(9, brandBanner.icon_background_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrandBanner brandBanner = (BrandBanner) obj;
        brandBanner.getClass();
        LocalImage localImage = brandBanner.icon;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalColor localColor = brandBanner.icon_background_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        ByteString byteString = ByteString.EMPTY;
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = brandBanner.title;
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = brandBanner.subtitle;
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = brandBanner.action;
        byteString.getClass();
        return new BrandBanner(localImage2, brandBanner$Title$TitleText, brandBanner$Subtitle$SubtitleText, brandBanner$Action$ApplySingleOffer, localColor2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrandBanner brandBanner = (BrandBanner) obj;
        brandBanner.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, brandBanner.icon);
        LocalColor.ADAPTER.encodeWithTag(protoWriter, 9, brandBanner.icon_background_color);
        BrandBanner$Title$TitleText brandBanner$Title$TitleText = brandBanner.title;
        if (brandBanner$Title$TitleText != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, brandBanner$Title$TitleText.value);
        } else if (brandBanner$Title$TitleText != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = brandBanner.subtitle;
        if (brandBanner$Subtitle$SubtitleText != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, brandBanner$Subtitle$SubtitleText.value);
        } else if (brandBanner$Subtitle$SubtitleText != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = brandBanner.action;
        if (brandBanner$Action$ApplySingleOffer != null) {
            Offer.ADAPTER.encodeWithTag(protoWriter, 6, brandBanner$Action$ApplySingleOffer.value);
        } else if (brandBanner$Action$ApplySingleOffer != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(brandBanner.unknownFields());
    }
}
