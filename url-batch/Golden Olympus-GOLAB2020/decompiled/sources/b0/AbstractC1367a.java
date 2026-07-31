package b0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1367a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13297a = new LinkedHashMap();

    /* renamed from: b0.a$a, reason: collision with other inner class name */
    public static final class C0126a extends AbstractC1367a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0126a f13298b = new C0126a();

        private C0126a() {
        }

        @Override // b0.AbstractC1367a
        public Object a(b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* renamed from: b0.a$b */
    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f13297a;
    }
}
