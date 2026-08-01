package ge;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w1 extends le.r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final long f4412s;

    public w1(long j, nd.c cVar) {
        super(cVar.getContext(), cVar);
        this.f4412s = j;
    }

    @Override // ge.k1
    public final String U() {
        return super.U() + "(timeMillis=" + this.f4412s + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoroutineContext coroutineContext = this.f4322i;
        a0.l(coroutineContext);
        w wVar = (w) coroutineContext.m(w.f4409i);
        String str = wVar != null ? wVar.f4410e : null;
        String str2 = "Timed out waiting for " + this.f4412s + " ms";
        if (str != null) {
            StringBuilder q3 = v4.a.q("Coroutine \"", str, "\" ");
            if (str2.length() > 0) {
                str2 = Character.toLowerCase(str2.charAt(0)) + str2.substring(1);
            }
            q3.append(str2);
            str2 = q3.toString();
        }
        n(new v1(str2, this));
    }
}
