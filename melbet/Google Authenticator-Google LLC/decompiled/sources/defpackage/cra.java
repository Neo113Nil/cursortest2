package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cra extends Exception {
    public final clg a;

    public cra(clg clgVar) {
        oy.am(clgVar.b(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = clgVar;
    }
}
