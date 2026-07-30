package s;

import d1.i;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import t.h;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a extends i implements c1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, Object obj) {
        super(0);
        this.f1145c = i2;
        this.f1146d = obj;
    }

    @Override // c1.a
    public final Object a() {
        switch (this.f1145c) {
            case 0:
                b bVar = (b) this.f1146d;
                Class<?> loadClass = bVar.f1147a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = bVar.f1147a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                h hVar = (h) this.f1146d;
                return BigInteger.valueOf(hVar.f1166b).shiftLeft(32).or(BigInteger.valueOf(hVar.f1167c)).shiftLeft(32).or(BigInteger.valueOf(hVar.f1168d));
        }
    }
}
