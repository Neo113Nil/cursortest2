package radiography.internal;

import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.GapCompositionDataImpl;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.platform.WrappedComposition;
import androidx.compose.ui.tooling.data.EmptyGroup;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.unit.IntRect;
import dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;

/* loaded from: classes9.dex */
public abstract class ComposeViewsKt {
    public static final Lazy isComposeAvailable$delegate;
    public static final Lazy viewKeyedTagsField$delegate;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        isComposeAvailable$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HazeStyleKt$$ExternalSyntheticLambda0(14));
        viewKeyedTagsField$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HazeStyleKt$$ExternalSyntheticLambda0(15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Sequence tryGetLayoutInfos(View view) {
        Object obj;
        Composer composer;
        Field field = (Field) viewKeyedTagsField$delegate.getValue();
        SparseArray sparseArray = (SparseArray) (field != null ? field.get(view) : null);
        int i = 0;
        if (sparseArray == null) {
            sparseArray = new SparseArray(0);
        }
        int size = sparseArray.size();
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = sparseArray.valueAt(i);
            if (obj instanceof Composition) {
                break;
            }
            i++;
        }
        Composition composition = (Composition) obj;
        if (composition != null) {
            if (composition.getClass().getName().equals("androidx.compose.ui.platform.WrappedComposition")) {
                Field declaredField = WrappedComposition.class.getDeclaredField("original");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(composition);
                obj2.getClass();
                composition = (Composition) obj2;
            }
            if (composition.getClass().getName().equals("androidx.compose.runtime.CompositionImpl")) {
                Field declaredField2 = CompositionImpl.class.getDeclaredField("composer");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(composition);
                if (obj3 instanceof Composer) {
                    composer = (Composer) obj3;
                    if (composer != null) {
                        CompositionData compositionData = ((GapComposer) composer).getCompositionData();
                        IntRect intRect = SlotTreeKt.emptyBox;
                        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(((GapCompositionDataImpl) compositionData).getCompositionGroups());
                        Group group = compositionGroup != null ? SlotTreeKt.getGroup(compositionGroup, null) : EmptyGroup.INSTANCE;
                        ViewRootForTest viewRootForTest = view instanceof ViewRootForTest ? (ViewRootForTest) view : null;
                        return ComposeLayoutInfoKt.computeLayoutInfos(group, EmptyList.INSTANCE, viewRootForTest != null ? ((AndroidComposeView) viewRootForTest).semanticsOwner : null);
                    }
                }
            }
            composer = null;
            if (composer != null) {
            }
        }
        return null;
    }
}
