package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.DisplayedRow;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/DisplayedRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayedRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayedRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        DisplayedRow.Row row = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisplayedRow(row, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    row = new DisplayedRow.Row.ContactListRow((ContactListRow) ContactListRow.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    row = new DisplayedRow.Row.PendingHeader((PendingHeader) PendingHeader.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    row = new DisplayedRow.Row.CompletedHeader((CompletedHeader) CompletedHeader.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    row = new DisplayedRow.Row.UpcomingHeader((UpcomingHeader) UpcomingHeader.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    row = new DisplayedRow.Row.SyncEntityRow((SyncEntityRow) SyncEntityRow.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    row = new DisplayedRow.Row.RollupRow((RollupRow) RollupRow.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    row = new DisplayedRow.Row.EmptyRow((EmptyRow) EmptyRow.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    row = new DisplayedRow.Row.EmptyHeaderRow((EmptyHeaderRow) EmptyHeaderRow.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    row = new DisplayedRow.Row.InlineActivityAppMessageRow((InlineActivityAppMessageRow) InlineActivityAppMessageRow.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    row = new DisplayedRow.Row.PendingPaymentRow((PendingPaymentRow) PendingPaymentRow.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    row = new DisplayedRow.Row.InviteRow((InviteRow) InviteRow.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisplayedRow displayedRow = (DisplayedRow) obj;
        displayedRow.getClass();
        DisplayedRow.Row row = displayedRow.row;
        if (row instanceof DisplayedRow.Row.ContactListRow) {
            ContactListRow.ADAPTER.encodeWithTag(protoWriter, 1, ((DisplayedRow.Row.ContactListRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.PendingHeader) {
            PendingHeader.ADAPTER.encodeWithTag(protoWriter, 2, ((DisplayedRow.Row.PendingHeader) row).getValue());
        } else if (row instanceof DisplayedRow.Row.CompletedHeader) {
            CompletedHeader.ADAPTER.encodeWithTag(protoWriter, 3, ((DisplayedRow.Row.CompletedHeader) row).getValue());
        } else if (row instanceof DisplayedRow.Row.UpcomingHeader) {
            UpcomingHeader.ADAPTER.encodeWithTag(protoWriter, 4, ((DisplayedRow.Row.UpcomingHeader) row).getValue());
        } else if (row instanceof DisplayedRow.Row.SyncEntityRow) {
            SyncEntityRow.ADAPTER.encodeWithTag(protoWriter, 5, ((DisplayedRow.Row.SyncEntityRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.RollupRow) {
            RollupRow.ADAPTER.encodeWithTag(protoWriter, 6, ((DisplayedRow.Row.RollupRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.EmptyRow) {
            EmptyRow.ADAPTER.encodeWithTag(protoWriter, 7, ((DisplayedRow.Row.EmptyRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.EmptyHeaderRow) {
            EmptyHeaderRow.ADAPTER.encodeWithTag(protoWriter, 8, ((DisplayedRow.Row.EmptyHeaderRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.InlineActivityAppMessageRow) {
            InlineActivityAppMessageRow.ADAPTER.encodeWithTag(protoWriter, 9, ((DisplayedRow.Row.InlineActivityAppMessageRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.PendingPaymentRow) {
            PendingPaymentRow.ADAPTER.encodeWithTag(protoWriter, 10, ((DisplayedRow.Row.PendingPaymentRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.InviteRow) {
            InviteRow.ADAPTER.encodeWithTag(protoWriter, 11, ((DisplayedRow.Row.InviteRow) row).getValue());
        } else if (row != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(displayedRow.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        DisplayedRow displayedRow = (DisplayedRow) obj;
        displayedRow.getClass();
        int size$okio = displayedRow.unknownFields().getSize$okio();
        DisplayedRow.Row row = displayedRow.row;
        if (row instanceof DisplayedRow.Row.ContactListRow) {
            encodedSizeWithTag = ContactListRow.ADAPTER.encodedSizeWithTag(1, ((DisplayedRow.Row.ContactListRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.PendingHeader) {
            encodedSizeWithTag = PendingHeader.ADAPTER.encodedSizeWithTag(2, ((DisplayedRow.Row.PendingHeader) row).getValue());
        } else if (row instanceof DisplayedRow.Row.CompletedHeader) {
            encodedSizeWithTag = CompletedHeader.ADAPTER.encodedSizeWithTag(3, ((DisplayedRow.Row.CompletedHeader) row).getValue());
        } else if (row instanceof DisplayedRow.Row.UpcomingHeader) {
            encodedSizeWithTag = UpcomingHeader.ADAPTER.encodedSizeWithTag(4, ((DisplayedRow.Row.UpcomingHeader) row).getValue());
        } else if (row instanceof DisplayedRow.Row.SyncEntityRow) {
            encodedSizeWithTag = SyncEntityRow.ADAPTER.encodedSizeWithTag(5, ((DisplayedRow.Row.SyncEntityRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.RollupRow) {
            encodedSizeWithTag = RollupRow.ADAPTER.encodedSizeWithTag(6, ((DisplayedRow.Row.RollupRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.EmptyRow) {
            encodedSizeWithTag = EmptyRow.ADAPTER.encodedSizeWithTag(7, ((DisplayedRow.Row.EmptyRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.EmptyHeaderRow) {
            encodedSizeWithTag = EmptyHeaderRow.ADAPTER.encodedSizeWithTag(8, ((DisplayedRow.Row.EmptyHeaderRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.InlineActivityAppMessageRow) {
            encodedSizeWithTag = InlineActivityAppMessageRow.ADAPTER.encodedSizeWithTag(9, ((DisplayedRow.Row.InlineActivityAppMessageRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.PendingPaymentRow) {
            encodedSizeWithTag = PendingPaymentRow.ADAPTER.encodedSizeWithTag(10, ((DisplayedRow.Row.PendingPaymentRow) row).getValue());
        } else {
            if (!(row instanceof DisplayedRow.Row.InviteRow)) {
                if (row == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = InviteRow.ADAPTER.encodedSizeWithTag(11, ((DisplayedRow.Row.InviteRow) row).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisplayedRow displayedRow = (DisplayedRow) obj;
        displayedRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        DisplayedRow.Row row = displayedRow.row;
        byteString.getClass();
        return new DisplayedRow(row, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisplayedRow displayedRow = (DisplayedRow) obj;
        reverseProtoWriter.getClass();
        displayedRow.getClass();
        reverseProtoWriter.writeBytes(displayedRow.unknownFields());
        DisplayedRow.Row row = displayedRow.row;
        if (row instanceof DisplayedRow.Row.ContactListRow) {
            ContactListRow.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((DisplayedRow.Row.ContactListRow) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.PendingHeader) {
            PendingHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((DisplayedRow.Row.PendingHeader) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.CompletedHeader) {
            CompletedHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((DisplayedRow.Row.CompletedHeader) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.UpcomingHeader) {
            UpcomingHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((DisplayedRow.Row.UpcomingHeader) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.SyncEntityRow) {
            SyncEntityRow.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((DisplayedRow.Row.SyncEntityRow) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.RollupRow) {
            RollupRow.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((DisplayedRow.Row.RollupRow) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.EmptyRow) {
            EmptyRow.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((DisplayedRow.Row.EmptyRow) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.EmptyHeaderRow) {
            EmptyHeaderRow.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((DisplayedRow.Row.EmptyHeaderRow) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.InlineActivityAppMessageRow) {
            InlineActivityAppMessageRow.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((DisplayedRow.Row.InlineActivityAppMessageRow) row).getValue());
            return;
        }
        if (row instanceof DisplayedRow.Row.PendingPaymentRow) {
            PendingPaymentRow.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((DisplayedRow.Row.PendingPaymentRow) row).getValue());
        } else if (row instanceof DisplayedRow.Row.InviteRow) {
            InviteRow.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((DisplayedRow.Row.InviteRow) row).getValue());
        } else {
            if (row == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
