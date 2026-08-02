package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "CLIENT_RENDER_TYPE_UNSPECIFIED", "CLIENT_RENDER_TYPE_ACTION_CARD", "CLIENT_RENDER_TYPE_ACTIVITY_LIST", "CLIENT_RENDER_TYPE_INSIGHT", "CLIENT_RENDER_TYPE_CELL_LIST", "CLIENT_RENDER_TYPE_GENERIC", "CLIENT_RENDER_TYPE_NAVIGATION_CARD", "CLIENT_RENDER_TYPE_LAYOUT_ELEMENT", "CLIENT_RENDER_TYPE_GENERIC_COMPONENT", "CLIENT_RENDER_TYPE_TEXT_CARD", "CLIENT_RENDER_TYPE_BRIEF", "CLIENT_RENDER_TYPE_CELL_ACTION_CARD", "CLIENT_RENDER_TYPE_TEMPLATE_CARD", "CLIENT_RENDER_TYPE_MCP_VIEW", "CLIENT_RENDER_TYPE_GENIE_CARD", "CLIENT_RENDER_TYPE_SUGGESTION_LIST", "CLIENT_RENDER_TYPE_SLOTTED_CARD", "CLIENT_RENDER_TYPE_PROMPT_BUTTON_LIST", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientRenderType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientRenderType[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ClientRenderType CLIENT_RENDER_TYPE_ACTION_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_ACTIVITY_LIST;
    public static final ClientRenderType CLIENT_RENDER_TYPE_BRIEF;
    public static final ClientRenderType CLIENT_RENDER_TYPE_CELL_ACTION_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_CELL_LIST;
    public static final ClientRenderType CLIENT_RENDER_TYPE_GENERIC;

    @Deprecated
    public static final ClientRenderType CLIENT_RENDER_TYPE_GENERIC_COMPONENT;
    public static final ClientRenderType CLIENT_RENDER_TYPE_GENIE_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_INSIGHT;
    public static final ClientRenderType CLIENT_RENDER_TYPE_LAYOUT_ELEMENT;
    public static final ClientRenderType CLIENT_RENDER_TYPE_MCP_VIEW;
    public static final ClientRenderType CLIENT_RENDER_TYPE_NAVIGATION_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_PROMPT_BUTTON_LIST;
    public static final ClientRenderType CLIENT_RENDER_TYPE_SLOTTED_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_SUGGESTION_LIST;
    public static final ClientRenderType CLIENT_RENDER_TYPE_TEMPLATE_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_TEXT_CARD;
    public static final ClientRenderType CLIENT_RENDER_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ClientRenderType fromValue(int i) {
            switch (i) {
                case 0:
                    return ClientRenderType.CLIENT_RENDER_TYPE_UNSPECIFIED;
                case 1:
                    return ClientRenderType.CLIENT_RENDER_TYPE_ACTION_CARD;
                case 2:
                    return ClientRenderType.CLIENT_RENDER_TYPE_ACTIVITY_LIST;
                case 3:
                    return ClientRenderType.CLIENT_RENDER_TYPE_INSIGHT;
                case 4:
                    return ClientRenderType.CLIENT_RENDER_TYPE_CELL_LIST;
                case 5:
                    return ClientRenderType.CLIENT_RENDER_TYPE_GENERIC;
                case 6:
                    return ClientRenderType.CLIENT_RENDER_TYPE_NAVIGATION_CARD;
                case 7:
                    return ClientRenderType.CLIENT_RENDER_TYPE_LAYOUT_ELEMENT;
                case 8:
                    return ClientRenderType.CLIENT_RENDER_TYPE_GENERIC_COMPONENT;
                case 9:
                    return ClientRenderType.CLIENT_RENDER_TYPE_TEXT_CARD;
                case 10:
                    return ClientRenderType.CLIENT_RENDER_TYPE_BRIEF;
                case 11:
                    return ClientRenderType.CLIENT_RENDER_TYPE_CELL_ACTION_CARD;
                case 12:
                    return ClientRenderType.CLIENT_RENDER_TYPE_TEMPLATE_CARD;
                case 13:
                    return ClientRenderType.CLIENT_RENDER_TYPE_MCP_VIEW;
                case 14:
                    return ClientRenderType.CLIENT_RENDER_TYPE_GENIE_CARD;
                case 15:
                    return ClientRenderType.CLIENT_RENDER_TYPE_SUGGESTION_LIST;
                case 16:
                    return ClientRenderType.CLIENT_RENDER_TYPE_SLOTTED_CARD;
                case 17:
                    return ClientRenderType.CLIENT_RENDER_TYPE_PROMPT_BUTTON_LIST;
                default:
                    return null;
            }
        }
    }

    static {
        ClientRenderType clientRenderType = new ClientRenderType("CLIENT_RENDER_TYPE_UNSPECIFIED", 0, 0);
        CLIENT_RENDER_TYPE_UNSPECIFIED = clientRenderType;
        ClientRenderType clientRenderType2 = new ClientRenderType("CLIENT_RENDER_TYPE_ACTION_CARD", 1, 1);
        CLIENT_RENDER_TYPE_ACTION_CARD = clientRenderType2;
        ClientRenderType clientRenderType3 = new ClientRenderType("CLIENT_RENDER_TYPE_ACTIVITY_LIST", 2, 2);
        CLIENT_RENDER_TYPE_ACTIVITY_LIST = clientRenderType3;
        ClientRenderType clientRenderType4 = new ClientRenderType("CLIENT_RENDER_TYPE_INSIGHT", 3, 3);
        CLIENT_RENDER_TYPE_INSIGHT = clientRenderType4;
        ClientRenderType clientRenderType5 = new ClientRenderType("CLIENT_RENDER_TYPE_CELL_LIST", 4, 4);
        CLIENT_RENDER_TYPE_CELL_LIST = clientRenderType5;
        ClientRenderType clientRenderType6 = new ClientRenderType("CLIENT_RENDER_TYPE_GENERIC", 5, 5);
        CLIENT_RENDER_TYPE_GENERIC = clientRenderType6;
        ClientRenderType clientRenderType7 = new ClientRenderType("CLIENT_RENDER_TYPE_NAVIGATION_CARD", 6, 6);
        CLIENT_RENDER_TYPE_NAVIGATION_CARD = clientRenderType7;
        ClientRenderType clientRenderType8 = new ClientRenderType("CLIENT_RENDER_TYPE_LAYOUT_ELEMENT", 7, 7);
        CLIENT_RENDER_TYPE_LAYOUT_ELEMENT = clientRenderType8;
        ClientRenderType clientRenderType9 = new ClientRenderType("CLIENT_RENDER_TYPE_GENERIC_COMPONENT", 8, 8);
        CLIENT_RENDER_TYPE_GENERIC_COMPONENT = clientRenderType9;
        ClientRenderType clientRenderType10 = new ClientRenderType("CLIENT_RENDER_TYPE_TEXT_CARD", 9, 9);
        CLIENT_RENDER_TYPE_TEXT_CARD = clientRenderType10;
        ClientRenderType clientRenderType11 = new ClientRenderType("CLIENT_RENDER_TYPE_BRIEF", 10, 10);
        CLIENT_RENDER_TYPE_BRIEF = clientRenderType11;
        ClientRenderType clientRenderType12 = new ClientRenderType("CLIENT_RENDER_TYPE_CELL_ACTION_CARD", 11, 11);
        CLIENT_RENDER_TYPE_CELL_ACTION_CARD = clientRenderType12;
        ClientRenderType clientRenderType13 = new ClientRenderType("CLIENT_RENDER_TYPE_TEMPLATE_CARD", 12, 12);
        CLIENT_RENDER_TYPE_TEMPLATE_CARD = clientRenderType13;
        ClientRenderType clientRenderType14 = new ClientRenderType("CLIENT_RENDER_TYPE_MCP_VIEW", 13, 13);
        CLIENT_RENDER_TYPE_MCP_VIEW = clientRenderType14;
        ClientRenderType clientRenderType15 = new ClientRenderType("CLIENT_RENDER_TYPE_GENIE_CARD", 14, 14);
        CLIENT_RENDER_TYPE_GENIE_CARD = clientRenderType15;
        ClientRenderType clientRenderType16 = new ClientRenderType("CLIENT_RENDER_TYPE_SUGGESTION_LIST", 15, 15);
        CLIENT_RENDER_TYPE_SUGGESTION_LIST = clientRenderType16;
        ClientRenderType clientRenderType17 = new ClientRenderType("CLIENT_RENDER_TYPE_SLOTTED_CARD", 16, 16);
        CLIENT_RENDER_TYPE_SLOTTED_CARD = clientRenderType17;
        ClientRenderType clientRenderType18 = new ClientRenderType("CLIENT_RENDER_TYPE_PROMPT_BUTTON_LIST", 17, 17);
        CLIENT_RENDER_TYPE_PROMPT_BUTTON_LIST = clientRenderType18;
        ClientRenderType[] clientRenderTypeArr = {clientRenderType, clientRenderType2, clientRenderType3, clientRenderType4, clientRenderType5, clientRenderType6, clientRenderType7, clientRenderType8, clientRenderType9, clientRenderType10, clientRenderType11, clientRenderType12, clientRenderType13, clientRenderType14, clientRenderType15, clientRenderType16, clientRenderType17, clientRenderType18};
        $VALUES = clientRenderTypeArr;
        $ENTRIES = new EnumEntriesList(clientRenderTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new ClientRenderType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ClientRenderType.class), Syntax.PROTO_2, clientRenderType);
    }

    public ClientRenderType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ClientRenderType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ClientRenderType valueOf(String str) {
        return (ClientRenderType) Enum.valueOf(ClientRenderType.class, str);
    }

    public static ClientRenderType[] values() {
        return (ClientRenderType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
