package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletEntrypoint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        TableQrCodeScannerViewKt afterpayAppletEntrypoint$Entrypoint$Ineligible;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletEntrypoint((LocalizedString) obj, tableQrCodeScannerViewKt, (AnalyticsEvent) obj2, (AnalyticsEvent) obj3, (AfterpayAppletEntrypoint.TileConfiguration) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$Ineligible((AfterpayAppletEntrypoint.Ineligible) AfterpayAppletEntrypoint.Ineligible.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$CreditBalance((AfterpayAppletEntrypoint.CreditBalance) AfterpayAppletEntrypoint.CreditBalance.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$OverDue((AfterpayAppletEntrypoint.Overdue) AfterpayAppletEntrypoint.Overdue.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
                    continue;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
                    continue;
                case 7:
                    try {
                        obj4 = AfterpayAppletEntrypoint.TileConfiguration.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$CreditDetails((AfterpayAppletEntrypoint.CreditDetails) AfterpayAppletEntrypoint.CreditDetails.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$Uninstalled((AfterpayAppletEntrypoint.Uninstalled) AfterpayAppletEntrypoint.Uninstalled.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled((AfterpayAppletEntrypoint.V3Uninstalled) AfterpayAppletEntrypoint.V3Uninstalled.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief((AfterpayAppletEntrypoint.V3LoanBrief) AfterpayAppletEntrypoint.V3LoanBrief.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    afterpayAppletEntrypoint$Entrypoint$Ineligible = new AfterpayAppletEntrypoint$Entrypoint$V3TextBrief((AfterpayAppletEntrypoint.V3TextBrief) AfterpayAppletEntrypoint.V3TextBrief.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            tableQrCodeScannerViewKt = afterpayAppletEntrypoint$Entrypoint$Ineligible;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = (AfterpayAppletEntrypoint) obj;
        reverseProtoWriter.getClass();
        afterpayAppletEntrypoint.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletEntrypoint.unknownFields());
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = afterpayAppletEntrypoint.entrypoint;
        if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Ineligible) {
            AfterpayAppletEntrypoint.Ineligible.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AfterpayAppletEntrypoint$Entrypoint$Ineligible) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditBalance) {
            AfterpayAppletEntrypoint.CreditBalance.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((AfterpayAppletEntrypoint$Entrypoint$CreditBalance) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$OverDue) {
            AfterpayAppletEntrypoint.Overdue.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((AfterpayAppletEntrypoint$Entrypoint$OverDue) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditDetails) {
            AfterpayAppletEntrypoint.CreditDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((AfterpayAppletEntrypoint$Entrypoint$CreditDetails) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Uninstalled) {
            AfterpayAppletEntrypoint.Uninstalled.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((AfterpayAppletEntrypoint$Entrypoint$Uninstalled) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) {
            AfterpayAppletEntrypoint.V3Uninstalled.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) {
            AfterpayAppletEntrypoint.V3LoanBrief.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) {
            AfterpayAppletEntrypoint.V3TextBrief.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AfterpayAppletEntrypoint.TileConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 7, afterpayAppletEntrypoint.tile_configuration);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, afterpayAppletEntrypoint.analytic_tap_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, afterpayAppletEntrypoint.analytic_view_event);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayAppletEntrypoint.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = (AfterpayAppletEntrypoint) obj;
        afterpayAppletEntrypoint.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(1, afterpayAppletEntrypoint.title) + afterpayAppletEntrypoint.unknownFields().getSize$okio();
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = afterpayAppletEntrypoint.entrypoint;
        if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Ineligible) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.Ineligible.ADAPTER.encodedSizeWithTag(2, ((AfterpayAppletEntrypoint$Entrypoint$Ineligible) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditBalance) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.CreditBalance.ADAPTER.encodedSizeWithTag(3, ((AfterpayAppletEntrypoint$Entrypoint$CreditBalance) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$OverDue) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.Overdue.ADAPTER.encodedSizeWithTag(4, ((AfterpayAppletEntrypoint$Entrypoint$OverDue) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditDetails) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.CreditDetails.ADAPTER.encodedSizeWithTag(8, ((AfterpayAppletEntrypoint$Entrypoint$CreditDetails) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Uninstalled) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.Uninstalled.ADAPTER.encodedSizeWithTag(9, ((AfterpayAppletEntrypoint$Entrypoint$Uninstalled) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.V3Uninstalled.ADAPTER.encodedSizeWithTag(10, ((AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) {
            encodedSizeWithTag = AfterpayAppletEntrypoint.V3LoanBrief.ADAPTER.encodedSizeWithTag(11, ((AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) tableQrCodeScannerViewKt).value);
        } else {
            if (!(tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3TextBrief)) {
                if (tableQrCodeScannerViewKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
                return AfterpayAppletEntrypoint.TileConfiguration.ADAPTER.encodedSizeWithTag(7, afterpayAppletEntrypoint.tile_configuration) + protoAdapter.encodedSizeWithTag(6, afterpayAppletEntrypoint.analytic_tap_event) + protoAdapter.encodedSizeWithTag(5, afterpayAppletEntrypoint.analytic_view_event) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = AfterpayAppletEntrypoint.V3TextBrief.ADAPTER.encodedSizeWithTag(12, ((AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) tableQrCodeScannerViewKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return AfterpayAppletEntrypoint.TileConfiguration.ADAPTER.encodedSizeWithTag(7, afterpayAppletEntrypoint.tile_configuration) + protoAdapter2.encodedSizeWithTag(6, afterpayAppletEntrypoint.analytic_tap_event) + protoAdapter2.encodedSizeWithTag(5, afterpayAppletEntrypoint.analytic_view_event) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = (AfterpayAppletEntrypoint) obj;
        afterpayAppletEntrypoint.getClass();
        LocalizedString localizedString = afterpayAppletEntrypoint.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        AnalyticsEvent analyticsEvent = afterpayAppletEntrypoint.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = afterpayAppletEntrypoint.analytic_tap_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = afterpayAppletEntrypoint.entrypoint;
        AfterpayAppletEntrypoint.TileConfiguration tileConfiguration = afterpayAppletEntrypoint.tile_configuration;
        byteString.getClass();
        return new AfterpayAppletEntrypoint(localizedString2, tableQrCodeScannerViewKt, analyticsEvent2, analyticsEvent4, tileConfiguration, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = (AfterpayAppletEntrypoint) obj;
        afterpayAppletEntrypoint.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, afterpayAppletEntrypoint.title);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, afterpayAppletEntrypoint.analytic_view_event);
        protoAdapter.encodeWithTag(protoWriter, 6, afterpayAppletEntrypoint.analytic_tap_event);
        AfterpayAppletEntrypoint.TileConfiguration.ADAPTER.encodeWithTag(protoWriter, 7, afterpayAppletEntrypoint.tile_configuration);
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = afterpayAppletEntrypoint.entrypoint;
        if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Ineligible) {
            AfterpayAppletEntrypoint.Ineligible.ADAPTER.encodeWithTag(protoWriter, 2, ((AfterpayAppletEntrypoint$Entrypoint$Ineligible) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditBalance) {
            AfterpayAppletEntrypoint.CreditBalance.ADAPTER.encodeWithTag(protoWriter, 3, ((AfterpayAppletEntrypoint$Entrypoint$CreditBalance) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$OverDue) {
            AfterpayAppletEntrypoint.Overdue.ADAPTER.encodeWithTag(protoWriter, 4, ((AfterpayAppletEntrypoint$Entrypoint$OverDue) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditDetails) {
            AfterpayAppletEntrypoint.CreditDetails.ADAPTER.encodeWithTag(protoWriter, 8, ((AfterpayAppletEntrypoint$Entrypoint$CreditDetails) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Uninstalled) {
            AfterpayAppletEntrypoint.Uninstalled.ADAPTER.encodeWithTag(protoWriter, 9, ((AfterpayAppletEntrypoint$Entrypoint$Uninstalled) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) {
            AfterpayAppletEntrypoint.V3Uninstalled.ADAPTER.encodeWithTag(protoWriter, 10, ((AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) {
            AfterpayAppletEntrypoint.V3LoanBrief.ADAPTER.encodeWithTag(protoWriter, 11, ((AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) {
            AfterpayAppletEntrypoint.V3TextBrief.ADAPTER.encodeWithTag(protoWriter, 12, ((AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) tableQrCodeScannerViewKt).value);
        } else if (tableQrCodeScannerViewKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(afterpayAppletEntrypoint.unknownFields());
    }
}
