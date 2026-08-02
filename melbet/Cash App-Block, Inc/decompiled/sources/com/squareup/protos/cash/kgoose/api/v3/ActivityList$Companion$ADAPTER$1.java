package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ActivityList$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActivityList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityList(m, (LocalizedString) obj, (Boolean) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActivityRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityList activityList = (ActivityList) obj;
        reverseProtoWriter.getClass();
        activityList.getClass();
        reverseProtoWriter.writeBytes(activityList.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, activityList.version);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, activityList.has_more);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activityList.title);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, activityList.rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityList activityList = (ActivityList) obj;
        activityList.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(4, activityList.version) + ProtoAdapter.BOOL.encodedSizeWithTag(3, activityList.has_more) + LocalizedString.ADAPTER.encodedSizeWithTag(2, activityList.title) + ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(1, activityList.rows) + activityList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityList activityList = (ActivityList) obj;
        activityList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activityList.rows, ActivityRow.ADAPTER);
        LocalizedString localizedString = activityList.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = activityList.has_more;
        Integer num = activityList.version;
        byteString.getClass();
        return new ActivityList(m1169redactElements, localizedString2, bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityList activityList = (ActivityList) obj;
        activityList.getClass();
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, activityList.rows);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, activityList.title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, activityList.has_more);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, activityList.version);
        protoWriter.writeBytes(activityList.unknownFields());
    }
}
