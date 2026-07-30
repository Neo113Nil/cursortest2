package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ll0 extends il0 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ ml0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll0(ml0 ml0Var, File file) {
        super(file);
        file.getClass();
        this.e = ml0Var;
    }

    @Override // defpackage.nl0
    public final File a() {
        Function2 function2;
        ol0 ol0Var = this.e.p;
        boolean z = this.b;
        File file = this.a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (function2 = ol0Var.e) != null) {
                        File file2 = this.a;
                        function2.invoke(file2, new m1(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = ol0Var.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.c;
                fileArr3.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
            Function1 function12 = ol0Var.d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = ol0Var.c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}
