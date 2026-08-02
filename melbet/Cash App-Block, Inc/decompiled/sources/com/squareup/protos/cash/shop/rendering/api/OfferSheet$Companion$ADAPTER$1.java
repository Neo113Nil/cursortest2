package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzkw zzkwVar = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferSheet(zzkwVar, (AnalyticsEvent) obj, (AnalyticsEvent) obj2, (LocalizedString) obj3, (StyledText) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzkwVar = new OfferSheet$Sheet$MultiSheet((MultiOffersSheet) MultiOffersSheet.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzkwVar = new OfferSheet$Sheet$DetailSheet((OfferDetailSheet) OfferDetailSheet.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzkwVar = new OfferSheet$Sheet$TimelineSheet((OfferTimelineSheet) OfferTimelineSheet.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    zzkwVar = new OfferSheet$Sheet$DetailListSheet((OfferDetailListSheet) OfferDetailListSheet.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferSheet offerSheet = (OfferSheet) obj;
        reverseProtoWriter.getClass();
        offerSheet.getClass();
        reverseProtoWriter.writeBytes(offerSheet.unknownFields());
        zzkw zzkwVar = offerSheet.sheet;
        if (zzkwVar instanceof OfferSheet$Sheet$MultiSheet) {
            MultiOffersSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((OfferSheet$Sheet$MultiSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$DetailSheet) {
            OfferDetailSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OfferSheet$Sheet$DetailSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$TimelineSheet) {
            OfferTimelineSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OfferSheet$Sheet$TimelineSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$DetailListSheet) {
            OfferDetailListSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((OfferSheet$Sheet$DetailListSheet) zzkwVar).value);
        } else if (zzkwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 6, offerSheet.footer_markdown_text);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, offerSheet.l_footer_markdown_text);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, offerSheet.analytics_dismiss_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, offerSheet.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OfferSheet offerSheet = (OfferSheet) obj;
        offerSheet.getClass();
        int size$okio = offerSheet.unknownFields().getSize$okio();
        zzkw zzkwVar = offerSheet.sheet;
        if (zzkwVar instanceof OfferSheet$Sheet$MultiSheet) {
            encodedSizeWithTag = MultiOffersSheet.ADAPTER.encodedSizeWithTag(1, ((OfferSheet$Sheet$MultiSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$DetailSheet) {
            encodedSizeWithTag = OfferDetailSheet.ADAPTER.encodedSizeWithTag(2, ((OfferSheet$Sheet$DetailSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$TimelineSheet) {
            encodedSizeWithTag = OfferTimelineSheet.ADAPTER.encodedSizeWithTag(3, ((OfferSheet$Sheet$TimelineSheet) zzkwVar).value);
        } else {
            if (!(zzkwVar instanceof OfferSheet$Sheet$DetailListSheet)) {
                if (zzkwVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
                return StyledText.ADAPTER.encodedSizeWithTag(6, offerSheet.footer_markdown_text) + LocalizedString.ADAPTER.encodedSizeWithTag(8, offerSheet.l_footer_markdown_text) + protoAdapter.encodedSizeWithTag(5, offerSheet.analytics_dismiss_event) + protoAdapter.encodedSizeWithTag(4, offerSheet.analytics_view_event) + size$okio;
            }
            encodedSizeWithTag = OfferDetailListSheet.ADAPTER.encodedSizeWithTag(7, ((OfferSheet$Sheet$DetailListSheet) zzkwVar).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return StyledText.ADAPTER.encodedSizeWithTag(6, offerSheet.footer_markdown_text) + LocalizedString.ADAPTER.encodedSizeWithTag(8, offerSheet.l_footer_markdown_text) + protoAdapter2.encodedSizeWithTag(5, offerSheet.analytics_dismiss_event) + protoAdapter2.encodedSizeWithTag(4, offerSheet.analytics_view_event) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferSheet offerSheet = (OfferSheet) obj;
        offerSheet.getClass();
        AnalyticsEvent analyticsEvent = offerSheet.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = offerSheet.analytics_dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        LocalizedString localizedString = offerSheet.l_footer_markdown_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        StyledText styledText = offerSheet.footer_markdown_text;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ByteString byteString = ByteString.EMPTY;
        zzkw zzkwVar = offerSheet.sheet;
        byteString.getClass();
        return new OfferSheet(zzkwVar, analyticsEvent2, analyticsEvent4, localizedString2, styledText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferSheet offerSheet = (OfferSheet) obj;
        offerSheet.getClass();
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, offerSheet.analytics_view_event);
        protoAdapter.encodeWithTag(protoWriter, 5, offerSheet.analytics_dismiss_event);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, offerSheet.l_footer_markdown_text);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 6, offerSheet.footer_markdown_text);
        zzkw zzkwVar = offerSheet.sheet;
        if (zzkwVar instanceof OfferSheet$Sheet$MultiSheet) {
            MultiOffersSheet.ADAPTER.encodeWithTag(protoWriter, 1, ((OfferSheet$Sheet$MultiSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$DetailSheet) {
            OfferDetailSheet.ADAPTER.encodeWithTag(protoWriter, 2, ((OfferSheet$Sheet$DetailSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$TimelineSheet) {
            OfferTimelineSheet.ADAPTER.encodeWithTag(protoWriter, 3, ((OfferSheet$Sheet$TimelineSheet) zzkwVar).value);
        } else if (zzkwVar instanceof OfferSheet$Sheet$DetailListSheet) {
            OfferDetailListSheet.ADAPTER.encodeWithTag(protoWriter, 7, ((OfferSheet$Sheet$DetailListSheet) zzkwVar).value);
        } else if (zzkwVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(offerSheet.unknownFields());
    }
}
