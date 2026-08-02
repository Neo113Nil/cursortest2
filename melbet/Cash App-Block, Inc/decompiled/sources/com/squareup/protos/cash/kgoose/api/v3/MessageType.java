package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "MESSAGE_TYPE_UNSPECIFIED", "MESSAGE_TYPE_TEXT", "MESSAGE_TYPE_IMAGE", "MESSAGE_TYPE_TOOL_REQUEST", "MESSAGE_TYPE_TOOL_RESPONSE", "MESSAGE_TYPE_SUMMARY", "MESSAGE_TYPE_THINKING", "MESSAGE_TYPE_REDACTED_THINKING", "MESSAGE_TYPE_FILE", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MessageType MESSAGE_TYPE_FILE;
    public static final MessageType MESSAGE_TYPE_IMAGE;
    public static final MessageType MESSAGE_TYPE_REDACTED_THINKING;
    public static final MessageType MESSAGE_TYPE_SUMMARY;
    public static final MessageType MESSAGE_TYPE_TEXT;
    public static final MessageType MESSAGE_TYPE_THINKING;
    public static final MessageType MESSAGE_TYPE_TOOL_REQUEST;
    public static final MessageType MESSAGE_TYPE_TOOL_RESPONSE;
    public static final MessageType MESSAGE_TYPE_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/MessageType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static MessageType fromValue(int i) {
            switch (i) {
                case 0:
                    return MessageType.MESSAGE_TYPE_UNSPECIFIED;
                case 1:
                    return MessageType.MESSAGE_TYPE_TEXT;
                case 2:
                    return MessageType.MESSAGE_TYPE_IMAGE;
                case 3:
                    return MessageType.MESSAGE_TYPE_TOOL_REQUEST;
                case 4:
                    return MessageType.MESSAGE_TYPE_TOOL_RESPONSE;
                case 5:
                    return MessageType.MESSAGE_TYPE_SUMMARY;
                case 6:
                case 7:
                default:
                    return null;
                case 8:
                    return MessageType.MESSAGE_TYPE_THINKING;
                case 9:
                    return MessageType.MESSAGE_TYPE_REDACTED_THINKING;
                case 10:
                    return MessageType.MESSAGE_TYPE_FILE;
            }
        }
    }

    static {
        MessageType messageType = new MessageType("MESSAGE_TYPE_UNSPECIFIED", 0, 0);
        MESSAGE_TYPE_UNSPECIFIED = messageType;
        MessageType messageType2 = new MessageType("MESSAGE_TYPE_TEXT", 1, 1);
        MESSAGE_TYPE_TEXT = messageType2;
        MessageType messageType3 = new MessageType("MESSAGE_TYPE_IMAGE", 2, 2);
        MESSAGE_TYPE_IMAGE = messageType3;
        MessageType messageType4 = new MessageType("MESSAGE_TYPE_TOOL_REQUEST", 3, 3);
        MESSAGE_TYPE_TOOL_REQUEST = messageType4;
        MessageType messageType5 = new MessageType("MESSAGE_TYPE_TOOL_RESPONSE", 4, 4);
        MESSAGE_TYPE_TOOL_RESPONSE = messageType5;
        MessageType messageType6 = new MessageType("MESSAGE_TYPE_SUMMARY", 5, 5);
        MESSAGE_TYPE_SUMMARY = messageType6;
        MessageType messageType7 = new MessageType("MESSAGE_TYPE_THINKING", 6, 8);
        MESSAGE_TYPE_THINKING = messageType7;
        MessageType messageType8 = new MessageType("MESSAGE_TYPE_REDACTED_THINKING", 7, 9);
        MESSAGE_TYPE_REDACTED_THINKING = messageType8;
        MessageType messageType9 = new MessageType("MESSAGE_TYPE_FILE", 8, 10);
        MESSAGE_TYPE_FILE = messageType9;
        MessageType[] messageTypeArr = {messageType, messageType2, messageType3, messageType4, messageType5, messageType6, messageType7, messageType8, messageType9};
        $VALUES = messageTypeArr;
        $ENTRIES = new EnumEntriesList(messageTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new MessageType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MessageType.class), Syntax.PROTO_2, messageType);
    }

    public MessageType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final MessageType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
