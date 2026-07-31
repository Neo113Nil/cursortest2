package D3;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.onesignal.inAppMessages.internal.display.impl.a;
import io.flutter.embedding.engine.FlutterJNI;
import k.j0;

/* loaded from: classes.dex */
public final class q extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Handler handler, int i7) {
        super(handler);
        this.f458a = i7;
        this.f459b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f458a) {
            case 0:
                return true;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        Cursor cursor;
        switch (this.f458a) {
            case 0:
                super.onChange(z5);
                t tVar = (t) this.f459b;
                if (tVar.f479n != null) {
                    tVar.d();
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                j0 j0Var = (j0) this.f459b;
                if (j0Var.f1231g && (cursor = j0Var.f1232h) != null && !cursor.isClosed()) {
                    j0Var.f1230f = j0Var.f1232h.requery();
                    break;
                }
                break;
            default:
                onChange(z5, null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j0 j0Var) {
        super(new Handler());
        this.f458a = 1;
        this.f459b = j0Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z5, Uri uri) {
        switch (this.f458a) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                io.flutter.view.i iVar = (io.flutter.view.i) this.f459b;
                if (!iVar.f4715t) {
                    if (Settings.Global.getFloat(iVar.f4701f, "transition_animation_scale", 1.0f) == 0.0f) {
                        iVar.f4706k |= 4;
                    } else {
                        iVar.f4706k &= -5;
                    }
                    ((FlutterJNI) iVar.f4697b.f73i).setAccessibilityFeatures(iVar.f4706k);
                    break;
                }
                break;
            default:
                super.onChange(z5, uri);
                break;
        }
    }
}
