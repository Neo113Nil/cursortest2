package Y1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Y1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113j {

    /* renamed from: a, reason: collision with root package name */
    public final A0.d f1861a;

    public C0113j(A0.d pigeonRegistrar, int i3) {
        switch (i3) {
            case 1:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            case 2:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            case 3:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            case 4:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            case 5:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            case 6:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            case 7:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
            default:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f1861a = pigeonRegistrar;
                break;
        }
    }

    public f0 a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f1861a.f19d).getSystemService("display");
        ArrayList R2 = C2.b.R(displayManager);
        f0 f0Var = new f0(this);
        ArrayList R3 = C2.b.R(displayManager);
        R3.removeAll(R2);
        if (!R3.isEmpty()) {
            Iterator it = R3.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new C0118o(R3, displayManager, 0), null);
            }
        }
        return f0Var;
    }
}
