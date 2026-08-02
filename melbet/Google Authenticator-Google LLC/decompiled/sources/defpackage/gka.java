package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import j$.time.Duration;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gka {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gka(Context context, gzp gzpVar, esk eskVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.c = context;
        this.d = hoq.v(new eks(context, 11));
        this.a = ((Boolean) gzpVar.d(false)).booleanValue();
        this.e = eskVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi a(int i, String str) {
        return !this.a ? hve.a : hoq.at(((gnp) this.e).a(), new gia(new axv(this, i, str, 4), 15), this.c);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi b(hvi hviVar, String str, int i, Duration duration) {
        str.getClass();
        return !this.a ? hve.a : hoq.at(((gnp) this.e).a(), new gia(new gjy(this, hviVar, str, i, duration, 0), 13), this.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi c(String str, int i) {
        str.getClass();
        return !this.a ? hve.a : hoq.at(((gnp) this.e).a(), new gia(new axv(this, str, i, 3), 14), this.c);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, koe] */
    public final void d(hvi hviVar, WorkerParameters workerParameters, Duration duration) {
        Object obj = this.b;
        String b = gcv.b(workerParameters);
        iwq iwqVar = (iwq) ((gzs) obj).a.b();
        try {
            hnu.aR(hviVar);
            Object obj2 = this.c;
            Object obj3 = ((ikj) obj2).b;
            Object obj4 = ((ikj) obj2).a;
            iwqVar.e((String) obj3, (String) obj4, b, "success");
            iwqVar.f(duration.toMillis(), (String) obj3, (String) obj4, b, "success");
        } catch (CancellationException unused) {
            ikj ikjVar = (ikj) this.c;
            Object obj5 = ikjVar.b;
            String str = (String) ikjVar.a;
            String str2 = (String) obj5;
            iwqVar.e(str2, str, b, "cancellation");
            iwqVar.f(duration.toMillis(), str2, str, b, "cancellation");
        } catch (Exception unused2) {
            ikj ikjVar2 = (ikj) this.c;
            Object obj6 = ikjVar2.b;
            String str3 = (String) ikjVar2.a;
            String str4 = (String) obj6;
            iwqVar.e(str4, str3, b, "failure");
            iwqVar.f(duration.toMillis(), str4, str3, b, "failure");
        }
    }

    public final boolean e() {
        return this.a;
    }

    public gka(gzp gzpVar, gzp gzpVar2, hvl hvlVar, gzp gzpVar3, ikj ikjVar) {
        this.a = ((Boolean) gzpVar.d(false)).booleanValue();
        this.b = gzpVar2;
        this.d = hvlVar;
        this.e = gzpVar3;
        this.c = ikjVar;
    }

    public gka(boolean z, koe koeVar, hvl hvlVar, gnp gnpVar, ikj ikjVar, byte[] bArr) {
        koeVar.getClass();
        hvlVar.getClass();
        gnpVar.getClass();
        ikjVar.getClass();
        this.a = z;
        this.b = koeVar;
        this.c = hvlVar;
        this.e = gnpVar;
        this.d = ikjVar;
    }

    public gka(boolean z, koe koeVar, hvl hvlVar, gnp gnpVar, ikj ikjVar) {
        koeVar.getClass();
        hvlVar.getClass();
        gnpVar.getClass();
        ikjVar.getClass();
        this.a = z;
        this.b = koeVar;
        this.c = hvlVar;
        this.e = gnpVar;
        this.d = ikjVar;
    }
}
