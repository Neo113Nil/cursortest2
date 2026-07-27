package J;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import l.d0;
import w2.m;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f1334a = i2;
        this.f1335b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1334a) {
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
    public void onChange(boolean z, Uri uri) {
        switch (this.f1334a) {
            case 1:
                g gVar = (g) this.f1335b;
                if (!gVar.f10376t) {
                    if (Settings.Global.getFloat(gVar.f10362f, "transition_animation_scale", 1.0f) == 0.0f) {
                        gVar.f10367k |= 4;
                    } else {
                        gVar.f10367k &= -5;
                    }
                    ((FlutterJNI) gVar.f10358b.f312c).setAccessibilityFeatures(gVar.f10367k);
                    break;
                }
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 d0Var) {
        super(new Handler());
        this.f1334a = 0;
        this.f1335b = d0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.f1334a) {
            case 0:
                d0 d0Var = (d0) this.f1335b;
                if (d0Var.f1339b && (cursor = d0Var.f1340c) != null && !cursor.isClosed()) {
                    d0Var.f1338a = d0Var.f1340c.requery();
                    break;
                }
                break;
            case 1:
                onChange(z, null);
                break;
            default:
                super.onChange(z);
                m mVar = (m) this.f1335b;
                if (mVar.f12178i != null) {
                    mVar.d();
                    break;
                }
                break;
        }
    }
}
