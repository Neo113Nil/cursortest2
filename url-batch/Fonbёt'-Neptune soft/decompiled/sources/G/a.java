package G;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.k;
import j.h0;
import m0.q;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f470a = i2;
        this.f471b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f470a) {
            case 0:
                return true;
            case 1:
            default:
                return super.deliverSelfNotifications();
            case 2:
                return true;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f470a) {
            case 1:
                k kVar = (k) this.f471b;
                if (!kVar.f2809u) {
                    if (Settings.Global.getFloat(kVar.f2794f, "transition_animation_scale", 1.0f) == 0.0f) {
                        kVar.f2800l |= 4;
                    } else {
                        kVar.f2800l &= -5;
                    }
                    ((FlutterJNI) kVar.f2790b.f155g).setAccessibilityFeatures(kVar.f2800l);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h0 h0Var) {
        super(new Handler());
        this.f470a = 0;
        this.f471b = h0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f470a) {
            case 0:
                h0 h0Var = (h0) this.f471b;
                if (h0Var.f475f && (cursor = h0Var.f476g) != null && !cursor.isClosed()) {
                    h0Var.f474e = h0Var.f476g.requery();
                    break;
                }
                break;
            case 1:
                onChange(z2, null);
                break;
            default:
                super.onChange(z2);
                q qVar = (q) this.f471b;
                if (qVar.f3190l != null) {
                    qVar.d();
                    break;
                }
                break;
        }
    }
}
