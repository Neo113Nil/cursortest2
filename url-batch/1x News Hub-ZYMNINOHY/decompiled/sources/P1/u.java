package P1;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class u implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final u f1272b = new u(t.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    public final t f1273a;

    public u(t tVar) {
        this.f1273a = tVar;
    }

    @Override // P1.p
    public final ByteBuffer a(l lVar) {
        s sVar = new s();
        t tVar = this.f1273a;
        tVar.writeValue(sVar, lVar.f1266a);
        tVar.writeValue(sVar, lVar.f1267b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sVar.size());
        allocateDirect.put(sVar.a(), 0, sVar.size());
        return allocateDirect;
    }

    @Override // P1.p
    public final ByteBuffer b(Object obj) {
        s sVar = new s();
        sVar.write(0);
        this.f1273a.writeValue(sVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sVar.size());
        allocateDirect.put(sVar.a(), 0, sVar.size());
        return allocateDirect;
    }

    @Override // P1.p
    public final ByteBuffer c(String str, String str2) {
        s sVar = new s();
        sVar.write(1);
        t tVar = this.f1273a;
        tVar.writeValue(sVar, "error");
        tVar.writeValue(sVar, str);
        tVar.writeValue(sVar, null);
        tVar.writeValue(sVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sVar.size());
        allocateDirect.put(sVar.a(), 0, sVar.size());
        return allocateDirect;
    }

    @Override // P1.p
    public final ByteBuffer d(String str, String str2, Object obj) {
        s sVar = new s();
        sVar.write(1);
        t tVar = this.f1273a;
        tVar.writeValue(sVar, str);
        tVar.writeValue(sVar, str2);
        if (obj instanceof Throwable) {
            tVar.writeValue(sVar, Log.getStackTraceString((Throwable) obj));
        } else {
            tVar.writeValue(sVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sVar.size());
        allocateDirect.put(sVar.a(), 0, sVar.size());
        return allocateDirect;
    }

    @Override // P1.p
    public final l e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        t tVar = this.f1273a;
        Object readValue = tVar.readValue(byteBuffer);
        Object readValue2 = tVar.readValue(byteBuffer);
        if (!(readValue instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new l(readValue2, (String) readValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // P1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b3 = byteBuffer.get();
        t tVar = this.f1273a;
        if (b3 == 0) {
            Object readValue = tVar.readValue(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return readValue;
            }
        }
        Object readValue2 = tVar.readValue(byteBuffer);
        Object readValue3 = tVar.readValue(byteBuffer);
        Object readValue4 = tVar.readValue(byteBuffer);
        if ((readValue2 instanceof String) && ((readValue3 == null || (readValue3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new h((String) readValue2, (String) readValue3, readValue4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
