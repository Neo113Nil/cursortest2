package A2;

import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private int f90b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f91c;

        a(f fVar) {
            this.f91c = fVar;
            this.f90b = fVar.f();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f91c;
            int f4 = fVar.f();
            int i4 = this.f90b;
            this.f90b = i4 - 1;
            return fVar.i(f4 - i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f90b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private int f92b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f93c;

        b(f fVar) {
            this.f93c = fVar;
            this.f92b = fVar.f();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f93c;
            int f4 = fVar.f();
            int i4 = this.f92b;
            this.f92b = i4 - 1;
            return fVar.g(f4 - i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f92b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f94b;

        public c(f fVar) {
            this.f94b = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f94b);
        }
    }

    public static final class d implements Iterable, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f95b;

        public d(f fVar) {
            this.f95b = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f95b);
        }
    }

    public static final Iterable a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new d(fVar);
    }
}
