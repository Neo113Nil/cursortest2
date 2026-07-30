package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r83 extends ContentObserver {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(oy2 oy2Var) {
        super(null);
        Objects.requireNonNull(oy2Var);
        this.b = oy2Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        switch (this.a) {
            case 1:
                ((AtomicBoolean) ((oy2) this.b).m).set(true);
                return;
            case 2:
                dl3 dl3Var = (dl3) this.b;
                synchronized (dl3Var.f) {
                    dl3Var.g = null;
                    dl3Var.c.run();
                }
                synchronized (dl3Var) {
                    try {
                        Iterator it = dl3Var.h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(dl3 dl3Var) {
        super(null);
        this.b = dl3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(lq lqVar, Handler handler) {
        super(handler);
        this.b = lqVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 0:
                ((lq) this.b).d(Unit.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
