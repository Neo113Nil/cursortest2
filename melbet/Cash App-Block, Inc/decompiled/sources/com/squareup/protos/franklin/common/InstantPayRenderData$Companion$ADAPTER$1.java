package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzdw;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstantPayRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzdw zzdwVar = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantPayRenderData(zzdwVar, (Avatar) obj, (Image) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzdwVar = new InstantPayRenderData$Activity$PayoutActivity((InstantPayRenderData.PayoutActivity) InstantPayRenderData.PayoutActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzdwVar = new InstantPayRenderData$Activity$PaybackActivity((InstantPayRenderData.PaybackActivity) InstantPayRenderData.PaybackActivity.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstantPayRenderData instantPayRenderData = (InstantPayRenderData) obj;
        reverseProtoWriter.getClass();
        instantPayRenderData.getClass();
        reverseProtoWriter.writeBytes(instantPayRenderData.unknownFields());
        zzdw zzdwVar = instantPayRenderData.activity;
        if (zzdwVar instanceof InstantPayRenderData$Activity$PayoutActivity) {
            InstantPayRenderData.PayoutActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((InstantPayRenderData$Activity$PayoutActivity) zzdwVar).value);
        } else if (zzdwVar instanceof InstantPayRenderData$Activity$PaybackActivity) {
            InstantPayRenderData.PaybackActivity.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InstantPayRenderData$Activity$PaybackActivity) zzdwVar).value);
        } else if (zzdwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, instantPayRenderData.avatar_overlay_icon);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, instantPayRenderData.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InstantPayRenderData instantPayRenderData = (InstantPayRenderData) obj;
        instantPayRenderData.getClass();
        int size$okio = instantPayRenderData.unknownFields().getSize$okio();
        zzdw zzdwVar = instantPayRenderData.activity;
        if (zzdwVar instanceof InstantPayRenderData$Activity$PayoutActivity) {
            encodedSizeWithTag = InstantPayRenderData.PayoutActivity.ADAPTER.encodedSizeWithTag(1, ((InstantPayRenderData$Activity$PayoutActivity) zzdwVar).value);
        } else {
            if (!(zzdwVar instanceof InstantPayRenderData$Activity$PaybackActivity)) {
                if (zzdwVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return Image.ADAPTER.encodedSizeWithTag(4, instantPayRenderData.avatar_overlay_icon) + Avatar.ADAPTER.encodedSizeWithTag(3, instantPayRenderData.avatar) + size$okio;
            }
            encodedSizeWithTag = InstantPayRenderData.PaybackActivity.ADAPTER.encodedSizeWithTag(2, ((InstantPayRenderData$Activity$PaybackActivity) zzdwVar).value);
        }
        size$okio += encodedSizeWithTag;
        return Image.ADAPTER.encodedSizeWithTag(4, instantPayRenderData.avatar_overlay_icon) + Avatar.ADAPTER.encodedSizeWithTag(3, instantPayRenderData.avatar) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantPayRenderData instantPayRenderData = (InstantPayRenderData) obj;
        instantPayRenderData.getClass();
        Avatar avatar = instantPayRenderData.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Image image = instantPayRenderData.avatar_overlay_icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        zzdw zzdwVar = instantPayRenderData.activity;
        byteString.getClass();
        return new InstantPayRenderData(zzdwVar, avatar2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantPayRenderData instantPayRenderData = (InstantPayRenderData) obj;
        instantPayRenderData.getClass();
        Avatar.ADAPTER.encodeWithTag(protoWriter, 3, instantPayRenderData.avatar);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, instantPayRenderData.avatar_overlay_icon);
        zzdw zzdwVar = instantPayRenderData.activity;
        if (zzdwVar instanceof InstantPayRenderData$Activity$PayoutActivity) {
            InstantPayRenderData.PayoutActivity.ADAPTER.encodeWithTag(protoWriter, 1, ((InstantPayRenderData$Activity$PayoutActivity) zzdwVar).value);
        } else if (zzdwVar instanceof InstantPayRenderData$Activity$PaybackActivity) {
            InstantPayRenderData.PaybackActivity.ADAPTER.encodeWithTag(protoWriter, 2, ((InstantPayRenderData$Activity$PaybackActivity) zzdwVar).value);
        } else if (zzdwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(instantPayRenderData.unknownFields());
    }
}
