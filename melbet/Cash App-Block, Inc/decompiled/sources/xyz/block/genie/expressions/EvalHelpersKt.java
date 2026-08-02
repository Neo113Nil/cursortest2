package xyz.block.genie.expressions;

import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.google.android.gms.internal.mlkit_vision_common.zzju;
import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.AlignmentResolverKt$WhenMappings;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$InAppNotificationMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageFormat$Message$TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage$VisualAsset$Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage$VisualAsset$Video;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage$VisualAsset$Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage$VisualAsset$AssetUrl;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage$VisualAsset$Avatar;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage$VisualAsset$Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message$VisualAsset$Avatar;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage$VisualAsset$Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Result;
import xyz.block.genie.expressions.ExpressionError;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public abstract class EvalHelpersKt {
    public static final void ComposeBoxView(ComposePlatform.Box box, Modifier modifier, Composer composer, int i) {
        int i2;
        box.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1998099223);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(box) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            Expression expression = box.content_alignment;
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            expressionEvaluator.getClass();
            genieViewState.getClass();
            ComposePlatform.Alignment alignment = (ComposePlatform.Alignment) ContextKt.resolveProtoEnum(expression, expressionEvaluator, genieViewState, new EnumListAdapter$encode$1(1, ComposePlatform.Alignment.Companion, ComposePlatform.Alignment.Companion.class, "fromValue", "fromValue(I)Lcom/squareup/cash/moneybot/genie/protos/ComposePlatform$Alignment;", 0, 24));
            switch (alignment == null ? -1 : AlignmentResolverKt$WhenMappings.$EnumSwitchMapping$2[alignment.ordinal()]) {
                case 1:
                    biasAlignment = Alignment.Companion.Center;
                    break;
                case 3:
                    biasAlignment = Alignment.Companion.TopEnd;
                    break;
                case 4:
                    biasAlignment = Alignment.Companion.BottomStart;
                    break;
                case 5:
                    biasAlignment = Alignment.Companion.BottomEnd;
                    break;
                case 6:
                case 7:
                    biasAlignment = Alignment.Companion.TopCenter;
                    break;
                case 8:
                case 9:
                    biasAlignment = Alignment.Companion.BottomCenter;
                    break;
                case 10:
                case 11:
                    biasAlignment = Alignment.Companion.CenterStart;
                    break;
                case 12:
                case 13:
                    biasAlignment = Alignment.Companion.CenterEnd;
                    break;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(2048310134);
            Iterator it = box.children.iterator();
            while (it.hasNext()) {
                MatrixExt.GenieNodeView((Node) it.next(), Modifier.Companion.$$INSTANCE, gapComposer, 48);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(box, modifier, i, 8);
        }
    }

    public static final Animation access$getAnimation(zzju zzjuVar) {
        InlineMessage$VisualAsset$Animation inlineMessage$VisualAsset$Animation = zzjuVar instanceof InlineMessage$VisualAsset$Animation ? (InlineMessage$VisualAsset$Animation) zzjuVar : null;
        if (inlineMessage$VisualAsset$Animation != null) {
            return inlineMessage$VisualAsset$Animation.value;
        }
        return null;
    }

    public static final String access$getAsset_url(ActionEvent.Usr.Companion companion) {
        InAppNotificationMessage$VisualAsset$AssetUrl inAppNotificationMessage$VisualAsset$AssetUrl = companion instanceof InAppNotificationMessage$VisualAsset$AssetUrl ? (InAppNotificationMessage$VisualAsset$AssetUrl) companion : null;
        if (inAppNotificationMessage$VisualAsset$AssetUrl != null) {
            return inAppNotificationMessage$VisualAsset$AssetUrl.value;
        }
        return null;
    }

    public static final Image access$getAvatar(ActionEvent.Usr.Companion companion) {
        InAppNotificationMessage$VisualAsset$Avatar inAppNotificationMessage$VisualAsset$Avatar = companion instanceof InAppNotificationMessage$VisualAsset$Avatar ? (InAppNotificationMessage$VisualAsset$Avatar) companion : null;
        if (inAppNotificationMessage$VisualAsset$Avatar != null) {
            return inAppNotificationMessage$VisualAsset$Avatar.value;
        }
        return null;
    }

    public static final CardMessage access$getCard_message(zzjo zzjoVar) {
        AppMessageFormat$Message$CardMessage appMessageFormat$Message$CardMessage = zzjoVar instanceof AppMessageFormat$Message$CardMessage ? (AppMessageFormat$Message$CardMessage) zzjoVar : null;
        if (appMessageFormat$Message$CardMessage != null) {
            return appMessageFormat$Message$CardMessage.value;
        }
        return null;
    }

    public static final FullScreenMessage access$getFull_screen_message(zzjo zzjoVar) {
        AppMessageFormat$Message$FullScreenMessage appMessageFormat$Message$FullScreenMessage = zzjoVar instanceof AppMessageFormat$Message$FullScreenMessage ? (AppMessageFormat$Message$FullScreenMessage) zzjoVar : null;
        if (appMessageFormat$Message$FullScreenMessage != null) {
            return appMessageFormat$Message$FullScreenMessage.value;
        }
        return null;
    }

    public static final HalfSheetMessage access$getHalf_sheet_message(zzjo zzjoVar) {
        AppMessageFormat$Message$HalfSheetMessage appMessageFormat$Message$HalfSheetMessage = zzjoVar instanceof AppMessageFormat$Message$HalfSheetMessage ? (AppMessageFormat$Message$HalfSheetMessage) zzjoVar : null;
        if (appMessageFormat$Message$HalfSheetMessage != null) {
            return appMessageFormat$Message$HalfSheetMessage.value;
        }
        return null;
    }

    public static final Image access$getImage(zzju zzjuVar) {
        InlineMessage$VisualAsset$Image inlineMessage$VisualAsset$Image = zzjuVar instanceof InlineMessage$VisualAsset$Image ? (InlineMessage$VisualAsset$Image) zzjuVar : null;
        if (inlineMessage$VisualAsset$Image != null) {
            return inlineMessage$VisualAsset$Image.value;
        }
        return null;
    }

    public static final InAppNotificationMessage access$getIn_app_notification_message(zzjo zzjoVar) {
        AppMessageFormat$Message$InAppNotificationMessage appMessageFormat$Message$InAppNotificationMessage = zzjoVar instanceof AppMessageFormat$Message$InAppNotificationMessage ? (AppMessageFormat$Message$InAppNotificationMessage) zzjoVar : null;
        if (appMessageFormat$Message$InAppNotificationMessage != null) {
            return appMessageFormat$Message$InAppNotificationMessage.value;
        }
        return null;
    }

    public static final InlineMessage access$getInline_message(zzjo zzjoVar) {
        AppMessageFormat$Message$InlineMessage appMessageFormat$Message$InlineMessage = zzjoVar instanceof AppMessageFormat$Message$InlineMessage ? (AppMessageFormat$Message$InlineMessage) zzjoVar : null;
        if (appMessageFormat$Message$InlineMessage != null) {
            return appMessageFormat$Message$InlineMessage.value;
        }
        return null;
    }

    public static final InlineV2Message access$getInline_v2_message(zzjo zzjoVar) {
        AppMessageFormat$Message$InlineV2Message appMessageFormat$Message$InlineV2Message = zzjoVar instanceof AppMessageFormat$Message$InlineV2Message ? (AppMessageFormat$Message$InlineV2Message) zzjoVar : null;
        if (appMessageFormat$Message$InlineV2Message != null) {
            return appMessageFormat$Message$InlineV2Message.value;
        }
        return null;
    }

    public static final PopupMessage access$getPopup_message(zzjo zzjoVar) {
        AppMessageFormat$Message$PopupMessage appMessageFormat$Message$PopupMessage = zzjoVar instanceof AppMessageFormat$Message$PopupMessage ? (AppMessageFormat$Message$PopupMessage) zzjoVar : null;
        if (appMessageFormat$Message$PopupMessage != null) {
            return appMessageFormat$Message$PopupMessage.value;
        }
        return null;
    }

    public static final TooltipMessage access$getTooltip_message(zzjo zzjoVar) {
        AppMessageFormat$Message$TooltipMessage appMessageFormat$Message$TooltipMessage = zzjoVar instanceof AppMessageFormat$Message$TooltipMessage ? (AppMessageFormat$Message$TooltipMessage) zzjoVar : null;
        if (appMessageFormat$Message$TooltipMessage != null) {
            return appMessageFormat$Message$TooltipMessage.value;
        }
        return null;
    }

    public static final Video access$getVideo(FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video) {
        if (fullScreenMessage$VisualAsset$Video == null) {
            fullScreenMessage$VisualAsset$Video = null;
        }
        if (fullScreenMessage$VisualAsset$Video != null) {
            return fullScreenMessage$VisualAsset$Video.value;
        }
        return null;
    }

    public static Uri copyFileToFile(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static File createTempFile(UseCaseGroup useCaseGroup) {
        try {
            File file = (File) useCaseGroup.mUseCases;
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder("CameraX");
            sb.append(UUID.randomUUID().toString());
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            sb.append(lastIndexOf >= 0 ? name.substring(lastIndexOf) : "");
            return new File(parent, sb.toString());
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.Result$Failure] */
    public static final boolean evalBool(ExpressionEvaluator expressionEvaluator, Expression expression, GenieViewState genieViewState, boolean z) {
        Boolean failure;
        GenieStateValue evaluate;
        expressionEvaluator.getClass();
        genieViewState.getClass();
        if (expression != null) {
            try {
                Result.Companion companion = Result.Companion;
                evaluate = expressionEvaluator.evaluate(expression, genieViewState);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (!(evaluate instanceof GenieStateValue.BoolValue)) {
                throw new ExpressionError.TypeMismatch("bool", evaluate);
            }
            failure = Boolean.valueOf(((GenieStateValue.BoolValue) evaluate).value);
            r0 = failure instanceof Result.Failure ? null : failure;
        }
        return r0 != null ? r0.booleanValue() : z;
    }

    public static final Double evalDouble(ExpressionEvaluator expressionEvaluator, GenieViewState genieViewState, Expression expression) {
        Object failure;
        expressionEvaluator.getClass();
        genieViewState.getClass();
        if (expression == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = Double.valueOf(expressionEvaluator.evaluate(expression, genieViewState).numericValue());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (Double) (failure instanceof Result.Failure ? null : failure);
    }

    public static final String evalString(ExpressionEvaluator expressionEvaluator, GenieViewState genieViewState, Expression expression) {
        Object failure;
        GenieStateValue evaluate;
        expressionEvaluator.getClass();
        genieViewState.getClass();
        if (expression == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            evaluate = expressionEvaluator.evaluate(expression, genieViewState);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (!(evaluate instanceof GenieStateValue.StringValue)) {
            throw new ExpressionError.TypeMismatch(InquiryField.StringField.TYPE, evaluate);
        }
        failure = ((GenieStateValue.StringValue) evaluate).value;
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    public static void moveFileToTarget(File file, UseCaseGroup useCaseGroup) {
        try {
            try {
                useCaseGroup.getClass();
                copyFileToFile(file, (File) useCaseGroup.mUseCases);
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    public static final Animation access$getAnimation(ActionEvent.Os.Companion companion) {
        CardMessage$VisualAsset$Animation cardMessage$VisualAsset$Animation = companion instanceof CardMessage$VisualAsset$Animation ? (CardMessage$VisualAsset$Animation) companion : null;
        if (cardMessage$VisualAsset$Animation != null) {
            return cardMessage$VisualAsset$Animation.value;
        }
        return null;
    }

    public static final UiAvatar access$getAvatar(InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar) {
        if (inlineV2Message$VisualAsset$Avatar == null) {
            inlineV2Message$VisualAsset$Avatar = null;
        }
        if (inlineV2Message$VisualAsset$Avatar != null) {
            return inlineV2Message$VisualAsset$Avatar.value;
        }
        return null;
    }

    public static final Image access$getImage(ActionEvent.Os.Companion companion) {
        CardMessage$VisualAsset$Image cardMessage$VisualAsset$Image = companion instanceof CardMessage$VisualAsset$Image ? (CardMessage$VisualAsset$Image) companion : null;
        if (cardMessage$VisualAsset$Image != null) {
            return cardMessage$VisualAsset$Image.value;
        }
        return null;
    }

    public static final Animation access$getAnimation(zzjv zzjvVar) {
        PopupMessage$VisualAsset$Animation popupMessage$VisualAsset$Animation = zzjvVar instanceof PopupMessage$VisualAsset$Animation ? (PopupMessage$VisualAsset$Animation) zzjvVar : null;
        if (popupMessage$VisualAsset$Animation != null) {
            return popupMessage$VisualAsset$Animation.value;
        }
        return null;
    }

    public static final Image access$getImage(zzjv zzjvVar) {
        PopupMessage$VisualAsset$Image popupMessage$VisualAsset$Image = zzjvVar instanceof PopupMessage$VisualAsset$Image ? (PopupMessage$VisualAsset$Image) zzjvVar : null;
        if (popupMessage$VisualAsset$Image != null) {
            return popupMessage$VisualAsset$Image.value;
        }
        return null;
    }

    public static final Animation access$getAnimation(ActionEvent.Usr.Companion companion) {
        InAppNotificationMessage$VisualAsset$Animation inAppNotificationMessage$VisualAsset$Animation = companion instanceof InAppNotificationMessage$VisualAsset$Animation ? (InAppNotificationMessage$VisualAsset$Animation) companion : null;
        if (inAppNotificationMessage$VisualAsset$Animation != null) {
            return inAppNotificationMessage$VisualAsset$Animation.value;
        }
        return null;
    }

    public static final Image access$getImage(ActionEvent.Usr.Companion companion) {
        InAppNotificationMessage$VisualAsset$Image inAppNotificationMessage$VisualAsset$Image = companion instanceof InAppNotificationMessage$VisualAsset$Image ? (InAppNotificationMessage$VisualAsset$Image) companion : null;
        if (inAppNotificationMessage$VisualAsset$Image != null) {
            return inAppNotificationMessage$VisualAsset$Image.value;
        }
        return null;
    }

    public static final double evalDouble(ExpressionEvaluator expressionEvaluator, Expression expression, GenieViewState genieViewState, double d) {
        expressionEvaluator.getClass();
        genieViewState.getClass();
        Double evalDouble = evalDouble(expressionEvaluator, genieViewState, expression);
        return evalDouble != null ? evalDouble.doubleValue() : d;
    }

    public static final String evalString(ExpressionEvaluator expressionEvaluator, Expression expression, GenieViewState genieViewState, String str) {
        expressionEvaluator.getClass();
        genieViewState.getClass();
        str.getClass();
        String evalString = evalString(expressionEvaluator, genieViewState, expression);
        return evalString == null ? str : evalString;
    }
}
