package m5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m5.q;

/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final r f19262b = new r(q.f19259a);

    /* renamed from: a, reason: collision with root package name */
    private final q f19263a;

    public r(q qVar) {
        this.f19263a = qVar;
    }

    private static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // m5.l
    public ByteBuffer a(Object obj) {
        q.a aVar = new q.a();
        aVar.write(0);
        this.f19263a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // m5.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        q.a aVar = new q.a();
        aVar.write(1);
        this.f19263a.p(aVar, str);
        this.f19263a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f19263a.p(aVar, g((Throwable) obj));
        } else {
            this.f19263a.p(aVar, obj);
        }
        this.f19263a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // m5.l
    public ByteBuffer c(String str, String str2, Object obj) {
        q.a aVar = new q.a();
        aVar.write(1);
        this.f19263a.p(aVar, str);
        this.f19263a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f19263a.p(aVar, g((Throwable) obj));
        } else {
            this.f19263a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // m5.l
    public j d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f7 = this.f19263a.f(byteBuffer);
        Object f8 = this.f19263a.f(byteBuffer);
        if (!(f7 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new j((String) f7, f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // m5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b7 = byteBuffer.get();
        if (b7 == 0) {
            Object f7 = this.f19263a.f(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return f7;
            }
        }
        Object f8 = this.f19263a.f(byteBuffer);
        Object f9 = this.f19263a.f(byteBuffer);
        Object f10 = this.f19263a.f(byteBuffer);
        if ((f8 instanceof String) && ((f9 == null || (f9 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new e((String) f8, (String) f9, f10);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // m5.l
    public ByteBuffer f(j jVar) {
        q.a aVar = new q.a();
        this.f19263a.p(aVar, jVar.f19247a);
        this.f19263a.p(aVar, jVar.f19248b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }
}
