package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\nR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b$\u0010\nR&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\nR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b*\u0010\nR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b,\u0010\nR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\nR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b0\u0010\nR \u00102\u001a\b\u0012\u0004\u0012\u0002010\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b3\u0010\nR\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\b\u001a\u0004\b5\u0010\nR#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b8\u0010\nR\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b:\u0010\nR \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b=\u0010\nR \u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b@\u0010\nR\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\b\u001a\u0004\bB\u0010\nR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bE\u0010\nR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\bG\u0010\nR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\b\u001a\u0004\bI\u0010\nR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020K0J0\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\bM\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "ContentDescription", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "StateDescription", "getStateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ProgressBarRangeInfo", "getProgressBarRangeInfo", "PaneTitle", "getPaneTitle", "", "SelectableGroup", "getSelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "CollectionInfo", "getCollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "CollectionItemInfo", "getCollectionItemInfo", "Heading", "getHeading", "Disabled", "getDisabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "LiveRegion", "getLiveRegion", "", "Focused", "getFocused", "InvisibleToUser", "getInvisibleToUser", "getInvisibleToUser$annotations", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "HorizontalScrollAxisRange", "getHorizontalScrollAxisRange", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "IsPopup", "getIsPopup", "IsDialog", "getIsDialog", "Landroidx/compose/ui/semantics/Role;", "Role", "getRole", "TestTag", "getTestTag", "Landroidx/compose/ui/text/AnnotatedString;", "Text", "getText", "EditableText", "getEditableText", "Landroidx/compose/ui/text/TextRange;", "TextSelectionRange", "getTextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "ImeAction", "getImeAction", "Selected", "getSelected", "Landroidx/compose/ui/state/ToggleableState;", "ToggleableState", "getToggleableState", "Password", "getPassword", "Error", "getError", "Lkotlin/Function1;", "", "IndexForKey", "getIndexForKey", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey ContentDescription = new SemanticsPropertyKey("ContentDescription", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final List<String> invoke(@Nullable List<String> list, @NotNull List<String> childValue) {
            List<String> mutableList;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return childValue;
            }
            mutableList.addAll(childValue);
            return mutableList;
        }
    });
    private static final SemanticsPropertyKey StateDescription = new SemanticsPropertyKey("StateDescription", null, 2, null);
    private static final SemanticsPropertyKey ProgressBarRangeInfo = new SemanticsPropertyKey("ProgressBarRangeInfo", null, 2, null);
    private static final SemanticsPropertyKey PaneTitle = new SemanticsPropertyKey("PaneTitle", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final String invoke(@Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    private static final SemanticsPropertyKey SelectableGroup = new SemanticsPropertyKey("SelectableGroup", null, 2, null);
    private static final SemanticsPropertyKey CollectionInfo = new SemanticsPropertyKey("CollectionInfo", null, 2, null);
    private static final SemanticsPropertyKey CollectionItemInfo = new SemanticsPropertyKey("CollectionItemInfo", null, 2, null);
    private static final SemanticsPropertyKey Heading = new SemanticsPropertyKey("Heading", null, 2, null);
    private static final SemanticsPropertyKey Disabled = new SemanticsPropertyKey("Disabled", null, 2, null);
    private static final SemanticsPropertyKey LiveRegion = new SemanticsPropertyKey("LiveRegion", null, 2, null);
    private static final SemanticsPropertyKey Focused = new SemanticsPropertyKey("Focused", null, 2, null);
    private static final SemanticsPropertyKey InvisibleToUser = new SemanticsPropertyKey("InvisibleToUser", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Unit invoke(@Nullable Unit unit, @NotNull Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            return unit;
        }
    });
    private static final SemanticsPropertyKey HorizontalScrollAxisRange = new SemanticsPropertyKey("HorizontalScrollAxisRange", null, 2, null);
    private static final SemanticsPropertyKey VerticalScrollAxisRange = new SemanticsPropertyKey("VerticalScrollAxisRange", null, 2, null);
    private static final SemanticsPropertyKey IsPopup = new SemanticsPropertyKey("IsPopup", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Unit invoke(@Nullable Unit unit, @NotNull Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey IsDialog = new SemanticsPropertyKey("IsDialog", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Unit invoke(@Nullable Unit unit, @NotNull Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey Role = new SemanticsPropertyKey("Role", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Nullable
        /* renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final Role m2173invokeqtAw6s(@Nullable Role role, int i) {
            return role;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2173invokeqtAw6s((Role) obj, ((Role) obj2).getValue());
        }
    });
    private static final SemanticsPropertyKey TestTag = new SemanticsPropertyKey("TestTag", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final String invoke(@Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str;
        }
    });
    private static final SemanticsPropertyKey Text = new SemanticsPropertyKey("Text", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final List<AnnotatedString> invoke(@Nullable List<AnnotatedString> list, @NotNull List<AnnotatedString> childValue) {
            List<AnnotatedString> mutableList;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return childValue;
            }
            mutableList.addAll(childValue);
            return mutableList;
        }
    });
    private static final SemanticsPropertyKey EditableText = new SemanticsPropertyKey("EditableText", null, 2, null);
    private static final SemanticsPropertyKey TextSelectionRange = new SemanticsPropertyKey("TextSelectionRange", null, 2, null);
    private static final SemanticsPropertyKey ImeAction = new SemanticsPropertyKey("ImeAction", null, 2, null);
    private static final SemanticsPropertyKey Selected = new SemanticsPropertyKey("Selected", null, 2, null);
    private static final SemanticsPropertyKey ToggleableState = new SemanticsPropertyKey("ToggleableState", null, 2, null);
    private static final SemanticsPropertyKey Password = new SemanticsPropertyKey("Password", null, 2, null);
    private static final SemanticsPropertyKey Error = new SemanticsPropertyKey("Error", null, 2, null);
    private static final SemanticsPropertyKey IndexForKey = new SemanticsPropertyKey("IndexForKey", null, 2, null);

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey getRole() {
        return Role;
    }

    public final SemanticsPropertyKey getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey getText() {
        return Text;
    }

    public final SemanticsPropertyKey getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey getError() {
        return Error;
    }

    public final SemanticsPropertyKey getIndexForKey() {
        return IndexForKey;
    }
}
