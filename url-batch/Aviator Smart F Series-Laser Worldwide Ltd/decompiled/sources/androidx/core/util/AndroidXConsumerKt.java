package androidx.core.util;

/* loaded from: classes.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(kotlin.coroutines.c cVar) {
        return new AndroidXContinuationConsumer(cVar);
    }
}
