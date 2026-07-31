package O3;

import android.util.Log;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import u0.C0675e;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1774a;

    static {
        l lVar = l.f1771a;
        f1774a = new m();
    }

    @Override // O3.j
    public final ByteBuffer a(C0675e c0675e) {
        k kVar = new k();
        l lVar = l.f1771a;
        l.j(kVar, (String) c0675e.f5975b);
        l.j(kVar, c0675e.f5976c);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // O3.j
    public final ByteBuffer c(Object obj) {
        k kVar = new k();
        kVar.write(0);
        l lVar = l.f1771a;
        l.j(kVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // O3.j
    public final ByteBuffer d(String str, String str2) {
        k kVar = new k();
        kVar.write(1);
        l lVar = l.f1771a;
        l.j(kVar, "error");
        l.j(kVar, str);
        l.j(kVar, null);
        l.j(kVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // O3.j
    public final ByteBuffer e(String str, String str2, Object obj) {
        k kVar = new k();
        kVar.write(1);
        l lVar = l.f1771a;
        l.j(kVar, str);
        l.j(kVar, str2);
        if (obj instanceof Throwable) {
            l.j(kVar, Log.getStackTraceString((Throwable) obj));
        } else {
            l.j(kVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // O3.j
    public final C0675e g(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        l lVar = l.f1771a;
        Serializable d7 = l.d(byteBuffer);
        Serializable d8 = l.d(byteBuffer);
        if (!(d7 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C0675e((String) d7, 6, d8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // O3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b7 = byteBuffer.get();
        if (b7 == 0) {
            l lVar = l.f1771a;
            Serializable d7 = l.d(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return d7;
            }
        }
        l lVar2 = l.f1771a;
        Serializable d8 = l.d(byteBuffer);
        Serializable d9 = l.d(byteBuffer);
        Serializable d10 = l.d(byteBuffer);
        if ((d8 instanceof String) && ((d9 == null || (d9 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new f((String) d8, (String) d9, d10);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
