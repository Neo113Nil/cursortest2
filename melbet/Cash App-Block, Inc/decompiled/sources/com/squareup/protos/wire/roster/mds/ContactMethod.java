package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;
import squareup.cash.paychecks.Deduction;

/* loaded from: classes8.dex */
public final class ContactMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContactMethod> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final zzko f1414type;
    public final List uses;
    public final VerificationStatus verification_status;
    public final Long verified_timestamp;

    /* loaded from: classes9.dex */
    public enum ContactType implements WireEnum {
        DO_NOT_USE(0),
        DEFAULT(1),
        TRANSACTION_NOTIFICATION(2),
        MERCHANT_SUPPLIED(3),
        RECEIPTS(4),
        CHECKOUT_NOTIFICATION(5);

        public static final ContactMethod$ContactType$Companion$ADAPTER$1 ADAPTER;
        public static final Plane Companion;
        public final int value;

        static {
            ContactType contactType = DO_NOT_USE;
            Companion = new Plane(7);
            ADAPTER = new ContactMethod$ContactType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ContactType.class), Syntax.PROTO_2, contactType);
        }

        ContactType(int i) {
            this.value = i;
        }

        public static final ContactType fromValue(int i) {
            Companion.getClass();
            return Plane.m4215fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum VerificationStatus implements WireEnum {
        UNKNOWN(0),
        THIRD_PARTY_SUPPLIED(1),
        NEVER_VERIFIED(2),
        VERIFIED(3);

        public static final ContactMethod$VerificationStatus$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResolverDef Companion;
        public final int value;

        static {
            VerificationStatus verificationStatus = UNKNOWN;
            Companion = new LinkResolverDef(7);
            ADAPTER = new ContactMethod$VerificationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerificationStatus.class), Syntax.PROTO_2, verificationStatus);
        }

        VerificationStatus(int i) {
            this.value = i;
        }

        public static final VerificationStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return THIRD_PARTY_SUPPLIED;
            }
            if (i == 2) {
                return NEVER_VERIFIED;
            }
            if (i != 3) {
                return null;
            }
            return VERIFIED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ContactMethod$Companion$ADAPTER$1 contactMethod$Companion$ADAPTER$1 = new ContactMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContactMethod.class), "type.googleapis.com/squareup.roster.mds.ContactMethod", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = contactMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contactMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactMethod(zzko zzkoVar, VerificationStatus verificationStatus, Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.f1414type = zzkoVar;
        this.verification_status = verificationStatus;
        this.verified_timestamp = l;
        this.uses = TransactorKt.immutableCopyOf("uses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactMethod)) {
            return false;
        }
        ContactMethod contactMethod = (ContactMethod) obj;
        return Intrinsics.areEqual(unknownFields(), contactMethod.unknownFields()) && Intrinsics.areEqual(this.f1414type, contactMethod.f1414type) && this.verification_status == contactMethod.verification_status && Intrinsics.areEqual(this.verified_timestamp, contactMethod.verified_timestamp) && Intrinsics.areEqual(this.uses, contactMethod.uses);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzko zzkoVar = this.f1414type;
        int hashCode2 = (hashCode + (zzkoVar != null ? zzkoVar.hashCode() : 0)) * 37;
        VerificationStatus verificationStatus = this.verification_status;
        int hashCode3 = (hashCode2 + (verificationStatus != null ? verificationStatus.hashCode() : 0)) * 37;
        Long l = this.verified_timestamp;
        int hashCode4 = this.uses.hashCode() + ((hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(8);
        builder.amount = this.f1414type;
        builder.description = this.verification_status;
        builder.note = this.verified_timestamp;
        builder.tint_color = this.uses;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzko zzkoVar = this.f1414type;
        if (zzkoVar != null) {
            arrayList.add("type=" + zzkoVar);
        }
        VerificationStatus verificationStatus = this.verification_status;
        if (verificationStatus != null) {
            arrayList.add("verification_status=" + verificationStatus);
        }
        Long l = this.verified_timestamp;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("verified_timestamp=", l, arrayList);
        }
        List list = this.uses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("uses=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContactMethod{", "}", 0, null, null, 56);
    }
}
