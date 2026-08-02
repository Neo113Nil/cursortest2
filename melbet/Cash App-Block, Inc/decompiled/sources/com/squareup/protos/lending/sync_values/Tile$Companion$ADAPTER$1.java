package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.protos.lending.sync_values.Tile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Tile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Tile.AbstractC0074Tile abstractC0074Tile = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Tile(m, (Color) obj, abstractC0074Tile, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(AppSupport.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    abstractC0074Tile = new Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile((BorrowAppletCreditLimitAndBorrowButtonTile.Data) BorrowAppletCreditLimitAndBorrowButtonTile.Data.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    abstractC0074Tile = new Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile((BorrowAppletPaymentTimelineTile.Data) BorrowAppletPaymentTimelineTile.Data.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
                    break;
                case 5:
                    abstractC0074Tile = new Tile.AbstractC0074Tile.BorrowAppletBulletinsTile((BorrowAppletBulletinsTile.Data) BorrowAppletBulletinsTile.Data.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    abstractC0074Tile = new Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile((BorrowAppletLoanHistoryTile.Data) BorrowAppletLoanHistoryTile.Data.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    abstractC0074Tile = new Tile.AbstractC0074Tile.BorrowAppletLinksTile((BorrowAppletLinksTile.Data) BorrowAppletLinksTile.Data.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Tile tile = (Tile) obj;
        reverseProtoWriter.getClass();
        tile.getClass();
        reverseProtoWriter.writeBytes(tile.unknownFields());
        Tile.AbstractC0074Tile abstractC0074Tile = tile.tile;
        if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) {
            BorrowAppletCreditLimitAndBorrowButtonTile.Data.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) {
            BorrowAppletPaymentTimelineTile.Data.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) {
            BorrowAppletBulletinsTile.Data.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) {
            BorrowAppletLoanHistoryTile.Data.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLinksTile) {
            BorrowAppletLinksTile.Data.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((Tile.AbstractC0074Tile.BorrowAppletLinksTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, tile.tint_color);
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, tile.app_supports);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Tile tile = (Tile) obj;
        tile.getClass();
        int encodedSizeWithTag2 = Color.ADAPTER.encodedSizeWithTag(4, tile.tint_color) + AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, tile.app_supports) + tile.unknownFields().getSize$okio();
        Tile.AbstractC0074Tile abstractC0074Tile = tile.tile;
        if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) {
            encodedSizeWithTag = BorrowAppletCreditLimitAndBorrowButtonTile.Data.ADAPTER.encodedSizeWithTag(2, ((Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) {
            encodedSizeWithTag = BorrowAppletPaymentTimelineTile.Data.ADAPTER.encodedSizeWithTag(3, ((Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) {
            encodedSizeWithTag = BorrowAppletBulletinsTile.Data.ADAPTER.encodedSizeWithTag(5, ((Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) {
            encodedSizeWithTag = BorrowAppletLoanHistoryTile.Data.ADAPTER.encodedSizeWithTag(6, ((Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile).value);
        } else {
            if (!(abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLinksTile)) {
                if (abstractC0074Tile == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = BorrowAppletLinksTile.Data.ADAPTER.encodedSizeWithTag(7, ((Tile.AbstractC0074Tile.BorrowAppletLinksTile) abstractC0074Tile).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Tile tile = (Tile) obj;
        tile.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(tile.app_supports, AppSupport.ADAPTER);
        Color color = tile.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Tile.AbstractC0074Tile abstractC0074Tile = tile.tile;
        byteString.getClass();
        return new Tile(m1169redactElements, color2, abstractC0074Tile, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Tile tile = (Tile) obj;
        tile.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, tile.app_supports);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, tile.tint_color);
        Tile.AbstractC0074Tile abstractC0074Tile = tile.tile;
        if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) {
            BorrowAppletCreditLimitAndBorrowButtonTile.Data.ADAPTER.encodeWithTag(protoWriter, 2, ((Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) {
            BorrowAppletPaymentTimelineTile.Data.ADAPTER.encodeWithTag(protoWriter, 3, ((Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) {
            BorrowAppletBulletinsTile.Data.ADAPTER.encodeWithTag(protoWriter, 5, ((Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) {
            BorrowAppletLoanHistoryTile.Data.ADAPTER.encodeWithTag(protoWriter, 6, ((Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLinksTile) {
            BorrowAppletLinksTile.Data.ADAPTER.encodeWithTag(protoWriter, 7, ((Tile.AbstractC0074Tile.BorrowAppletLinksTile) abstractC0074Tile).value);
        } else if (abstractC0074Tile != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(tile.unknownFields());
    }
}
