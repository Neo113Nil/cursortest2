package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateSessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        SessionStatus sessionStatus;
        String str;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        SessionStatus sessionStatus2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Object obj = null;
        Object obj2 = null;
        String str7 = null;
        Object obj3 = null;
        String str8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateSessionResponse(str2, sessionStatus2, str3, m, str4, str5, str6, (AccountListConfig) obj, (AppIntroData) obj2, str7, (ProfileListConfig) obj3, str8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        sessionStatus2 = SessionStatus.ADAPTER.decode(protoReader);
                        arrayList = m;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = m;
                        sessionStatus = sessionStatus2;
                        str = str3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 4:
                    m.add(FeatureFlag.ADAPTER.decode(protoReader));
                    arrayList = m;
                    sessionStatus = sessionStatus2;
                    str = str3;
                    decode = str2;
                    str3 = str;
                    sessionStatus2 = sessionStatus;
                    break;
                case 5:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 6:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 7:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(AccountListConfig.ADAPTER, protoReader, obj);
                    arrayList = m;
                    decode = str2;
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(AppIntroData.ADAPTER, protoReader, obj2);
                    arrayList = m;
                    decode = str2;
                    break;
                case 10:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                case 11:
                    obj3 = TransactorKt.decodeMessageOrMerge(ProfileListConfig.ADAPTER, protoReader, obj3);
                    arrayList = m;
                    decode = str2;
                    break;
                case 12:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    sessionStatus = sessionStatus2;
                    str = str3;
                    decode = str2;
                    str3 = str;
                    sessionStatus2 = sessionStatus;
                    break;
            }
            str2 = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateSessionResponse initiateSessionResponse = (InitiateSessionResponse) obj;
        reverseProtoWriter.getClass();
        initiateSessionResponse.getClass();
        reverseProtoWriter.writeBytes(initiateSessionResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, initiateSessionResponse.app_attest_challenge);
        ProfileListConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 11, initiateSessionResponse.profile_list_config);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, initiateSessionResponse.play_integrity_nonce);
        AppIntroData.ADAPTER.encodeWithTag(reverseProtoWriter, 9, initiateSessionResponse.app_intro_data);
        AccountListConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 8, initiateSessionResponse.account_list_config);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, initiateSessionResponse.safety_net_api_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, initiateSessionResponse.safety_net_nonce);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, initiateSessionResponse.backup_tag);
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, initiateSessionResponse.login_feature_flags);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, initiateSessionResponse.app_token);
        SessionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, initiateSessionResponse.session_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, initiateSessionResponse.session_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateSessionResponse initiateSessionResponse = (InitiateSessionResponse) obj;
        initiateSessionResponse.getClass();
        int size$okio = initiateSessionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, initiateSessionResponse.app_attest_challenge) + ProfileListConfig.ADAPTER.encodedSizeWithTag(11, initiateSessionResponse.profile_list_config) + protoAdapter.encodedSizeWithTag(10, initiateSessionResponse.play_integrity_nonce) + AppIntroData.ADAPTER.encodedSizeWithTag(9, initiateSessionResponse.app_intro_data) + AccountListConfig.ADAPTER.encodedSizeWithTag(8, initiateSessionResponse.account_list_config) + protoAdapter.encodedSizeWithTag(7, initiateSessionResponse.safety_net_api_key) + protoAdapter.encodedSizeWithTag(6, initiateSessionResponse.safety_net_nonce) + protoAdapter.encodedSizeWithTag(5, initiateSessionResponse.backup_tag) + FeatureFlag.ADAPTER.asRepeated().encodedSizeWithTag(4, initiateSessionResponse.login_feature_flags) + protoAdapter.encodedSizeWithTag(3, initiateSessionResponse.app_token) + SessionStatus.ADAPTER.encodedSizeWithTag(2, initiateSessionResponse.session_status) + protoAdapter.encodedSizeWithTag(1, initiateSessionResponse.session_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateSessionResponse initiateSessionResponse = (InitiateSessionResponse) obj;
        initiateSessionResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(initiateSessionResponse.login_feature_flags, FeatureFlag.ADAPTER);
        AccountListConfig accountListConfig = initiateSessionResponse.account_list_config;
        AccountListConfig accountListConfig2 = accountListConfig != null ? (AccountListConfig) AccountListConfig.ADAPTER.redact(accountListConfig) : null;
        AppIntroData appIntroData = initiateSessionResponse.app_intro_data;
        AppIntroData appIntroData2 = appIntroData != null ? (AppIntroData) AppIntroData.ADAPTER.redact(appIntroData) : null;
        ProfileListConfig profileListConfig = initiateSessionResponse.profile_list_config;
        ProfileListConfig profileListConfig2 = profileListConfig != null ? (ProfileListConfig) ProfileListConfig.ADAPTER.redact(profileListConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        SessionStatus sessionStatus = initiateSessionResponse.session_status;
        String str = initiateSessionResponse.app_token;
        byteString.getClass();
        return new InitiateSessionResponse(null, sessionStatus, str, m1169redactElements, null, null, null, accountListConfig2, appIntroData2, null, profileListConfig2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateSessionResponse initiateSessionResponse = (InitiateSessionResponse) obj;
        initiateSessionResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, initiateSessionResponse.session_token);
        SessionStatus.ADAPTER.encodeWithTag(protoWriter, 2, initiateSessionResponse.session_status);
        protoAdapter.encodeWithTag(protoWriter, 3, initiateSessionResponse.app_token);
        FeatureFlag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, initiateSessionResponse.login_feature_flags);
        protoAdapter.encodeWithTag(protoWriter, 5, initiateSessionResponse.backup_tag);
        protoAdapter.encodeWithTag(protoWriter, 6, initiateSessionResponse.safety_net_nonce);
        protoAdapter.encodeWithTag(protoWriter, 7, initiateSessionResponse.safety_net_api_key);
        AccountListConfig.ADAPTER.encodeWithTag(protoWriter, 8, initiateSessionResponse.account_list_config);
        AppIntroData.ADAPTER.encodeWithTag(protoWriter, 9, initiateSessionResponse.app_intro_data);
        protoAdapter.encodeWithTag(protoWriter, 10, initiateSessionResponse.play_integrity_nonce);
        ProfileListConfig.ADAPTER.encodeWithTag(protoWriter, 11, initiateSessionResponse.profile_list_config);
        protoAdapter.encodeWithTag(protoWriter, 12, initiateSessionResponse.app_attest_challenge);
        protoWriter.writeBytes(initiateSessionResponse.unknownFields());
    }
}
