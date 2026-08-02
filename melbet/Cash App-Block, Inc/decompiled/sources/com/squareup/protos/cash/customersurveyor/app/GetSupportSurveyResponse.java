package com.squareup.protos.cash.customersurveyor.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.zipline.loader.LoaderJniKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/customersurveyor/app/GetSupportSurveyResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Asset$Builder;", "Builder", "app/cash/zipline/loader/LoaderJniKt", "Survey", "AlreadySubmitted", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSupportSurveyResponse> CREATOR;
    public final LoaderJniKt result;

    public final class AlreadySubmitted extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AlreadySubmitted> CREATOR;

        static {
            GetSupportSurveyResponse$AlreadySubmitted$Companion$ADAPTER$1 getSupportSurveyResponse$AlreadySubmitted$Companion$ADAPTER$1 = new GetSupportSurveyResponse$AlreadySubmitted$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AlreadySubmitted.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse.AlreadySubmitted", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
            ADAPTER = getSupportSurveyResponse$AlreadySubmitted$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$AlreadySubmitted$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadySubmitted(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof AlreadySubmitted) && Intrinsics.areEqual(unknownFields(), ((AlreadySubmitted) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(21);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "AlreadySubmitted{}";
        }
    }

    public final class Survey extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Survey> CREATOR;
        public final String free_text_placeholder;
        public final RatingQuestion rating_question;
        public final ResolutionQuestion resolution_question;
        public final SatisfactionQuestion satisfaction_question;

        public final class RatingQuestion extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<RatingQuestion> CREATOR;
            public final ReasonList five_star_reasons;
            public final ReasonList four_star_reasons;
            public final ReasonList one_star_reasons;
            public final ReasonList three_star_reasons;
            public final String title;
            public final ReasonList two_star_reasons;

            static {
                GetSupportSurveyResponse$Survey$RatingQuestion$Companion$ADAPTER$1 getSupportSurveyResponse$Survey$RatingQuestion$Companion$ADAPTER$1 = new GetSupportSurveyResponse$Survey$RatingQuestion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RatingQuestion.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse.Survey.RatingQuestion", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
                ADAPTER = getSupportSurveyResponse$Survey$RatingQuestion$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$Survey$RatingQuestion$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RatingQuestion(String str, ReasonList reasonList, ReasonList reasonList2, ReasonList reasonList3, ReasonList reasonList4, ReasonList reasonList5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.one_star_reasons = reasonList;
                this.two_star_reasons = reasonList2;
                this.three_star_reasons = reasonList3;
                this.four_star_reasons = reasonList4;
                this.five_star_reasons = reasonList5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RatingQuestion)) {
                    return false;
                }
                RatingQuestion ratingQuestion = (RatingQuestion) obj;
                return Intrinsics.areEqual(unknownFields(), ratingQuestion.unknownFields()) && Intrinsics.areEqual(this.title, ratingQuestion.title) && Intrinsics.areEqual(this.one_star_reasons, ratingQuestion.one_star_reasons) && Intrinsics.areEqual(this.two_star_reasons, ratingQuestion.two_star_reasons) && Intrinsics.areEqual(this.three_star_reasons, ratingQuestion.three_star_reasons) && Intrinsics.areEqual(this.four_star_reasons, ratingQuestion.four_star_reasons) && Intrinsics.areEqual(this.five_star_reasons, ratingQuestion.five_star_reasons);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                ReasonList reasonList = this.one_star_reasons;
                int hashCode3 = (hashCode2 + (reasonList != null ? reasonList.hashCode() : 0)) * 37;
                ReasonList reasonList2 = this.two_star_reasons;
                int hashCode4 = (hashCode3 + (reasonList2 != null ? reasonList2.hashCode() : 0)) * 37;
                ReasonList reasonList3 = this.three_star_reasons;
                int hashCode5 = (hashCode4 + (reasonList3 != null ? reasonList3.hashCode() : 0)) * 37;
                ReasonList reasonList4 = this.four_star_reasons;
                int hashCode6 = (hashCode5 + (reasonList4 != null ? reasonList4.hashCode() : 0)) * 37;
                ReasonList reasonList5 = this.five_star_reasons;
                int hashCode7 = hashCode6 + (reasonList5 != null ? reasonList5.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ExpenseSlice.Builder builder = new ExpenseSlice.Builder(5);
                builder.slice_token = this.title;
                builder.requester = this.one_star_reasons;
                builder.responder = this.two_star_reasons;
                builder.amount = this.three_star_reasons;
                builder.status = this.four_star_reasons;
                builder.action = this.five_star_reasons;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                ReasonList reasonList = this.one_star_reasons;
                if (reasonList != null) {
                    arrayList.add("one_star_reasons=" + reasonList);
                }
                ReasonList reasonList2 = this.two_star_reasons;
                if (reasonList2 != null) {
                    arrayList.add("two_star_reasons=" + reasonList2);
                }
                ReasonList reasonList3 = this.three_star_reasons;
                if (reasonList3 != null) {
                    arrayList.add("three_star_reasons=" + reasonList3);
                }
                ReasonList reasonList4 = this.four_star_reasons;
                if (reasonList4 != null) {
                    arrayList.add("four_star_reasons=" + reasonList4);
                }
                ReasonList reasonList5 = this.five_star_reasons;
                if (reasonList5 != null) {
                    arrayList.add("five_star_reasons=" + reasonList5);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "RatingQuestion{", "}", 0, null, null, 56);
            }
        }

        public final class ReasonList extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ReasonList> CREATOR;
            public final String prompt;
            public final List reasons;

            static {
                GetSupportSurveyResponse$Survey$ReasonList$Companion$ADAPTER$1 getSupportSurveyResponse$Survey$ReasonList$Companion$ADAPTER$1 = new GetSupportSurveyResponse$Survey$ReasonList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReasonList.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse.Survey.ReasonList", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
                ADAPTER = getSupportSurveyResponse$Survey$ReasonList$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$Survey$ReasonList$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReasonList(String str, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.prompt = str;
                this.reasons = TransactorKt.immutableCopyOf("reasons", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ReasonList)) {
                    return false;
                }
                ReasonList reasonList = (ReasonList) obj;
                return Intrinsics.areEqual(unknownFields(), reasonList.unknownFields()) && Intrinsics.areEqual(this.prompt, reasonList.prompt) && Intrinsics.areEqual(this.reasons, reasonList.reasons);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.prompt;
                int hashCode2 = this.reasons.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ToggleScreen.Builder builder = new ToggleScreen.Builder(14, false);
                builder.toggle_title = this.prompt;
                builder.sections = this.reasons;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.prompt;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prompt=", arrayList);
                }
                List list = this.reasons;
                if (!list.isEmpty()) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("reasons=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ReasonList{", "}", 0, null, null, 56);
            }
        }

        public final class ResolutionQuestion extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ResolutionQuestion> CREATOR;
            public final String subtitle;
            public final String title;

            static {
                GetSupportSurveyResponse$Survey$ResolutionQuestion$Companion$ADAPTER$1 getSupportSurveyResponse$Survey$ResolutionQuestion$Companion$ADAPTER$1 = new GetSupportSurveyResponse$Survey$ResolutionQuestion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResolutionQuestion.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse.Survey.ResolutionQuestion", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
                ADAPTER = getSupportSurveyResponse$Survey$ResolutionQuestion$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$Survey$ResolutionQuestion$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResolutionQuestion(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ResolutionQuestion)) {
                    return false;
                }
                ResolutionQuestion resolutionQuestion = (ResolutionQuestion) obj;
                return Intrinsics.areEqual(unknownFields(), resolutionQuestion.unknownFields()) && Intrinsics.areEqual(this.title, resolutionQuestion.title) && Intrinsics.areEqual(this.subtitle, resolutionQuestion.subtitle);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Cashtag.Builder builder = new Cashtag.Builder(28);
                builder.prefix = this.title;
                builder.name = this.subtitle;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ResolutionQuestion{", "}", 0, null, null, 56);
            }
        }

        public final class SatisfactionQuestion extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SatisfactionQuestion> CREATOR;
            public final String title;

            static {
                GetSupportSurveyResponse$Survey$SatisfactionQuestion$Companion$ADAPTER$1 getSupportSurveyResponse$Survey$SatisfactionQuestion$Companion$ADAPTER$1 = new GetSupportSurveyResponse$Survey$SatisfactionQuestion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SatisfactionQuestion.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse.Survey.SatisfactionQuestion", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
                ADAPTER = getSupportSurveyResponse$Survey$SatisfactionQuestion$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$Survey$SatisfactionQuestion$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SatisfactionQuestion(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SatisfactionQuestion)) {
                    return false;
                }
                SatisfactionQuestion satisfactionQuestion = (SatisfactionQuestion) obj;
                return Intrinsics.areEqual(unknownFields(), satisfactionQuestion.unknownFields()) && Intrinsics.areEqual(this.title, satisfactionQuestion.title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Banner.Builder builder = new Banner.Builder(28);
                builder.banner_color = this.title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SatisfactionQuestion{", "}", 0, null, null, 56);
            }
        }

        static {
            GetSupportSurveyResponse$Survey$Companion$ADAPTER$1 getSupportSurveyResponse$Survey$Companion$ADAPTER$1 = new GetSupportSurveyResponse$Survey$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Survey.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse.Survey", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
            ADAPTER = getSupportSurveyResponse$Survey$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$Survey$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Survey(ResolutionQuestion resolutionQuestion, RatingQuestion ratingQuestion, String str, SatisfactionQuestion satisfactionQuestion, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.resolution_question = resolutionQuestion;
            this.rating_question = ratingQuestion;
            this.free_text_placeholder = str;
            this.satisfaction_question = satisfactionQuestion;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Survey)) {
                return false;
            }
            Survey survey = (Survey) obj;
            return Intrinsics.areEqual(unknownFields(), survey.unknownFields()) && Intrinsics.areEqual(this.resolution_question, survey.resolution_question) && Intrinsics.areEqual(this.rating_question, survey.rating_question) && Intrinsics.areEqual(this.free_text_placeholder, survey.free_text_placeholder) && Intrinsics.areEqual(this.satisfaction_question, survey.satisfaction_question);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ResolutionQuestion resolutionQuestion = this.resolution_question;
            int hashCode2 = (hashCode + (resolutionQuestion != null ? resolutionQuestion.hashCode() : 0)) * 37;
            RatingQuestion ratingQuestion = this.rating_question;
            int hashCode3 = (hashCode2 + (ratingQuestion != null ? ratingQuestion.hashCode() : 0)) * 37;
            String str = this.free_text_placeholder;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            SatisfactionQuestion satisfactionQuestion = this.satisfaction_question;
            int hashCode5 = hashCode4 + (satisfactionQuestion != null ? satisfactionQuestion.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Trust.Builder builder = new Trust.Builder(29, false);
            builder.icon = this.resolution_question;
            builder.enabled = this.rating_question;
            builder.title = this.free_text_placeholder;
            builder.id = this.satisfaction_question;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ResolutionQuestion resolutionQuestion = this.resolution_question;
            if (resolutionQuestion != null) {
                arrayList.add("resolution_question=" + resolutionQuestion);
            }
            RatingQuestion ratingQuestion = this.rating_question;
            if (ratingQuestion != null) {
                arrayList.add("rating_question=" + ratingQuestion);
            }
            String str = this.free_text_placeholder;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "free_text_placeholder=", arrayList);
            }
            SatisfactionQuestion satisfactionQuestion = this.satisfaction_question;
            if (satisfactionQuestion != null) {
                arrayList.add("satisfaction_question=" + satisfactionQuestion);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Survey{", "}", 0, null, null, 56);
        }
    }

    static {
        GetSupportSurveyResponse$Companion$ADAPTER$1 getSupportSurveyResponse$Companion$ADAPTER$1 = new GetSupportSurveyResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSupportSurveyResponse.class), "type.googleapis.com/squareup.cash.customersurveyor.app.GetSupportSurveyResponse", Syntax.PROTO_2, null, "squareup/cash/customersurveyor/app.proto");
        ADAPTER = getSupportSurveyResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportSurveyResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportSurveyResponse(LoaderJniKt loaderJniKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = loaderJniKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSupportSurveyResponse)) {
            return false;
        }
        GetSupportSurveyResponse getSupportSurveyResponse = (GetSupportSurveyResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSupportSurveyResponse.unknownFields()) && Intrinsics.areEqual(this.result, getSupportSurveyResponse.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LoaderJniKt loaderJniKt = this.result;
        int hashCode2 = hashCode + (loaderJniKt != null ? loaderJniKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(9);
        builder.asset_type = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LoaderJniKt loaderJniKt = this.result;
        if (loaderJniKt != null) {
            arrayList.add("result=" + loaderJniKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSupportSurveyResponse{", "}", 0, null, null, 56);
    }
}
