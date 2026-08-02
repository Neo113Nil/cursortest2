package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.giftly.GiftCard;
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
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes.dex */
public final class RewardSelection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RewardSelection> CREATOR;
    public final String reward_token;
    public final zzee states;
    public final String token;
    public final Long version;

    /* loaded from: classes8.dex */
    public final class Active extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Active> CREATOR;

        static {
            RewardSelection$Active$Companion$ADAPTER$1 rewardSelection$Active$Companion$ADAPTER$1 = new RewardSelection$Active$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Active.class), "type.googleapis.com/squareup.franklin.ui.RewardSelection.Active", Syntax.PROTO_2, null, "squareup/franklin/ui/reward_selection.proto");
            ADAPTER = rewardSelection$Active$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardSelection$Active$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Active(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Active) && Intrinsics.areEqual(unknownFields(), ((Active) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(4);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Active{}";
        }
    }

    /* loaded from: classes8.dex */
    public final class Disabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disabled> CREATOR;

        static {
            RewardSelection$Disabled$Companion$ADAPTER$1 rewardSelection$Disabled$Companion$ADAPTER$1 = new RewardSelection$Disabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disabled.class), "type.googleapis.com/squareup.franklin.ui.RewardSelection.Disabled", Syntax.PROTO_2, null, "squareup/franklin/ui/reward_selection.proto");
            ADAPTER = rewardSelection$Disabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardSelection$Disabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disabled(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Disabled) && Intrinsics.areEqual(unknownFields(), ((Disabled) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(5);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Disabled{}";
        }
    }

    /* loaded from: classes8.dex */
    public final class UnlockInProgress extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UnlockInProgress> CREATOR;
        public final LocalizableString localizable_progress_text;
        public final LocalizableString localizable_styled_progress_text;
        public final RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar progressIndicators;
        public final String progress_text;
        public final String styled_progress_text;

        public final class ProgressBar extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ProgressBar> CREATOR;
            public final Integer current;
            public final Integer target;

            /* renamed from: type, reason: collision with root package name */
            public final Type f1399type;

            public enum Type implements WireEnum {
                DISCRETE(1),
                CONTINUOUS(2);

                public final int value;
                public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
                public static final RewardSelection$UnlockInProgress$ProgressBar$Type$Companion$ADAPTER$1 ADAPTER = new RewardSelection$UnlockInProgress$ProgressBar$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

                Type(int i) {
                    this.value = i;
                }

                public static final Type fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return DISCRETE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return CONTINUOUS;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                RewardSelection$UnlockInProgress$ProgressBar$Companion$ADAPTER$1 rewardSelection$UnlockInProgress$ProgressBar$Companion$ADAPTER$1 = new RewardSelection$UnlockInProgress$ProgressBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressBar.class), "type.googleapis.com/squareup.franklin.ui.RewardSelection.UnlockInProgress.ProgressBar", Syntax.PROTO_2, null, "squareup/franklin/ui/reward_selection.proto");
                ADAPTER = rewardSelection$UnlockInProgress$ProgressBar$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardSelection$UnlockInProgress$ProgressBar$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProgressBar(Integer num, Integer num2, Type type2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.current = num;
                this.target = num2;
                this.f1399type = type2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ProgressBar)) {
                    return false;
                }
                ProgressBar progressBar = (ProgressBar) obj;
                return Intrinsics.areEqual(unknownFields(), progressBar.unknownFields()) && Intrinsics.areEqual(this.current, progressBar.current) && Intrinsics.areEqual(this.target, progressBar.target) && this.f1399type == progressBar.f1399type;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Integer num = this.current;
                int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                Integer num2 = this.target;
                int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
                Type type2 = this.f1399type;
                int hashCode4 = hashCode3 + (type2 != null ? type2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                GiftCard.Options.Builder builder = new GiftCard.Options.Builder(9);
                builder.label = this.current;
                builder.localizable_label = this.target;
                builder.client_scenario = this.f1399type;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Integer num = this.current;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("current=", num, arrayList);
                }
                Integer num2 = this.target;
                if (num2 != null) {
                    re$$ExternalSyntheticOutline0.m("target=", num2, arrayList);
                }
                Type type2 = this.f1399type;
                if (type2 != null) {
                    arrayList.add("type=" + type2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressBar{", "}", 0, null, null, 56);
            }
        }

        static {
            RewardSelection$UnlockInProgress$Companion$ADAPTER$1 rewardSelection$UnlockInProgress$Companion$ADAPTER$1 = new RewardSelection$UnlockInProgress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlockInProgress.class), "type.googleapis.com/squareup.franklin.ui.RewardSelection.UnlockInProgress", Syntax.PROTO_2, null, "squareup/franklin/ui/reward_selection.proto");
            ADAPTER = rewardSelection$UnlockInProgress$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardSelection$UnlockInProgress$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockInProgress(String str, String str2, LocalizableString localizableString, LocalizableString localizableString2, RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.progress_text = str;
            this.styled_progress_text = str2;
            this.localizable_progress_text = localizableString;
            this.localizable_styled_progress_text = localizableString2;
            this.progressIndicators = rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlockInProgress)) {
                return false;
            }
            UnlockInProgress unlockInProgress = (UnlockInProgress) obj;
            return Intrinsics.areEqual(unknownFields(), unlockInProgress.unknownFields()) && Intrinsics.areEqual(this.progress_text, unlockInProgress.progress_text) && Intrinsics.areEqual(this.styled_progress_text, unlockInProgress.styled_progress_text) && Intrinsics.areEqual(this.localizable_progress_text, unlockInProgress.localizable_progress_text) && Intrinsics.areEqual(this.localizable_styled_progress_text, unlockInProgress.localizable_styled_progress_text) && Intrinsics.areEqual(this.progressIndicators, unlockInProgress.progressIndicators);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.progress_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.styled_progress_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_progress_text;
            int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_styled_progress_text;
            int hashCode5 = (hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = this.progressIndicators;
            int hashCode6 = hashCode5 + (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null ? rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(22, false);
            builder.alias = this.progress_text;
            builder.verified = this.styled_progress_text;
            builder.expires_at = this.localizable_progress_text;
            builder.version = this.localizable_styled_progress_text;
            builder.display_date = this.progressIndicators;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.progress_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "progress_text=", arrayList);
            }
            String str2 = this.styled_progress_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "styled_progress_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_progress_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_progress_text=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_styled_progress_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_styled_progress_text=", localizableString2, arrayList);
            }
            RewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar = this.progressIndicators;
            if (rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar != null) {
                arrayList.add("progressIndicators=" + rewardSelection$UnlockInProgress$ProgressIndicators$ProgressBar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UnlockInProgress{", "}", 0, null, null, 56);
        }
    }

    static {
        RewardSelection$Companion$ADAPTER$1 rewardSelection$Companion$ADAPTER$1 = new RewardSelection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RewardSelection.class), "type.googleapis.com/squareup.franklin.ui.RewardSelection", Syntax.PROTO_2, null, "squareup/franklin/ui/reward_selection.proto");
        ADAPTER = rewardSelection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardSelection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSelection(String str, String str2, Long l, zzee zzeeVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.reward_token = str2;
        this.version = l;
        this.states = zzeeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardSelection)) {
            return false;
        }
        RewardSelection rewardSelection = (RewardSelection) obj;
        return Intrinsics.areEqual(unknownFields(), rewardSelection.unknownFields()) && Intrinsics.areEqual(this.token, rewardSelection.token) && Intrinsics.areEqual(this.reward_token, rewardSelection.reward_token) && Intrinsics.areEqual(this.version, rewardSelection.version) && Intrinsics.areEqual(this.states, rewardSelection.states);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.reward_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        zzee zzeeVar = this.states;
        int hashCode5 = hashCode4 + (zzeeVar != null ? zzeeVar.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(10);
        builder.account = this.token;
        builder.enabled = this.reward_token;
        builder.button = this.version;
        builder.dda_form = this.states;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.reward_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "reward_token=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        zzee zzeeVar = this.states;
        if (zzeeVar != null) {
            arrayList.add("states=" + zzeeVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardSelection{", "}", 0, null, null, 56);
    }
}
