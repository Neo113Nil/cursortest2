package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class con extends Fragment implements com {
    public static final WeakHashMap a = new WeakHashMap();
    private final coo b = new coo();

    @Override // defpackage.com
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.com
    public final void b(col colVar) {
        this.b.h(colVar);
    }

    @Override // defpackage.com
    public final col c(Class cls) {
        return this.b.j(cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b.d();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.e(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.b.f();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b.g();
    }
}
