package com.squareup.protos.cash.local.client.app.v1.account;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalAccount> CREATOR;
    public final List auto_display_shortlink_keys;
    public final EnrollmentStatus enrollment_status;
    public final Boolean hide_brand_discovery;
    public final Boolean show_geo_tab;
    public final Boolean show_tab;

    public enum EnrollmentStatus implements WireEnum {
        ENROLLMENT_STATUS_UNSPECIFIED(0),
        ENROLLMENT_STATUS_UNENROLLED(1),
        ENROLLMENT_STATUS_ENROLLED(2);

        public static final LocalAccount$EnrollmentStatus$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            EnrollmentStatus enrollmentStatus = ENROLLMENT_STATUS_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new LocalAccount$EnrollmentStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EnrollmentStatus.class), Syntax.PROTO_2, enrollmentStatus);
        }

        EnrollmentStatus(int i) {
            this.value = i;
        }

        public static final EnrollmentStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ENROLLMENT_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return ENROLLMENT_STATUS_UNENROLLED;
            }
            if (i != 2) {
                return null;
            }
            return ENROLLMENT_STATUS_ENROLLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalAccount$Companion$ADAPTER$1 localAccount$Companion$ADAPTER$1 = new LocalAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalAccount.class), "type.googleapis.com/squareup.cash.local.client.app.v1.account.LocalAccount", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/account/account.proto");
        ADAPTER = localAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAccount(Boolean bool, List list, EnrollmentStatus enrollmentStatus, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.show_tab = bool;
        this.enrollment_status = enrollmentStatus;
        this.hide_brand_discovery = bool2;
        this.show_geo_tab = bool3;
        this.auto_display_shortlink_keys = TransactorKt.immutableCopyOf("auto_display_shortlink_keys", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalAccount)) {
            return false;
        }
        LocalAccount localAccount = (LocalAccount) obj;
        return Intrinsics.areEqual(unknownFields(), localAccount.unknownFields()) && Intrinsics.areEqual(this.show_tab, localAccount.show_tab) && Intrinsics.areEqual(this.auto_display_shortlink_keys, localAccount.auto_display_shortlink_keys) && this.enrollment_status == localAccount.enrollment_status && Intrinsics.areEqual(this.hide_brand_discovery, localAccount.hide_brand_discovery) && Intrinsics.areEqual(this.show_geo_tab, localAccount.show_geo_tab);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.show_tab;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.auto_display_shortlink_keys);
        EnrollmentStatus enrollmentStatus = this.enrollment_status;
        int hashCode2 = (m + (enrollmentStatus != null ? enrollmentStatus.hashCode() : 0)) * 37;
        Boolean bool2 = this.hide_brand_discovery;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.show_geo_tab;
        int hashCode4 = hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(27);
        builder.text = this.show_tab;
        builder.text_style = this.auto_display_shortlink_keys;
        builder.text_decoration = this.enrollment_status;
        builder.text_color = this.hide_brand_discovery;
        builder.icon = this.show_geo_tab;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.show_tab;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_tab=", bool, arrayList);
        }
        List list = this.auto_display_shortlink_keys;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auto_display_shortlink_keys=", arrayList, list);
        }
        EnrollmentStatus enrollmentStatus = this.enrollment_status;
        if (enrollmentStatus != null) {
            arrayList.add("enrollment_status=" + enrollmentStatus);
        }
        Boolean bool2 = this.hide_brand_discovery;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hide_brand_discovery=", bool2, arrayList);
        }
        Boolean bool3 = this.show_geo_tab;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_geo_tab=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalAccount{", "}", 0, null, null, 56);
    }
}
