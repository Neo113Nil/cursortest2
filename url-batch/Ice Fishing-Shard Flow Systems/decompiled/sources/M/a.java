package M;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import h4.p;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import n.f1;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f1707a = i2;
        this.f1708b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1707a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        Cursor cursor;
        switch (this.f1707a) {
            case 0:
                f1 f1Var = (f1) this.f1708b;
                if (f1Var.f1712e && (cursor = f1Var.f1713i) != null && !cursor.isClosed()) {
                    f1Var.f1711d = f1Var.f1713i.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z7);
                p pVar = (p) this.f1708b;
                if (pVar.f5250q != null) {
                    pVar.d();
                    break;
                }
                break;
            default:
                onChange(z7, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f1 f1Var) {
        super(new Handler());
        this.f1707a = 0;
        this.f1708b = f1Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z7, Uri uri) {
        switch (this.f1707a) {
            case 2:
                g gVar = (g) this.f1708b;
                if (!gVar.f5898u) {
                    if (Settings.Global.getFloat(gVar.f5884f, "transition_animation_scale", 1.0f) == 0.0f) {
                        gVar.f5889l |= 4;
                    } else {
                        gVar.f5889l &= -5;
                    }
                    ((FlutterJNI) gVar.f5880b.f331i).setAccessibilityFeatures(gVar.f5889l);
                    break;
                }
                break;
            default:
                super.onChange(z7, uri);
                break;
        }
    }
}
