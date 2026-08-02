package K;

import androidx.lifecycle.InterfaceC0160b;
import b2.C0195i;
import java.io.File;
import java.math.BigInteger;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f713e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(int i3, Object obj) {
        super(0);
        this.f713e = i3;
        this.f = obj;
    }

    @Override // l2.a
    public final Object invoke() {
        switch (this.f713e) {
            case 0:
                Object obj = T.f715d;
                File file = (File) this.f;
                synchronized (obj) {
                    T.f714c.remove(file.getAbsolutePath());
                }
                return C0195i.f2555a;
            case 1:
                File file2 = (File) ((M.b) this.f).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.j.d(name, "getName(...)");
                if (s2.n.Z(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                androidx.lifecycle.G g3 = (androidx.lifecycle.G) this.f;
                A0.f fVar = new A0.f(g3.d(), new androidx.lifecycle.D(), g3 instanceof InterfaceC0160b ? ((InterfaceC0160b) g3).c() : Q.a.f1276b);
                kotlin.jvm.internal.j.e("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
                androidx.lifecycle.F f = (androidx.lifecycle.F) fVar.f23b;
                f.getClass();
                LinkedHashMap linkedHashMap = f.f2375a;
                androidx.lifecycle.B viewModel = (androidx.lifecycle.B) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                boolean isInstance = androidx.lifecycle.B.class.isInstance(viewModel);
                androidx.lifecycle.E e3 = (androidx.lifecycle.E) fVar.f24c;
                if (isInstance) {
                    if (e3 instanceof androidx.lifecycle.C) {
                    }
                    kotlin.jvm.internal.j.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    Q.c cVar = new Q.c((Q.b) fVar.f25d);
                    ((LinkedHashMap) cVar.f1277a).put(androidx.lifecycle.D.f2374b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        viewModel = e3.a(androidx.lifecycle.B.class, cVar);
                        kotlin.jvm.internal.j.e(viewModel, "viewModel");
                        androidx.lifecycle.B b3 = (androidx.lifecycle.B) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", viewModel);
                        if (b3 != null) {
                            b3.getClass();
                        }
                    } catch (AbstractMethodError unused) {
                        e3.getClass();
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return viewModel;
            default:
                d0.h hVar = (d0.h) this.f;
                return BigInteger.valueOf(hVar.f4925a).shiftLeft(32).or(BigInteger.valueOf(hVar.f4926b)).shiftLeft(32).or(BigInteger.valueOf(hVar.f4927c));
        }
    }
}
