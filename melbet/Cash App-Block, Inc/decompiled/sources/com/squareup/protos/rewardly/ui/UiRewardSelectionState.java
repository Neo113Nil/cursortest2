package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
import com.squareup.protos.rewardly.ui.AppLinks;
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
import squareup.cash.bills.BillsApplet;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.IdValue;

/* loaded from: classes.dex */
public final class UiRewardSelectionState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiRewardSelectionState> CREATOR;
    public final String reward_token;
    public final zzjr states;

    /* loaded from: classes8.dex */
    public final class Locked extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Locked> CREATOR;
        public final String styled_progress_text;

        static {
            UiRewardSelectionState$Locked$Companion$ADAPTER$1 uiRewardSelectionState$Locked$Companion$ADAPTER$1 = new UiRewardSelectionState$Locked$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Locked.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardSelectionState.Locked", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
            ADAPTER = uiRewardSelectionState$Locked$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardSelectionState$Locked$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Locked(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.styled_progress_text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Locked)) {
                return false;
            }
            Locked locked = (Locked) obj;
            return Intrinsics.areEqual(unknownFields(), locked.unknownFields()) && Intrinsics.areEqual(this.styled_progress_text, locked.styled_progress_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.styled_progress_text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(29);
            builder.client_route = this.styled_progress_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.styled_progress_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "styled_progress_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Locked{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class UnlockInProgress extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UnlockInProgress> CREATOR;
        public final Button button;
        public final String fallback_text;
        public final String styled_progress_text;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final String label;
            public final String url;

            static {
                UiRewardSelectionState$UnlockInProgress$Button$Companion$ADAPTER$1 uiRewardSelectionState$UnlockInProgress$Button$Companion$ADAPTER$1 = new UiRewardSelectionState$UnlockInProgress$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardSelectionState.UnlockInProgress.Button", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
                ADAPTER = uiRewardSelectionState$UnlockInProgress$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardSelectionState$UnlockInProgress$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.url = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.label, button.label) && Intrinsics.areEqual(this.url, button.url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.url;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                IdValue.Builder builder = new IdValue.Builder(15);
                builder.server = this.label;
                builder.local = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                String str2 = this.url;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        static {
            UiRewardSelectionState$UnlockInProgress$Companion$ADAPTER$1 uiRewardSelectionState$UnlockInProgress$Companion$ADAPTER$1 = new UiRewardSelectionState$UnlockInProgress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlockInProgress.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardSelectionState.UnlockInProgress", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
            ADAPTER = uiRewardSelectionState$UnlockInProgress$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardSelectionState$UnlockInProgress$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockInProgress(String str, String str2, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.fallback_text = str;
            this.styled_progress_text = str2;
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlockInProgress)) {
                return false;
            }
            UnlockInProgress unlockInProgress = (UnlockInProgress) obj;
            return Intrinsics.areEqual(unknownFields(), unlockInProgress.unknownFields()) && Intrinsics.areEqual(this.fallback_text, unlockInProgress.fallback_text) && Intrinsics.areEqual(this.styled_progress_text, unlockInProgress.styled_progress_text) && Intrinsics.areEqual(this.button, unlockInProgress.button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.fallback_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.styled_progress_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode4 = hashCode3 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(2);
            builder.action = this.fallback_text;
            builder.full_applet = this.styled_progress_text;
            builder.half_applet = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.fallback_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fallback_text=", arrayList);
            }
            String str2 = this.styled_progress_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "styled_progress_text=", arrayList);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UnlockInProgress{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class Unlocked extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Unlocked> CREATOR;

        static {
            UiRewardSelectionState$Unlocked$Companion$ADAPTER$1 uiRewardSelectionState$Unlocked$Companion$ADAPTER$1 = new UiRewardSelectionState$Unlocked$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Unlocked.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardSelectionState.Unlocked", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
            ADAPTER = uiRewardSelectionState$Unlocked$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardSelectionState$Unlocked$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unlocked(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Unlocked) && Intrinsics.areEqual(unknownFields(), ((Unlocked) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(7);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Unlocked{}";
        }
    }

    static {
        UiRewardSelectionState$Companion$ADAPTER$1 uiRewardSelectionState$Companion$ADAPTER$1 = new UiRewardSelectionState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiRewardSelectionState.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardSelectionState", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiRewardSelectionState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardSelectionState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiRewardSelectionState(String str, zzjr zzjrVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.reward_token = str;
        this.states = zzjrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiRewardSelectionState)) {
            return false;
        }
        UiRewardSelectionState uiRewardSelectionState = (UiRewardSelectionState) obj;
        return Intrinsics.areEqual(unknownFields(), uiRewardSelectionState.unknownFields()) && Intrinsics.areEqual(this.reward_token, uiRewardSelectionState.reward_token) && Intrinsics.areEqual(this.states, uiRewardSelectionState.states);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.reward_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        zzjr zzjrVar = this.states;
        int hashCode3 = hashCode2 + (zzjrVar != null ? zzjrVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(23);
        builder.f1411android = this.reward_token;
        builder.ios = this.states;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.reward_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reward_token=", arrayList);
        }
        zzjr zzjrVar = this.states;
        if (zzjrVar != null) {
            arrayList.add("states=" + zzjrVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiRewardSelectionState{", "}", 0, null, null, 56);
    }
}
