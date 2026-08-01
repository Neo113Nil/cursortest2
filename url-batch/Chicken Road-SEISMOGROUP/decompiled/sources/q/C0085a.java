package q;

import e0.h;
import e0.i;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085a extends i implements d0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085a(int i2, Object obj) {
        super(0);
        this.f1187c = i2;
        this.f1188d = obj;
    }

    @Override // d0.a
    public final Object a() {
        switch (this.f1187c) {
            case 0:
                b bVar = (b) this.f1188d;
                Class<?> loadClass = bVar.f1189a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                h.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = bVar.f1189a.loadClass("androidx.window.extensions.WindowExtensions");
                h.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                r.i iVar = (r.i) this.f1188d;
                return BigInteger.valueOf(iVar.f1250b).shiftLeft(32).or(BigInteger.valueOf(iVar.f1251c)).shiftLeft(32).or(BigInteger.valueOf(iVar.f1252d));
        }
    }
}
