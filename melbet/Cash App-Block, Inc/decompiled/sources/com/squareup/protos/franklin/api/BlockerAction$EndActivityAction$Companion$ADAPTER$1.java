package com.squareup.protos.franklin.api;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"com/squareup/protos/franklin/api/BlockerAction$EndActivityAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "intent_resolution_dataAdapter", "", "", "getIntent_resolution_dataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "intent_resolution_dataAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlockerAction$EndActivityAction$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: intent_resolution_dataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy intent_resolution_dataAdapter;

    public BlockerAction$EndActivityAction$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.franklin.api.BlockerAction.EndActivityAction", syntax, (Object) null, "squareup/franklin/blocker_action.proto");
        this.intent_resolution_dataAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(27));
    }

    private final ProtoAdapter getIntent_resolution_dataAdapter() {
        return (ProtoAdapter) this.intent_resolution_dataAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter intent_resolution_dataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public BlockerAction.EndActivityAction decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new BlockerAction.EndActivityAction((BlockerAction.EndActivityResult) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BlockerAction.EndActivityResult.ADAPTER, reader, obj);
            } else if (nextTag != 2) {
                reader.readUnknownField(nextTag);
            } else {
                m.putAll((Map) getIntent_resolution_dataAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, BlockerAction.EndActivityAction value) {
        writer.getClass();
        value.getClass();
        BlockerAction.EndActivityResult.ADAPTER.encodeWithTag(writer, 1, value.end_activity_result_status);
        getIntent_resolution_dataAdapter().encodeWithTag(writer, 2, value.intent_resolution_data);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(BlockerAction.EndActivityAction value) {
        value.getClass();
        return getIntent_resolution_dataAdapter().encodedSizeWithTag(2, value.intent_resolution_data) + BlockerAction.EndActivityResult.ADAPTER.encodedSizeWithTag(1, value.end_activity_result_status) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public BlockerAction.EndActivityAction redact(BlockerAction.EndActivityAction value) {
        value.getClass();
        BlockerAction.EndActivityResult endActivityResult = value.end_activity_result_status;
        return BlockerAction.EndActivityAction.copy$default(value, endActivityResult != null ? (BlockerAction.EndActivityResult) BlockerAction.EndActivityResult.ADAPTER.redact(endActivityResult) : null, null, ByteString.EMPTY, 2, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, BlockerAction.EndActivityAction value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getIntent_resolution_dataAdapter().encodeWithTag(writer, 2, value.intent_resolution_data);
        BlockerAction.EndActivityResult.ADAPTER.encodeWithTag(writer, 1, value.end_activity_result_status);
    }
}
