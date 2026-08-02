package E1;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import l.f0;

/* loaded from: classes.dex */
public final class q extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f378b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Handler handler, int i3) {
        super(handler);
        this.f377a = i3;
        this.f378b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f377a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.f377a) {
            case 2:
                io.flutter.view.i iVar = (io.flutter.view.i) this.f378b;
                if (!iVar.f9440u) {
                    if (Settings.Global.getFloat(iVar.f, "transition_animation_scale", 1.0f) == 0.0f) {
                        iVar.f9432l |= 4;
                    } else {
                        iVar.f9432l &= -5;
                    }
                    ((FlutterJNI) iVar.f9423b.f24c).setAccessibilityFeatures(iVar.f9432l);
                    break;
                }
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f0 f0Var) {
        super(new Handler());
        this.f377a = 1;
        this.f378b = f0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.f377a) {
            case 0:
                super.onChange(z);
                t tVar = (t) this.f378b;
                if (tVar.f392i != null) {
                    tVar.d();
                    break;
                }
                break;
            case 1:
                f0 f0Var = (f0) this.f378b;
                if (f0Var.f606b && (cursor = f0Var.f607c) != null && !cursor.isClosed()) {
                    f0Var.f605a = f0Var.f607c.requery();
                    break;
                }
                break;
            default:
                onChange(z, null);
                break;
        }
    }
}
