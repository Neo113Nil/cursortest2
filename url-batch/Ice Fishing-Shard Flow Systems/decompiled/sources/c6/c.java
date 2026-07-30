package c6;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4257b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f4258c;

    /* renamed from: d, reason: collision with root package name */
    public int f4259d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f4261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f4261f = fVar;
    }

    @Override // c6.g
    public final File a() {
        h hVar = this.f4261f.f4268l;
        boolean z7 = this.f4260e;
        File file = this.f4269a;
        if (!z7 && this.f4258c == null) {
            Function1 function1 = hVar.f4272c;
            if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                File[] listFiles = file.listFiles();
                this.f4258c = listFiles;
                if (listFiles == null) {
                    Function2 function2 = hVar.f4274e;
                    if (function2 != null) {
                        function2.invoke(file, new C0310a(this.f4269a, null, "Cannot list files in a directory", 2, null));
                    }
                    this.f4260e = true;
                }
            }
            return null;
        }
        File[] fileArr = this.f4258c;
        if (fileArr != null && this.f4259d < fileArr.length) {
            Intrinsics.b(fileArr);
            int i2 = this.f4259d;
            this.f4259d = i2 + 1;
            return fileArr[i2];
        }
        if (!this.f4257b) {
            this.f4257b = true;
            return file;
        }
        Function1 function12 = hVar.f4273d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
