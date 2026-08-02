package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* loaded from: classes9.dex */
public abstract class ValueClassRepresentation<Type extends RigidTypeMarker> {
    public ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(Function1<? super Type, ? extends Other> function1) {
        function1.getClass();
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), (RigidTypeMarker) function1.invoke(inlineClassRepresentation.getUnderlyingType()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        List<Pair<Name, Type>> underlyingPropertyNamesToTypes = ((MultiFieldValueClassRepresentation) this).getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(underlyingPropertyNamesToTypes, 10));
        Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new Pair((Name) pair.first, function1.invoke((RigidTypeMarker) pair.second)));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
