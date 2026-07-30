package T6;

import java.util.RandomAccess;
import kotlin.collections.AbstractC0627f;

/* loaded from: classes.dex */
public final class n extends AbstractC0627f implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2634e = 0;

    @Override // kotlin.collections.AbstractC0622a
    public final int a() {
        throw null;
    }

    @Override // kotlin.collections.AbstractC0622a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        throw null;
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
