package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface hy1 extends AutoCloseable {
    void Y1f8riQaR6yg(int i, long j);

    String dgRBjINgWbAK(int i);

    void e9gEMXR7LXtO();

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    default boolean jyegZNwi31qc() {
        return getLong(0) != 0;
    }

    void reset();

    boolean tmVwIGCQF4zR();

    void wdg6QnbFHrFF(String str, int i);
}
