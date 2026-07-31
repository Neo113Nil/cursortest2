package com.startapp.sdk.internal;

import android.widget.ImageButton;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class bc extends r1 {
    final /* synthetic */ cc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(cc ccVar, q1 q1Var) {
        super(q1Var);
        this.this$0 = ccVar;
    }

    @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
    public void close() {
        cc ccVar = this.this$0;
        MraidState mraidState = MraidState.HIDDEN;
        ccVar.b = mraidState;
        zh.a(ccVar.f200a.t, true, "mraid.fireStateChangeEvent", mraidState.toString());
        s9 s9Var = this.this$0.f200a.H;
        s9Var.f419a.i();
        s9Var.f419a.b();
    }

    public void fireViewableChangeEvent() {
        ff ffVar;
        cc ccVar = this.this$0;
        zh.a(ccVar.f200a.t, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(ccVar.j));
        cc ccVar2 = this.this$0;
        if (!ccVar2.j || (ffVar = ccVar2.f200a.x) == null) {
            return;
        }
        ffVar.b();
    }

    @Override // com.startapp.sdk.internal.r1
    public boolean isFeatureSupported(String str) {
        cc ccVar = this.this$0;
        if (ccVar.d == null) {
            ccVar.d = new ec(ccVar.f200a.f248a);
        }
        return ccVar.d.b.contains(str);
    }

    @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
    public void setOrientationProperties(Map<String, String> map) {
        boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        cc ccVar = this.this$0;
        if (ccVar.e == null) {
            ccVar.e = new fc();
        }
        fc fcVar = ccVar.e;
        if (fcVar.f237a == parseBoolean) {
            int i = fcVar.b;
            int indexOf = fc.c.indexOf(str);
            if (indexOf == -1) {
                indexOf = 2;
            }
            if (i == indexOf) {
                return;
            }
        }
        fcVar.f237a = parseBoolean;
        int indexOf2 = fc.c.indexOf(str);
        fcVar.b = indexOf2 != -1 ? indexOf2 : 2;
        applyOrientationProperties(this.this$0.f200a.f248a, fcVar);
    }

    @Override // com.startapp.sdk.internal.r1, com.startapp.sdk.internal.wb
    public void useCustomClose(String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        cc ccVar = this.this$0;
        if (ccVar.i != parseBoolean) {
            ccVar.i = parseBoolean;
            da daVar = ccVar.f200a;
            if (!parseBoolean) {
                daVar.t();
                return;
            }
            try {
                ImageButton imageButton = daVar.v;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
            } catch (Throwable th) {
                n8.a(th);
            }
        }
    }
}
