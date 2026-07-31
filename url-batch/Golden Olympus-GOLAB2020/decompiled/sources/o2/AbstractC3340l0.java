package o2;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o2.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3340l0 extends AbstractC3313G implements Closeable, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f42085d = new a(null);

    /* renamed from: o2.l0$a */
    public static final class a extends kotlin.coroutines.b {

        /* renamed from: o2.l0$a$a, reason: collision with other inner class name */
        static final class C0242a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0242a f42086i = new C0242a();

            C0242a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3340l0 invoke(CoroutineContext.Element element) {
                if (element instanceof AbstractC3340l0) {
                    return (AbstractC3340l0) element;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(AbstractC3313G.f42003c, C0242a.f42086i);
        }
    }

    public abstract Executor p();
}
