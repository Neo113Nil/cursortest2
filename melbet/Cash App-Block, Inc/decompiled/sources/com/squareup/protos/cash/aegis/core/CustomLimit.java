package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.common.Money;
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
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CustomLimit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomLimit> CREATOR;
    public final Money max;
    public final Money remaining_usage;

    /* renamed from: type, reason: collision with root package name */
    public final LimitType f1242type;

    public enum LimitType implements WireEnum {
        LIMIT_TYPE_UNSPECIFIED(0),
        LIMIT_TYPE_SPONSORED_CARD_SPEND_AMOUNT_30_DAY(1),
        LIMIT_TYPE_DEFAULT_CARD_SPEND_AMOUNT_30_DAY(2);

        public static final CustomLimit$LimitType$Companion$ADAPTER$1 ADAPTER;
        public static final CardProduct.Companion Companion;
        public final int value;

        static {
            LimitType limitType = LIMIT_TYPE_UNSPECIFIED;
            Companion = new CardProduct.Companion(15);
            ADAPTER = new CustomLimit$LimitType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LimitType.class), Syntax.PROTO_2, limitType);
        }

        LimitType(int i) {
            this.value = i;
        }

        public static final LimitType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return LIMIT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return LIMIT_TYPE_SPONSORED_CARD_SPEND_AMOUNT_30_DAY;
            }
            if (i != 2) {
                return null;
            }
            return LIMIT_TYPE_DEFAULT_CARD_SPEND_AMOUNT_30_DAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CustomLimit$Companion$ADAPTER$1 customLimit$Companion$ADAPTER$1 = new CustomLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomLimit.class), "type.googleapis.com/squareup.cash.aegis.core.CustomLimit", Syntax.PROTO_2, null, "squareup/cash/aegis/core/CustomLimit.proto");
        ADAPTER = customLimit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customLimit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLimit(LimitType limitType, Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1242type = limitType;
        this.max = money;
        this.remaining_usage = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomLimit)) {
            return false;
        }
        CustomLimit customLimit = (CustomLimit) obj;
        return Intrinsics.areEqual(unknownFields(), customLimit.unknownFields()) && this.f1242type == customLimit.f1242type && Intrinsics.areEqual(this.max, customLimit.max) && Intrinsics.areEqual(this.remaining_usage, customLimit.remaining_usage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LimitType limitType = this.f1242type;
        int hashCode2 = (hashCode + (limitType != null ? limitType.hashCode() : 0)) * 37;
        Money money = this.max;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.remaining_usage;
        int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(7);
        builder.header_text = this.f1242type;
        builder.header_button = this.max;
        builder.groups = this.remaining_usage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LimitType limitType = this.f1242type;
        if (limitType != null) {
            arrayList.add("type=" + limitType);
        }
        Money money = this.max;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("max=", money, arrayList);
        }
        Money money2 = this.remaining_usage;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_usage=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomLimit{", "}", 0, null, null, 56);
    }
}
