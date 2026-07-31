package androidx.room;

import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public abstract class t {
    public final int version;

    public t(int i3) {
        this.version = i3;
    }

    public abstract void createAllTables(InterfaceC1018a interfaceC1018a);

    public abstract void dropAllTables(InterfaceC1018a interfaceC1018a);

    public abstract void onCreate(InterfaceC1018a interfaceC1018a);

    public abstract void onOpen(InterfaceC1018a interfaceC1018a);

    public abstract void onPostMigrate(InterfaceC1018a interfaceC1018a);

    public abstract void onPreMigrate(InterfaceC1018a interfaceC1018a);

    public abstract u onValidateSchema(InterfaceC1018a interfaceC1018a);

    @L1.c
    public void validateMigration(InterfaceC1018a interfaceC1018a) {
        Z1.i.f(interfaceC1018a, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
