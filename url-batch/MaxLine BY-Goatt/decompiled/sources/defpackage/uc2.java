package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface uc2 extends AutoCloseable {
    boolean E();

    void a(double d, int i);

    void c(int i);

    void d(long j, int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    String j(int i);

    void reset();

    void w(int i, String str);
}
