package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.ScopedModifierTokensKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Activity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ScopedModifierTokensKt scopedModifierTokensKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Activity(scopedModifierTokensKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                scopedModifierTokensKt = new Activity$Activity$Classic((ActivityClassic) ActivityClassic.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                scopedModifierTokensKt = new Activity$Activity$SelfviewText((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                scopedModifierTokensKt = new Activity$Activity$Stats((ActivityStats) ActivityStats.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                scopedModifierTokensKt = new Activity$Activity$StatsElement((GenericProfileElement.ActivityStatsElement) GenericProfileElement.ActivityStatsElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Activity activity = (Activity) obj;
        reverseProtoWriter.getClass();
        activity.getClass();
        reverseProtoWriter.writeBytes(activity.unknownFields());
        ScopedModifierTokensKt scopedModifierTokensKt = activity.activity;
        if (scopedModifierTokensKt instanceof Activity$Activity$Classic) {
            ActivityClassic.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((Activity$Activity$Classic) scopedModifierTokensKt).value);
            return;
        }
        if (scopedModifierTokensKt instanceof Activity$Activity$SelfviewText) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((Activity$Activity$SelfviewText) scopedModifierTokensKt).value);
            return;
        }
        if (scopedModifierTokensKt instanceof Activity$Activity$Stats) {
            ActivityStats.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Activity$Activity$Stats) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt instanceof Activity$Activity$StatsElement) {
            GenericProfileElement.ActivityStatsElement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((Activity$Activity$StatsElement) scopedModifierTokensKt).value);
        } else {
            if (scopedModifierTokensKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Activity activity = (Activity) obj;
        activity.getClass();
        int size$okio = activity.unknownFields().getSize$okio();
        ScopedModifierTokensKt scopedModifierTokensKt = activity.activity;
        if (scopedModifierTokensKt instanceof Activity$Activity$Classic) {
            encodedSizeWithTag = ActivityClassic.ADAPTER.encodedSizeWithTag(1, ((Activity$Activity$Classic) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt instanceof Activity$Activity$SelfviewText) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((Activity$Activity$SelfviewText) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt instanceof Activity$Activity$Stats) {
            encodedSizeWithTag = ActivityStats.ADAPTER.encodedSizeWithTag(3, ((Activity$Activity$Stats) scopedModifierTokensKt).value);
        } else {
            if (!(scopedModifierTokensKt instanceof Activity$Activity$StatsElement)) {
                if (scopedModifierTokensKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GenericProfileElement.ActivityStatsElement.ADAPTER.encodedSizeWithTag(4, ((Activity$Activity$StatsElement) scopedModifierTokensKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Activity) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Activity(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Activity activity = (Activity) obj;
        activity.getClass();
        ScopedModifierTokensKt scopedModifierTokensKt = activity.activity;
        if (scopedModifierTokensKt instanceof Activity$Activity$Classic) {
            ActivityClassic.ADAPTER.encodeWithTag(protoWriter, 1, ((Activity$Activity$Classic) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt instanceof Activity$Activity$SelfviewText) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((Activity$Activity$SelfviewText) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt instanceof Activity$Activity$Stats) {
            ActivityStats.ADAPTER.encodeWithTag(protoWriter, 3, ((Activity$Activity$Stats) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt instanceof Activity$Activity$StatsElement) {
            GenericProfileElement.ActivityStatsElement.ADAPTER.encodeWithTag(protoWriter, 4, ((Activity$Activity$StatsElement) scopedModifierTokensKt).value);
        } else if (scopedModifierTokensKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activity.unknownFields());
    }
}
