package radiography.internal;

import android.view.View;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.unit.IntRect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes10.dex */
public abstract class ComposeLayoutInfo {

    public final class AndroidViewInfo extends ComposeLayoutInfo {
        public final View view;

        public AndroidViewInfo(View view) {
            this.view = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AndroidViewInfo) && this.view.equals(((AndroidViewInfo) obj).view);
        }

        public final int hashCode() {
            return this.view.hashCode();
        }

        public final String toString() {
            return "AndroidViewInfo(view=" + this.view + ')';
        }
    }

    public final class LayoutNodeInfo extends ComposeLayoutInfo {
        public final IntRect bounds;
        public final List callChain;
        public final Sequence children;
        public final List modifiers;
        public final String name;
        public final List semanticsNodes;

        public LayoutNodeInfo(String str, List list, IntRect intRect, List list2, Sequence sequence, List list3) {
            list.getClass();
            intRect.getClass();
            list3.getClass();
            this.name = str;
            this.callChain = list;
            this.bounds = intRect;
            this.modifiers = list2;
            this.children = sequence;
            this.semanticsNodes = list3;
        }

        public static LayoutNodeInfo copy$default(LayoutNodeInfo layoutNodeInfo, Sequence sequence) {
            String str = layoutNodeInfo.name;
            List list = layoutNodeInfo.callChain;
            IntRect intRect = layoutNodeInfo.bounds;
            List list2 = layoutNodeInfo.modifiers;
            List list3 = layoutNodeInfo.semanticsNodes;
            list.getClass();
            intRect.getClass();
            list3.getClass();
            return new LayoutNodeInfo(str, list, intRect, list2, sequence, list3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutNodeInfo)) {
                return false;
            }
            LayoutNodeInfo layoutNodeInfo = (LayoutNodeInfo) obj;
            return this.name.equals(layoutNodeInfo.name) && Intrinsics.areEqual(this.callChain, layoutNodeInfo.callChain) && Intrinsics.areEqual(this.bounds, layoutNodeInfo.bounds) && this.modifiers.equals(layoutNodeInfo.modifiers) && this.children.equals(layoutNodeInfo.children) && Intrinsics.areEqual(this.semanticsNodes, layoutNodeInfo.semanticsNodes);
        }

        public final int hashCode() {
            return this.semanticsNodes.hashCode() + ((this.children.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.bounds.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.callChain)) * 31, 31, this.modifiers)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutNodeInfo(name=");
            sb.append(this.name);
            sb.append(", callChain=");
            sb.append(this.callChain);
            sb.append(", bounds=");
            sb.append(this.bounds);
            sb.append(", modifiers=");
            sb.append(this.modifiers);
            sb.append(", children=");
            sb.append(this.children);
            sb.append(", semanticsNodes=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.semanticsNodes, ')');
        }
    }

    public final class SubcompositionInfo extends ComposeLayoutInfo {
        public final IntRect bounds;
        public final List callChain;
        public final Sequence children;
        public final String name;

        public SubcompositionInfo(String str, List list, IntRect intRect, Sequence sequence) {
            list.getClass();
            intRect.getClass();
            this.name = str;
            this.callChain = list;
            this.bounds = intRect;
            this.children = sequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubcompositionInfo)) {
                return false;
            }
            SubcompositionInfo subcompositionInfo = (SubcompositionInfo) obj;
            return this.name.equals(subcompositionInfo.name) && Intrinsics.areEqual(this.callChain, subcompositionInfo.callChain) && Intrinsics.areEqual(this.bounds, subcompositionInfo.bounds) && this.children.equals(subcompositionInfo.children);
        }

        public final int hashCode() {
            return this.children.hashCode() + ((this.bounds.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.callChain)) * 31);
        }

        public final String toString() {
            return "SubcompositionInfo(name=" + this.name + ", callChain=" + this.callChain + ", bounds=" + this.bounds + ", children=" + this.children + ')';
        }
    }
}
