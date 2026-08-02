package xyz.block.protos.genie;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import squareup.cash.paychecks.Deduction;
import squareup.cash.wires.WiresAccountInfo;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class Navigate extends Message {
    public static final ProtoAdapter ADAPTER = new Navigate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Navigate.class), "type.googleapis.com/xyz.block.genie.v1.Navigate", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final Dismiss dismiss;
    public final Present present;

    public final class Dismiss extends Message {
        public static final ProtoAdapter ADAPTER = new Navigate$Dismiss$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dismiss.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Dismiss", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
        public final DismissModal dismiss_modal;
        public final Pop pop;
        public final RetreatToView retreat_to_view;
        public final Transition transition;

        public final class DismissModal extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Dismiss$DismissModal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DismissModal.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Dismiss.DismissModal", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DismissModal(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof DismissModal) && Intrinsics.areEqual(unknownFields(), ((DismissModal) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(23);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "DismissModal{}";
            }
        }

        public final class Pop extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Dismiss$Pop$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Pop.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Dismiss.Pop", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pop(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Pop) && Intrinsics.areEqual(unknownFields(), ((Pop) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(24);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "Pop{}";
            }
        }

        public final class RetreatToView extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Dismiss$RetreatToView$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetreatToView.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Dismiss.RetreatToView", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
            public final Expression view_slug;

            /* loaded from: classes6.dex */
            public final class Builder extends Message.Builder {
                public final /* synthetic */ int $r8$classId;
                public Expression view_slug;

                public /* synthetic */ Builder(int i) {
                    this.$r8$classId = i;
                }

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    switch (this.$r8$classId) {
                        case 0:
                            Expression expression = this.view_slug;
                            if (expression != null) {
                                return new RetreatToView(expression, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression, "view_slug");
                            throw null;
                        case 1:
                            Expression expression2 = this.view_slug;
                            if (expression2 != null) {
                                return new ComposePlatform.Modifier.Alpha(expression2, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression2, "alpha");
                            throw null;
                        case 2:
                            Expression expression3 = this.view_slug;
                            if (expression3 != null) {
                                return new ComposePlatform.Modifier.Clip(expression3, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression3, "corner_radius");
                            throw null;
                        case 3:
                            Expression expression4 = this.view_slug;
                            if (expression4 != null) {
                                return new ComposePlatform.Text(expression4, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression4, "text");
                            throw null;
                        case 4:
                            Expression expression5 = this.view_slug;
                            if (expression5 != null) {
                                return new MoneybotScaffold.Answer.FallbackTitle(expression5, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression5, "title");
                            throw null;
                        default:
                            Expression expression6 = this.view_slug;
                            if (expression6 != null) {
                                return new MoneybotScaffold.Answer.Scenario.Parameter(expression6, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression6, AnnotatedPrivateKey.LABEL);
                            throw null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetreatToView(Expression expression, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                byteString.getClass();
                this.view_slug = expression;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RetreatToView)) {
                    return false;
                }
                RetreatToView retreatToView = (RetreatToView) obj;
                return Intrinsics.areEqual(unknownFields(), retreatToView.unknownFields()) && Intrinsics.areEqual(this.view_slug, retreatToView.view_slug);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.view_slug.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(0);
                builder.view_slug = this.view_slug;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("view_slug=", this.view_slug, arrayList);
                return CollectionsKt.joinToString$default(arrayList, ", ", "RetreatToView{", "}", 0, null, null, 56);
            }
        }

        public final class Transition extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Dismiss$Transition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Transition.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Dismiss.Transition", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
            public final Integer duration_ms;
            public final EasingCurve easing_curve;
            public final TransitionEffect$Fade fade;
            public final TransitionEffect$Instant instant;
            public final MatchStrategy match_strategy;
            public final TransitionEffect$Pop pop;
            public final TransitionEffect$Slide slide;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Transition(TransitionEffect$Instant transitionEffect$Instant, TransitionEffect$Fade transitionEffect$Fade, TransitionEffect$Pop transitionEffect$Pop, TransitionEffect$Slide transitionEffect$Slide, MatchStrategy matchStrategy, Integer num, EasingCurve easingCurve, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.instant = transitionEffect$Instant;
                this.fade = transitionEffect$Fade;
                this.pop = transitionEffect$Pop;
                this.slide = transitionEffect$Slide;
                this.match_strategy = matchStrategy;
                this.duration_ms = num;
                this.easing_curve = easingCurve;
                if (TransactorKt.countNonNull(transitionEffect$Instant, transitionEffect$Fade, transitionEffect$Pop, transitionEffect$Slide, new Object[0]) <= 1) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("At most one of instant, fade, pop, slide may be non-null");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Transition)) {
                    return false;
                }
                Transition transition = (Transition) obj;
                return Intrinsics.areEqual(unknownFields(), transition.unknownFields()) && Intrinsics.areEqual(this.instant, transition.instant) && Intrinsics.areEqual(this.fade, transition.fade) && Intrinsics.areEqual(this.pop, transition.pop) && Intrinsics.areEqual(this.slide, transition.slide) && this.match_strategy == transition.match_strategy && Intrinsics.areEqual(this.duration_ms, transition.duration_ms) && Intrinsics.areEqual(this.easing_curve, transition.easing_curve);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                TransitionEffect$Instant transitionEffect$Instant = this.instant;
                int hashCode2 = (hashCode + (transitionEffect$Instant != null ? transitionEffect$Instant.hashCode() : 0)) * 37;
                TransitionEffect$Fade transitionEffect$Fade = this.fade;
                int hashCode3 = (hashCode2 + (transitionEffect$Fade != null ? transitionEffect$Fade.hashCode() : 0)) * 37;
                TransitionEffect$Pop transitionEffect$Pop = this.pop;
                int hashCode4 = (hashCode3 + (transitionEffect$Pop != null ? transitionEffect$Pop.hashCode() : 0)) * 37;
                TransitionEffect$Slide transitionEffect$Slide = this.slide;
                int hashCode5 = (hashCode4 + (transitionEffect$Slide != null ? transitionEffect$Slide.hashCode() : 0)) * 37;
                MatchStrategy matchStrategy = this.match_strategy;
                int hashCode6 = (hashCode5 + (matchStrategy != null ? matchStrategy.hashCode() : 0)) * 37;
                Integer num = this.duration_ms;
                int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                EasingCurve easingCurve = this.easing_curve;
                int hashCode8 = hashCode7 + (easingCurve != null ? easingCurve.hashCode() : 0);
                this.hashCode = hashCode8;
                return hashCode8;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                WiresAccountInfo.Builder builder = new WiresAccountInfo.Builder(2);
                builder.routing_number = this.instant;
                builder.account_number = this.fade;
                builder.customer_name = this.pop;
                builder.bank_address = this.slide;
                builder.client_scenario = this.match_strategy;
                builder.action = this.duration_ms;
                builder.wires_profile = this.easing_curve;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                TransitionEffect$Instant transitionEffect$Instant = this.instant;
                if (transitionEffect$Instant != null) {
                    arrayList.add("instant=" + transitionEffect$Instant);
                }
                TransitionEffect$Fade transitionEffect$Fade = this.fade;
                if (transitionEffect$Fade != null) {
                    arrayList.add("fade=" + transitionEffect$Fade);
                }
                TransitionEffect$Pop transitionEffect$Pop = this.pop;
                if (transitionEffect$Pop != null) {
                    arrayList.add("pop=" + transitionEffect$Pop);
                }
                TransitionEffect$Slide transitionEffect$Slide = this.slide;
                if (transitionEffect$Slide != null) {
                    arrayList.add("slide=" + transitionEffect$Slide);
                }
                MatchStrategy matchStrategy = this.match_strategy;
                if (matchStrategy != null) {
                    arrayList.add("match_strategy=" + matchStrategy);
                }
                Integer num = this.duration_ms;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("duration_ms=", num, arrayList);
                }
                EasingCurve easingCurve = this.easing_curve;
                if (easingCurve != null) {
                    arrayList.add("easing_curve=" + easingCurve);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Transition{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(Pop pop, DismissModal dismissModal, RetreatToView retreatToView, Transition transition, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.pop = pop;
            this.dismiss_modal = dismissModal;
            this.retreat_to_view = retreatToView;
            this.transition = transition;
            if ((pop != null ? 1 : 0) + (dismissModal != null ? 1 : 0) + (retreatToView != null ? 1 : 0) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of pop, dismiss_modal, retreat_to_view may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Dismiss)) {
                return false;
            }
            Dismiss dismiss = (Dismiss) obj;
            return Intrinsics.areEqual(unknownFields(), dismiss.unknownFields()) && Intrinsics.areEqual(this.pop, dismiss.pop) && Intrinsics.areEqual(this.dismiss_modal, dismiss.dismiss_modal) && Intrinsics.areEqual(this.retreat_to_view, dismiss.retreat_to_view) && Intrinsics.areEqual(this.transition, dismiss.transition);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Pop pop = this.pop;
            int hashCode2 = (hashCode + (pop != null ? pop.hashCode() : 0)) * 37;
            DismissModal dismissModal = this.dismiss_modal;
            int hashCode3 = (hashCode2 + (dismissModal != null ? dismissModal.hashCode() : 0)) * 37;
            RetreatToView retreatToView = this.retreat_to_view;
            int hashCode4 = (hashCode3 + (retreatToView != null ? retreatToView.hashCode() : 0)) * 37;
            Transition transition = this.transition;
            int hashCode5 = hashCode4 + (transition != null ? transition.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(28);
            builder.amount = this.pop;
            builder.description = this.dismiss_modal;
            builder.note = this.retreat_to_view;
            builder.tint_color = this.transition;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Pop pop = this.pop;
            if (pop != null) {
                arrayList.add("pop=" + pop);
            }
            DismissModal dismissModal = this.dismiss_modal;
            if (dismissModal != null) {
                arrayList.add("dismiss_modal=" + dismissModal);
            }
            RetreatToView retreatToView = this.retreat_to_view;
            if (retreatToView != null) {
                arrayList.add("retreat_to_view=" + retreatToView);
            }
            Transition transition = this.transition;
            if (transition != null) {
                arrayList.add("transition=" + transition);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dismiss{", "}", 0, null, null, 56);
        }
    }

    public enum MatchStrategy implements WireEnum {
        MATCH_STRATEGY_UNSPECIFIED(0),
        MATCH_STRATEGY_NONE(1),
        MATCH_STRATEGY_BY_MOTION_ID(2);

        public static final Navigate$MatchStrategy$Companion$ADAPTER$1 ADAPTER;
        public static final Companion Companion;
        public final int value;

        public final class Companion {
        }

        static {
            MatchStrategy matchStrategy = MATCH_STRATEGY_UNSPECIFIED;
            Companion = new Companion();
            ADAPTER = new Navigate$MatchStrategy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MatchStrategy.class), Syntax.PROTO_2, matchStrategy);
        }

        MatchStrategy(int i) {
            this.value = i;
        }

        public static final MatchStrategy fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return MATCH_STRATEGY_UNSPECIFIED;
            }
            if (i == 1) {
                return MATCH_STRATEGY_NONE;
            }
            if (i != 2) {
                return null;
            }
            return MATCH_STRATEGY_BY_MOTION_ID;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Present extends Message {
        public static final ProtoAdapter ADAPTER = new Navigate$Present$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Present.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Present", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
        public final List on_error_value_mappings;
        public final List on_start_value_mappings;
        public final PresentModal present_modal;
        public final Push push;
        public final Transition transition;
        public final List value_mappings;
        public final Expression view_slug;

        public final class PresentModal extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Present$PresentModal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PresentModal.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Present.PresentModal", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentModal(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof PresentModal) && Intrinsics.areEqual(unknownFields(), ((PresentModal) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(25);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "PresentModal{}";
            }
        }

        public final class Push extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Present$Push$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Push.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Present.Push", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Push(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Push) && Intrinsics.areEqual(unknownFields(), ((Push) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(26);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "Push{}";
            }
        }

        public final class Transition extends Message {
            public static final ProtoAdapter ADAPTER = new Navigate$Present$Transition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Transition.class), "type.googleapis.com/xyz.block.genie.v1.Navigate.Present.Transition", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
            public final Integer duration_ms;
            public final EasingCurve easing_curve;
            public final TransitionEffect$Fade fade;
            public final TransitionEffect$Instant instant;
            public final MatchStrategy match_strategy;
            public final TransitionEffect$Push push;
            public final TransitionEffect$Slide slide;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Transition(TransitionEffect$Instant transitionEffect$Instant, TransitionEffect$Fade transitionEffect$Fade, TransitionEffect$Push transitionEffect$Push, TransitionEffect$Slide transitionEffect$Slide, MatchStrategy matchStrategy, Integer num, EasingCurve easingCurve, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.instant = transitionEffect$Instant;
                this.fade = transitionEffect$Fade;
                this.push = transitionEffect$Push;
                this.slide = transitionEffect$Slide;
                this.match_strategy = matchStrategy;
                this.duration_ms = num;
                this.easing_curve = easingCurve;
                if (TransactorKt.countNonNull(transitionEffect$Instant, transitionEffect$Fade, transitionEffect$Push, transitionEffect$Slide, new Object[0]) <= 1) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("At most one of instant, fade, push, slide may be non-null");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Transition)) {
                    return false;
                }
                Transition transition = (Transition) obj;
                return Intrinsics.areEqual(unknownFields(), transition.unknownFields()) && Intrinsics.areEqual(this.instant, transition.instant) && Intrinsics.areEqual(this.fade, transition.fade) && Intrinsics.areEqual(this.push, transition.push) && Intrinsics.areEqual(this.slide, transition.slide) && this.match_strategy == transition.match_strategy && Intrinsics.areEqual(this.duration_ms, transition.duration_ms) && Intrinsics.areEqual(this.easing_curve, transition.easing_curve);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                TransitionEffect$Instant transitionEffect$Instant = this.instant;
                int hashCode2 = (hashCode + (transitionEffect$Instant != null ? transitionEffect$Instant.hashCode() : 0)) * 37;
                TransitionEffect$Fade transitionEffect$Fade = this.fade;
                int hashCode3 = (hashCode2 + (transitionEffect$Fade != null ? transitionEffect$Fade.hashCode() : 0)) * 37;
                TransitionEffect$Push transitionEffect$Push = this.push;
                int hashCode4 = (hashCode3 + (transitionEffect$Push != null ? transitionEffect$Push.hashCode() : 0)) * 37;
                TransitionEffect$Slide transitionEffect$Slide = this.slide;
                int hashCode5 = (hashCode4 + (transitionEffect$Slide != null ? transitionEffect$Slide.hashCode() : 0)) * 37;
                MatchStrategy matchStrategy = this.match_strategy;
                int hashCode6 = (hashCode5 + (matchStrategy != null ? matchStrategy.hashCode() : 0)) * 37;
                Integer num = this.duration_ms;
                int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                EasingCurve easingCurve = this.easing_curve;
                int hashCode8 = hashCode7 + (easingCurve != null ? easingCurve.hashCode() : 0);
                this.hashCode = hashCode8;
                return hashCode8;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                WiresAccountInfo.Builder builder = new WiresAccountInfo.Builder(4);
                builder.routing_number = this.instant;
                builder.account_number = this.fade;
                builder.customer_name = this.push;
                builder.bank_address = this.slide;
                builder.client_scenario = this.match_strategy;
                builder.action = this.duration_ms;
                builder.wires_profile = this.easing_curve;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                TransitionEffect$Instant transitionEffect$Instant = this.instant;
                if (transitionEffect$Instant != null) {
                    arrayList.add("instant=" + transitionEffect$Instant);
                }
                TransitionEffect$Fade transitionEffect$Fade = this.fade;
                if (transitionEffect$Fade != null) {
                    arrayList.add("fade=" + transitionEffect$Fade);
                }
                TransitionEffect$Push transitionEffect$Push = this.push;
                if (transitionEffect$Push != null) {
                    arrayList.add("push=" + transitionEffect$Push);
                }
                TransitionEffect$Slide transitionEffect$Slide = this.slide;
                if (transitionEffect$Slide != null) {
                    arrayList.add("slide=" + transitionEffect$Slide);
                }
                MatchStrategy matchStrategy = this.match_strategy;
                if (matchStrategy != null) {
                    arrayList.add("match_strategy=" + matchStrategy);
                }
                Integer num = this.duration_ms;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("duration_ms=", num, arrayList);
                }
                EasingCurve easingCurve = this.easing_curve;
                if (easingCurve != null) {
                    arrayList.add("easing_curve=" + easingCurve);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Transition{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Present(Expression expression, List list, List list2, List list3, Push push, PresentModal presentModal, Transition transition, ByteString byteString) {
            super(ADAPTER, byteString);
            expression.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            byteString.getClass();
            this.view_slug = expression;
            this.push = push;
            this.present_modal = presentModal;
            this.transition = transition;
            this.value_mappings = TransactorKt.immutableCopyOf("value_mappings", list);
            this.on_start_value_mappings = TransactorKt.immutableCopyOf("on_start_value_mappings", list2);
            this.on_error_value_mappings = TransactorKt.immutableCopyOf("on_error_value_mappings", list3);
            if (TransactorKt.countNonNull(push, presentModal) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of push, present_modal may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Present)) {
                return false;
            }
            Present present = (Present) obj;
            return Intrinsics.areEqual(unknownFields(), present.unknownFields()) && Intrinsics.areEqual(this.view_slug, present.view_slug) && Intrinsics.areEqual(this.value_mappings, present.value_mappings) && Intrinsics.areEqual(this.on_start_value_mappings, present.on_start_value_mappings) && Intrinsics.areEqual(this.on_error_value_mappings, present.on_error_value_mappings) && Intrinsics.areEqual(this.push, present.push) && Intrinsics.areEqual(this.present_modal, present.present_modal) && Intrinsics.areEqual(this.transition, present.transition);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Matcher$$ExternalSyntheticOutline0.m(this.view_slug, unknownFields().hashCode() * 37, 37), 37, this.value_mappings), 37, this.on_start_value_mappings), 37, this.on_error_value_mappings);
            Push push = this.push;
            int hashCode = (m + (push != null ? push.hashCode() : 0)) * 37;
            PresentModal presentModal = this.present_modal;
            int hashCode2 = (hashCode + (presentModal != null ? presentModal.hashCode() : 0)) * 37;
            Transition transition = this.transition;
            int hashCode3 = hashCode2 + (transition != null ? transition.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WiresAccountInfo.Builder builder = new WiresAccountInfo.Builder(3);
            builder.routing_number = this.view_slug;
            builder.account_number = this.value_mappings;
            builder.customer_name = this.on_start_value_mappings;
            builder.bank_address = this.on_error_value_mappings;
            builder.client_scenario = this.push;
            builder.action = this.present_modal;
            builder.wires_profile = this.transition;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("view_slug=", this.view_slug, arrayList);
            List list = this.value_mappings;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("value_mappings=", arrayList, list);
            }
            List list2 = this.on_start_value_mappings;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("on_start_value_mappings=", arrayList, list2);
            }
            List list3 = this.on_error_value_mappings;
            if (!list3.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("on_error_value_mappings=", arrayList, list3);
            }
            Push push = this.push;
            if (push != null) {
                arrayList.add("push=" + push);
            }
            PresentModal presentModal = this.present_modal;
            if (presentModal != null) {
                arrayList.add("present_modal=" + presentModal);
            }
            Transition transition = this.transition;
            if (transition != null) {
                arrayList.add("transition=" + transition);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Present{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Navigate(Present present, Dismiss dismiss, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.present = present;
        this.dismiss = dismiss;
        if (TransactorKt.countNonNull(present, dismiss) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of present, dismiss may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Navigate)) {
            return false;
        }
        Navigate navigate = (Navigate) obj;
        return Intrinsics.areEqual(unknownFields(), navigate.unknownFields()) && Intrinsics.areEqual(this.present, navigate.present) && Intrinsics.areEqual(this.dismiss, navigate.dismiss);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Present present = this.present;
        int hashCode2 = (hashCode + (present != null ? present.hashCode() : 0)) * 37;
        Dismiss dismiss = this.dismiss;
        int hashCode3 = hashCode2 + (dismiss != null ? dismiss.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UnaryOp.Builder builder = new UnaryOp.Builder(6);
        builder.operator_ = this.present;
        builder.operand = this.dismiss;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Present present = this.present;
        if (present != null) {
            arrayList.add("present=" + present);
        }
        Dismiss dismiss = this.dismiss;
        if (dismiss != null) {
            arrayList.add("dismiss=" + dismiss);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Navigate{", "}", 0, null, null, 56);
    }
}
