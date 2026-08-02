package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.collections.EmptyList;
import okio.Utf8;

/* loaded from: classes3.dex */
public interface SerialDescriptor {
    default List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    List getElementAnnotations(int i);

    SerialDescriptor getElementDescriptor(int i);

    int getElementIndex(String str);

    String getElementName(int i);

    int getElementsCount();

    Utf8 getKind();

    String getSerialName();

    boolean isElementOptional(int i);

    default boolean isInline() {
        return false;
    }

    default boolean isNullable() {
        return false;
    }
}
