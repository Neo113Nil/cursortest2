package p3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Set f43374a;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    static final class C0246a extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final C0246a f43375i = new C0246a();

        C0246a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(z3.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String name = it.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.javaClass.name");
            return name;
        }
    }

    public static final Set a() {
        Set set = f43374a;
        if (set != null) {
            return set;
        }
        Set b4 = T.b();
        Iterator it = ServiceLoader.load(z3.b.class, z3.b.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "load(S::class.java, S::c…a.classLoader).iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            b4.add(next);
        }
        f43374a = b4;
        return T.a(b4);
    }

    public static final z3.b b(String libraryPackageName) {
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        Set a4 = a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a4) {
            if (Intrinsics.areEqual(((z3.b) obj).namespace(), libraryPackageName)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException(("More then one manifest found for " + libraryPackageName + ": " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, C0246a.f43375i, 31, null)).toString());
        }
        if (arrayList.size() == 1) {
            return (z3.b) arrayList.get(0);
        }
        try {
            String str = libraryPackageName + ".TracerLibraryManifest";
            Object newInstance = Class.forName(str).newInstance();
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type ru.ok.tracer.manifest.TracerLiteManifest");
            z3.b bVar = (z3.b) newInstance;
            if (Intrinsics.areEqual(bVar.namespace(), libraryPackageName)) {
                return bVar;
            }
            throw new IllegalStateException(("Unexpected " + str + ".namespace()").toString());
        } catch (Throwable th) {
            NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for " + libraryPackageName);
            noSuchElementException.initCause(th);
            throw noSuchElementException;
        }
    }
}
