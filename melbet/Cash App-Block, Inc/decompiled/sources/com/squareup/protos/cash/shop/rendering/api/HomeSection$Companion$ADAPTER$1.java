package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HomeSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzku homeSection$Content$PillSection;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        zzku zzkuVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HomeSection((AnalyticsEvent) obj, (SectionHeader) obj2, (String) obj3, zzkuVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(SectionHeader.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    homeSection$Content$PillSection = new HomeSection$Content$PillSection((PillSection) PillSection.ADAPTER.decode(protoReader));
                    break;
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
                case 6:
                    homeSection$Content$PillSection = new HomeSection$Content$HeroSection((HeroSection) HeroSection.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    homeSection$Content$PillSection = new HomeSection$Content$TileSection((CategoryTileSection) CategoryTileSection.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    homeSection$Content$PillSection = new HomeSection$Content$ClusterSection((ClusterSection) ClusterSection.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    homeSection$Content$PillSection = new HomeSection$Content$CloClusterSection((CLOClusterSection) CLOClusterSection.ADAPTER.decode(protoReader));
                    break;
            }
            zzkuVar = homeSection$Content$PillSection;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HomeSection homeSection = (HomeSection) obj;
        reverseProtoWriter.getClass();
        homeSection.getClass();
        reverseProtoWriter.writeBytes(homeSection.unknownFields());
        zzku zzkuVar = homeSection.content;
        if (zzkuVar instanceof HomeSection$Content$PillSection) {
            PillSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((HomeSection$Content$PillSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$HeroSection) {
            HeroSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((HomeSection$Content$HeroSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$TileSection) {
            CategoryTileSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((HomeSection$Content$TileSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$ClusterSection) {
            ClusterSection.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((HomeSection$Content$ClusterSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$CloClusterSection) {
            CLOClusterSection.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((HomeSection$Content$CloClusterSection) zzkuVar).value);
        } else if (zzkuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, homeSection.section_id);
        SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, homeSection.section_header);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, homeSection.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HomeSection homeSection = (HomeSection) obj;
        homeSection.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, homeSection.section_id) + SectionHeader.ADAPTER.encodedSizeWithTag(2, homeSection.section_header) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, homeSection.analytics_view_event) + homeSection.unknownFields().getSize$okio();
        zzku zzkuVar = homeSection.content;
        if (zzkuVar instanceof HomeSection$Content$PillSection) {
            return PillSection.ADAPTER.encodedSizeWithTag(4, ((HomeSection$Content$PillSection) zzkuVar).value) + encodedSizeWithTag;
        }
        if (zzkuVar instanceof HomeSection$Content$HeroSection) {
            return HeroSection.ADAPTER.encodedSizeWithTag(6, ((HomeSection$Content$HeroSection) zzkuVar).value) + encodedSizeWithTag;
        }
        if (zzkuVar instanceof HomeSection$Content$TileSection) {
            return CategoryTileSection.ADAPTER.encodedSizeWithTag(7, ((HomeSection$Content$TileSection) zzkuVar).value) + encodedSizeWithTag;
        }
        if (zzkuVar instanceof HomeSection$Content$ClusterSection) {
            return ClusterSection.ADAPTER.encodedSizeWithTag(8, ((HomeSection$Content$ClusterSection) zzkuVar).value) + encodedSizeWithTag;
        }
        if (zzkuVar instanceof HomeSection$Content$CloClusterSection) {
            return CLOClusterSection.ADAPTER.encodedSizeWithTag(9, ((HomeSection$Content$CloClusterSection) zzkuVar).value) + encodedSizeWithTag;
        }
        if (zzkuVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HomeSection homeSection = (HomeSection) obj;
        homeSection.getClass();
        AnalyticsEvent analyticsEvent = homeSection.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        SectionHeader sectionHeader = homeSection.section_header;
        SectionHeader sectionHeader2 = sectionHeader != null ? (SectionHeader) SectionHeader.ADAPTER.redact(sectionHeader) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = homeSection.section_id;
        zzku zzkuVar = homeSection.content;
        byteString.getClass();
        return new HomeSection(analyticsEvent2, sectionHeader2, str, zzkuVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HomeSection homeSection = (HomeSection) obj;
        homeSection.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, homeSection.analytics_view_event);
        SectionHeader.ADAPTER.encodeWithTag(protoWriter, 2, homeSection.section_header);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, homeSection.section_id);
        zzku zzkuVar = homeSection.content;
        if (zzkuVar instanceof HomeSection$Content$PillSection) {
            PillSection.ADAPTER.encodeWithTag(protoWriter, 4, ((HomeSection$Content$PillSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$HeroSection) {
            HeroSection.ADAPTER.encodeWithTag(protoWriter, 6, ((HomeSection$Content$HeroSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$TileSection) {
            CategoryTileSection.ADAPTER.encodeWithTag(protoWriter, 7, ((HomeSection$Content$TileSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$ClusterSection) {
            ClusterSection.ADAPTER.encodeWithTag(protoWriter, 8, ((HomeSection$Content$ClusterSection) zzkuVar).value);
        } else if (zzkuVar instanceof HomeSection$Content$CloClusterSection) {
            CLOClusterSection.ADAPTER.encodeWithTag(protoWriter, 9, ((HomeSection$Content$CloClusterSection) zzkuVar).value);
        } else if (zzkuVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(homeSection.unknownFields());
    }
}
