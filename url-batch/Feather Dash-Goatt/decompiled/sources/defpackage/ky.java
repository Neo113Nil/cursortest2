package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ky extends hy {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ ly e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(ly lyVar, File file) {
        super(file);
        file.getClass();
        this.e = lyVar;
    }

    @Override // defpackage.my
    public final File a() {
        Function2 function2;
        ny nyVar = this.e.h;
        boolean z = this.b;
        File file = this.a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (function2 = nyVar.e) != null) {
                        File file2 = this.a;
                        function2.b(file2, new y0(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = nyVar.d;
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
            Function1 function12 = nyVar.d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = nyVar.c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}
