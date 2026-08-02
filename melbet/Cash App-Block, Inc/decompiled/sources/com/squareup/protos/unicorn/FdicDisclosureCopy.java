package com.squareup.protos.unicorn;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FdicDisclosureCopy extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FdicDisclosureCopy> CREATOR;
    public final Image icon;
    public final LocalizedString insured_copy;
    public final LocalizedString uninsured_copy;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Image icon;
        public LocalizedString insured_copy;
        public LocalizedString uninsured_copy;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new FdicDisclosureCopy(this.uninsured_copy, this.insured_copy, this.icon, buildUnknownFields());
                default:
                    return new MoneyTab.Applet.Banner(this.uninsured_copy, this.insured_copy, this.icon, buildUnknownFields());
            }
        }
    }

    static {
        FdicDisclosureCopy$Companion$ADAPTER$1 fdicDisclosureCopy$Companion$ADAPTER$1 = new FdicDisclosureCopy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FdicDisclosureCopy.class), "type.googleapis.com/squareup.unicorn.FdicDisclosureCopy", Syntax.PROTO_2, null, "squareup/unicorn/fdic_insurance_sync_value.proto");
        ADAPTER = fdicDisclosureCopy$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fdicDisclosureCopy$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FdicDisclosureCopy(LocalizedString localizedString, LocalizedString localizedString2, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.uninsured_copy = localizedString;
        this.insured_copy = localizedString2;
        this.icon = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FdicDisclosureCopy)) {
            return false;
        }
        FdicDisclosureCopy fdicDisclosureCopy = (FdicDisclosureCopy) obj;
        return Intrinsics.areEqual(unknownFields(), fdicDisclosureCopy.unknownFields()) && Intrinsics.areEqual(this.uninsured_copy, fdicDisclosureCopy.uninsured_copy) && Intrinsics.areEqual(this.insured_copy, fdicDisclosureCopy.insured_copy) && Intrinsics.areEqual(this.icon, fdicDisclosureCopy.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.uninsured_copy;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.insured_copy;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.uninsured_copy = this.uninsured_copy;
        builder.insured_copy = this.insured_copy;
        builder.icon = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.uninsured_copy;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("uninsured_copy=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.insured_copy;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("insured_copy=", localizedString2, arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FdicDisclosureCopy{", "}", 0, null, null, 56);
    }
}
