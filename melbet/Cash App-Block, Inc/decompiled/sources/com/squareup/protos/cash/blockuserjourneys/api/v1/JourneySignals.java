package com.squareup.protos.cash.blockuserjourneys.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes.dex */
public final class JourneySignals extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<JourneySignals> CREATOR;
    public final List frictions;
    public final List frustrations;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(JourneySignals.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockuserjourneys.api.v1.JourneySignals$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new JourneySignals(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                JourneySignals journeySignals = (JourneySignals) obj;
                reverseProtoWriter.getClass();
                journeySignals.getClass();
                reverseProtoWriter.writeBytes(journeySignals.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, journeySignals.frustrations);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 1, journeySignals.frictions);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                JourneySignals journeySignals = (JourneySignals) obj;
                journeySignals.getClass();
                int size$okio = journeySignals.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(2, journeySignals.frustrations) + protoAdapter2.asRepeated().encodedSizeWithTag(1, journeySignals.frictions) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                JourneySignals journeySignals = (JourneySignals) obj;
                journeySignals.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = journeySignals.frictions;
                List list2 = journeySignals.frustrations;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new JourneySignals(list, list2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                JourneySignals journeySignals = (JourneySignals) obj;
                journeySignals.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 1, journeySignals.frictions);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, journeySignals.frustrations);
                protoWriter.writeBytes(journeySignals.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JourneySignals(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.frictions = TransactorKt.immutableCopyOf("frictions", list);
        this.frustrations = TransactorKt.immutableCopyOf("frustrations", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JourneySignals)) {
            return false;
        }
        JourneySignals journeySignals = (JourneySignals) obj;
        return Intrinsics.areEqual(unknownFields(), journeySignals.unknownFields()) && Intrinsics.areEqual(this.frictions, journeySignals.frictions) && Intrinsics.areEqual(this.frustrations, journeySignals.frustrations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.frustrations.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.frictions);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(5);
        builder.card_holder_benefits = this.frictions;
        builder.green_status_benefits = this.frustrations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.frictions;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("frictions=", arrayList, list);
        }
        List list2 = this.frustrations;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("frustrations=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "JourneySignals{", "}", 0, null, null, 56);
    }
}
