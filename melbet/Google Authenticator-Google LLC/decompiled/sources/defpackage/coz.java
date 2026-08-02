package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coz extends bd implements com {
    public static final WeakHashMap a = new WeakHashMap();
    private final coo b = new coo();

    @Override // defpackage.bd
    public final void T(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.T(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    @Override // defpackage.bd
    public final void W(int i, int i2, Intent intent) {
        super.W(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // defpackage.bd
    public final void Z() {
        super.Z();
        this.b.c();
    }

    @Override // defpackage.com
    public final Activity a() {
        return D();
    }

    @Override // defpackage.bd
    public final void ac() {
        super.ac();
        this.b.d();
    }

    @Override // defpackage.com
    public final void b(col colVar) {
        this.b.h(colVar);
    }

    @Override // defpackage.com
    public final col c(Class cls) {
        return this.b.j(cls);
    }

    @Override // defpackage.bd
    public final void f(Bundle bundle) {
        super.f(bundle);
        this.b.b(bundle);
    }

    @Override // defpackage.bd
    public final void i(Bundle bundle) {
        this.b.e(bundle);
    }

    @Override // defpackage.bd
    public final void j() {
        super.j();
        this.b.f();
    }

    @Override // defpackage.bd
    public final void k() {
        super.k();
        this.b.g();
    }
}
