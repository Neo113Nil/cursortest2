package com.startapp.sdk.internal;

import android.widget.ImageButton;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* loaded from: classes.dex */
public class tc extends v1 {
    final /* synthetic */ uc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, u1 u1Var) {
        super(u1Var);
        this.this$0 = ucVar;
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void close() {
        uc ucVar = this.this$0;
        MraidState mraidState = MraidState.HIDDEN;
        ucVar.f4557b = mraidState;
        si.a(ucVar.f4556a.f4685t, true, "mraid.fireStateChangeEvent", mraidState.toString());
        la laVar = this.this$0.f4556a.f4682H;
        laVar.f4086a.i();
        laVar.f4086a.b();
    }

    public void fireViewableChangeEvent() {
        xf xfVar;
        uc ucVar = this.this$0;
        si.a(ucVar.f4556a.f4685t, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(ucVar.f4564j));
        uc ucVar2 = this.this$0;
        if (!ucVar2.f4564j || (xfVar = ucVar2.f4556a.f4688x) == null) {
            return;
        }
        xfVar.b();
    }

    @Override // com.startapp.sdk.internal.v1
    public boolean isFeatureSupported(String str) {
        uc ucVar = this.this$0;
        if (ucVar.f4559d == null) {
            ucVar.f4559d = new wc(ucVar.f4556a.f4518a);
        }
        return ucVar.f4559d.f4697b.contains(str);
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void setOrientationProperties(Map<String, String> map) {
        boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        uc ucVar = this.this$0;
        if (ucVar.f4560e == null) {
            ucVar.f4560e = new xc();
        }
        xc xcVar = ucVar.f4560e;
        if (xcVar.f4720a == parseBoolean) {
            int i3 = xcVar.f4721b;
            int indexOf = xc.f4719c.indexOf(str);
            if (indexOf == -1) {
                indexOf = 2;
            }
            if (i3 == indexOf) {
                return;
            }
        }
        xcVar.f4720a = parseBoolean;
        int indexOf2 = xc.f4719c.indexOf(str);
        xcVar.f4721b = indexOf2 != -1 ? indexOf2 : 2;
        applyOrientationProperties(this.this$0.f4556a.f4518a, xcVar);
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void useCustomClose(String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        uc ucVar = this.this$0;
        if (ucVar.f4563i != parseBoolean) {
            ucVar.f4563i = parseBoolean;
            if (!parseBoolean) {
                ucVar.f4556a.t();
                return;
            }
            wa waVar = ucVar.f4556a;
            waVar.getClass();
            try {
                ImageButton imageButton = waVar.v;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
    }
}
