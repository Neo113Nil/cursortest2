package radiography.internal;

import androidx.compose.runtime.ReusableGapRememberObserverHolder;
import java.lang.reflect.Field;

/* loaded from: classes9.dex */
public final class CompositionContextsKt$REFLECTION_CONSTANTS$2$1 {
    public final Field CompositionContextHolderRefField;
    public final Class CompositionContextImplClass;
    public final Field CompositionContextImplComposersField;
    public final Class ReusableRememberObserverHolderClass;

    public CompositionContextsKt$REFLECTION_CONSTANTS$2$1() {
        Class<?> cls = Class.forName("androidx.compose.runtime.ComposerImpl$CompositionContextHolder");
        Class<?> cls2 = Class.forName("androidx.compose.runtime.ComposerImpl$CompositionContextImpl");
        this.CompositionContextImplClass = cls2;
        this.ReusableRememberObserverHolderClass = ReusableGapRememberObserverHolder.class;
        Field declaredField = cls.getDeclaredField("ref");
        declaredField.setAccessible(true);
        this.CompositionContextHolderRefField = declaredField;
        Field declaredField2 = cls2.getDeclaredField("composers");
        declaredField2.setAccessible(true);
        this.CompositionContextImplComposersField = declaredField2;
    }
}
