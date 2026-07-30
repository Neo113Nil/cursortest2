package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class PlatformRandom extends kotlin.random.a implements Serializable {
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private final java.util.Random impl;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public PlatformRandom(java.util.Random impl) {
        s.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // kotlin.random.a
    public java.util.Random getImpl() {
        return this.impl;
    }
}
