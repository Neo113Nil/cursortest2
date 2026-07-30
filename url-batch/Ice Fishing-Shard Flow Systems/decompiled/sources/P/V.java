package P;

import android.content.Context;
import h0.AbstractC0467m;
import java.io.File;
import java.math.BigInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i2, Object obj) {
        super(0);
        this.f2037d = i2;
        this.f2038e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m0.g sQLiteOpenHelper;
        switch (this.f2037d) {
            case 0:
                Object obj = W.f2040c;
                File file = (File) this.f2038e;
                synchronized (obj) {
                    W.f2039b.remove(file.getAbsolutePath());
                }
                return Unit.f6114a;
            case 1:
                File file2 = (File) ((A0.j) this.f2038e).invoke();
                Intrinsics.checkNotNullParameter(file2, "<this>");
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String str = "";
                Intrinsics.checkNotNullParameter(name, "<this>");
                Intrinsics.checkNotNullParameter("", "missingDelimiterValue");
                int B7 = StringsKt.B(name, '.', 0, 6);
                if (B7 != -1) {
                    str = name.substring(B7 + 1, name.length());
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
                if (Intrinsics.a(str, "preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return androidx.lifecycle.O.f((androidx.lifecycle.c0) this.f2038e);
            case 3:
                return ((AbstractC0467m) this.f2038e).b();
            case 4:
                m0.h hVar = (m0.h) this.f2038e;
                String str2 = hVar.f6511e;
                if (str2 == null || !hVar.f6513l) {
                    sQLiteOpenHelper = new m0.g(hVar.f6510d, hVar.f6511e, new l4.b(2), hVar.f6512i, hVar.f6514m);
                } else {
                    Context context = hVar.f6510d;
                    Intrinsics.checkNotNullParameter(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                    sQLiteOpenHelper = new m0.g(hVar.f6510d, new File(noBackupFilesDir, str2).getAbsolutePath(), new l4.b(2), hVar.f6512i, hVar.f6514m);
                }
                boolean z7 = hVar.f6516o;
                Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
                sQLiteOpenHelper.setWriteAheadLoggingEnabled(z7);
                return sQLiteOpenHelper;
            case 5:
                x0.i iVar = (x0.i) this.f2038e;
                return BigInteger.valueOf(iVar.f8312d).shiftLeft(32).or(BigInteger.valueOf(iVar.f8313e)).shiftLeft(32).or(BigInteger.valueOf(iVar.f8314i));
            case 6:
                x6.f fVar = (x6.f) this.f2038e;
                return Integer.valueOf(z6.J.c(fVar, fVar.j));
            default:
                return P0.f.e("kotlin.Unit", x6.i.f8445e, new x6.e[0], new G0.l(4, (z6.I) this.f2038e));
        }
    }
}
