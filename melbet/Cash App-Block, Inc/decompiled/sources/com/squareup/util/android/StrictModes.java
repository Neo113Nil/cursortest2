package com.squareup.util.android;

import android.os.StrictMode;
import com.datadog.android.rum.model.ViewEvent;
import com.google.android.libraries.places.internal.zzcha;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.protos.franklin.common.EncryptedSyncEntity;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncEntityType;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import okio.Buffer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public abstract class StrictModes {
    public static ViewEvent.Fcp fromJsonObject(JsonObject jsonObject) {
        try {
            return new ViewEvent.Fcp(jsonObject.get("timestamp").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fcp", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fcp", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fcp", e3);
            return null;
        }
    }

    public static final Integer getSyncValueTypeAsInt(SyncEntity syncEntity) {
        int intValue;
        syncEntity.getClass();
        SyncValue syncValue = syncEntity.sync_value;
        if (syncValue == null) {
            EncryptedSyncEntity encryptedSyncEntity = syncEntity.encrypted_sync_entity;
            if (encryptedSyncEntity != null) {
                return getSyncValueTypeAsInt(encryptedSyncEntity);
            }
            return null;
        }
        SyncValueType syncValueType = syncValue.f1393type;
        if (syncValueType != null) {
            intValue = syncValueType.value;
        } else {
            Buffer buffer = new Buffer();
            buffer.m4333write(syncValue.unknownFields());
            ProtoReader protoReader = new ProtoReader(buffer);
            long beginMessage = protoReader.beginMessage();
            Object obj = null;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    break;
                }
                if (nextTag == 1) {
                    obj = ProtoAdapter.INT32.decode(protoReader);
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
            protoReader.endMessageAndGetUnknownFields(beginMessage);
            if (obj == null) {
                Path$$ExternalSyntheticBUOutline0.m$3(syncValue, "no type ");
                return null;
            }
            intValue = ((Number) obj).intValue();
        }
        return Integer.valueOf(intValue);
    }

    public static final zzcha temporarilyAllow() {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        threadPolicy.getClass();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        vmPolicy.getClass();
        return new zzcha(threadPolicy, vmPolicy);
    }

    public static final Integer getSyncValueTypeAsInt(EncryptedSyncEntity encryptedSyncEntity) {
        encryptedSyncEntity.getClass();
        if (encryptedSyncEntity.f1377type != SyncEntityType.SYNC_VALUE) {
            return null;
        }
        SyncValueType syncValueType = encryptedSyncEntity.sync_value_type;
        if (syncValueType != null) {
            return Integer.valueOf(syncValueType.value);
        }
        Buffer buffer = new Buffer();
        buffer.m4333write(encryptedSyncEntity.unknownFields());
        ProtoReader protoReader = new ProtoReader(buffer);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 3) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        protoReader.endMessageAndGetUnknownFields(beginMessage);
        if (obj != null) {
            return (Integer) obj;
        }
        Path$$ExternalSyntheticBUOutline0.m$3(encryptedSyncEntity, "no sync value type ");
        return null;
    }
}
