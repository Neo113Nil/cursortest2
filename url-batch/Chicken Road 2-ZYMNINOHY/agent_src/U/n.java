package U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f3061a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    void e();

    k f(k kVar);

    void flush();

    void reset();

    default long g(long j4) {
        return j4;
    }
}
