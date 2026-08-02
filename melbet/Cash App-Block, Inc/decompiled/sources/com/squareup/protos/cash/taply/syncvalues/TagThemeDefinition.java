package com.squareup.protos.cash.taply.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TagThemeDefinition extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TagThemeDefinition> CREATOR;
    public final TagFormFactor form_factor;
    public final LocalizedString name;
    public final String token;
    public final TagVariant variant;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TagFormFactor implements WireEnum {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ TagFormFactor[] $VALUES;
        public static final TagThemeDefinition$TagFormFactor$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public static final TagFormFactor HEART;
        public static final TagFormFactor HEART_FIRST_EDITION;
        public static final TagFormFactor MINI_CARD;
        public static final TagFormFactor MINI_CARD_FIRST_EDITION;
        public static final TagFormFactor TAG_FORM_FACTOR_UNSPECIFIED;
        public static final TagFormFactor WAND;
        public static final TagFormFactor WAND_FIRST_EDITION;
        public final int value;

        static {
            TagFormFactor tagFormFactor = new TagFormFactor("TAG_FORM_FACTOR_UNSPECIFIED", 0, 0);
            TAG_FORM_FACTOR_UNSPECIFIED = tagFormFactor;
            TagFormFactor tagFormFactor2 = new TagFormFactor("WAND", 1, 1);
            WAND = tagFormFactor2;
            TagFormFactor tagFormFactor3 = new TagFormFactor("HEART", 2, 2);
            HEART = tagFormFactor3;
            TagFormFactor tagFormFactor4 = new TagFormFactor("MINI_CARD", 3, 3);
            MINI_CARD = tagFormFactor4;
            TagFormFactor tagFormFactor5 = new TagFormFactor("WAND_FIRST_EDITION", 4, 4);
            WAND_FIRST_EDITION = tagFormFactor5;
            TagFormFactor tagFormFactor6 = new TagFormFactor("HEART_FIRST_EDITION", 5, 5);
            HEART_FIRST_EDITION = tagFormFactor6;
            TagFormFactor tagFormFactor7 = new TagFormFactor("MINI_CARD_FIRST_EDITION", 6, 6);
            MINI_CARD_FIRST_EDITION = tagFormFactor7;
            TagFormFactor[] tagFormFactorArr = {tagFormFactor, tagFormFactor2, tagFormFactor3, tagFormFactor4, tagFormFactor5, tagFormFactor6, tagFormFactor7};
            $VALUES = tagFormFactorArr;
            $ENTRIES = new EnumEntriesList(tagFormFactorArr);
            Companion = new ActionType.Companion();
            ADAPTER = new TagThemeDefinition$TagFormFactor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TagFormFactor.class), Syntax.PROTO_2, tagFormFactor);
        }

        public TagFormFactor(String str, int i, int i2) {
            this.value = i2;
        }

        public static final TagFormFactor fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return TAG_FORM_FACTOR_UNSPECIFIED;
                case 1:
                    return WAND;
                case 2:
                    return HEART;
                case 3:
                    return MINI_CARD;
                case 4:
                    return WAND_FIRST_EDITION;
                case 5:
                    return HEART_FIRST_EDITION;
                case 6:
                    return MINI_CARD_FIRST_EDITION;
                default:
                    return null;
            }
        }

        public static TagFormFactor valueOf(String str) {
            return (TagFormFactor) Enum.valueOf(TagFormFactor.class, str);
        }

        public static TagFormFactor[] values() {
            return (TagFormFactor[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum TagVariant implements WireEnum {
        TAG_VARIANT_UNSPECIFIED(0),
        FIRST_EDITION(1);

        public static final TagThemeDefinition$TagVariant$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            TagVariant tagVariant = TAG_VARIANT_UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new TagThemeDefinition$TagVariant$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TagVariant.class), Syntax.PROTO_2, tagVariant);
        }

        TagVariant(int i) {
            this.value = i;
        }

        public static final TagVariant fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TAG_VARIANT_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return FIRST_EDITION;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TagThemeDefinition$Companion$ADAPTER$1 tagThemeDefinition$Companion$ADAPTER$1 = new TagThemeDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TagThemeDefinition.class), "type.googleapis.com/squareup.cash.taply.syncvalues.TagThemeDefinition", Syntax.PROTO_2, null, "squareup/cash/taply/syncvalues/tag_theme_definitions.proto");
        ADAPTER = tagThemeDefinition$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tagThemeDefinition$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagThemeDefinition(String str, LocalizedString localizedString, TagFormFactor tagFormFactor, TagVariant tagVariant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.name = localizedString;
        this.form_factor = tagFormFactor;
        this.variant = tagVariant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagThemeDefinition)) {
            return false;
        }
        TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) obj;
        return Intrinsics.areEqual(unknownFields(), tagThemeDefinition.unknownFields()) && Intrinsics.areEqual(this.token, tagThemeDefinition.token) && Intrinsics.areEqual(this.name, tagThemeDefinition.name) && this.form_factor == tagThemeDefinition.form_factor && this.variant == tagThemeDefinition.variant;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.name;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        TagFormFactor tagFormFactor = this.form_factor;
        int hashCode4 = (hashCode3 + (tagFormFactor != null ? tagFormFactor.hashCode() : 0)) * 37;
        TagVariant tagVariant = this.variant;
        int hashCode5 = hashCode4 + (tagVariant != null ? tagVariant.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(26);
        builder.customer_token_hash_email = this.token;
        builder.card_encryption_data = this.name;
        builder.device_metadata = this.form_factor;
        builder.success_screen = this.variant;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        LocalizedString localizedString = this.name;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("name=", localizedString, arrayList);
        }
        TagFormFactor tagFormFactor = this.form_factor;
        if (tagFormFactor != null) {
            arrayList.add("form_factor=" + tagFormFactor);
        }
        TagVariant tagVariant = this.variant;
        if (tagVariant != null) {
            arrayList.add("variant=" + tagVariant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TagThemeDefinition{", "}", 0, null, null, 56);
    }
}
