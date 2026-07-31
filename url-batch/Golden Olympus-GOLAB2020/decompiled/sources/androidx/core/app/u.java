package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.s;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.b9;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f11706a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11707b = new Object();

    static Bundle a(s.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d4 = aVar.d();
        bundle.putInt(b9.h.f15444H0, d4 != null ? d4.e() : 0);
        bundle.putCharSequence(b9.h.f15436D0, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(A a4) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(A[] aArr) {
        if (aArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[aArr.length];
        for (int i4 = 0; i4 < aArr.length; i4++) {
            A a4 = aArr[i4];
            bundleArr[i4] = b(null);
        }
        return bundleArr;
    }
}
