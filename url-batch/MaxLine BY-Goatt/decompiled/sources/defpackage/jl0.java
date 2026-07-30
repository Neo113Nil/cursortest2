package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jl0 extends il0 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ ml0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl0(ml0 ml0Var, File file) {
        super(file);
        file.getClass();
        this.f = ml0Var;
    }

    @Override // defpackage.nl0
    public final File a() {
        ol0 ol0Var = this.f.p;
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            Function1 function1 = ol0Var.c;
            if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                File[] listFiles = file.listFiles();
                this.c = listFiles;
                if (listFiles == null) {
                    Function2 function2 = ol0Var.e;
                    if (function2 != null) {
                        File file2 = this.a;
                        function2.invoke(file2, new m1(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    this.e = true;
                }
            }
            return null;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d < fileArr.length) {
            fileArr.getClass();
            int i = this.d;
            this.d = i + 1;
            return fileArr[i];
        }
        if (!this.b) {
            this.b = true;
            return file;
        }
        Function1 function12 = ol0Var.d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
