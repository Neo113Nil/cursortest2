package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iy extends hy {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ ly f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(ly lyVar, File file) {
        super(file);
        file.getClass();
        this.f = lyVar;
    }

    @Override // defpackage.my
    public final File a() {
        ny nyVar = this.f.h;
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            Function1 function1 = nyVar.c;
            if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                File[] listFiles = file.listFiles();
                this.c = listFiles;
                if (listFiles == null) {
                    Function2 function2 = nyVar.e;
                    if (function2 != null) {
                        File file2 = this.a;
                        function2.b(file2, new y0(file2, null, "Cannot list files in a directory", 2, null));
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
        Function1 function12 = nyVar.d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
