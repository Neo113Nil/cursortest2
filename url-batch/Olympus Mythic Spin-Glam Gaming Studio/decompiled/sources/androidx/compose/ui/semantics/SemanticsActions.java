package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR5\u0010\u0015\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00130\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR/\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR/\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR;\u0010\u001d\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001c0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR)\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR)\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR)\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR)\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR)\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR)\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\rR#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\r¨\u00064"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "GetTextLayoutResult", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "Lkotlin/Function2;", "", "ScrollBy", "getScrollBy", "", "ScrollToIndex", "getScrollToIndex", "SetProgress", "getSetProgress", "Lkotlin/Function3;", "SetSelection", "getSetSelection", "Landroidx/compose/ui/text/AnnotatedString;", "SetText", "getSetText", "CopyText", "getCopyText", "CutText", "getCutText", "PasteText", "getPasteText", "Expand", "getExpand", "Collapse", "getCollapse", "Dismiss", "getDismiss", "RequestFocus", "getRequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "getCustomActions", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SemanticsActions {
    private static final SemanticsPropertyKey Collapse;
    private static final SemanticsPropertyKey CopyText;
    private static final SemanticsPropertyKey CustomActions;
    private static final SemanticsPropertyKey CutText;
    private static final SemanticsPropertyKey Dismiss;
    private static final SemanticsPropertyKey Expand;
    private static final SemanticsPropertyKey GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey OnClick;
    private static final SemanticsPropertyKey OnLongClick;
    private static final SemanticsPropertyKey PasteText;
    private static final SemanticsPropertyKey RequestFocus;
    private static final SemanticsPropertyKey ScrollBy;
    private static final SemanticsPropertyKey ScrollToIndex;
    private static final SemanticsPropertyKey SetProgress;
    private static final SemanticsPropertyKey SetSelection;
    private static final SemanticsPropertyKey SetText;

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey getCustomActions() {
        return CustomActions;
    }

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new Function2() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final AccessibilityAction<Function> invoke(@Nullable AccessibilityAction<Function> accessibilityAction, @NotNull AccessibilityAction<Function> childValue) {
                String label;
                Function action;
                Intrinsics.checkNotNullParameter(childValue, "childValue");
                if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                    label = childValue.getLabel();
                }
                if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                    action = childValue.getAction();
                }
                return new AccessibilityAction<>(label, action);
            }
        };
        GetTextLayoutResult = new SemanticsPropertyKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = new SemanticsPropertyKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = new SemanticsPropertyKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = new SemanticsPropertyKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = new SemanticsPropertyKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = new SemanticsPropertyKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = new SemanticsPropertyKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = new SemanticsPropertyKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = new SemanticsPropertyKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = new SemanticsPropertyKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = new SemanticsPropertyKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = new SemanticsPropertyKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = new SemanticsPropertyKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = new SemanticsPropertyKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = new SemanticsPropertyKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = new SemanticsPropertyKey("CustomActions", null, 2, null);
    }
}
