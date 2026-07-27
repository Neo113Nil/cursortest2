package J2;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3393b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f3394c;

    /* renamed from: d, reason: collision with root package name */
    public int f3395d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f3397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f3397f = gVar;
    }

    @Override // J2.h
    public final File a() {
        boolean z4 = this.f3396e;
        g gVar = this.f3397f;
        File file = this.f3405a;
        if (!z4 && this.f3394c == null) {
            Function1 function1 = gVar.f3404j.f3408c;
            if (function1 != null && !((Boolean) function1.invoke(file)).booleanValue()) {
                return null;
            }
            File[] listFiles = file.listFiles();
            this.f3394c = listFiles;
            if (listFiles == null) {
                Function2 function2 = gVar.f3404j.f3410e;
                if (function2 != null) {
                    function2.h(file, new a(this.f3405a, null, "Cannot list files in a directory", 2, null));
                }
                this.f3396e = true;
            }
        }
        File[] fileArr = this.f3394c;
        if (fileArr != null && this.f3395d < fileArr.length) {
            Intrinsics.c(fileArr);
            int i2 = this.f3395d;
            this.f3395d = i2 + 1;
            return fileArr[i2];
        }
        if (!this.f3393b) {
            this.f3393b = true;
            return file;
        }
        Function1 function12 = gVar.f3404j.f3409d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
