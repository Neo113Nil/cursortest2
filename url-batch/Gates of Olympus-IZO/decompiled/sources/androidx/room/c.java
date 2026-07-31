package androidx.room;

import I.T;
import com.gates.olympus.miruv.data.db.MiruvDatabase_Impl;
import i.C0458c;
import i.C0461f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import k2.InterfaceC0550w;
import m2.C0628c;

/* loaded from: classes.dex */
public final class c extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public C0628c f4054e;

    /* renamed from: f, reason: collision with root package name */
    public int f4055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f4056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2.c f4057h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m2.e f4058i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Callable f4059j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m2.e f4060k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s sVar, C2.c cVar, m2.e eVar, Callable callable, m2.e eVar2, P1.d dVar) {
        super(2, dVar);
        this.f4056g = sVar;
        this.f4057h = cVar;
        this.f4058i = eVar;
        this.f4059j = callable;
        this.f4060k = eVar2;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        Callable callable = this.f4059j;
        m2.e eVar = this.f4060k;
        return new c(this.f4056g, this.f4057h, this.f4058i, callable, eVar, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((c) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x015e A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0014, B:9:0x014b, B:13:0x0156, B:15:0x015e, B:24:0x0028, B:75:0x0144), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0175  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0172 -> B:9:0x014b). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        n nVar;
        C0628c c0628c;
        boolean z3;
        Object obj3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4055f;
        C2.c cVar = this.f4057h;
        s sVar = this.f4056g;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                o invalidationTracker = sVar.getInvalidationTracker();
                invalidationTracker.getClass();
                String[] strArr = (String[]) cVar.f484e;
                N1.i iVar = new N1.i();
                for (String str : strArr) {
                    Locale locale = Locale.US;
                    Z1.i.e(locale, "US");
                    String lowerCase = str.toLowerCase(locale);
                    Z1.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    HashMap hashMap = invalidationTracker.f4091c;
                    if (hashMap.containsKey(lowerCase)) {
                        String lowerCase2 = str.toLowerCase(locale);
                        Z1.i.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        Object obj4 = hashMap.get(lowerCase2);
                        Z1.i.c(obj4);
                        iVar.addAll((Collection) obj4);
                    } else {
                        iVar.add(str);
                    }
                }
                String[] strArr2 = (String[]) I2.d.n(iVar).toArray(new String[0]);
                ArrayList arrayList = new ArrayList(strArr2.length);
                for (String str2 : strArr2) {
                    LinkedHashMap linkedHashMap = invalidationTracker.f4092d;
                    Locale locale2 = Locale.US;
                    Z1.i.e(locale2, "US");
                    String lowerCase3 = str2.toLowerCase(locale2);
                    Z1.i.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                    Integer num = (Integer) linkedHashMap.get(lowerCase3);
                    if (num == null) {
                        throw new IllegalArgumentException("There is no table with name ".concat(str2));
                    }
                    arrayList.add(num);
                }
                int[] B02 = M1.l.B0(arrayList);
                n nVar2 = new n(cVar, B02, strArr2);
                synchronized (invalidationTracker.f4098j) {
                    C0461f c0461f = invalidationTracker.f4098j;
                    C0458c b2 = c0461f.b(cVar);
                    if (b2 != null) {
                        obj2 = b2.f5087e;
                    } else {
                        C0458c c0458c = new C0458c(cVar, nVar2);
                        c0461f.f5096g++;
                        C0458c c0458c2 = c0461f.f5094e;
                        if (c0458c2 == null) {
                            c0461f.f5093d = c0458c;
                            c0461f.f5094e = c0458c;
                        } else {
                            c0458c2.f5088f = c0458c;
                            c0458c.f5089g = c0458c2;
                            c0461f.f5094e = c0458c;
                        }
                        obj2 = null;
                    }
                    nVar = (n) obj2;
                }
                if (nVar == null) {
                    T t3 = invalidationTracker.f4097i;
                    int[] copyOf = Arrays.copyOf(B02, B02.length);
                    t3.getClass();
                    Z1.i.f(copyOf, "tableIds");
                    synchronized (t3) {
                        z3 = false;
                        for (int i4 : copyOf) {
                            long[] jArr = (long[]) t3.f2198b;
                            long j3 = jArr[i4];
                            jArr[i4] = j3 + 1;
                            if (j3 == 0) {
                                t3.f2197a = true;
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        MiruvDatabase_Impl miruvDatabase_Impl = invalidationTracker.f4089a;
                        if (miruvDatabase_Impl.isOpenInternal()) {
                            invalidationTracker.d(((w1.g) miruvDatabase_Impl.getOpenHelper()).a());
                        }
                    }
                }
                c0628c = new C0628c(this.f4058i);
            } else if (i3 == 1) {
                C0628c c0628c2 = this.f4054e;
                I2.l.Q(obj);
                c0628c = c0628c2;
                obj3 = obj;
                if (((Boolean) obj3).booleanValue()) {
                    sVar.getInvalidationTracker().b(cVar);
                    return L1.z.f2729a;
                }
                c0628c.c();
                Object call = this.f4059j.call();
                m2.e eVar = this.f4060k;
                this.f4054e = c0628c;
                this.f4055f = 2;
                if (eVar.d(this, call) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0628c c0628c3 = this.f4054e;
                I2.l.Q(obj);
                c0628c = c0628c3;
            }
            this.f4054e = c0628c;
            this.f4055f = 1;
            obj3 = c0628c.b(this);
            if (obj3 == aVar) {
                return aVar;
            }
            if (((Boolean) obj3).booleanValue()) {
            }
        } catch (Throwable th) {
            sVar.getInvalidationTracker().b(cVar);
            throw th;
        }
    }
}
