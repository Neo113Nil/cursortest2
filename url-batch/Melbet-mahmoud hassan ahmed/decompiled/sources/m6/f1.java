package m6;

import java.io.Closeable;
import y5.g;

/* loaded from: classes.dex */
public abstract class f1 extends f0 implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f19282g = new a(null);

    public static final class a extends y5.b<f0, f1> {

        /* renamed from: m6.f1$a$a, reason: collision with other inner class name */
        static final class C0111a extends kotlin.jvm.internal.j implements f6.l<g.b, f1> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0111a f19283f = new C0111a();

            C0111a() {
                super(1);
            }

            @Override // f6.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f1 invoke(g.b bVar) {
                if (bVar instanceof f1) {
                    return (f1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(f0.f19280f, C0111a.f19283f);
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }
}
