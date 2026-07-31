package q3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f20309a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map<j4.i<?>, Boolean> f20310b = Collections.synchronizedMap(new WeakHashMap());

    private final void f(boolean z6, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f20309a) {
            hashMap = new HashMap(this.f20309a);
        }
        synchronized (this.f20310b) {
            hashMap2 = new HashMap(this.f20310b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j4.i) entry2.getKey()).d(new p3.b(status));
            }
        }
    }

    final <TResult> void a(j4.i<TResult> iVar, boolean z6) {
        this.f20310b.put(iVar, Boolean.valueOf(z6));
        iVar.a().b(new x0(this, iVar));
    }

    final boolean b() {
        return (this.f20309a.isEmpty() && this.f20310b.isEmpty()) ? false : true;
    }

    public final void c() {
        f(false, e.f20240w);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void d(int i7, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 != 1) {
            str2 = i7 == 3 ? " due to dead object exception." : " due to service disconnection.";
            if (str != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str);
            }
            f(true, new Status(20, sb.toString()));
        }
        sb.append(str2);
        if (str != null) {
        }
        f(true, new Status(20, sb.toString()));
    }
}
