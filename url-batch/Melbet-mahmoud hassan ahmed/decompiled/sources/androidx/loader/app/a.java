package androidx.loader.app;

import androidx.lifecycle.i;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends i & x> a b(T t6) {
        return new b(t6, t6.c());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
