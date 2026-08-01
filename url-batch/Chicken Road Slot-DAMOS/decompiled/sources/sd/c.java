package sd;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9171b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f9172c;

    /* renamed from: d, reason: collision with root package name */
    public int f9173d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f9175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File file) {
        super(file);
        file.getClass();
        this.f9175f = fVar;
    }

    @Override // sd.g
    public final File a() {
        h hVar = this.f9175f.f9182r;
        boolean z10 = this.f9174e;
        File file = this.f9183a;
        if (!z10 && this.f9172c == null) {
            Function1 function1 = hVar.f9186c;
            if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                File[] listFiles = file.listFiles();
                this.f9172c = listFiles;
                if (listFiles == null) {
                    Function2 function2 = hVar.f9188e;
                    if (function2 != null) {
                        File file2 = this.f9183a;
                        function2.invoke(file2, new a(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    this.f9174e = true;
                }
            }
            return null;
        }
        File[] fileArr = this.f9172c;
        if (fileArr != null && this.f9173d < fileArr.length) {
            fileArr.getClass();
            int i3 = this.f9173d;
            this.f9173d = i3 + 1;
            return fileArr[i3];
        }
        if (!this.f9171b) {
            this.f9171b = true;
            return file;
        }
        Function1 function12 = hVar.f9187d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
