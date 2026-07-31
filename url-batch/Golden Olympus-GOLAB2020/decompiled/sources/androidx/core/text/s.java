package androidx.core.text;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f11867a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final r f11868b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final r f11869c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f11870d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f11871e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f11872f;

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f11873b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f11874a;

        private a(boolean z4) {
            this.f11874a = z4;
        }

        @Override // androidx.core.text.s.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z4 = false;
            while (i4 < i6) {
                int a4 = s.a(Character.getDirectionality(charSequence.charAt(i4)));
                if (a4 != 0) {
                    if (a4 != 1) {
                        continue;
                        i4++;
                        z4 = z4;
                    } else if (!this.f11874a) {
                        return 1;
                    }
                } else if (this.f11874a) {
                    return 0;
                }
                z4 = true;
                i4++;
                z4 = z4;
            }
            if (z4) {
                return this.f11874a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f11875a = new b();

        private b() {
        }

        @Override // androidx.core.text.s.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int i7 = 2;
            while (i4 < i6 && i7 == 2) {
                i7 = s.b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return i7;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i4, int i5);
    }

    private static abstract class d implements r {

        /* renamed from: a, reason: collision with root package name */
        private final c f11876a;

        d(c cVar) {
            this.f11876a = cVar;
        }

        private boolean c(CharSequence charSequence, int i4, int i5) {
            int a4 = this.f11876a.a(charSequence, i4, i5);
            if (a4 == 0) {
                return true;
            }
            if (a4 != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.r
        public boolean a(CharSequence charSequence, int i4, int i5) {
            if (charSequence == null || i4 < 0 || i5 < 0 || charSequence.length() - i5 < i4) {
                throw new IllegalArgumentException();
            }
            return this.f11876a == null ? b() : c(charSequence, i4, i5);
        }

        protected abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11877b;

        e(c cVar, boolean z4) {
            super(cVar);
            this.f11877b = z4;
        }

        @Override // androidx.core.text.s.d
        protected boolean b() {
            return this.f11877b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f11878b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.s.d
        protected boolean b() {
            return t.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f11875a;
        f11869c = new e(bVar, false);
        f11870d = new e(bVar, true);
        f11871e = new e(a.f11873b, false);
        f11872f = f.f11878b;
    }

    static int a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
