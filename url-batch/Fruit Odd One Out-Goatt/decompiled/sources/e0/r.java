package e0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class r extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Handler handler, int i2) {
        super(handler);
        this.f205a = i2;
        this.f206b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f205a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f205a) {
            case 1:
                io.flutter.view.i iVar = (io.flutter.view.i) this.f206b;
                if (!iVar.f619t) {
                    float f2 = Settings.Global.getFloat(iVar.f606f, "transition_animation_scale", 1.0f);
                    int i2 = iVar.f611k;
                    if (f2 == 0.0f) {
                        iVar.f611k = i2 | 4;
                    } else {
                        iVar.f611k = i2 & (-5);
                    }
                    h0 h0Var = iVar.f602b;
                    ((FlutterJNI) h0Var.f152b).setAccessibilityFeatures(iVar.f611k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        switch (this.f205a) {
            case 0:
                super.onChange(z2);
                u uVar = (u) this.f206b;
                if (uVar.f219i != null) {
                    uVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
