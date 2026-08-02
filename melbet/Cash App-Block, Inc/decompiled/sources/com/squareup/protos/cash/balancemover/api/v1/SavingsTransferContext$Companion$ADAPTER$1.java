package com.squareup.protos.cash.balancemover.api.v1;

import app.cash.local.primitives.DiscountCodeKt;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsTransferContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        DiscountCodeKt discountCodeKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsTransferContext(discountCodeKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 7) {
                discountCodeKt = new SavingsTransferContext$Context$Home((SavingsTransferContext.Home) SavingsTransferContext.Home.ADAPTER.decode(protoReader));
            } else if (nextTag == 8) {
                discountCodeKt = new SavingsTransferContext$Context$GeneralFolder((SavingsTransferContext.GeneralFolder) SavingsTransferContext.GeneralFolder.ADAPTER.decode(protoReader));
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                discountCodeKt = new SavingsTransferContext$Context$GoalFolder((SavingsTransferContext.GoalFolder) SavingsTransferContext.GoalFolder.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsTransferContext savingsTransferContext = (SavingsTransferContext) obj;
        reverseProtoWriter.getClass();
        savingsTransferContext.getClass();
        reverseProtoWriter.writeBytes(savingsTransferContext.unknownFields());
        DiscountCodeKt discountCodeKt = savingsTransferContext.context;
        if (discountCodeKt instanceof SavingsTransferContext$Context$Home) {
            SavingsTransferContext.Home.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((SavingsTransferContext$Context$Home) discountCodeKt).value);
            return;
        }
        if (discountCodeKt instanceof SavingsTransferContext$Context$GeneralFolder) {
            SavingsTransferContext.GeneralFolder.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SavingsTransferContext$Context$GeneralFolder) discountCodeKt).value);
        } else if (discountCodeKt instanceof SavingsTransferContext$Context$GoalFolder) {
            SavingsTransferContext.GoalFolder.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((SavingsTransferContext$Context$GoalFolder) discountCodeKt).value);
        } else {
            if (discountCodeKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SavingsTransferContext savingsTransferContext = (SavingsTransferContext) obj;
        savingsTransferContext.getClass();
        int size$okio = savingsTransferContext.unknownFields().getSize$okio();
        DiscountCodeKt discountCodeKt = savingsTransferContext.context;
        if (discountCodeKt instanceof SavingsTransferContext$Context$Home) {
            encodedSizeWithTag = SavingsTransferContext.Home.ADAPTER.encodedSizeWithTag(7, ((SavingsTransferContext$Context$Home) discountCodeKt).value);
        } else if (discountCodeKt instanceof SavingsTransferContext$Context$GeneralFolder) {
            encodedSizeWithTag = SavingsTransferContext.GeneralFolder.ADAPTER.encodedSizeWithTag(8, ((SavingsTransferContext$Context$GeneralFolder) discountCodeKt).value);
        } else {
            if (!(discountCodeKt instanceof SavingsTransferContext$Context$GoalFolder)) {
                if (discountCodeKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SavingsTransferContext.GoalFolder.ADAPTER.encodedSizeWithTag(9, ((SavingsTransferContext$Context$GoalFolder) discountCodeKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsTransferContext savingsTransferContext = (SavingsTransferContext) obj;
        savingsTransferContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        DiscountCodeKt discountCodeKt = savingsTransferContext.context;
        byteString.getClass();
        return new SavingsTransferContext(discountCodeKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsTransferContext savingsTransferContext = (SavingsTransferContext) obj;
        savingsTransferContext.getClass();
        DiscountCodeKt discountCodeKt = savingsTransferContext.context;
        if (discountCodeKt instanceof SavingsTransferContext$Context$Home) {
            SavingsTransferContext.Home.ADAPTER.encodeWithTag(protoWriter, 7, ((SavingsTransferContext$Context$Home) discountCodeKt).value);
        } else if (discountCodeKt instanceof SavingsTransferContext$Context$GeneralFolder) {
            SavingsTransferContext.GeneralFolder.ADAPTER.encodeWithTag(protoWriter, 8, ((SavingsTransferContext$Context$GeneralFolder) discountCodeKt).value);
        } else if (discountCodeKt instanceof SavingsTransferContext$Context$GoalFolder) {
            SavingsTransferContext.GoalFolder.ADAPTER.encodeWithTag(protoWriter, 9, ((SavingsTransferContext$Context$GoalFolder) discountCodeKt).value);
        } else if (discountCodeKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(savingsTransferContext.unknownFields());
    }
}
