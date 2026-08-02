package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0229h;
import io.flutter.embedding.android.FlutterFragmentActivity;
import m1.InterfaceC1306d;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC1306d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4755b;

    public /* synthetic */ G(int i4, Object obj) {
        this.f4754a = i4;
        this.f4755b = obj;
    }

    @Override // m1.InterfaceC1306d
    public final Bundle a() {
        switch (this.f4754a) {
            case 0:
                FlutterFragmentActivity flutterFragmentActivity = (FlutterFragmentActivity) this.f4755b;
                flutterFragmentActivity.markFragmentsCreated();
                flutterFragmentActivity.mFragmentLifecycleRegistry.e(EnumC0229h.ON_STOP);
                return new Bundle();
            default:
                return ((f0) this.f4755b).U();
        }
    }
}
