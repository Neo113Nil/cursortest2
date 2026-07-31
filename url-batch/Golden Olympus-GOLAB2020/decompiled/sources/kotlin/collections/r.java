package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r extends CollectionsKt__IterablesKt {

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enumeration f41100b;

        a(Enumeration enumeration) {
            this.f41100b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41100b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f41100b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static <T> Iterator<T> iterator(@NotNull Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return new a(enumeration);
    }
}
