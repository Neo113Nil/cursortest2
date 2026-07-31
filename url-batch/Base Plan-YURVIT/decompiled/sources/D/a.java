package D;

import H.k;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import i.f0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.i;
import k0.o;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f186a = i2;
        this.f187b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f186a) {
            case 0:
                return true;
            case 1:
            default:
                return super.deliverSelfNotifications();
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return true;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f186a) {
            case 0:
                f0 f0Var = (f0) this.f187b;
                if (f0Var.f191f && (cursor = f0Var.f192g) != null && !cursor.isClosed()) {
                    f0Var.f190e = f0Var.f192g.requery();
                    break;
                }
                break;
            case 1:
                onChange(z2, null);
                break;
            default:
                super.onChange(z2);
                o oVar = (o) this.f187b;
                if (oVar.f2728n != null) {
                    oVar.d();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var) {
        super(new Handler());
        this.f186a = 0;
        this.f187b = f0Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f186a) {
            case 1:
                i iVar = (i) this.f187b;
                if (!iVar.t) {
                    if (Settings.Global.getFloat(iVar.f2601f, "transition_animation_scale", 1.0f) == 0.0f) {
                        iVar.f2606k |= 4;
                    } else {
                        iVar.f2606k &= -5;
                    }
                    ((FlutterJNI) iVar.f2597b.f85g).setAccessibilityFeatures(iVar.f2606k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }
}
