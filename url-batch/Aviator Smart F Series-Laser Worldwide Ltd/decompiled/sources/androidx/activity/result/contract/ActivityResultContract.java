package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t7) {
            this.value = t7;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i8);

    public SynchronousResult<O> getSynchronousResult(Context context, I i8) {
        s.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i8, Intent intent);
}
