package f2;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class g extends IOException {

    /* renamed from: b, reason: collision with root package name */
    private final File f36629b;

    /* renamed from: c, reason: collision with root package name */
    private final File f36630c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36631d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(File file, File file2, String str) {
        super(r0);
        String b4;
        Intrinsics.checkNotNullParameter(file, "file");
        b4 = AbstractC2421d.b(file, file2, str);
        this.f36629b = file;
        this.f36630c = file2;
        this.f36631d = str;
    }
}
