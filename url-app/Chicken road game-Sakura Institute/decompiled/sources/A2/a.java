package A2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1430n;

/* loaded from: classes.dex */
public abstract class a extends AbstractC1430n {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return h(element);
    }

    public abstract boolean h(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return s((Map.Entry) obj);
        }
        return false;
    }

    public /* bridge */ boolean s(Map.Entry entry) {
        return super.remove(entry);
    }
}
