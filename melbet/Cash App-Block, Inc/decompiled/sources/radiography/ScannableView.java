package radiography;

import android.view.View;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.tooling.data.SourceLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes7.dex */
public abstract class ScannableView {

    /* loaded from: classes9.dex */
    public final class AndroidView extends ScannableView {
        public final StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 children;
        public final View view;

        public AndroidView(View view) {
            view.getClass();
            this.view = view;
            this.children = new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(new ScannableViewKt$scannableChildren$1(view, null), 2);
        }

        @Override // radiography.ScannableView
        public final Sequence getChildren() {
            return this.children;
        }

        @Override // radiography.ScannableView
        public final String getDisplayName() {
            return this.view.getClass().getSimpleName();
        }

        public final String toString() {
            return AndroidView.class.getSimpleName() + '(' + getDisplayName() + ')';
        }
    }

    /* loaded from: classes5.dex */
    public final class CallGroupInfo {
        public final SourceLocation location;
        public final String name;

        public CallGroupInfo(String str, SourceLocation sourceLocation) {
            str.getClass();
            this.name = str;
            this.location = sourceLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallGroupInfo)) {
                return false;
            }
            CallGroupInfo callGroupInfo = (CallGroupInfo) obj;
            return Intrinsics.areEqual(this.name, callGroupInfo.name) && Intrinsics.areEqual(this.location, callGroupInfo.location);
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            SourceLocation sourceLocation = this.location;
            return hashCode + (sourceLocation == null ? 0 : sourceLocation.hashCode());
        }

        public final String toString() {
            return "CallGroupInfo(name=" + this.name + ", location=" + this.location + ')';
        }
    }

    /* loaded from: classes9.dex */
    public final class ChildRenderingError extends ScannableView {
        public final String message;

        public ChildRenderingError(String str) {
            this.message = str;
        }

        @Override // radiography.ScannableView
        public final Sequence getChildren() {
            return EmptySequence.INSTANCE;
        }

        @Override // radiography.ScannableView
        public final String getDisplayName() {
            return this.message;
        }
    }

    /* loaded from: classes10.dex */
    public final class ComposeView extends ScannableView {
        public final List callChain;
        public final TransformingSequence children;
        public final String displayName;
        public final int height;
        public final List modifiers;
        public final List semanticsNodes;
        public final int width;

        public ComposeView(String str, List list, int i, int i2, List list2, List list3, TransformingSequence transformingSequence) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.displayName = str;
            this.callChain = list;
            this.width = i;
            this.height = i2;
            this.modifiers = list2;
            this.semanticsNodes = list3;
            this.children = transformingSequence;
        }

        @Override // radiography.ScannableView
        public final Sequence getChildren() {
            return this.children;
        }

        @Override // radiography.ScannableView
        public final String getDisplayName() {
            return this.displayName;
        }

        public final ArrayList getSemanticsConfigurations() {
            List list = this.semanticsNodes;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SemanticsNode) it.next()).getConfig());
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return arrayList;
            }
            List list2 = this.modifiers;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof SemanticsModifier) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((SemanticsModifier) it2.next()).getSemanticsConfiguration());
            }
            ArrayList arrayList4 = arrayList3.isEmpty() ? null : arrayList3;
            if (arrayList4 != null) {
                return arrayList4;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof ModifierNodeElement) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((ModifierNodeElement) it3.next()).create());
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                if (next instanceof SemanticsModifierNode) {
                    arrayList7.add(next);
                }
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) it5.next();
                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                semanticsModifierNode.applySemantics(semanticsConfiguration);
                arrayList8.add(semanticsConfiguration);
            }
            return arrayList8;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ComposeView.class.getSimpleName());
            sb.append('(');
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.displayName, ')');
        }
    }

    public abstract Sequence getChildren();

    public abstract String getDisplayName();
}
