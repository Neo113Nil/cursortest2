package i5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    default boolean A() {
        return getLong(0) != 0;
    }

    boolean E();

    void f(int i3, long j);

    void g();

    int getColumnCount();

    String getColumnName(int i3);

    long getLong(int i3);

    boolean isNull(int i3);

    String k(int i3);

    void q(String str);

    void reset();
}
