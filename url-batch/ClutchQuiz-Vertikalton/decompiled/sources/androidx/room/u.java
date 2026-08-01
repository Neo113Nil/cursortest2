package androidx.room;

import i0.InterfaceC0142a;

/* loaded from: classes.dex */
public abstract class u {
    public final int version;

    public u(int i) {
        this.version = i;
    }

    public abstract void createAllTables(InterfaceC0142a interfaceC0142a);

    public abstract void dropAllTables(InterfaceC0142a interfaceC0142a);

    public abstract void onCreate(InterfaceC0142a interfaceC0142a);

    public abstract void onOpen(InterfaceC0142a interfaceC0142a);

    public abstract void onPostMigrate(InterfaceC0142a interfaceC0142a);

    public abstract void onPreMigrate(InterfaceC0142a interfaceC0142a);

    public abstract v onValidateSchema(InterfaceC0142a interfaceC0142a);

    public void validateMigration(InterfaceC0142a interfaceC0142a) {
        g1.f.e(interfaceC0142a, "db");
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
