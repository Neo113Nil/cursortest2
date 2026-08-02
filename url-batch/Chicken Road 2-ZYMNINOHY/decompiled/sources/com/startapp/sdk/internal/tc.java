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
        ucVar.f7698b = mraidState;
        si.a(ucVar.f7697a.f7830t, true, "mraid.fireStateChangeEvent", mraidState.toString());
        la laVar = this.this$0.f7697a.f7827H;
        laVar.f7214a.i();
        laVar.f7214a.b();
    }

    public void fireViewableChangeEvent() {
        xf xfVar;
        uc ucVar = this.this$0;
        si.a(ucVar.f7697a.f7830t, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(ucVar.f7706j));
        uc ucVar2 = this.this$0;
        if (!ucVar2.f7706j || (xfVar = ucVar2.f7697a.f7833x) == null) {
            return;
        }
        xfVar.b();
    }

    @Override // com.startapp.sdk.internal.v1
    public boolean isFeatureSupported(String str) {
        uc ucVar = this.this$0;
        if (ucVar.f7700d == null) {
            ucVar.f7700d = new wc(ucVar.f7697a.f7658a);
        }
        return ucVar.f7700d.f7843b.contains(str);
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void setOrientationProperties(Map<String, String> map) {
        boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        uc ucVar = this.this$0;
        if (ucVar.f7701e == null) {
            ucVar.f7701e = new xc();
        }
        xc xcVar = ucVar.f7701e;
        if (xcVar.f7866a == parseBoolean) {
            int i4 = xcVar.f7867b;
            int indexOf = xc.f7865c.indexOf(str);
            if (indexOf == -1) {
                indexOf = 2;
            }
            if (i4 == indexOf) {
                return;
            }
        }
        xcVar.f7866a = parseBoolean;
        int indexOf2 = xc.f7865c.indexOf(str);
        xcVar.f7867b = indexOf2 != -1 ? indexOf2 : 2;
        applyOrientationProperties(this.this$0.f7697a.f7658a, xcVar);
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void useCustomClose(String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        uc ucVar = this.this$0;
        if (ucVar.f7705i != parseBoolean) {
            ucVar.f7705i = parseBoolean;
            if (!parseBoolean) {
                ucVar.f7697a.t();
                return;
            }
            wa waVar = ucVar.f7697a;
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
