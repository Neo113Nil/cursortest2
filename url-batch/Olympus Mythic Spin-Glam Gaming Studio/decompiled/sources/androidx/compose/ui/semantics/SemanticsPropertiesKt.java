package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import com.ironsource.C4538a2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0019\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0003\u001a9\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u001a\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001b\u001a9\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 \u001a1\u0010!\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\u0004\b!\u0010\u0018\u001a3\u0010\"\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010\u0018\u001a3\u0010$\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b¢\u0006\u0004\b$\u0010\u0018\u001a?\u0010&\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010%¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b(\u0010\u001b\u001a-\u0010)\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b)\u0010\u001b\u001a-\u0010*\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b*\u0010\u001b\u001a-\u0010+\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b+\u0010\u001b\u001a-\u0010,\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b,\u0010\u001b\u001a-\u0010-\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b-\u0010\u001b\u001a-\u0010.\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019¢\u0006\u0004\b.\u0010\u001b\"/\u00105\u001a\u00020\u0007*\u00020\u00002\u0006\u0010/\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\n\"/\u0010<\u001a\u000206*\u00020\u00002\u0006\u0010/\u001a\u0002068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\"/\u0010@\u001a\u00020\u0007*\u00020\u00002\u0006\u0010/\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00101\u001a\u0004\b>\u00103\"\u0004\b?\u0010\n\"2\u0010G\u001a\u00020A*\u00020\u00002\u0006\u0010/\u001a\u00020A8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\"/\u0010M\u001a\u00020\u0015*\u00020\u00002\u0006\u0010/\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00101\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\"/\u0010T\u001a\u00020N*\u00020\u00002\u0006\u0010/\u001a\u00020N8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u00101\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S\"/\u0010X\u001a\u00020N*\u00020\u00002\u0006\u0010/\u001a\u00020N8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u00101\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010S\"2\u0010]\u001a\u00020Y*\u00020\u00002\u0006\u0010/\u001a\u00020Y8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bZ\u00101\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010F\"/\u0010a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010/\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u00101\u001a\u0004\b_\u00103\"\u0004\b`\u0010\n\"/\u0010g\u001a\u00020#*\u00020\u00002\u0006\u0010/\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u00101\u001a\u0004\bc\u0010d\"\u0004\be\u0010f\"2\u0010n\u001a\u00020h*\u00020\u00002\u0006\u0010/\u001a\u00020h8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bi\u00101\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m\"2\u0010s\u001a\u00020o*\u00020\u00002\u0006\u0010/\u001a\u00020o8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bp\u00101\u001a\u0004\bq\u0010D\"\u0004\br\u0010F\"/\u0010w\u001a\u00020\u0015*\u00020\u00002\u0006\u0010/\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bt\u00101\u001a\u0004\bu\u0010J\"\u0004\bv\u0010L\"/\u0010~\u001a\u00020x*\u00020\u00002\u0006\u0010/\u001a\u00020x8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u00101\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}\"5\u0010\u0085\u0001\u001a\u00020\u007f*\u00020\u00002\u0006\u0010/\u001a\u00020\u007f8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0080\u0001\u00101\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001\"7\u0010\u008c\u0001\u001a\u00030\u0086\u0001*\u00020\u00002\u0007\u0010/\u001a\u00030\u0086\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0087\u0001\u00101\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001\"E\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001*\u00020\u00002\u000e\u0010/\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u008f\u0001\u00101\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001\",\u0010\u0098\u0001\u001a\u00020\u0007*\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0096\u0001\u00103\"\u0005\b\u0097\u0001\u0010\n\"+\u0010\u009a\u0001\u001a\u00020#*\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020#8F@FX\u0086\u000e¢\u0006\r\u001a\u0005\b\u0099\u0001\u0010d\"\u0004\b$\u0010f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", C4538a2.e, "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "popup", "dialog", "password", "", "description", "error", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function1;)V", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "action", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onClick", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onLongClick", "Lkotlin/Function2;", "", "scrollBy", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "scrollToIndex", "setProgress", "Landroidx/compose/ui/text/AnnotatedString;", "setText", "Lkotlin/Function3;", "setSelection", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "copyText", "cutText", "pasteText", n.e, "collapse", "dismiss", "requestFocus", "<set-?>", "stateDescription$delegate", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getStateDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setStateDescription", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "progressBarRangeInfo$delegate", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "progressBarRangeInfo", "paneTitle$delegate", "getPaneTitle", "setPaneTitle", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "liveRegion$delegate", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "liveRegion", "focused$delegate", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "focused", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange$delegate", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "horizontalScrollAxisRange", "verticalScrollAxisRange$delegate", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "role$delegate", "getRole", "setRole-kuIjeqM", "role", "testTag$delegate", "getTestTag", "setTestTag", "testTag", "editableText$delegate", "getEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "setEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "editableText", "Landroidx/compose/ui/text/TextRange;", "textSelectionRange$delegate", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "textSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction$delegate", "getImeAction", "setImeAction-4L7nppU", "imeAction", "selected$delegate", "getSelected", "setSelected", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo$delegate", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "collectionItemInfo$delegate", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "toggleableState$delegate", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "toggleableState", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customActions$delegate", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "customActions", "value", "getContentDescription", "setContentDescription", "contentDescription", "getText", "text", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
    private static final SemanticsPropertyKey collectionInfo$delegate;
    private static final SemanticsPropertyKey collectionItemInfo$delegate;
    private static final SemanticsPropertyKey customActions$delegate;
    private static final SemanticsPropertyKey editableText$delegate;
    private static final SemanticsPropertyKey focused$delegate;
    private static final SemanticsPropertyKey horizontalScrollAxisRange$delegate;
    private static final SemanticsPropertyKey imeAction$delegate;
    private static final SemanticsPropertyKey liveRegion$delegate;
    private static final SemanticsPropertyKey paneTitle$delegate;
    private static final SemanticsPropertyKey progressBarRangeInfo$delegate;
    private static final SemanticsPropertyKey role$delegate;
    private static final SemanticsPropertyKey selected$delegate;
    private static final SemanticsPropertyKey stateDescription$delegate;
    private static final SemanticsPropertyKey testTag$delegate;
    private static final SemanticsPropertyKey textSelectionRange$delegate;
    private static final SemanticsPropertyKey toggleableState$delegate;
    private static final SemanticsPropertyKey verticalScrollAxisRange$delegate;

    public static final void setContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String value) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), CollectionsKt.listOf(value));
    }

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        stateDescription$delegate = semanticsProperties.getStateDescription();
        progressBarRangeInfo$delegate = semanticsProperties.getProgressBarRangeInfo();
        paneTitle$delegate = semanticsProperties.getPaneTitle();
        liveRegion$delegate = semanticsProperties.getLiveRegion();
        focused$delegate = semanticsProperties.getFocused();
        horizontalScrollAxisRange$delegate = semanticsProperties.getHorizontalScrollAxisRange();
        verticalScrollAxisRange$delegate = semanticsProperties.getVerticalScrollAxisRange();
        role$delegate = semanticsProperties.getRole();
        testTag$delegate = semanticsProperties.getTestTag();
        editableText$delegate = semanticsProperties.getEditableText();
        textSelectionRange$delegate = semanticsProperties.getTextSelectionRange();
        imeAction$delegate = semanticsProperties.getImeAction();
        selected$delegate = semanticsProperties.getSelected();
        collectionInfo$delegate = semanticsProperties.getCollectionInfo();
        collectionItemInfo$delegate = semanticsProperties.getCollectionItemInfo();
        toggleableState$delegate = semanticsProperties.getToggleableState();
        customActions$delegate = SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final void setProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(progressBarRangeInfo, "<set-?>");
        progressBarRangeInfo$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    public static final void setPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        paneTitle$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void disabled(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.INSTANCE);
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m2175setLiveRegionhR3wRGc(SemanticsPropertyReceiver liveRegion, int i) {
        Intrinsics.checkNotNullParameter(liveRegion, "$this$liveRegion");
        liveRegion$delegate.setValue(liveRegion, $$delegatedProperties[3], LiveRegionMode.m2148boximpl(i));
    }

    public static final void setFocused(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        focused$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public static final void setHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange, "<set-?>");
        horizontalScrollAxisRange$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[5], scrollAxisRange);
    }

    public static final void setVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange, "<set-?>");
        verticalScrollAxisRange$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[6], scrollAxisRange);
    }

    public static final void popup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.INSTANCE);
    }

    public static final void dialog(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.INSTANCE);
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m2176setRolekuIjeqM(SemanticsPropertyReceiver role, int i) {
        Intrinsics.checkNotNullParameter(role, "$this$role");
        role$delegate.setValue(role, $$delegatedProperties[7], Role.m2157boximpl(i));
    }

    public static final void setTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        testTag$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[8], str);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString value) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), CollectionsKt.listOf(value));
    }

    public static final void setEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        editableText$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[9], annotatedString);
    }

    /* renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m2177setTextSelectionRangeFDrldGo(SemanticsPropertyReceiver textSelectionRange, long j) {
        Intrinsics.checkNotNullParameter(textSelectionRange, "$this$textSelectionRange");
        textSelectionRange$delegate.setValue(textSelectionRange, $$delegatedProperties[10], TextRange.m2237boximpl(j));
    }

    /* renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m2174setImeAction4L7nppU(SemanticsPropertyReceiver imeAction, int i) {
        Intrinsics.checkNotNullParameter(imeAction, "$this$imeAction");
        imeAction$delegate.setValue(imeAction, $$delegatedProperties[11], ImeAction.m2336boximpl(i));
    }

    public static final void setSelected(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        selected$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[12], Boolean.valueOf(z));
    }

    public static final void setCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionInfo collectionInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(collectionInfo, "<set-?>");
        collectionInfo$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[13], collectionInfo);
    }

    public static final void setToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver, ToggleableState toggleableState) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(toggleableState, "<set-?>");
        toggleableState$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[15], toggleableState);
    }

    public static final void password(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), Unit.INSTANCE);
    }

    public static final void error(SemanticsPropertyReceiver semanticsPropertyReceiver, String description) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), description);
    }

    public static final void indexForKey(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 mapping) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), mapping);
    }

    public static final void selectableGroup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.INSTANCE);
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, function1);
    }

    public static final void getTextLayoutResult(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onLongClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, function2);
    }

    public static final void scrollBy(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, function1);
    }

    public static final void scrollToIndex(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 action) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, action));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, function1);
    }

    public static final void setProgress(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, function1);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, function3);
    }

    public static final void setSelection(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, function0);
    }

    public static final void copyText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, function0);
    }

    public static final void cutText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, function0);
    }

    public static final void pasteText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, function0);
    }

    public static final void expand(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, function0);
    }

    public static final void collapse(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, function0);
    }

    public static final void dismiss(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, function0);
    }

    public static final void requestFocus(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, function0));
    }
}
