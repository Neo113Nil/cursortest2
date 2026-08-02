package squareup.cash.earnings;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.booklet.ListUnorderedSection;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$CategoryToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;
import utils.StringUtilsKt;

/* loaded from: classes10.dex */
public final class EarningsTimeFrame extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsTimeFrame> CREATOR;
    public final TimeFrame time_frame;

    /* loaded from: classes5.dex */
    public abstract class TimeFrame {

        /* loaded from: classes10.dex */
        public final class YearMonth extends TimeFrame {
            public final EarningsYearMonth value;

            public YearMonth(EarningsYearMonth earningsYearMonth) {
                earningsYearMonth.getClass();
                this.value = earningsYearMonth;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof YearMonth) && Intrinsics.areEqual(this.value, ((YearMonth) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "YearMonth(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class YearToDate extends TimeFrame {
            public final EarningsYearToDate value;

            public YearToDate(EarningsYearToDate earningsYearToDate) {
                earningsYearToDate.getClass();
                this.value = earningsYearToDate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof YearToDate) && Intrinsics.areEqual(this.value, ((YearToDate) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "YearToDate(value=" + this.value + ")";
            }
        }

        public static final void ListUnorderedSection(ListUnorderedSection listUnorderedSection, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1689324079);
            int i2 = (gapComposer.changedInstance(listUnorderedSection) ? 4 : 2) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, ListUnorderedSize.Large, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-2075714837, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(listUnorderedSection, 17), gapComposer), gapComposer, 199680, 23);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(listUnorderedSection, i, 26);
            }
        }

        public static final String access$getDatabaseToken(EngagedItemToken engagedItemToken) {
            ErrorEvent.Meta.Companion companion = engagedItemToken.token;
            if (companion instanceof EngagedItemToken$Token$MerchantToken) {
                return ((EngagedItemToken$Token$MerchantToken) companion).value;
            }
            if (companion instanceof EngagedItemToken$Token$CategoryToken) {
                return ((EngagedItemToken$Token$CategoryToken) companion).value;
            }
            if (companion == null) {
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public static boolean isFlashAvailable$default(CameraPipeCameraProperties cameraPipeCameraProperties) {
            Boolean bool;
            cameraPipeCameraProperties.getClass();
            try {
                CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
                CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                key.getClass();
                bool = (Boolean) ((Camera2CameraMetadata) cameraMetadata).get(key);
            } catch (BufferUnderflowException e) {
                if (DeviceQuirks.getAll().get(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                    }
                } else if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                    Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e);
                }
                bool = Boolean.FALSE;
            }
            if (bool == null && StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    static {
        EarningsTimeFrame$Companion$ADAPTER$1 earningsTimeFrame$Companion$ADAPTER$1 = new EarningsTimeFrame$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsTimeFrame.class), "type.googleapis.com/squareup.cash.earnings.EarningsTimeFrame", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningsTimeFrame$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsTimeFrame$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsTimeFrame(TimeFrame timeFrame, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.time_frame = timeFrame;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsTimeFrame)) {
            return false;
        }
        EarningsTimeFrame earningsTimeFrame = (EarningsTimeFrame) obj;
        return Intrinsics.areEqual(unknownFields(), earningsTimeFrame.unknownFields()) && Intrinsics.areEqual(this.time_frame, earningsTimeFrame.time_frame);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TimeFrame timeFrame = this.time_frame;
        int hashCode2 = hashCode + (timeFrame != null ? timeFrame.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(17);
        builder.tool = this.time_frame;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TimeFrame timeFrame = this.time_frame;
        if (timeFrame != null) {
            arrayList.add("time_frame=" + timeFrame);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsTimeFrame{", "}", 0, null, null, 56);
    }

    public /* synthetic */ EarningsTimeFrame(TimeFrame timeFrame) {
        this(timeFrame, ByteString.EMPTY);
    }
}
