package okhttp3.internal;

import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class EmptyTags extends Tags {
    public static final EmptyTags INSTANCE = new EmptyTags();

    @Override // okhttp3.internal.Tags
    public final Object get(KClass kClass) {
        kClass.getClass();
        return null;
    }

    @Override // okhttp3.internal.Tags
    public final Tags plus(KClass kClass, Object obj) {
        return obj != null ? new LinkedTags(kClass, obj, this) : this;
    }

    public final String toString() {
        return "{}";
    }
}
