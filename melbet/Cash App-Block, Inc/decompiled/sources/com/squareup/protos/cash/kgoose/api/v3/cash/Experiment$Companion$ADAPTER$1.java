package com.squareup.protos.cash.kgoose.api.v3.cash;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.Profile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/cash/Experiment$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/Experiment;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Experiment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Experiment((String) obj, (String) obj2, (Profile) obj3, (Profile) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Profile.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Profile.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Experiment experiment = (Experiment) obj;
        reverseProtoWriter.getClass();
        experiment.getClass();
        reverseProtoWriter.writeBytes(experiment.unknownFields());
        ProtoAdapter protoAdapter = Profile.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, experiment.variant_b_profile);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, experiment.variant_a_profile);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, experiment.experiment_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, experiment.experiment_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Experiment experiment = (Experiment) obj;
        experiment.getClass();
        int size$okio = experiment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, experiment.experiment_name) + protoAdapter.encodedSizeWithTag(1, experiment.experiment_id) + size$okio;
        ProtoAdapter protoAdapter2 = Profile.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, experiment.variant_b_profile) + protoAdapter2.encodedSizeWithTag(3, experiment.variant_a_profile) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Experiment experiment = (Experiment) obj;
        experiment.getClass();
        Profile profile = experiment.variant_a_profile;
        Profile profile2 = profile != null ? (Profile) Profile.ADAPTER.redact(profile) : null;
        Profile profile3 = experiment.variant_b_profile;
        Profile profile4 = profile3 != null ? (Profile) Profile.ADAPTER.redact(profile3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = experiment.experiment_id;
        String str2 = experiment.experiment_name;
        byteString.getClass();
        return new Experiment(str, str2, profile2, profile4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Experiment experiment = (Experiment) obj;
        experiment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, experiment.experiment_id);
        protoAdapter.encodeWithTag(protoWriter, 2, experiment.experiment_name);
        ProtoAdapter protoAdapter2 = Profile.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, experiment.variant_a_profile);
        protoAdapter2.encodeWithTag(protoWriter, 4, experiment.variant_b_profile);
        protoWriter.writeBytes(experiment.unknownFields());
    }
}
