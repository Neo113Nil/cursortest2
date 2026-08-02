package radiography;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.room.TransactorKt;
import com.squareup.moshi.LinkedHashTreeMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import radiography.ScannableView;
import radiography.internal.ComposeViewsKt;
import radiography.internal.SemanticsPropertiesHelpers;

/* loaded from: classes10.dex */
public abstract class ViewStateRenderers {
    public static final ViewStateRenderers$$ExternalSyntheticLambda6 AndroidViewRenderer;
    public static final ViewStateRenderer ComposeViewRenderer;
    public static final List DefaultsIncludingPii;
    public static final List DefaultsNoPii;
    public static final ViewStateRenderers$$ExternalSyntheticLambda0 NoRenderer;

    /* JADX WARN: Type inference failed for: r0v0, types: [radiography.ViewStateRenderers$$ExternalSyntheticLambda0] */
    static {
        final int i = 0;
        ?? r0 = new ViewStateRenderer() { // from class: radiography.ViewStateRenderers$$ExternalSyntheticLambda0
            @Override // radiography.ViewStateRenderer
            public final void render(AttributeAppendable attributeAppendable, ScannableView scannableView) {
                SemanticsPropertyKey semanticsPropertyKey;
                switch (i) {
                    case 0:
                        scannableView.getClass();
                        break;
                    case 1:
                        ViewStateRenderers$$ExternalSyntheticLambda0 viewStateRenderers$$ExternalSyntheticLambda0 = ViewStateRenderers.NoRenderer;
                        scannableView.getClass();
                        ScannableView.ComposeView composeView = scannableView instanceof ScannableView.ComposeView ? (ScannableView.ComposeView) scannableView : null;
                        if (composeView != null) {
                            int i2 = composeView.height;
                            int i3 = composeView.width;
                            if (i3 != 0 || i2 != 0) {
                                attributeAppendable.append(i3 + (char) 215 + i2 + "px");
                            }
                            for (Map.Entry entry : CollectionsKt.sortedWith(CollectionsKt__IterablesKt.flatten(composeView.getSemanticsConfigurations()), new LinkedHashTreeMap.AnonymousClass1(25))) {
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) entry.getKey();
                                Object value = entry.getValue();
                                if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.TestTag)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "test-tag", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ContentDescription)) {
                                    value.getClass();
                                    List list = (List) value;
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add("\"" + it.next() + '\"');
                                    }
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "content-description", arrayList);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.StateDescription)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "state-description", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Disabled)) {
                                    attributeAppendable.append("DISABLED");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Focused)) {
                                    if (Intrinsics.areEqual(value, Boolean.TRUE)) {
                                        attributeAppendable.append("FOCUSED");
                                    }
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.IsDialog)) {
                                    attributeAppendable.append("DIALOG");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.IsPopup)) {
                                    attributeAppendable.append("POPUP");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ProgressBarRangeInfo)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "progress-bar-range", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.PaneTitle)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "pane-title", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.SelectableGroup)) {
                                    attributeAppendable.append("SELECTABLE-GROUP");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Heading)) {
                                    attributeAppendable.append("HEADING");
                                } else {
                                    if (!Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.InvisibleToUser)) {
                                        if (SemanticsPropertiesHelpers._HideFromAccessibility == SemanticsPropertiesHelpers.UNINITIALIZED.INSTANCE) {
                                            try {
                                                semanticsPropertyKey = SemanticsProperties.HideFromAccessibility;
                                            } catch (NoSuchMethodError unused) {
                                                semanticsPropertyKey = null;
                                            }
                                            SemanticsPropertiesHelpers._HideFromAccessibility = semanticsPropertyKey;
                                        }
                                        if (!Intrinsics.areEqual(semanticsPropertyKey2, (SemanticsPropertyKey) SemanticsPropertiesHelpers._HideFromAccessibility)) {
                                            if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.HorizontalScrollAxisRange)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "horizontal-scroll-axis-range", ViewStateRenderers.scrollAxisRangeToString(value instanceof ScrollAxisRange ? (ScrollAxisRange) value : null));
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.VerticalScrollAxisRange)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "vertical-scroll-axis-range", ViewStateRenderers.scrollAxisRangeToString(value instanceof ScrollAxisRange ? (ScrollAxisRange) value : null));
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Role)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "role", value);
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.TextSelectionRange)) {
                                                attributeAppendable.append("SELECTED-TEXT");
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ImeAction)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "ime-action", value);
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Selected)) {
                                                attributeAppendable.append("SELECTED");
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ToggleableState)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "toggle-state", value);
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Password)) {
                                                attributeAppendable.append("PASSWORD");
                                            }
                                        }
                                    }
                                    attributeAppendable.append("INVISIBLE-TO-USER");
                                }
                            }
                            List list2 = composeView.modifiers;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list2) {
                                if (obj instanceof LayoutIdParentData) {
                                    arrayList2.add(obj);
                                }
                            }
                            LayoutIdParentData layoutIdParentData = (LayoutIdParentData) CollectionsKt.singleOrNull((List) arrayList2);
                            if (layoutIdParentData != null) {
                                attributeAppendable.append("layout-id:" + (layoutIdParentData.getLayoutId() instanceof CharSequence ? "\"" + layoutIdParentData.getLayoutId() + '\"' : layoutIdParentData.getLayoutId().toString()));
                                break;
                            }
                        }
                        break;
                    default:
                        scannableView.getClass();
                        ViewStateRenderers.AndroidViewRenderer.render(attributeAppendable, scannableView);
                        ViewStateRenderers.ComposeViewRenderer.render(attributeAppendable, scannableView);
                        break;
                }
            }
        };
        NoRenderer = r0;
        final int i2 = 1;
        AndroidViewRenderer = new ViewStateRenderers$$ExternalSyntheticLambda6(1, View.class, new ViewStateRenderers$$ExternalSyntheticLambda1(0));
        ViewStateRenderer viewStateRenderer = r0;
        if (((Boolean) ComposeViewsKt.isComposeAvailable$delegate.getValue()).booleanValue()) {
            viewStateRenderer = new ViewStateRenderer() { // from class: radiography.ViewStateRenderers$$ExternalSyntheticLambda0
                @Override // radiography.ViewStateRenderer
                public final void render(AttributeAppendable attributeAppendable, ScannableView scannableView) {
                    SemanticsPropertyKey semanticsPropertyKey;
                    switch (i2) {
                        case 0:
                            scannableView.getClass();
                            break;
                        case 1:
                            ViewStateRenderers$$ExternalSyntheticLambda0 viewStateRenderers$$ExternalSyntheticLambda0 = ViewStateRenderers.NoRenderer;
                            scannableView.getClass();
                            ScannableView.ComposeView composeView = scannableView instanceof ScannableView.ComposeView ? (ScannableView.ComposeView) scannableView : null;
                            if (composeView != null) {
                                int i22 = composeView.height;
                                int i3 = composeView.width;
                                if (i3 != 0 || i22 != 0) {
                                    attributeAppendable.append(i3 + (char) 215 + i22 + "px");
                                }
                                for (Map.Entry entry : CollectionsKt.sortedWith(CollectionsKt__IterablesKt.flatten(composeView.getSemanticsConfigurations()), new LinkedHashTreeMap.AnonymousClass1(25))) {
                                    SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) entry.getKey();
                                    Object value = entry.getValue();
                                    if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.TestTag)) {
                                        ViewStateRenderers.appendLabeledValue(attributeAppendable, "test-tag", value);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ContentDescription)) {
                                        value.getClass();
                                        List list = (List) value;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add("\"" + it.next() + '\"');
                                        }
                                        ViewStateRenderers.appendLabeledValue(attributeAppendable, "content-description", arrayList);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.StateDescription)) {
                                        ViewStateRenderers.appendLabeledValue(attributeAppendable, "state-description", value);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Disabled)) {
                                        attributeAppendable.append("DISABLED");
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Focused)) {
                                        if (Intrinsics.areEqual(value, Boolean.TRUE)) {
                                            attributeAppendable.append("FOCUSED");
                                        }
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.IsDialog)) {
                                        attributeAppendable.append("DIALOG");
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.IsPopup)) {
                                        attributeAppendable.append("POPUP");
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ProgressBarRangeInfo)) {
                                        ViewStateRenderers.appendLabeledValue(attributeAppendable, "progress-bar-range", value);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.PaneTitle)) {
                                        ViewStateRenderers.appendLabeledValue(attributeAppendable, "pane-title", value);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.SelectableGroup)) {
                                        attributeAppendable.append("SELECTABLE-GROUP");
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Heading)) {
                                        attributeAppendable.append("HEADING");
                                    } else {
                                        if (!Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.InvisibleToUser)) {
                                            if (SemanticsPropertiesHelpers._HideFromAccessibility == SemanticsPropertiesHelpers.UNINITIALIZED.INSTANCE) {
                                                try {
                                                    semanticsPropertyKey = SemanticsProperties.HideFromAccessibility;
                                                } catch (NoSuchMethodError unused) {
                                                    semanticsPropertyKey = null;
                                                }
                                                SemanticsPropertiesHelpers._HideFromAccessibility = semanticsPropertyKey;
                                            }
                                            if (!Intrinsics.areEqual(semanticsPropertyKey2, (SemanticsPropertyKey) SemanticsPropertiesHelpers._HideFromAccessibility)) {
                                                if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.HorizontalScrollAxisRange)) {
                                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "horizontal-scroll-axis-range", ViewStateRenderers.scrollAxisRangeToString(value instanceof ScrollAxisRange ? (ScrollAxisRange) value : null));
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.VerticalScrollAxisRange)) {
                                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "vertical-scroll-axis-range", ViewStateRenderers.scrollAxisRangeToString(value instanceof ScrollAxisRange ? (ScrollAxisRange) value : null));
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Role)) {
                                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "role", value);
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.TextSelectionRange)) {
                                                    attributeAppendable.append("SELECTED-TEXT");
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ImeAction)) {
                                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "ime-action", value);
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Selected)) {
                                                    attributeAppendable.append("SELECTED");
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ToggleableState)) {
                                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "toggle-state", value);
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Password)) {
                                                    attributeAppendable.append("PASSWORD");
                                                }
                                            }
                                        }
                                        attributeAppendable.append("INVISIBLE-TO-USER");
                                    }
                                }
                                List list2 = composeView.modifiers;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : list2) {
                                    if (obj instanceof LayoutIdParentData) {
                                        arrayList2.add(obj);
                                    }
                                }
                                LayoutIdParentData layoutIdParentData = (LayoutIdParentData) CollectionsKt.singleOrNull((List) arrayList2);
                                if (layoutIdParentData != null) {
                                    attributeAppendable.append("layout-id:" + (layoutIdParentData.getLayoutId() instanceof CharSequence ? "\"" + layoutIdParentData.getLayoutId() + '\"' : layoutIdParentData.getLayoutId().toString()));
                                    break;
                                }
                            }
                            break;
                        default:
                            scannableView.getClass();
                            ViewStateRenderers.AndroidViewRenderer.render(attributeAppendable, scannableView);
                            ViewStateRenderers.ComposeViewRenderer.render(attributeAppendable, scannableView);
                            break;
                    }
                }
            };
        }
        ComposeViewRenderer = viewStateRenderer;
        final int i3 = 2;
        ViewStateRenderer viewStateRenderer2 = new ViewStateRenderer() { // from class: radiography.ViewStateRenderers$$ExternalSyntheticLambda0
            @Override // radiography.ViewStateRenderer
            public final void render(AttributeAppendable attributeAppendable, ScannableView scannableView) {
                SemanticsPropertyKey semanticsPropertyKey;
                switch (i3) {
                    case 0:
                        scannableView.getClass();
                        break;
                    case 1:
                        ViewStateRenderers$$ExternalSyntheticLambda0 viewStateRenderers$$ExternalSyntheticLambda0 = ViewStateRenderers.NoRenderer;
                        scannableView.getClass();
                        ScannableView.ComposeView composeView = scannableView instanceof ScannableView.ComposeView ? (ScannableView.ComposeView) scannableView : null;
                        if (composeView != null) {
                            int i22 = composeView.height;
                            int i32 = composeView.width;
                            if (i32 != 0 || i22 != 0) {
                                attributeAppendable.append(i32 + (char) 215 + i22 + "px");
                            }
                            for (Map.Entry entry : CollectionsKt.sortedWith(CollectionsKt__IterablesKt.flatten(composeView.getSemanticsConfigurations()), new LinkedHashTreeMap.AnonymousClass1(25))) {
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) entry.getKey();
                                Object value = entry.getValue();
                                if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.TestTag)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "test-tag", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ContentDescription)) {
                                    value.getClass();
                                    List list = (List) value;
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add("\"" + it.next() + '\"');
                                    }
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "content-description", arrayList);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.StateDescription)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "state-description", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Disabled)) {
                                    attributeAppendable.append("DISABLED");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Focused)) {
                                    if (Intrinsics.areEqual(value, Boolean.TRUE)) {
                                        attributeAppendable.append("FOCUSED");
                                    }
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.IsDialog)) {
                                    attributeAppendable.append("DIALOG");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.IsPopup)) {
                                    attributeAppendable.append("POPUP");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ProgressBarRangeInfo)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "progress-bar-range", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.PaneTitle)) {
                                    ViewStateRenderers.appendLabeledValue(attributeAppendable, "pane-title", value);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.SelectableGroup)) {
                                    attributeAppendable.append("SELECTABLE-GROUP");
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Heading)) {
                                    attributeAppendable.append("HEADING");
                                } else {
                                    if (!Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.InvisibleToUser)) {
                                        if (SemanticsPropertiesHelpers._HideFromAccessibility == SemanticsPropertiesHelpers.UNINITIALIZED.INSTANCE) {
                                            try {
                                                semanticsPropertyKey = SemanticsProperties.HideFromAccessibility;
                                            } catch (NoSuchMethodError unused) {
                                                semanticsPropertyKey = null;
                                            }
                                            SemanticsPropertiesHelpers._HideFromAccessibility = semanticsPropertyKey;
                                        }
                                        if (!Intrinsics.areEqual(semanticsPropertyKey2, (SemanticsPropertyKey) SemanticsPropertiesHelpers._HideFromAccessibility)) {
                                            if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.HorizontalScrollAxisRange)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "horizontal-scroll-axis-range", ViewStateRenderers.scrollAxisRangeToString(value instanceof ScrollAxisRange ? (ScrollAxisRange) value : null));
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.VerticalScrollAxisRange)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "vertical-scroll-axis-range", ViewStateRenderers.scrollAxisRangeToString(value instanceof ScrollAxisRange ? (ScrollAxisRange) value : null));
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Role)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "role", value);
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.TextSelectionRange)) {
                                                attributeAppendable.append("SELECTED-TEXT");
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ImeAction)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "ime-action", value);
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Selected)) {
                                                attributeAppendable.append("SELECTED");
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.ToggleableState)) {
                                                ViewStateRenderers.appendLabeledValue(attributeAppendable, "toggle-state", value);
                                            } else if (Intrinsics.areEqual(semanticsPropertyKey2, SemanticsProperties.Password)) {
                                                attributeAppendable.append("PASSWORD");
                                            }
                                        }
                                    }
                                    attributeAppendable.append("INVISIBLE-TO-USER");
                                }
                            }
                            List list2 = composeView.modifiers;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list2) {
                                if (obj instanceof LayoutIdParentData) {
                                    arrayList2.add(obj);
                                }
                            }
                            LayoutIdParentData layoutIdParentData = (LayoutIdParentData) CollectionsKt.singleOrNull((List) arrayList2);
                            if (layoutIdParentData != null) {
                                attributeAppendable.append("layout-id:" + (layoutIdParentData.getLayoutId() instanceof CharSequence ? "\"" + layoutIdParentData.getLayoutId() + '\"' : layoutIdParentData.getLayoutId().toString()));
                                break;
                            }
                        }
                        break;
                    default:
                        scannableView.getClass();
                        ViewStateRenderers.AndroidViewRenderer.render(attributeAppendable, scannableView);
                        ViewStateRenderers.ComposeViewRenderer.render(attributeAppendable, scannableView);
                        break;
                }
            }
        };
        ViewStateRenderers$$ExternalSyntheticLambda6 viewStateRenderers$$ExternalSyntheticLambda6 = new ViewStateRenderers$$ExternalSyntheticLambda6(1, Checkable.class, new ViewStateRenderers$$ExternalSyntheticLambda1(2));
        DefaultsNoPii = CollectionsKt__CollectionsKt.listOf((Object[]) new ViewStateRenderer[]{viewStateRenderer2, textViewRenderer(0, false), viewStateRenderers$$ExternalSyntheticLambda6});
        DefaultsIncludingPii = CollectionsKt__CollectionsKt.listOf((Object[]) new ViewStateRenderer[]{viewStateRenderer2, textViewRenderer(Integer.MAX_VALUE, true), viewStateRenderers$$ExternalSyntheticLambda6});
    }

    public static void appendLabeledValue(AttributeAppendable attributeAppendable, String str, Object obj) {
        if (!(obj instanceof CharSequence)) {
            attributeAppendable.append(str + ':' + obj);
            return;
        }
        attributeAppendable.append(str + ":\"" + obj + '\"');
    }

    public static void appendTextValue$radiography_release(AttributeAppendable attributeAppendable, String str, CharSequence charSequence, boolean z, int i) {
        CharSequence charSequence2;
        attributeAppendable.getClass();
        if (charSequence == null) {
            return;
        }
        if (z) {
            if (charSequence.length() > i) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) charSequence.subSequence(0, i - 1));
                sb.append((char) 8230);
                charSequence2 = sb.toString();
            } else {
                charSequence2 = charSequence;
            }
            appendLabeledValue(attributeAppendable, str, charSequence2);
            if (charSequence2.length() == charSequence.length()) {
                return;
            }
        }
        appendLabeledValue(attributeAppendable, str.concat("-length"), Integer.valueOf(charSequence.length()));
    }

    public static String scrollAxisRangeToString(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange == null) {
            return null;
        }
        return "ScrollAxisRange(value=" + ((Number) scrollAxisRange.value.invoke()).floatValue() + ", maxValue=" + ((Number) scrollAxisRange.maxValue.invoke()).floatValue() + ')';
    }

    public static final ViewStateRenderers$$ExternalSyntheticLambda6 textViewRenderer(final int i, final boolean z) {
        if (!z || i >= 0) {
            return new ViewStateRenderers$$ExternalSyntheticLambda6(0, new ViewStateRenderers$$ExternalSyntheticLambda6(1, TextView.class, new ViewStateRenderers$$ExternalSyntheticLambda5(i, 0, z)), !((Boolean) ComposeViewsKt.isComposeAvailable$delegate.getValue()).booleanValue() ? NoRenderer : new ViewStateRenderer() { // from class: radiography.ViewStateRenderers$$ExternalSyntheticLambda8
                @Override // radiography.ViewStateRenderer
                public final void render(AttributeAppendable attributeAppendable, ScannableView scannableView) {
                    ViewStateRenderers$$ExternalSyntheticLambda0 viewStateRenderers$$ExternalSyntheticLambda0 = ViewStateRenderers.NoRenderer;
                    scannableView.getClass();
                    ScannableView.ComposeView composeView = scannableView instanceof ScannableView.ComposeView ? (ScannableView.ComposeView) scannableView : null;
                    Iterable semanticsConfigurations = composeView != null ? composeView.getSemanticsConfigurations() : EmptyList.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = semanticsConfigurations.iterator();
                    while (it.hasNext()) {
                        List list = (List) TransactorKt.getOrNull((SemanticsConfiguration) it.next(), SemanticsProperties.Text);
                        String joinToString$default = list != null ? CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63) : null;
                        if (joinToString$default != null) {
                            arrayList.add(joinToString$default);
                        }
                    }
                    ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
                    boolean z2 = z;
                    int i2 = i;
                    if (arrayList2 != null) {
                        ViewStateRenderers.appendTextValue$radiography_release(attributeAppendable, "text", CollectionsKt.joinToString$default(arrayList2, " ", null, null, 0, null, null, 62), z2, i2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = semanticsConfigurations.iterator();
                    while (it2.hasNext()) {
                        AnnotatedString annotatedString = (AnnotatedString) TransactorKt.getOrNull((SemanticsConfiguration) it2.next(), SemanticsProperties.EditableText);
                        String str = annotatedString != null ? annotatedString.text : null;
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    }
                    ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
                    if (arrayList4 != null) {
                        ViewStateRenderers.appendTextValue$radiography_release(attributeAppendable, "editable-text", CollectionsKt.joinToString$default(arrayList4, " ", null, null, 0, null, null, 62), z2, i2);
                    }
                }
            });
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "textFieldMaxLength should be greater than 0, not "));
        return null;
    }
}
