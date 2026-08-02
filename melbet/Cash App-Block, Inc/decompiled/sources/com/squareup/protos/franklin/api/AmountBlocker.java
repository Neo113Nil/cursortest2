package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AmountBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000f\u0010\u000e\u0011\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AmountBlocker$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config;", "config", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config;", "confirm_button_text", "Lcom/squareup/protos/franklin/api/BlockerAction;", "help_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "Companion", "Builder", "Config", "MoneyConfig", "PercentageConfig", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AmountBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AmountBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 2)
    public final Config config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 6)
    public final String confirm_button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 4, tag = 7)
    public final BlockerAction help_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AmountBlocker;", "<init>", "()V", "title", "", "subtitle", "config", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config;", "confirm_button_text", "help_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Config config;
        public String confirm_button_text;
        public BlockerAction help_action;
        public String subtitle;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public AmountBlocker build() {
            return new AmountBlocker(this.title, this.subtitle, this.config, this.confirm_button_text, this.help_action, buildUnknownFields());
        }

        public final Builder config(Config config) {
            this.config = config;
            return this;
        }

        public final Builder confirm_button_text(String confirm_button_text) {
            this.confirm_button_text = confirm_button_text;
            return this;
        }

        public final Builder help_action(BlockerAction help_action) {
            this.help_action = help_action;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AmountBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AmountBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AmountBlocker decode(ProtoReader reader) {
                AmountBlocker.Config moneyConfig;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                AmountBlocker.Config config = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AmountBlocker((String) obj, (String) obj2, config, (String) obj3, (BlockerAction) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        if (nextTag == 4) {
                            moneyConfig = new AmountBlocker.Config.MoneyConfig((AmountBlocker.MoneyConfig) AmountBlocker.MoneyConfig.ADAPTER.decode(reader));
                        } else if (nextTag == 5) {
                            moneyConfig = new AmountBlocker.Config.PercentageConfig((AmountBlocker.PercentageConfig) AmountBlocker.PercentageConfig.ADAPTER.decode(reader));
                        } else if (nextTag == 6) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 7) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj4);
                        }
                        config = moneyConfig;
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AmountBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 6, value.confirm_button_text);
                BlockerAction.ADAPTER.encodeWithTag(writer, 7, value.help_action);
                AmountBlocker.Config config = value.config;
                if (config instanceof AmountBlocker.Config.MoneyConfig) {
                    AmountBlocker.MoneyConfig.ADAPTER.encodeWithTag(writer, 4, ((AmountBlocker.Config.MoneyConfig) config).getValue());
                } else if (config instanceof AmountBlocker.Config.PercentageConfig) {
                    AmountBlocker.PercentageConfig.ADAPTER.encodeWithTag(writer, 5, ((AmountBlocker.Config.PercentageConfig) config).getValue());
                } else if (config != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AmountBlocker value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                AmountBlocker.Config config = value.config;
                if (config instanceof AmountBlocker.Config.MoneyConfig) {
                    encodedSizeWithTag = AmountBlocker.MoneyConfig.ADAPTER.encodedSizeWithTag(4, ((AmountBlocker.Config.MoneyConfig) config).getValue());
                } else {
                    if (!(config instanceof AmountBlocker.Config.PercentageConfig)) {
                        if (config != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return BlockerAction.ADAPTER.encodedSizeWithTag(7, value.help_action) + protoAdapter2.encodedSizeWithTag(6, value.confirm_button_text) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = AmountBlocker.PercentageConfig.ADAPTER.encodedSizeWithTag(5, ((AmountBlocker.Config.PercentageConfig) config).getValue());
                }
                encodedSizeWithTag2 += encodedSizeWithTag;
                return BlockerAction.ADAPTER.encodedSizeWithTag(7, value.help_action) + protoAdapter2.encodedSizeWithTag(6, value.confirm_button_text) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AmountBlocker redact(AmountBlocker value) {
                value.getClass();
                BlockerAction blockerAction = value.help_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                AmountBlocker.Config config = value.config;
                String str3 = value.confirm_button_text;
                byteString.getClass();
                return new AmountBlocker(str, str2, config, str3, blockerAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AmountBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AmountBlocker.Config config = value.config;
                if (config instanceof AmountBlocker.Config.MoneyConfig) {
                    AmountBlocker.MoneyConfig.ADAPTER.encodeWithTag(writer, 4, ((AmountBlocker.Config.MoneyConfig) config).getValue());
                } else if (config instanceof AmountBlocker.Config.PercentageConfig) {
                    AmountBlocker.PercentageConfig.ADAPTER.encodeWithTag(writer, 5, ((AmountBlocker.Config.PercentageConfig) config).getValue());
                } else if (config != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                BlockerAction.ADAPTER.encodeWithTag(writer, 7, value.help_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.confirm_button_text);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountBlocker(String str, String str2, Config config, String str3, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.config = config;
        this.confirm_button_text = str3;
        this.help_action = blockerAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AmountBlocker)) {
            return false;
        }
        AmountBlocker amountBlocker = (AmountBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), amountBlocker.unknownFields()) && Intrinsics.areEqual(this.title, amountBlocker.title) && Intrinsics.areEqual(this.subtitle, amountBlocker.subtitle) && Intrinsics.areEqual(this.config, amountBlocker.config) && Intrinsics.areEqual(this.confirm_button_text, amountBlocker.confirm_button_text) && Intrinsics.areEqual(this.help_action, amountBlocker.help_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Config config = this.config;
        int hashCode4 = (hashCode3 + (config != null ? config.hashCode() : 0)) * 37;
        String str3 = this.confirm_button_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.help_action;
        int hashCode6 = hashCode5 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.config = this.config;
        builder.confirm_button_text = this.confirm_button_text;
        builder.help_action = this.help_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        Config config = this.config;
        if (config != null) {
            arrayList.add("config=" + config);
        }
        String str3 = this.confirm_button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "confirm_button_text=", arrayList);
        }
        BlockerAction blockerAction = this.help_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("help_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AmountBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig$Builder;", "minimum_amount", "Lcom/squareup/protos/common/Money;", "maximum_amount", "prefilled_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MoneyConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MoneyConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
        public final Money maximum_amount;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 0, tag = 1)
        public final Money minimum_amount;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
        public final Money prefilled_amount;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;", "<init>", "()V", "minimum_amount", "Lcom/squareup/protos/common/Money;", "maximum_amount", "prefilled_amount", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Money maximum_amount;
            public Money minimum_amount;
            public Money prefilled_amount;

            @Override // com.squareup.wire.Message.Builder
            public MoneyConfig build() {
                return new MoneyConfig(this.minimum_amount, this.maximum_amount, this.prefilled_amount, buildUnknownFields());
            }

            public final Builder maximum_amount(Money maximum_amount) {
                this.maximum_amount = maximum_amount;
                return this;
            }

            public final Builder minimum_amount(Money minimum_amount) {
                this.minimum_amount = minimum_amount;
                return this;
            }

            public final Builder prefilled_amount(Money prefilled_amount) {
                this.prefilled_amount = prefilled_amount;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MoneyConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AmountBlocker$MoneyConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AmountBlocker.MoneyConfig decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AmountBlocker.MoneyConfig((Money) obj, (Money) obj2, (Money) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj2);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AmountBlocker.MoneyConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = Money.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.minimum_amount);
                    protoAdapter2.encodeWithTag(writer, 2, value.maximum_amount);
                    protoAdapter2.encodeWithTag(writer, 3, value.prefilled_amount);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AmountBlocker.MoneyConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = Money.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(3, value.prefilled_amount) + protoAdapter2.encodedSizeWithTag(2, value.maximum_amount) + protoAdapter2.encodedSizeWithTag(1, value.minimum_amount) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AmountBlocker.MoneyConfig redact(AmountBlocker.MoneyConfig value) {
                    value.getClass();
                    Money money = value.minimum_amount;
                    Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                    Money money3 = value.maximum_amount;
                    Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                    Money money5 = value.prefilled_amount;
                    return value.copy(money2, money4, money5 != null ? (Money) Money.ADAPTER.redact(money5) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AmountBlocker.MoneyConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = Money.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.prefilled_amount);
                    protoAdapter2.encodeWithTag(writer, 2, value.maximum_amount);
                    protoAdapter2.encodeWithTag(writer, 1, value.minimum_amount);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ MoneyConfig(Money money, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ MoneyConfig copy$default(MoneyConfig moneyConfig, Money money, Money money2, Money money3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                money = moneyConfig.minimum_amount;
            }
            if ((i & 2) != 0) {
                money2 = moneyConfig.maximum_amount;
            }
            if ((i & 4) != 0) {
                money3 = moneyConfig.prefilled_amount;
            }
            if ((i & 8) != 0) {
                byteString = moneyConfig.unknownFields();
            }
            return moneyConfig.copy(money, money2, money3, byteString);
        }

        public final MoneyConfig copy(Money minimum_amount, Money maximum_amount, Money prefilled_amount, ByteString unknownFields) {
            unknownFields.getClass();
            return new MoneyConfig(minimum_amount, maximum_amount, prefilled_amount, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MoneyConfig)) {
                return false;
            }
            MoneyConfig moneyConfig = (MoneyConfig) other;
            return Intrinsics.areEqual(unknownFields(), moneyConfig.unknownFields()) && Intrinsics.areEqual(this.minimum_amount, moneyConfig.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, moneyConfig.maximum_amount) && Intrinsics.areEqual(this.prefilled_amount, moneyConfig.prefilled_amount);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.minimum_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.maximum_amount;
            int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.prefilled_amount;
            int hashCode4 = hashCode3 + (money3 != null ? money3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.minimum_amount = this.minimum_amount;
            builder.maximum_amount = this.maximum_amount;
            builder.prefilled_amount = this.prefilled_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.minimum_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
            }
            Money money2 = this.maximum_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money2, arrayList);
            }
            Money money3 = this.prefilled_amount;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("prefilled_amount=", money3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MoneyConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public MoneyConfig() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoneyConfig(Money money, Money money2, Money money3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.minimum_amount = money;
            this.maximum_amount = money2;
            this.prefilled_amount = money3;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig$Builder;", "minimum_amount", "Lcom/squareup/protos/franklin/api/ScientificNumber;", "maximum_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/ScientificNumber;Lcom/squareup/protos/franklin/api/ScientificNumber;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PercentageConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PercentageConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.ScientificNumber#ADAPTER", schemaIndex = 1, tag = 2)
        public final ScientificNumber maximum_amount;

        @WireField(adapter = "com.squareup.protos.franklin.api.ScientificNumber#ADAPTER", schemaIndex = 0, tag = 1)
        public final ScientificNumber minimum_amount;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;", "<init>", "()V", "minimum_amount", "Lcom/squareup/protos/franklin/api/ScientificNumber;", "maximum_amount", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ScientificNumber maximum_amount;
            public ScientificNumber minimum_amount;

            @Override // com.squareup.wire.Message.Builder
            public PercentageConfig build() {
                return new PercentageConfig(this.minimum_amount, this.maximum_amount, buildUnknownFields());
            }

            public final Builder maximum_amount(ScientificNumber maximum_amount) {
                this.maximum_amount = maximum_amount;
                return this;
            }

            public final Builder minimum_amount(ScientificNumber minimum_amount) {
                this.minimum_amount = minimum_amount;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PercentageConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AmountBlocker$PercentageConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AmountBlocker.PercentageConfig decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AmountBlocker.PercentageConfig((ScientificNumber) obj, (ScientificNumber) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(ScientificNumber.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(ScientificNumber.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AmountBlocker.PercentageConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ScientificNumber.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.minimum_amount);
                    protoAdapter2.encodeWithTag(writer, 2, value.maximum_amount);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AmountBlocker.PercentageConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ScientificNumber.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(2, value.maximum_amount) + protoAdapter2.encodedSizeWithTag(1, value.minimum_amount) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AmountBlocker.PercentageConfig redact(AmountBlocker.PercentageConfig value) {
                    value.getClass();
                    ScientificNumber scientificNumber = value.minimum_amount;
                    ScientificNumber scientificNumber2 = scientificNumber != null ? (ScientificNumber) ScientificNumber.ADAPTER.redact(scientificNumber) : null;
                    ScientificNumber scientificNumber3 = value.maximum_amount;
                    return value.copy(scientificNumber2, scientificNumber3 != null ? (ScientificNumber) ScientificNumber.ADAPTER.redact(scientificNumber3) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AmountBlocker.PercentageConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ScientificNumber.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.maximum_amount);
                    protoAdapter2.encodeWithTag(writer, 1, value.minimum_amount);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PercentageConfig(ScientificNumber scientificNumber, ScientificNumber scientificNumber2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : scientificNumber, (i & 2) != 0 ? null : scientificNumber2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PercentageConfig copy$default(PercentageConfig percentageConfig, ScientificNumber scientificNumber, ScientificNumber scientificNumber2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                scientificNumber = percentageConfig.minimum_amount;
            }
            if ((i & 2) != 0) {
                scientificNumber2 = percentageConfig.maximum_amount;
            }
            if ((i & 4) != 0) {
                byteString = percentageConfig.unknownFields();
            }
            return percentageConfig.copy(scientificNumber, scientificNumber2, byteString);
        }

        public final PercentageConfig copy(ScientificNumber minimum_amount, ScientificNumber maximum_amount, ByteString unknownFields) {
            unknownFields.getClass();
            return new PercentageConfig(minimum_amount, maximum_amount, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PercentageConfig)) {
                return false;
            }
            PercentageConfig percentageConfig = (PercentageConfig) other;
            return Intrinsics.areEqual(unknownFields(), percentageConfig.unknownFields()) && Intrinsics.areEqual(this.minimum_amount, percentageConfig.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, percentageConfig.maximum_amount);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ScientificNumber scientificNumber = this.minimum_amount;
            int hashCode2 = (hashCode + (scientificNumber != null ? scientificNumber.hashCode() : 0)) * 37;
            ScientificNumber scientificNumber2 = this.maximum_amount;
            int hashCode3 = hashCode2 + (scientificNumber2 != null ? scientificNumber2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.minimum_amount = this.minimum_amount;
            builder.maximum_amount = this.maximum_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ScientificNumber scientificNumber = this.minimum_amount;
            if (scientificNumber != null) {
                arrayList.add("minimum_amount=" + scientificNumber);
            }
            ScientificNumber scientificNumber2 = this.maximum_amount;
            if (scientificNumber2 != null) {
                arrayList.add("maximum_amount=" + scientificNumber2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PercentageConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PercentageConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PercentageConfig() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PercentageConfig(ScientificNumber scientificNumber, ScientificNumber scientificNumber2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.minimum_amount = scientificNumber;
            this.maximum_amount = scientificNumber2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AmountBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AmountBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AmountBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AmountBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$Config;", "", "<init>", "()V", "MoneyConfig", "PercentageConfig", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config$MoneyConfig;", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config$PercentageConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class Config {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.AmountBlocker$MoneyConfig#ADAPTER", declaredName = "money_config", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$Config$MoneyConfig;", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config;", "value", "Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;", "<init>", "(Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;)V", "getValue", "()Lcom/squareup/protos/franklin/api/AmountBlocker$MoneyConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MoneyConfig extends Config {
            private final MoneyConfig value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoneyConfig(MoneyConfig moneyConfig) {
                super(null);
                moneyConfig.getClass();
                this.value = moneyConfig;
            }

            public static /* synthetic */ MoneyConfig copy$default(MoneyConfig moneyConfig, MoneyConfig moneyConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    moneyConfig2 = moneyConfig.value;
                }
                return moneyConfig.copy(moneyConfig2);
            }

            /* renamed from: component1, reason: from getter */
            public final MoneyConfig getValue() {
                return this.value;
            }

            public final MoneyConfig copy(MoneyConfig value) {
                value.getClass();
                return new MoneyConfig(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MoneyConfig) && Intrinsics.areEqual(this.value, ((MoneyConfig) other).value);
            }

            public final MoneyConfig getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MoneyConfig(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.AmountBlocker$PercentageConfig#ADAPTER", declaredName = "percentage_config", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/AmountBlocker$Config$PercentageConfig;", "Lcom/squareup/protos/franklin/api/AmountBlocker$Config;", "value", "Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;", "<init>", "(Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;)V", "getValue", "()Lcom/squareup/protos/franklin/api/AmountBlocker$PercentageConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PercentageConfig extends Config {
            private final PercentageConfig value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PercentageConfig(PercentageConfig percentageConfig) {
                super(null);
                percentageConfig.getClass();
                this.value = percentageConfig;
            }

            public static /* synthetic */ PercentageConfig copy$default(PercentageConfig percentageConfig, PercentageConfig percentageConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    percentageConfig2 = percentageConfig.value;
                }
                return percentageConfig.copy(percentageConfig2);
            }

            /* renamed from: component1, reason: from getter */
            public final PercentageConfig getValue() {
                return this.value;
            }

            public final PercentageConfig copy(PercentageConfig value) {
                value.getClass();
                return new PercentageConfig(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PercentageConfig) && Intrinsics.areEqual(this.value, ((PercentageConfig) other).value);
            }

            public final PercentageConfig getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PercentageConfig(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Config(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Config() {
        }
    }
}
