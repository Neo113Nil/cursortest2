package J2;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3399b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f3400c;

    /* renamed from: d, reason: collision with root package name */
    public int f3401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f3402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f3402e = gVar;
    }

    @Override // J2.h
    public final File a() {
        Function2 function2;
        boolean z4 = this.f3399b;
        g gVar = this.f3402e;
        File file = this.f3405a;
        if (!z4) {
            Function1 function1 = gVar.f3404j.f3408c;
            if (function1 != null && !((Boolean) function1.invoke(file)).booleanValue()) {
                return null;
            }
            this.f3399b = true;
            return file;
        }
        File[] fileArr = this.f3400c;
        if (fileArr != null && this.f3401d >= fileArr.length) {
            Function1 function12 = gVar.f3404j.f3409d;
            if (function12 != null) {
                function12.invoke(file);
            }
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f3400c = listFiles;
            if (listFiles == null && (function2 = gVar.f3404j.f3410e) != null) {
                function2.h(file, new a(this.f3405a, null, "Cannot list files in a directory", 2, null));
            }
            File[] fileArr2 = this.f3400c;
            if (fileArr2 == null || fileArr2.length == 0) {
                Function1 function13 = gVar.f3404j.f3409d;
                if (function13 != null) {
                    function13.invoke(file);
                }
                return null;
            }
        }
        File[] fileArr3 = this.f3400c;
        Intrinsics.c(fileArr3);
        int i2 = this.f3401d;
        this.f3401d = i2 + 1;
        return fileArr3[i2];
    }
}
