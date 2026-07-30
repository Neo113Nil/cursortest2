package s4;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class w implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final w f7775a;

    static {
        v vVar = v.f7772a;
        f7775a = new w();
    }

    @Override // s4.r
    public final ByteBuffer a(Object obj) {
        u uVar = new u();
        uVar.write(0);
        v.f7772a.k(uVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(uVar.size());
        allocateDirect.put(uVar.a(), 0, uVar.size());
        return allocateDirect;
    }

    @Override // s4.r
    public final ByteBuffer b(n nVar) {
        u uVar = new u();
        v vVar = v.f7772a;
        vVar.k(uVar, nVar.f7767a);
        vVar.k(uVar, nVar.f7768b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(uVar.size());
        allocateDirect.put(uVar.a(), 0, uVar.size());
        return allocateDirect;
    }

    @Override // s4.r
    public final ByteBuffer c(String str, String str2) {
        u uVar = new u();
        uVar.write(1);
        v vVar = v.f7772a;
        vVar.k(uVar, "error");
        vVar.k(uVar, str);
        vVar.k(uVar, null);
        vVar.k(uVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(uVar.size());
        allocateDirect.put(uVar.a(), 0, uVar.size());
        return allocateDirect;
    }

    @Override // s4.r
    public final ByteBuffer d(String str, String str2, Object obj) {
        u uVar = new u();
        uVar.write(1);
        v vVar = v.f7772a;
        vVar.k(uVar, str);
        vVar.k(uVar, str2);
        if (obj instanceof Throwable) {
            vVar.k(uVar, Log.getStackTraceString((Throwable) obj));
        } else {
            vVar.k(uVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(uVar.size());
        allocateDirect.put(uVar.a(), 0, uVar.size());
        return allocateDirect;
    }

    @Override // s4.r
    public final n e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        v vVar = v.f7772a;
        Object e7 = vVar.e(byteBuffer);
        Object e8 = vVar.e(byteBuffer);
        if (!(e7 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new n(e8, (String) e7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // s4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b7 = byteBuffer.get();
        if (b7 == 0) {
            Object e7 = v.f7772a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e7;
            }
        }
        v vVar = v.f7772a;
        Object e8 = vVar.e(byteBuffer);
        Object e9 = vVar.e(byteBuffer);
        Object e10 = vVar.e(byteBuffer);
        if ((e8 instanceof String) && ((e9 == null || (e9 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new j((String) e8, (String) e9, e10);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
