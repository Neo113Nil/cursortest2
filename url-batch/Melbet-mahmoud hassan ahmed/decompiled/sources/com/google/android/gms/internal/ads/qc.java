package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class qc extends qd {
    public qc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", j8Var, i7, 49);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        this.f10653e.M(3);
        try {
            int i7 = 1;
            boolean booleanValue = ((Boolean) this.f10654f.invoke(null, this.f10650b.b())).booleanValue();
            j8 j8Var = this.f10653e;
            if (true == booleanValue) {
                i7 = 2;
            }
            j8Var.M(i7);
        } catch (InvocationTargetException e7) {
            if (!(e7.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e7;
            }
        }
    }
}
