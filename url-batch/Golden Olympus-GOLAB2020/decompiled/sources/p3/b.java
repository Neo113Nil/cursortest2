package p3;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z3.c;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile List f43376a;

    static final class a extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f43377i = new a();

        a() {
            super(1);
        }

        public final CharSequence a(c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String name = it.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.javaClass.name");
            return name;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    public static final c a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        List b4 = b();
        if (b4.size() <= 1) {
            if (b4.size() != 1) {
                return null;
            }
            android.support.v4.media.session.b.a(b4.get(0));
            throw null;
        }
        throw new IllegalStateException(("More then one manifest found: " + CollectionsKt.joinToString$default(b4, null, null, null, 0, null, a.f43377i, 31, null)).toString());
    }

    private static final List b() {
        List list = f43376a;
        if (list != null) {
            return list;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterator it = ServiceLoader.load(c.class, c.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "load(S::class.java, S::c…a.classLoader).iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            createListBuilder.add(next);
        }
        f43376a = createListBuilder;
        return CollectionsKt.build(createListBuilder);
    }
}
