package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.c0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0114a {
        androidx.loader.content.b onCreateLoader(int i4, Bundle bundle);

        void onLoadFinished(androidx.loader.content.b bVar, Object obj);

        void onLoaderReset(androidx.loader.content.b bVar);
    }

    public static a b(InterfaceC1354u interfaceC1354u) {
        return new b(interfaceC1354u, ((c0) interfaceC1354u).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract androidx.loader.content.b c(int i4, Bundle bundle, InterfaceC0114a interfaceC0114a);

    public abstract void d();
}
