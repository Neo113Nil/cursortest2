package K1;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1439a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1440b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1441c;

    public m() {
        this.f1440b = new Object();
    }

    public void a(double d7, double d8) {
        double[] dArr = (double[]) this.f1440b;
        double d9 = 1.0d;
        if (!this.f1439a) {
            d9 = 1.0d / (((dArr[7] * d8) + (dArr[3] * d7)) + dArr[15]);
        }
        double d10 = ((dArr[4] * d8) + (dArr[0] * d7) + dArr[12]) * d9;
        double d11 = ((dArr[5] * d8) + (dArr[1] * d7) + dArr[13]) * d9;
        double[] dArr2 = (double[]) this.f1441c;
        if (d10 < dArr2[0]) {
            dArr2[0] = d10;
        } else if (d10 > dArr2[1]) {
            dArr2[1] = d10;
        }
        if (d11 < dArr2[2]) {
            dArr2[2] = d11;
        } else if (d11 > dArr2[3]) {
            dArr2[3] = d11;
        }
    }

    public void b(l lVar) {
        synchronized (this.f1440b) {
            try {
                if (((ArrayDeque) this.f1441c) == null) {
                    this.f1441c = new ArrayDeque();
                }
                ((ArrayDeque) this.f1441c).add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Task task) {
        l lVar;
        synchronized (this.f1440b) {
            if (((ArrayDeque) this.f1441c) != null && !this.f1439a) {
                this.f1439a = true;
                while (true) {
                    synchronized (this.f1440b) {
                        try {
                            lVar = (l) ((ArrayDeque) this.f1441c).poll();
                            if (lVar == null) {
                                this.f1439a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.a(task);
                }
            }
        }
    }

    public m(boolean z7, double[] dArr, double[] dArr2) {
        this.f1439a = z7;
        this.f1440b = dArr;
        this.f1441c = dArr2;
    }
}
