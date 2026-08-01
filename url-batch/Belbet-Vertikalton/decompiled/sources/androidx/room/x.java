package androidx.room;

import k0.InterfaceC0199a;

/* loaded from: classes.dex */
public abstract class x {
    public final int version;

    public x(int i) {
        this.version = i;
    }

    public abstract void createAllTables(InterfaceC0199a interfaceC0199a);

    public abstract void dropAllTables(InterfaceC0199a interfaceC0199a);

    public abstract void onCreate(InterfaceC0199a interfaceC0199a);

    public abstract void onOpen(InterfaceC0199a interfaceC0199a);

    public abstract void onPostMigrate(InterfaceC0199a interfaceC0199a);

    public abstract void onPreMigrate(InterfaceC0199a interfaceC0199a);

    public abstract y onValidateSchema(InterfaceC0199a interfaceC0199a);

    public void validateMigration(InterfaceC0199a interfaceC0199a) {
        j1.h.e(interfaceC0199a, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
