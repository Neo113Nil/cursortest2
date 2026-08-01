package E;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class t extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Handler handler, int i2) {
        super(handler);
        this.f185a = i2;
        this.f186b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f185a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.f185a) {
            case 1:
                io.flutter.view.g gVar = (io.flutter.view.g) this.f186b;
                if (!gVar.t) {
                    if (Settings.Global.getFloat(gVar.f835f, "transition_animation_scale", 1.0f) == 0.0f) {
                        gVar.f840k |= 4;
                    } else {
                        gVar.f840k &= -5;
                    }
                    ((FlutterJNI) gVar.f831b.f100b).setAccessibilityFeatures(gVar.f840k);
                    break;
                }
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.f185a) {
            case 0:
                super.onChange(z);
                v vVar = (v) this.f186b;
                if (vVar.f197h != null) {
                    vVar.d();
                    break;
                }
                break;
            default:
                onChange(z, null);
                break;
        }
    }
}
