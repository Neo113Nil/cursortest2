package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class pa0 implements qa0 {
    private final String identityHash;
    private final String legacyIdentityHash;
    private final int version;

    public pa0(String str, int i, String str2) {
        this.version = i;
        this.identityHash = str;
        this.legacyIdentityHash = str2;
    }

    public abstract void createAllTables(cb0 cb0Var);

    public abstract void dropAllTables(cb0 cb0Var);

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public abstract void onCreate(cb0 cb0Var);

    public abstract void onOpen(cb0 cb0Var);

    public abstract void onPostMigrate(cb0 cb0Var);

    public abstract void onPreMigrate(cb0 cb0Var);

    public abstract oa0 onValidateSchema(cb0 cb0Var);
}
