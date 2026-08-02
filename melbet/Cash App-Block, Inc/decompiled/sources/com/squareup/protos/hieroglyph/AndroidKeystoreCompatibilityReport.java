package com.squareup.protos.hieroglyph;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiPublicProfile;
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

/* loaded from: classes8.dex */
public final class AndroidKeystoreCompatibilityReport extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AndroidKeystoreCompatibilityReport> CREATOR;
    public final String chipset;
    public final List failed_tests;
    public final PublicKeyConfig key_config;
    public final Long keymint_version;
    public final List skipped_tests;
    public final List succeeded_tests;

    public enum CompatibilityTest implements WireEnum {
        OS_VERSION(1),
        PHONE_MODEL(2),
        KEY_GENERATION(3),
        KEYMINT_VERSION(4),
        AES_KEY_IMPORT_NO_MIN_MAC(5),
        AES_KEY_IMPORT_WITH_MIN_MAC(6),
        HMAC_KEY_IMPORT_NO_MIN_MAC(7),
        HMAC_KEY_IMPORT_WITH_MIN_MAC(8),
        AES_KEY_ENCRYPTION(9),
        HMAC_KEY_SIGNING(10);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final AndroidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1 ADAPTER = new AndroidKeystoreCompatibilityReport$CompatibilityTest$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CompatibilityTest.class), Syntax.PROTO_2, null);

        CompatibilityTest(int i) {
            this.value = i;
        }

        public static final CompatibilityTest fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.m3956fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AndroidKeystoreCompatibilityReport$Companion$ADAPTER$1 androidKeystoreCompatibilityReport$Companion$ADAPTER$1 = new AndroidKeystoreCompatibilityReport$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AndroidKeystoreCompatibilityReport.class), "type.googleapis.com/squareup.hieroglyph.AndroidKeystoreCompatibilityReport", Syntax.PROTO_2, null, "squareup/hieroglyph/hieroglyph.proto");
        ADAPTER = androidKeystoreCompatibilityReport$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(androidKeystoreCompatibilityReport$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidKeystoreCompatibilityReport(String str, Long l, List list, List list2, List list3, PublicKeyConfig publicKeyConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.chipset = str;
        this.keymint_version = l;
        this.key_config = publicKeyConfig;
        this.failed_tests = TransactorKt.immutableCopyOf("failed_tests", list);
        this.succeeded_tests = TransactorKt.immutableCopyOf("succeeded_tests", list2);
        this.skipped_tests = TransactorKt.immutableCopyOf("skipped_tests", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidKeystoreCompatibilityReport)) {
            return false;
        }
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = (AndroidKeystoreCompatibilityReport) obj;
        return Intrinsics.areEqual(unknownFields(), androidKeystoreCompatibilityReport.unknownFields()) && Intrinsics.areEqual(this.chipset, androidKeystoreCompatibilityReport.chipset) && Intrinsics.areEqual(this.keymint_version, androidKeystoreCompatibilityReport.keymint_version) && Intrinsics.areEqual(this.failed_tests, androidKeystoreCompatibilityReport.failed_tests) && Intrinsics.areEqual(this.succeeded_tests, androidKeystoreCompatibilityReport.succeeded_tests) && Intrinsics.areEqual(this.skipped_tests, androidKeystoreCompatibilityReport.skipped_tests) && Intrinsics.areEqual(this.key_config, androidKeystoreCompatibilityReport.key_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.chipset;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.keymint_version;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.failed_tests), 37, this.succeeded_tests), 37, this.skipped_tests);
        PublicKeyConfig publicKeyConfig = this.key_config;
        int hashCode3 = m + (publicKeyConfig != null ? publicKeyConfig.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(14);
        builder.full_name = this.chipset;
        builder.photo_url = this.keymint_version;
        builder.synopsis = this.failed_tests;
        builder.full_cashtag = this.succeeded_tests;
        builder.cashtag_url_enabled = this.skipped_tests;
        builder.is_verified_account = this.key_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.chipset;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "chipset=", arrayList);
        }
        Long l = this.keymint_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("keymint_version=", l, arrayList);
        }
        List list = this.failed_tests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("failed_tests=", arrayList, list);
        }
        List list2 = this.succeeded_tests;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("succeeded_tests=", arrayList, list2);
        }
        List list3 = this.skipped_tests;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("skipped_tests=", arrayList, list3);
        }
        PublicKeyConfig publicKeyConfig = this.key_config;
        if (publicKeyConfig != null) {
            arrayList.add("key_config=" + publicKeyConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AndroidKeystoreCompatibilityReport{", "}", 0, null, null, 56);
    }
}
