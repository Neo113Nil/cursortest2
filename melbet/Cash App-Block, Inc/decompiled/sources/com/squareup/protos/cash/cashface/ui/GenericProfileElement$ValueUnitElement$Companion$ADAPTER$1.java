package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocationStatus;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ValueUnitElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocationStatus locationStatus = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ValueUnitElement(locationStatus, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                locationStatus = new GenericProfileElement$ValueUnitElement$ValueUnit$Split((GenericProfileElement.ValueUnitElement.Split) GenericProfileElement.ValueUnitElement.Split.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                locationStatus = new GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ValueUnitElement valueUnitElement = (GenericProfileElement.ValueUnitElement) obj;
        reverseProtoWriter.getClass();
        valueUnitElement.getClass();
        reverseProtoWriter.writeBytes(valueUnitElement.unknownFields());
        LocationStatus locationStatus = valueUnitElement.value_unit;
        if (locationStatus instanceof GenericProfileElement$ValueUnitElement$ValueUnit$Split) {
            GenericProfileElement.ValueUnitElement.Split.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GenericProfileElement$ValueUnitElement$ValueUnit$Split) locationStatus).value);
        } else if (locationStatus instanceof GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) locationStatus).value);
        } else {
            if (locationStatus == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GenericProfileElement.ValueUnitElement valueUnitElement = (GenericProfileElement.ValueUnitElement) obj;
        valueUnitElement.getClass();
        int size$okio = valueUnitElement.unknownFields().getSize$okio();
        LocationStatus locationStatus = valueUnitElement.value_unit;
        if (locationStatus instanceof GenericProfileElement$ValueUnitElement$ValueUnit$Split) {
            encodedSizeWithTag = GenericProfileElement.ValueUnitElement.Split.ADAPTER.encodedSizeWithTag(1, ((GenericProfileElement$ValueUnitElement$ValueUnit$Split) locationStatus).value);
        } else {
            if (!(locationStatus instanceof GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText)) {
                if (locationStatus == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) locationStatus).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ValueUnitElement valueUnitElement = (GenericProfileElement.ValueUnitElement) obj;
        valueUnitElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocationStatus locationStatus = valueUnitElement.value_unit;
        byteString.getClass();
        return new GenericProfileElement.ValueUnitElement(locationStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ValueUnitElement valueUnitElement = (GenericProfileElement.ValueUnitElement) obj;
        valueUnitElement.getClass();
        LocationStatus locationStatus = valueUnitElement.value_unit;
        if (locationStatus instanceof GenericProfileElement$ValueUnitElement$ValueUnit$Split) {
            GenericProfileElement.ValueUnitElement.Split.ADAPTER.encodeWithTag(protoWriter, 1, ((GenericProfileElement$ValueUnitElement$ValueUnit$Split) locationStatus).value);
        } else if (locationStatus instanceof GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((GenericProfileElement$ValueUnitElement$ValueUnit$RenderedText) locationStatus).value);
        } else if (locationStatus != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(valueUnitElement.unknownFields());
    }
}
