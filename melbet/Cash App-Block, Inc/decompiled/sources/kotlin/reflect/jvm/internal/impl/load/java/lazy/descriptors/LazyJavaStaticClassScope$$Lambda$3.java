package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.paging.internal.CopyOnWriteArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes9.dex */
public final class LazyJavaStaticClassScope$$Lambda$3 implements DFS.Neighbors {
    public static final LazyJavaStaticClassScope$$Lambda$3 INSTANCE = new LazyJavaStaticClassScope$$Lambda$3();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj) {
        int i = LazyJavaStaticClassScope.$r8$clinit;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj).getTypeConstructor().getSupertypes();
        supertypes.getClass();
        return new CopyOnWriteArrayList(SequencesKt___SequencesKt.mapNotNull(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(supertypes, 1), LazyJavaScope$$Lambda$9.INSTANCE$4), 1);
    }
}
