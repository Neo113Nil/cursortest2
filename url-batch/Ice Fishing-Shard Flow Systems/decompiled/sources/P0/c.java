package P0;

import G0.v;
import G0.x;
import G0.y;
import P.C0150o;
import U.u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.Q;
import androidx.lifecycle.C;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import g0.C0418K;
import g0.InterfaceC0419L;
import h0.C0465k;
import h4.C0483D;
import h4.z;
import i.AbstractActivityC0525l;
import i.C0511M;
import j4.C0573b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l5.AbstractC0663a;
import o.C0793a;
import o.C0795c;
import p1.C0819b;
import r6.t;
import s1.InterfaceC0875f;
import s4.w;
import t.C0899a;
import y4.C1046o;
import z1.AbstractC1053a;
import z1.C1054b;

/* loaded from: classes.dex */
public final class c implements InterfaceC0875f, y, N1.h, q6.d, OnCompleteListener, x4.o {

    /* renamed from: l, reason: collision with root package name */
    public static c f2186l;

    /* renamed from: m, reason: collision with root package name */
    public static z f2187m;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2188d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2189e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2190i;

    public c(N1.i iVar, N1.g gVar, L1.c cVar) {
        this.f2188d = 3;
        this.f2189e = iVar;
        this.f2190i = gVar;
    }

    public static boolean d(Editable editable, KeyEvent keyEvent, boolean z7) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
                for (u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // x4.o
    public void a(Exception exc) {
        ((e) this.f2190i).g(d4.c.N(exc));
    }

    @Override // s1.InterfaceC0875f
    public void accept(Object obj, Object obj2) {
        int i2;
        D1.f fVar = (D1.f) this.f2189e;
        D1.b bVar = (D1.b) obj;
        D1.e eVar = new D1.e(fVar, (K1.h) obj2);
        Context context = fVar.f7449a;
        try {
            i2 = C1054b.a(context).f3070a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = 0;
        }
        C0819b c0819b = (C0819b) this.f2190i;
        c0819b.f7158n = i2;
        D1.c cVar = (D1.c) bVar.i();
        r1.h hVar = new r1.h(-1, -1, 0, true);
        Parcelable.Creator<r1.g> creator = r1.g.CREATOR;
        r1.g gVar = new r1.g(hVar, false);
        gVar.f7442i = false;
        boolean z7 = gVar.f7442i;
        r1.g gVar2 = new r1.g(gVar.f7440d, true);
        gVar2.f7442i = z7;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i5 = D1.a.f348a;
        obtain.writeStrongBinder(eVar);
        obtain.writeInt(1);
        c0819b.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar2.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f349e.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // N1.j
    public Object b() {
        return new L1.f(((N1.i) this.f2189e).f1819d, (N1.p) ((N1.j) this.f2190i).b(), new L1.c(4));
    }

    @Override // x4.o
    public void c() {
        ArrayList arrayList = (ArrayList) this.f2189e;
        arrayList.add(0, null);
        ((e) this.f2190i).g(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    @Override // q6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(q6.e eVar, V5.b bVar) {
        q6.j jVar;
        W5.a aVar;
        int i2;
        Throwable th;
        t tVar;
        c cVar;
        q6.e eVar2;
        q6.d dVar;
        switch (this.f2188d) {
            case 9:
                if (bVar instanceof q6.j) {
                    jVar = (q6.j) bVar;
                    int i5 = jVar.f7379e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jVar.f7379e = i5 - Integer.MIN_VALUE;
                        Object obj = jVar.f7378d;
                        aVar = W5.a.f2787d;
                        i2 = jVar.f7379e;
                        if (i2 != 0) {
                            V6.b.P(obj);
                            t tVar2 = new t(eVar, jVar.getContext());
                            try {
                                C0150o c0150o = (C0150o) this.f2189e;
                                jVar.f7381l = this;
                                jVar.f7382m = eVar;
                                jVar.f7383n = tVar2;
                                jVar.f7379e = 1;
                                if (c0150o.invoke(tVar2, jVar) == aVar) {
                                    return aVar;
                                }
                                cVar = this;
                                eVar2 = eVar;
                                tVar = tVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                tVar = tVar2;
                                tVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                V6.b.P(obj);
                                return Unit.f6114a;
                            }
                            tVar = jVar.f7383n;
                            eVar2 = jVar.f7382m;
                            cVar = jVar.f7381l;
                            try {
                                V6.b.P(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                tVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        tVar.releaseIntercepted();
                        dVar = (q6.d) cVar.f2190i;
                        jVar.f7381l = null;
                        jVar.f7382m = null;
                        jVar.f7383n = null;
                        jVar.f7379e = 2;
                        if (dVar.e(eVar2, jVar) == aVar) {
                            return aVar;
                        }
                        return Unit.f6114a;
                    }
                }
                jVar = new q6.j(this, bVar);
                Object obj2 = jVar.f7378d;
                aVar = W5.a.f2787d;
                i2 = jVar.f7379e;
                if (i2 != 0) {
                }
                tVar.releaseIntercepted();
                dVar = (q6.d) cVar.f2190i;
                jVar.f7381l = null;
                jVar.f7382m = null;
                jVar.f7383n = null;
                jVar.f7379e = 2;
                if (dVar.e(eVar2, jVar) == aVar) {
                }
                return Unit.f6114a;
            default:
                Object e7 = ((q6.d) this.f2189e).e(new C1046o(eVar, (T.d) this.f2190i, 3), bVar);
                return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
        }
    }

    public void f(ComponentCallbacksC0228t f7, Bundle bundle, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.f(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void g(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        Q q4 = (Q) this.f2189e;
        AbstractActivityC0525l abstractActivityC0525l = q4.f3633v.f3823e;
        ComponentCallbacksC0228t componentCallbacksC0228t = q4.f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.g(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void h(ComponentCallbacksC0228t f7, Bundle bundle, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.h(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void i(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.i(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void j(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.j(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void k(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.k(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void l(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        Q q4 = (Q) this.f2189e;
        AbstractActivityC0525l abstractActivityC0525l = q4.f3633v.f3823e;
        ComponentCallbacksC0228t componentCallbacksC0228t = q4.f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.l(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void m(ComponentCallbacksC0228t f7, Bundle bundle, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.m(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void n(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.n(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((s) this.f2190i).f2252e).remove((K1.h) this.f2189e);
    }

    public void p(ComponentCallbacksC0228t f7, Bundle outState, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.p(f7, outState, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void q(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void r(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.r(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public void s(ComponentCallbacksC0228t f7, boolean z7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        ComponentCallbacksC0228t componentCallbacksC0228t = ((Q) this.f2189e).f3635x;
        if (componentCallbacksC0228t != null) {
            Q e7 = componentCallbacksC0228t.e();
            Intrinsics.checkNotNullExpressionValue(e7, "parent.getParentFragmentManager()");
            e7.f3625n.s(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2190i).iterator();
        if (it.hasNext()) {
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public View t(int i2, int i5, int i7, int i8) {
        C0418K c0418k = (C0418K) this.f2190i;
        InterfaceC0419L interfaceC0419L = (InterfaceC0419L) this.f2189e;
        int p7 = interfaceC0419L.p();
        int g7 = interfaceC0419L.g();
        int i9 = i5 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i5) {
            View n7 = interfaceC0419L.n(i2);
            int h7 = interfaceC0419L.h(n7);
            int r7 = interfaceC0419L.r(n7);
            c0418k.f4889b = p7;
            c0418k.f4890c = g7;
            c0418k.f4891d = h7;
            c0418k.f4892e = r7;
            if (i7 != 0) {
                c0418k.f4888a = i7;
                if (c0418k.a()) {
                    return n7;
                }
            }
            if (i8 != 0) {
                c0418k.f4888a = i8;
                if (c0418k.a()) {
                    view = n7;
                }
            }
            i2 += i9;
        }
        return view;
    }

    public ArrayList u(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2189e;
        C0465k g7 = C0465k.g(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            g7.l(1);
        } else {
            g7.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            ArrayList arrayList = new ArrayList(J7.getCount());
            while (J7.moveToNext()) {
                arrayList.add(J7.isNull(0) ? null : J7.getString(0));
            }
            return arrayList;
        } finally {
            J7.close();
            g7.h();
        }
    }

    public boolean v(CharSequence charSequence, int i2, int i5, U.n nVar) {
        if (nVar.f2681c == 0) {
            U.g gVar = (U.g) this.f2190i;
            V.a b7 = nVar.b();
            int a7 = b7.a(8);
            if (a7 != 0) {
                ((ByteBuffer) b7.f1145l).getShort(a7 + b7.f1142d);
            }
            U.d dVar = (U.d) gVar;
            dVar.getClass();
            ThreadLocal threadLocal = U.d.f2660b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i5) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            nVar.f2681c = dVar.f2661a.hasGlyph(sb.toString()) ? 2 : 1;
        }
        return nVar.f2681c == 2;
    }

    public void w(AbstractC1053a abstractC1053a) {
        boolean z7;
        C c7 = (C) this.f2189e;
        synchronized (c7.f3838a) {
            z7 = c7.f3843f == C.f3837k;
            c7.f3843f = abstractC1053a;
        }
        if (z7) {
            C0793a T4 = C0793a.T();
            F.b bVar = c7.j;
            C0795c c0795c = T4.f7106b;
            if (c0795c.f7110d == null) {
                synchronized (c0795c.f7108b) {
                    try {
                        if (c0795c.f7110d == null) {
                            c0795c.f7110d = C0795c.T(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c0795c.f7110d.post(bVar);
        }
        if (abstractC1053a instanceof x) {
            ((R0.k) this.f2190i).i((x) abstractC1053a);
        } else if (abstractC1053a instanceof v) {
            ((R0.k) this.f2190i).j(((v) abstractC1053a).f835c);
        }
    }

    public MotionEvent x(C0483D c0483d) {
        long j = c0483d.f5172a;
        LongSparseArray longSparseArray = (LongSparseArray) this.f2189e;
        PriorityQueue priorityQueue = (PriorityQueue) this.f2190i;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j);
        longSparseArray.remove(j);
        return motionEvent;
    }

    public void y(int i2, int i5, int i7, int i8) {
        C0899a c0899a = (C0899a) this.f2190i;
        c0899a.f7871l.set(i2, i5, i7, i8);
        Rect rect = c0899a.f7870i;
        super/*android.view.View*/.setPadding(i2 + rect.left, i5 + rect.top, i7 + rect.right, i8 + rect.bottom);
    }

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f2188d = i2;
        this.f2189e = obj;
        this.f2190i = obj2;
    }

    public c(s sVar, K1.h hVar) {
        this.f2188d = 12;
        this.f2189e = hVar;
        Objects.requireNonNull(sVar);
        this.f2190i = sVar;
    }

    public c(u4.a aVar, l4.b bVar) {
        this.f2188d = 14;
        this.f2189e = aVar;
        this.f2190i = bVar;
        bVar.f6272e = new C0511M(22, this);
    }

    public c(WorkDatabase_Impl database) {
        this.f2188d = 0;
        this.f2189e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f2190i = new b(database, 0);
    }

    public c(Q fragmentManager) {
        this.f2188d = 5;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f2189e = fragmentManager;
        this.f2190i = new CopyOnWriteArrayList();
    }

    public c(int i2) {
        this.f2188d = i2;
        switch (i2) {
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f2189e = new LongSparseArray();
                this.f2190i = new PriorityQueue();
                break;
            case 16:
                this.f2189e = new ReentrantLock();
                this.f2190i = new LinkedHashMap();
                break;
            default:
                this.f2189e = new C();
                this.f2190i = new R0.k();
                w(y.f837c);
                break;
        }
    }

    public c(C0573b c0573b) {
        this.f2188d = 10;
        l4.b bVar = new l4.b(8, this);
        s4.q qVar = new s4.q(c0573b, "flutter/localization", s4.l.f7766a);
        this.f2189e = qVar;
        qVar.b(bVar);
    }

    public c(C0573b c0573b, PackageManager packageManager) {
        this.f2188d = 11;
        C0511M c0511m = new C0511M(13, this);
        this.f2189e = packageManager;
        new s4.q(c0573b, "flutter/processtext", w.f7775a).b(c0511m);
    }

    public c(AbstractC0663a abstractC0663a) {
        this.f2188d = 8;
        this.f2189e = abstractC0663a;
    }

    public c(i iVar, q1.h hVar, U.d dVar) {
        this.f2188d = 4;
        this.f2189e = iVar;
        this.f2190i = dVar;
    }

    public c(InterfaceC0419L interfaceC0419L) {
        this.f2188d = 6;
        this.f2189e = interfaceC0419L;
        C0418K c0418k = new C0418K();
        c0418k.f4888a = 0;
        this.f2190i = c0418k;
    }

    public c(C0899a c0899a) {
        this.f2188d = 13;
        this.f2190i = c0899a;
    }
}
