package c6;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4263b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f4264c;

    /* renamed from: d, reason: collision with root package name */
    public int f4265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f4266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f4266e = fVar;
    }

    @Override // c6.g
    public final File a() {
        Function2 function2;
        h hVar = this.f4266e.f4268l;
        boolean z7 = this.f4263b;
        File file = this.f4269a;
        if (z7) {
            File[] fileArr = this.f4264c;
            if (fileArr == null || this.f4265d < fileArr.length) {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.f4264c = listFiles;
                    if (listFiles == null && (function2 = hVar.f4274e) != null) {
                        function2.invoke(file, new C0310a(this.f4269a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f4264c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = hVar.f4273d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.f4264c;
                Intrinsics.b(fileArr3);
                int i2 = this.f4265d;
                this.f4265d = i2 + 1;
                return fileArr3[i2];
            }
            Function1 function12 = hVar.f4273d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = hVar.f4272c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.f4263b = true;
                return file;
            }
        }
        return null;
    }
}
