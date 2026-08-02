package squareup.cash.savings;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Parcelable;
import android.util.Rational;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.core.MeteringPoint;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.squareup.cash.afterpayapplet.views.components.ButtonCtaKt$WhenMappings;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.money.presenters.MoneyTabToolbarConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.earnings.EarningTool;
import squareup.cash.paychecks.Deduction;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes10.dex */
public final class ArcadeElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ArcadeElement> CREATOR;
    public final Element element;

    /* loaded from: classes5.dex */
    public abstract class Element {

        /* loaded from: classes10.dex */
        public final class BetweenSection extends Element {
            public final squareup.cash.ui.arcade.elements.BetweenSection value;

            public BetweenSection(squareup.cash.ui.arcade.elements.BetweenSection betweenSection) {
                betweenSection.getClass();
                this.value = betweenSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BetweenSection) && Intrinsics.areEqual(this.value, ((BetweenSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "BetweenSection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class ButtonDefaultGroup extends Element {
            public final squareup.cash.ui.arcade.elements.ButtonDefaultGroup value;

            public ButtonDefaultGroup(squareup.cash.ui.arcade.elements.ButtonDefaultGroup buttonDefaultGroup) {
                buttonDefaultGroup.getClass();
                this.value = buttonDefaultGroup;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ButtonDefaultGroup) && Intrinsics.areEqual(this.value, ((ButtonDefaultGroup) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ButtonDefaultGroup(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class CellDefault extends Element {
            public final TappableCellDefault value;

            public CellDefault(TappableCellDefault tappableCellDefault) {
                tappableCellDefault.getClass();
                this.value = tappableCellDefault;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CellDefault) && Intrinsics.areEqual(this.value, ((CellDefault) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CellDefault(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class PageHeader extends Element {
            public final squareup.cash.ui.arcade.elements.PageHeader value;

            public PageHeader(squareup.cash.ui.arcade.elements.PageHeader pageHeader) {
                pageHeader.getClass();
                this.value = pageHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PageHeader) && Intrinsics.areEqual(this.value, ((PageHeader) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "PageHeader(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class SectionHeader extends Element {
            public final squareup.cash.ui.arcade.elements.SectionHeader value;

            public SectionHeader(squareup.cash.ui.arcade.elements.SectionHeader sectionHeader) {
                sectionHeader.getClass();
                this.value = sectionHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SectionHeader) && Intrinsics.areEqual(this.value, ((SectionHeader) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SectionHeader(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class WithinSection extends Element {
            public final squareup.cash.ui.arcade.elements.WithinSection value;

            public WithinSection(squareup.cash.ui.arcade.elements.WithinSection withinSection) {
                withinSection.getClass();
                this.value = withinSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WithinSection) && Intrinsics.areEqual(this.value, ((WithinSection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "WithinSection(value=" + this.value + ")";
            }
        }

        public static final void ButtonCta(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ButtonProminence buttonProminence, Function0 function0, Composer composer, int i) {
            int i2;
            ComposableLambdaImpl composableLambdaImpl2;
            Function0 function02;
            Modifier modifier2;
            buttonProminence.getClass();
            function0.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(2118184345);
            if ((i & 6) == 0) {
                i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            int i3 = i2 | (gapComposer.changed(buttonProminence.ordinal()) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                int i4 = ButtonCtaKt$WhenMappings.$EnumSwitchMapping$0[buttonProminence.ordinal()];
                composableLambdaImpl2 = composableLambdaImpl;
                SizeKt.ButtonCta(function0, modifier, i4 != 1 ? i4 != 2 ? i4 != 3 ? com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD : com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE : com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT : com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD, false, false, null, composableLambdaImpl2, gapComposer, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | 1572864, 56);
                function02 = function0;
                modifier2 = modifier;
            } else {
                composableLambdaImpl2 = composableLambdaImpl;
                function02 = function0;
                modifier2 = modifier;
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier2, composableLambdaImpl2, buttonProminence, function02, i);
            }
        }

        public static List meteringRegionsFromMeteringPoints(List list, int i, Rect rect, Rational rational, int i2, TargetAspectRatio targetAspectRatio) {
            PointF pointF;
            PointF pointF2;
            list.getClass();
            rect.getClass();
            if (list.isEmpty() || i == 0) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Rational rational2 = new Rational(rect.width(), rect.height());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MeteringPoint meteringPoint = (MeteringPoint) it.next();
                if (arrayList.size() >= i) {
                    return arrayList;
                }
                float f = meteringPoint.mNormalizedX;
                if (f >= RecyclerView.DECELERATION_RATE && f <= 1.0f) {
                    float f2 = meteringPoint.mNormalizedY;
                    if (f2 >= RecyclerView.DECELERATION_RATE && f2 <= 1.0f) {
                        Rational rational3 = meteringPoint.mSurfaceAspectRatio;
                        if (rational3 == null) {
                            rational3 = rational;
                        }
                        switch (targetAspectRatio.$r8$classId) {
                            case 2:
                                float f3 = meteringPoint.mNormalizedY;
                                float f4 = meteringPoint.mNormalizedX;
                                pointF = i2 == 1 ? new PointF(1.0f - f4, f3) : new PointF(f4, f3);
                                break;
                            default:
                                pointF = new PointF(meteringPoint.mNormalizedX, meteringPoint.mNormalizedY);
                                break;
                        }
                        if (rational3.equals(rational2)) {
                            pointF2 = new PointF(pointF.x, pointF.y);
                        } else if (rational3.compareTo(rational2) > 0) {
                            pointF2 = new PointF(pointF.x, pointF.y);
                            float doubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF2.y = (1.0f / doubleValue) * (((float) ((doubleValue - 1.0d) / 2.0d)) + pointF2.y);
                        } else {
                            pointF2 = new PointF(pointF.x, pointF.y);
                            float doubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF2.x = (1.0f / doubleValue2) * (((float) ((doubleValue2 - 1.0d) / 2.0d)) + pointF2.x);
                        }
                        float f5 = meteringPoint.mSize;
                        int width = (int) ((pointF2.x * rect.width()) + rect.left);
                        int height = (int) ((pointF2.y * rect.height()) + rect.top);
                        int width2 = ((int) (rect.width() * f5)) / 2;
                        int height2 = ((int) (f5 * rect.height())) / 2;
                        Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
                        rect2.left = RangesKt___RangesKt.coerceIn(rect2.left, rect.left, rect.right);
                        rect2.right = RangesKt___RangesKt.coerceIn(rect2.right, rect.left, rect.right);
                        rect2.top = RangesKt___RangesKt.coerceIn(rect2.top, rect.top, rect.bottom);
                        rect2.bottom = RangesKt___RangesKt.coerceIn(rect2.bottom, rect.top, rect.bottom);
                        arrayList.add(new MeteringRectangle(rect2, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO));
                    }
                }
            }
            return arrayList;
        }

        public static Set provideMoneyTabSectionProviders$presenters(SetFactory setFactory, SetFactory setFactory2, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
            return (Set) (cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? setFactory2.invoke() : setFactory.invoke());
        }

        public static MoneyTabToolbarConfig provideMoneyTabToolbarConfig$presenters(CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
            return new MoneyTabToolbarConfig(cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0);
        }
    }

    public final class TappableCellDefault extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TappableCellDefault> CREATOR;
        public final CellDefault cell_default;
        public final SavingsAction tap_action;
        public final ClientRouteTemplate tap_client_route_template;
        public final CdfEvent tap_client_route_template_cdf_event;

        static {
            ArcadeElement$TappableCellDefault$Companion$ADAPTER$1 arcadeElement$TappableCellDefault$Companion$ADAPTER$1 = new ArcadeElement$TappableCellDefault$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TappableCellDefault.class), "type.googleapis.com/squareup.cash.savings.ArcadeElement.TappableCellDefault", Syntax.PROTO_2, null, "squareup/cash/savings/ArcadeElement.proto");
            ADAPTER = arcadeElement$TappableCellDefault$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeElement$TappableCellDefault$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TappableCellDefault(CellDefault cellDefault, SavingsAction savingsAction, CdfEvent cdfEvent, ClientRouteTemplate clientRouteTemplate, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cell_default = cellDefault;
            this.tap_action = savingsAction;
            this.tap_client_route_template_cdf_event = cdfEvent;
            this.tap_client_route_template = clientRouteTemplate;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TappableCellDefault)) {
                return false;
            }
            TappableCellDefault tappableCellDefault = (TappableCellDefault) obj;
            return Intrinsics.areEqual(unknownFields(), tappableCellDefault.unknownFields()) && Intrinsics.areEqual(this.cell_default, tappableCellDefault.cell_default) && Intrinsics.areEqual(this.tap_action, tappableCellDefault.tap_action) && Intrinsics.areEqual(this.tap_client_route_template_cdf_event, tappableCellDefault.tap_client_route_template_cdf_event) && Intrinsics.areEqual(this.tap_client_route_template, tappableCellDefault.tap_client_route_template);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CellDefault cellDefault = this.cell_default;
            int hashCode2 = (hashCode + (cellDefault != null ? cellDefault.hashCode() : 0)) * 37;
            SavingsAction savingsAction = this.tap_action;
            int hashCode3 = (hashCode2 + (savingsAction != null ? savingsAction.hashCode() : 0)) * 37;
            CdfEvent cdfEvent = this.tap_client_route_template_cdf_event;
            int hashCode4 = (hashCode3 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
            ClientRouteTemplate clientRouteTemplate = this.tap_client_route_template;
            int hashCode5 = hashCode4 + (clientRouteTemplate != null ? clientRouteTemplate.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(19);
            builder.amount = this.cell_default;
            builder.description = this.tap_action;
            builder.note = this.tap_client_route_template_cdf_event;
            builder.tint_color = this.tap_client_route_template;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CellDefault cellDefault = this.cell_default;
            if (cellDefault != null) {
                arrayList.add("cell_default=" + cellDefault);
            }
            SavingsAction savingsAction = this.tap_action;
            if (savingsAction != null) {
                arrayList.add("tap_action=" + savingsAction);
            }
            CdfEvent cdfEvent = this.tap_client_route_template_cdf_event;
            if (cdfEvent != null) {
                arrayList.add("tap_client_route_template_cdf_event=" + cdfEvent);
            }
            ClientRouteTemplate clientRouteTemplate = this.tap_client_route_template;
            if (clientRouteTemplate != null) {
                arrayList.add("tap_client_route_template=" + clientRouteTemplate);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TappableCellDefault{", "}", 0, null, null, 56);
        }
    }

    static {
        ArcadeElement$Companion$ADAPTER$1 arcadeElement$Companion$ADAPTER$1 = new ArcadeElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ArcadeElement.class), "type.googleapis.com/squareup.cash.savings.ArcadeElement", Syntax.PROTO_2, null, "squareup/cash/savings/ArcadeElement.proto");
        ADAPTER = arcadeElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeElement(Element element, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.element = element;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArcadeElement)) {
            return false;
        }
        ArcadeElement arcadeElement = (ArcadeElement) obj;
        return Intrinsics.areEqual(unknownFields(), arcadeElement.unknownFields()) && Intrinsics.areEqual(this.element, arcadeElement.element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Element element = this.element;
        int hashCode2 = hashCode + (element != null ? element.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(23);
        builder.tool = this.element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Element element = this.element;
        if (element != null) {
            arrayList.add("element=" + element);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArcadeElement{", "}", 0, null, null, 56);
    }
}
