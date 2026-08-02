package org.intellij.markdown.ast;

import android.os.Handler;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes5.dex */
public abstract class ASTUtilKt {
    public static volatile Handler sHandler;

    public static final void InviteContactItem(Modifier modifier, Function1 function1, String str, final InviteContactsViewModel.Contact contact, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        function1.getClass();
        contact.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1456830641);
        int i2 = i | 6 | (gapComposer2.changed(str) ? 256 : 128) | (gapComposer2.changed(contact) ? 2048 : 1024);
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = contact.status == InviteContactsViewModel.Contact.Status.NOT_INVITED;
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(847883728, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 7), gapComposer2), 15);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(25114973, new Function2() { // from class: com.squareup.cash.invitations.components.InviteContactItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    InviteContactsViewModel.Contact contact2 = contact;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String displayName = contact2.getDisplayName();
                                if (displayName == null) {
                                    displayName = "";
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, displayName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contact2.description, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            r7 = (i2 & 7168) == 2048 ? 1 : 0;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (r7 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(22, function1, contact);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1326987881, new Function2() { // from class: com.squareup.cash.invitations.components.InviteContactItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    InviteContactsViewModel.Contact contact2 = contact;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String displayName = contact2.getDisplayName();
                                if (displayName == null) {
                                    displayName = "";
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, displayName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contact2.description, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, companion, (Function0) rememberedValue, z, true, rememberComposableLambda2, null, 0L, buttonCompact, null, gapComposer, 1769526, 1416);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(modifier2, function1, str, contact, i, 18);
        }
    }

    public static final void PatternStamps(Modifier modifier, int i, int i2, PatternStampState patternStampState, StampMovingListener stampMovingListener, Composer composer, int i3) {
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        Object obj;
        PatternStampState patternStampState2 = patternStampState;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = patternStampState2.strokeWidth$delegate;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-71709269);
        int i4 = i3 | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128) | (gapComposer.changedInstance(patternStampState2) ? 2048 : 1024) | (gapComposer.changed(stampMovingListener) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(i, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(i2, gapComposer);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            boolean changedInstance = ((i4 & 896) == 256) | gapComposer.changedInstance(patternStampState2) | ((i4 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$5 = new GovernmentIdFeed$analyze$5(patternStampState2, i, i2, mutableFloatState, mutableFloatState2, (Continuation) null);
                patternStampState2 = patternStampState2;
                gapComposer.updateRememberedValue(governmentIdFeed$analyze$5);
                rememberedValue3 = governmentIdFeed$analyze$5;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            Updater.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue3, gapComposer);
            Object rememberedValue4 = gapComposer.rememberedValue();
            Object obj2 = rememberedValue4;
            if (rememberedValue4 == neverEqualPolicy) {
                AndroidPaint Paint = ColorKt.Paint();
                Paint.setAntiAlias();
                Paint.m663setStylek9PVt8s(1);
                Paint.m662setStrokeJoinWw9F2mQ(1);
                Paint.m661setStrokeCapBeK7IIE(1);
                Paint.m659setColor8_81llA(((Color) patternStampState2.strokeColor$delegate.getValue()).value);
                Paint.setStrokeWidth(((Number) parcelableSnapshotMutableState.getValue()).floatValue());
                gapComposer.updateRememberedValue(Paint);
                obj2 = Paint;
            }
            Paint paint = (Paint) obj2;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                AndroidPaint Paint2 = ColorKt.Paint();
                Paint2.setAntiAlias();
                z = true;
                Paint2.m663setStylek9PVt8s(1);
                Paint2.m662setStrokeJoinWw9F2mQ(1);
                Paint2.m661setStrokeCapBeK7IIE(1);
                Paint2.m659setColor8_81llA(((Color) patternStampState2.offClipStrokeColor$delegate.getValue()).value);
                Paint2.setStrokeWidth(((Number) parcelableSnapshotMutableState.getValue()).floatValue());
                gapComposer.updateRememberedValue(Paint2);
                obj = Paint2;
            } else {
                z = true;
                obj = rememberedValue5;
            }
            Paint paint2 = (Paint) obj;
            boolean changedInstance2 = gapComposer.changedInstance(patternStampState2) | gapComposer.changed(density);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new CombinedModifier$$ExternalSyntheticLambda0(12, patternStampState2, density);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Modifier onPlaced = RulerKt.onPlaced(modifier, (Function1) rememberedValue6);
            if (((Boolean) patternStampState2.isEnabled$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-1689148175);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer.changedInstance(patternStampState2) | ((57344 & i4) != 16384 ? false : z);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new LocalViewFactory$createUi$view$3$1$1$1(3, patternStampState2, stampMovingListener);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                onPlaced = SuspendingPointerInputFilterKt.pointerInput(onPlaced, unit, (PointerInputEventHandler) rememberedValue7);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1688373609);
                gapComposer.end(false);
            }
            boolean changedInstance4 = gapComposer.changedInstance(patternStampState2) | gapComposer.changedInstance(paint2) | gapComposer.changedInstance(paint);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new UtilsKt$$ExternalSyntheticLambda0(11, patternStampState2, paint2, paint);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            CanvasKt.Canvas(0, gapComposer, onPlaced, (Function1) rememberedValue8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier, i, i2, patternStampState2, stampMovingListener, i3, 8);
        }
    }

    public static final ASTNodeImpl findChildOfType(ASTNodeImpl aSTNodeImpl, MarkdownElementType markdownElementType) {
        Object obj;
        aSTNodeImpl.getClass();
        markdownElementType.getClass();
        Iterator it = aSTNodeImpl.getChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type, markdownElementType)) {
                break;
            }
        }
        return (ASTNodeImpl) obj;
    }

    public static final CharSequence getTextInNode(ASTNodeImpl aSTNodeImpl, CharSequence charSequence) {
        aSTNodeImpl.getClass();
        charSequence.getClass();
        return charSequence.subSequence(aSTNodeImpl.startOffset, aSTNodeImpl.endOffset);
    }

    public static String resultCodeToString(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }
}
