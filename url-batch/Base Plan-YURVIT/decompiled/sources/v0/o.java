package v0;

import N.P;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3092a;

    static {
        n nVar = n.f3089a;
        f3092a = new o();
    }

    @Override // v0.l
    public final ByteBuffer a(Object obj) {
        m mVar = new m();
        mVar.write(0);
        n.f3089a.k(mVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // v0.l
    public final ByteBuffer b(String str, String str2) {
        m mVar = new m();
        mVar.write(1);
        n nVar = n.f3089a;
        nVar.k(mVar, "error");
        nVar.k(mVar, str);
        nVar.k(mVar, null);
        nVar.k(mVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // v0.l
    public final ByteBuffer c(String str, String str2, Object obj) {
        m mVar = new m();
        mVar.write(1);
        n nVar = n.f3089a;
        nVar.k(mVar, str);
        nVar.k(mVar, str2);
        if (obj instanceof Throwable) {
            nVar.k(mVar, Log.getStackTraceString((Throwable) obj));
        } else {
            nVar.k(mVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // v0.l
    public final P d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        n nVar = n.f3089a;
        Object e2 = nVar.e(byteBuffer);
        Object e3 = nVar.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new P(25, (String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // v0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object e2 = n.f3089a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        n nVar = n.f3089a;
        Object e3 = nVar.e(byteBuffer);
        Object e4 = nVar.e(byteBuffer);
        Object e5 = nVar.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C0242g((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // v0.l
    public final ByteBuffer f(P p2) {
        m mVar = new m();
        n nVar = n.f3089a;
        nVar.k(mVar, (String) p2.f698f);
        nVar.k(mVar, p2.f699g);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }
}
