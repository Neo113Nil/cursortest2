package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstantPayRenderData$InstantPayout$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantPayRenderData.InstantPayout((String) obj, (Money) obj2, (LocalizableString) obj3, (LocalizableString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstantPayRenderData.InstantPayout instantPayout = (InstantPayRenderData.InstantPayout) obj;
        reverseProtoWriter.getClass();
        instantPayout.getClass();
        reverseProtoWriter.writeBytes(instantPayout.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, instantPayout.localizable_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, instantPayout.localizable_name);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, instantPayout.amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, instantPayout.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantPayRenderData.InstantPayout instantPayout = (InstantPayRenderData.InstantPayout) obj;
        instantPayout.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, instantPayout.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, instantPayout.name) + instantPayout.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, instantPayout.localizable_amount) + protoAdapter.encodedSizeWithTag(3, instantPayout.localizable_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantPayRenderData.InstantPayout instantPayout = (InstantPayRenderData.InstantPayout) obj;
        instantPayout.getClass();
        Money money = instantPayout.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizableString localizableString = instantPayout.localizable_name;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = instantPayout.localizable_amount;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = instantPayout.name;
        byteString.getClass();
        return new InstantPayRenderData.InstantPayout(str, money2, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantPayRenderData.InstantPayout instantPayout = (InstantPayRenderData.InstantPayout) obj;
        instantPayout.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, instantPayout.name);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, instantPayout.amount);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, instantPayout.localizable_name);
        protoAdapter.encodeWithTag(protoWriter, 4, instantPayout.localizable_amount);
        protoWriter.writeBytes(instantPayout.unknownFields());
    }
}
