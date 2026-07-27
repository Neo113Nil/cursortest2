package n1;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class S implements I1.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f11344c = new Status(8, "The connection to Google Play services was lost", null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f11345a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11346b;

    public S(S s2, I1.h hVar) {
        this.f11346b = s2;
        this.f11345a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        boolean z;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.f11345a).toArray(new BasePendingResult[0])) {
            basePendingResult.f4986g.set(null);
            synchronized (basePendingResult.f4982c) {
                try {
                    if (((GoogleApiClient) basePendingResult.f4983d.get()) != null) {
                        if (!basePendingResult.f4989j) {
                        }
                        synchronized (basePendingResult.f4982c) {
                            z = basePendingResult.f4987h;
                        }
                    }
                    basePendingResult.E();
                    synchronized (basePendingResult.f4982c) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                ((Set) this.f11345a).remove(basePendingResult);
            }
        }
    }

    public void b(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f11345a)) {
            hashMap = new HashMap((Map) this.f11345a);
        }
        synchronized (((Map) this.f11346b)) {
            hashMap2 = new HashMap((Map) this.f11346b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).F(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((I1.h) entry2.getKey()).c(new m1.f(status));
            }
        }
    }

    @Override // I1.c
    public void onComplete(Task task) {
        ((Map) ((S) this.f11346b).f11346b).remove((I1.h) this.f11345a);
    }

    public S(int i2) {
        switch (i2) {
            case 2:
                this.f11345a = Collections.synchronizedMap(new WeakHashMap());
                this.f11346b = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f11345a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.f11346b = new W1.e();
                break;
        }
    }
}
