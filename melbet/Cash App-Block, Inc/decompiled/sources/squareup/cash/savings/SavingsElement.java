package squareup.cash.savings;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.core.InitializationException;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;
import utils.StringUtilsKt;

/* loaded from: classes10.dex */
public final class SavingsElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsElement> CREATOR;
    public final Element element;

    /* loaded from: classes5.dex */
    public abstract class Element {

        /* loaded from: classes10.dex */
        public final class ActivitySection extends Element {
            public final squareup.cash.savings.bespoke_elements.ActivitySection value;

            public ActivitySection(squareup.cash.savings.bespoke_elements.ActivitySection activitySection) {
                activitySection.getClass();
                this.value = activitySection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActivitySection) && Intrinsics.areEqual(this.value, ((ActivitySection) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ActivitySection(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class Card extends Element {
            public final squareup.cash.savings.bespoke_elements.Card value;

            public Card(squareup.cash.savings.bespoke_elements.Card card) {
                card.getClass();
                this.value = card;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Card) && Intrinsics.areEqual(this.value, ((Card) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Card(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class CompactCard extends Element {
            public final squareup.cash.savings.bespoke_elements.CompactCard value;

            public CompactCard(squareup.cash.savings.bespoke_elements.CompactCard compactCard) {
                compactCard.getClass();
                this.value = compactCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompactCard) && Intrinsics.areEqual(this.value, ((CompactCard) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CompactCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class Disclosure extends Element {
            public final squareup.cash.savings.bespoke_elements.Disclosure value;

            public Disclosure(squareup.cash.savings.bespoke_elements.Disclosure disclosure) {
                disclosure.getClass();
                this.value = disclosure;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Disclosure) && Intrinsics.areEqual(this.value, ((Disclosure) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Disclosure(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class FolderList extends Element {
            public final squareup.cash.savings.bespoke_elements.FolderList value;

            public FolderList(squareup.cash.savings.bespoke_elements.FolderList folderList) {
                folderList.getClass();
                this.value = folderList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FolderList) && Intrinsics.areEqual(this.value, ((FolderList) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FolderList(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class GoalHeader extends Element {
            public final squareup.cash.savings.bespoke_elements.GoalHeader value;

            public GoalHeader(squareup.cash.savings.bespoke_elements.GoalHeader goalHeader) {
                goalHeader.getClass();
                this.value = goalHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoalHeader) && Intrinsics.areEqual(this.value, ((GoalHeader) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "GoalHeader(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class NoGoalHeader extends Element {
            public final squareup.cash.savings.bespoke_elements.NoGoalHeader value;

            public NoGoalHeader(squareup.cash.savings.bespoke_elements.NoGoalHeader noGoalHeader) {
                noGoalHeader.getClass();
                this.value = noGoalHeader;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NoGoalHeader) && Intrinsics.areEqual(this.value, ((NoGoalHeader) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "NoGoalHeader(value=" + this.value + ")";
            }
        }

        /* loaded from: classes10.dex */
        public final class TransferButtons extends Element {
            public final squareup.cash.savings.bespoke_elements.TransferButtons value;

            public TransferButtons(squareup.cash.savings.bespoke_elements.TransferButtons transferButtons) {
                transferButtons.getClass();
                this.value = transferButtons;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TransferButtons) && Intrinsics.areEqual(this.value, ((TransferButtons) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TransferButtons(value=" + this.value + ")";
            }
        }

        public static final boolean isBackwardCompatible(CameraDevicesImpl cameraDevicesImpl, String str) {
            str.getClass();
            cameraDevicesImpl.getClass();
            if (Intrinsics.areEqual(Build.FINGERPRINT, "robolectric")) {
                if (!StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    return true;
                }
                Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
                return true;
            }
            try {
                CameraId.m45constructorimpl(str);
                CameraMetadata m93awaitCameraMetadataFpsL5FU$default = CameraDevicesImpl.m93awaitCameraMetadataFpsL5FU$default(cameraDevicesImpl, str);
                CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                key.getClass();
                int[] iArr = (int[]) ((Camera2CameraMetadata) m93awaitCameraMetadataFpsL5FU$default).get(key);
                if (iArr != null) {
                    return ArraysKt___ArraysKt.contains(iArr, 0);
                }
                return false;
            } catch (CameraAccessException e) {
                if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                    Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e);
                }
                throw new InitializationException(e);
            }
        }

        /* renamed from: whenEnabled-Iv8Zu3U, reason: not valid java name */
        public static final long m4395whenEnabledIv8Zu3U(long j, boolean z, Composer composer) {
            GapComposer gapComposer = (GapComposer) composer;
            if (z) {
                gapComposer.startReplaceGroup(652686837);
            } else {
                gapComposer.startReplaceGroup(652688217);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.disabled;
            }
            gapComposer.end(false);
            return j;
        }
    }

    static {
        SavingsElement$Companion$ADAPTER$1 savingsElement$Companion$ADAPTER$1 = new SavingsElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsElement.class), "type.googleapis.com/squareup.cash.savings.SavingsElement", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsElement.proto");
        ADAPTER = savingsElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsElement(Element element, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.element = element;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsElement)) {
            return false;
        }
        SavingsElement savingsElement = (SavingsElement) obj;
        return Intrinsics.areEqual(unknownFields(), savingsElement.unknownFields()) && Intrinsics.areEqual(this.element, savingsElement.element);
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
        EarningTool.Builder builder = new EarningTool.Builder(26);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsElement{", "}", 0, null, null, 56);
    }
}
