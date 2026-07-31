package d;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2398a {

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0210a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f36150a;

        public C0210a(Object obj) {
            this.f36150a = obj;
        }

        public final Object a() {
            return this.f36150a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0210a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i4, Intent intent);
}
