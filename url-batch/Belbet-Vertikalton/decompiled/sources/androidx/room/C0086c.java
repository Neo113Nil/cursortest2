package androidx.room;

import b1.EnumC0098a;
import com.winpower.neonfit.data.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: androidx.room.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086c extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public t1.a f2082b;

    /* renamed from: c, reason: collision with root package name */
    public int f2083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2084d;
    public final /* synthetic */ B1.c e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1.b f2085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Callable f2086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t1.b f2087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086c(w wVar, B1.c cVar, t1.b bVar, Callable callable, t1.b bVar2, a1.d dVar) {
        super(dVar);
        this.f2084d = wVar;
        this.e = cVar;
        this.f2085f = bVar;
        this.f2086g = callable;
        this.f2087h = bVar2;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        Callable callable = this.f2086g;
        t1.b bVar = this.f2087h;
        return new C0086c(this.f2084d, this.e, this.f2085f, callable, bVar, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0086c) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0178 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0014, B:9:0x0165, B:13:0x0170, B:15:0x0178, B:24:0x0028, B:80:0x015e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x018c -> B:9:0x0165). Please report as a decompilation issue!!! */
    @Override // c1.AbstractC0104a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        q qVar;
        t1.a aVar;
        boolean z2;
        Object obj3;
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f2083c;
        B1.c cVar = this.e;
        w wVar = this.f2084d;
        try {
            if (i == 0) {
                H1.d.i0(obj);
                r invalidationTracker = wVar.getInvalidationTracker();
                invalidationTracker.getClass();
                String[] strArr = (String[]) cVar.f68b;
                Y0.i iVar = new Y0.i();
                for (String str : strArr) {
                    Locale locale = Locale.US;
                    j1.h.d(locale, "US");
                    String lowerCase = str.toLowerCase(locale);
                    j1.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    HashMap hashMap = invalidationTracker.f2123c;
                    if (hashMap.containsKey(lowerCase)) {
                        String lowerCase2 = str.toLowerCase(locale);
                        j1.h.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        Object obj4 = hashMap.get(lowerCase2);
                        j1.h.b(obj4);
                        iVar.addAll((Collection) obj4);
                    } else {
                        iVar.add(str);
                    }
                }
                String[] strArr2 = (String[]) H1.d.i(iVar).toArray(new String[0]);
                ArrayList arrayList = new ArrayList(strArr2.length);
                for (String str2 : strArr2) {
                    LinkedHashMap linkedHashMap = invalidationTracker.f2124d;
                    Locale locale2 = Locale.US;
                    j1.h.d(locale2, "US");
                    String lowerCase3 = str2.toLowerCase(locale2);
                    j1.h.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                    Integer num = (Integer) linkedHashMap.get(lowerCase3);
                    if (num == null) {
                        throw new IllegalArgumentException("There is no table with name ".concat(str2));
                    }
                    arrayList.add(num);
                }
                int size = arrayList.size();
                int[] iArr = new int[size];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Number) it.next()).intValue();
                    i2++;
                }
                q qVar2 = new q(cVar, iArr, strArr2);
                synchronized (invalidationTracker.j) {
                    p.f fVar = invalidationTracker.j;
                    p.c a2 = fVar.a(cVar);
                    if (a2 != null) {
                        obj2 = a2.f3779b;
                    } else {
                        p.c cVar2 = new p.c(cVar, qVar2);
                        fVar.f3788d++;
                        p.c cVar3 = fVar.f3786b;
                        if (cVar3 == null) {
                            fVar.f3785a = cVar2;
                            fVar.f3786b = cVar2;
                        } else {
                            cVar3.f3780c = cVar2;
                            cVar2.f3781d = cVar3;
                            fVar.f3786b = cVar2;
                        }
                        obj2 = null;
                    }
                    qVar = (q) obj2;
                }
                if (qVar == null) {
                    p pVar = invalidationTracker.i;
                    int[] copyOf = Arrays.copyOf(iArr, size);
                    pVar.getClass();
                    j1.h.e(copyOf, "tableIds");
                    synchronized (pVar) {
                        z2 = false;
                        for (int i3 : copyOf) {
                            long[] jArr = pVar.f2112a;
                            long j = jArr[i3];
                            jArr[i3] = j + 1;
                            if (j == 0) {
                                pVar.f2115d = true;
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        AppDatabase_Impl appDatabase_Impl = invalidationTracker.f2121a;
                        if (appDatabase_Impl.isOpenInternal()) {
                            invalidationTracker.d(((l0.h) appDatabase_Impl.getOpenHelper()).d());
                        }
                    }
                }
                aVar = new t1.a(this.f2085f);
            } else if (i == 1) {
                t1.a aVar2 = this.f2082b;
                H1.d.i0(obj);
                aVar = aVar2;
                obj3 = obj;
                if (((Boolean) obj3).booleanValue()) {
                    wVar.getInvalidationTracker().b(cVar);
                    return W0.i.f1345a;
                }
                aVar.c();
                Object call = this.f2086g.call();
                t1.b bVar = this.f2087h;
                this.f2082b = aVar;
                this.f2083c = 2;
                if (bVar.a(call, this) == enumC0098a) {
                    return enumC0098a;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.a aVar3 = this.f2082b;
                H1.d.i0(obj);
                aVar = aVar3;
            }
            this.f2082b = aVar;
            this.f2083c = 1;
            obj3 = aVar.b(this);
            if (obj3 == enumC0098a) {
                return enumC0098a;
            }
            if (((Boolean) obj3).booleanValue()) {
            }
        } catch (Throwable th) {
            wVar.getInvalidationTracker().b(cVar);
            throw th;
        }
    }
}
