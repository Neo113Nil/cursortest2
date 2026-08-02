package T1;

import E1.AbstractActivityC0029e;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import java.util.ArrayList;
import x1.C1245f;
import x1.InterfaceC1247h;

/* loaded from: classes.dex */
public final class a implements InterfaceC1247h {

    /* renamed from: a, reason: collision with root package name */
    public int f1343a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1344b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1345c;

    public a(int i3, String str, ArrayList arrayList) {
        this.f1343a = i3;
        this.f1345c = str;
        this.f1344b = arrayList;
    }

    @Override // x1.InterfaceC1247h
    public void a() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f1343a);
        this.f1344b = handlerThread;
        handlerThread.start();
        this.f1345c = new Handler(((HandlerThread) this.f1344b).getLooper());
    }

    @Override // x1.InterfaceC1247h
    public void b() {
        HandlerThread handlerThread = (HandlerThread) this.f1344b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1344b = null;
            this.f1345c = null;
        }
    }

    @Override // x1.InterfaceC1247h
    public void d(C1245f c1245f) {
        ((Handler) this.f1345c).post(c1245f.f10737b);
    }

    public int e() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0029e abstractActivityC0029e = (AbstractActivityC0029e) this.f1344b;
        int i3 = this.f1343a;
        View findViewById = abstractActivityC0029e.findViewById(i3);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
    }

    public void f(int i3) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC0029e abstractActivityC0029e = (AbstractActivityC0029e) this.f1344b;
        int i4 = this.f1343a;
        View findViewById = abstractActivityC0029e.findViewById(i4);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i4 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i3) {
            return;
        }
        findViewById.setContentSensitivity(i3);
        findViewById.invalidate();
    }
}
