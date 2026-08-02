package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* loaded from: classes9.dex */
public final class MultiFieldValueClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {
    public final List underlyingPropertyNamesToTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiFieldValueClassRepresentation(List<? extends Pair<Name, ? extends Type>> list) {
        super(null);
        list.getClass();
        this.underlyingPropertyNamesToTypes = list;
        MapsKt__MapsKt.toMap(getUnderlyingPropertyNamesToTypes());
    }

    public List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.underlyingPropertyNamesToTypes;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + ')';
    }
}
