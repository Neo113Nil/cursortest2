package n0;

import android.util.Log;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final m f936a;

    static {
        l lVar = l.f933a;
        f936a = new m();
    }

    @Override // n0.j
    public final ByteBuffer c(Object obj) {
        k kVar = new k();
        kVar.write(0);
        l lVar = l.f933a;
        l.j(kVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // n0.j
    public final c0.a d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        l lVar = l.f933a;
        Serializable e2 = l.e(byteBuffer);
        Serializable e3 = l.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new c0.a((String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // n0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            l lVar = l.f933a;
            Serializable e2 = l.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        l lVar2 = l.f933a;
        Serializable e3 = l.e(byteBuffer);
        Serializable e4 = l.e(byteBuffer);
        Serializable e5 = l.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new f((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // n0.j
    public final ByteBuffer f(String str, String str2) {
        k kVar = new k();
        kVar.write(1);
        l lVar = l.f933a;
        l.j(kVar, "error");
        l.j(kVar, str);
        l.j(kVar, null);
        l.j(kVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // n0.j
    public final ByteBuffer g(c0.a aVar) {
        k kVar = new k();
        l lVar = l.f933a;
        l.j(kVar, (String) aVar.f66c);
        l.j(kVar, aVar.f67d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // n0.j
    public final ByteBuffer h(String str, String str2, Object obj) {
        k kVar = new k();
        kVar.write(1);
        l lVar = l.f933a;
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
}
