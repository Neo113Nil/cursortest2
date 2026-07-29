package d;

import b.ab;
import b.s;
import b.w;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ParameterHandler.java */
/* loaded from: classes2.dex */
abstract class j<T> {
    abstract void a(d.l lVar, T t) throws IOException;

    j() {
    }

    final j<Iterable<T>> a() {
        return new j<Iterable<T>>() { // from class: d.j.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // d.j
            public void a(d.l lVar, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    j.this.a(lVar, it.next());
                }
            }
        };
    }

    final j<Object> b() {
        return new j<Object>() { // from class: d.j.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // d.j
            void a(d.l lVar, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    j.this.a(lVar, Array.get(obj, i2));
                }
            }
        };
    }

    /* compiled from: ParameterHandler.java */
    static final class m extends j<Object> {
        m() {
        }

        @Override // d.j
        void a(d.l lVar, Object obj) {
            lVar.a(obj);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class d<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f9581a;

        /* renamed from: b, reason: collision with root package name */
        private final d.e<T, String> f9582b;

        d(String str, d.e<T, String> eVar) {
            this.f9581a = (String) p.a(str, "name == null");
            this.f9582b = eVar;
        }

        @Override // d.j
        void a(d.l lVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            lVar.a(this.f9581a, this.f9582b.a(t));
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class h<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f9588a;

        /* renamed from: b, reason: collision with root package name */
        private final d.e<T, String> f9589b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f9590c;

        h(String str, d.e<T, String> eVar, boolean z) {
            this.f9588a = (String) p.a(str, "name == null");
            this.f9589b = eVar;
            this.f9590c = z;
        }

        @Override // d.j
        void a(d.l lVar, T t) throws IOException {
            if (t == null) {
                throw new IllegalArgumentException("Path parameter \"" + this.f9588a + "\" value must not be null.");
            }
            lVar.a(this.f9588a, this.f9589b.a(t), this.f9590c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class i<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f9591a;

        /* renamed from: b, reason: collision with root package name */
        private final d.e<T, String> f9592b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f9593c;

        i(String str, d.e<T, String> eVar, boolean z) {
            this.f9591a = (String) p.a(str, "name == null");
            this.f9592b = eVar;
            this.f9593c = z;
        }

        @Override // d.j
        void a(d.l lVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            lVar.b(this.f9591a, this.f9592b.a(t), this.f9593c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class k<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d.e<T, String> f9596a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9597b;

        k(d.e<T, String> eVar, boolean z) {
            this.f9596a = eVar;
            this.f9597b = z;
        }

        @Override // d.j
        void a(d.l lVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            lVar.b(this.f9596a.a(t), null, this.f9597b);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* renamed from: d.j$j, reason: collision with other inner class name */
    static final class C0418j<T> extends j<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final d.e<T, String> f9594a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9595b;

        C0418j(d.e<T, String> eVar, boolean z) {
            this.f9594a = eVar;
            this.f9595b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d.j
        public void a(d.l lVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Query map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                }
                lVar.b(key, this.f9594a.a(value), this.f9595b);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class e<T> extends j<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final d.e<T, String> f9583a;

        e(d.e<T, String> eVar) {
            this.f9583a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d.j
        public void a(d.l lVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Header map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                }
                lVar.a(key, this.f9583a.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class b<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f9576a;

        /* renamed from: b, reason: collision with root package name */
        private final d.e<T, String> f9577b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f9578c;

        b(String str, d.e<T, String> eVar, boolean z) {
            this.f9576a = (String) p.a(str, "name == null");
            this.f9577b = eVar;
            this.f9578c = z;
        }

        @Override // d.j
        void a(d.l lVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            lVar.c(this.f9576a, this.f9577b.a(t), this.f9578c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class c<T> extends j<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final d.e<T, String> f9579a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9580b;

        c(d.e<T, String> eVar, boolean z) {
            this.f9579a = eVar;
            this.f9580b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d.j
        public void a(d.l lVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Field map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                }
                lVar.c(key, this.f9579a.a(value), this.f9580b);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class f<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final s f9584a;

        /* renamed from: b, reason: collision with root package name */
        private final d.e<T, ab> f9585b;

        f(s sVar, d.e<T, ab> eVar) {
            this.f9584a = sVar;
            this.f9585b = eVar;
        }

        @Override // d.j
        void a(d.l lVar, T t) {
            if (t == null) {
                return;
            }
            try {
                lVar.a(this.f9584a, this.f9585b.a(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class l extends j<w.b> {

        /* renamed from: a, reason: collision with root package name */
        static final l f9598a = new l();

        private l() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d.j
        public void a(d.l lVar, w.b bVar) throws IOException {
            if (bVar != null) {
                lVar.a(bVar);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class g<T> extends j<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final d.e<T, ab> f9586a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9587b;

        g(d.e<T, ab> eVar, String str) {
            this.f9586a = eVar;
            this.f9587b = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // d.j
        public void a(d.l lVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                }
                lVar.a(s.a("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f9587b), this.f9586a.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class a<T> extends j<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d.e<T, ab> f9575a;

        a(d.e<T, ab> eVar) {
            this.f9575a = eVar;
        }

        @Override // d.j
        void a(d.l lVar, T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                lVar.a(this.f9575a.a(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }
}
