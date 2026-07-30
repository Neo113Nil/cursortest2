package g0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;
import s1.y2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k2 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3775g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f3776h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3777i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3778j;

    /* renamed from: k, reason: collision with root package name */
    public Object f3779k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3780l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3781m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3782n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3783o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(ContentResolver contentResolver, Uri uri, y2 y2Var, e7.e eVar, Context context, h6.d dVar) {
        super(2, dVar);
        this.f3779k = contentResolver;
        this.f3780l = uri;
        this.f3781m = y2Var;
        this.f3782n = eVar;
        this.f3783o = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q6.a, r6.l] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f3775g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k2 k2Var = new k2((r6.l) this.f3783o, dVar);
                k2Var.f3782n = obj;
                return k2Var;
            default:
                k2 k2Var2 = new k2((ContentResolver) this.f3779k, (Uri) this.f3780l, (y2) this.f3781m, (e7.e) this.f3782n, (Context) this.f3783o, dVar);
                k2Var2.f3777i = obj;
                return k2Var2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        f7.g gVar = (f7.g) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f3775g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((k2) create(gVar, dVar)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
            default:
                return ((k2) create(gVar, dVar)).invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0241, code lost:
    
        r7 = r22;
        r2 = 3;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #7 {all -> 0x002b, blocks: (B:9:0x0026, B:11:0x005b, B:16:0x0068, B:18:0x0070, B:27:0x003d, B:30:0x0052), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025d A[LOOP:0: B:50:0x018f->B:55:0x025d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v4, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r3v8, types: [q6.a, r6.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:11:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0240 -> B:41:0x0241). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e5.a aVar;
        f7.g gVar;
        i.b0 b0Var;
        q6.c aVar2;
        e7.i C;
        q0.g t2;
        q0.g j8;
        Object obj2;
        Object obj3;
        Set set;
        int i7;
        e5.a aVar3;
        long j9;
        char c4;
        f7.g gVar2;
        e7.b bVar;
        Object obj4;
        int i8 = 0;
        int i9 = 2;
        switch (this.f3775g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i6.a aVar4 = i6.a.f4956f;
                int i10 = this.f3776h;
                try {
                    if (i10 == 0) {
                        d6.a.e(obj);
                        gVar = (f7.g) this.f3782n;
                        b0Var = new i.b0();
                        aVar2 = new c1.a(9, b0Var);
                        C = j1.c.C(Integer.MAX_VALUE, 6, null);
                        a2.a aVar5 = new a2.a(3, C);
                        b1.b bVar2 = q0.n.f7426a;
                        q0.n.f(q0.m.f7424i);
                        synchronized (q0.n.f7427b) {
                            q0.n.f7432g = e6.l.q0(q0.n.f7432g, aVar5);
                        }
                        aVar = new e5.a(4, aVar5);
                        t2 = q0.n.k().t(aVar2);
                        ?? r12 = (r6.l) this.f3783o;
                        try {
                            j8 = t2.j();
                            try {
                                Object a3 = r12.a();
                                t2.c();
                                this.f3782n = gVar;
                                this.f3778j = b0Var;
                                this.f3779k = aVar2;
                                this.f3780l = C;
                                this.f3781m = aVar;
                                this.f3777i = a3;
                                this.f3776h = 1;
                                if (gVar.k(a3, this) == aVar4) {
                                    return aVar4;
                                }
                                obj2 = a3;
                            } finally {
                                q0.g.p(j8);
                            }
                        } finally {
                            t2.c();
                        }
                    } else if (i10 == 1) {
                        obj2 = this.f3777i;
                        aVar = (e5.a) this.f3781m;
                        C = (e7.i) this.f3780l;
                        aVar2 = (q6.c) this.f3779k;
                        b0Var = (i.b0) this.f3778j;
                        gVar = (f7.g) this.f3782n;
                        d6.a.e(obj);
                    } else if (i10 == 2) {
                        obj2 = this.f3777i;
                        aVar = (e5.a) this.f3781m;
                        C = (e7.i) this.f3780l;
                        aVar2 = (q6.c) this.f3779k;
                        b0Var = (i.b0) this.f3778j;
                        gVar = (f7.g) this.f3782n;
                        d6.a.e(obj);
                        obj3 = obj;
                        set = (Set) obj3;
                        i7 = i8;
                        while (true) {
                            if (i7 != 0) {
                                try {
                                    Object[] objArr = b0Var.f4722b;
                                    long[] jArr = b0Var.f4721a;
                                    int length = jArr.length - i9;
                                    if (length >= 0) {
                                        while (true) {
                                            long j10 = jArr[i8];
                                            aVar3 = aVar;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i11 = 8 - ((~(i8 - length)) >>> 31);
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    if ((j10 & 255) < 128) {
                                                        j9 = j10;
                                                        try {
                                                            if (set.contains(objArr[(i8 << 3) + i12])) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            aVar = aVar3;
                                                            aVar.c();
                                                            throw th;
                                                        }
                                                    } else {
                                                        j9 = j10;
                                                    }
                                                    j10 = j9 >> 8;
                                                }
                                                if (i11 != 8) {
                                                }
                                            }
                                            if (i8 != length) {
                                                i8++;
                                                aVar = aVar3;
                                            }
                                        }
                                    } else {
                                        aVar3 = aVar;
                                    }
                                    i7 = 0;
                                    set = (Set) e7.l.a(C.d());
                                    if (set != null) {
                                        aVar = aVar3;
                                        i8 = 0;
                                        i9 = 2;
                                    } else {
                                        if (i7 != 0) {
                                            b0Var.b();
                                            t2 = q0.n.k().t(aVar2);
                                            ?? r32 = (r6.l) this.f3783o;
                                            try {
                                                try {
                                                    Object a9 = r32.a();
                                                    t2.c();
                                                    if (!r6.k.a(a9, obj2)) {
                                                        this.f3782n = gVar;
                                                        this.f3778j = b0Var;
                                                        this.f3779k = aVar2;
                                                        this.f3780l = C;
                                                        aVar = aVar3;
                                                        this.f3781m = aVar;
                                                        this.f3777i = a9;
                                                        c4 = 3;
                                                        this.f3776h = 3;
                                                        if (gVar.k(a9, this) != aVar4) {
                                                            obj2 = a9;
                                                        }
                                                        return aVar4;
                                                    }
                                                    i8 = 0;
                                                    i9 = 2;
                                                } catch (Throwable th2) {
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                                j8 = t2.j();
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        aVar = aVar3;
                                        c4 = 3;
                                        i8 = 0;
                                        i9 = 2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    aVar3 = aVar;
                                }
                            } else {
                                aVar3 = aVar;
                            }
                            i7 = 1;
                            set = (Set) e7.l.a(C.d());
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f3777i;
                        aVar = (e5.a) this.f3781m;
                        C = (e7.i) this.f3780l;
                        aVar2 = (q6.c) this.f3779k;
                        b0Var = (i.b0) this.f3778j;
                        gVar = (f7.g) this.f3782n;
                        d6.a.e(obj);
                        c4 = 3;
                        i8 = 0;
                        i9 = 2;
                    }
                    this.f3782n = gVar;
                    this.f3778j = b0Var;
                    this.f3779k = aVar2;
                    this.f3780l = C;
                    this.f3781m = aVar;
                    this.f3777i = obj2;
                    this.f3776h = i9;
                    obj3 = C.a(this);
                    if (obj3 == aVar4) {
                        return aVar4;
                    }
                    set = (Set) obj3;
                    i7 = i8;
                    while (true) {
                        if (i7 != 0) {
                        }
                        i7 = 1;
                        set = (Set) e7.l.a(C.d());
                        if (set != null) {
                        }
                        aVar = aVar3;
                        i8 = 0;
                        i9 = 2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    aVar.c();
                    throw th;
                }
                break;
            default:
                y2 y2Var = (y2) this.f3781m;
                ContentResolver contentResolver = (ContentResolver) this.f3779k;
                i6.a aVar6 = i6.a.f4956f;
                int i13 = this.f3776h;
                try {
                    if (i13 == 0) {
                        d6.a.e(obj);
                        gVar2 = (f7.g) this.f3777i;
                        contentResolver.registerContentObserver((Uri) this.f3780l, false, y2Var);
                        bVar = new e7.b((e7.e) this.f3782n);
                    } else if (i13 == 1) {
                        e7.b bVar3 = (e7.b) this.f3778j;
                        gVar2 = (f7.g) this.f3777i;
                        d6.a.e(obj);
                        bVar = bVar3;
                        obj4 = obj;
                        if (((Boolean) obj4).booleanValue()) {
                            contentResolver.unregisterContentObserver(y2Var);
                            return d6.z.f2639a;
                        }
                        bVar.c();
                        Float f9 = new Float(Settings.Global.getFloat(((Context) this.f3783o).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.f3777i = gVar2;
                        this.f3778j = bVar;
                        this.f3776h = 2;
                        if (gVar2.k(f9, this) == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e7.b bVar4 = (e7.b) this.f3778j;
                        gVar2 = (f7.g) this.f3777i;
                        d6.a.e(obj);
                        bVar = bVar4;
                    }
                    this.f3777i = gVar2;
                    this.f3778j = bVar;
                    this.f3776h = 1;
                    obj4 = bVar.b(this);
                    if (obj4 == aVar6) {
                        return aVar6;
                    }
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(y2Var);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k2(q6.a aVar, h6.d dVar) {
        super(2, dVar);
        this.f3783o = (r6.l) aVar;
    }
}
