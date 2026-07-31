package t1;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n2.l;
import n2.t;
import t1.x;

/* loaded from: classes.dex */
public final class m implements x.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f22119a;

    /* renamed from: b, reason: collision with root package name */
    private l.a f22120b;

    /* renamed from: c, reason: collision with root package name */
    private long f22121c;

    /* renamed from: d, reason: collision with root package name */
    private long f22122d;

    /* renamed from: e, reason: collision with root package name */
    private long f22123e;

    /* renamed from: f, reason: collision with root package name */
    private float f22124f;

    /* renamed from: g, reason: collision with root package name */
    private float f22125g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final w0.r f22126a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Integer, l4.o<x.a>> f22127b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Set<Integer> f22128c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Map<Integer, x.a> f22129d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private l.a f22130e;

        public a(w0.r rVar) {
            this.f22126a = rVar;
        }

        public void a(l.a aVar) {
            if (aVar != this.f22130e) {
                this.f22130e = aVar;
                this.f22127b.clear();
                this.f22129d.clear();
            }
        }
    }

    public m(Context context, w0.r rVar) {
        this(new t.a(context), rVar);
    }

    public m(l.a aVar, w0.r rVar) {
        this.f22120b = aVar;
        a aVar2 = new a(rVar);
        this.f22119a = aVar2;
        aVar2.a(aVar);
        this.f22121c = -9223372036854775807L;
        this.f22122d = -9223372036854775807L;
        this.f22123e = -9223372036854775807L;
        this.f22124f = -3.4028235E38f;
        this.f22125g = -3.4028235E38f;
    }
}
