package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.hieroglyph.KeyScope;
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

/* loaded from: classes8.dex */
public final class PendingReferralRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PendingReferralRenderData> CREATOR;
    public final Long expires_at;
    public final String expires_in_text;
    public final String instruction_text;
    public final LocalizableString localizable_instruction_text;
    public final Role role;
    public final State state;

    public enum Role implements WireEnum {
        REFERRER(1),
        REFEREE(2);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final PendingReferralRenderData$Role$Companion$ADAPTER$1 ADAPTER = new PendingReferralRenderData$Role$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Role.class), Syntax.PROTO_2, null);

        Role(int i) {
            this.value = i;
        }

        public static final Role fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return REFERRER;
            }
            if (i != 2) {
                return null;
            }
            return REFEREE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum State implements WireEnum {
        PENDING(1),
        FAILED(2),
        EXPIRED(3);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final PendingReferralRenderData$State$Companion$ADAPTER$1 ADAPTER = new PendingReferralRenderData$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PENDING;
            }
            if (i == 2) {
                return FAILED;
            }
            if (i != 3) {
                return null;
            }
            return EXPIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PendingReferralRenderData$Companion$ADAPTER$1 pendingReferralRenderData$Companion$ADAPTER$1 = new PendingReferralRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PendingReferralRenderData.class), "type.googleapis.com/squareup.franklin.PendingReferralRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = pendingReferralRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pendingReferralRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingReferralRenderData(Role role, State state, String str, String str2, Long l, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.role = role;
        this.state = state;
        this.instruction_text = str;
        this.expires_in_text = str2;
        this.expires_at = l;
        this.localizable_instruction_text = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PendingReferralRenderData)) {
            return false;
        }
        PendingReferralRenderData pendingReferralRenderData = (PendingReferralRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), pendingReferralRenderData.unknownFields()) && this.role == pendingReferralRenderData.role && this.state == pendingReferralRenderData.state && Intrinsics.areEqual(this.instruction_text, pendingReferralRenderData.instruction_text) && Intrinsics.areEqual(this.expires_in_text, pendingReferralRenderData.expires_in_text) && Intrinsics.areEqual(this.expires_at, pendingReferralRenderData.expires_at) && Intrinsics.areEqual(this.localizable_instruction_text, pendingReferralRenderData.localizable_instruction_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Role role = this.role;
        int hashCode2 = (hashCode + (role != null ? role.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 37;
        String str = this.instruction_text;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.expires_in_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.expires_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LocalizableString localizableString = this.localizable_instruction_text;
        int hashCode7 = hashCode6 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(4, false);
        builder.synopsis = this.role;
        builder.full_cashtag = this.state;
        builder.full_name = this.instruction_text;
        builder.photo_url = this.expires_in_text;
        builder.cashtag_url_enabled = this.expires_at;
        builder.is_verified_account = this.localizable_instruction_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Role role = this.role;
        if (role != null) {
            arrayList.add("role=" + role);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        String str = this.instruction_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instruction_text=", arrayList);
        }
        String str2 = this.expires_in_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "expires_in_text=", arrayList);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        LocalizableString localizableString = this.localizable_instruction_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_instruction_text=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PendingReferralRenderData{", "}", 0, null, null, 56);
    }
}
