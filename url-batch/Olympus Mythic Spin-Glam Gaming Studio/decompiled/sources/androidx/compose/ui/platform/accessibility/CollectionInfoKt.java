package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionInfo.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0007H\u0000\u001a\u0014\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u0002H\u0002\u001a\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0016"}, d2 = {"isLazyCollection", "", "Landroidx/compose/ui/semantics/CollectionInfo;", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "calculateIfHorizontallyStacked", "items", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "setCollectionInfo", "", "node", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "setCollectionItemInfo", "hasCollectionInfo", "toAccessibilityCollectionInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionItemInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CollectionInfoKt {
    public static final void setCollectionInfo(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        SemanticsConfiguration config = node.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            info.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(node.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) replacedChildren$ui_release.get(i);
                if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        info.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(calculateIfHorizontallyStacked ? 1 : arrayList.size(), calculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        SemanticsConfiguration config = node.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            info.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, node));
        }
        SemanticsNode parent = node.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && node.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) replacedChildren$ui_release.get(i);
                if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) arrayList.get(i2);
                if (semanticsNode2.getId() == node.getId()) {
                    AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(calculateIfHorizontallyStacked ? 0 : i2, 1, calculateIfHorizontallyStacked ? i2 : 0, 1, false, ((Boolean) semanticsNode2.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfoKt$setCollectionItemInfo$2$itemInfo$1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            return Boolean.FALSE;
                        }
                    })).booleanValue());
                    if (obtain != null) {
                        info.setCollectionItemInfo(obtain);
                    }
                }
            }
        }
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        Intrinsics.checkNotNullParameter(semanticsNode, "<this>");
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean calculateIfHorizontallyStacked(List list) {
        List emptyList;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            emptyList = CollectionsKt.emptyList();
        } else {
            emptyList = new ArrayList();
            Object obj = list.get(0);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i = 0;
            while (i < lastIndex) {
                i++;
                Object obj2 = list.get(i);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                emptyList.add(Offset.m1288boximpl(OffsetKt.Offset(Math.abs(Offset.m1297getXimpl(semanticsNode2.getBoundsInRoot().m1316getCenterF1C5BW0()) - Offset.m1297getXimpl(semanticsNode.getBoundsInRoot().m1316getCenterF1C5BW0())), Math.abs(Offset.m1298getYimpl(semanticsNode2.getBoundsInRoot().m1316getCenterF1C5BW0()) - Offset.m1298getYimpl(semanticsNode.getBoundsInRoot().m1316getCenterF1C5BW0())))));
                obj = obj2;
            }
        }
        if (emptyList.size() != 1) {
            if (emptyList.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object first = CollectionsKt.first(emptyList);
            int lastIndex2 = CollectionsKt.getLastIndex(emptyList);
            if (1 <= lastIndex2) {
                int i2 = 1;
                while (true) {
                    first = Offset.m1288boximpl(Offset.m1302plusMKHz9U(((Offset) first).getPackedValue(), ((Offset) emptyList.get(i2)).getPackedValue()));
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            packedValue = ((Offset) first).getPackedValue();
        } else {
            packedValue = ((Offset) CollectionsKt.first(emptyList)).getPackedValue();
        }
        return Offset.m1290component2impl(packedValue) < Offset.m1289component1impl(packedValue);
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfoKt$toAccessibilityCollectionItemInfo$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}
