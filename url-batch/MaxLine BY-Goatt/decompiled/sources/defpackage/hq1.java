package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hq1 extends iq1 {
    @Override // defpackage.iq1
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        obj.getClass();
        return (Float) obj;
    }

    @Override // defpackage.iq1
    public final String b() {
        return "float";
    }

    @Override // defpackage.iq1
    public final Object d(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.iq1
    public final void e(Bundle bundle, String str, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        str.getClass();
        bundle.putFloat(str, floatValue);
    }
}
