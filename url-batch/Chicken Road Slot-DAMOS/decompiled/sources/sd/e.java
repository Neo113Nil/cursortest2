package sd;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9177b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f9178c;

    /* renamed from: d, reason: collision with root package name */
    public int f9179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f9180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File file) {
        super(file);
        file.getClass();
        this.f9180e = fVar;
    }

    @Override // sd.g
    public final File a() {
        Function2 function2;
        h hVar = this.f9180e.f9182r;
        boolean z10 = this.f9177b;
        File file = this.f9183a;
        if (z10) {
            File[] fileArr = this.f9178c;
            if (fileArr == null || this.f9179d < fileArr.length) {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.f9178c = listFiles;
                    if (listFiles == null && (function2 = hVar.f9188e) != null) {
                        File file2 = this.f9183a;
                        function2.invoke(file2, new a(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f9178c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = hVar.f9187d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.f9178c;
                fileArr3.getClass();
                int i3 = this.f9179d;
                this.f9179d = i3 + 1;
                return fileArr3[i3];
            }
            Function1 function12 = hVar.f9187d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = hVar.f9186c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.f9177b = true;
                return file;
            }
        }
        return null;
    }
}
