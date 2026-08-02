package com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1;

import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BitcoinP2pConversionPercentageInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BitcoinP2pConversionPercentageInputs((BitcoinP2pConversionPercentageInputs.SubmissionInteraction) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BitcoinP2pConversionPercentageInputs.SubmissionInteraction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = (BitcoinP2pConversionPercentageInputs) obj;
        reverseProtoWriter.getClass();
        bitcoinP2pConversionPercentageInputs.getClass();
        reverseProtoWriter.writeBytes(bitcoinP2pConversionPercentageInputs.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, bitcoinP2pConversionPercentageInputs.selected_percentage_bps);
        BitcoinP2pConversionPercentageInputs.SubmissionInteraction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bitcoinP2pConversionPercentageInputs.submission_interaction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = (BitcoinP2pConversionPercentageInputs) obj;
        bitcoinP2pConversionPercentageInputs.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, bitcoinP2pConversionPercentageInputs.selected_percentage_bps) + BitcoinP2pConversionPercentageInputs.SubmissionInteraction.ADAPTER.encodedSizeWithTag(1, bitcoinP2pConversionPercentageInputs.submission_interaction) + bitcoinP2pConversionPercentageInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = (BitcoinP2pConversionPercentageInputs) obj;
        bitcoinP2pConversionPercentageInputs.getClass();
        ByteString byteString = ByteString.EMPTY;
        BitcoinP2pConversionPercentageInputs.SubmissionInteraction submissionInteraction = bitcoinP2pConversionPercentageInputs.submission_interaction;
        Long l = bitcoinP2pConversionPercentageInputs.selected_percentage_bps;
        byteString.getClass();
        return new BitcoinP2pConversionPercentageInputs(submissionInteraction, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = (BitcoinP2pConversionPercentageInputs) obj;
        bitcoinP2pConversionPercentageInputs.getClass();
        BitcoinP2pConversionPercentageInputs.SubmissionInteraction.ADAPTER.encodeWithTag(protoWriter, 1, bitcoinP2pConversionPercentageInputs.submission_interaction);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, bitcoinP2pConversionPercentageInputs.selected_percentage_bps);
        protoWriter.writeBytes(bitcoinP2pConversionPercentageInputs.unknownFields());
    }
}
