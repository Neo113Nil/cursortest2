package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.TapjoyLog;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
abstract class ga {

    /* renamed from: b, reason: collision with root package name */
    volatile a f8146b;

    protected abstract TJPlacement a(Context context, TJPlacementListener tJPlacementListener, Object obj);

    protected abstract String a(Object obj);

    ga() {
    }

    public final boolean c(Object obj) {
        if (!a()) {
            return false;
        }
        a aVar = null;
        synchronized (this) {
            if (this.f8146b == null) {
                aVar = b(obj);
                this.f8146b = aVar;
            }
        }
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    protected a b(Object obj) {
        return new a(this, obj);
    }

    protected boolean a() {
        return !TapjoyConnectCore.isFullScreenViewOpen();
    }

    protected boolean a(Observer observer) {
        if (TapjoyConnectCore.isFullScreenViewOpen()) {
            ft.e.addObserver(observer);
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                return false;
            }
            ft.e.deleteObserver(observer);
        }
        if (ha.a().d()) {
            return true;
        }
        ft.f8130c.addObserver(observer);
        if (!ha.a().d()) {
            return false;
        }
        ft.f8130c.deleteObserver(observer);
        return true;
    }

    class a implements TJPlacementListener, Observer {

        /* renamed from: b, reason: collision with root package name */
        private final Object f8148b;

        /* renamed from: c, reason: collision with root package name */
        private final fj f8149c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f8150d;
        private TJPlacement e;

        @Override // com.tapjoy.TJPlacementListener
        public final void onClick(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onContentDismiss(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onContentShow(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onRequestSuccess(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        a(ga gaVar, Object obj) {
            this(obj, new fj(TapjoyConstants.TIMER_INCREMENT));
        }

        a(Object obj, fj fjVar) {
            this.f8148b = obj;
            this.f8149c = fjVar;
        }

        final void a() {
            synchronized (this) {
                if (this.f8150d) {
                    return;
                }
                if (this.f8149c.a()) {
                    a("Timed out");
                    return;
                }
                if (!TapjoyConnectCore.isConnected()) {
                    ft.f8128a.addObserver(this);
                    if (!TapjoyConnectCore.isConnected()) {
                        return;
                    } else {
                        ft.f8128a.deleteObserver(this);
                    }
                }
                if (this.e == null) {
                    if (!ga.this.a()) {
                        a("Cannot request");
                        return;
                    } else {
                        this.e = ga.this.a(TapjoyConnectCore.getContext(), this, this.f8148b);
                        this.e.requestContent();
                        return;
                    }
                }
                if (this.e.isContentReady()) {
                    if (ga.this.a((Observer) this)) {
                        this.e.showContent();
                        a(null);
                    }
                }
            }
        }

        private void a(String str) {
            synchronized (this) {
                String a2 = ga.this.a(this.f8148b);
                if (str == null) {
                    TapjoyLog.i("SystemPlacement", "Placement " + a2 + " is presented now");
                } else {
                    TapjoyLog.i("SystemPlacement", "Cannot show placement " + a2 + " now (" + str + ")");
                }
                this.f8150d = true;
                this.e = null;
                ft.f8128a.deleteObserver(this);
                ft.e.deleteObserver(this);
                ft.f8130c.deleteObserver(this);
            }
            ga gaVar = ga.this;
            synchronized (gaVar) {
                if (gaVar.f8146b == this) {
                    gaVar.f8146b = null;
                }
            }
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            a();
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            a(tJError.message);
        }

        @Override // com.tapjoy.TJPlacementListener
        public final void onContentReady(TJPlacement tJPlacement) {
            a();
        }
    }
}
