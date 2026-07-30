package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h1 extends kv0 implements ae0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ r1 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(r1 r1Var, int i) {
        super(0);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = r1Var;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int actionMasked;
        int i = this.OPXfSBeufaJ8;
        r1 r1Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) r1Var.ZbWwgt3aGe7A.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = r1Var.getConfiguration().getLocales();
                q21 q21Var = new q21(new r21(locales));
                if (locales.isEmpty()) {
                    q21Var = new q21(new r21(LocaleList.getDefault()));
                }
                r21 r21Var = q21Var.PxuCJdSBwIXG;
                int size = r21Var.PxuCJdSBwIXG.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = r21Var.PxuCJdSBwIXG.get(i2);
                    locale.getClass();
                    arrayList.add(new n21(locale));
                }
                return new p21(arrayList);
            case 2:
                MotionEvent motionEvent = r1Var.OYiFbU3x63rc;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    r1Var.IxJ9cAW40yOk = SystemClock.uptimeMillis();
                    r1Var.post(r1Var.MBpAROcyNHKN);
                }
                return no2.PxuCJdSBwIXG;
            default:
                r1Var.get_viewTreeOwners();
                return null;
        }
    }
}
