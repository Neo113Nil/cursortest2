package b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FormBody.java */
/* loaded from: classes.dex */
public final class q extends ab {

    /* renamed from: a, reason: collision with root package name */
    private static final v f2119a = v.a("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f2120b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f2121c;

    q(List<String> list, List<String> list2) {
        this.f2120b = b.a.c.a(list);
        this.f2121c = b.a.c.a(list2);
    }

    @Override // b.ab
    public v a() {
        return f2119a;
    }

    @Override // b.ab
    public long b() {
        return a((c.d) null, true);
    }

    @Override // b.ab
    public void a(c.d dVar) throws IOException {
        a(dVar, false);
    }

    private long a(c.d dVar, boolean z) {
        c.c c2;
        if (z) {
            c2 = new c.c();
        } else {
            c2 = dVar.c();
        }
        int size = this.f2120b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c2.i(38);
            }
            c2.b(this.f2120b.get(i));
            c2.i(61);
            c2.b(this.f2121c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long b2 = c2.b();
        c2.s();
        return b2;
    }

    /* compiled from: FormBody.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f2122a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f2123b = new ArrayList();

        public a a(String str, String str2) {
            this.f2122a.add(t.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.f2123b.add(t.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public a b(String str, String str2) {
            this.f2122a.add(t.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.f2123b.add(t.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }

        public q a() {
            return new q(this.f2122a, this.f2123b);
        }
    }
}
