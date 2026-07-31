package l4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final l4.c f18619a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18620b;

    /* renamed from: c, reason: collision with root package name */
    private final c f18621c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18622d;

    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l4.c f18623a;

        /* renamed from: l4.m$a$a, reason: collision with other inner class name */
        class C0093a extends b {
            C0093a(m mVar, CharSequence charSequence) {
                super(mVar, charSequence);
            }

            @Override // l4.m.b
            int e(int i7) {
                return i7 + 1;
            }

            @Override // l4.m.b
            int f(int i7) {
                return a.this.f18623a.c(this.f18625h, i7);
            }
        }

        a(l4.c cVar) {
            this.f18623a = cVar;
        }

        @Override // l4.m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(m mVar, CharSequence charSequence) {
            return new C0093a(mVar, charSequence);
        }
    }

    private static abstract class b extends l4.a<String> {

        /* renamed from: h, reason: collision with root package name */
        final CharSequence f18625h;

        /* renamed from: i, reason: collision with root package name */
        final l4.c f18626i;

        /* renamed from: j, reason: collision with root package name */
        final boolean f18627j;

        /* renamed from: k, reason: collision with root package name */
        int f18628k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f18629l;

        protected b(m mVar, CharSequence charSequence) {
            this.f18626i = mVar.f18619a;
            this.f18627j = mVar.f18620b;
            this.f18629l = mVar.f18622d;
            this.f18625h = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r6.f18626i.e(r6.f18625h.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            if (r6.f18626i.e(r6.f18625h.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            if (r6.f18627j == false) goto L39;
         */
        @Override // l4.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String a() {
            int i7;
            int f7;
            do {
                i7 = this.f18628k;
                while (true) {
                    int i8 = this.f18628k;
                    if (i8 == -1) {
                        return b();
                    }
                    f7 = f(i8);
                    if (f7 == -1) {
                        f7 = this.f18625h.length();
                        this.f18628k = -1;
                    } else {
                        this.f18628k = e(f7);
                    }
                    int i9 = this.f18628k;
                    if (i9 != i7) {
                        break;
                    }
                    int i10 = i9 + 1;
                    this.f18628k = i10;
                    if (i10 > this.f18625h.length()) {
                        this.f18628k = -1;
                    }
                }
            } while (i7 == f7);
            int i11 = this.f18629l;
            if (i11 == 1) {
                f7 = this.f18625h.length();
                this.f18628k = -1;
                while (f7 > i7 && this.f18626i.e(this.f18625h.charAt(f7 - 1))) {
                    f7--;
                }
            } else {
                this.f18629l = i11 - 1;
            }
            return this.f18625h.subSequence(i7, f7).toString();
        }

        abstract int e(int i7);

        abstract int f(int i7);
    }

    private interface c {
        Iterator<String> a(m mVar, CharSequence charSequence);
    }

    private m(c cVar) {
        this(cVar, false, l4.c.f(), Integer.MAX_VALUE);
    }

    private m(c cVar, boolean z6, l4.c cVar2, int i7) {
        this.f18621c = cVar;
        this.f18620b = z6;
        this.f18619a = cVar2;
        this.f18622d = i7;
    }

    public static m d(char c7) {
        return e(l4.c.d(c7));
    }

    public static m e(l4.c cVar) {
        j.i(cVar);
        return new m(new a(cVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f18621c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        j.i(charSequence);
        Iterator<String> g7 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g7.hasNext()) {
            arrayList.add(g7.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
