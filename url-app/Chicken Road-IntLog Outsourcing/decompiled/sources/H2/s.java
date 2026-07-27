package H2;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class s implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final s f1151b = new s(r.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    public final r f1152a;

    public s(r rVar) {
        this.f1152a = rVar;
    }

    @Override // H2.p
    public final ByteBuffer a(Object obj) {
        q qVar = new q();
        qVar.write(0);
        this.f1152a.writeValue(qVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(qVar.size());
        allocateDirect.put(qVar.a(), 0, qVar.size());
        return allocateDirect;
    }

    @Override // H2.p
    public final ByteBuffer b(String str, String str2) {
        q qVar = new q();
        qVar.write(1);
        r rVar = this.f1152a;
        rVar.writeValue(qVar, "error");
        rVar.writeValue(qVar, str);
        rVar.writeValue(qVar, null);
        rVar.writeValue(qVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(qVar.size());
        allocateDirect.put(qVar.a(), 0, qVar.size());
        return allocateDirect;
    }

    @Override // H2.p
    public final ByteBuffer c(String str, String str2, Object obj) {
        q qVar = new q();
        qVar.write(1);
        r rVar = this.f1152a;
        rVar.writeValue(qVar, str);
        rVar.writeValue(qVar, str2);
        if (obj instanceof Throwable) {
            rVar.writeValue(qVar, Log.getStackTraceString((Throwable) obj));
        } else {
            rVar.writeValue(qVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(qVar.size());
        allocateDirect.put(qVar.a(), 0, qVar.size());
        return allocateDirect;
    }

    @Override // H2.p
    public final l d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        r rVar = this.f1152a;
        Object readValue = rVar.readValue(byteBuffer);
        Object readValue2 = rVar.readValue(byteBuffer);
        if (!(readValue instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new l(readValue2, (String) readValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // H2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b6 = byteBuffer.get();
        r rVar = this.f1152a;
        if (b6 == 0) {
            Object readValue = rVar.readValue(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return readValue;
            }
        }
        Object readValue2 = rVar.readValue(byteBuffer);
        Object readValue3 = rVar.readValue(byteBuffer);
        Object readValue4 = rVar.readValue(byteBuffer);
        if ((readValue2 instanceof String) && ((readValue3 == null || (readValue3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new h((String) readValue2, (String) readValue3, readValue4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // H2.p
    public final ByteBuffer f(l lVar) {
        q qVar = new q();
        r rVar = this.f1152a;
        rVar.writeValue(qVar, lVar.f1146a);
        rVar.writeValue(qVar, lVar.f1147b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(qVar.size());
        allocateDirect.put(qVar.a(), 0, qVar.size());
        return allocateDirect;
    }
}
