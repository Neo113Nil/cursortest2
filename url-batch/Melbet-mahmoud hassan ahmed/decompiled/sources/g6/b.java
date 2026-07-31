package g6;

import java.util.Random;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b extends g6.a {

    /* renamed from: h, reason: collision with root package name */
    private final a f16681h = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // g6.a
    public Random c() {
        Random random = this.f16681h.get();
        i.c(random, "implStorage.get()");
        return random;
    }
}
