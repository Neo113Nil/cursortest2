package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.measurement.aa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 implements i0 {

    /* renamed from: d, reason: collision with root package name */
    public final v f1388d;

    /* renamed from: e, reason: collision with root package name */
    public final y f1389e;

    /* renamed from: f, reason: collision with root package name */
    public final y f1390f;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f1391h;

    /* renamed from: l, reason: collision with root package name */
    public final Lock f1394l;
    public final Set g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    public z6.b f1392i = null;
    public z6.b j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1393k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f1395m = 0;

    public w0(Context context, v vVar, ReentrantLock reentrantLock, Looper looper, z6.g gVar, s.e eVar, s.e eVar2, g2 g2Var, aa aaVar, ArrayList arrayList, ArrayList arrayList2, s.e eVar3, s.e eVar4) {
        this.f1388d = vVar;
        this.f1394l = reentrantLock;
        this.f1389e = new y(context, vVar, reentrantLock, looper, gVar, eVar2, null, eVar4, null, arrayList2, new v0(this, 0));
        this.f1390f = new y(context, vVar, reentrantLock, looper, gVar, eVar, g2Var, eVar3, aaVar, arrayList, new v0(this, 1));
        s.e eVar5 = new s.e(0);
        Iterator it = ((s.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            eVar5.put((a7.c) it.next(), this.f1389e);
        }
        Iterator it2 = ((s.b) eVar.keySet()).iterator();
        while (it2.hasNext()) {
            eVar5.put((a7.c) it2.next(), this.f1390f);
        }
        Collections.unmodifiableMap(eVar5);
    }

    @Override // b7.i0
    public final void a() {
        this.f1395m = 2;
        this.f1393k = false;
        this.j = null;
        this.f1392i = null;
        this.f1389e.a();
        this.f1390f.a();
    }

    @Override // b7.i0
    public final void b() {
        this.j = null;
        this.f1392i = null;
        this.f1395m = 0;
        this.f1389e.b();
        this.f1390f.b();
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.f1395m == 1) goto L16;
     */
    @Override // b7.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        this.f1394l.lock();
        try {
            boolean z10 = false;
            if (this.f1389e.f1405n instanceof j) {
                if (!(this.f1390f.f1405n instanceof j)) {
                    z6.b bVar = this.j;
                    if (!(bVar != null && bVar.f10867e == 4)) {
                    }
                }
                z10 = true;
            }
            return z10;
        } finally {
            this.f1394l.unlock();
        }
    }

    @Override // b7.i0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f1390f.d(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f1389e.d(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void e() {
        Set set = this.g;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw v4.a.i(it);
        }
        set.clear();
    }

    public final void f() {
        z6.b bVar;
        z6.b bVar2;
        z6.b bVar3;
        z6.b bVar4 = this.f1392i;
        y yVar = this.f1389e;
        if (bVar4 == null || !bVar4.c()) {
            z6.b bVar5 = this.f1392i;
            y yVar2 = this.f1390f;
            if (bVar5 != null && (bVar2 = this.j) != null && bVar2.c()) {
                yVar2.b();
                z6.b bVar6 = this.f1392i;
                c7.c0.g(bVar6);
                g(bVar6);
                return;
            }
            z6.b bVar7 = this.f1392i;
            if (bVar7 == null || (bVar = this.j) == null) {
                return;
            }
            if (yVar2.f1406o < yVar.f1406o) {
                bVar7 = bVar;
            }
            g(bVar7);
            return;
        }
        z6.b bVar8 = this.j;
        if ((bVar8 == null || !bVar8.c()) && ((bVar3 = this.j) == null || bVar3.f10867e != 4)) {
            if (bVar3 != null) {
                if (this.f1395m == 1) {
                    e();
                    return;
                } else {
                    g(bVar3);
                    yVar.b();
                    return;
                }
            }
            return;
        }
        int i3 = this.f1395m;
        if (i3 != 1) {
            if (i3 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.f1395m = 0;
            } else {
                v vVar = this.f1388d;
                c7.c0.g(vVar);
                vVar.b(this.f1391h);
            }
        }
        e();
        this.f1395m = 0;
    }

    public final void g(z6.b bVar) {
        int i3 = this.f1395m;
        if (i3 != 1) {
            if (i3 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f1395m = 0;
            }
            this.f1388d.a(bVar);
        }
        e();
        this.f1395m = 0;
    }
}
