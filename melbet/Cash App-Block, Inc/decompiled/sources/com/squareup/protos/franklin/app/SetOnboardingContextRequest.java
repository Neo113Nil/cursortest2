package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.onboarding.OnboardingDeepLinkPayload;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetOnboardingContextRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetOnboardingContextRequest> CREATOR;
    public final OnboardingDeepLinkPayload onboarding_deeplink_payload;
    public final String onboarding_payload;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetOnboardingContextRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetOnboardingContextRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetOnboardingContextRequest((String) obj, (OnboardingDeepLinkPayload) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(OnboardingDeepLinkPayload.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetOnboardingContextRequest setOnboardingContextRequest = (SetOnboardingContextRequest) obj;
                reverseProtoWriter.getClass();
                setOnboardingContextRequest.getClass();
                reverseProtoWriter.writeBytes(setOnboardingContextRequest.unknownFields());
                OnboardingDeepLinkPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setOnboardingContextRequest.onboarding_deeplink_payload);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setOnboardingContextRequest.onboarding_payload);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetOnboardingContextRequest setOnboardingContextRequest = (SetOnboardingContextRequest) obj;
                setOnboardingContextRequest.getClass();
                return OnboardingDeepLinkPayload.ADAPTER.encodedSizeWithTag(2, setOnboardingContextRequest.onboarding_deeplink_payload) + ProtoAdapter.STRING.encodedSizeWithTag(1, setOnboardingContextRequest.onboarding_payload) + setOnboardingContextRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetOnboardingContextRequest setOnboardingContextRequest = (SetOnboardingContextRequest) obj;
                setOnboardingContextRequest.getClass();
                OnboardingDeepLinkPayload onboardingDeepLinkPayload = setOnboardingContextRequest.onboarding_deeplink_payload;
                OnboardingDeepLinkPayload onboardingDeepLinkPayload2 = onboardingDeepLinkPayload != null ? (OnboardingDeepLinkPayload) OnboardingDeepLinkPayload.ADAPTER.redact(onboardingDeepLinkPayload) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = setOnboardingContextRequest.onboarding_payload;
                byteString.getClass();
                return new SetOnboardingContextRequest(str, onboardingDeepLinkPayload2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetOnboardingContextRequest setOnboardingContextRequest = (SetOnboardingContextRequest) obj;
                setOnboardingContextRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setOnboardingContextRequest.onboarding_payload);
                OnboardingDeepLinkPayload.ADAPTER.encodeWithTag(protoWriter, 2, setOnboardingContextRequest.onboarding_deeplink_payload);
                protoWriter.writeBytes(setOnboardingContextRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetOnboardingContextRequest(String str, OnboardingDeepLinkPayload onboardingDeepLinkPayload, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.onboarding_payload = str;
        this.onboarding_deeplink_payload = onboardingDeepLinkPayload;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetOnboardingContextRequest)) {
            return false;
        }
        SetOnboardingContextRequest setOnboardingContextRequest = (SetOnboardingContextRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setOnboardingContextRequest.unknownFields()) && Intrinsics.areEqual(this.onboarding_payload, setOnboardingContextRequest.onboarding_payload) && Intrinsics.areEqual(this.onboarding_deeplink_payload, setOnboardingContextRequest.onboarding_deeplink_payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.onboarding_payload;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = this.onboarding_deeplink_payload;
        int hashCode3 = hashCode2 + (onboardingDeepLinkPayload != null ? onboardingDeepLinkPayload.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(13);
        builder.request_context = this.onboarding_payload;
        builder.result = this.onboarding_deeplink_payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.onboarding_payload;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "onboarding_payload=", arrayList);
        }
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = this.onboarding_deeplink_payload;
        if (onboardingDeepLinkPayload != null) {
            arrayList.add("onboarding_deeplink_payload=" + onboardingDeepLinkPayload);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetOnboardingContextRequest{", "}", 0, null, null, 56);
    }
}
