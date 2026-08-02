package kotlin.sequences;

import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.workflow1.WorkflowIdentifier$toString$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__AppendableKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes3.dex */
public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
    public static int count(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
                throw null;
            }
        }
        return i;
    }

    public static Sequence drop(Sequence sequence, int i) {
        sequence.getClass();
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).drop(i) : new DropSequence(sequence, i, 0);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static Object elementAt(Sequence sequence, int i) {
        sequence.getClass();
        DatePickerKt$$ExternalSyntheticLambda10 datePickerKt$$ExternalSyntheticLambda10 = new DatePickerKt$$ExternalSyntheticLambda10(i, 24);
        if (i < 0) {
            datePickerKt$$ExternalSyntheticLambda10.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : sequence) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        datePickerKt$$ExternalSyntheticLambda10.invoke(Integer.valueOf(i));
        throw null;
    }

    public static FilteringSequence filter(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new FilteringSequence(sequence, true, function1);
    }

    public static FilteringSequence filterNot(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new FilteringSequence(sequence, false, function1);
    }

    public static Object firstOrNull(FilteringSequence filteringSequence) {
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(filteringSequence);
        if (filteringSequence$iterator$1.hasNext()) {
            return filteringSequence$iterator$1.next();
        }
        return null;
    }

    public static FlatteningSequence flatMap(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    public static FlatteningSequence flatMapIterable(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    public static String joinToString$default(Sequence sequence, String str, int i) {
        WorkflowIdentifier$toString$1 workflowIdentifier$toString$1 = WorkflowIdentifier$toString$1.INSTANCE;
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            workflowIdentifier$toString$1 = null;
        }
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            StringsKt__AppendableKt.appendElement(sb, obj, workflowIdentifier$toString$1);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object last(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static TransformingSequence map(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new TransformingSequence(sequence, function1);
    }

    public static FilteringSequence mapNotNull(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new FilteringSequence(new TransformingSequence(sequence, function1), false, new Perfs$$ExternalSyntheticLambda4(17));
    }

    public static Comparable maxOrNull(TransformingSequence transformingSequence) {
        Function1 function1 = transformingSequence.transformer;
        Iterator it = transformingSequence.sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) function1.invoke(it.next());
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) function1.invoke(it.next());
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static FlatteningSequence plus(Sequence sequence, Iterable iterable) {
        iterable.getClass();
        return SequencesKt__SequencesKt.flatten(ArraysKt___ArraysKt.asSequence(new Sequence[]{sequence, new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(iterable, 1)}));
    }

    public static Object singleOrNull(ViewGroupKt$children$1 viewGroupKt$children$1) {
        ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) viewGroupKt$children$1.iterator();
        if (!viewGroupKt$iterator$1.hasNext()) {
            return null;
        }
        Object next = viewGroupKt$iterator$1.next();
        if (viewGroupKt$iterator$1.hasNext()) {
            return null;
        }
        return next;
    }

    public static Sequence take(Sequence sequence, int i) {
        sequence.getClass();
        if (i >= 0) {
            return i == 0 ? EmptySequence.INSTANCE : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).take(i) : new DropSequence(sequence, i, 1);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static TakeWhileSequence takeWhile(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new TakeWhileSequence(sequence, function1);
    }

    public static List toList(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return EmptyList.INSTANCE;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsJVMKt.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set toSet(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return EmptySet.INSTANCE;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return SetsKt__SetsJVMKt.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static FlatteningSequence plus(FlatteningSequence flatteningSequence, FlatteningSequence flatteningSequence2) {
        return SequencesKt__SequencesKt.flatten(ArraysKt___ArraysKt.asSequence(new Sequence[]{flatteningSequence, flatteningSequence2}));
    }
}
