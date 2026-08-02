package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        LocalComposeUiKt localComposeUiKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContextWrapper.Origin((ContextWrapper.Origin.OriginType) obj, localComposeUiKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = ContextWrapper.Origin.OriginType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$AccountLink((ContextWrapper.Origin.AccountLink) ContextWrapper.Origin.AccountLink.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$OfferDeepLink((ContextWrapper.Origin.OfferDeepLink) ContextWrapper.Origin.OfferDeepLink.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$DiscoverTab((ContextWrapper.Origin.DiscoverTab) ContextWrapper.Origin.DiscoverTab.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$ActivityTab((ContextWrapper.Origin.ActivityTab) ContextWrapper.Origin.ActivityTab.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$DiscoverSearch((ContextWrapper.Origin.DiscoverSearch) ContextWrapper.Origin.DiscoverSearch.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$BlockedBusinesses((ContextWrapper.Origin.BlockedBusinesses) ContextWrapper.Origin.BlockedBusinesses.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    localComposeUiKt = new ContextWrapper$Origin$Origin$BillsAndSubscriptions((ContextWrapper.Origin.BillsAndSubscriptions) ContextWrapper.Origin.BillsAndSubscriptions.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContextWrapper.Origin origin = (ContextWrapper.Origin) obj;
        reverseProtoWriter.getClass();
        origin.getClass();
        reverseProtoWriter.writeBytes(origin.unknownFields());
        LocalComposeUiKt localComposeUiKt = origin.origin;
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$AccountLink) {
            ContextWrapper.Origin.AccountLink.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ContextWrapper$Origin$Origin$AccountLink) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$OfferDeepLink) {
            ContextWrapper.Origin.OfferDeepLink.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ContextWrapper$Origin$Origin$OfferDeepLink) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$DiscoverTab) {
            ContextWrapper.Origin.DiscoverTab.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ContextWrapper$Origin$Origin$DiscoverTab) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$ActivityTab) {
            ContextWrapper.Origin.ActivityTab.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ContextWrapper$Origin$Origin$ActivityTab) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$DiscoverSearch) {
            ContextWrapper.Origin.DiscoverSearch.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ContextWrapper$Origin$Origin$DiscoverSearch) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$BlockedBusinesses) {
            ContextWrapper.Origin.BlockedBusinesses.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ContextWrapper$Origin$Origin$BlockedBusinesses) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$BillsAndSubscriptions) {
            ContextWrapper.Origin.BillsAndSubscriptions.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ContextWrapper$Origin$Origin$BillsAndSubscriptions) localComposeUiKt).value);
        } else if (localComposeUiKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ContextWrapper.Origin.OriginType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, origin.f1248type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContextWrapper.Origin origin = (ContextWrapper.Origin) obj;
        origin.getClass();
        int encodedSizeWithTag = ContextWrapper.Origin.OriginType.ADAPTER.encodedSizeWithTag(1, origin.f1248type) + origin.unknownFields().getSize$okio();
        LocalComposeUiKt localComposeUiKt = origin.origin;
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$AccountLink) {
            return ContextWrapper.Origin.AccountLink.ADAPTER.encodedSizeWithTag(2, ((ContextWrapper$Origin$Origin$AccountLink) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$OfferDeepLink) {
            return ContextWrapper.Origin.OfferDeepLink.ADAPTER.encodedSizeWithTag(3, ((ContextWrapper$Origin$Origin$OfferDeepLink) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$DiscoverTab) {
            return ContextWrapper.Origin.DiscoverTab.ADAPTER.encodedSizeWithTag(4, ((ContextWrapper$Origin$Origin$DiscoverTab) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$ActivityTab) {
            return ContextWrapper.Origin.ActivityTab.ADAPTER.encodedSizeWithTag(5, ((ContextWrapper$Origin$Origin$ActivityTab) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$DiscoverSearch) {
            return ContextWrapper.Origin.DiscoverSearch.ADAPTER.encodedSizeWithTag(6, ((ContextWrapper$Origin$Origin$DiscoverSearch) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$BlockedBusinesses) {
            return ContextWrapper.Origin.BlockedBusinesses.ADAPTER.encodedSizeWithTag(7, ((ContextWrapper$Origin$Origin$BlockedBusinesses) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$BillsAndSubscriptions) {
            return ContextWrapper.Origin.BillsAndSubscriptions.ADAPTER.encodedSizeWithTag(8, ((ContextWrapper$Origin$Origin$BillsAndSubscriptions) localComposeUiKt).value) + encodedSizeWithTag;
        }
        if (localComposeUiKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContextWrapper.Origin origin = (ContextWrapper.Origin) obj;
        origin.getClass();
        ByteString byteString = ByteString.EMPTY;
        ContextWrapper.Origin.OriginType originType = origin.f1248type;
        LocalComposeUiKt localComposeUiKt = origin.origin;
        byteString.getClass();
        return new ContextWrapper.Origin(originType, localComposeUiKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContextWrapper.Origin origin = (ContextWrapper.Origin) obj;
        origin.getClass();
        ContextWrapper.Origin.OriginType.ADAPTER.encodeWithTag(protoWriter, 1, origin.f1248type);
        LocalComposeUiKt localComposeUiKt = origin.origin;
        if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$AccountLink) {
            ContextWrapper.Origin.AccountLink.ADAPTER.encodeWithTag(protoWriter, 2, ((ContextWrapper$Origin$Origin$AccountLink) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$OfferDeepLink) {
            ContextWrapper.Origin.OfferDeepLink.ADAPTER.encodeWithTag(protoWriter, 3, ((ContextWrapper$Origin$Origin$OfferDeepLink) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$DiscoverTab) {
            ContextWrapper.Origin.DiscoverTab.ADAPTER.encodeWithTag(protoWriter, 4, ((ContextWrapper$Origin$Origin$DiscoverTab) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$ActivityTab) {
            ContextWrapper.Origin.ActivityTab.ADAPTER.encodeWithTag(protoWriter, 5, ((ContextWrapper$Origin$Origin$ActivityTab) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$DiscoverSearch) {
            ContextWrapper.Origin.DiscoverSearch.ADAPTER.encodeWithTag(protoWriter, 6, ((ContextWrapper$Origin$Origin$DiscoverSearch) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$BlockedBusinesses) {
            ContextWrapper.Origin.BlockedBusinesses.ADAPTER.encodeWithTag(protoWriter, 7, ((ContextWrapper$Origin$Origin$BlockedBusinesses) localComposeUiKt).value);
        } else if (localComposeUiKt instanceof ContextWrapper$Origin$Origin$BillsAndSubscriptions) {
            ContextWrapper.Origin.BillsAndSubscriptions.ADAPTER.encodeWithTag(protoWriter, 8, ((ContextWrapper$Origin$Origin$BillsAndSubscriptions) localComposeUiKt).value);
        } else if (localComposeUiKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(origin.unknownFields());
    }
}
