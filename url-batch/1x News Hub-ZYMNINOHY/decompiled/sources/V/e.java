package V;

import O1.k;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import c.C0199d;
import com.google.android.gms.tasks.Task;
import d1.i;
import java.util.ArrayDeque;
import n.C1120f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1591a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1592b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1593c;

    public e() {
        this.f1591a = new Object();
    }

    public void a(double d3, double d4) {
        boolean z = this.f1592b;
        double[] dArr = (double[]) this.f1591a;
        double d5 = 1.0d;
        if (!z) {
            d5 = 1.0d / (((dArr[7] * d4) + (dArr[3] * d3)) + dArr[15]);
        }
        double d6 = ((dArr[4] * d4) + (dArr[0] * d3) + dArr[12]) * d5;
        double d7 = ((dArr[5] * d4) + (dArr[1] * d3) + dArr[13]) * d5;
        double[] dArr2 = (double[]) this.f1593c;
        if (d6 < dArr2[0]) {
            dArr2[0] = d6;
        } else if (d6 > dArr2[1]) {
            dArr2[1] = d6;
        }
        if (d7 < dArr2[2]) {
            dArr2[2] = d7;
        } else if (d7 > dArr2[3]) {
            dArr2[3] = d7;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.m, java.lang.Object] */
    public void b() {
        ?? r02 = this.f1591a;
        o e3 = r02.e();
        if (e3.f2389c != h.f2380b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e3.a(new b(0, r02));
        k kVar = (k) this.f1593c;
        kVar.getClass();
        if (kVar.f1180a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e3.a(new C0199d(2, kVar));
        kVar.f1180a = true;
        this.f1592b = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.m, java.lang.Object] */
    public void c(Bundle bundle) {
        if (!this.f1592b) {
            b();
        }
        o e3 = this.f1591a.e();
        if (e3.f2389c.compareTo(h.f2382d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e3.f2389c).toString());
        }
        k kVar = (k) this.f1593c;
        if (!kVar.f1180a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (kVar.f1181b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        kVar.f1184e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        kVar.f1181b = true;
    }

    public void d(i iVar) {
        synchronized (this.f1591a) {
            try {
                if (((ArrayDeque) this.f1593c) == null) {
                    this.f1593c = new ArrayDeque();
                }
                ((ArrayDeque) this.f1593c).add(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Task task) {
        i iVar;
        synchronized (this.f1591a) {
            if (((ArrayDeque) this.f1593c) != null && !this.f1592b) {
                this.f1592b = true;
                while (true) {
                    synchronized (this.f1591a) {
                        try {
                            iVar = (i) ((ArrayDeque) this.f1593c).poll();
                            if (iVar == null) {
                                this.f1592b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    iVar.a(task);
                }
            }
        }
    }

    public e(f fVar) {
        this.f1591a = fVar;
        k kVar = new k();
        kVar.f1183d = new C1120f();
        kVar.f1182c = true;
        this.f1593c = kVar;
    }

    public e(boolean z, double[] dArr, double[] dArr2) {
        this.f1592b = z;
        this.f1591a = dArr;
        this.f1593c = dArr2;
    }
}
