package radiography;

import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.unit.IntRect;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.BitSet;
import java.util.List;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.EmptyList;
import kotlin.sequences.SequencesKt___SequencesKt;
import radiography.ScannableView;
import radiography.internal.ComposeLayoutInfo;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes10.dex */
public abstract class ViewFilters {
    public static final ViewFilters$$ExternalSyntheticLambda0 NoFilter = new ViewFilters$$ExternalSyntheticLambda0();

    public static void scanFromLooperThread(StringBuilder sb, ScannableView scannableView, List list, ViewFilters$$ExternalSyntheticLambda0 viewFilters$$ExternalSyntheticLambda0) {
        String displayName;
        CharSequence title;
        scannableView.getClass();
        if (sb.length() > 0) {
            sb.append('\n');
        }
        ScannableView.AndroidView androidView = scannableView instanceof ScannableView.AndroidView ? (ScannableView.AndroidView) scannableView : null;
        View view = androidView != null ? androidView.view : null;
        Object layoutParams = view != null ? view.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (title = layoutParams2.getTitle()) == null || (displayName = title.toString()) == null) {
            displayName = scannableView.getDisplayName();
        }
        sb.append(displayName + ':');
        sb.append('\n');
        int length = sb.length();
        if (view != null) {
            try {
                sb.append("window-focus:" + view.hasWindowFocus());
                sb.append('\n');
            } catch (Throwable th) {
                sb.insert(length, "Exception when going through view hierarchy:\n" + ExceptionsKt__ExceptionsKt.stackTraceToString(th));
                return;
            }
        }
        list.getClass();
        RenderTreeStringKt.renderRecursively(sb, scannableView, new Radiography$$ExternalSyntheticLambda1(0, list, viewFilters$$ExternalSyntheticLambda0), 0, new BitSet());
    }

    public static final ScannableView toScannableView(ComposeLayoutInfo composeLayoutInfo) {
        composeLayoutInfo.getClass();
        if (composeLayoutInfo instanceof ComposeLayoutInfo.LayoutNodeInfo) {
            ComposeLayoutInfo.LayoutNodeInfo layoutNodeInfo = (ComposeLayoutInfo.LayoutNodeInfo) composeLayoutInfo;
            String str = layoutNodeInfo.name;
            List list = layoutNodeInfo.callChain;
            IntRect intRect = layoutNodeInfo.bounds;
            return new ScannableView.ComposeView(str, list, intRect.right - intRect.left, intRect.bottom - intRect.top, layoutNodeInfo.modifiers, layoutNodeInfo.semanticsNodes, SequencesKt___SequencesKt.map(layoutNodeInfo.children, ScannableViewKt$toScannableView$3.INSTANCE));
        }
        if (!(composeLayoutInfo instanceof ComposeLayoutInfo.SubcompositionInfo)) {
            if (composeLayoutInfo instanceof ComposeLayoutInfo.AndroidViewInfo) {
                return new ScannableView.AndroidView(((ComposeLayoutInfo.AndroidViewInfo) composeLayoutInfo).view);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ComposeLayoutInfo.SubcompositionInfo subcompositionInfo = (ComposeLayoutInfo.SubcompositionInfo) composeLayoutInfo;
        String str2 = subcompositionInfo.name;
        List list2 = subcompositionInfo.callChain;
        IntRect intRect2 = subcompositionInfo.bounds;
        int i = intRect2.right - intRect2.left;
        int i2 = intRect2.bottom - intRect2.top;
        EmptyList emptyList = EmptyList.INSTANCE;
        return new ScannableView.ComposeView(str2, list2, i, i2, emptyList, emptyList, SequencesKt___SequencesKt.map(subcompositionInfo.children, ScannableViewKt$toScannableView$6.INSTANCE));
    }
}
