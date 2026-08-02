package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdy;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.invest.ui.ClientDriven;
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
public final class SponsoredAccountRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SponsoredAccountRenderData> CREATOR;
    public final Boolean is_sponsor_led;
    public final zzdy role;

    public final class Parent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Parent> CREATOR;
        public final String action_url;
        public final Boolean declined_due_to_ineligibility;
        public final String icon_url;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1386type;

        public enum Type implements WireEnum {
            PENDING(1),
            APPROVED(2),
            DECLINED(3),
            CANCELED(4);

            public final int value;
            public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
            public static final SponsoredAccountRenderData$Parent$Type$Companion$ADAPTER$1 ADAPTER = new SponsoredAccountRenderData$Parent$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return PENDING;
                }
                if (i == 2) {
                    return APPROVED;
                }
                if (i == 3) {
                    return DECLINED;
                }
                if (i != 4) {
                    return null;
                }
                return CANCELED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            SponsoredAccountRenderData$Parent$Companion$ADAPTER$1 sponsoredAccountRenderData$Parent$Companion$ADAPTER$1 = new SponsoredAccountRenderData$Parent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Parent.class), "type.googleapis.com/squareup.franklin.SponsoredAccountRenderData.Parent", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = sponsoredAccountRenderData$Parent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsoredAccountRenderData$Parent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parent(Type type2, String str, String str2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1386type = type2;
            this.action_url = str;
            this.icon_url = str2;
            this.declined_due_to_ineligibility = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            return Intrinsics.areEqual(unknownFields(), parent.unknownFields()) && this.f1386type == parent.f1386type && Intrinsics.areEqual(this.action_url, parent.action_url) && Intrinsics.areEqual(this.icon_url, parent.icon_url) && Intrinsics.areEqual(this.declined_due_to_ineligibility, parent.declined_due_to_ineligibility);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.f1386type;
            int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
            String str = this.action_url;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.icon_url;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.declined_due_to_ineligibility;
            int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ColoredButton.Builder builder = new ColoredButton.Builder(29);
            builder.button_color = this.f1386type;
            builder.text_color = this.action_url;
            builder.text = this.icon_url;
            builder.action = this.declined_due_to_ineligibility;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.f1386type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            String str = this.action_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
            }
            String str2 = this.icon_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_url=", arrayList);
            }
            Boolean bool = this.declined_due_to_ineligibility;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("declined_due_to_ineligibility=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Parent{", "}", 0, null, null, 56);
        }
    }

    public final class Teen extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Teen> CREATOR;
        public final String action_url;
        public final Boolean allow_new_sponsor_selection;
        public final String icon_url;
        public final Boolean legal_name_changed;
        public final String sponsor_specified_unverified_legal_name;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1387type;

        public enum Type implements WireEnum {
            PENDING(1),
            APPROVED(2),
            DECLINED(3),
            CANCELED(4),
            GRADUATION_ELIGIBLE(5),
            GRADUATION_PENDING(6);

            public final int value;
            public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
            public static final SponsoredAccountRenderData$Teen$Type$Companion$ADAPTER$1 ADAPTER = new SponsoredAccountRenderData$Teen$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                switch (i) {
                    case 1:
                        return PENDING;
                    case 2:
                        return APPROVED;
                    case 3:
                        return DECLINED;
                    case 4:
                        return CANCELED;
                    case 5:
                        return GRADUATION_ELIGIBLE;
                    case 6:
                        return GRADUATION_PENDING;
                    default:
                        return null;
                }
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            SponsoredAccountRenderData$Teen$Companion$ADAPTER$1 sponsoredAccountRenderData$Teen$Companion$ADAPTER$1 = new SponsoredAccountRenderData$Teen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Teen.class), "type.googleapis.com/squareup.franklin.SponsoredAccountRenderData.Teen", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = sponsoredAccountRenderData$Teen$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsoredAccountRenderData$Teen$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Teen(Type type2, String str, String str2, Boolean bool, Boolean bool2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1387type = type2;
            this.icon_url = str;
            this.action_url = str2;
            this.legal_name_changed = bool;
            this.allow_new_sponsor_selection = bool2;
            this.sponsor_specified_unverified_legal_name = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Teen)) {
                return false;
            }
            Teen teen = (Teen) obj;
            return Intrinsics.areEqual(unknownFields(), teen.unknownFields()) && this.f1387type == teen.f1387type && Intrinsics.areEqual(this.icon_url, teen.icon_url) && Intrinsics.areEqual(this.action_url, teen.action_url) && Intrinsics.areEqual(this.legal_name_changed, teen.legal_name_changed) && Intrinsics.areEqual(this.allow_new_sponsor_selection, teen.allow_new_sponsor_selection) && Intrinsics.areEqual(this.sponsor_specified_unverified_legal_name, teen.sponsor_specified_unverified_legal_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.f1387type;
            int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
            String str = this.icon_url;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.action_url;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.legal_name_changed;
            int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.allow_new_sponsor_selection;
            int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str3 = this.sponsor_specified_unverified_legal_name;
            int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(7, false);
            builder.full_cashtag = this.f1387type;
            builder.full_name = this.icon_url;
            builder.photo_url = this.action_url;
            builder.cashtag_url_enabled = this.legal_name_changed;
            builder.is_verified_account = this.allow_new_sponsor_selection;
            builder.synopsis = this.sponsor_specified_unverified_legal_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.f1387type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            String str = this.icon_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_url=", arrayList);
            }
            String str2 = this.action_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_url=", arrayList);
            }
            Boolean bool = this.legal_name_changed;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("legal_name_changed=", bool, arrayList);
            }
            Boolean bool2 = this.allow_new_sponsor_selection;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_new_sponsor_selection=", bool2, arrayList);
            }
            if (this.sponsor_specified_unverified_legal_name != null) {
                arrayList.add("sponsor_specified_unverified_legal_name=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Teen{", "}", 0, null, null, 56);
        }
    }

    static {
        SponsoredAccountRenderData$Companion$ADAPTER$1 sponsoredAccountRenderData$Companion$ADAPTER$1 = new SponsoredAccountRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SponsoredAccountRenderData.class), "type.googleapis.com/squareup.franklin.SponsoredAccountRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = sponsoredAccountRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsoredAccountRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsoredAccountRenderData(zzdy zzdyVar, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.role = zzdyVar;
        this.is_sponsor_led = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountRenderData)) {
            return false;
        }
        SponsoredAccountRenderData sponsoredAccountRenderData = (SponsoredAccountRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), sponsoredAccountRenderData.unknownFields()) && Intrinsics.areEqual(this.role, sponsoredAccountRenderData.role) && Intrinsics.areEqual(this.is_sponsor_led, sponsoredAccountRenderData.is_sponsor_led);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzdy zzdyVar = this.role;
        int hashCode2 = (hashCode + (zzdyVar != null ? zzdyVar.hashCode() : 0)) * 37;
        Boolean bool = this.is_sponsor_led;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(17);
        builder.f1372android = this.role;
        builder.ios = this.is_sponsor_led;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzdy zzdyVar = this.role;
        if (zzdyVar != null) {
            arrayList.add("role=" + zzdyVar);
        }
        Boolean bool = this.is_sponsor_led;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_sponsor_led=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SponsoredAccountRenderData{", "}", 0, null, null, 56);
    }
}
