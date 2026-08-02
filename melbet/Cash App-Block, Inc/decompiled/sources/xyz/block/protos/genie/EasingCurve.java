package xyz.block.protos.genie;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.franklin.common.AfterpayPrepurchaseElement;
import com.squareup.protos.franklin.common.OverdraftCoverageElement;
import com.squareup.protos.franklin.common.SpendingInsightsElement;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.protos.timecards.GetClockinEssentialsRequest;
import com.squareup.protos.wiremate.WiresEligibilityState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.customer_feed.service.SubscribeRequest;
import squareup.cash.customer_feed.service.Subscription;
import squareup.cash.earnings.EarningFdicFooterSection;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.savings.bespoke_elements.Disclosure;
import xyz.block.protos.genie.CollectionMutation;
import xyz.block.protos.genie.CreateSessionRequest;
import xyz.block.protos.genie.Navigate;
import xyz.block.protos.genie.ViewStateValueMapping;

/* loaded from: classes10.dex */
public final class EasingCurve extends Message {
    public static final ProtoAdapter ADAPTER = new EasingCurve$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EasingCurve.class), "type.googleapis.com/xyz.block.genie.v1.EasingCurve", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");
    public final CubicBezier cubic_bezier;
    public final EaseIn ease_in;
    public final EaseInOut ease_in_out;
    public final EaseOut ease_out;
    public final Linear linear;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable cubic_bezier;
        public Serializable ease_in;
        public Serializable ease_in_out;
        public Serializable ease_out;
        public Serializable linear;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EasingCurve((Linear) this.linear, (EaseIn) this.ease_in, (EaseOut) this.ease_out, (EaseInOut) this.ease_in_out, (CubicBezier) this.cubic_bezier, buildUnknownFields());
                case 1:
                    return new CreateSessionRequest((String) this.linear, (CreateSessionRequest.Platform) this.ease_in, (String) this.ease_out, (String) this.ease_in_out, (String) this.cubic_bezier, buildUnknownFields());
                default:
                    ViewStateValueMapping.ViewOutputs viewOutputs = (ViewStateValueMapping.ViewOutputs) this.linear;
                    ViewStateValueMapping.SceneInputs sceneInputs = (ViewStateValueMapping.SceneInputs) this.ease_in;
                    Expression expression = (Expression) this.ease_out;
                    if (expression == null) {
                        TransactorKt.missingRequiredFields(expression, "source_value");
                        throw null;
                    }
                    String str = (String) this.ease_in_out;
                    KeyPath keyPath = (KeyPath) this.cubic_bezier;
                    if (keyPath != null) {
                        return new ViewStateValueMapping(viewOutputs, sceneInputs, expression, str, keyPath, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(keyPath, "destination_key_path");
                    throw null;
            }
        }
    }

    public final class CubicBezier extends Message {
        public static final ProtoAdapter ADAPTER = new EasingCurve$CubicBezier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CubicBezier.class), "type.googleapis.com/xyz.block.genie.v1.EasingCurve.CubicBezier", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");
        public final double x1;
        public final double x2;
        public final double y1;
        public final double y2;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Double x1;
            public Double x2;
            public Double y1;
            public Double y2;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        Double d = this.x1;
                        if (d == null) {
                            TransactorKt.missingRequiredFields(d, "x1");
                            throw null;
                        }
                        double doubleValue = d.doubleValue();
                        Double d2 = this.y1;
                        if (d2 == null) {
                            TransactorKt.missingRequiredFields(d2, "y1");
                            throw null;
                        }
                        double doubleValue2 = d2.doubleValue();
                        Double d3 = this.x2;
                        if (d3 == null) {
                            TransactorKt.missingRequiredFields(d3, "x2");
                            throw null;
                        }
                        double doubleValue3 = d3.doubleValue();
                        Double d4 = this.y2;
                        if (d4 != null) {
                            return new CubicBezier(doubleValue, doubleValue2, doubleValue3, d4.doubleValue(), buildUnknownFields());
                        }
                        TransactorKt.missingRequiredFields(d4, "y2");
                        throw null;
                    default:
                        return new BrandCollection.GeoFence(this.x1, this.y1, this.x2, this.y2, buildUnknownFields());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CubicBezier(double d, double d2, double d3, double d4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.x1 = d;
            this.y1 = d2;
            this.x2 = d3;
            this.y2 = d4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CubicBezier)) {
                return false;
            }
            CubicBezier cubicBezier = (CubicBezier) obj;
            return Intrinsics.areEqual(unknownFields(), cubicBezier.unknownFields()) && this.x1 == cubicBezier.x1 && this.y1 == cubicBezier.y1 && this.x2 == cubicBezier.x2 && this.y2 == cubicBezier.y2;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Double.hashCode(this.y2) + Fragment$5$$ExternalSyntheticOutline0.m(this.x2, Fragment$5$$ExternalSyntheticOutline0.m(this.y1, Fragment$5$$ExternalSyntheticOutline0.m(this.x1, unknownFields().hashCode() * 37, 37), 37), 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.x1 = Double.valueOf(this.x1);
            builder.y1 = Double.valueOf(this.y1);
            builder.x2 = Double.valueOf(this.x2);
            builder.y2 = Double.valueOf(this.y2);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("x1=" + this.x1);
            arrayList.add("y1=" + this.y1);
            arrayList.add("x2=" + this.x2);
            arrayList.add("y2=" + this.y2);
            return CollectionsKt.joinToString$default(arrayList, ", ", "CubicBezier{", "}", 0, null, null, 56);
        }
    }

    public final class EaseIn extends Message {
        public static final ProtoAdapter ADAPTER = new EasingCurve$EaseIn$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EaseIn.class), "type.googleapis.com/xyz.block.genie.v1.EasingCurve.EaseIn", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new EaseIn(buildUnknownFields());
                    case 1:
                        return new AfterpayPrepurchaseElement(buildUnknownFields());
                    case 2:
                        return new OverdraftCoverageElement(buildUnknownFields());
                    case 3:
                        return new SpendingInsightsElement(buildUnknownFields());
                    case 4:
                        return new RewardSelection.Active(buildUnknownFields());
                    case 5:
                        return new RewardSelection.Disabled(buildUnknownFields());
                    case 6:
                        return new UiRewardProgramDetails.DetailRow.ReadOnly(buildUnknownFields());
                    case 7:
                        return new UiRewardSelectionState.Unlocked(buildUnknownFields());
                    case 8:
                        return new GetClockinEssentialsRequest(buildUnknownFields());
                    case 9:
                        return new WiresEligibilityState.EligibleInvalidAccount(buildUnknownFields());
                    case 10:
                        return new WiresEligibilityState.EligibleValidAccount(buildUnknownFields());
                    case 11:
                        return new WiresEligibilityState.Ineligible(buildUnknownFields());
                    case 12:
                        return new SubscribeRequest(buildUnknownFields());
                    case 13:
                        return new Subscription(buildUnknownFields());
                    case 14:
                        return new EarningFdicFooterSection(buildUnknownFields());
                    case 15:
                        return new OverdraftStatus.Action.DisableOverdraftAction(buildUnknownFields());
                    case 16:
                        return new OverdraftStatus.Action.EnableOverdraftAction(buildUnknownFields());
                    case 17:
                        return new PaychecksHomeUi.KYBEligibilityWarningSection(buildUnknownFields());
                    case 18:
                        return new Disclosure(buildUnknownFields());
                    case 19:
                        return new CollectionMutation.RemoveAll(buildUnknownFields());
                    case 20:
                        return new EaseInOut(buildUnknownFields());
                    case 21:
                        return new EaseOut(buildUnknownFields());
                    case 22:
                        return new Linear(buildUnknownFields());
                    case 23:
                        return new Navigate.Dismiss.DismissModal(buildUnknownFields());
                    case 24:
                        return new Navigate.Dismiss.Pop(buildUnknownFields());
                    case 25:
                        return new Navigate.Present.PresentModal(buildUnknownFields());
                    case 26:
                        return new Navigate.Present.Push(buildUnknownFields());
                    case 27:
                        return new TransitionEffect$Fade(buildUnknownFields());
                    case 28:
                        return new TransitionEffect$Instant(buildUnknownFields());
                    default:
                        return new TransitionEffect$Pop(buildUnknownFields());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EaseIn(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof EaseIn) && Intrinsics.areEqual(unknownFields(), ((EaseIn) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "EaseIn{}";
        }
    }

    public final class EaseInOut extends Message {
        public static final ProtoAdapter ADAPTER = new EasingCurve$EaseInOut$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EaseInOut.class), "type.googleapis.com/xyz.block.genie.v1.EasingCurve.EaseInOut", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EaseInOut(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof EaseInOut) && Intrinsics.areEqual(unknownFields(), ((EaseInOut) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EaseIn.Builder builder = new EaseIn.Builder(20);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "EaseInOut{}";
        }
    }

    public final class EaseOut extends Message {
        public static final ProtoAdapter ADAPTER = new EasingCurve$EaseOut$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EaseOut.class), "type.googleapis.com/xyz.block.genie.v1.EasingCurve.EaseOut", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EaseOut(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof EaseOut) && Intrinsics.areEqual(unknownFields(), ((EaseOut) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EaseIn.Builder builder = new EaseIn.Builder(21);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "EaseOut{}";
        }
    }

    public final class Linear extends Message {
        public static final ProtoAdapter ADAPTER = new EasingCurve$Linear$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Linear.class), "type.googleapis.com/xyz.block.genie.v1.EasingCurve.Linear", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Linear(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Linear) && Intrinsics.areEqual(unknownFields(), ((Linear) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EaseIn.Builder builder = new EaseIn.Builder(22);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Linear{}";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasingCurve(Linear linear, EaseIn easeIn, EaseOut easeOut, EaseInOut easeInOut, CubicBezier cubicBezier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.linear = linear;
        this.ease_in = easeIn;
        this.ease_out = easeOut;
        this.ease_in_out = easeInOut;
        this.cubic_bezier = cubicBezier;
        if (TransactorKt.countNonNull(linear, easeIn, easeOut, easeInOut, cubicBezier) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of linear, ease_in, ease_out, ease_in_out, cubic_bezier may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EasingCurve)) {
            return false;
        }
        EasingCurve easingCurve = (EasingCurve) obj;
        return Intrinsics.areEqual(unknownFields(), easingCurve.unknownFields()) && Intrinsics.areEqual(this.linear, easingCurve.linear) && Intrinsics.areEqual(this.ease_in, easingCurve.ease_in) && Intrinsics.areEqual(this.ease_out, easingCurve.ease_out) && Intrinsics.areEqual(this.ease_in_out, easingCurve.ease_in_out) && Intrinsics.areEqual(this.cubic_bezier, easingCurve.cubic_bezier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Linear linear = this.linear;
        int hashCode2 = (hashCode + (linear != null ? linear.hashCode() : 0)) * 37;
        EaseIn easeIn = this.ease_in;
        int hashCode3 = (hashCode2 + (easeIn != null ? easeIn.hashCode() : 0)) * 37;
        EaseOut easeOut = this.ease_out;
        int hashCode4 = (hashCode3 + (easeOut != null ? easeOut.hashCode() : 0)) * 37;
        EaseInOut easeInOut = this.ease_in_out;
        int hashCode5 = (hashCode4 + (easeInOut != null ? easeInOut.hashCode() : 0)) * 37;
        CubicBezier cubicBezier = this.cubic_bezier;
        int hashCode6 = hashCode5 + (cubicBezier != null ? cubicBezier.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.linear = this.linear;
        builder.ease_in = this.ease_in;
        builder.ease_out = this.ease_out;
        builder.ease_in_out = this.ease_in_out;
        builder.cubic_bezier = this.cubic_bezier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Linear linear = this.linear;
        if (linear != null) {
            arrayList.add("linear=" + linear);
        }
        EaseIn easeIn = this.ease_in;
        if (easeIn != null) {
            arrayList.add("ease_in=" + easeIn);
        }
        EaseOut easeOut = this.ease_out;
        if (easeOut != null) {
            arrayList.add("ease_out=" + easeOut);
        }
        EaseInOut easeInOut = this.ease_in_out;
        if (easeInOut != null) {
            arrayList.add("ease_in_out=" + easeInOut);
        }
        CubicBezier cubicBezier = this.cubic_bezier;
        if (cubicBezier != null) {
            arrayList.add("cubic_bezier=" + cubicBezier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EasingCurve{", "}", 0, null, null, 56);
    }
}
