package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzhi;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest;
import com.squareup.protos.cash.money.content.MoneyTab;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ReportMarketingMessageViewedRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportMarketingMessageViewedRequest> CREATOR;
    public final zzhi viewed_target;

    /* loaded from: classes7.dex */
    public final class MarketingMessageTokenList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MarketingMessageTokenList> CREATOR;
        public final List tokens;

        static {
            ReportMarketingMessageViewedRequest$MarketingMessageTokenList$Companion$ADAPTER$1 reportMarketingMessageViewedRequest$MarketingMessageTokenList$Companion$ADAPTER$1 = new ReportMarketingMessageViewedRequest$MarketingMessageTokenList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketingMessageTokenList.class), "type.googleapis.com/squareup.cash.local.client.app.v1.ReportMarketingMessageViewedRequest.MarketingMessageTokenList", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
            ADAPTER = reportMarketingMessageViewedRequest$MarketingMessageTokenList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(reportMarketingMessageViewedRequest$MarketingMessageTokenList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketingMessageTokenList(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.tokens = TransactorKt.immutableCopyOf("tokens", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MarketingMessageTokenList)) {
                return false;
            }
            MarketingMessageTokenList marketingMessageTokenList = (MarketingMessageTokenList) obj;
            return Intrinsics.areEqual(unknownFields(), marketingMessageTokenList.unknownFields()) && Intrinsics.areEqual(this.tokens, marketingMessageTokenList.tokens);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.tokens.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MoneyTab.Builder builder = new MoneyTab.Builder(2, false);
            builder.applets = this.tokens;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.tokens;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tokens=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MarketingMessageTokenList{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReportMarketingMessageViewedRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                zzhi zzhiVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ReportMarketingMessageViewedRequest(zzhiVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        zzhiVar = new ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens((ReportMarketingMessageViewedRequest.MarketingMessageTokenList) ReportMarketingMessageViewedRequest.MarketingMessageTokenList.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        zzhiVar = new ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzhiVar = new ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = (ReportMarketingMessageViewedRequest) obj;
                reverseProtoWriter.getClass();
                reportMarketingMessageViewedRequest.getClass();
                reverseProtoWriter.writeBytes(reportMarketingMessageViewedRequest.unknownFields());
                zzhi zzhiVar = reportMarketingMessageViewedRequest.viewed_target;
                if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) {
                    ReportMarketingMessageViewedRequest.MarketingMessageTokenList.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) zzhiVar).value);
                    return;
                }
                if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, Boolean.valueOf(((ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed) zzhiVar).value));
                } else if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, Boolean.valueOf(((ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) zzhiVar).value));
                } else {
                    if (zzhiVar == null) {
                        return;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = (ReportMarketingMessageViewedRequest) obj;
                reportMarketingMessageViewedRequest.getClass();
                int size$okio = reportMarketingMessageViewedRequest.unknownFields().getSize$okio();
                zzhi zzhiVar = reportMarketingMessageViewedRequest.viewed_target;
                if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) {
                    return ReportMarketingMessageViewedRequest.MarketingMessageTokenList.ADAPTER.encodedSizeWithTag(1, ((ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) zzhiVar).value) + size$okio;
                }
                if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed) {
                    return SizeMode$EnumUnboxingLocalUtility.m(((ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed) zzhiVar).value, ProtoAdapter.BOOL, 2, size$okio);
                }
                if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) {
                    return SizeMode$EnumUnboxingLocalUtility.m(((ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) zzhiVar).value, ProtoAdapter.BOOL, 3, size$okio);
                }
                if (zzhiVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = (ReportMarketingMessageViewedRequest) obj;
                reportMarketingMessageViewedRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                zzhi zzhiVar = reportMarketingMessageViewedRequest.viewed_target;
                byteString.getClass();
                return new ReportMarketingMessageViewedRequest(zzhiVar, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = (ReportMarketingMessageViewedRequest) obj;
                reportMarketingMessageViewedRequest.getClass();
                zzhi zzhiVar = reportMarketingMessageViewedRequest.viewed_target;
                if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) {
                    ReportMarketingMessageViewedRequest.MarketingMessageTokenList.ADAPTER.encodeWithTag(protoWriter, 1, ((ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) zzhiVar).value);
                } else if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, Boolean.valueOf(((ReportMarketingMessageViewedRequest$ViewedTarget$AllViewed) zzhiVar).value));
                } else if (zzhiVar instanceof ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, Boolean.valueOf(((ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) zzhiVar).value));
                } else if (zzhiVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(reportMarketingMessageViewedRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportMarketingMessageViewedRequest(zzhi zzhiVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.viewed_target = zzhiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportMarketingMessageViewedRequest)) {
            return false;
        }
        ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest = (ReportMarketingMessageViewedRequest) obj;
        return Intrinsics.areEqual(unknownFields(), reportMarketingMessageViewedRequest.unknownFields()) && Intrinsics.areEqual(this.viewed_target, reportMarketingMessageViewedRequest.viewed_target);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzhi zzhiVar = this.viewed_target;
        int hashCode2 = hashCode + (zzhiVar != null ? zzhiVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(13);
        builder.f1276type = this.viewed_target;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzhi zzhiVar = this.viewed_target;
        if (zzhiVar != null) {
            arrayList.add("viewed_target=" + zzhiVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportMarketingMessageViewedRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ReportMarketingMessageViewedRequest(zzhi zzhiVar) {
        this(zzhiVar, ByteString.EMPTY);
    }
}
