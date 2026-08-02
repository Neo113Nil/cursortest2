package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.messagingplatformcommon.app.GetDetailsPageRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class PlayIntegrityVerdict extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlayIntegrityVerdict> CREATOR;
    public final AccountDetails account_details;
    public final AppIntegrity app_integrity;
    public final List device_recognition_verdict;
    public final RequestDetails request_details;

    /* loaded from: classes7.dex */
    public final class AccountDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AccountDetails> CREATOR;
        public final AppLicensingVerdict app_licensing_verdict;

        public enum AppLicensingVerdict implements WireEnum {
            LICENSED(1),
            UNLICENSED(2),
            UNEVALUATED(3),
            INVALID_ATTESTATION(4);

            public final int value;
            public static final Channel.Companion Companion = new Channel.Companion();
            public static final PlayIntegrityVerdict$AccountDetails$AppLicensingVerdict$Companion$ADAPTER$1 ADAPTER = new PlayIntegrityVerdict$AccountDetails$AppLicensingVerdict$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppLicensingVerdict.class), Syntax.PROTO_2, null);

            AppLicensingVerdict(int i) {
                this.value = i;
            }

            public static final AppLicensingVerdict fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return LICENSED;
                }
                if (i == 2) {
                    return UNLICENSED;
                }
                if (i == 3) {
                    return UNEVALUATED;
                }
                if (i != 4) {
                    return null;
                }
                return INVALID_ATTESTATION;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            PlayIntegrityVerdict$AccountDetails$Companion$ADAPTER$1 playIntegrityVerdict$AccountDetails$Companion$ADAPTER$1 = new PlayIntegrityVerdict$AccountDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AccountDetails.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.PlayIntegrityVerdict.AccountDetails", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/play_integrity.proto");
            ADAPTER = playIntegrityVerdict$AccountDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(playIntegrityVerdict$AccountDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountDetails(AppLicensingVerdict appLicensingVerdict, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.app_licensing_verdict = appLicensingVerdict;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountDetails)) {
                return false;
            }
            AccountDetails accountDetails = (AccountDetails) obj;
            return Intrinsics.areEqual(unknownFields(), accountDetails.unknownFields()) && this.app_licensing_verdict == accountDetails.app_licensing_verdict;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AppLicensingVerdict appLicensingVerdict = this.app_licensing_verdict;
            int hashCode2 = hashCode + (appLicensingVerdict != null ? appLicensingVerdict.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Asset.Builder builder = new Asset.Builder(10);
            builder.asset_type = this.app_licensing_verdict;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AppLicensingVerdict appLicensingVerdict = this.app_licensing_verdict;
            if (appLicensingVerdict != null) {
                arrayList.add("app_licensing_verdict=" + appLicensingVerdict);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AccountDetails{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class AppIntegrity extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppIntegrity> CREATOR;
        public final AppRecognitionVerdict app_recognition_verdict;
        public final List certificate_sha256_digest;
        public final String package_name;
        public final String version_code;

        public enum AppRecognitionVerdict implements WireEnum {
            PLAY_RECOGNIZED(1),
            UNRECOGNIZED_VERSION(2),
            UNEVALUATED(3),
            INVALID_ATTESTATION(4);

            public final int value;
            public static final RadioType.Companion Companion = new RadioType.Companion();
            public static final PlayIntegrityVerdict$AppIntegrity$AppRecognitionVerdict$Companion$ADAPTER$1 ADAPTER = new PlayIntegrityVerdict$AppIntegrity$AppRecognitionVerdict$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppRecognitionVerdict.class), Syntax.PROTO_2, null);

            AppRecognitionVerdict(int i) {
                this.value = i;
            }

            public static final AppRecognitionVerdict fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return PLAY_RECOGNIZED;
                }
                if (i == 2) {
                    return UNRECOGNIZED_VERSION;
                }
                if (i == 3) {
                    return UNEVALUATED;
                }
                if (i != 4) {
                    return null;
                }
                return INVALID_ATTESTATION;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            PlayIntegrityVerdict$AppIntegrity$Companion$ADAPTER$1 playIntegrityVerdict$AppIntegrity$Companion$ADAPTER$1 = new PlayIntegrityVerdict$AppIntegrity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppIntegrity.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.PlayIntegrityVerdict.AppIntegrity", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/play_integrity.proto");
            ADAPTER = playIntegrityVerdict$AppIntegrity$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(playIntegrityVerdict$AppIntegrity$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppIntegrity(AppRecognitionVerdict appRecognitionVerdict, String str, List list, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.app_recognition_verdict = appRecognitionVerdict;
            this.package_name = str;
            this.version_code = str2;
            this.certificate_sha256_digest = TransactorKt.immutableCopyOf("certificate_sha256_digest", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppIntegrity)) {
                return false;
            }
            AppIntegrity appIntegrity = (AppIntegrity) obj;
            return Intrinsics.areEqual(unknownFields(), appIntegrity.unknownFields()) && this.app_recognition_verdict == appIntegrity.app_recognition_verdict && Intrinsics.areEqual(this.package_name, appIntegrity.package_name) && Intrinsics.areEqual(this.certificate_sha256_digest, appIntegrity.certificate_sha256_digest) && Intrinsics.areEqual(this.version_code, appIntegrity.version_code);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AppRecognitionVerdict appRecognitionVerdict = this.app_recognition_verdict;
            int hashCode2 = (hashCode + (appRecognitionVerdict != null ? appRecognitionVerdict.hashCode() : 0)) * 37;
            String str = this.package_name;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.certificate_sha256_digest);
            String str2 = this.version_code;
            int hashCode3 = m + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(1, false);
            builder.expiration = this.app_recognition_verdict;
            builder.postal_code = this.package_name;
            builder.ciphertext_ = this.certificate_sha256_digest;
            builder.last_four_digits = this.version_code;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AppRecognitionVerdict appRecognitionVerdict = this.app_recognition_verdict;
            if (appRecognitionVerdict != null) {
                arrayList.add("app_recognition_verdict=" + appRecognitionVerdict);
            }
            String str = this.package_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "package_name=", arrayList);
            }
            List list = this.certificate_sha256_digest;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("certificate_sha256_digest=", arrayList, list);
            }
            String str2 = this.version_code;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "version_code=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppIntegrity{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public enum DeviceRecognitionVerdict implements WireEnum {
        NO_LABEL(1),
        MEETS_BASIC_INTEGRITY(2),
        MEETS_DEVICE_INTEGRITY(3),
        MEETS_STRONG_INTEGRITY(4),
        INVALID_ATTESTATION(5);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final PlayIntegrityVerdict$DeviceRecognitionVerdict$Companion$ADAPTER$1 ADAPTER = new PlayIntegrityVerdict$DeviceRecognitionVerdict$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DeviceRecognitionVerdict.class), Syntax.PROTO_2, null);

        DeviceRecognitionVerdict(int i) {
            this.value = i;
        }

        public static final DeviceRecognitionVerdict fromValue(int i) {
            Companion.getClass();
            return ImageLayout.Companion.m3844fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public final class RequestDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RequestDetails> CREATOR;
        public final String nonce;
        public final String request_package_name;
        public final Long timestamp_millis;

        static {
            PlayIntegrityVerdict$RequestDetails$Companion$ADAPTER$1 playIntegrityVerdict$RequestDetails$Companion$ADAPTER$1 = new PlayIntegrityVerdict$RequestDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequestDetails.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.PlayIntegrityVerdict.RequestDetails", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/play_integrity.proto");
            ADAPTER = playIntegrityVerdict$RequestDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(playIntegrityVerdict$RequestDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestDetails(Long l, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.request_package_name = str;
            this.nonce = str2;
            this.timestamp_millis = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RequestDetails)) {
                return false;
            }
            RequestDetails requestDetails = (RequestDetails) obj;
            return Intrinsics.areEqual(unknownFields(), requestDetails.unknownFields()) && Intrinsics.areEqual(this.request_package_name, requestDetails.request_package_name) && Intrinsics.areEqual(this.nonce, requestDetails.nonce) && Intrinsics.areEqual(this.timestamp_millis, requestDetails.timestamp_millis);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.request_package_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.nonce;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Long l = this.timestamp_millis;
            int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetDetailsPageRequest.Builder builder = new GetDetailsPageRequest.Builder(1);
            builder.details_page_token = this.request_package_name;
            builder.template_token = this.nonce;
            builder.template_version = this.timestamp_millis;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.request_package_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "request_package_name=", arrayList);
            }
            if (this.nonce != null) {
                arrayList.add("nonce=██");
            }
            Long l = this.timestamp_millis;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp_millis=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RequestDetails{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlayIntegrityVerdict.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

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
                        return new PlayIntegrityVerdict((PlayIntegrityVerdict.RequestDetails) obj, (PlayIntegrityVerdict.AppIntegrity) obj2, m, (PlayIntegrityVerdict.AccountDetails) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(PlayIntegrityVerdict.RequestDetails.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(PlayIntegrityVerdict.AppIntegrity.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        try {
                            PlayIntegrityVerdict.DeviceRecognitionVerdict.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(PlayIntegrityVerdict.AccountDetails.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PlayIntegrityVerdict playIntegrityVerdict = (PlayIntegrityVerdict) obj;
                reverseProtoWriter.getClass();
                playIntegrityVerdict.getClass();
                reverseProtoWriter.writeBytes(playIntegrityVerdict.unknownFields());
                PlayIntegrityVerdict.AccountDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 4, playIntegrityVerdict.account_details);
                PlayIntegrityVerdict.DeviceRecognitionVerdict.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, playIntegrityVerdict.device_recognition_verdict);
                PlayIntegrityVerdict.AppIntegrity.ADAPTER.encodeWithTag(reverseProtoWriter, 2, playIntegrityVerdict.app_integrity);
                PlayIntegrityVerdict.RequestDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, playIntegrityVerdict.request_details);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                PlayIntegrityVerdict playIntegrityVerdict = (PlayIntegrityVerdict) obj;
                playIntegrityVerdict.getClass();
                return PlayIntegrityVerdict.AccountDetails.ADAPTER.encodedSizeWithTag(4, playIntegrityVerdict.account_details) + PlayIntegrityVerdict.DeviceRecognitionVerdict.ADAPTER.asRepeated().encodedSizeWithTag(3, playIntegrityVerdict.device_recognition_verdict) + PlayIntegrityVerdict.AppIntegrity.ADAPTER.encodedSizeWithTag(2, playIntegrityVerdict.app_integrity) + PlayIntegrityVerdict.RequestDetails.ADAPTER.encodedSizeWithTag(1, playIntegrityVerdict.request_details) + playIntegrityVerdict.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PlayIntegrityVerdict playIntegrityVerdict = (PlayIntegrityVerdict) obj;
                playIntegrityVerdict.getClass();
                PlayIntegrityVerdict.RequestDetails requestDetails = playIntegrityVerdict.request_details;
                PlayIntegrityVerdict.RequestDetails requestDetails2 = requestDetails != null ? (PlayIntegrityVerdict.RequestDetails) PlayIntegrityVerdict.RequestDetails.ADAPTER.redact(requestDetails) : null;
                PlayIntegrityVerdict.AppIntegrity appIntegrity = playIntegrityVerdict.app_integrity;
                PlayIntegrityVerdict.AppIntegrity appIntegrity2 = appIntegrity != null ? (PlayIntegrityVerdict.AppIntegrity) PlayIntegrityVerdict.AppIntegrity.ADAPTER.redact(appIntegrity) : null;
                PlayIntegrityVerdict.AccountDetails accountDetails = playIntegrityVerdict.account_details;
                PlayIntegrityVerdict.AccountDetails accountDetails2 = accountDetails != null ? (PlayIntegrityVerdict.AccountDetails) PlayIntegrityVerdict.AccountDetails.ADAPTER.redact(accountDetails) : null;
                ByteString byteString = ByteString.EMPTY;
                List list = playIntegrityVerdict.device_recognition_verdict;
                list.getClass();
                byteString.getClass();
                return new PlayIntegrityVerdict(requestDetails2, appIntegrity2, list, accountDetails2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PlayIntegrityVerdict playIntegrityVerdict = (PlayIntegrityVerdict) obj;
                playIntegrityVerdict.getClass();
                PlayIntegrityVerdict.RequestDetails.ADAPTER.encodeWithTag(protoWriter, 1, playIntegrityVerdict.request_details);
                PlayIntegrityVerdict.AppIntegrity.ADAPTER.encodeWithTag(protoWriter, 2, playIntegrityVerdict.app_integrity);
                PlayIntegrityVerdict.DeviceRecognitionVerdict.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, playIntegrityVerdict.device_recognition_verdict);
                PlayIntegrityVerdict.AccountDetails.ADAPTER.encodeWithTag(protoWriter, 4, playIntegrityVerdict.account_details);
                protoWriter.writeBytes(playIntegrityVerdict.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityVerdict(RequestDetails requestDetails, AppIntegrity appIntegrity, List list, AccountDetails accountDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_details = requestDetails;
        this.app_integrity = appIntegrity;
        this.account_details = accountDetails;
        this.device_recognition_verdict = TransactorKt.immutableCopyOf("device_recognition_verdict", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayIntegrityVerdict)) {
            return false;
        }
        PlayIntegrityVerdict playIntegrityVerdict = (PlayIntegrityVerdict) obj;
        return Intrinsics.areEqual(unknownFields(), playIntegrityVerdict.unknownFields()) && Intrinsics.areEqual(this.request_details, playIntegrityVerdict.request_details) && Intrinsics.areEqual(this.app_integrity, playIntegrityVerdict.app_integrity) && Intrinsics.areEqual(this.device_recognition_verdict, playIntegrityVerdict.device_recognition_verdict) && Intrinsics.areEqual(this.account_details, playIntegrityVerdict.account_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestDetails requestDetails = this.request_details;
        int hashCode2 = (hashCode + (requestDetails != null ? requestDetails.hashCode() : 0)) * 37;
        AppIntegrity appIntegrity = this.app_integrity;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (appIntegrity != null ? appIntegrity.hashCode() : 0)) * 37, 37, this.device_recognition_verdict);
        AccountDetails accountDetails = this.account_details;
        int hashCode3 = m + (accountDetails != null ? accountDetails.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(2);
        builder.postal_code = this.request_details;
        builder.last_four_digits = this.app_integrity;
        builder.expiration = this.device_recognition_verdict;
        builder.ciphertext_ = this.account_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestDetails requestDetails = this.request_details;
        if (requestDetails != null) {
            arrayList.add("request_details=" + requestDetails);
        }
        AppIntegrity appIntegrity = this.app_integrity;
        if (appIntegrity != null) {
            arrayList.add("app_integrity=" + appIntegrity);
        }
        List list = this.device_recognition_verdict;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("device_recognition_verdict=", arrayList, list);
        }
        AccountDetails accountDetails = this.account_details;
        if (accountDetails != null) {
            arrayList.add("account_details=" + accountDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlayIntegrityVerdict{", "}", 0, null, null, 56);
    }
}
