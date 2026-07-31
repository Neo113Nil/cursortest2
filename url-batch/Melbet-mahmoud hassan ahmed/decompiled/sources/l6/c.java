package l6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
final class c implements k6.b<i6.c> {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f18808a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18809b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18810c;

    /* renamed from: d, reason: collision with root package name */
    private final f6.p<CharSequence, Integer, v5.j<Integer, Integer>> f18811d;

    public static final class a implements Iterator<i6.c> {

        /* renamed from: f, reason: collision with root package name */
        private int f18812f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f18813g;

        /* renamed from: h, reason: collision with root package name */
        private int f18814h;

        /* renamed from: i, reason: collision with root package name */
        private i6.c f18815i;

        /* renamed from: j, reason: collision with root package name */
        private int f18816j;

        a() {
            int e7;
            e7 = i6.f.e(c.this.f18809b, 0, c.this.f18808a.length());
            this.f18813g = e7;
            this.f18814h = e7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f18817k.f18810c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void a() {
            i6.c g7;
            i6.c cVar;
            if (this.f18814h < 0) {
                this.f18812f = 0;
                this.f18815i = null;
                return;
            }
            int i7 = -1;
            if (c.this.f18810c > 0) {
                int i8 = this.f18816j + 1;
                this.f18816j = i8;
            }
            if (this.f18814h <= c.this.f18808a.length()) {
                v5.j jVar = (v5.j) c.this.f18811d.invoke(c.this.f18808a, Integer.valueOf(this.f18814h));
                if (jVar == null) {
                    cVar = new i6.c(this.f18813g, n.u(c.this.f18808a));
                    this.f18815i = cVar;
                    this.f18814h = i7;
                    this.f18812f = 1;
                }
                int intValue = ((Number) jVar.a()).intValue();
                int intValue2 = ((Number) jVar.b()).intValue();
                g7 = i6.f.g(this.f18813g, intValue);
                this.f18815i = g7;
                int i9 = intValue + intValue2;
                this.f18813g = i9;
                i7 = i9 + (intValue2 == 0 ? 1 : 0);
                this.f18814h = i7;
                this.f18812f = 1;
            }
            cVar = new i6.c(this.f18813g, n.u(c.this.f18808a));
            this.f18815i = cVar;
            this.f18814h = i7;
            this.f18812f = 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i6.c next() {
            if (this.f18812f == -1) {
                a();
            }
            if (this.f18812f == 0) {
                throw new NoSuchElementException();
            }
            i6.c cVar = this.f18815i;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f18815i = null;
            this.f18812f = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18812f == -1) {
                a();
            }
            return this.f18812f == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i7, int i8, f6.p<? super CharSequence, ? super Integer, v5.j<Integer, Integer>> pVar) {
        kotlin.jvm.internal.i.d(charSequence, "input");
        kotlin.jvm.internal.i.d(pVar, "getNextMatch");
        this.f18808a = charSequence;
        this.f18809b = i7;
        this.f18810c = i8;
        this.f18811d = pVar;
    }

    @Override // k6.b
    public Iterator<i6.c> iterator() {
        return new a();
    }
}
