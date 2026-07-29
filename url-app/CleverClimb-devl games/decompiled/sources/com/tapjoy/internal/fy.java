package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.internal.ga;
import com.tapjoy.internal.hl;
import java.util.Observer;

/* loaded from: classes2.dex */
public final class fy extends hl {

    /* renamed from: b, reason: collision with root package name */
    private final ga f8138b = new ga() { // from class: com.tapjoy.internal.fy.1
        @Override // com.tapjoy.internal.ga
        protected final boolean a() {
            return true;
        }

        @Override // com.tapjoy.internal.ga
        protected final /* synthetic */ TJPlacement a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            hl.a aVar = (hl.a) obj;
            TJPlacement createPlacement = TJPlacementManager.createPlacement(TapjoyConnectCore.getContext(), aVar.f8293b, false, tJPlacementListener);
            createPlacement.pushId = aVar.f8292a;
            return createPlacement;
        }

        @Override // com.tapjoy.internal.ga
        protected final /* bridge */ /* synthetic */ String a(Object obj) {
            hl.a aVar = (hl.a) obj;
            if (aVar != null) {
                return aVar.f8293b;
            }
            return null;
        }

        @Override // com.tapjoy.internal.ga
        protected final /* synthetic */ ga.a b(Object obj) {
            hl.a aVar = (hl.a) obj;
            return new ga.a(aVar, aVar.f8295d);
        }

        @Override // com.tapjoy.internal.ga
        protected final boolean a(Observer observer) {
            if (TapjoyConnectCore.isViewOpen()) {
                TJPlacementManager.dismissContentShowing(true);
            }
            return super.a(observer);
        }
    };

    public static void a() {
    }

    static {
        hl.a(new fy());
    }

    private fy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.hl
    public final boolean b() {
        return this.f8138b.f8146b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.hl
    public final void a(hl.a aVar) {
        this.f8138b.c(aVar);
    }
}
