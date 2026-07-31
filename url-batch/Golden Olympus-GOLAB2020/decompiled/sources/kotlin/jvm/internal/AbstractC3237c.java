package kotlin.jvm.internal;

import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3237c {
    public static final Iterator a(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new C3236b(array);
    }
}
