package C2;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0342x extends AbstractC0340w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0342x(InterfaceC3527b element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
