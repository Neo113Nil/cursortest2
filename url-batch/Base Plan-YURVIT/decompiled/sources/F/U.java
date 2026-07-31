package F;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class U extends P0.i implements O0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i2, Object obj) {
        super(0);
        this.f308f = i2;
        this.f309g = obj;
    }

    @Override // O0.a
    public final Object h() {
        switch (this.f308f) {
            case 0:
                Object obj = V.f311d;
                File file = (File) this.f309g;
                synchronized (obj) {
                    V.f310c.remove(file.getAbsolutePath());
                }
                return D0.h.f206a;
            case 1:
                File file2 = (File) ((H.b) this.f309g).h();
                String name = file2.getName();
                P0.h.d(name, "getName(...)");
                String str = "";
                int lastIndexOf = name.lastIndexOf(46, V0.i.O(name));
                if (lastIndexOf != -1) {
                    str = name.substring(lastIndexOf + 1, name.length());
                    P0.h.d(str, "substring(...)");
                }
                if (str.equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    P0.h.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                S.a aVar = (S.a) this.f309g;
                Class<?> loadClass = aVar.f822a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                P0.h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = aVar.f822a.loadClass("androidx.window.extensions.WindowExtensions");
                P0.h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                P0.h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                T.h hVar = (T.h) this.f309g;
                return BigInteger.valueOf(hVar.f848e).shiftLeft(32).or(BigInteger.valueOf(hVar.f849f)).shiftLeft(32).or(BigInteger.valueOf(hVar.f850g));
        }
    }
}
