package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdy;
import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzdy zzdyVar = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SponsoredAccountRenderData(zzdyVar, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzdyVar = new SponsoredAccountRenderData$Role$Teen((SponsoredAccountRenderData.Teen) SponsoredAccountRenderData.Teen.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzdyVar = new SponsoredAccountRenderData$Role$Parent((SponsoredAccountRenderData.Parent) SponsoredAccountRenderData.Parent.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SponsoredAccountRenderData sponsoredAccountRenderData = (SponsoredAccountRenderData) obj;
        reverseProtoWriter.getClass();
        sponsoredAccountRenderData.getClass();
        reverseProtoWriter.writeBytes(sponsoredAccountRenderData.unknownFields());
        zzdy zzdyVar = sponsoredAccountRenderData.role;
        if (zzdyVar instanceof SponsoredAccountRenderData$Role$Teen) {
            SponsoredAccountRenderData.Teen.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SponsoredAccountRenderData$Role$Teen) zzdyVar).value);
        } else if (zzdyVar instanceof SponsoredAccountRenderData$Role$Parent) {
            SponsoredAccountRenderData.Parent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SponsoredAccountRenderData$Role$Parent) zzdyVar).value);
        } else if (zzdyVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, sponsoredAccountRenderData.is_sponsor_led);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SponsoredAccountRenderData sponsoredAccountRenderData = (SponsoredAccountRenderData) obj;
        sponsoredAccountRenderData.getClass();
        int size$okio = sponsoredAccountRenderData.unknownFields().getSize$okio();
        zzdy zzdyVar = sponsoredAccountRenderData.role;
        if (zzdyVar instanceof SponsoredAccountRenderData$Role$Teen) {
            encodedSizeWithTag = SponsoredAccountRenderData.Teen.ADAPTER.encodedSizeWithTag(1, ((SponsoredAccountRenderData$Role$Teen) zzdyVar).value);
        } else {
            if (!(zzdyVar instanceof SponsoredAccountRenderData$Role$Parent)) {
                if (zzdyVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, sponsoredAccountRenderData.is_sponsor_led) + size$okio;
            }
            encodedSizeWithTag = SponsoredAccountRenderData.Parent.ADAPTER.encodedSizeWithTag(2, ((SponsoredAccountRenderData$Role$Parent) zzdyVar).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, sponsoredAccountRenderData.is_sponsor_led) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SponsoredAccountRenderData sponsoredAccountRenderData = (SponsoredAccountRenderData) obj;
        sponsoredAccountRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzdy zzdyVar = sponsoredAccountRenderData.role;
        Boolean bool = sponsoredAccountRenderData.is_sponsor_led;
        byteString.getClass();
        return new SponsoredAccountRenderData(zzdyVar, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SponsoredAccountRenderData sponsoredAccountRenderData = (SponsoredAccountRenderData) obj;
        sponsoredAccountRenderData.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, sponsoredAccountRenderData.is_sponsor_led);
        zzdy zzdyVar = sponsoredAccountRenderData.role;
        if (zzdyVar instanceof SponsoredAccountRenderData$Role$Teen) {
            SponsoredAccountRenderData.Teen.ADAPTER.encodeWithTag(protoWriter, 1, ((SponsoredAccountRenderData$Role$Teen) zzdyVar).value);
        } else if (zzdyVar instanceof SponsoredAccountRenderData$Role$Parent) {
            SponsoredAccountRenderData.Parent.ADAPTER.encodeWithTag(protoWriter, 2, ((SponsoredAccountRenderData$Role$Parent) zzdyVar).value);
        } else if (zzdyVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(sponsoredAccountRenderData.unknownFields());
    }
}
