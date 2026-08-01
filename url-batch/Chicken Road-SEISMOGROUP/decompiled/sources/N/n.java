package N;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class n implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final n f411a;

    static {
        m mVar = m.f408a;
        f411a = new n();
    }

    @Override // N.k
    public final ByteBuffer a(String str, String str2) {
        l lVar = new l();
        lVar.write(1);
        m mVar = m.f408a;
        mVar.k(lVar, "error");
        mVar.k(lVar, str);
        lVar.write(0);
        mVar.k(lVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // N.k
    public final ByteBuffer d(A.a aVar) {
        l lVar = new l();
        m mVar = m.f408a;
        mVar.k(lVar, (String) aVar.f3c);
        mVar.k(lVar, aVar.f4d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // N.k
    public final ByteBuffer e(String str, String str2, Object obj) {
        l lVar = new l();
        lVar.write(1);
        m mVar = m.f408a;
        mVar.k(lVar, str);
        mVar.k(lVar, str2);
        if (obj instanceof Throwable) {
            mVar.k(lVar, Log.getStackTraceString((Throwable) obj));
        } else {
            mVar.k(lVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // N.k
    public final ByteBuffer f(Object obj) {
        l lVar = new l();
        lVar.write(0);
        m.f408a.k(lVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    @Override // N.k
    public final A.a g(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        m mVar = m.f408a;
        Object e2 = mVar.e(byteBuffer);
        Object e3 = mVar.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new A.a(12, (String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // N.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object e2 = m.f408a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        m mVar = m.f408a;
        Object e3 = mVar.e(byteBuffer);
        Object e4 = mVar.e(byteBuffer);
        Object e5 = mVar.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new g((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
