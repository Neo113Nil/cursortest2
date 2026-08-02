package com.squareup.protos.cash.genericelements.ui;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.RefreshTrigger;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RefreshTrigger$BoostContentUpdateTrigger$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshTrigger.BoostContentUpdateTrigger(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RefreshTrigger.BoostContentUpdateTrigger boostContentUpdateTrigger = (RefreshTrigger.BoostContentUpdateTrigger) obj;
        reverseProtoWriter.getClass();
        boostContentUpdateTrigger.getClass();
        reverseProtoWriter.writeBytes(boostContentUpdateTrigger.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, boostContentUpdateTrigger.boost_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshTrigger.BoostContentUpdateTrigger boostContentUpdateTrigger = (RefreshTrigger.BoostContentUpdateTrigger) obj;
        boostContentUpdateTrigger.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, boostContentUpdateTrigger.boost_tokens) + boostContentUpdateTrigger.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshTrigger.BoostContentUpdateTrigger boostContentUpdateTrigger = (RefreshTrigger.BoostContentUpdateTrigger) obj;
        boostContentUpdateTrigger.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = boostContentUpdateTrigger.boost_tokens;
        list.getClass();
        byteString.getClass();
        return new RefreshTrigger.BoostContentUpdateTrigger(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshTrigger.BoostContentUpdateTrigger boostContentUpdateTrigger = (RefreshTrigger.BoostContentUpdateTrigger) obj;
        boostContentUpdateTrigger.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, boostContentUpdateTrigger.boost_tokens);
        protoWriter.writeBytes(boostContentUpdateTrigger.unknownFields());
    }
}
