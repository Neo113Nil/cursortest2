package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.toolbar.LocalToolbarKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = null;
        zzuv zzuvVar = null;
        LocalToolbarKt localToolbarKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection(appletCardSection$Header$StandardHeader, zzuvVar, localToolbarKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    appletCardSection$Header$StandardHeader = new AppletCardSection$Header$StandardHeader((AppletCardSection.StandardHeader) AppletCardSection.StandardHeader.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzuvVar = new AppletCardSection$Content$TransactionList((AppletCardSection.TransactionList) AppletCardSection.TransactionList.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzuvVar = new AppletCardSection$Content$TileCarousel((AppletCardSection.TileCarousel) AppletCardSection.TileCarousel.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzuvVar = new AppletCardSection$Content$ImageTextContent((AppletCardSection.ImageTextContent) AppletCardSection.ImageTextContent.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    localToolbarKt = new AppletCardSection$Footer$TappableFooter((AppletCardSection.TappableFooter) AppletCardSection.TappableFooter.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    localToolbarKt = new AppletCardSection$Footer$ButtonTextFooter((AppletCardSection.ButtonTextFooter) AppletCardSection.ButtonTextFooter.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    localToolbarKt = new AppletCardSection$Footer$AvatarTextFooter((AppletCardSection.AvatarTextFooter) AppletCardSection.AvatarTextFooter.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection appletCardSection = (AppletCardSection) obj;
        reverseProtoWriter.getClass();
        appletCardSection.getClass();
        reverseProtoWriter.writeBytes(appletCardSection.unknownFields());
        LocalToolbarKt localToolbarKt = appletCardSection.footer;
        if (localToolbarKt instanceof AppletCardSection$Footer$TappableFooter) {
            AppletCardSection.TappableFooter.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((AppletCardSection$Footer$TappableFooter) localToolbarKt).value);
        } else if (localToolbarKt instanceof AppletCardSection$Footer$ButtonTextFooter) {
            AppletCardSection.ButtonTextFooter.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((AppletCardSection$Footer$ButtonTextFooter) localToolbarKt).value);
        } else if (localToolbarKt instanceof AppletCardSection$Footer$AvatarTextFooter) {
            AppletCardSection.AvatarTextFooter.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((AppletCardSection$Footer$AvatarTextFooter) localToolbarKt).value);
        } else if (localToolbarKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzuv zzuvVar = appletCardSection.content;
        if (zzuvVar instanceof AppletCardSection$Content$TransactionList) {
            AppletCardSection.TransactionList.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AppletCardSection$Content$TransactionList) zzuvVar).value);
        } else if (zzuvVar instanceof AppletCardSection$Content$TileCarousel) {
            AppletCardSection.TileCarousel.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((AppletCardSection$Content$TileCarousel) zzuvVar).value);
        } else if (zzuvVar instanceof AppletCardSection$Content$ImageTextContent) {
            AppletCardSection.ImageTextContent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((AppletCardSection$Content$ImageTextContent) zzuvVar).value);
        } else if (zzuvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = appletCardSection.header;
        if (appletCardSection$Header$StandardHeader != null) {
            AppletCardSection.StandardHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appletCardSection$Header$StandardHeader.value);
        } else {
            if (appletCardSection$Header$StandardHeader == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalToolbarKt localToolbarKt;
        int encodedSizeWithTag2;
        AppletCardSection appletCardSection = (AppletCardSection) obj;
        appletCardSection.getClass();
        int size$okio = appletCardSection.unknownFields().getSize$okio();
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = appletCardSection.header;
        if (appletCardSection$Header$StandardHeader != null) {
            size$okio += AppletCardSection.StandardHeader.ADAPTER.encodedSizeWithTag(1, appletCardSection$Header$StandardHeader.value);
        } else if (appletCardSection$Header$StandardHeader != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        zzuv zzuvVar = appletCardSection.content;
        if (zzuvVar instanceof AppletCardSection$Content$TransactionList) {
            encodedSizeWithTag = AppletCardSection.TransactionList.ADAPTER.encodedSizeWithTag(2, ((AppletCardSection$Content$TransactionList) zzuvVar).value);
        } else if (zzuvVar instanceof AppletCardSection$Content$TileCarousel) {
            encodedSizeWithTag = AppletCardSection.TileCarousel.ADAPTER.encodedSizeWithTag(3, ((AppletCardSection$Content$TileCarousel) zzuvVar).value);
        } else {
            if (!(zzuvVar instanceof AppletCardSection$Content$ImageTextContent)) {
                if (zzuvVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                localToolbarKt = appletCardSection.footer;
                if (!(localToolbarKt instanceof AppletCardSection$Footer$TappableFooter)) {
                    encodedSizeWithTag2 = AppletCardSection.TappableFooter.ADAPTER.encodedSizeWithTag(5, ((AppletCardSection$Footer$TappableFooter) localToolbarKt).value);
                } else if (localToolbarKt instanceof AppletCardSection$Footer$ButtonTextFooter) {
                    encodedSizeWithTag2 = AppletCardSection.ButtonTextFooter.ADAPTER.encodedSizeWithTag(6, ((AppletCardSection$Footer$ButtonTextFooter) localToolbarKt).value);
                } else {
                    if (!(localToolbarKt instanceof AppletCardSection$Footer$AvatarTextFooter)) {
                        if (localToolbarKt == null) {
                            return size$okio;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag2 = AppletCardSection.AvatarTextFooter.ADAPTER.encodedSizeWithTag(7, ((AppletCardSection$Footer$AvatarTextFooter) localToolbarKt).value);
                }
                return encodedSizeWithTag2 + size$okio;
            }
            encodedSizeWithTag = AppletCardSection.ImageTextContent.ADAPTER.encodedSizeWithTag(4, ((AppletCardSection$Content$ImageTextContent) zzuvVar).value);
        }
        size$okio += encodedSizeWithTag;
        localToolbarKt = appletCardSection.footer;
        if (!(localToolbarKt instanceof AppletCardSection$Footer$TappableFooter)) {
        }
        return encodedSizeWithTag2 + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection appletCardSection = (AppletCardSection) obj;
        appletCardSection.getClass();
        ByteString byteString = ByteString.EMPTY;
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = appletCardSection.header;
        zzuv zzuvVar = appletCardSection.content;
        LocalToolbarKt localToolbarKt = appletCardSection.footer;
        byteString.getClass();
        return new AppletCardSection(appletCardSection$Header$StandardHeader, zzuvVar, localToolbarKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection appletCardSection = (AppletCardSection) obj;
        appletCardSection.getClass();
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = appletCardSection.header;
        if (appletCardSection$Header$StandardHeader != null) {
            AppletCardSection.StandardHeader.ADAPTER.encodeWithTag(protoWriter, 1, appletCardSection$Header$StandardHeader.value);
        } else if (appletCardSection$Header$StandardHeader != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzuv zzuvVar = appletCardSection.content;
        if (zzuvVar instanceof AppletCardSection$Content$TransactionList) {
            AppletCardSection.TransactionList.ADAPTER.encodeWithTag(protoWriter, 2, ((AppletCardSection$Content$TransactionList) zzuvVar).value);
        } else if (zzuvVar instanceof AppletCardSection$Content$TileCarousel) {
            AppletCardSection.TileCarousel.ADAPTER.encodeWithTag(protoWriter, 3, ((AppletCardSection$Content$TileCarousel) zzuvVar).value);
        } else if (zzuvVar instanceof AppletCardSection$Content$ImageTextContent) {
            AppletCardSection.ImageTextContent.ADAPTER.encodeWithTag(protoWriter, 4, ((AppletCardSection$Content$ImageTextContent) zzuvVar).value);
        } else if (zzuvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalToolbarKt localToolbarKt = appletCardSection.footer;
        if (localToolbarKt instanceof AppletCardSection$Footer$TappableFooter) {
            AppletCardSection.TappableFooter.ADAPTER.encodeWithTag(protoWriter, 5, ((AppletCardSection$Footer$TappableFooter) localToolbarKt).value);
        } else if (localToolbarKt instanceof AppletCardSection$Footer$ButtonTextFooter) {
            AppletCardSection.ButtonTextFooter.ADAPTER.encodeWithTag(protoWriter, 6, ((AppletCardSection$Footer$ButtonTextFooter) localToolbarKt).value);
        } else if (localToolbarKt instanceof AppletCardSection$Footer$AvatarTextFooter) {
            AppletCardSection.AvatarTextFooter.ADAPTER.encodeWithTag(protoWriter, 7, ((AppletCardSection$Footer$AvatarTextFooter) localToolbarKt).value);
        } else if (localToolbarKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(appletCardSection.unknownFields());
    }
}
