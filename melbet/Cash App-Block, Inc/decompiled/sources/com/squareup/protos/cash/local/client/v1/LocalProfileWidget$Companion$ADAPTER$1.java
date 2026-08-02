package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ActionEvent.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalProfileWidget((LocalProfileWidget.Type) obj, companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = LocalProfileWidget.Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    companion = new LocalProfileWidget$Data$OrderingReordering((LocalProfileWidget.OrderingReorderingData) LocalProfileWidget.OrderingReorderingData.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    companion = new LocalProfileWidget$Data$OrderingMenus((LocalProfileWidget.OrderingMenusData) LocalProfileWidget.OrderingMenusData.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    companion = new LocalProfileWidget$Data$BookingRebooking((LocalProfileWidget.BookingRebookingData) LocalProfileWidget.BookingRebookingData.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    companion = new LocalProfileWidget$Data$BookingServices((LocalProfileWidget.BookingServicesData) LocalProfileWidget.BookingServicesData.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    companion = new LocalProfileWidget$Data$BookingTeamMembers((LocalProfileWidget.BookingTeamMembersData) LocalProfileWidget.BookingTeamMembersData.ADAPTER.decode(protoReader));
                    break;
                case 7:
                case 13:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    companion = new LocalProfileWidget$Data$About((LocalProfileWidget.AboutData) LocalProfileWidget.AboutData.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    companion = new LocalProfileWidget$Data$Policies((LocalProfileWidget.PoliciesData) LocalProfileWidget.PoliciesData.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    companion = new LocalProfileWidget$Data$Hours((LocalProfileWidget.HoursData) LocalProfileWidget.HoursData.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    companion = new LocalProfileWidget$Data$Contact((LocalProfileWidget.ContactData) LocalProfileWidget.ContactData.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    companion = new LocalProfileWidget$Data$Links((LocalProfileWidget.LinksData) LocalProfileWidget.LinksData.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    companion = new LocalProfileWidget$Data$Retail((LocalProfileWidget.RetailData) LocalProfileWidget.RetailData.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalProfileWidget localProfileWidget = (LocalProfileWidget) obj;
        reverseProtoWriter.getClass();
        localProfileWidget.getClass();
        reverseProtoWriter.writeBytes(localProfileWidget.unknownFields());
        ActionEvent.Companion companion = localProfileWidget.data;
        if (companion instanceof LocalProfileWidget$Data$OrderingReordering) {
            LocalProfileWidget.OrderingReorderingData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((LocalProfileWidget$Data$OrderingReordering) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$OrderingMenus) {
            LocalProfileWidget.OrderingMenusData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LocalProfileWidget$Data$OrderingMenus) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$BookingRebooking) {
            LocalProfileWidget.BookingRebookingData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((LocalProfileWidget$Data$BookingRebooking) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$BookingServices) {
            LocalProfileWidget.BookingServicesData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((LocalProfileWidget$Data$BookingServices) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$BookingTeamMembers) {
            LocalProfileWidget.BookingTeamMembersData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((LocalProfileWidget$Data$BookingTeamMembers) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$About) {
            LocalProfileWidget.AboutData.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((LocalProfileWidget$Data$About) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Policies) {
            LocalProfileWidget.PoliciesData.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((LocalProfileWidget$Data$Policies) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Hours) {
            LocalProfileWidget.HoursData.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((LocalProfileWidget$Data$Hours) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Contact) {
            LocalProfileWidget.ContactData.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((LocalProfileWidget$Data$Contact) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Links) {
            LocalProfileWidget.LinksData.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((LocalProfileWidget$Data$Links) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Retail) {
            LocalProfileWidget.RetailData.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((LocalProfileWidget$Data$Retail) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalProfileWidget.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localProfileWidget.f1313type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalProfileWidget localProfileWidget = (LocalProfileWidget) obj;
        localProfileWidget.getClass();
        int encodedSizeWithTag = LocalProfileWidget.Type.ADAPTER.encodedSizeWithTag(1, localProfileWidget.f1313type) + localProfileWidget.unknownFields().getSize$okio();
        ActionEvent.Companion companion = localProfileWidget.data;
        if (companion instanceof LocalProfileWidget$Data$OrderingReordering) {
            return LocalProfileWidget.OrderingReorderingData.ADAPTER.encodedSizeWithTag(2, ((LocalProfileWidget$Data$OrderingReordering) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$OrderingMenus) {
            return LocalProfileWidget.OrderingMenusData.ADAPTER.encodedSizeWithTag(3, ((LocalProfileWidget$Data$OrderingMenus) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$BookingRebooking) {
            return LocalProfileWidget.BookingRebookingData.ADAPTER.encodedSizeWithTag(4, ((LocalProfileWidget$Data$BookingRebooking) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$BookingServices) {
            return LocalProfileWidget.BookingServicesData.ADAPTER.encodedSizeWithTag(5, ((LocalProfileWidget$Data$BookingServices) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$BookingTeamMembers) {
            return LocalProfileWidget.BookingTeamMembersData.ADAPTER.encodedSizeWithTag(6, ((LocalProfileWidget$Data$BookingTeamMembers) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$About) {
            return LocalProfileWidget.AboutData.ADAPTER.encodedSizeWithTag(8, ((LocalProfileWidget$Data$About) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$Policies) {
            return LocalProfileWidget.PoliciesData.ADAPTER.encodedSizeWithTag(9, ((LocalProfileWidget$Data$Policies) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$Hours) {
            return LocalProfileWidget.HoursData.ADAPTER.encodedSizeWithTag(10, ((LocalProfileWidget$Data$Hours) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$Contact) {
            return LocalProfileWidget.ContactData.ADAPTER.encodedSizeWithTag(11, ((LocalProfileWidget$Data$Contact) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$Links) {
            return LocalProfileWidget.LinksData.ADAPTER.encodedSizeWithTag(12, ((LocalProfileWidget$Data$Links) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof LocalProfileWidget$Data$Retail) {
            return LocalProfileWidget.RetailData.ADAPTER.encodedSizeWithTag(14, ((LocalProfileWidget$Data$Retail) companion).value) + encodedSizeWithTag;
        }
        if (companion == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalProfileWidget localProfileWidget = (LocalProfileWidget) obj;
        localProfileWidget.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalProfileWidget.Type type2 = localProfileWidget.f1313type;
        ActionEvent.Companion companion = localProfileWidget.data;
        byteString.getClass();
        return new LocalProfileWidget(type2, companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalProfileWidget localProfileWidget = (LocalProfileWidget) obj;
        localProfileWidget.getClass();
        LocalProfileWidget.Type.ADAPTER.encodeWithTag(protoWriter, 1, localProfileWidget.f1313type);
        ActionEvent.Companion companion = localProfileWidget.data;
        if (companion instanceof LocalProfileWidget$Data$OrderingReordering) {
            LocalProfileWidget.OrderingReorderingData.ADAPTER.encodeWithTag(protoWriter, 2, ((LocalProfileWidget$Data$OrderingReordering) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$OrderingMenus) {
            LocalProfileWidget.OrderingMenusData.ADAPTER.encodeWithTag(protoWriter, 3, ((LocalProfileWidget$Data$OrderingMenus) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$BookingRebooking) {
            LocalProfileWidget.BookingRebookingData.ADAPTER.encodeWithTag(protoWriter, 4, ((LocalProfileWidget$Data$BookingRebooking) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$BookingServices) {
            LocalProfileWidget.BookingServicesData.ADAPTER.encodeWithTag(protoWriter, 5, ((LocalProfileWidget$Data$BookingServices) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$BookingTeamMembers) {
            LocalProfileWidget.BookingTeamMembersData.ADAPTER.encodeWithTag(protoWriter, 6, ((LocalProfileWidget$Data$BookingTeamMembers) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$About) {
            LocalProfileWidget.AboutData.ADAPTER.encodeWithTag(protoWriter, 8, ((LocalProfileWidget$Data$About) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Policies) {
            LocalProfileWidget.PoliciesData.ADAPTER.encodeWithTag(protoWriter, 9, ((LocalProfileWidget$Data$Policies) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Hours) {
            LocalProfileWidget.HoursData.ADAPTER.encodeWithTag(protoWriter, 10, ((LocalProfileWidget$Data$Hours) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Contact) {
            LocalProfileWidget.ContactData.ADAPTER.encodeWithTag(protoWriter, 11, ((LocalProfileWidget$Data$Contact) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Links) {
            LocalProfileWidget.LinksData.ADAPTER.encodeWithTag(protoWriter, 12, ((LocalProfileWidget$Data$Links) companion).value);
        } else if (companion instanceof LocalProfileWidget$Data$Retail) {
            LocalProfileWidget.RetailData.ADAPTER.encodeWithTag(protoWriter, 14, ((LocalProfileWidget$Data$Retail) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localProfileWidget.unknownFields());
    }
}
