package Q;

import T5.I;
import T5.J;
import android.content.Context;
import androidx.lifecycle.L;
import androidx.lifecycle.Y;
import c0.C0275h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.File;
import java.math.BigInteger;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, Object obj) {
        super(0);
        this.f1957f = i7;
        this.f1958g = obj;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        V.f fVar;
        switch (this.f1957f) {
            case 0:
                return ((n) this.f1958g).k();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                R5.f fVar2 = (R5.f) this.f1958g;
                return Integer.valueOf(J.c(fVar2, fVar2.f2165i));
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return AbstractC0676f.d("kotlin.Unit", R5.i.f2175e, new R5.e[0], new I(1));
            case 3:
                V.g gVar = (V.g) this.f1958g;
                Context context = gVar.f2696f;
                String str = gVar.f2697g;
                if (str == null || !gVar.f2699i) {
                    fVar = new V.f(context, gVar.f2697g, new J1.c(29), gVar.f2698h, gVar.f2700j);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
                    fVar = new V.f(context, new File(noBackupFilesDir, str).getAbsolutePath(), new J1.c(29), gVar.f2698h, gVar.f2700j);
                }
                fVar.setWriteAheadLoggingEnabled(gVar.f2702l);
                return fVar;
            case 4:
                return L.f((Y) this.f1958g);
            default:
                C0275h c0275h = (C0275h) this.f1958g;
                return BigInteger.valueOf(c0275h.f3768f).shiftLeft(32).or(BigInteger.valueOf(c0275h.f3769g)).shiftLeft(32).or(BigInteger.valueOf(c0275h.f3770h));
        }
    }
}
