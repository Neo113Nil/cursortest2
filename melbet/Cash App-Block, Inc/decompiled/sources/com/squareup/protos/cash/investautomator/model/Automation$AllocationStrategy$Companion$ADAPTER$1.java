package com.squareup.protos.cash.investautomator.model;

import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Automation$AllocationStrategy$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ImageHeaderParserUtils imageHeaderParserUtils = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Automation.AllocationStrategy(imageHeaderParserUtils, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                imageHeaderParserUtils = new Automation$AllocationStrategy$Type$RoundUp((Automation.AllocationStrategy.RoundUp) Automation.AllocationStrategy.RoundUp.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                imageHeaderParserUtils = new Automation$AllocationStrategy$Type$Fixed((Automation.AllocationStrategy.Fixed) Automation.AllocationStrategy.Fixed.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Automation.AllocationStrategy allocationStrategy = (Automation.AllocationStrategy) obj;
        reverseProtoWriter.getClass();
        allocationStrategy.getClass();
        reverseProtoWriter.writeBytes(allocationStrategy.unknownFields());
        ImageHeaderParserUtils imageHeaderParserUtils = allocationStrategy.f1278type;
        if (imageHeaderParserUtils instanceof Automation$AllocationStrategy$Type$RoundUp) {
            Automation.AllocationStrategy.RoundUp.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Automation$AllocationStrategy$Type$RoundUp) imageHeaderParserUtils).value);
        } else if (imageHeaderParserUtils instanceof Automation$AllocationStrategy$Type$Fixed) {
            Automation.AllocationStrategy.Fixed.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Automation$AllocationStrategy$Type$Fixed) imageHeaderParserUtils).value);
        } else {
            if (imageHeaderParserUtils == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Automation.AllocationStrategy allocationStrategy = (Automation.AllocationStrategy) obj;
        allocationStrategy.getClass();
        int size$okio = allocationStrategy.unknownFields().getSize$okio();
        ImageHeaderParserUtils imageHeaderParserUtils = allocationStrategy.f1278type;
        if (imageHeaderParserUtils instanceof Automation$AllocationStrategy$Type$RoundUp) {
            encodedSizeWithTag = Automation.AllocationStrategy.RoundUp.ADAPTER.encodedSizeWithTag(1, ((Automation$AllocationStrategy$Type$RoundUp) imageHeaderParserUtils).value);
        } else {
            if (!(imageHeaderParserUtils instanceof Automation$AllocationStrategy$Type$Fixed)) {
                if (imageHeaderParserUtils == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Automation.AllocationStrategy.Fixed.ADAPTER.encodedSizeWithTag(3, ((Automation$AllocationStrategy$Type$Fixed) imageHeaderParserUtils).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Automation.AllocationStrategy allocationStrategy = (Automation.AllocationStrategy) obj;
        allocationStrategy.getClass();
        ByteString byteString = ByteString.EMPTY;
        ImageHeaderParserUtils imageHeaderParserUtils = allocationStrategy.f1278type;
        byteString.getClass();
        return new Automation.AllocationStrategy(imageHeaderParserUtils, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Automation.AllocationStrategy allocationStrategy = (Automation.AllocationStrategy) obj;
        allocationStrategy.getClass();
        ImageHeaderParserUtils imageHeaderParserUtils = allocationStrategy.f1278type;
        if (imageHeaderParserUtils instanceof Automation$AllocationStrategy$Type$RoundUp) {
            Automation.AllocationStrategy.RoundUp.ADAPTER.encodeWithTag(protoWriter, 1, ((Automation$AllocationStrategy$Type$RoundUp) imageHeaderParserUtils).value);
        } else if (imageHeaderParserUtils instanceof Automation$AllocationStrategy$Type$Fixed) {
            Automation.AllocationStrategy.Fixed.ADAPTER.encodeWithTag(protoWriter, 3, ((Automation$AllocationStrategy$Type$Fixed) imageHeaderParserUtils).value);
        } else if (imageHeaderParserUtils != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(allocationStrategy.unknownFields());
    }
}
