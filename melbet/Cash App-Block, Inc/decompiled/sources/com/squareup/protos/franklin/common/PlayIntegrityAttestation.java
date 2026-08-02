package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;
import okio.ByteString;
import okio.Path;

/* loaded from: classes.dex */
public final class PlayIntegrityAttestation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlayIntegrityAttestation> CREATOR;
    public final AttestationType attestation_type;
    public final IntegrityErrorCode integrity_error_code;
    public final String nonce;
    public final String request_hash;
    public final Status status;
    public final String token;

    public enum AttestationType implements WireEnum {
        CLASSIC(0),
        STANDARD(1);

        public static final PlayIntegrityAttestation$AttestationType$Companion$ADAPTER$1 ADAPTER;
        public static final AsyncTimeout.Companion Companion;
        public final int value;

        static {
            AttestationType attestationType = CLASSIC;
            Companion = new AsyncTimeout.Companion();
            ADAPTER = new PlayIntegrityAttestation$AttestationType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AttestationType.class), Syntax.PROTO_2, attestationType);
        }

        AttestationType(int i) {
            this.value = i;
        }

        public static final AttestationType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CLASSIC;
            }
            if (i != 1) {
                return null;
            }
            return STANDARD;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum IntegrityErrorCode implements WireEnum {
        NO_ERROR(0),
        API_NOT_AVAILABLE(1),
        PLAY_STORE_NOT_FOUND(2),
        INTEGRITY_ERROR_CODE_NETWORK_ERROR(3),
        PLAY_STORE_ACCOUNT_NOT_FOUND(4),
        APP_NOT_INSTALLED(5),
        PLAY_SERVICES_NOT_FOUND(6),
        APP_UID_MISMATCH(7),
        TOO_MANY_REQUESTS(8),
        CANNOT_BIND_TO_SERVICE(9),
        NONCE_TOO_SHORT(10),
        NONCE_TOO_LONG(11),
        GOOGLE_SERVER_UNAVAILABLE(12),
        NONCE_IS_NOT_BASE64(13),
        PLAY_STORE_VERSION_OUTDATED(14),
        PLAY_SERVICES_VERSION_OUTDATED(15),
        CLOUD_PROJECT_NUMBER_IS_INVALID(16),
        CLIENT_TRANSIENT_ERROR(17),
        INTEGRITY_ERROR_CODE_INTERNAL_ERROR(100);

        public static final PlayIntegrityAttestation$IntegrityErrorCode$Companion$ADAPTER$1 ADAPTER;
        public static final ByteString.Companion Companion;
        public final int value;

        static {
            IntegrityErrorCode integrityErrorCode = NO_ERROR;
            Companion = new ByteString.Companion();
            ADAPTER = new PlayIntegrityAttestation$IntegrityErrorCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IntegrityErrorCode.class), Syntax.PROTO_2, integrityErrorCode);
        }

        IntegrityErrorCode(int i) {
            this.value = i;
        }

        public static final IntegrityErrorCode fromValue(int i) {
            Companion.getClass();
            return ByteString.Companion.m4340fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Status implements WireEnum {
        DO_NOT_USE(0),
        FAILED(1),
        COMPLETED(2),
        INTEGRITY_CHECK_EXCEPTION(3),
        SAFETY_NET_API_UNAVAILABLE(4),
        TOO_MANY_RETRIES(5),
        INTERRUPTED_EXCEPTION(6),
        TIMEOUT_EXCEPTION(7),
        SUCCESSFUL(8),
        PLAY_SERVICES_UNAVAILABLE(9),
        STANDARD_INTEGRITY_EXCEPTION(10);

        public static final PlayIntegrityAttestation$Status$Companion$ADAPTER$1 ADAPTER;
        public static final Path.Companion Companion;
        public final int value;

        static {
            Status status = DO_NOT_USE;
            Companion = new Path.Companion();
            ADAPTER = new PlayIntegrityAttestation$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return Path.Companion.m4349fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PlayIntegrityAttestation$Companion$ADAPTER$1 playIntegrityAttestation$Companion$ADAPTER$1 = new PlayIntegrityAttestation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PlayIntegrityAttestation.class), "type.googleapis.com/squareup.franklin.PlayIntegrityAttestation", Syntax.PROTO_2, null, "squareup/franklin/signal.proto");
        ADAPTER = playIntegrityAttestation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(playIntegrityAttestation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityAttestation(String str, String str2, Status status, IntegrityErrorCode integrityErrorCode, String str3, AttestationType attestationType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.nonce = str;
        this.token = str2;
        this.status = status;
        this.integrity_error_code = integrityErrorCode;
        this.request_hash = str3;
        this.attestation_type = attestationType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayIntegrityAttestation)) {
            return false;
        }
        PlayIntegrityAttestation playIntegrityAttestation = (PlayIntegrityAttestation) obj;
        return Intrinsics.areEqual(unknownFields(), playIntegrityAttestation.unknownFields()) && Intrinsics.areEqual(this.nonce, playIntegrityAttestation.nonce) && Intrinsics.areEqual(this.token, playIntegrityAttestation.token) && this.status == playIntegrityAttestation.status && this.integrity_error_code == playIntegrityAttestation.integrity_error_code && Intrinsics.areEqual(this.request_hash, playIntegrityAttestation.request_hash) && this.attestation_type == playIntegrityAttestation.attestation_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.nonce;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode4 = (hashCode3 + (status != null ? status.hashCode() : 0)) * 37;
        IntegrityErrorCode integrityErrorCode = this.integrity_error_code;
        int hashCode5 = (hashCode4 + (integrityErrorCode != null ? integrityErrorCode.hashCode() : 0)) * 37;
        String str3 = this.request_hash;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        AttestationType attestationType = this.attestation_type;
        int hashCode7 = hashCode6 + (attestationType != null ? attestationType.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(5, false);
        builder.full_name = this.nonce;
        builder.photo_url = this.token;
        builder.full_cashtag = this.status;
        builder.cashtag_url_enabled = this.integrity_error_code;
        builder.synopsis = this.request_hash;
        builder.is_verified_account = this.attestation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.nonce != null) {
            arrayList.add("nonce=██");
        }
        if (this.token != null) {
            arrayList.add("token=██");
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        IntegrityErrorCode integrityErrorCode = this.integrity_error_code;
        if (integrityErrorCode != null) {
            arrayList.add("integrity_error_code=" + integrityErrorCode);
        }
        if (this.request_hash != null) {
            arrayList.add("request_hash=██");
        }
        AttestationType attestationType = this.attestation_type;
        if (attestationType != null) {
            arrayList.add("attestation_type=" + attestationType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlayIntegrityAttestation{", "}", 0, null, null, 56);
    }
}
