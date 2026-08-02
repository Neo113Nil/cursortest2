package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.bumptech.glide.module.AppGlideModule;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class StartWebAuthnAuthenticationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartWebAuthnAuthenticationRequest> CREATOR;
    public final AppGlideModule login_entity;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StartWebAuthnAuthenticationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                AppGlideModule appGlideModule = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new StartWebAuthnAuthenticationRequest(appGlideModule, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        appGlideModule = new StartWebAuthnAuthenticationRequest$LoginEntity$Customer((StartWebAuthnAuthenticationRequest.Customer) StartWebAuthnAuthenticationRequest.Customer.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        appGlideModule = new StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        appGlideModule = new StartWebAuthnAuthenticationRequest$LoginEntity$Email((String) ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                StartWebAuthnAuthenticationRequest startWebAuthnAuthenticationRequest = (StartWebAuthnAuthenticationRequest) obj;
                reverseProtoWriter.getClass();
                startWebAuthnAuthenticationRequest.getClass();
                reverseProtoWriter.writeBytes(startWebAuthnAuthenticationRequest.unknownFields());
                AppGlideModule appGlideModule = startWebAuthnAuthenticationRequest.login_entity;
                if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Customer) {
                    StartWebAuthnAuthenticationRequest.Customer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((StartWebAuthnAuthenticationRequest$LoginEntity$Customer) appGlideModule).value);
                    return;
                }
                if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber) appGlideModule).value);
                } else if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Email) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((StartWebAuthnAuthenticationRequest$LoginEntity$Email) appGlideModule).value);
                } else {
                    if (appGlideModule == null) {
                        return;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                StartWebAuthnAuthenticationRequest startWebAuthnAuthenticationRequest = (StartWebAuthnAuthenticationRequest) obj;
                startWebAuthnAuthenticationRequest.getClass();
                int size$okio = startWebAuthnAuthenticationRequest.unknownFields().getSize$okio();
                AppGlideModule appGlideModule = startWebAuthnAuthenticationRequest.login_entity;
                if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Customer) {
                    encodedSizeWithTag = StartWebAuthnAuthenticationRequest.Customer.ADAPTER.encodedSizeWithTag(1, ((StartWebAuthnAuthenticationRequest$LoginEntity$Customer) appGlideModule).value);
                } else if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber) {
                    encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber) appGlideModule).value);
                } else {
                    if (!(appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Email)) {
                        if (appGlideModule == null) {
                            return size$okio;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, ((StartWebAuthnAuthenticationRequest$LoginEntity$Email) appGlideModule).value);
                }
                return encodedSizeWithTag + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((StartWebAuthnAuthenticationRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new StartWebAuthnAuthenticationRequest((AppGlideModule) null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                StartWebAuthnAuthenticationRequest startWebAuthnAuthenticationRequest = (StartWebAuthnAuthenticationRequest) obj;
                startWebAuthnAuthenticationRequest.getClass();
                AppGlideModule appGlideModule = startWebAuthnAuthenticationRequest.login_entity;
                if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Customer) {
                    StartWebAuthnAuthenticationRequest.Customer.ADAPTER.encodeWithTag(protoWriter, 1, ((StartWebAuthnAuthenticationRequest$LoginEntity$Customer) appGlideModule).value);
                } else if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((StartWebAuthnAuthenticationRequest$LoginEntity$SmsNumber) appGlideModule).value);
                } else if (appGlideModule instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Email) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((StartWebAuthnAuthenticationRequest$LoginEntity$Email) appGlideModule).value);
                } else if (appGlideModule != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(startWebAuthnAuthenticationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ StartWebAuthnAuthenticationRequest(AppGlideModule appGlideModule, int i) {
        this((i & 1) != 0 ? null : appGlideModule, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartWebAuthnAuthenticationRequest)) {
            return false;
        }
        StartWebAuthnAuthenticationRequest startWebAuthnAuthenticationRequest = (StartWebAuthnAuthenticationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), startWebAuthnAuthenticationRequest.unknownFields()) && Intrinsics.areEqual(this.login_entity, startWebAuthnAuthenticationRequest.login_entity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppGlideModule appGlideModule = this.login_entity;
        int hashCode2 = hashCode + (appGlideModule != null ? appGlideModule.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(10);
        builder.f1276type = this.login_entity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.login_entity != null) {
            arrayList.add("login_entity=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartWebAuthnAuthenticationRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Customer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Customer> CREATOR;
        public final String customer_token;

        static {
            StartWebAuthnAuthenticationRequest$Customer$Companion$ADAPTER$1 startWebAuthnAuthenticationRequest$Customer$Companion$ADAPTER$1 = new StartWebAuthnAuthenticationRequest$Customer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Customer.class), "type.googleapis.com/squareup.cash.janus.api.StartWebAuthnAuthenticationRequest.Customer", Syntax.PROTO_2, null, "squareup/cash/janus/api/WebAuthn.proto");
            ADAPTER = startWebAuthnAuthenticationRequest$Customer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(startWebAuthnAuthenticationRequest$Customer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Customer(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.customer_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Customer)) {
                return false;
            }
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(unknownFields(), customer.unknownFields()) && Intrinsics.areEqual(this.customer_token, customer.customer_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.customer_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Favorite.Builder builder = new Favorite.Builder(26);
            builder.favorite_customer_token = this.customer_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Customer{", "}", 0, null, null, 56);
        }

        public /* synthetic */ Customer(String str) {
            this(str, ByteString.EMPTY);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartWebAuthnAuthenticationRequest(AppGlideModule appGlideModule, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.login_entity = appGlideModule;
    }
}
