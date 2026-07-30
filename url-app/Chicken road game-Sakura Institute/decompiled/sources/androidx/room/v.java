package androidx.room;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v {
    public final int version;

    public v(int i7) {
        this.version = i7;
    }

    public abstract void createAllTables(y3.a aVar);

    public abstract void dropAllTables(y3.a aVar);

    public abstract void onCreate(y3.a aVar);

    public abstract void onOpen(y3.a aVar);

    public abstract void onPostMigrate(y3.a aVar);

    public abstract void onPreMigrate(y3.a aVar);

    public abstract w onValidateSchema(y3.a aVar);

    @d6.c
    public void validateMigration(y3.a aVar) {
        r6.k.f(aVar, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
