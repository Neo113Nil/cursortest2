package h;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC4547f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38086a = 0;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f38087b;

    public /* synthetic */ HandlerC4547f() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f38086a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f38087b.get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                pl.droidsonroids.gif.c cVar = (pl.droidsonroids.gif.c) this.f38087b.get();
                if (cVar == null) {
                    return;
                }
                if (message.what == -1) {
                    cVar.invalidateSelf();
                    return;
                }
                Iterator it = cVar.f39859A.iterator();
                if (it.hasNext()) {
                    throw D.y.h(it);
                }
                return;
        }
    }

    public HandlerC4547f(pl.droidsonroids.gif.c cVar) {
        super(Looper.getMainLooper());
        this.f38087b = new WeakReference(cVar);
    }
}
