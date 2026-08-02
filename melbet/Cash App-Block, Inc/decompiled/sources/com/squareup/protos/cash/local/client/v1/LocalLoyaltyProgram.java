package com.squareup.protos.cash.local.client.v1;

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
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram$Builder;", "", "loyalty_terminology_singular", "Ljava/lang/String;", "loyalty_terminology_plural", "loyalty_terminology_singular_capitalized", "loyalty_terminology_plural_capitalized", "accrual_terms", "", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyReward;", "reward_tiers", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalLoyaltyProgram extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalLoyaltyProgram> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String accrual_terms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String loyalty_terminology_plural;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String loyalty_terminology_plural_capitalized;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String loyalty_terminology_singular;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String loyalty_terminology_singular_capitalized;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalLoyaltyReward#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<LocalLoyaltyReward> reward_tiers;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;", "<init>", "()V", "reward_tiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyReward;", "loyalty_terminology_singular", "", "loyalty_terminology_plural", "loyalty_terminology_singular_capitalized", "loyalty_terminology_plural_capitalized", "accrual_terms", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accrual_terms;
        public String loyalty_terminology_plural;
        public String loyalty_terminology_plural_capitalized;
        public String loyalty_terminology_singular;
        public String loyalty_terminology_singular_capitalized;
        public List<LocalLoyaltyReward> reward_tiers = EmptyList.INSTANCE;

        public final Builder accrual_terms(String accrual_terms) {
            this.accrual_terms = accrual_terms;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LocalLoyaltyProgram build() {
            return new LocalLoyaltyProgram(this.loyalty_terminology_singular, this.loyalty_terminology_plural, this.loyalty_terminology_singular_capitalized, this.loyalty_terminology_plural_capitalized, this.accrual_terms, this.reward_tiers, buildUnknownFields());
        }

        public final Builder loyalty_terminology_plural(String loyalty_terminology_plural) {
            this.loyalty_terminology_plural = loyalty_terminology_plural;
            return this;
        }

        public final Builder loyalty_terminology_plural_capitalized(String loyalty_terminology_plural_capitalized) {
            this.loyalty_terminology_plural_capitalized = loyalty_terminology_plural_capitalized;
            return this;
        }

        public final Builder loyalty_terminology_singular(String loyalty_terminology_singular) {
            this.loyalty_terminology_singular = loyalty_terminology_singular;
            return this;
        }

        public final Builder loyalty_terminology_singular_capitalized(String loyalty_terminology_singular_capitalized) {
            this.loyalty_terminology_singular_capitalized = loyalty_terminology_singular_capitalized;
            return this;
        }

        public final Builder reward_tiers(List<LocalLoyaltyReward> reward_tiers) {
            reward_tiers.getClass();
            TransactorKt.checkElementsNotNull(reward_tiers);
            this.reward_tiers = reward_tiers;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalLoyaltyProgram.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalLoyaltyProgram decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalLoyaltyProgram((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(LocalLoyaltyReward.ADAPTER.decode(reader));
                            break;
                        case 2:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalLoyaltyProgram value) {
                writer.getClass();
                value.getClass();
                LocalLoyaltyReward.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.reward_tiers);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.loyalty_terminology_singular);
                protoAdapter2.encodeWithTag(writer, 3, value.loyalty_terminology_plural);
                protoAdapter2.encodeWithTag(writer, 4, value.loyalty_terminology_singular_capitalized);
                protoAdapter2.encodeWithTag(writer, 5, value.loyalty_terminology_plural_capitalized);
                protoAdapter2.encodeWithTag(writer, 6, value.accrual_terms);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalLoyaltyProgram value) {
                value.getClass();
                int encodedSizeWithTag = LocalLoyaltyReward.ADAPTER.asRepeated().encodedSizeWithTag(1, value.reward_tiers) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, value.accrual_terms) + protoAdapter2.encodedSizeWithTag(5, value.loyalty_terminology_plural_capitalized) + protoAdapter2.encodedSizeWithTag(4, value.loyalty_terminology_singular_capitalized) + protoAdapter2.encodedSizeWithTag(3, value.loyalty_terminology_plural) + protoAdapter2.encodedSizeWithTag(2, value.loyalty_terminology_singular) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalLoyaltyProgram redact(LocalLoyaltyProgram value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.reward_tiers, LocalLoyaltyReward.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.loyalty_terminology_singular;
                String str2 = value.loyalty_terminology_plural;
                String str3 = value.loyalty_terminology_singular_capitalized;
                String str4 = value.loyalty_terminology_plural_capitalized;
                String str5 = value.accrual_terms;
                byteString.getClass();
                return new LocalLoyaltyProgram(str, str2, str3, str4, str5, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalLoyaltyProgram value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.accrual_terms);
                protoAdapter2.encodeWithTag(writer, 5, value.loyalty_terminology_plural_capitalized);
                protoAdapter2.encodeWithTag(writer, 4, value.loyalty_terminology_singular_capitalized);
                protoAdapter2.encodeWithTag(writer, 3, value.loyalty_terminology_plural);
                protoAdapter2.encodeWithTag(writer, 2, value.loyalty_terminology_singular);
                LocalLoyaltyReward.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.reward_tiers);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLoyaltyProgram(String str, String str2, String str3, String str4, String str5, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.loyalty_terminology_singular = str;
        this.loyalty_terminology_plural = str2;
        this.loyalty_terminology_singular_capitalized = str3;
        this.loyalty_terminology_plural_capitalized = str4;
        this.accrual_terms = str5;
        this.reward_tiers = TransactorKt.immutableCopyOf("reward_tiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalLoyaltyProgram)) {
            return false;
        }
        LocalLoyaltyProgram localLoyaltyProgram = (LocalLoyaltyProgram) obj;
        return Intrinsics.areEqual(unknownFields(), localLoyaltyProgram.unknownFields()) && Intrinsics.areEqual(this.reward_tiers, localLoyaltyProgram.reward_tiers) && Intrinsics.areEqual(this.loyalty_terminology_singular, localLoyaltyProgram.loyalty_terminology_singular) && Intrinsics.areEqual(this.loyalty_terminology_plural, localLoyaltyProgram.loyalty_terminology_plural) && Intrinsics.areEqual(this.loyalty_terminology_singular_capitalized, localLoyaltyProgram.loyalty_terminology_singular_capitalized) && Intrinsics.areEqual(this.loyalty_terminology_plural_capitalized, localLoyaltyProgram.loyalty_terminology_plural_capitalized) && Intrinsics.areEqual(this.accrual_terms, localLoyaltyProgram.accrual_terms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.reward_tiers);
        String str = this.loyalty_terminology_singular;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.loyalty_terminology_plural;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.loyalty_terminology_singular_capitalized;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.loyalty_terminology_plural_capitalized;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.accrual_terms;
        int hashCode5 = hashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.reward_tiers = this.reward_tiers;
        builder.loyalty_terminology_singular = this.loyalty_terminology_singular;
        builder.loyalty_terminology_plural = this.loyalty_terminology_plural;
        builder.loyalty_terminology_singular_capitalized = this.loyalty_terminology_singular_capitalized;
        builder.loyalty_terminology_plural_capitalized = this.loyalty_terminology_plural_capitalized;
        builder.accrual_terms = this.accrual_terms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.reward_tiers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("reward_tiers=", arrayList, this.reward_tiers);
        }
        String str = this.loyalty_terminology_singular;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "loyalty_terminology_singular=", arrayList);
        }
        String str2 = this.loyalty_terminology_plural;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "loyalty_terminology_plural=", arrayList);
        }
        String str3 = this.loyalty_terminology_singular_capitalized;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loyalty_terminology_singular_capitalized=", arrayList);
        }
        String str4 = this.loyalty_terminology_plural_capitalized;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "loyalty_terminology_plural_capitalized=", arrayList);
        }
        String str5 = this.accrual_terms;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "accrual_terms=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalLoyaltyProgram{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalLoyaltyProgram;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalLoyaltyProgram build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
