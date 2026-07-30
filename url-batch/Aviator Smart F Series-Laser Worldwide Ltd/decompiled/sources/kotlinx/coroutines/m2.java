package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class m2 extends kotlin.coroutines.a {
    public static final a Key = new a(null);
    public boolean dispatcherWasUnconfined;

    public static final class a implements CoroutineContext.b {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public m2() {
        super(Key);
    }
}
