package androidx.work;

import android.net.Network;
import android.net.Uri;
import d0.f;
import d0.o;
import d0.v;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    private UUID f1406a;

    /* renamed from: b, reason: collision with root package name */
    private b f1407b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f1408c;

    /* renamed from: d, reason: collision with root package name */
    private a f1409d;

    /* renamed from: e, reason: collision with root package name */
    private int f1410e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f1411f;

    /* renamed from: g, reason: collision with root package name */
    private n0.a f1412g;

    /* renamed from: h, reason: collision with root package name */
    private v f1413h;

    /* renamed from: i, reason: collision with root package name */
    private o f1414i;

    /* renamed from: j, reason: collision with root package name */
    private f f1415j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f1416a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f1417b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f1418c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i7, Executor executor, n0.a aVar2, v vVar, o oVar, f fVar) {
        this.f1406a = uuid;
        this.f1407b = bVar;
        this.f1408c = new HashSet(collection);
        this.f1409d = aVar;
        this.f1410e = i7;
        this.f1411f = executor;
        this.f1412g = aVar2;
        this.f1413h = vVar;
        this.f1414i = oVar;
        this.f1415j = fVar;
    }

    public Executor a() {
        return this.f1411f;
    }

    public f b() {
        return this.f1415j;
    }

    public UUID c() {
        return this.f1406a;
    }

    public b d() {
        return this.f1407b;
    }

    public Network e() {
        return this.f1409d.f1418c;
    }

    public o f() {
        return this.f1414i;
    }

    public int g() {
        return this.f1410e;
    }

    public Set<String> h() {
        return this.f1408c;
    }

    public n0.a i() {
        return this.f1412g;
    }

    public List<String> j() {
        return this.f1409d.f1416a;
    }

    public List<Uri> k() {
        return this.f1409d.f1417b;
    }

    public v l() {
        return this.f1413h;
    }
}
