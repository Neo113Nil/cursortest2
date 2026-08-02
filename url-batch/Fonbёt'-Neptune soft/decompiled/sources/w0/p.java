package w0;

import P.O;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final p f3564a;

    static {
        o oVar = o.f3561a;
        f3564a = new p();
    }

    @Override // w0.m
    public final ByteBuffer a(Object obj) {
        n nVar = new n();
        nVar.write(0);
        o.f3561a.k(nVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nVar.size());
        allocateDirect.put(nVar.a(), 0, nVar.size());
        return allocateDirect;
    }

    @Override // w0.m
    public final O b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        o oVar = o.f3561a;
        Object e2 = oVar.e(byteBuffer);
        Object e3 = oVar.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new O(23, (String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // w0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object e2 = o.f3561a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        o oVar = o.f3561a;
        Object e3 = oVar.e(byteBuffer);
        Object e4 = oVar.e(byteBuffer);
        Object e5 = oVar.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C0321g((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // w0.m
    public final ByteBuffer d(String str, String str2) {
        n nVar = new n();
        nVar.write(1);
        o oVar = o.f3561a;
        oVar.k(nVar, "error");
        oVar.k(nVar, str);
        nVar.write(0);
        oVar.k(nVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nVar.size());
        allocateDirect.put(nVar.a(), 0, nVar.size());
        return allocateDirect;
    }

    @Override // w0.m
    public final ByteBuffer e(O o2) {
        n nVar = new n();
        o oVar = o.f3561a;
        oVar.k(nVar, (String) o2.f875f);
        oVar.k(nVar, o2.f876g);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nVar.size());
        allocateDirect.put(nVar.a(), 0, nVar.size());
        return allocateDirect;
    }

    @Override // w0.m
    public final ByteBuffer f(String str, String str2, Object obj) {
        n nVar = new n();
        nVar.write(1);
        o oVar = o.f3561a;
        oVar.k(nVar, str);
        oVar.k(nVar, str2);
        if (obj instanceof Throwable) {
            oVar.k(nVar, Log.getStackTraceString((Throwable) obj));
        } else {
            oVar.k(nVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nVar.size());
        allocateDirect.put(nVar.a(), 0, nVar.size());
        return allocateDirect;
    }
}
