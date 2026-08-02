package I;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class U extends Q0.i implements P0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i2, Object obj) {
        super(0);
        this.f589f = i2;
        this.f590g = obj;
    }

    @Override // P0.a
    public final Object g() {
        switch (this.f589f) {
            case 0:
                Object obj = V.f592d;
                File file = (File) this.f590g;
                synchronized (obj) {
                    V.f591c.remove(file.getAbsolutePath());
                }
                return F0.h.f469a;
            case 1:
                File file2 = (File) ((K.b) this.f590g).g();
                String name = file2.getName();
                Q0.h.d(name, "getName(...)");
                if (X0.j.V(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    Q0.h.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                W.a aVar = (W.a) this.f590g;
                Class<?> loadClass = aVar.f1113a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Q0.h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = aVar.f1113a.loadClass("androidx.window.extensions.WindowExtensions");
                Q0.h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Q0.h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                X.i iVar = (X.i) this.f590g;
                return BigInteger.valueOf(iVar.f1138e).shiftLeft(32).or(BigInteger.valueOf(iVar.f1139f)).shiftLeft(32).or(BigInteger.valueOf(iVar.f1140g));
        }
    }
}
