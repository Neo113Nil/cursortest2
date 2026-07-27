package P2;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends P2.a {

    /* renamed from: i, reason: collision with root package name */
    public final a f3787i = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // P2.a
    public final Random e() {
        Object obj = this.f3787i.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
