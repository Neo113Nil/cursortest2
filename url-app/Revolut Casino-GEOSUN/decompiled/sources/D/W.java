package D;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import u0.C0247g;

/* loaded from: classes.dex */
public final class W extends F0.j implements E0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f147g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i2, Object obj) {
        super(0);
        this.f146f = i2;
        this.f147g = obj;
    }

    @Override // E0.a
    public final Object d() {
        switch (this.f146f) {
            case 0:
                Object obj = X.f149d;
                File file = (File) this.f147g;
                synchronized (obj) {
                    X.f148c.remove(file.getAbsolutePath());
                }
                return C0247g.f3005a;
            case 1:
                File file2 = (File) ((F.b) this.f147g).d();
                String name = file2.getName();
                F0.i.d(name, "getName(...)");
                if (L0.h.S(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    F0.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Q.a aVar = (Q.a) this.f147g;
                Class<?> loadClass = aVar.f830a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                F0.i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = aVar.f830a.loadClass("androidx.window.extensions.WindowExtensions");
                F0.i.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                F0.i.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                R.i iVar = (R.i) this.f147g;
                return BigInteger.valueOf(iVar.f886e).shiftLeft(32).or(BigInteger.valueOf(iVar.f887f)).shiftLeft(32).or(BigInteger.valueOf(iVar.f888g));
        }
    }
}
